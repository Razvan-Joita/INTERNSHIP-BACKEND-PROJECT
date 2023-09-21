package nexttech.controller;

import io.swagger.v3.oas.annotations.Operation;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import nexttech.domain.dto.employeeDetailsDto.CreateEmployeeRequestDTO;
import nexttech.domain.dto.employeeDetailsDto.CreateEmployeeResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.GetEmployeeByIdResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.GetEmployeesResponseDTO;
import nexttech.domain.dto.employeeDetailsDto.UpdateEmployeeRequestDTO;
import nexttech.domain.dto.employeeDetailsDto.UpdateEmployeeResponseDTO;
import nexttech.service.Interface.IEmployeeDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeeDetailsController {
    private IEmployeeDetailsService employeeDetailsService;

    @PostMapping("/employees")
    @Operation(summary = "Create a new employee")
    public CreateEmployeeResponseDTO createEmployee(@RequestBody CreateEmployeeRequestDTO createEmployeeRequestDTO) {
        return employeeDetailsService.createEmployee(createEmployeeRequestDTO);
    }

    @PutMapping("/employees/{employeeDetailsId}")
    @Operation(summary = "Update employee details")
    public UpdateEmployeeResponseDTO updateEmployee(
            @PathVariable Integer employeeDetailsId,
            @RequestBody UpdateEmployeeRequestDTO updateEmployeeRequestDTO
    ) {
        return employeeDetailsService.updateEmployee(employeeDetailsId, updateEmployeeRequestDTO);
    }

    @DeleteMapping("/employees/{employeeDetailsId}")
    @Operation(summary = "Delete employee by id")
    public void deleteEmployee(@PathVariable Integer employeeDetailsId) {
        employeeDetailsService.deleteEmployee(employeeDetailsId);
    }

    @GetMapping("/employees/{employeeDetailsId}")
    @Operation(summary = "Get employee by id")
    public GetEmployeeByIdResponseDTO getEmployeeById(@PathVariable Integer employeeDetailsId) {
        return employeeDetailsService.getEmployeeById(employeeDetailsId);
    }

    @GetMapping("/employees")
    @Operation(summary = "Get all pageable employees response filtered by name/team/position ")
    public List<GetEmployeesResponseDTO> getEmployees(@Valid @RequestParam(value = "searchTerm", required = false) String searchTerm,
                                                      @Valid @RequestParam(value = "teamId", required = false) Integer teamId,
                                                      @Valid @RequestParam(value = "name", required = false) String positionName,
                                                      @Valid @RequestParam(value = "page", required = false, defaultValue = "0") Integer page,
                                                      @Valid @RequestParam(value = "size", required = false, defaultValue = "30") Integer size) {
        return employeeDetailsService.getEmployees(searchTerm,teamId, positionName, page, size);
    }
}
