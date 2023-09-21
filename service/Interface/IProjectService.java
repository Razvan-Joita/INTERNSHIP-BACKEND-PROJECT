package nexttech.service.Interface;

import nexttech.domain.dto.projectDto.*;
import nexttech.domain.model.entities.Project;

import java.util.List;

public interface IProjectService{
    AddProjectResponseDto createProject(AddProjectRequestDto createProjectRequestDTO);

    UpdateProjectResponseDto updateProject(Integer projectID, UpdateProjectRequestDto updateProjectRequestDTO);

    void deleteProject(Integer projectID);

    GetProjectResponseDto getProjectById(Integer projectID);

    List<Project> getAllProjects();


}
