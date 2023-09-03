package task1;

import java.util.Scanner;

class Shape{
    Scanner sc = new Scanner(System.in);
    double x;
    double y;
}

class twoD extends Shape{
    double area;
    void show(){
        System.out.println("Area is "+area);
    }
}

class threeD extends Shape{
    double volume;
    void show(){
        System.out.println("Volume is "+volume);
    }
}

class circle extends twoD{
    void get(){
        System.out.println("Enter radius = ");
        x = sc.nextDouble();
    }
    void set(){
        area = 3.1416 * x * x;
        show();
    }
}

class square extends twoD{
    void get(){
        System.out.println("Enter length = ");
        x = sc.nextDouble();
    }
    void set(){
        area = x * x;
        show();
    }
}

class triangle extends twoD{
    void get(){
        System.out.println("Enter length = ");
        x = sc.nextDouble();
        System.out.println("Enter height = ");
        y = sc.nextDouble();
    }
    void set(){
        area = 0.5 * x * y;
        show();
    }
}

class sphere extends threeD{
    void get(){
        System.out.println("Enter radius = ");
        x = sc.nextDouble();
    }
    void set(){
        volume = (4.0/3.0) * 3.1416 * x * x * x;
        show();
    }
}

class cube extends threeD{
    void get(){
        System.out.println("Enter radius = ");
        x = sc.nextDouble();
    }
    void set(){
        volume = x * x * x;
        show();
    }
}

class tetrahedron extends threeD{
    void get(){
        System.out.println("Enter edge = ");
        x = sc.nextDouble();
    }
    void set(){
        volume = (x * x * x)/ (6 * 1.414);
        show();
    }
}

public class Task1 {

    static int input;
    
    public static void main(String[] args) {
        process();        
    }
    
    static void process(){
        //object creation
        Shape ob = new Shape();
        twoD ob2 = new twoD();
        threeD ob3 = new threeD();
        circle obCir = new circle();
        square obSq = new square();
        triangle obTri = new triangle();
        sphere obSp = new sphere();
        cube obCu = new cube();
        tetrahedron obTet = new tetrahedron();
        Scanner scmain = new Scanner(System.in);
        
        System.out.println("Enter your choice = ");
        System.out.println("1 . 2D Shape");
        System.out.println("2 . 3D Shape");
        input = scmain.nextInt();
        switch (input) {
            case 1 -> {
                System.out.println("Enter your choice = ");
                System.out.println("1 . Circle");
                System.out.println("2 . Square");
                System.out.println("3 . Triangle");
                input = scmain.nextInt();
                switch (input) {
                    case 1 ->  {    //circle
                        obCir.get();
                        obCir.set();
                        ask();
                    }
                    case 2 -> {     //square
                        obSq.get();
                        obSq.set();
                        ask();
                    }
                    case 3 -> {     //triangle
                        obTri.get();
                        obTri.set();
                        ask();
                    }
                    default -> {
                        System.out.println("Wrong Input");
                        return;
                    }
                }
            }
            case 2 -> {
                System.out.println("Enter your choice = ");
                System.out.println("1 . Sphere");
                System.out.println("2 . Cube");
                System.out.println("3 . Tetrahedron");
                input = scmain.nextInt();
                switch (input) {
                    case 1 ->  {    //sphere
                        obSp.get();
                        obSp.set();
                        ask();
                    }
                    case 2 -> {     //cube
                        obCu.get();
                        obCu.set();
                        ask();
                    }
                    case 3 -> {     //tetrahedron
                        obTet.get();
                        obTet.set();
                        ask();
                    }
                    default -> {
                        System.out.println("Wrong Input");
                        return;
                    }
                }
            }
            default -> {
                System.out.println("Wrong Input");
                return;
            }
        }
    }
    
    static void ask(){
        System.out.println("Do you want to continue ? ");
        System.out.println("1 . Yes");
        System.out.println("2 . No");
        Scanner scAsk = new Scanner(System.in);
        input = scAsk.nextInt();
        switch (input) {
            case 1:
                process();
            case 2:
                return;
            default:
                System.out.println("Wrong input");
                ask();
        }
    }
}
