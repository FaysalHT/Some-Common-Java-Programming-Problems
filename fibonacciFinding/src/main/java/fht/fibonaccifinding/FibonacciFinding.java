package fht.fibonaccifinding;


public class FibonacciFinding {

    static int fib(int n){
        if (n<=1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
    public static void main(String[] args) {
        int x = 7;
        System.out.println("FIBONACCI NUMBER FOR " +x+" IS " +fib(x));
    }
}
