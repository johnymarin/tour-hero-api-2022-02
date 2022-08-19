package co.edu.udea.heroes.tourheroapi.service;

import co.edu.udea.heroes.tourheroapi.dto.HeroDTO;
import co.edu.udea.heroes.tourheroapi.model.Hero;
import co.edu.udea.heroes.tourheroapi.repository.HeroRepository;
import org.springframework.stereotype.Service;
import org.modelmapper.ModelMapper;

import javax.persistence.EntityNotFoundException;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HeroService {

    private HeroRepository heroRepository;
    private ModelMapper modelMapper;


    public HeroService(HeroRepository heroRepository, ModelMapper modelMapper) {

        this.heroRepository = heroRepository;
        this.modelMapper = modelMapper;
    }

    public Hero getHero(Integer id){
        Optional<Hero> optionalHero = heroRepository.findById(id);
        return optionalHero.get();
    }

    public HeroDTO getHeroById(Integer id){
        Optional<Hero> optionalHeroFound = heroRepository.findById(id);
        Hero heroFound = optionalHeroFound.orElseThrow(EntityNotFoundException::new);
        return modelMapper.map(heroFound, HeroDTO.class);
    }

    public List<HeroDTO> findAllHeroes() {
        List<Hero> heroesList = (List<Hero>) heroRepository.findAll();
        return heroesList.stream().map(hero -> modelMapper.map(hero, HeroDTO.class)).collect(Collectors.toList());
    }
}
