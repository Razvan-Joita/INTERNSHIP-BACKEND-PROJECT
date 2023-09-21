package nexttech.domain.dto.employeeRoleTeamProjectPositionDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeeRoleTeamProjectPositionRequestDto {
    private Integer id;
    private Integer employeeId;
    private Integer roleId;
    private Integer teamId;
    private Integer projectId;
    private Integer positionId;
}
