package com.bolingcavalry.wallet;

import com.bolingcavalry.wallet.WalletApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
@ContextConfiguration(classes = {WalletApplication.class})
class WalletServiceApplicationTests {

	@Test
	public void testAdd() {
		System.out.println("junit test");
		assertEquals(5, 5, "2 + 3 应该等于 5");
	}

}
