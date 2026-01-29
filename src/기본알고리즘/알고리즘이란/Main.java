package 기본알고리즘.알고리즘이란;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

    }

    // 최댓값
    static int max(int a, int b, int c, int d){
        int max = a;
        if(b > max) max = b;
        if(c > max) max = c;
        if(d > max) max = d;
        return max;
    }

    // 세개의 값의 최소값
    static int min(int a, int b, int c){
        return Math.min(a, Math.min(b, c));
    }

    // 네개의 값의 최소값
    static int min(int a, int b, int c, int d){
        int min = a;
        if(b < min) min = b;
        if(c < min) min = c;
        if(d < min) min = d;
        return min;
    }

    // 세값의 대소관계인 13가지 조합의 중앙값을 구하여 출력
    static int mid(int a, int b, int c){
        int med = 0;
        if(a >= b){
            if(b >= c){
                med = b;
            }else if(a >= c){
                med = c;
            }
        } else {
            if(a >= c){
                med = a;
            } else if (b >= c) {
                med = c;
            }
        }
        return med;
    }

    // 가우스의 덧셈
    static int sum(int n){
        return n*(n+1)/2;
    }

    // 정수 ab 를 포함에서 사이의 모든 정수의 합
    static int sum(int a, int b){

        int max = b;
        int min = a;

        if(a > b) {
            max = a;
            min = b;
        }

        return max*(max+1)/2 - min*(min-1)/2;
    }
}