package com.example.service2.controller;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.service2.model.Statusna;



@RestController
public class ResponseMessage {
    private List<Statusna> status = new ArrayList<>();
    
    @GetMapping("/ew")
    public List<Statusna> Response() {
        return status;
    }
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/addRes")
    public Statusna addStatus(@RequestBody Statusna st){
        Statusna data = new Statusna(
            st.getId(),
            st.getStatus()
        );
        status.add(data);
        return data;
    }
}
