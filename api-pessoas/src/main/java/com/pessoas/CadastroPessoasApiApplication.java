package com.pessoas;

import java.time.LocalDate;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.pessoas.entity.Desenvolvedor;
import com.pessoas.entity.Equipe;
import com.pessoas.entity.Gestor;
import com.pessoas.entity.Pessoa;
import com.pessoas.repository.EquipeRepository;
import com.pessoas.repository.PessoaRepository;

@SpringBootApplication
public class CadastroPessoasApiApplication implements CommandLineRunner {

	@Autowired
	private PessoaRepository pessoaRepository;
	
	@Autowired
	private EquipeRepository equipeRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(CadastroPessoasApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Equipe equip  = new Equipe(null, "Mac laren");
		Equipe equip1 = new Equipe(null, "Nasa");
		Equipe equip2 = new Equipe(null, "Foguete");
		Equipe equip3 = new Equipe(null, "Marte");
		
		Pessoa desenvolvedor  = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca1@gmail.com", "12345V", LocalDate.now(), equip);
		Pessoa desenvolvedor1 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca2@gmail.com", "12345V", LocalDate.now(),equip);
		Pessoa desenvolvedor2 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca3@gmail.com", "12345V", LocalDate.now(),equip1);
		Pessoa desenvolvedor3 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca4@gmail.com", "12345V", LocalDate.now(),equip);
		Pessoa desenvolvedor4 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca5@gmail.com", "12345V", LocalDate.now(),equip2);
		Pessoa desenvolvedor5 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca6@gmail.com", "12345V", LocalDate.now(),equip3);
		Pessoa desenvolvedor6 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca7@gmail.com", "12345V", LocalDate.now(),equip2);
		Pessoa desenvolvedor7 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca8@gmail.com", "12345V", LocalDate.now(),equip);
		Pessoa desenvolvedor8 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca9@gmail.com", "12345V", LocalDate.now(),equip3);
		Pessoa desenvolvedor9 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca00@gmail.com", "12345V", LocalDate.now(),equip);
		Pessoa desenvolvedor10 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca01@gmail.com", "12345V", LocalDate.now(),equip3);
		Pessoa desenvolvedor11 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca02@gmail.com", "12345V", LocalDate.now(),equip3);
		Pessoa desenvolvedor12 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca03@gmail.com", "12345V", LocalDate.now(),equip2);
		Pessoa desenvolvedor13 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca04@gmail.com", "12345V", LocalDate.now(),equip2);
		Pessoa desenvolvedor14 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca05@gmail.com", "12345V", LocalDate.now(),equip2);
		Pessoa desenvolvedor15 = new Desenvolvedor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ca06@gmail.com", "12345V", LocalDate.now(),equip3);
		
		Pessoa gestor16 = new Gestor(null,"Roberto",LocalDate.now(),"00000000000","12345","ro@gmail.com","333445",LocalDate.now());
		Pessoa gestor17 = new Gestor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "bruno@gmail.com", "12345V", LocalDate.now());
		Pessoa gestor18 = new Gestor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "ana@gmail.com", "12345V", LocalDate.now());
		Pessoa gestor19 = new Gestor(null, "Carlos", LocalDate.now(), "0000000000", "12345", "matehs@gmail.com", "12345V", LocalDate.now());
		
		equip.setGestor(gestor16);
		equip2.setGestor(gestor19);
		equip3.setGestor(gestor17);
		equip1.setGestor(gestor18);
		
		equipeRepository.saveAll(Arrays.asList(equip,equip1,equip2,equip3));
		
		pessoaRepository.saveAll(Arrays.asList( desenvolvedor,desenvolvedor1,
			    desenvolvedor2,desenvolvedor3,
			    desenvolvedor5,desenvolvedor4,
			    desenvolvedor6,desenvolvedor7,
			    desenvolvedor8,desenvolvedor9,
			    desenvolvedor11,desenvolvedor10,
			    desenvolvedor12,desenvolvedor14,
			    desenvolvedor13,desenvolvedor15,gestor16,gestor17,gestor18,gestor19));	
	}

}
