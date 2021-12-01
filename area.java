abstract class shape{
double dim1;
double dim2;
shape(double a,double b){
dim1=a;
dim2=b;
}
abstract double printArea();
}
class triangle extends shape{
triangle(double a,double b){
super(a,b);
}
double printArea(){
return 0.5*dim1*dim2;
}
}
class circle extends shape{
double pi=3.142;
circle(double a,double b){
super(a,b);
}
double printArea(){
return pi*dim1*dim1;
}
}

class square extends shape{
square(double a,double b){
super(a,b);
}
double printArea(){
return dim1*dim2;
}
}

class area{
public static void main(String[] args){
shape sh;
triangle t =new triangle(3,8);
circle c =new circle(6,0);
square s =new square(3,4);
sh=t;
System.out.println("area of triangle is :"+sh.printArea());
sh=c;
System.out.println("area of circle is :"+sh.printArea());
sh=s;
System.out.println("area of square is :"+sh.printArea());
}
}