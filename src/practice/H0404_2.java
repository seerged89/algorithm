package practice;

public class H0404_2 {

    public static void main(String[] args) {
        int n = 5;
        incOrDecToZero(n);
    }

    static void incOrDecToZero(int n) {
        System.out.println(n);
        if(n > 0) {
            incOrDecToZero(--n);
        } else if(n < 0) {
            incOrDecToZero(++n);
        }
    }

}
