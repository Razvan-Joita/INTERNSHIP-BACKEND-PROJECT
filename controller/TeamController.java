package nexttech.controller;

import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import nexttech.domain.dto.teamDto.*;
import nexttech.domain.model.entities.Team;
import nexttech.service.Interface.ITeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/api/company/teams")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TeamController {

    private ITeamService teamService;

    @PostMapping
    @Operation(summary = "Create team")
    public AddTeamResponseDto createTeam(@RequestBody AddTeamRequestDto createTeamRequestDTO) {
        return teamService.createTeam(createTeamRequestDTO);
    }

    @PutMapping("{teamID}")
    @Operation(summary = "Update team")
    public UpdateTeamResponseDto updateTeam(
            @PathVariable Integer teamID,
            @RequestBody UpdateTeamRequestDto updateTeamRequestDTO
    ) {
        return teamService.updateTeam(teamID, updateTeamRequestDTO);
    }

    @DeleteMapping("{teamID}")
    @Operation(summary = "Delete team")
    public void deleteTeam(@PathVariable Integer teamID) {
        teamService.deleteTeam(teamID);
    }

    @GetMapping("{teamID}")
    @Operation(summary = "Get team by id")
    public GetTeamResponseDto getTeamById(@PathVariable Integer teamID) {
        return teamService.getTeamById(teamID);
    }

    @GetMapping
    @Operation(summary = "Get all teams")
    public List<Team> getAllRoles() {
        return teamService.getAllTeam();
    }
    @GetMapping("/search")
    @Operation(summary = "Get team by name")
    public List<Team> getTeamsByName(@RequestParam("name") String name) {
        return teamService.getTeamsByName(name);
    }


}
