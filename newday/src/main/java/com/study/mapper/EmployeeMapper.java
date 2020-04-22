package com.study.mapper;

import com.study.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface EmployeeMapper {

    List<Employee> getAllEmp();

    void addEmp(Employee employee);

    Employee findById(@Param("id") Integer id);

    void updateEmp(Employee employee);


    void deleteEmp(@Param("id") Integer id);
}
