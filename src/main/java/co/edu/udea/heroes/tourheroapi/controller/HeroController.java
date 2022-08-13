package co.edu.udea.heroes.tourheroapi.controller;

import co.edu.udea.heroes.tourheroapi.model.Hero;
import co.edu.udea.heroes.tourheroapi.service.HeroService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    private HeroService heroService;


    @GetMapping("{id}")
    public Hero getHero(Integer id){
        return heroService.getHero(id);
    }

}
