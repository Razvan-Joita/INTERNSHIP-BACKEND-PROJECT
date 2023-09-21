package nexttech.domain.dto.projectDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProjectRequestDto {
    private Integer projectId;
    private String name;
    private String description;
}
