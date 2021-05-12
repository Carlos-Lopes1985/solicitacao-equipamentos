package com.zup.solicitacaoequipamentos;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

import com.zup.solicitacaoequipamentos.entity.Usuario;
import com.zup.solicitacaoequipamentos.enums.Role;
import com.zup.solicitacaoequipamentos.repository.UsuarioRepository;

@SpringBootApplication
public class SolicitacaoEquipamentosApplication extends SpringBootServletInitializer implements CommandLineRunner {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		// TODO Auto-generated method stub
		return builder.sources(SolicitacaoEquipamentosApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(SolicitacaoEquipamentosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Usuario usu = new Usuario(null, "Carlos", "123", "carlos@hotmail.com", Role.USUARIO);
		Usuario usu1= new Usuario(null, "Pedro", "123", "pedro@hotmail.com", Role.USUARIO);
		
		usuarioRepository.saveAll(Arrays.asList(usu,usu1));
		
	}

}
