package com.gv.csc.controller;

import com.gv.csc.exceptions.CLOSETException;
import com.gv.csc.helper.CLOSETHelper;
import com.gv.csc.service.CLOSETService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * CLOSETController - CLOSET Controller holds all the End points to serve CLOSET APIs
 */
@RestController
@RequestMapping("/closet")
public class CLOSETController {
	
    @Autowired
    private CLOSETService closetService;

    Logger logger = LoggerFactory.getLogger(CLOSETController.class);
}
