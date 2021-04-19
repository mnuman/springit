package com.milconuman.springit;

import com.milconuman.springit.domain.Comment;
import com.milconuman.springit.domain.Link;
import com.milconuman.springit.repository.CommentRepository;
import com.milconuman.springit.repository.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);

	public static void main(String[] args) {

		SpringApplication.run(SpringitApplication.class, args);
		System.out.println("Welcome to Springit!");
	}

	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
		return args -> {
			Link link = new Link("Getting Started with Spring Boot 2","https://therealdanvega.com/spring-boot-2");
			linkRepository.save( link );

			Comment comment = new Comment("This Spring Boot 2 Link is awesome",link);
			commentRepository.save(comment);
			link.addComment(comment); // does not exist OOTB

/*			Simply retrieve an entity instance from the repository
			Link firstLink = linkRepository.findByTitle("Getting Started with Spring Boot 2");
			System.out.println(firstLink.getUrl());
*/
		};
	}

}
