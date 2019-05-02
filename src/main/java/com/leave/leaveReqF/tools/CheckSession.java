/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave.leaveReqF.tools;

import com.leave.leaveReqF.model.LoginSession;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author User
 */
@Component
public class CheckSession {
//    @Autowired
//    private DiscoveryClient discoveryClient;
    
    
    public String ceksession(){
        
//        List<ServiceInstance> instances = discoveryClient.getInstances("back-leave");
//        if (instances != null && instances.size() > 0) {//todo: replace with a load balancing mechanism
//            ServiceInstance serviceInstance = instances.get(0);
//            String url = serviceInstance.getUri().toString();
//            url = url + "/loginState";
//            RestTemplate restTemplate = new RestTemplate();
//            LoginSession loginSession = restTemplate.getForObject(url,
//                    LoginSession.class);
//            if(loginSession.getId()!= null){
//                return loginSession.getId();
//            }
//        }
//        
        return null;
    }
    
    
}
