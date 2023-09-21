package nexttech.domain.dto.teamDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddTeamResponseDto {
    private Integer teamId;
    private String name;
    private String description;
    private LocalDateTime creationDate;
}