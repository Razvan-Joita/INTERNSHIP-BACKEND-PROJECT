package nexttech.exceptions;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CompanyException extends RuntimeException {
    public CompanyExceptionEnum companyExceptionEnum;
    public List<String> argumentsList;
}
