package com.springboot.bits.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.springboot.bits.entity.Number;
import com.springboot.bits.repository.NumberRepository;

@RepositoryRestController
@RequestMapping("/bits")
public class BitsController {
	@Autowired
	private NumberRepository strRepository;

	@PostMapping(path = "/demo")
	public void savePalindraome(@RequestBody Number s){
		Number s1 = new Number();
		s1.setNum(BitsChange(s.getNum()));
		strRepository.save(s1);
		System.out.println("sdfds");
	}
	
	public String BitsChange(String num) {
		StringBuilder sb = new StringBuilder();
		int number = Integer.valueOf("num");
		while (number > 0) {
			sb.insert(0, (char)number % 2);
			number /= 2;
		}
		sb.reverse();
		return sb.toString();
	}
	
	
	
}
