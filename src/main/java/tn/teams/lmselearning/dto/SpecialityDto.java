package tn.teams.lmselearning.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.BeanUtils;
import tn.teams.lmselearning.entites.Speciality;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class SpecialityDto {
        private Long specialityId;
        private String specialityName;
        private String specialityAbbreviation;

        public static SpecialityDto fromEntity(Speciality entity) {

                SpecialityDto specialityDto =new SpecialityDto();
                BeanUtils.copyProperties(entity,specialityDto);
                return specialityDto;

        }

        public static Speciality toEntity(SpecialityDto dto) {

                Speciality speciality=new Speciality();
                BeanUtils.copyProperties(dto,speciality);
                return speciality;

        }

}
