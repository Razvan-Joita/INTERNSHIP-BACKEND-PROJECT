package nexttech.controller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.AllArgsConstructor;
import nexttech.domain.dto.employeePositionDto.*;
import nexttech.domain.model.entities.EmployeePosition;
import nexttech.service.Interface.IEmployeePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/company/employeepositions")
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeePositionController {

    private IEmployeePositionService employeePositionService;

    @PostMapping
    @Operation(summary = "Create a new position for employees")
    public AddEmployeePositionResponseDto createEmployeePosition(@RequestBody AddEmployeePositionRequestDto createEmployeePositionRequestDTO) {
        return employeePositionService.createEmployeePosition(createEmployeePositionRequestDTO);
    }

    @PutMapping("{employeepositionID}")
    @Operation(summary = "Update employee position")
    public UpdateEmployeePositionResponseDto updateEmployeePosition(
            @PathVariable Integer employeepositionID,
            @RequestBody UpdateEmployeePositionRequestDto updateEmployeePositionRequestDTO
    ) {
        return employeePositionService.updateEmployeePosition(employeepositionID, updateEmployeePositionRequestDTO);
    }

    @DeleteMapping("{employeepositionID}")
    @Operation(summary = "Delete employee position")
    public void deleteEmployeePosition(@PathVariable Integer employeepositionID) {
        employeePositionService.deleteEmployeePosition(employeepositionID);
    }

    @GetMapping("{employeepositionID}")
    @Operation(summary = "Get employee position by id")
    public GetEmployeePositionResponseDto getRoleById(@PathVariable Integer employeepositionID) {
        return employeePositionService.getEmployeePositionById(employeepositionID);
    }
    @GetMapping("/search")
    @Operation(summary = "Get employee position by name")
    public List<EmployeePosition> getEmployeePositionsByName(@RequestParam("name") String name) {
        return employeePositionService.getEmployeePositionsByName(name);
    }

    @GetMapping
    @Operation(summary = "Get all employee positions")
    public List<EmployeePosition> getAllEmployeePositions() {
        return employeePositionService.getAllEmployeePositions();
    }



}
