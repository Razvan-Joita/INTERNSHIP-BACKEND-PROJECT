package nexttech.repository;

import nexttech.domain.model.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface RoleRepository extends JpaRepository<Role,Integer> {
    List<Role> findAll();
    @Query("SELECT r FROM Role r " +
            "ORDER BY " +
            "CASE WHEN :sortOrder = 'ASC' THEN r.name ELSE '' END ASC, " +
            "CASE WHEN :sortOrder = 'DESC' THEN r.name ELSE '' END DESC, " +
            "CASE WHEN :sortOrder = 'DESC' THEN r.roleId ELSE 0 END ASC, " +
            "CASE WHEN :sortOrder = 'ASC' THEN r.roleId ELSE 0 END DESC")
    List<Role> findAllByOrderByName(@Param("sortOrder") String sortOrder);

}


