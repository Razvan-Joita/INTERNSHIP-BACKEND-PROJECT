package nexttech.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionHandlerAdvice {

    @ExceptionHandler(CompanyException.class)
    public ResponseEntity<ApiErrorResponse> handleCustomException(CompanyException companyException) {
        ApiErrorResponse apiErrorResponse = new ApiErrorResponse(
                companyException.companyExceptionEnum.getHttpStatus().value(),
                String.format(companyException.companyExceptionEnum.getErrorMessage(), companyException.argumentsList.toArray()),
                companyException.companyExceptionEnum.getBusinessCode()
        );
        return ResponseEntity.status(companyException.companyExceptionEnum.getHttpStatus()).body(apiErrorResponse);
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ApiErrorResponse> handleDefaultException(Exception exception) {
        ApiErrorResponse apiErrorResponse = new ApiErrorResponse(
                HttpStatus.INTERNAL_SERVER_ERROR.value(),
                "An unknown error occurred",
                "UNKNOWN_ERROR"
        );
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(apiErrorResponse);
    }
}
