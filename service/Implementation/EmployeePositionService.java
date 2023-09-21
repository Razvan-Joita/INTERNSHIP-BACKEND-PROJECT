package nexttech.service.Implementation;


import lombok.AllArgsConstructor;
import nexttech.domain.dto.employeePositionDto.*;
import nexttech.domain.model.entities.EmployeePosition;
import nexttech.exceptions.CompanyException;
import nexttech.exceptions.CompanyExceptionEnum;
import nexttech.mapper.IEmployeePositionMapper;
import nexttech.repository.EmployeePositionRepository;
import nexttech.service.Interface.IEmployeePositionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class EmployeePositionService implements IEmployeePositionService {

    private EmployeePositionRepository employeePositionRepository;
    private IEmployeePositionMapper employeePositionMapper;

    @Override
    public AddEmployeePositionResponseDto createEmployeePosition(AddEmployeePositionRequestDto createEmployeePositionRequestDTO) {
        EmployeePosition employeePosition = employeePositionMapper.addEmployeePositionRequestDtoToEmployeePosition(createEmployeePositionRequestDTO);
        return employeePositionMapper.employeePositionToAddEmployeePositionResponseDto(employeePositionRepository.save(employeePosition));

    }

    @Override
    public UpdateEmployeePositionResponseDto updateEmployeePosition(Integer employeepositionID, UpdateEmployeePositionRequestDto updateEmployeePositionRequestDTO) {
        EmployeePosition employeepositionToUpdate = employeePositionRepository.findById(employeepositionID).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.POSITION_ID_NOT_FOUND, List.of(employeepositionID.toString())));

        employeepositionToUpdate.setName(updateEmployeePositionRequestDTO.getName());
        employeepositionToUpdate.setDescription(updateEmployeePositionRequestDTO.getDescription());
        return employeePositionMapper.employeePositionToUpdateEmployeePositionResponseDto(employeePositionRepository.save(employeepositionToUpdate));
    }

    @Override
    public void deleteEmployeePosition(Integer employeepositionID) {
        EmployeePosition employeePosition = employeePositionRepository.findById(employeepositionID).orElseThrow(()->new CompanyException(CompanyExceptionEnum.POSITION_ID_NOT_FOUND,List.of(employeepositionID.toString())));
        employeePositionRepository.deleteById(employeePosition.getEmployeePositionId());

    }

    @Override
    public GetEmployeePositionResponseDto getEmployeePositionById(Integer employeepositionID) {
        EmployeePosition employeePosition= employeePositionRepository.findById(employeepositionID).orElseThrow(() -> new CompanyException(CompanyExceptionEnum.POSITION_ID_NOT_FOUND, List.of(employeepositionID.toString())));
        return employeePositionMapper.employeePositionToGetEmployeePositionResponseDto(employeePosition);
    }
    @Override
    public List<EmployeePosition> getEmployeePositionsByName(String name) {
        return employeePositionRepository.findByNameContaining(name);
    }

    @Override
    public List<EmployeePosition> getAllEmployeePositions() {
        return employeePositionRepository.findAll();
    }
}
