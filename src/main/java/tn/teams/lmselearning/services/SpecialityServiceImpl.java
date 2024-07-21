package tn.teams.lmselearning.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.teams.lmselearning.Exception.EntityNotFoundException;
import tn.teams.lmselearning.Exception.ErrorCodes;
import tn.teams.lmselearning.Exception.InvalidOperationException;
import tn.teams.lmselearning.dto.SpecialityDto;
import tn.teams.lmselearning.repository.SpecialityRepository;
import tn.teams.lmselearning.validator.ObjectValidator;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SpecialityServiceImpl implements SpecialityService {
    private SpecialityRepository specialityRepository;
    private ObjectValidator<SpecialityDto> objectValidator;
    @Override
    public SpecialityDto save(SpecialityDto specialityDto) {
        objectValidator.validate(specialityDto);
        return SpecialityDto.fromEntity(specialityRepository.save(SpecialityDto.toEntity(specialityDto)));
    }

    @Override
    public SpecialityDto findById(Long id) {
        if (id == null) {
            throw new InvalidOperationException("ID is NULL", ErrorCodes.SPECIALITY_ID_IS_NULL);
        }
        return specialityRepository.findById(id).map(SpecialityDto :: fromEntity)
                .orElseThrow(() -> new EntityNotFoundException("No Speciality was found with the provided ID",ErrorCodes.SPECIALITY_NOT_FOUND));
    }

    @Override
    public List<SpecialityDto> findAll() {
        return specialityRepository.findAll().stream().map(SpecialityDto :: fromEntity).collect(Collectors.toList());
    }

    @Override
    public void delete(Long id) {
        specialityRepository.findById(id).orElseThrow(()->new EntityNotFoundException(id+" not found",ErrorCodes.SPECIALITY_NOT_FOUND));
        specialityRepository.deleteById(id);

    }
}
