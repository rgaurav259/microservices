package com.example.departmentservice.service;

import com.example.departmentservice.entity.Department;
import com.example.departmentservice.repository.DepartmentRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;


    public Department saveDepartment(Department department) {

        log.info("inside saveDepartment of departmentservice");
        return departmentRepository.save(department);

    }

    public Department findDepartmentById(Long departmentId) {
        log.info("inside findDepartmentById of departmentservice");

        return departmentRepository.findByDepartmentId(departmentId);


    }
}
