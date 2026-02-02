package 기본알고리즘.반복;

import java.util.Scanner;

public class TwoDigits {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no;

        System.out.println("2자리 양수를 입력하세요");

        do{
            System.out.println("no값 :");
            no = scanner.nextInt();
        }while(no < 10 || no > 99);

        System.out.println("변수 no값은 " + no + "값이 되었습니다.");
    }

}
