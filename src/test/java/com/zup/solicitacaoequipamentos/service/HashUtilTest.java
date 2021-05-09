package com.zup.solicitacaoequipamentos.service;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

import com.zup.solicitacaoequipamentos.util.HashUtil;

@RunWith(SpringRunner.class)
public class HashUtilTest {
	
	@Test
	public void getSecurityHashTest() {
		
		String hash = HashUtil.getSecurityHash("123");
		assertThat(hash.length()).isEqualTo(64);
	}
}
