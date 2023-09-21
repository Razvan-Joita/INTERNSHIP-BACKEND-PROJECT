package nexttech.domain.dto.employeeDetailsExtraDetailsDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.composite_primary_key_company.EmployeeDetailsExtraDetailsId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeDetailsExtraDetailsRequestDto {
    private EmployeeDetailsExtraDetailsId userWorkTitleComposite;
}
