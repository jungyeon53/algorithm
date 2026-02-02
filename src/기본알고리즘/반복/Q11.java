package 기본알고리즘.반복;

public class Q11 {

    public static void main(String[] args) {

        // 위쪽과 왼쪽에 곱하는 수가 있는 구구단 곱셈표 출력 프로그램

        System.out.print("  ");
        for(int i = 1; i <= 9; i++){
            if(i == 1){
                System.out.print("|");
            }
            System.out.print(i + " ");
        }

        System.out.println();
        for(int i = 1; i <= 9; i++){
            System.out.print("- ");
        }


        System.out.println();
        for(int j = 1; j <= 9; j++){
            System.out.print(j + "|");
            for(int k = 1; k <= 9; k++){
                System.out.print(j * k + " ");
            }
            System.out.println();
        }
    }

}
