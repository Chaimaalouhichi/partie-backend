package tn.teams.lmselearning.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import tn.teams.lmselearning.entites.Department;
import tn.teams.lmselearning.entites.Speciality;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class DepartmentDto {

    private Long departmentId;

    private String departmentName;

    private String departmentAbbreviation;

    public static DepartmentDto fromEntity(Department entity) {

        DepartmentDto departmentDto =new DepartmentDto();
        BeanUtils.copyProperties(entity,departmentDto);
        return departmentDto;

    }

    public static Department toEntity(DepartmentDto dto) {

        Department department=new Department();
        BeanUtils.copyProperties(dto,department);
        return department;

    }
}
