package nexttech.domain.model.composite_primary_key_company;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Embeddable
@NoArgsConstructor
@MappedSuperclass
public class TeamProjectId implements Serializable {

    @Column(name = "team_id")
    private Integer teamId;
    @Column(name = "project_id")
    private Integer projectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamProjectId that = (TeamProjectId) o;
        return Objects.equals(teamId, that.teamId) && Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, projectId);
    }
}
