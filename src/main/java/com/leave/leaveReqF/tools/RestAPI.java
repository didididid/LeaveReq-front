/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leave.leaveReqF.tools;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpSession;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

/**
 *
 * @author Pupunk
 */
@Component
public class RestAPI {

    private RestTemplate restTemplate = new RestTemplate();

    //FUNGSI UNTUK POST DATA VIA RESTFULL
    //INPUT : OBJECT DATA (MAP)
    //UseHeader Diset True Jika Mau Set Token DiHeader
    public Map<String, Object> PostData(Map<String, Object> data, String apiservices, HttpSession session, Boolean useHeader) {
         Map<String, Object> msg = new  HashMap<String, Object>();
         msg.put("data", "data");
         
         if(data == null){
             data = msg;
         }
         
        HttpHeaders headers = new HttpHeaders();
        if (useHeader) {
//		headers.set("userid", header.get("userid").toString());
//		headers.set("sessionid",  header.get("sessionid").toString());

            headers.set("userid", session.getAttribute("userid").toString());
            headers.set("sessionid", session.getAttribute("sessionid").toString());

        }
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        //set data dan header
        HttpEntity<Map> request = new HttpEntity<>(data, headers);

        //send data viarestTemplate

        return restTemplate.postForObject(apiservices, request, Map.class);

    }

    public Map<String, Object> PostDataWithModel(Object data, String apiservices, HttpSession session, Boolean useHeader) {

        HttpHeaders headers = new HttpHeaders();
        if (useHeader) {
//		headers.set("userid", header.get("userid").toString());
//		headers.set("sessionid",  header.get("sessionid").toString());

            headers.set("userid", session.getAttribute("userid").toString());
            headers.set("sessionid", session.getAttribute("sessionid").toString());

        }
        headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
        //set data dan header
        HttpEntity<Object> request = new HttpEntity<>(data, headers);


        return restTemplate.postForObject(apiservices, request, Map.class);

    }
    
    
    
    
    //FUNGSI UNTUK GET DATA VIA RESTFULL
    //INPUT : OBJECT DATA (MAP)
    //UseHeader Diset True Jika Mau Set Token DiHeader
    public Map<String, Object> GetData(Map<String, Object> header, HttpSession session, Boolean useHeader, UriComponentsBuilder builder) {

        HttpHeaders headers = new HttpHeaders();

        if (useHeader) {

            headers.set("userid", session.getAttribute("userid").toString());
            headers.set("sessionid", session.getAttribute("sessionid").toString());

        }
            headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);

        HttpEntity<Map> entity = new HttpEntity<>(headers);

        HttpEntity<Map> result = restTemplate.exchange(
                builder.build().encode().toUri(),
                HttpMethod.GET,
                entity,
                Map.class);

        return result.getBody();
    }

}
