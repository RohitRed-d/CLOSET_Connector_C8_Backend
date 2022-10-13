package com.gv.csc.service;

import com.gv.csc.exceptions.CLOSETException;
import com.gv.csc.helper.CLOSETHelper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * CLOSETService - Service class containing the service logic for speaking with CLOSET APIs
 */
@Service
public class CLOSETService {
	
    @Autowired
    private CLOSETHelper closetHelper;

}
