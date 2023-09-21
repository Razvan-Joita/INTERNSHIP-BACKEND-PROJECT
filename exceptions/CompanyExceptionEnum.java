package nexttech.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@Getter
public enum CompanyExceptionEnum {
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "Internal server error", "5000"),
    EXTERNAL_SERVER_ERROR(HttpStatus.SERVICE_UNAVAILABLE, "External server error", "5001"),
    USER_ID_NOT_FOUND(HttpStatus.NOT_FOUND, "User with ID %s not found", "4000"),
    DUPLICATE_USER_NAME(HttpStatus.CONFLICT, "User name %s already exists", "4001"),
    TEAM_ID_NOT_FOUND(HttpStatus.NOT_FOUND, "Team with ID %s not found", "4100"),
    DUPLICATE_TEAM_NAME(HttpStatus.CONFLICT, "Team name %s already exists", "4101"),
    TEAM_MEMBERSHIP_EXCEPTION(HttpStatus.BAD_REQUEST, "User %1$s is already a member of team %2$s", "4200"),
    TEAM_MEMBERSHIP_NONEXISTENT(HttpStatus.BAD_REQUEST, "Can not add User %s to a non-existent team", "4201"),
    ROLE_ID_NOT_FOUND(HttpStatus.NOT_FOUND, "Role with ID %s not found", "4100"),
    PROJECT_ID_NOT_FOUND(HttpStatus.NOT_FOUND, "Project with ID %s not found", "4100"),
    POSITION_ID_NOT_FOUND(HttpStatus.NOT_FOUND, "Employee Position with ID %s not found", "4101"),
    TEAM_PROJECT_ID_NOT_FOUND(HttpStatus.NOT_FOUND, "Team of the Project with ID %s not found", "4101"),


    ;
    private final HttpStatus httpStatus;
    private final String errorMessage;
    private final String businessCode;
}
