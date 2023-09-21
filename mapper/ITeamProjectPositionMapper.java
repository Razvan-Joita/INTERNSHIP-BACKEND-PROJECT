//package nexttech.mapper;
//
//import nexttech.domain.dto.teamProjectPositionDto.AddTeamProjectPositionRequestDto;
//import nexttech.domain.dto.teamProjectPositionDto.AddTeamProjectPositionResponseDto;
//import nexttech.domain.dto.teamProjectPositionDto.GetTeamProjectPositionRequestDto;
//import nexttech.domain.dto.teamProjectPositionDto.GetTeamProjectPositionResponseDto;
//import nexttech.domain.dto.teamProjectPositionDto.UpdateTeamProjectPositionRequestDto;
//import nexttech.domain.dto.teamProjectPositionDto.UpdateTeamProjectPositionResponseDto;
//import nexttech.domain.model.entities.TeamProjectPosition;
//import org.mapstruct.Mapper;
//
//@Mapper(componentModel = "spring", uses = {ITeamMapper.class, IProjectMapper.class, IEmployeePositionMapper.class})
//public interface ITeamProjectPositionMapper {
//
//    TeamProjectPosition addTeamProjectPositionRequestDtoToTeamProjectPosition(AddTeamProjectPositionRequestDto teamProjectPosition);
//
//    TeamProjectPosition getTeamProjectPositionRequestDtoToTeamProjectPosition(GetTeamProjectPositionRequestDto teamProjectPosition);
//
//    TeamProjectPosition updateTeamProjectPositionRequestDtoToTeamProjectPosition(UpdateTeamProjectPositionRequestDto teamProjectPosition);
//
//    AddTeamProjectPositionResponseDto teamProjectPositionToAddTeamProjectPositionResponseDto(TeamProjectPosition teamProjectPosition);
//
//    GetTeamProjectPositionResponseDto teamProjectPositionToGetTeamProjectPositionResponseDto(TeamProjectPosition teamProjectPosition);
//
//    UpdateTeamProjectPositionResponseDto teamProjectPositionToUpdateTeamProjectPositionResponseDto(TeamProjectPosition teamProjectPosition);
//}
