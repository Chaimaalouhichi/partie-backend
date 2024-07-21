package tn.teams.lmselearning.services;

import tn.teams.lmselearning.dto.DepartmentDto;
import tn.teams.lmselearning.dto.SpecialityDto;

import java.util.List;

public interface SpecialityService {
    SpecialityDto save(SpecialityDto specialityDto);

    SpecialityDto findById(Long id);

    List<SpecialityDto> findAll();


    void delete(Long id);
}
