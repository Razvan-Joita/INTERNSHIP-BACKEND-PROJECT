package nexttech.domain.dto.employeeDetailsDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import nexttech.domain.model.enumerates.AuthRole;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class UpdateEmployeeRequestDTO {
    private String firstName;
    private String lastName;
    private String workEmail;
    private AuthRole authRole;
    @Schema(description = "Main position of the employee.")
    private EmployeePositionDTO position;
}
