package 기본알고리즘.반복;

import java.util.Scanner;

public class Q14 {



    public static void main(String[] args) {
        System.out.println("변을 입력하세요 n :");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        triangleRU(n);
    }

    // 직각이등변삼각형을 출력 , 왼쪽 아래가 직각
    static void triangleLB(int n){

        for(int j = 1; j <= n; j++){
            for (int i = 1; i <= n; i++){
                System.out.print("*");
            }
        }
        System.out.println();
    }

    // 왼쪽 위가 직각인 삼각형
    static void triangleLU(int n){
        for(int j = 1; j <= n; j++){
            for(int i = 1; i <= n - j + 1; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // 오른쪽 위가 직각인 삼각형
    static void triangleRU(int n){

        for(int j = 1; j <= n; j++){
            for(int i = 1; j <= n-i; i++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
