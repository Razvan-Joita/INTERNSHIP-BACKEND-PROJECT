package nexttech.domain.dto.accountDto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import nexttech.domain.model.entities.AccountExtraDetails;
import nexttech.domain.model.entities.EmployeeDetails;
import nexttech.domain.model.entities.EmployeePosition;
import nexttech.domain.model.entities.EmployeeRoleTeamProjectPosition;
import nexttech.domain.model.enumerates.AuthRole;
import nexttech.domain.model.enumerates.SeniorityLevel;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class LoginAccountResponseDto {
    private Integer employeeDetailsId;
    @Schema(description = "This is the start date of logging in the account")
    private LocalDate startDate;
    @Schema(description = "Main position of the employee.")
    private EmployeePosition positionId;
    private EmployeeDetails manager;
    @Schema(description = "This is the seniority level of the user")
    private SeniorityLevel seniorityLevel;
    @Schema(description="This is the first name of the user")
    private String firstName;
    @Schema(description = "This is the last name of the user")
    private String lastName;
    @Schema(description = "This is the work email of the user")
    private String workEmail;
    @Schema(description = "This is the role with which the user authenticates")
    private AuthRole authRole;
    @Schema(description = "This shows the employee who has a certain role in a certain team on a certain project in a certain position")
    List<EmployeeRoleTeamProjectPosition> employeeRoleTeamProjectPositions;
    @Schema(description = "This is the photo of the user")
    private String photoURL;
}