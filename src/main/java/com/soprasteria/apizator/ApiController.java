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

    @RequestMapping("/randomNumber")
    public ResponseEntity<Object> getRandomNumber(){
        try {
        Long result = new Random().nextLong();
        Long timer = ThreadLocalRandom.current().nextLong(500,5000);
        System.out.println(timer);

            TimeUnit.MILLISECONDS.sleep(timer);
        return new ResponseEntity<Object>(result, HttpStatus.OK);
        } catch (InterruptedException e) {
            return new ResponseEntity<Object>("Timer error", HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
