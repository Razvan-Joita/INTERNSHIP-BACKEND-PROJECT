package nexttech.domain.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.composite_primary_key_company.EmployeeDetailsExtraDetailsId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "employee_details_extra_details")
public class EmployeeDetailsExtraDetails extends BaseEntity {
    @EmbeddedId
    private EmployeeDetailsExtraDetailsId userWorkTitleComposite;

    @Column(name = "input_value")
    private String value;

    @ManyToOne
    @MapsId("userWorkId")
    @JoinColumn(name = "employee_id")
    private EmployeeDetails userWorkId;

    @ManyToOne
    @MapsId("title")
    @JoinColumn(name = "title")
    private AccountExtraColumn title;
}
