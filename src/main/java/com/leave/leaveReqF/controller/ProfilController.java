/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave.leaveReqF.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author User
 */
@Controller
public class ProfilController {

    @GetMapping("/profil")
    public String profil(Model model, HttpSession session) {
        if (session.getAttribute("idLogin") == null) {
            return "redirect:/login";
        }
        model.addAttribute("iduser", session.getAttribute("idLogin"));
        model.addAttribute("identity", session.getAttribute("identity"));
        return "profil";
    }

//    @RequestMapping(value = "/profils", method = RequestMethod.POST)
//    @ResponseBody
//    public Map<String, Object> profils(@RequestBody Map<String, Object> data, HttpSession session) {
//        
//        Map<String, Object> identity = new HashMap<>();
//        identity.put("id", session.getAttribute("idLogin"));
//
//        String url = "http://localhost:8089/useridentify";
//        RestTemplate restTemplate = new RestTemplate();
//        Map<String, Object> result = restTemplate.postForObject(url, identity,
//                Map.class);
//
//        return result;
//    }
}
