package nexttech.service.Interface;

import nexttech.domain.dto.teamDto.*;
import nexttech.domain.model.entities.Team;

import java.util.List;

public interface ITeamService {
    AddTeamResponseDto createTeam(AddTeamRequestDto createTeamRequestDTO);

    UpdateTeamResponseDto updateTeam(Integer teamID, UpdateTeamRequestDto updateTeamRequestDTO);

    void deleteTeam(Integer teamID);

    GetTeamResponseDto getTeamById(Integer teamID);
    List<Team> getAllTeam();

    List<Team> getTeamsByName(String name);



}
