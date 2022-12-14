package com.gv.csc.helper;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.gv.csc.entity.LastLoginTime;
import com.gv.csc.entity.Style;
import com.gv.csc.exceptions.CLOSETException;
import com.gv.csc.exceptions.PLMException;
import com.gv.csc.service.LastLoginTimeService;
import com.gv.csc.service.StyleService;
import com.gv.csc.util.*;
import okhttp3.Response;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.http.*;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.net.InetAddress;

/**
 * PLMHelper - Helper class containing the helper logic for speaking with PLM APIs and preparing response
 */
public class PLMHelper {

    @Autowired
    private RestService restService;

    @Autowired
    private CLOSETHelper closetHelper;

    @Autowired
     private StyleService styleService;
    private ObjectMapper objectMapper = new ObjectMapper();
    
    @Autowired
    private Environment environment;
    
    @Autowired
    private LastLoginTimeService lastLoginTimeService;

    Logger logger = LoggerFactory.getLogger(PLMHelper.class);

    public PLMHelper() {
    }
}
