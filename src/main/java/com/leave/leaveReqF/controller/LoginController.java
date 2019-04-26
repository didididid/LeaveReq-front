package com.leave.leaveReqF.controller;

import com.leave.leaveReqF.tools.ErrorMessage;
import com.leave.leaveReqF.tools.RestAPI;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.core.env.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author User
 */
@RestController
public class LoginController {
    
//    @Autowired
//    RestAPI restAPI;
//    @Autowired
//    Environment environment;
//    @Autowired
//    ErrorMessage errorMessage;
//    
//    @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
//    public Map<String, Object> login(@RequestBody Map<String, Object> data,
//            HttpSession session, HttpServletRequest request) {
//        try {
//            String api = environment.getProperty("login.service"); //<<belum 
//            Map<String, Object> identity = new HashMap<>();
//            identity.put("id", data.get("id"));
//            identity.put("password", data.get("password"));
//            identity.put("sessionId", session.getId()); 
//            
//            Map<String, Object> result = restAPI.PostData(identity, api+"/login", session, false);
//            return result;
//        } catch (Exception e) {
//            return errorMessage.getErrMSg();
//        }
//    }
    
}
