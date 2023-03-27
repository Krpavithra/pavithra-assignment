package wek6.day1;

public class Automation extends Multiplelanguage {

	public void selinium() {
		// TODO Auto-generated method stub
	System.out.println("Selinium-AutomationTool");	
	}

	public void java() {
		// TODO Auto-generated method stub
		System.out.println("Java-language");
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Ruby-Abstract");
	}
public static void main(String[] args) {
	Automation aut=new Automation();
	aut.selinium();
	aut.java();
	aut.python();
	aut.ruby();
}
}
