package nexttech.repository;

import nexttech.domain.model.composite_primary_key_company.TeamProjectId;
import nexttech.domain.model.entities.TeamProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamProjectRepository extends JpaRepository<TeamProject,TeamProjectId> {

}
