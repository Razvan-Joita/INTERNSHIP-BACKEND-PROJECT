package nexttech.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class ApiErrorResponse {
    private Integer httpStatus;
    private String errorMessage;
    private String businessCode;
}
