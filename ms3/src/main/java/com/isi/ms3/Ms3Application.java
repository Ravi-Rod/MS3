package com.isi.ms3;

import com.isi.ms3.entities.Etudiant;
import com.isi.ms3.repository.EtudiantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Ms3Application {

    public static void main(String[] args) {
        SpringApplication.run(Ms3Application.class, args);
    }
    @Bean
    CommandLineRunner commandLineRunner(EtudiantRepository EtudiantRepository){
        return args -> {
            for (int i = 0; i < 5; i++){
                Etudiant etudiant= Etudiant.builder()
                        .prenom("etudiant"+(i+1))
                        .adresse("rue"+(i+1))
                        .telephone("77"+Math.random()*9999999)
                        .build();
                EtudiantRepository.save(etudiant);
            }
        };
    }
}
