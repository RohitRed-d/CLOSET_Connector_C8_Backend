package com.gv.csc.service;

import com.gv.csc.exceptions.CLOSETException;
import com.gv.csc.exceptions.PLMException;
import com.gv.csc.helper.PLMHelper;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.net.UnknownHostException;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

/**
 * PLMService - Service class containing the service logic for speaking with PLM APIs
 */
@Service
public class PLMService {

    @Autowired
    private PLMHelper plmHelper;
}
