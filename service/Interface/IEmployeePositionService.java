package nexttech.service.Interface;

import nexttech.domain.dto.employeePositionDto.*;
import nexttech.domain.model.entities.EmployeePosition;
import nexttech.domain.model.entities.Role;

import java.util.List;

public interface IEmployeePositionService {
    AddEmployeePositionResponseDto createEmployeePosition(AddEmployeePositionRequestDto createEmployeePositionRequestDTO);

    UpdateEmployeePositionResponseDto updateEmployeePosition(Integer employeepositionID, UpdateEmployeePositionRequestDto updateEmployeePositionRequestDTO);

    void deleteEmployeePosition(Integer employeepositionID);

    GetEmployeePositionResponseDto getEmployeePositionById(Integer employeepositionID);
    List<EmployeePosition> getAllEmployeePositions();
    List<EmployeePosition> getEmployeePositionsByName(String name);

}
