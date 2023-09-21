package nexttech.repository;

import nexttech.domain.model.entities.EmployeeDetails;
import nexttech.domain.model.entities.PersonalDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeDetailsRepository extends JpaRepository<EmployeeDetails, Integer> {
    @Query(value =
            "SELECT DISTINCT ed.* " +
                    "FROM employee ed " +
                    "LEFT JOIN employee_role_team_project_position er ON ed.employee_id = er.employee_id " +
                    "LEFT JOIN team t on er.team_id=t.team_id " +
                    "LEFT JOIN employee_position ep on ep.employee_position_id=ed.employee_position_id " +
                    "WHERE (:searchTerm IS NULL OR ed.first_name LIKE %:searchTerm% ) " +
                    "AND (:teamId IS NULL OR t.team_id = :teamId OR t.team_id IS NULL) " +
                    "AND (:positionName IS NULL OR ep.name = :positionName OR ep.name IS NULL) " +
                    "ORDER BY ed.employee_id " +
                    "OFFSET :page * :size " +
                    "FETCH NEXT :size ROWS ONLY ",nativeQuery = true)
    List<EmployeeDetails> findAllByTeamIdAndEmployeePositionName(
            @Param("searchTerm") String searchTerm,
            @Param("teamId") Integer teamId,
            @Param("positionName") String positionName,
            @Param("page") Integer page,
            @Param("size") Integer size);

    EmployeeDetails findByWorkEmailAndPassword(String workEmail, String password);
}
