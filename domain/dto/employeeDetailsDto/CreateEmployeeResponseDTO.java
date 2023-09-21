package nexttech.domain.dto.employeeDetailsDto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@ToString
public class CreateEmployeeResponseDTO {
    private Integer employeeDetailsId;
    private LocalDateTime creationDate;
}
