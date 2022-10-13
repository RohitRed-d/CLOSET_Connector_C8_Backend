package com.gv.csc.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gv.csc.dao.StyleDAO;
import com.gv.csc.entity.Style;
import com.gv.csc.exceptions.CLOSETException;
import com.gv.csc.exceptions.PLMException;
import com.gv.csc.helper.CLOSETHelper;
import com.gv.csc.helper.PLMHelper;
import com.gv.csc.helper.RestService;
import com.gv.csc.util.Utility;
import org.json.JSONArray;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

@Service
public class StyleService {

    @Autowired
    private StyleDAO styleDAO;

    @Autowired
    private RestService restService;

    @Autowired
    private CLOSETHelper closetHelper;

    @Autowired
    private PLMHelper plmHelper;

    Logger logger = LoggerFactory.getLogger(StyleService.class);

}
