package tn.teams.lmselearning.services;

import tn.teams.lmselearning.dto.DepartmentDto;

import java.util.List;

public interface DepartmentService {
    DepartmentDto save(DepartmentDto departmentDto);

    DepartmentDto findById(Long id);

    List<DepartmentDto> findAll();


    void delete(Long id);

}
