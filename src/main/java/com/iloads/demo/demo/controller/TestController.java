package com.iloads.demo.demo.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.iloads.demo.demo.dto.TestDto;
import com.iloads.demo.demo.dto.TestDtoVal;

@RestController
public class TestController {

	@RequestMapping(value = "/sdf", method = RequestMethod.GET)
	public String testMethod1() {
		return "sds";
	}
	
	@PostMapping("/test")
	public String testMethod(@Validated({TestDtoVal.class}) @RequestBody @Valid TestDto testDto, BindingResult result) {
		if(result.hasErrors()) {
			return "please check the input";
		}
		return testDto.getName();
	}
	
	@PostMapping("/tests")
	public String testMethod2(@Valid TestDto testDto, BindingResult result) {
		List<FieldError> errors = result.getFieldErrors();
	   
		for (FieldError error : errors ) {
	        System.out.println (error.getObjectName() + " - " + error.getDefaultMessage());
	    }
		if(result.hasErrors()) {
			return "please check the input";
		}
		return testDto.getName();
	}
}
