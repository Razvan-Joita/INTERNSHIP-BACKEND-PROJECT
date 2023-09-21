package nexttech.service.Implementation;

import lombok.AllArgsConstructor;
import nexttech.domain.dto.teamDto.*;
import nexttech.domain.model.entities.Team;
import nexttech.exceptions.CompanyException;
import nexttech.exceptions.CompanyExceptionEnum;
import nexttech.mapper.ITeamMapper;
import nexttech.repository.TeamRepository;
import nexttech.service.Interface.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TeamService implements ITeamService {

    private TeamRepository teamRepository;
    private ITeamMapper teamMapper;

    @Override
    public AddTeamResponseDto createTeam(AddTeamRequestDto createTeamRequestDTO) {
        Team team= teamMapper.addTeamRequestDtoToTeam(createTeamRequestDTO);
        return teamMapper.teamToAddTeamResponseDto(teamRepository.save(team));

    }

    @Override
    public UpdateTeamResponseDto updateTeam(Integer teamID, UpdateTeamRequestDto updateTeamRequestDTO) {
        Team teamToUpdate = teamRepository.findById(teamID).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.ROLE_ID_NOT_FOUND, List.of(teamID.toString())));

        teamToUpdate.setName(updateTeamRequestDTO.getName());
        teamToUpdate.setDescription(updateTeamRequestDTO.getDescription());
        return teamMapper.teamToUpdateTeamResponseDto(teamRepository.save(teamToUpdate));
    }

    @Override
    public void deleteTeam(Integer teamID) {
        Team team = teamRepository.findById(teamID).orElseThrow(()->new CompanyException(CompanyExceptionEnum.TEAM_ID_NOT_FOUND,List.of(teamID.toString())));
        teamRepository.deleteById(team.getTeamId());

    }

    @Override
    public GetTeamResponseDto getTeamById(Integer teamID) {

       Team team= teamRepository.findById(teamID).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.TEAM_ID_NOT_FOUND, List.of(teamID.toString())));
        return teamMapper.teamToGetTeamResponseDto(team);
    }

    @Override
    public List<Team> getTeamsByName(String name) {
        return teamRepository.findByNameContaining(name);
    }



    @Override
    public List<Team> getAllTeam() {
        return teamRepository.findAll();

    }
}
