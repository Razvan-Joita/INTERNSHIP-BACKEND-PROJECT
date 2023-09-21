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
public class EmployeeDetailsRoleId implements Serializable {
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "role_id")
    private Integer roleId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetailsRoleId that = (EmployeeDetailsRoleId) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, roleId);
    }
}
