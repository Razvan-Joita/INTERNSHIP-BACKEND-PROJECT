//package nexttech.service.Implementation;
//
//import lombok.AllArgsConstructor;
//import nexttech.domain.dto.teamProjectDto.*;
//import nexttech.domain.model.composite_primary_key_company.TeamProjectId;
//import nexttech.domain.model.entities.TeamProject;
//import nexttech.exceptions.CompanyException;
//import nexttech.exceptions.CompanyExceptionEnum;
//import nexttech.mapper.ITeamProjectMapper;
//import nexttech.repository.TeamProjectRepository;
//import nexttech.service.Interface.ITeamProjectService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//@AllArgsConstructor(onConstructor = @__(@Autowired))
//public class TeamProjectService implements ITeamProjectService {
//
//    private TeamProjectRepository teamProjectRepository;
//    private ITeamProjectMapper teamProjectMapper;
//
//
//    @Override
//    public AddTeamProjectResponseDto createTeamProject(AddTeamProjectRequestDto createTeamProjectRequestDTO) {
//        TeamProject teamProject = teamProjectMapper.addTeamProjectRequestDtoToTeamProject(createTeamProjectRequestDTO);
//        return teamProjectMapper.teamProjectToAddTeamProjectResponseDto(teamProjectRepository.save(teamProject));
//    }
//
//    @Override
//    public UpdateTeamProjectResponseDto updateTeamProject(TeamProjectId teamProjectId, UpdateTeamProjectRequestDto updateTeamProjectRequestDTO) {
//        TeamProject teamProjectToUpdate = teamProjectRepository.findById(teamProjectId).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.TEAM_PROJECT_ID_NOT_FOUND, List.of(teamProjectId.toString())));
//        return teamProjectMapper.teamProjectToUpdateTeamProjectResponseDto(teamProjectRepository.save(teamProjectToUpdate));
//    }
//
//    @Override
//    public void deleteTeamProject(TeamProjectId teamProjectId) {
//        TeamProject teamProject = teamProjectRepository.findById(teamProjectId).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.TEAM_PROJECT_ID_NOT_FOUND, List.of(teamProjectId.toString())));
//        teamProjectRepository.delete(teamProject);
//    }
//
//    @Override
//    public GetTeamProjectResponseDto getTeamProjectById(TeamProjectId teamProjectId) {
//        return null;
//    }
//}
