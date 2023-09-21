package nexttech.mapper;

import nexttech.domain.dto.accountDto.*;
import nexttech.domain.model.entities.EmployeeDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring", uses = IAccountExtraDetailsMapper.class)
public interface ILoginMapper {
    LoginAccountResponseDto accountToLoginAccountResponseDto(EmployeeDetails personalDetails);

}
