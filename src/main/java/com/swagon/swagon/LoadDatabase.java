/*package com.swagon.swagon;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.swagon.swagon.Model.Renter;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(RenterRepository repository){
        return args -> {
            log.info("Preloading " + repository.save(new Renter("Steven","Geq", "steven@gmail.com")));
            log.info("Preloading " + repository.save(new Renter("Geka","Pedal", "pedal@gmail.com")));
            log.info("Preloading " + repository.save(new Renter("Tosho","Kukata", "tosho@gmail.com")));
            log.info("Preloading " + repository.save(new Renter("Viktor","Naydenov", "exampleASD@gmail.com")));
            log.info("Preloading " + repository.save(new Renter("Gosho","Petkov", "exampleASD@gmail.com")));
        };
    }
}*/