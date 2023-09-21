package nexttech.domain.dto.accountDto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class LoginAccountRequestDto {
    @Schema(description = "This is the work email of the user")
    private String workEmail;
    @Schema(description = "This is the password of the user")
    private String password;
}
