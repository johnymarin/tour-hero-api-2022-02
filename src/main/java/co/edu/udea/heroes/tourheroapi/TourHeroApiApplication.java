package co.edu.udea.heroes.tourheroapi;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TourHeroApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(TourHeroApiApplication.class, args);
    }

    @Bean public ModelMapper modelMapper(){return new ModelMapper();
    }


}
