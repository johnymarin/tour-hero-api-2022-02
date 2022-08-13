package co.edu.udea.heroes.tourheroapi.service;

import co.edu.udea.heroes.tourheroapi.model.Hero;
import org.springframework.stereotype.Service;

@Service
public class HeroService {
    public Hero getHero(Integer id){
        return new Hero(1, "Hulk");
    }
}
