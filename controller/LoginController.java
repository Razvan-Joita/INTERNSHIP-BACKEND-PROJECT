package nexttech.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import nexttech.domain.dto.accountDto.LoginAccountRequestDto;
import nexttech.domain.dto.accountDto.LoginAccountResponseDto;
import nexttech.service.Interface.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class LoginController {
    private IAccountService accountService;

    @PostMapping("/login")
    @Operation(summary = "Login with work email and password")
    public LoginAccountResponseDto login(@RequestBody LoginAccountRequestDto loginAccountRequestDto) {
        return accountService.login(loginAccountRequestDto);
    }
}
