package nexttech.domain.model.composite_primary_key_company;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@AllArgsConstructor
@Embeddable
@NoArgsConstructor
public class TeamProjectPositionRoleId implements Serializable {

    @Column(name = "team_id")
    private Integer teamId;
    @Column(name = "project_id")
    private Integer projectId;
    @Column(name = "employee_position_id")
    private Integer employeePositionId;
    @Column(name = "role_id")
    private Integer roleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeamProjectPositionRoleId that = (TeamProjectPositionRoleId) o;
        return Objects.equals(teamId, that.teamId) && Objects.equals(projectId, that.projectId) && Objects.equals(employeePositionId, that.employeePositionId) && Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, projectId, employeePositionId, roleId);
    }
}
