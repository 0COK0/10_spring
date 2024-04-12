package com.quest.section01.remix;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeController employeeController = new EmployeeController();

        do {
            System.out.println("======= 직원 정보 ==========");
            System.out.println("1. 직원 전체 조회");
            System.out.println("2. 직원 상세 조회");
            System.out.println("3. 직원 추가");
            System.out.println("4. 직원 정보 수정");
            System.out.println("5. 직원 탈퇴");
            System.out.println("9. 종료하기");
            System.out.print("입력할 메뉴를 선택해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1 : employeeController.selectAllMenu();break;
                case 2 : employeeController.selectSearchEmployee(inputEmployeeId());break;
                case 3 : employeeController.registEmployee(inputEmployee());break;
                case 4 : employeeController.modifyEmployee(inputModifyEmployee());break;
                case 5 : employeeController.deleteEmployee(inputEmployeeId());break;
                case 9 :
                    System.out.println("프로그램을 종료합니다.");return;
            }
        } while (true);
    }




    private static Map<String, String> inputEmployeeId() {

        Scanner sc = new Scanner(System.in);
        System.out.print("직원 코드를 입력하세요 : ");
        String empId = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empId", empId);

        return parameter;
    }

    private static Map<String, String> inputEmployee() {
        Scanner sc = new Scanner(System.in);
        System.out.print("추가할 사원명을 입력해주세요 : ");
        String empName = sc.nextLine();
        System.out.print("추가할 사원의 주민번호를 입력하세요 : ");
        String empNo = sc.nextLine();
        System.out.print("추가할 사원의 이메일을 입력해주세요 : ");
        String email = sc.nextLine();
        System.out.print("추가할 사원의 전화번호를 입력해주세요 : ");
        String phone = sc.nextLine();
        System.out.print("추가할 사원의 직급을 입력해주세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("추가할 사원의 급여 등급를 입력해주세요 : ");
        String salLevel = sc.nextLine();

        Map<String, String> parameter = new HashMap<>();
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);

        return parameter;
    }

    // Map<String, String> 유형의 맵을 반환
    private static Map<String, String> inputModifyEmployee() {
        // 사용자의 작성 입력값을 받기 위한 클래스
        Scanner sc = new Scanner(System.in); //(표준 입력 스트림)
        System.out.print("수정할 직원 코드을 입력해주세요 : ");
        // 입력한 문자열을 라인을 읽어 empId 변수에 저장
        String empId = sc.nextLine();
        System.out.print("수정할 직원 이름을 수정해주세요 : ");
        String empName = sc.nextLine();
        System.out.print("수정할 직원 주민번호를 수정해주세요 : ");
        String empNo = sc.nextLine();
        System.out.print("수정할 직원 이메일를 수정해주세요 : ");
        String email = sc.nextLine();
        System.out.print("수정할 직원 전화번호를 수정해주세요 : ");
        String phone = sc.nextLine();
        System.out.print("수정할 직원 부서 코드를 수정해주세요 : ");
        String deptCode = sc.nextLine();
        System.out.print("수정할 직원 직급 코드를 수정해주세요 : ");
        String jobCode = sc.nextLine();
        System.out.print("수정할 직원 급여 등급을 수정해주세요 : ");
        String salLevel = sc.nextLine();
        System.out.print("수정할 직원 급여를 수정해주세요 : ");
        String salary = sc.nextLine();
        System.out.print("수정할 직원 보너스를 수정해주세요 : ");
        String bonus = sc.nextLine();
        System.out.print("수정할 직원의 입사일을 수정해주세요 : ");
        String hireDate = sc.nextLine();
        System.out.print("수정할 직원의 퇴사일을 수정해주세요 : ");
        String entDate = sc.nextLine();
        System.out.print("수정할 퇴직 여부를 수정해주세요 : ");
        String entYn = sc.nextLine();

// HashMap클래스에 parameter라는 새로운 맵을 생성해 키와 값<String> 데이터 저장
        Map<String, String> parameter = new HashMap<>();
// parameter 맵에 "empId"키와 empId 값을 추가(변수는 직원의 ID) 저장하는 역할
        parameter.put("empId", empId);
        parameter.put("empName", empName);
        parameter.put("empNo", empNo);
        parameter.put("email", email);
        parameter.put("phone", phone);
        parameter.put("deptCode", deptCode);
        parameter.put("jobCode", jobCode);
        parameter.put("salLevel", salLevel);
        parameter.put("salary", salary);
        parameter.put("bonus", bonus);
        parameter.put("hireDate", hireDate);
        parameter.put("entDate", entDate);
        parameter.put("entYn", entYn);

        // 메서드나 함수가 맵을 생성 및 조작한 후
        // parameter 맵을 반환
        return parameter;


    }

}