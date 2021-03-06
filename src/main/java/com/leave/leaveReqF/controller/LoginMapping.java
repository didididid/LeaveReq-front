package com.leave.leaveReqF.controller;

import com.leave.leaveReqF.model.LoginForm;
import com.leave.leaveReqF.tools.CheckSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.cloud.client.ServiceInstance;
//import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.ResponseEntity;
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
 * @author AdhityaWP
 */
@Controller
public class LoginMapping {

//    @Autowired
//    private DiscoveryClient discoveryClient;
    


    @GetMapping("/*")
    public String index() {
        return "404";
    }

    @GetMapping("/login")
    public String login(Model model, HttpSession session) {
        if (session.getAttribute("idLogin") != null) {
            return "redirect:/profil";
        }

        return "loginPage";
    }

    @RequestMapping(value = "/loginPost", method = RequestMethod.POST)
    @ResponseBody
    public Map<String,Object> loginPost(@RequestBody Map<String, Object> data,
            HttpSession session, HttpServletRequest request) {
        //mengakses back-leave
        Map<String, Object> identity = new HashMap<>();
//        System.out.println(data.get("id"));
        identity.put("id", data.get("id"));
        identity.put("password", data.get("password"));

//        List<ServiceInstance> instances = discoveryClient.getInstances("back-leave");
        //kalo gak pake eureka atas dihilangkan
//        if (instances != null && instances.size() > 0) {
//            ServiceInstance serviceInstance = instances.get(0);
//            String url = serviceInstance.getUri().toString();
            //kalo gak pake eureka url= "http://localhost:8087/loginState"
            String url = "http://localhost:8088/loginState";
            RestTemplate restTemplate = new RestTemplate();
            
            Map<String,Object> result = restTemplate.postForObject(url, identity,
                    Map.class);
            session.setAttribute("idLogin", result.get("id"));
            session.setAttribute("identity", result.get("identity"));
            return result;
//        }
    }

    @GetMapping("/logout")
    public String logout(Model model, HttpSession session) {
        if (session.getAttribute("idLogin") == null) {
            return "redirect:/login";
        } else {
            session.removeAttribute("idLogin");
        }
        return "redirect:/login";
    }
    


}
