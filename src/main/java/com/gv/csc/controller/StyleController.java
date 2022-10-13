package com.gv.csc.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.gv.csc.entity.Style;
import com.gv.csc.exceptions.CLOSETException;
import com.gv.csc.helper.CLOSETHelper;
import com.gv.csc.service.StyleService;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/style")
public class StyleController {

    @Autowired
    private StyleService styleService;

    private Gson gson = new Gson();
    private ObjectMapper objectMapper = new ObjectMapper();

    Logger logger = LoggerFactory.getLogger(StyleController.class);

}
