package com.study.service;

import com.study.mapper.EmployeeMapper;
import com.study.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    EmployeeMapper employeeMapper;

    public List<Employee> getAllEmp(){
        return employeeMapper.getAllEmp();
    }

    public void addEmp(Employee employee){
        employeeMapper.addEmp(employee);
    }

    public Employee findById(Integer id){
       return employeeMapper.findById(id);
    }

    public void updateEmp(Employee employee){
        employeeMapper.updateEmp(employee);
    }

    public void deleteEmp(Integer id){
        employeeMapper.deleteEmp(id);
    }
}
