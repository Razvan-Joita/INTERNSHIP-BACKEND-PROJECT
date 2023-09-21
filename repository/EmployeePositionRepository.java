package nexttech.repository;

import nexttech.domain.model.entities.EmployeePosition;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface EmployeePositionRepository extends JpaRepository<EmployeePosition,Integer> {

    List<EmployeePosition> findAll();
    List<EmployeePosition> findByNameContaining(String name);

}
