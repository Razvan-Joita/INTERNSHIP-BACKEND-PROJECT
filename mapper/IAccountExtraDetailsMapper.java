package nexttech.mapper;

import nexttech.domain.dto.accountExtraDetailsDto.AddAccountExtraDetailsRequestDto;
import nexttech.domain.dto.accountExtraDetailsDto.AddAccountExtraDetailsResponseDto;
import nexttech.domain.dto.accountExtraDetailsDto.GetAccountExtraDetailsRequestDto;
import nexttech.domain.dto.accountExtraDetailsDto.GetAccountExtraDetailsResponseDto;
import nexttech.domain.dto.accountExtraDetailsDto.UpdateAccountExtraDetailsRequestDto;
import nexttech.domain.dto.accountExtraDetailsDto.UpdateAccountExtraDetailsResponseDto;
import nexttech.domain.model.entities.AccountExtraDetails;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring",uses = IAccountExtraColumnMapper.class)
public interface IAccountExtraDetailsMapper {
    AccountExtraDetails addAccountExtraDetailsRequestDtoToAccountExtraDetails(AddAccountExtraDetailsRequestDto accountExtraDetails);

    AccountExtraDetails getAccountExtraDetailsRequestDtoToAccountExtraDetails(GetAccountExtraDetailsRequestDto accountExtraDetails);

    AccountExtraDetails updateAccountExtraDetailsRequestDtoToAccountExtraDetails(UpdateAccountExtraDetailsRequestDto accountExtraDetails);

    AddAccountExtraDetailsResponseDto accountExtraDetailsToAddAccountExtraDetailsResponseDto(AccountExtraDetails accountExtraDetails);

    GetAccountExtraDetailsResponseDto accountExtraDetailsToGetAccountExtraDetailsResponseDto(AccountExtraDetails accountExtraDetails);

    UpdateAccountExtraDetailsResponseDto accountExtraDetailsToUpdateAccountExtraDetailsResponseDto(AccountExtraDetails accountExtraDetails);

}
