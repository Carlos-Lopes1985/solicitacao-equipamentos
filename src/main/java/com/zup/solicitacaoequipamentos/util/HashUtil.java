package com.zup.solicitacaoequipamentos.util;

import org.apache.commons.codec.digest.DigestUtils;

public class HashUtil {

	public static String getSecurityHash(String senha) {
		return DigestUtils.sha256Hex(senha);
	}
	
}
