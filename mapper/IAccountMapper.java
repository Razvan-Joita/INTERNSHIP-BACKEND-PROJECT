//package nexttech.mapper;
//
//
//import nexttech.domain.model.entities.PersonalDetails;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring", uses = IAccountExtraDetailsMapper.class)
//public interface IAccountMapper {
//    @Mapping(target = "accountExtraDetails", expression = "java(new java.util.ArrayList<>())")
//    PersonalDetails addAccountRequestDtoToAccount(AddAccountRequestDto account);
//
//    PersonalDetails getAccountRequestDtoToAccount(GetAccountRequestDto account);
//
//    PersonalDetails updateAccountRequestDtoToAccount(UpdateAccountRequestDto account);
//
//    AddPersonalDetailsResponseDto accountToAddAccountResponseDto(PersonalDetails account);
//
//    GetPersonalDetailsResponseDto accountToGetAccountRequestDto(PersonalDetails account);
//
//    UpdatePersonalDetailsResponseDto accountToUpdateAccountResponseDto(PersonalDetails account);
//}
