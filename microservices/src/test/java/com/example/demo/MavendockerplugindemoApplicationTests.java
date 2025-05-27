package com.example.demo;

import com.bolingcavalry.mavendockerplugindemo.MavendockerplugindemoApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
@ContextConfiguration(classes = {MavendockerplugindemoApplication.class})
class MavendockerplugindemoApplicationTests {

	@Test
	public void testAdd() {
		System.out.println("junit test");
		assertEquals(5, 5, "2 + 3 应该等于 5");
	}

}
