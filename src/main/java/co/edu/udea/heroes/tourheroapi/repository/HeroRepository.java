package co.edu.udea.heroes.tourheroapi.repository;

import co.edu.udea.heroes.tourheroapi.model.Hero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HeroRepository extends JpaRepository<Hero,Integer> {

}
