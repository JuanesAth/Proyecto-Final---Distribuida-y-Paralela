package com.unipark.demo.Services;

import com.unipark.demo.Models.Cosa;
import com.unipark.demo.Models.InfoFull;
import com.unipark.demo.Repository.RecordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RecordService {
    @Autowired
    private RecordRepository repo;


    public InfoFull getInfoFull(){
        InfoFull infoFull = new InfoFull();
        infoFull.records = repo.findAll();
        infoFull.Weather = clima();
        return infoFull;
    }

    public String clima(){
        String URL= "http://api.openweathermap.org/data/2.5/weather?lat=6.1554&lon=-75.3736&appid=cc20847d093b4c097e800877cf7738ef";
        RestTemplate template = new RestTemplate();
        Cosa cosa = template.getForObject(URL, Cosa.class);
        return cosa.weather.get(0).main;
    }
}

