package pkg3typesoftriangle;

abstract class Shape{
    abstract void check(double a, double b, double c);
}

 class equiTri extends Shape{
    double area;
    double peri;
    void check(double a, double b, double c){
        if(a==b && b==c && c==a){
            calcArea(a);
            calcPeri(a);
        }
    }
    void calcArea(double a){
        area = (Math.sqrt(3.00)/4.00)*a*a;
        System.out.println("Area of Equilateral Triangle is "+area);
    }
    void calcPeri(double a){
        peri = 3*a;
        System.out.println("Perimeter of Equilateral Triangle is "+peri);
    }
} 

class isoTri extends Shape{
    double area;
    double peri;
    void check(double a, double b, double c){
        if(a==b && b!=c){
            calcArea(a,c);
            calcPeri(a,c);
        }
    }
    void calcArea(double a, double b){
        area = 0.50*(Math.sqrt((a*a)-((b*b)/4.00)*b));
        System.out.println("Area of Isosceles Triangle is "+area);
    }
    void calcPeri(double a, double b){
        peri = ((2.00)*a) + b;
        System.out.println("Perimeter of Isosceles Triangle is "+peri);
    }
}

class scaTri extends Shape{
    double area;
    double peri;
    void check(double a, double b, double c){
        if(a!=b && b!=c && a!=c){
            calcArea(a,b,c);
            calcPeri(a,b,c);
        }
    }
    double s;
    void calcArea(double a, double b, double c){
        s = (a+b+c)/2.00;
        area = Math.sqrt(s*(s*a)*(s*b)*(s*c));
        System.out.println("Area of Scalene Triangle is "+area);
    }
    void calcPeri(double a, double b, double c){
        peri = a + b + c;
        System.out.println("Perimeter of Scalene Triangle is "+peri);
    }
}

public class Main {

    public static void main(String[] args) {
        equiTri e = new equiTri();
        e.check(5, 5, 5);
        isoTri i = new isoTri();
        i.check(10, 10, 5);
        scaTri s = new scaTri();
        s.check(7, 6, 12);
    }
    
}
