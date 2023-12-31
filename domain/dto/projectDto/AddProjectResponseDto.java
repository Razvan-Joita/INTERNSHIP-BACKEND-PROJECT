package nexttech.domain.dto.projectDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddProjectResponseDto {
    private Integer projectId;
    private String name;
    private String description;
    private LocalDateTime creationDate;
}
