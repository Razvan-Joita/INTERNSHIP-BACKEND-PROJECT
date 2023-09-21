//package nexttech.mapper;
//
//import nexttech.domain.dto.teamProjectDto.AddTeamProjectRequestDto;
//import nexttech.domain.dto.teamProjectDto.AddTeamProjectResponseDto;
//import nexttech.domain.dto.teamProjectDto.GetTeamProjectRequestDto;
//import nexttech.domain.dto.teamProjectDto.GetTeamProjectResponseDto;
//import nexttech.domain.dto.teamProjectDto.UpdateTeamProjectRequestDto;
//import nexttech.domain.dto.teamProjectDto.UpdateTeamProjectResponseDto;
//import nexttech.domain.model.entities.TeamProject;
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//
//@Mapper(componentModel = "spring", uses = {ITeamMapper.class, IProjectMapper.class})
//public interface ITeamProjectMapper {
//    TeamProject addTeamProjectRequestDtoToTeamProject(AddTeamProjectRequestDto teamProject);
//
//    TeamProject getTeamProjectRequestDtoToTeamProject(GetTeamProjectRequestDto teamProject);
//
//    TeamProject updateTeamProjectRequestDtoToTeamProject(UpdateTeamProjectRequestDto teamProject);
//
//    AddTeamProjectResponseDto teamProjectToAddTeamProjectResponseDto(TeamProject teamProject);
//
//    GetTeamProjectResponseDto teamProjectToGetTeamProjectResponseDto(TeamProject teamProject);
//
//    UpdateTeamProjectResponseDto teamProjectToUpdateTeamProjectResponseDto(TeamProject teamProject);
//
//}
