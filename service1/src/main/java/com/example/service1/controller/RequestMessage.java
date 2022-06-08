package com.example.service1.controller;

import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpResponse;
import java.nio.charset.StandardCharsets;

import javax.annotation.PostConstruct;
import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.tomcat.util.http.fileupload.IOUtils;
import org.springframework.http.HttpEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/message")
public class RequestMessage {
  WebClient client = WebClient.create();
  @GetMapping()
  @PostConstruct
  public String text(){
    WebClient.ResponseSpec responseSpec = client.get()
    .uri("http://localhost:8083/ew")
    .retrieve();
    String responseBody = responseSpec.bodyToMono(String.class).block();
    return responseBody;
  }
  
}
