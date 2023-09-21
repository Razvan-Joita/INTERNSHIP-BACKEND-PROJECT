package nexttech.mapper;

import nexttech.domain.dto.employeeDetailsDto.CreateEmployeeRequestDTO;
import nexttech.domain.dto.employeeDetailsDto.CreateEmployeeResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.GetEmployeeByIdResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.GetEmployeesResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.UpdateEmployeeResponseDTO;
import nexttech.domain.model.entities.EmployeeDetails;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface IEmployeeDetailsMapper {

    @Mapping(target = "employeeRoleTeamProjectPositions", expression = "java(new java.util.ArrayList<>())")
    EmployeeDetails requestEmployeeDTOToEmployee(CreateEmployeeRequestDTO createEmployeeRequestDTO);

    CreateEmployeeResponseDTO createEmployeeRequestDTOToEmployee(EmployeeDetails employeeDetails);

    GetEmployeeByIdResponseDTO employeeToResponseEmployeeDTO(EmployeeDetails employeeDetails);

    GetEmployeesResponseDTO employeesToResponseEmployeeDTO(EmployeeDetails employeeDetails);

    UpdateEmployeeResponseDTO updateEmployeeRequestDTOToEmployee(EmployeeDetails employeeDetails);

}
