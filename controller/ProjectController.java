package nexttech.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import nexttech.domain.dto.projectDto.*;
import nexttech.domain.model.entities.Project;
import nexttech.service.Interface.IProjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company/projects")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProjectController {

    private IProjectService projectService;

    @PostMapping
    @Operation(summary = "Create new project")
    public AddProjectResponseDto createProject(@RequestBody AddProjectRequestDto createProjectRequestDTO) {
        return projectService.createProject(createProjectRequestDTO);
    }

    @PutMapping("{projectID}")
    @Operation(summary = "Update project")
    public UpdateProjectResponseDto updateProject(
            @PathVariable Integer projectID,
            @RequestBody UpdateProjectRequestDto updateProjectRequestDTO
    ) {
        return projectService.updateProject(projectID, updateProjectRequestDTO);
    }

    @DeleteMapping("{projectID}")
    @Operation(summary = "Delete project by id")
    public void deleteProject(@PathVariable Integer projectID) {
        projectService.deleteProject(projectID);
    }

    @GetMapping("{projectID}")
    @Operation(summary = "Get project by id")
    public GetProjectResponseDto getProjectById(@PathVariable Integer projectID) {
        return projectService.getProjectById(projectID);
    }
    @GetMapping
    @Operation(summary = "Get all projects")
    public List<Project> getAllProjects() {
        return projectService.getAllProjects();
    }

}
