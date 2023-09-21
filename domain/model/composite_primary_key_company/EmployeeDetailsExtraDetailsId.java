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
public class EmployeeDetailsExtraDetailsId implements Serializable {
    @Column(name = "employee_id")
    private Integer employeeId;

    @Column(name = "title")
    private String title;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeDetailsExtraDetailsId that = (EmployeeDetailsExtraDetailsId) o;
        return Objects.equals(employeeId, that.employeeId) && Objects.equals(title, that.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeId, title);
    }
}
