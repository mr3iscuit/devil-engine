package org.devilengine.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/v1")
public class Controller {

    @GetMapping("/hello")
    public ResponseEntity<String> getAudio() {
        return ResponseEntity.ok("Hello World!");
    }

}
