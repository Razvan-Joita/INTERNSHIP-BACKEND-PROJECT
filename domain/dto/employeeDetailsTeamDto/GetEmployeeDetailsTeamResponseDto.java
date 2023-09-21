package nexttech.domain.dto.employeeDetailsTeamDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.composite_primary_key_company.EmployeeDetailsTeamId;
import nexttech.domain.model.entities.EmployeeDetails;
import nexttech.domain.model.entities.Team;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetEmployeeDetailsTeamResponseDto {
    private EmployeeDetailsTeamId teamUserWorkComposite;
    private Team teamId;
    private EmployeeDetails userWorkId;
    private LocalDateTime creationDate;
    private LocalDateTime lastModificationDate;
}
