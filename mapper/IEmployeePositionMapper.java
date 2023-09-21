package nexttech.mapper;

import nexttech.domain.dto.employeePositionDto.AddEmployeePositionRequestDto;
import nexttech.domain.dto.employeePositionDto.AddEmployeePositionResponseDto;
import nexttech.domain.dto.employeePositionDto.GetEmployeePositionRequestDto;
import nexttech.domain.dto.employeePositionDto.GetEmployeePositionResponseDto;
import nexttech.domain.dto.employeePositionDto.UpdateEmployeePositionRequestDto;
import nexttech.domain.dto.employeePositionDto.UpdateEmployeePositionResponseDto;
import nexttech.domain.model.entities.EmployeePosition;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IEmployeePositionMapper {

    EmployeePosition addEmployeePositionRequestDtoToEmployeePosition(AddEmployeePositionRequestDto employeePosition);

    EmployeePosition getEmployeePositionRequestDtoToEmployeePosition(GetEmployeePositionRequestDto employeePosition);

    EmployeePosition updateEmployeePositionRequestDtoToEmployeePosition(UpdateEmployeePositionRequestDto employeePosition);

    AddEmployeePositionResponseDto employeePositionToAddEmployeePositionResponseDto(EmployeePosition employeePosition);

    GetEmployeePositionResponseDto employeePositionToGetEmployeePositionResponseDto(EmployeePosition employeePosition);

    UpdateEmployeePositionResponseDto employeePositionToUpdateEmployeePositionResponseDto(EmployeePosition employeePosition);

}
