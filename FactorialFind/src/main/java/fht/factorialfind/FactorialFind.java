package fht.factorialfind;

public class FactorialFind {

    public static void main(String[] args) {
        int x = 5;
        //checking factorial
        int fact = 1;
        for (int i = 1; i <= x; i++) {
            fact = fact * i;
        }
        System.out.println("The factorial of " +x +" is " +fact);
    }
}
