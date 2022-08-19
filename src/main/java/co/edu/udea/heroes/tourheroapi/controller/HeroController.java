package co.edu.udea.heroes.tourheroapi.controller;

import co.edu.udea.heroes.tourheroapi.dto.HeroDTO;
import co.edu.udea.heroes.tourheroapi.model.Hero;
import co.edu.udea.heroes.tourheroapi.service.HeroService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000", maxAge = 3600)
@RestController
@RequestMapping(path ="/heroes")
public class HeroController {

    private final Logger log = LoggerFactory.getLogger(HeroController.class);
    private HeroService heroService ;


    public HeroController(HeroService heroService) {

        this.heroService = heroService;
    }

    @GetMapping("/{id}")
    public ResponseEntity<HeroDTO> getHeroById(@PathVariable @NonNull Integer id){
        log.debug("el id que se busca es: "+id);

        return ResponseEntity.ok(heroService.getHeroById(id));
    }

    @GetMapping("/")
    public ResponseEntity<List<HeroDTO>>findAllHeroes(){
        return ResponseEntity.ok(heroService.findAllHeroes());
    }

    @PostMapping(consumes = {"application/JSON", "application/XML"})
    public ResponseEntity<HeroDTO> createHero(@RequestBody HeroDTO heroDTO){
        HeroDTO heroToBeCreated = heroService.createHero(heroDTO);
        return new ResponseEntity<HeroDTO>(heroToBeCreated, null, HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletHeroById(@PathVariable @NonNull Integer id){
        heroService.deletHeroById(id);
        return new ResponseEntity<Void>(null, null, HttpStatus.OK);
    }

}
