package com.unipark.demo.Controllers;

import com.unipark.demo.Models.InfoFull;
import com.unipark.demo.Services.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

@Controller
public class GraphqlController {

    @Autowired
    private RecordService recordService;

    @QueryMapping
    public InfoFull getInfo(){
        return recordService.getInfoFull();
    }
}
