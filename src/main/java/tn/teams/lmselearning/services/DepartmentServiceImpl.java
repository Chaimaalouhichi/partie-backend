package tn.teams.lmselearning.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.teams.lmselearning.Exception.EntityNotFoundException;
import tn.teams.lmselearning.Exception.ErrorCodes;
import tn.teams.lmselearning.Exception.InvalidOperationException;
import tn.teams.lmselearning.dto.DepartmentDto;
import tn.teams.lmselearning.entites.Department;
import tn.teams.lmselearning.repository.DepartmentRepository;
import tn.teams.lmselearning.validator.ObjectValidator;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DepartmentServiceImpl implements DepartmentService{

    private  DepartmentRepository departmentRepository;
    private ObjectValidator<DepartmentDto> objectValidator;
    @Override
    public DepartmentDto save(DepartmentDto departmentDto) {
        objectValidator.validate(departmentDto);
        return DepartmentDto.fromEntity(
                departmentRepository.save(DepartmentDto.toEntity(departmentDto))
        );
    }

    @Override
    public DepartmentDto findById(Long id) {
        if (id == null) {
            throw new InvalidOperationException("ID is NULL", ErrorCodes.DEPARTMENT_ID_IS_NULL);
        }
        return departmentRepository.findById(id).map(DepartmentDto :: fromEntity)
                .orElseThrow(() -> new EntityNotFoundException("No Department was found with the provided ID",ErrorCodes.DEPARTMENT_NOT_FOUND));
    }

    @Override
    public List<DepartmentDto> findAll() {
        return departmentRepository.findAll().stream().map(DepartmentDto :: fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        if (id == null) {
            throw new InvalidOperationException("ID is NULL", ErrorCodes.DEPARTMENT_ID_IS_NULL);
        }

        Department department = departmentRepository.findById(id).orElseThrow(()->new EntityNotFoundException(id+" not found",ErrorCodes.DEPARTMENT_NOT_FOUND));
        departmentRepository.deleteById(id);
    }
}
