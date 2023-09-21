package nexttech.domain.dto.employeeDetailsExtraDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.composite_primary_key_company.EmployeeDetailsExtraDetailsId;
import nexttech.domain.model.entities.AccountExtraColumn;
import nexttech.domain.model.entities.EmployeeDetails;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeDetailsExtraDetailsRequestDto {
    private EmployeeDetailsExtraDetailsId userWorkTitleComposite;
    private String value;
    private EmployeeDetails userWorkId;
    private AccountExtraColumn title;
}
