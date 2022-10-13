package com.gv.csc.controller;

import java.util.List;

import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.gv.csc.dao.LastLoginTimeDao;
import com.gv.csc.entity.LastLoginTime;
import com.gv.csc.service.LastLoginTimeService;


@RestController
@RequestMapping("/closetandplm")
public class LastLoginTimeController {
	
	@Autowired
	private LastLoginTimeService lastLoginTimeService;
	
	@Autowired
	private LastLoginTimeDao lastLoginTimeDao;
	private ObjectMapper objectMapper = new ObjectMapper();
	private Gson gson = new Gson();
    Logger logger = LoggerFactory.getLogger(StyleController.class);

}
