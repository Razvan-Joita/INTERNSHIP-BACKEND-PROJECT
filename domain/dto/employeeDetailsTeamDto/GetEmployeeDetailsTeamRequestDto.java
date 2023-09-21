package nexttech.domain.dto.employeeDetailsTeamDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.composite_primary_key_company.EmployeeDetailsTeamId;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeDetailsTeamRequestDto {
    private EmployeeDetailsTeamId teamUserWorkComposite;
}
