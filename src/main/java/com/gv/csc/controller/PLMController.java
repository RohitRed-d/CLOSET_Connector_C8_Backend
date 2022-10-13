package com.gv.csc.controller;

import com.gv.csc.exceptions.CLOSETException;
import com.gv.csc.exceptions.PLMException;
import com.gv.csc.helper.PLMHelper;
import com.gv.csc.service.PLMService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpSession;

import java.net.UnknownHostException;
import java.util.Map;

/**
 * PLMController - PLM Controller holds all the End points to serve PLM APIs
 */
@RestController
@RequestMapping("/plm")
public class PLMController {
    @Autowired
    private PLMService plmService;

    @Autowired
    private PLMHelper plmHelper;

    Logger logger = LoggerFactory.getLogger(PLMController.class);
}
