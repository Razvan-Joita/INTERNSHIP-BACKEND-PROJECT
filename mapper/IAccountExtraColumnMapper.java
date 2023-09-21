package nexttech.mapper;

import nexttech.domain.dto.accountExtraColumnDto.AddAccountExtraColumnRequestDto;
import nexttech.domain.dto.accountExtraColumnDto.AddAccountExtraColumnResponseDto;
import nexttech.domain.dto.accountExtraColumnDto.GetAccountExtraColumnRequestDto;
import nexttech.domain.dto.accountExtraColumnDto.GetAccountExtraColumnResponseDto;
import nexttech.domain.dto.accountExtraColumnDto.UpdateAccountExtraColumnRequestDto;
import nexttech.domain.dto.accountExtraColumnDto.UpdateAccountExtraColumnResponseDto;
import nexttech.domain.model.entities.AccountExtraColumn;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IAccountExtraColumnMapper {
    AccountExtraColumn addAccountExtraColumnRequestDtoToAccountExtraColumn(AddAccountExtraColumnRequestDto column);

    AccountExtraColumn getAccountExtraColumnRequestDtoToAccountExtraColumn(GetAccountExtraColumnRequestDto column);

    AccountExtraColumn updateAccountExtraColumnRequestDtoToAccountExtraColumn(UpdateAccountExtraColumnRequestDto column);

    AddAccountExtraColumnResponseDto accountExtraColumnToAddAccountExtraColumnResponseDto(AccountExtraColumn column);

    GetAccountExtraColumnResponseDto accountExtraColumnToGetAccountExtraColumnResponseDto(AccountExtraColumn column);

    UpdateAccountExtraColumnResponseDto accountExtraColumnToUpdateAccountExtraColumnResponseDto(AccountExtraColumn column);
}
