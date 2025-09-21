package com.ddg.EC2DeployDemo;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("Hello from EC2", HttpStatus.OK);
    }

    @GetMapping("/bye")
    public ResponseEntity<String> bye() {
        return new ResponseEntity<>("Bye from EC2", HttpStatus.OK);
    }
}
