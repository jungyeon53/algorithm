package 기본알고리즘.반복;

import java.util.Scanner;

public class Q10 {

    public static void main(String[] args) {
        // 양의정수를 입력하고 자릿수를 출력하는 프로그램
        Scanner scanner = new Scanner(System.in);
        int a;

        do{
            int count = 0;
            System.out.println("정수를 입력하세요");
            a = scanner.nextInt();
            int n = a;
//            System.out.println("a의 자릿수는 " + String.valueOf(a).length());

            while (true){
                if(n == 0) break;
                n /= 10;
                count++;
            }
            System.out.println(count);
        }while(a > 0);
    }

}
