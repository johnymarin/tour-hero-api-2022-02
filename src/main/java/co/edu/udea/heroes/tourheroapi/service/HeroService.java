package co.edu.udea.heroes.tourheroapi.service;

import co.edu.udea.heroes.tourheroapi.model.Hero;
import co.edu.udea.heroes.tourheroapi.repository.HeroRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class HeroService {

    private HeroRepository heroRepository;


    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public Hero getHero(Integer id){
        Optional<Hero> optionalHero = heroRepository.findById(id);
        return optionalHero.get();
    }
}
