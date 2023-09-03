//JAVA PROJECT FOR CHECKING PRIME NUMBER

package fht.primecheck;

class newClass {
    newClass(){
        System.out.println("PRIME NUMBER CHECKER\r");
    }
    void PrimeCheck(int a){
        int flag = 0;
        if (a==2) {
            System.out.println(""+a +" IS A PRIME NUMBER");
        } else {
            for (int i = 3; i <= (a/2); i++) {
                if (a%i==0) {
                    flag++;
                }
            }
            if (flag==0) {
                System.out.println(""+a +" IS A PRIME NUMBER");
            }
            else{
                System.out.println(""+a +" IS NOT A PRIME NUMBER");
            }
        }
    }
}

public class PrimeCheck {

    public static void main(String[] args) {
        newClass obj = new newClass();
        obj.PrimeCheck(59);
    }
}
