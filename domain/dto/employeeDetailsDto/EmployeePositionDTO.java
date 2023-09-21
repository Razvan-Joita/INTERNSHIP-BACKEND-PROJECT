package nexttech.domain.dto.employeeDetailsDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class EmployeePositionDTO {
    @Schema(description = "This is the name of the position")
    private String name;
    @Schema(description = "This is the description of the position")
    private String description;
}
