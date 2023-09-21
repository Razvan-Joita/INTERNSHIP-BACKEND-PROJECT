package nexttech.service.Interface;


import nexttech.domain.dto.roleDto.*;
import nexttech.domain.model.entities.Role;

import java.util.List;

public interface IRoleService {
    AddRoleResponseDto createRole(AddRoleRequestDto createRoleRequestDTO);

    UpdateRoleResponseDto updateRole(Integer roleID, UpdateRoleRequestDto updateRoleRequestDTO);

    void deleteRole(Integer roleID);

    GetRoleResponseDto getRoleById(Integer roleID);
    List<Role> getAllRoles();

    List<Role> getAllRolesSorted(String sortOrder);

}
