package com.alloymobile.hadoop;

import org.json.JSONObject;
import org.json.XML;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class HadoopResource {

    @GetMapping(value= "/hadoop")
    public String helloWorld(@RequestParam String name){
        return "Hello "+name;
    }

    @GetMapping(value= "/json")
    public Map<String, String> getJson() {
        Map<String, String> jsonMap = new HashMap<String, String>();
        jsonMap.put("name","Tapas");
        jsonMap.put("city","Hamilton");
        return jsonMap;
    }

    @GetMapping(value= "/xml")
    public String getJsonFromXml() {
        String xml = "<book>\n" +
                "<id>1</id>\n" +
                "<name>programing in java</name>\n" +
                "<author>Dev Macay</author>\n" +
                "</book>";
        JSONObject json = new JSONObject();
        try{
            json = XML.toJSONObject(xml);
            return json.toString();
        }catch(Exception e){

        }
        return null;
    }
}



