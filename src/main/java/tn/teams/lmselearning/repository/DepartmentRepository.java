package tn.teams.lmselearning.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.teams.lmselearning.entites.Department;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
