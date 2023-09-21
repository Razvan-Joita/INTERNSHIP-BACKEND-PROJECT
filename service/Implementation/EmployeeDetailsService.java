package nexttech.service.Implementation;

import lombok.AllArgsConstructor;
import nexttech.domain.dto.employeeDetailsDto.*;
import nexttech.domain.model.entities.EmployeeDetails;
import nexttech.exceptions.CompanyException;
import nexttech.exceptions.CompanyExceptionEnum;
import nexttech.mapper.IEmployeeDetailsMapper;

import nexttech.repository.EmployeeDetailsRepository;
import nexttech.service.Interface.IEmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeDetailsService implements IEmployeeDetailsService {
    private EmployeeDetailsRepository employeeDetailsRepository;
    private IEmployeeDetailsMapper mapperEmployeeDetails;

    @Override
    public CreateEmployeeResponseDTO createEmployee(CreateEmployeeRequestDTO createEmployeeRequestDTO) {
        EmployeeDetails employeeDetails = mapperEmployeeDetails.requestEmployeeDTOToEmployee(createEmployeeRequestDTO);
        return mapperEmployeeDetails.createEmployeeRequestDTOToEmployee(employeeDetailsRepository.save(employeeDetails));
    }

    @Override
    public UpdateEmployeeResponseDTO updateEmployee(Integer employeeDetailsId, UpdateEmployeeRequestDTO updateEmployeeRequestDTO) {
        EmployeeDetails employeeToUpdate = employeeDetailsRepository.findById(employeeDetailsId).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.USER_ID_NOT_FOUND, List.of(employeeDetailsId.toString())));

        employeeToUpdate.setFirstName(updateEmployeeRequestDTO.getFirstName());
        employeeToUpdate.setLastName(updateEmployeeRequestDTO.getLastName());
        employeeToUpdate.setWorkEmail(updateEmployeeRequestDTO.getWorkEmail());
        employeeToUpdate.setAuthRole(updateEmployeeRequestDTO.getAuthRole());
        return mapperEmployeeDetails.updateEmployeeRequestDTOToEmployee(employeeDetailsRepository.save(employeeToUpdate));
    }

    @Override
    public void deleteEmployee(Integer employeeDetailsId) {
        EmployeeDetails employeeDetails = employeeDetailsRepository.findById(employeeDetailsId).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.USER_ID_NOT_FOUND, List.of(employeeDetailsId.toString())));
        employeeDetailsRepository.deleteById(employeeDetails.getEmployeeDetailsId());
    }

    @Override
    public GetEmployeeByIdResponseDTO getEmployeeById(Integer employeeDetailsId) {
        EmployeeDetails employeeDetails = employeeDetailsRepository.findById(employeeDetailsId).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.USER_ID_NOT_FOUND, List.of(employeeDetailsId.toString())));
        return mapperEmployeeDetails.employeeToResponseEmployeeDTO(employeeDetails);
    }

    @Override
    public List<GetEmployeesResponseDTO> getEmployees(String searchTerm,Integer teamId, String name, Integer page, Integer size) {
        List<EmployeeDetails> filteredEmployees = employeeDetailsRepository.findAllByTeamIdAndEmployeePositionName(searchTerm,teamId, name, page, size);
        return filteredEmployees.stream().map(mapperEmployeeDetails::employeesToResponseEmployeeDTO).collect(Collectors.toList());
    }
}