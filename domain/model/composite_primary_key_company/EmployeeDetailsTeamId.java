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
public class EmployeeDetailsTeamId implements Serializable {
    @Column(name = "team_id")
    private Integer teamId;

    @Column(name = "employee_id")
    private Integer employeeId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetailsTeamId that = (EmployeeDetailsTeamId) o;
        return Objects.equals(teamId, that.teamId) && Objects.equals(employeeId, that.employeeId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(teamId, employeeId);
    }
}
