package javaEx01;

import java.util.*;

public class JavaEx01 {
    public static void main(String[] args) {
        //콘솔 출력
        System.out.println("Hello, java!"); // 줄바꿈
        System.out.print("Enter your name : "); // 줄바꿈X

        // 콘솔 입력
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine(); //nextInt(), nextDouble()

        System.out.println("Welcome, " + name + "!");
        System.out.println();

        // 변수 : 데이터 저장하는 메모리 공간. 선언과 초기화
        // 데이터 타입
        // 정수형
        int age = 24;
        long population = 89000000000000L;

        // 실수형
        float weight = 70.5f;
        double height = 169.4;

        // 문자형
        char ch = '3';

        // 논리형
        boolean isStudent = true; // true or false

        // 출력 (나머지도 다 해보기)
        System.out.println("Age : " + age);
        System.out.println("population : " + population);
        System.out.println();

        // 명시적 형변환 (타입 캐스팅) : 큰 타입에서 작은 타입으로 수동 변환
        double pi = 3.24;
        int truncatedPi = (int) pi;

        System.out.println("pi : " + pi + ", truncatedPi : " + truncatedPi);
        System.out.println();

        // 연산자
        // 산술연산자 : +  -  *  /  %
        // 비교연산자 : ==  !=  <  >  <=  >=
        // 논리연산자 : &&  ||  !

        // 수를 입력받아 홀수인지, 짝수인지 판별하는 프로그램
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number : ");
        int num = scanner.nextInt();

        if(num % 2 == 0) {
            System.out.println(num + " is an even number");
        } else {
            System.out.println(num + " is an odd number");
        }

        if(num < 10) {
            System.out.println(num + "은 한 자리 숫자입니다.");
        } else if(num < 100) {
            System.out.println(num + "은 두 자리 숫자입니다.");
        } else if(num < 1000) {
            System.out.println(num + "은 세 자리 숫자입니다.");
        }

        // switch
        switch(num) { // switch문의 변수는 프리미티브 타입
            case 1: System.out.println("일");
            break;
            case 2: System.out.println("이");
            break;
            default:
                System.out.println("아무것도 아님");
                break;
        }

        // 반복문
        // for : 고정된 횟수만큼 반복할 때 사용
        // for(초기식; 조건식; 증감식) {}
        // while : 조건식이 true(참)인 경우 반복
        // do-while문 : 코드 블록을 먼저 실행하고, 조건식이 참이면 반복 실행

        /
    }
}
