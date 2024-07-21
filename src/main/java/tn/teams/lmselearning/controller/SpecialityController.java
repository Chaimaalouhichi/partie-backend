package tn.teams.lmselearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.teams.lmselearning.dto.SpecialityDto;
import tn.teams.lmselearning.services.SpecialityService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/speciality")
public class SpecialityController {
    @Autowired
    private SpecialityService specialityService;

    @PostMapping("/create")
    public SpecialityDto create(@RequestBody SpecialityDto specialityDto) {
        return specialityService.save(specialityDto);
    }

    @GetMapping("/findById/{id}")
    public SpecialityDto findById(@PathVariable("id") Long id) {
        return specialityService.findById(id);
    }

    @GetMapping("/findAll")
    public List<SpecialityDto> findAll() {
        return specialityService.findAll();
    }

    @DeleteMapping("/remove/{id}")
    public void delete(@PathVariable("id") Long id) {
        specialityService.delete(id);
    }
}
