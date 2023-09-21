package nexttech.service.Interface;

import nexttech.domain.dto.employeeDetailsDto.CreateEmployeeRequestDTO;
import nexttech.domain.dto.employeeDetailsDto.CreateEmployeeResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.GetEmployeeByIdResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.GetEmployeesResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.UpdateEmployeeRequestDTO;
import nexttech.domain.dto.employeeDetailsDto.UpdateEmployeeResponseDTO;

import java.util.List;

public interface IEmployeeDetailsService {
    CreateEmployeeResponseDTO createEmployee(CreateEmployeeRequestDTO createEmployeeRequestDTO);

    UpdateEmployeeResponseDTO updateEmployee(Integer employeeDetailsId, UpdateEmployeeRequestDTO updateEmployeeRequestDTO);

    void deleteEmployee(Integer employeeDetailsId);

    GetEmployeeByIdResponseDTO getEmployeeById(Integer employeeDetailsId);

    List<GetEmployeesResponseDTO>  getEmployees(String searchTerm,Integer teamId, String name, Integer page, Integer size);
}
