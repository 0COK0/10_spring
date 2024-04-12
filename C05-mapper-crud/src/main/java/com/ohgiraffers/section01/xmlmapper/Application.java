package com.ohgiraffers.section01.xmlmapper;

import com.ohgiraffers.common.SearchCriteria;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Application {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        do {
            System.out.println("========== 아이돌 그룹 ============");
            System.out.println("1. 아이돌 그룹 관련 ");
            System.out.print("메뉴 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: idolResultMapSubMenu();break;
            }
        } while (true);
    }

    private static void idolResultMapSubMenu() {

        Scanner sc = new Scanner(System.in);
        //아이돌 서비스쪽으로 보내주겠다.
        IdolService idolService = new IdolService();

        do {
            System.out.println("=========아이돌 그룹 서브 메뉴==========");
            System.out.println("1. 아이돌 그룹 전체 조회");
            System.out.println("2. 아이돌 그룹 상세 조회");
            System.out.println("3. 신규 아이돌 그룹 추가");
            System.out.println("4. 아이돌 그룹 수정");
            System.out.println("5. 아이돌 그룹 삭제");
            System.out.print("메뉴 번호를 입력해주세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: idolService.selectResultAllMap();break;
                case 2: chooseSubIdol();break;
                case 9:
                default:
                    System.out.println("그런 선택지는 없습니다 다시 선택해주세요.");return;
            }
        } while (true);
    }

    private static void chooseSubIdol() {
        Scanner sc = new Scanner(System.in);
        IdolService idolService = new IdolService();

        do {
            System.out.println("===== 아이돌 그룹 상세 조회 ======");
            System.out.println("1. 검색하실 카테고리를 선택해주세요(그룹명, 팬덤명)");
            System.out.println("9. 이전 메뉴로");
            System.out.print("메뉴 번호를 입력하세요 : ");
            int no = sc.nextInt();

            switch (no) {
                case 1: idolService.searchIdolBySuqGroup(inputIdolName());
                case 9:
                    return;

            }

        } while (true);
    }

    private static SearchCriteria inputIdolName() {

        Scanner sc = new Scanner(System.in);
        System.out.print("1. 검색하실 카테고리를 선택해주세요(그룹명, 팬덤명) : ");
        String value = sc.nextLine();

        return new SearchCriteria("GroupCode", value);
    }
}


