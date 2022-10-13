package com.gv.csc.service;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gv.csc.dao.LastLoginTimeDao;
import com.gv.csc.entity.LastLoginTime;
import com.gv.csc.entity.Style;

@Service
public class LastLoginTimeService {
	
	@Autowired
	private LastLoginTimeDao lastLoginTimeDao;

    Logger logger = LoggerFactory.getLogger(StyleService.class);

}
