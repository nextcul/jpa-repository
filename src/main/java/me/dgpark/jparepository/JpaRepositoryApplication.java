package me.dgpark.jparepository;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(repositoryImplementationPostfix = "Default")
@EnableJpaRepositories(repositoryBaseClass = SimpleMyRepository.class)
public class JpaRepositoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(JpaRepositoryApplication.class, args);
	}

}
