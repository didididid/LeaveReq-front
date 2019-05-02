/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave.leaveReqF.controller;

import javax.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author User
 */
@Controller
public class RequestController {
    
    @GetMapping("/request")
    public String request(Model model, HttpSession session){
        if (session.getAttribute("idLogin") == null) {
            return "redirect:/login";
        }
        return "request";
    }
}
