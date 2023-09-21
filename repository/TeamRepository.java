package nexttech.repository;

import nexttech.domain.model.entities.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeamRepository extends JpaRepository<Team,Integer> {

    List<Team> findAll();
    List<Team> findByNameContaining(String name);



}
