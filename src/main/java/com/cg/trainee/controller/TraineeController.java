package com.cg.trainee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cg.trainee.model.Trainee;
import com.cg.trainee.service.TraineeServiceImpl;

@RestController
@RequestMapping("trainees")
public class TraineeController {

	@Autowired
	private TraineeServiceImpl traineeService;

	@GetMapping("/")
	public ModelAndView findAll() {
		List<Trainee> traineesList = traineeService.findAll();
		ModelAndView modelAndView = new ModelAndView("listtrainee");
		modelAndView.addObject("TRAINEESLIST", traineesList);
		return modelAndView;
	}
	
	@ResponseStatus(value = HttpStatus.NOT_FOUND, reason = "Trainee with this id not present")
	@ExceptionHandler({ Exception.class })
	public void handleException() {
	 
	}

	@PostMapping("login")
	public ModelAndView login(@RequestParam String username, @RequestParam String password) {

		ModelAndView modelAndView = new ModelAndView();
		if (username.equals("admin") && password.equals("admin")) {
			modelAndView = new ModelAndView("login");
		}
		return modelAndView;
	}

	@PostMapping("save")
	public ModelAndView save(@RequestParam Integer id, @RequestParam String name, @RequestParam String location,
			@RequestParam String domain) {
		Trainee trainee = new Trainee();
		trainee.setId(id);
		trainee.setName(name);
		trainee.setLocation(location);
		trainee.setDomain(domain);
		traineeService.save(trainee);
		List<Trainee> traineesList = traineeService.findAll();

		ModelAndView modelAndView = new ModelAndView("listtrainee");
		modelAndView.addObject("TRAINEESLIST", traineesList);
		return modelAndView;
	}

	@PostMapping("update")
	public ModelAndView modify(@RequestParam Integer id) {
		Trainee trainee = traineeService.findById(id);
		ModelAndView modelAndView = new ModelAndView("updatetrainee");
		modelAndView.addObject("TRAINEE", trainee);
		return modelAndView;
	}

	@GetMapping("delete")
	public ModelAndView delete(@RequestParam Integer id) {
		Trainee trainee = traineeService.findById(id);
		traineeService.delete(id);
		List<Trainee> traineesList = traineeService.findAll();
		ModelAndView modelAndView = new ModelAndView("listtrainee");
		modelAndView.addObject("TRAINEESLIST", traineesList);
		return modelAndView;
	}

	@GetMapping("retrieve")
	public ModelAndView retrieve(@RequestParam Integer id) {
		Trainee trainee = traineeService.findById(id);
		ModelAndView modelAndView = new ModelAndView("traineeinfo");
		modelAndView.addObject("TRAINEE", trainee);
		return modelAndView;
	}

}
