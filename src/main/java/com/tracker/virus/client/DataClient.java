package com.tracker.virus.client;

import com.tracker.virus.Model.AllData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.client.RestTemplate;


@Service
public class DataClient {




    public AllData getalldata(){
        RestTemplate restTemplate=new RestTemplate();
        return restTemplate.getForObject("https://api.covid19india.org/data.json",AllData.class);
    }


}
