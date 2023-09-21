package nexttech.domain.dto.teamDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class UpdateTeamRequestDto {
    private Integer id;
    private String name;
    private String description;
}