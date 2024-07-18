package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ExternalApiService {

    @Autowired
    private RestTemplate restTemplate;

    public String getExternalData() {
        String url = "https://api.thirdparty.com/data";
        return restTemplate.getForObject(url, String.class);
    }
}
