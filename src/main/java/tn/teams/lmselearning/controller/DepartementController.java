package tn.teams.lmselearning.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.teams.lmselearning.dto.DepartmentDto;
import tn.teams.lmselearning.services.DepartmentService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/department")
public class DepartementController {
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/create")
    public DepartmentDto create(@RequestBody DepartmentDto departmentDto) {
        return departmentService.save(departmentDto);
    }

    @GetMapping("/findById/{id}")
    public DepartmentDto findById(@PathVariable("id") Long id) {
        return departmentService.findById(id);
    }

    @GetMapping("/findAll")
    public List<DepartmentDto> findAll() {
        return departmentService.findAll();
    }

    @DeleteMapping("/remove/{id}")
    public void delete(@PathVariable("id") Long id) {
        departmentService.delete(id);
    }
}
