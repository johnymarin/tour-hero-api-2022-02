package co.edu.udea.heroes.tourheroapi.controller;

import co.edu.udea.heroes.tourheroapi.model.Hero;
import co.edu.udea.heroes.tourheroapi.service.HeroService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    private final Logger log = LoggerFactory.getLogger(HeroController.class);

    private HeroService heroService ;

    public HeroController(HeroService heroService) {
        this.heroService = heroService;
    }

    @GetMapping("{id}")
    public Hero getHero(@PathVariable Integer id){

        log.debug("el id que se busca es: "+id);
        return heroService.getHero(id);
    }

}
