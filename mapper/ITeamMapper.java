package nexttech.mapper;

import nexttech.domain.dto.teamDto.AddTeamRequestDto;
import nexttech.domain.dto.teamDto.AddTeamResponseDto;
import nexttech.domain.dto.teamDto.GetTeamRequestDto;
import nexttech.domain.dto.teamDto.GetTeamResponseDto;
import nexttech.domain.dto.teamDto.UpdateTeamRequestDto;
import nexttech.domain.dto.teamDto.UpdateTeamResponseDto;
import nexttech.domain.model.entities.Team;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ITeamMapper {

    Team addTeamRequestDtoToTeam(AddTeamRequestDto team);

    Team getTeamRequestDtoToTeam(GetTeamRequestDto team);

    Team updateTeamRequestDtoToTeam(UpdateTeamRequestDto team);

    AddTeamResponseDto teamToAddTeamResponseDto(Team team);

    GetTeamResponseDto teamToGetTeamResponseDto(Team team);

    UpdateTeamResponseDto teamToUpdateTeamResponseDto(Team team);

}
