/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave.leaveReqF.model;

/**
 *
 * @author User
 */
public class LoginSession {
    private String idsession;
    private String id;

    public LoginSession() {
    }
    
    public LoginSession(String idsession, String id) {
        this.idsession = idsession;
        this.id = id;
    }

    public String getIdsession() {
        return idsession;
    }

    public String getId() {
        return id;
    }

    public void setIdsession(String idsession) {
        this.idsession = idsession;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    
    
    
    
    
    
}
