package nexttech.domain.dto.employeeDetailsDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import nexttech.domain.model.entities.EmployeeDetails;
import nexttech.domain.model.entities.EmployeePosition;
import nexttech.domain.model.entities.EmployeeRoleTeamProjectPosition;
import nexttech.domain.model.enumerates.AuthRole;
import nexttech.domain.model.enumerates.SeniorityLevel;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class GetEmployeesResponseDTO {
    private Integer employeeDetailsId;
    private LocalDate startDate;
    @Schema(description = "Main position of the employee.")
    private EmployeePosition positionId;
//    private EmployeeDetails manager;
    private SeniorityLevel seniorityLevel;
    private LocalDateTime creationDate;
    private String firstName;
    private String lastName;
    private String workEmail;
    private AuthRole authRole;
    private String photoURL;
    private LocalDateTime lastModificationDate;
    @Schema(description = "This shows the employee who has a certain role in a certain team on a certain project in a certain position")
    private List<EmployeeRoleTeamProjectPosition> employeeRoleTeamProjectPositions;
}
