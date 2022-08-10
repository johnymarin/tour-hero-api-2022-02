package co.edu.udea.heroes.tourheroapi.controller;

import co.edu.udea.heroes.tourheroapi.model.Hero;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/heroes")
public class HeroController {

    @GetMapping("{id}")
    public Hero getHero(Integer id){
        return new Hero(1, "Hulk");
    }

}
