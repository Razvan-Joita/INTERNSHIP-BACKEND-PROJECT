//package nexttech.controller;
//
//
//import lombok.AllArgsConstructor;
//import nexttech.domain.dto.teamProjectDto.*;
//import nexttech.domain.model.composite_primary_key_company.TeamProjectId;
//import nexttech.service.Interface.ITeamProjectService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequestMapping("/api/company/teamprojects")
//@AllArgsConstructor(onConstructor = @__(@Autowired))
//public class TeamProjectController {
//
//    private ITeamProjectService teamProjectService;
//
//    @GetMapping("/test")
//    public void doSomething(){
//        System.out.println("TEST");
//    }
//
//    @PostMapping
//    public ResponseEntity<AddTeamProjectResponseDto> createTeamProject(
//            @RequestBody AddTeamProjectRequestDto createTeamProjectRequestDTO
//    ) {
//        AddTeamProjectResponseDto responseDto = teamProjectService.createTeamProject(createTeamProjectRequestDTO);
//        return new ResponseEntity<>(responseDto, HttpStatus.CREATED);
//    }
//
//
//    @PutMapping("/teamproject/{teamprojectID}")
//    public UpdateTeamProjectResponseDto updateTeamProject(
//            @PathVariable TeamProjectId teamProjectId,
//            @RequestBody UpdateTeamProjectRequestDto updateTeamProjectRequestDTO
//    ) {
//        return teamProjectService.updateTeamProject(teamProjectId, updateTeamProjectRequestDTO);
//    }
//
//    @DeleteMapping("/teamproject/{teamId}/{projectId}")
//    public void deleteTeamProject(@PathVariable Integer teamId, @PathVariable Integer projectId) {
//        TeamProjectId teamProjectId = new TeamProjectId(teamId, projectId);
//        teamProjectService.deleteTeamProject(teamProjectId);
//    }
//
//    @GetMapping("/teamproject/{teamprojectID}")
//    public GetTeamProjectResponseDto getTeamProjectById(@PathVariable TeamProjectId teamProjectId) {
//        return teamProjectService.getTeamProjectById(teamProjectId);
//    }
//
//}
//
