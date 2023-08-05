//综合查询
package com.steam404.server.controller;

import com.steam404.server.service.queryMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class queryController {
    @GetMapping(value = "query")
    public ArrayList<Object> query(
            @RequestParam(required = false) String name,
            @RequestParam(required = false) Integer id
    ) throws IOException {
        ArrayList<Object> students=new ArrayList<>();
        queryMessage queryMessage=new queryMessage();
        if(name!=null){
            students= (ArrayList<Object>) queryMessage.queryName(name);
        }else if(id !=null){
            students = (ArrayList<Object>) queryMessage.queryIdAchievement(id);
        }
        return students;
    }
}
