package com.test1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.context.annotation.PropertySource;

import com.test1.controller.base.UserBaseController;

@RestController
@PropertySource("classpath:${configfile.path}/Test1.properties")
@RequestMapping(value="${endpoint.api}", headers = "Accept=application/json")
public class UserController extends UserBaseController {

	//OVERRIDE HERE YOUR CUSTOM CONTROLLER

}
