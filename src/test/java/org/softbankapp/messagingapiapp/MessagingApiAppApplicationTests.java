package org.softbankapp.messagingapiapp;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MessagingApiAppApplicationTests {

	@Test
	void contextLoads() {
        assertEquals(5,4*4);
	}

}
