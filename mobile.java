package week1.day1;

public class mobile
{
String mobileBrandName ="Samsung";
char mobileLogo='S';
short noOfMobilePiece=18;
int modelNumber=987654;
long mobileImeiNumber=987654321;
float mobilePrice=10999.29f;
boolean isDamaged=false;
public static void main(String[] args)
{
	mobile mob =new mobile();
	System.out.println("mob.mobileBrandName");
	System.out.println("Mobile logo="+mob.mobileLogo);
	System.out.println("No. Of mobile piece"+"="+mob.noOfMobilePiece);
	System.out.println("Mobile IMEI number"+"="+mob.mobileImeiNumber);
	System.out.println("Mobile price"+"="+mob.mobilePrice);
	System.out.println("Damaged"+"="+mob.isDamaged );

	
	
}

}
