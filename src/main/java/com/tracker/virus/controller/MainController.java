package com.tracker.virus.controller;

import com.tracker.virus.Model.AllData;
import com.tracker.virus.Model.Statewise;
import com.tracker.virus.client.DataClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
public class MainController {



    @Autowired
    DataClient dataClient;

    static AllData data;

    @PostConstruct
    @Scheduled(fixedRate = 1000)
    @GetMapping("/getdata")
    public AllData getdata() {
        data = dataClient.getalldata();
        System.out.println("done");
        return data;
    }



    @GetMapping("/getbystate/{state}")
    public Statewise getByState(@PathVariable("state") String state){
        System.out.println("here is the state"+state);
        Optional<Statewise> stat=data.getStatewise().stream().filter(statewise -> statewise.getState().toLowerCase().trim().equals(state.toLowerCase().trim())).findFirst();

        if(stat!=null)
        {
        Statewise statee=stat.get();
        return statee;}
        else {
            return null;
        }
    }

    @GetMapping("/getOnlyStates")
    public List<Statewise> states(){
        return data.getStatewise();
    }









}
