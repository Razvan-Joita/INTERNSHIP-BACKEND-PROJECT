package nexttech.domain.dto.employeePositionDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateEmployeePositionResponseDto {
    private Integer employeePositionId;
    private String name;
    private String description;
    private LocalDateTime lastModificationDate;
}
