package com.quest.section01.remix;

import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;


public class EmployeeController {

    private final EmployeeService employeeService;
    private final PrintResult printResult;

    public EmployeeController() {

        printResult = new PrintResult();
        employeeService = new EmployeeService();
    }

    public void selectAllMenu() {

        List<EmployeeDTO> employeeList = employeeService.selectAllMenu();

        if(employeeList != null) {
            printResult.printEmployeeList(employeeList);

        } else {
            printResult.printErrorMessage("selectList");
        }

    }

    public void selectSearchEmployee(Map<String, String> parameter) {
        int empId = parseInt(parameter.get("empId"));

        EmployeeDTO employee = employeeService.selectSearchEmployee(empId);

        if (employee != null) {
            printResult.printEmployee(employee);
        } else {
            printResult.printErrorMessage("selectOne");
        }
    }

    public void registEmployee(Map<String, String> parameter) {
        String empName = parameter.get("empName");
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");

        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmpName(empName);
        employee.setEmpNo(empNo);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setJobCode(jobCode);
        employee.setSalLevel(salLevel);

        if (employeeService.registEmployee(employee)) {
            printResult.printSuccessMessage("insert");
        } else {
            printResult.printErrorMessage("insert");
        }
    }

    public void modifyEmployee(Map<String, String> parameter) {
        int empId = Integer.parseInt(parameter.get("empId"));
        String empNo = parameter.get("empNo");
        String email = parameter.get("email");
        String phone = parameter.get("phone");
        String jobCode = parameter.get("jobCode");
        String salLevel = parameter.get("salLevel");
        String salary = parameter.get("salary");
        String bonus = parameter.get("bonus");
        String managerId = parameter.get("managerId");
        String hireDate = parameter.get("hireDate");
        String entDate = parameter.get("entDate");
        String entYn = parameter.get("entYn");

        // EmployeeDTO 객체 생성
        EmployeeDTO employee = new EmployeeDTO();

        employee.setEmpId(empId);
        employee.setEmpNo(empNo);
        employee.setEmail(email);
        employee.setPhone(phone);
        employee.setJobCode(jobCode);
        employee.setSalLevel(salLevel);
        employee.setSalary(salary);
        employee.setBonus(bonus);
        employee.setManagerId(managerId);
        employee.setHireDate(hireDate);
        employee.setEntDate(entDate);
        employee.setEntYn(entYn);


        if (employeeService.modifyEmployee(employee)) {
            printResult.printSuccessMessage("update");
        } else {
            printResult.printErrorMessage("update");
        }
    }

    public void deleteEmployee(Map<String, String> parameter) {
        int empId = Integer.parseInt(parameter.get("empId"));

        // DTO 클래스에 인스턴스 생성 후 변수 할당한 뒤 new 객체를 만듬
        EmployeeDTO employee = new EmployeeDTO();
        employee.setEmpId(empId);

        if (employeeService.deleteEmployee(employee)) {
            printResult.printSuccessMessage("delete");
        } else {
            printResult.printErrorMessage("delete");
        }






    }
}
