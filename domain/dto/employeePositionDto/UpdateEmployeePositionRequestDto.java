package nexttech.domain.dto.employeePositionDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeePositionRequestDto {
    private Integer employeePositionId;
    private String name;
    private String description;
}
