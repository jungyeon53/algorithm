package 기본알고리즘.반복;

import java.util.Scanner;

public class Q13 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("변의 값 :");
        int n = scanner.nextInt();

        do{
            System.out.println("정사각형을 출력합니다.");
            System.out.println("변의 길이 :" + n);
            for (int i = 0; i < n; i++){
                for (int z = 0; z < n; z++){
                    System.out.print("*");
                }
                System.out.println();
            }

        }while(n <= 0);

        }
    }
