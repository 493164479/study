package com.study.controller;

import com.study.pojo.Employee;
import com.study.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class EmployeeController {


    @Autowired
    EmployeeService employeeService;

    @GetMapping("/show")
    public String showEmp(Model model){
        List<Employee> allEmp = employeeService.getAllEmp();
        model.addAttribute("emps",allEmp);
        return "list";
    }

    @GetMapping("/addemp")
    public String addEmp(){
        return "add";
    }

    @PostMapping("/addemp")
    public String addEmp(Employee employee){
        employeeService.addEmp(employee);
        return "redirect:/show";
    }

    @GetMapping("/updateuser/{id}")
    public String updateEmp(@PathVariable("id") Integer id,Model model){

        Employee emp = employeeService.findById(id);
        model.addAttribute("emp",emp);
        return "update";
    }

    @PostMapping("/updateEmp/{id}")
    public String updateEmp(@PathVariable("id") Integer id, Employee employee){
        employee.setId(id);
        employeeService.updateEmp(employee);
        return "redirect:/show";
    }

    @GetMapping("/deleteemp/{id}")
    public String deleteEmp(@PathVariable("id") Integer id){
        employeeService.deleteEmp(id);
        return "redirect:/show";
    }

    @GetMapping("/signout")
    public String signout(HttpSession session){
        session.removeAttribute("login");
        session.invalidate();
        return "index";
    }

}
