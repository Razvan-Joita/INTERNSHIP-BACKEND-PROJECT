package nexttech.domain.dto.roleDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class GetRoleResponseDto {
    private Integer roleId;
    private String name;
    private String description;
    private LocalDateTime creationDate;
    private LocalDateTime lastModificationDate;
}
