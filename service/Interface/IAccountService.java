package nexttech.service.Interface;

import nexttech.domain.dto.accountDto.LoginAccountRequestDto;
import nexttech.domain.dto.accountDto.LoginAccountResponseDto;

public interface IAccountService {
    LoginAccountResponseDto login(LoginAccountRequestDto loginAccountRequestDto);
}
