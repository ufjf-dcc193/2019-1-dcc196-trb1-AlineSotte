package br.ufjf.dcc193.Projeto1DCC193;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import br.ufjf.dcc193.Projeto1DCC193.Modelo.Sede;
import br.ufjf.dcc193.Projeto1DCC193.Repositorio.SedeRepository;

@SpringBootApplication
public class Projeto1Dcc193Application {

	public static void main(String[] args) {
		SpringApplication.run(Projeto1Dcc193Application.class, args);


		ConfigurableApplicationContext 
		ctx=SpringApplication.run(Projeto1Dcc193Application.class, args);
		SedeRepository sederep= ctx.getBean(SedeRepository.class);
		System.out.println("!!!!!!Pelo amor de Deus!!!!!!");

		// Sede sede1 = new Sede("Sede Sudeste","Minas Gerais");
		// Sede sede2 = new Sede("Sede Centro-Oeste","Mato-Grosso do Sul");
		Sede s1 = new Sede();
		Sede s2 = new Sede();
		s1.setNomeFantasia("asHSAUSHSAU");
		s1.setEstadoFederacao("sHUAUHSA222");

		s2.setNomeFantasia("aaaaaa");
		s2.setEstadoFederacao("bbbb");
		sederep.save(s1);
		sederep.save(s2);
        System.out.println(sederep.findAll().toString());	
		System.out.println("Pelo amor de Deus!!!!!!");

		
	}

}
