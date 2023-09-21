package nexttech.domain.dto.employeeDetailsDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import nexttech.domain.model.entities.EmployeePosition;
import nexttech.domain.model.enumerates.AuthRole;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class CreateEmployeeRequestDTO {
    @Schema(description = "This is the first name of the employee")
    private String firstName;
    @Schema(description = "This is the last name of the employee")
    private String lastName;
    @Schema(description = "This is the work email of the employee")
    private String workEmail;
    @Schema(description = "This is the role with which the user logs in")
    private AuthRole authRole;
    @Schema(description = "This is the position a user has in a project")
    private EmployeePositionDTO position;
}
