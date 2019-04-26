/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave.leaveReqF.tools;

import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Component;

/**
 *
 * @author Pupunk
 */
@Component
public class ErrorMessage {

    public Map<String, Object> getErrMSg() {

        Map<String, Object> error = new HashMap<>();
        error.put("status", false);
         error.put("message", "500");
        return error;
    }

}