package com.soprasteria.apizator;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

@RestController
public class ApiController {
    @RequestMapping("/")
    public ResponseEntity<Object> defautlPath(){
        return new ResponseEntity<>("Welcome on my awesome randomApp", HttpStatus.OK);
    }
    @RequestMapping("/randomNumber")
    public ResponseEntity<Object> getRandomNumber(){
        try {
        TimeUnit.MILLISECONDS.sleep(ThreadLocalRandom.current().nextLong(500,5000));
        return new ResponseEntity<>(new Random().nextLong(), HttpStatus.OK);
        } catch (InterruptedException e) {
            return new ResponseEntity<>("Timer error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
