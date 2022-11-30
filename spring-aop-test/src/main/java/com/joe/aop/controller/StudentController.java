package com.joe.aop.controller;

import com.joe.aop.service.DataService;
import lombok.extern.slf4j.Slf4j;
import org.hibernate.validator.constraints.Range;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * Created by joker on 2022/11/28.
 */

@RestController
@Slf4j
@Validated
public class StudentController {
	@Autowired
	@Qualifier("studentController.InnerClassDataService")
	private DataService dataService;

	@GetMapping(path = "students/{id}")
	public void deleteStudent(@PathVariable("id") @Range(min = 1, max = 100) int id) {
		dataService.deleteStudent(id);
	}

	@Repository
	public static class InnerClassDataService implements DataService {

		@Override
		public void deleteStudent(int id) {

		}
	}
}