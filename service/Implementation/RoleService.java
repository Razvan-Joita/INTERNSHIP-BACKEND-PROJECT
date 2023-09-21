package nexttech.service.Implementation;

import lombok.AllArgsConstructor;
import nexttech.domain.dto.roleDto.*;
import nexttech.domain.model.entities.Role;
import nexttech.exceptions.CompanyException;
import nexttech.exceptions.CompanyExceptionEnum;
import nexttech.mapper.IRoleMapper;
import nexttech.repository.RoleRepository;
import nexttech.service.Interface.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class RoleService implements IRoleService {
    private RoleRepository roleRepository;
    private IRoleMapper roleMapper;

    @Override
    public AddRoleResponseDto createRole(AddRoleRequestDto createRoleRequestDTO) {
        Role role = roleMapper.addRoleRequestDtoToRole(createRoleRequestDTO);
        return roleMapper.roleToAddRoleResponseDto(roleRepository.save(role));

        }

    @Override
    public UpdateRoleResponseDto updateRole(Integer roleID, UpdateRoleRequestDto updateRoleRequestDTO) {
        Role roleToUpdate = roleRepository.findById(roleID).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.ROLE_ID_NOT_FOUND, List.of(roleID.toString())));

        roleToUpdate.setName(updateRoleRequestDTO.getName());
        roleToUpdate.setDescription(updateRoleRequestDTO.getDescription());
        return roleMapper.roleToUpdateRoleResponseDto(roleRepository.save(roleToUpdate));
    }

    @Override
    public void deleteRole(Integer roleID) {
     Role role = roleRepository.findById(roleID).orElseThrow(()->new CompanyException(CompanyExceptionEnum.ROLE_ID_NOT_FOUND,List.of(roleID.toString())));
        roleRepository.deleteById(role.getRoleId());

    }

    @Override
    public GetRoleResponseDto getRoleById(Integer roleID) {

        Role role= roleRepository.findById(roleID).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.ROLE_ID_NOT_FOUND, List.of(roleID.toString())));
        return roleMapper.roleToGetRoleResponseDto(role);
    }

    @Override
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    @Override
    public List<Role> getAllRolesSorted(String sortOrder) {
        return roleRepository.findAllByOrderByName(sortOrder);
    }



}
