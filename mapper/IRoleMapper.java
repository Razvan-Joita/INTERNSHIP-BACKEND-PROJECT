package nexttech.mapper;

import nexttech.domain.dto.roleDto.AddRoleRequestDto;
import nexttech.domain.dto.roleDto.AddRoleResponseDto;
import nexttech.domain.dto.roleDto.GetRoleRequestDto;
import nexttech.domain.dto.roleDto.GetRoleResponseDto;
import nexttech.domain.dto.roleDto.UpdateRoleRequestDto;
import nexttech.domain.dto.roleDto.UpdateRoleResponseDto;
import nexttech.domain.model.entities.Role;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IRoleMapper {

    Role addRoleRequestDtoToRole(AddRoleRequestDto role);

    Role getRoleRequestDtoToRole(GetRoleRequestDto role);

    Role updateRoleRequestDtoToRole(UpdateRoleRequestDto role);

    AddRoleResponseDto roleToAddRoleResponseDto(Role role);

    GetRoleResponseDto roleToGetRoleResponseDto(Role role);

    UpdateRoleResponseDto roleToUpdateRoleResponseDto(Role role);

}
