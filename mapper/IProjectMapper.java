package nexttech.mapper;

import nexttech.domain.dto.projectDto.AddProjectRequestDto;
import nexttech.domain.dto.projectDto.AddProjectResponseDto;
import nexttech.domain.dto.projectDto.GetProjectRequestDto;
import nexttech.domain.dto.projectDto.GetProjectResponseDto;
import nexttech.domain.dto.projectDto.UpdateProjectRequestDto;
import nexttech.domain.dto.projectDto.UpdateProjectResponseDto;
import nexttech.domain.model.entities.Project;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IProjectMapper {

    Project addProjectRequestDtoToProject(AddProjectRequestDto project);

    Project getProjectRequestDtoToProject(GetProjectRequestDto project);

    Project updateProjectRequestDtoToProject(UpdateProjectRequestDto project);

    AddProjectResponseDto projectToAddProjectResponseDto(Project project);

    GetProjectResponseDto projectToGetProjectResponseDto(Project project);

    UpdateProjectResponseDto projectToUpdateProjectResponseDto(Project project);

}
