package nexttech.domain.dto.accountExtraColumnDto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddAccountExtraColumnResponseDto {
    private String title;
    private LocalDateTime creationDate;
}
