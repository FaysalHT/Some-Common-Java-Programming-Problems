package inheritance;

class Parent{
    int a = 10;
    int b = 20;
    String name = "Parent"; //string er age private likhe dile access kora jabe na
    Parent(){
        System.out.println("This is Parent class");
    }
    
    Parent(int z, int q){
        a = z;
        b = q;
        System.out.println("This is Parent Class with value of A and B = "+a+","+b);
    }
    void print(){
        System.out.println("Printing parent Info");
    }
    void print(int x){
        System.out.println("Printing parent Info with x");
    }
    int sum(int x, int y, int z){
        System.out.println(x+y+z);
        return 0;
    }
}

class A extends Parent{
    A(){
        System.out.println("This is class A");
        System.out.println(name);
        int x = a;
        System.out.println("Inherited variable is "+x);
    }
    
    A(int x, int y){
        super(x,y); //super diye parent er constructor ke call kore
    }
    //method overloading holo method e different parameter diye different kaj e use kora
    //method overriding
    @Override
    void print(){ //same name e method thakle child er tai age hobe     
        System.out.println("Printing child Info");
        sum(100,50,30); //child call hoise override hoye
        super.sum(500, 200, 100);//parent call hobe super. lekhar jonno
    }
    int sum(int x, int y, int z){
        System.out.println(x+y+z);
        return 0;
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Parent p = new Parent();
        A cls = new A();
        
        cls.print();
        cls.print(100); //method overloading kora hoise, same name- parameter alada
        
        //child theke parent e pathano
        A cls2 = new A(40,50);
    }
}
