package nexttech.service.Implementation;

import lombok.AllArgsConstructor;
import nexttech.domain.dto.projectDto.*;
import nexttech.domain.model.entities.Project;
import nexttech.exceptions.CompanyException;
import nexttech.exceptions.CompanyExceptionEnum;
import nexttech.mapper.IProjectMapper;
import nexttech.repository.ProjectRepository;
import nexttech.service.Interface.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProjectService implements IProjectService {
    private ProjectRepository projectRepository;
    private IProjectMapper projectMapper;

    @Override
    public AddProjectResponseDto createProject(AddProjectRequestDto createProjectRequestDTO) {
        Project project = projectMapper.addProjectRequestDtoToProject(createProjectRequestDTO);
        return projectMapper.projectToAddProjectResponseDto(projectRepository.save(project));

    }

    @Override
    public UpdateProjectResponseDto updateProject(Integer projectID, UpdateProjectRequestDto updateProjectRequestDTO) {
        Project projectToUpdate = projectRepository.findById(projectID).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.PROJECT_ID_NOT_FOUND, List.of(projectID.toString())));

        projectToUpdate.setName(updateProjectRequestDTO.getName());
        projectToUpdate.setDescription(updateProjectRequestDTO.getDescription());
        return projectMapper.projectToUpdateProjectResponseDto(projectRepository.save(projectToUpdate));
    }

    @Override
    public void deleteProject(Integer projectID) {
        Project project = projectRepository.findById(projectID).orElseThrow(()->new CompanyException(CompanyExceptionEnum.TEAM_ID_NOT_FOUND,List.of(projectID.toString())));
        projectRepository.deleteById(project.getProjectId());

    }

    @Override
    public GetProjectResponseDto getProjectById(Integer projectID) {

        Project project= projectRepository.findById(projectID).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.PROJECT_ID_NOT_FOUND, List.of(projectID.toString())));
        return projectMapper.projectToGetProjectResponseDto(project);
    }

    @Override
    public List<Project> getAllProjects() {
        return projectRepository.findAll();
    }

}
