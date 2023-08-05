package com.steam404.server.controller;

import com.steam404.server.service.fixupMessage;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class fixupController {
    @PutMapping(value = "fixup")
    public int fixup(
            @RequestParam String newName,
            @RequestParam String oldName
    ) throws IOException {
        fixupMessage fixupMessage=new fixupMessage();
        return fixupMessage.fixup(newName,oldName);
    }
}
