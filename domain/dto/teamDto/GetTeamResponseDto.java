package nexttech.domain.dto.teamDto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class GetTeamResponseDto {
    private Integer teamId;
    private String name;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime lastModificationDate;
}