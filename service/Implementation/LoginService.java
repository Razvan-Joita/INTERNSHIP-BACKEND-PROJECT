package nexttech.service.Implementation;

import lombok.AllArgsConstructor;
import nexttech.domain.dto.accountDto.LoginAccountRequestDto;
import nexttech.domain.dto.accountDto.LoginAccountResponseDto;
import nexttech.domain.model.entities.EmployeeDetails;
import nexttech.exceptions.CompanyException;
import nexttech.exceptions.CompanyExceptionEnum;
import nexttech.mapper.ILoginMapper;
import nexttech.repository.EmployeeDetailsRepository;
import nexttech.service.Interface.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LoginService implements IAccountService {
    private EmployeeDetailsRepository employeeDetailsRepository;
    private ILoginMapper accountMapper;

    @Override
    public LoginAccountResponseDto login(LoginAccountRequestDto loginAccountRequestDto) {
        EmployeeDetails personalDetails = employeeDetailsRepository.findByWorkEmailAndPassword(loginAccountRequestDto.getWorkEmail(), loginAccountRequestDto.getPassword());
        if (personalDetails == null) {
            throw new CompanyException(CompanyExceptionEnum.EXTERNAL_SERVER_ERROR, List.of(loginAccountRequestDto.getWorkEmail()));
        } else {
            return accountMapper.accountToLoginAccountResponseDto(personalDetails);
        }
    }
}
