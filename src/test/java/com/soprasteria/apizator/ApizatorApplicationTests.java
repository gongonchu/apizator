package com.soprasteria.apizator;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest(classes = ApizatorApplication.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class ApizatorApplicationTests {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	void testRandomNumber() {
      ResponseEntity<Long>  response = this.restTemplate.getForEntity("http://localhost:" + port + "/randomNumber", Long.class);
      assertEquals(HttpStatus.OK.value(), response.getStatusCodeValue());
	}

}
