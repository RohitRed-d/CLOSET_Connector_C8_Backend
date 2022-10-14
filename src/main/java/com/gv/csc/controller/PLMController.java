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

    /**
     * login - End point to be used to connect to PLM
     *
     * @param userid   String userid
     * @param password String password
     * @return ResponseEntity holding the details on login
     * @throws UnknownHostException
     */
    @PostMapping(value = "/login", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> login(@RequestBody String body, @RequestParam String plmUrl,@RequestHeader Map<String, String> headers, HttpSession session ){
        logger.info("INFO::PLMController: login() started.");
        System.out.println("body  :"+body);
        System.out.println("headers  :"+headers);
        System.out.println("plmUrl  :"+plmUrl);
        JSONObject outJson;
        try {
            session.setAttribute("plmurl", plmUrl);
            JSONObject jsonBody = new JSONObject(body);
            //Calling service method used to get the login details
            outJson = plmService.plmLogin(body, plmUrl, headers);
        } catch(PLMException exe) {
            exe.printStackTrace();
            //Prepare Error JSON response with the exception message and code
            outJson = PLMHelper.prepareErrorResponse(exe);
            logger.error("ERROR::PLMController: login() -> outJson : " + outJson);
            return ResponseEntity.status(exe.getStatusCode()).body(outJson.toString());
        }
        logger.debug("DEBUG::PLMController: login() outJson) - " + outJson);
        logger.info("INFO::PLMController: login() end.");
        return ResponseEntity.ok(outJson.toString());
    }
}
