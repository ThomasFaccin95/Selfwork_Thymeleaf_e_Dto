package it.aulab.progetto_blog;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ProgettoBlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProgettoBlogApplication.class, args);
	}

	// Configura e registra un'istanza di ModelMapper nel contesto di Spring.
	// Questo Bean permette di iniettare ModelMapper (tramite @Autowired)
	// in qualunque
	// Service dell'applicazione per semplificare la conversione (mapping) tra
	// oggetti Entity (Database) e oggetti DTO (Data Transfer Object).
	// @return Un'istanza pronta all'uso di ModelMapper.
	
	@Bean
	public ModelMapper modelMapper() {
		ModelMapper mapper = new ModelMapper();
		return mapper;
	}
}
