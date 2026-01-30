package 기본알고리즘.반복;

import java.util.Scanner;

public class Q9 {

    public static void main(String[] args) {

        // 두 변수 a,b 에 정수를 입력하고 b-1 를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);

        int a;
        int b;

        do {
            System.out.println("a값 :");
            a = scanner.nextInt();
        } while (a <= 0 );

        do{
            System.out.println("b값 :");
            b = scanner.nextInt();
            
            if(b < a){
                System.out.println("a보다 큰 값을 입력하세요");
            }
            
        } while (b < a);

        System.out.println("b - a 는 " + (b-a));
    }
}
