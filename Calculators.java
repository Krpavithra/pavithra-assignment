package week2.day4;

public class Calculators {
public void addTwoNumber(int a,int b){
	int c=a+b;  
	System.out.println(c);
}
public void subTwoNumber(int e,int f) {
	int g=e-f;
	System.out.println(g);
}
public void mulTwoNumber(double i,double j ) {
	double k=i*j;
	System.out.println(k);
}
public void divTwoNumber(float x,float y) {
	float z=x%y;
	System.out.println(z);
}
public static void main(String[] args) {
	Calculators calcii=new Calculators();
	calcii.addTwoNumber(33,22);
	calcii.subTwoNumber(90,40);
	calcii.mulTwoNumber(77777.6666,889765.65434);
	calcii.divTwoNumber(876.7f,654.8f);
}
}
