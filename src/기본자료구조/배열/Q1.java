package 기본자료구조.배열;

import java.util.Random;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // 사람 수와 키 난수로 생성 후 출력
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int num = 1 + random.nextInt(10);
        int[] height = new int[num];

        System.out.println("키의 값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {
            height[i] = 100 + random.nextInt(90);
            System.out.println("heignt[" + i + "]:" + height[i]);
        }
        System.out.println("최댓값은 :" + maxOf(height) + "입니다.");
    }

    static int maxOf(int[] a){
        int max = a[0];
        for (int i = 1; i <a.length; i++) {
            if(a[i] > max){
                max = a[i];
            }
        }
        return max;
    }

}
