package com.gv.csc.helper;

import com.gv.csc.entity.LastLoginTime;
import com.gv.csc.exceptions.CLOSETException;
import com.gv.csc.service.LastLoginTimeService;
import com.gv.csc.util.CLOSETConnectorConstants;
import com.gv.csc.util.CLOSETConstants;
import com.gv.csc.util.PLMConstants;
import com.gv.csc.util.Utility;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.HttpServerErrorException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Map;

/**
 * CLOSETHelper - Helper class containing the helper logic for speaking with CLOSET APIs and preparing response
 */
public class CLOSETHelper {

    @Autowired
    private RestService restService;

    @Autowired
    private LastLoginTimeService lastLoginTimeService;
    
    static Logger logger = LoggerFactory.getLogger(CLOSETHelper.class);

}
