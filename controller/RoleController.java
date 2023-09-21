package nexttech.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import nexttech.domain.dto.roleDto.*;
import nexttech.domain.model.entities.Role;
import nexttech.service.Interface.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company/roles")
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RoleController {

    private IRoleService roleService;

    @PostMapping
    @Operation(summary = "Create new role")
    public AddRoleResponseDto createRole(@RequestBody AddRoleRequestDto createRoleRequestDTO) {
        return roleService.createRole(createRoleRequestDTO);
    }

    @PutMapping("{roleID}")
    @Operation(summary = "Update role")
    public UpdateRoleResponseDto updateRole(
            @PathVariable Integer roleID,
            @RequestBody UpdateRoleRequestDto updateRoleRequestDTO
    ) {
        return roleService.updateRole(roleID, updateRoleRequestDTO);
    }

    @DeleteMapping("{roleID}")
    @Operation(summary = "Delete role")
    public void deleteRole(@PathVariable Integer roleID) {
        roleService.deleteRole(roleID);
    }

    @GetMapping("{roleID}")
    @Operation(summary = "Get role by id")
    public GetRoleResponseDto getRoleById(@PathVariable Integer roleID) {
        return roleService.getRoleById(roleID);
    }

    @GetMapping
    @Operation(summary = "Get all roles")
    public List<Role> getAllRoles() {
        return roleService.getAllRoles();
    }
    @GetMapping("/sorted")
    @Operation(summary = "Get roles sorted")
    public List<Role> getAllRolesSorted(
            @RequestParam(name = "sortOrder", defaultValue = "ASC") String sortOrder) {
        return roleService.getAllRolesSorted(sortOrder);
    }

}
