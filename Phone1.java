package week2.day1;

public class Phone1 {
	public void  switchOnphone1(){
	System.out.println("switchOnphone1");
	}
	public void  unLock(){
	System.out.println("unlock");	
	}
	
	public void  passWord(){
		System.out.println("password");
	}
	public void  sendText(){
		System.out.println("sendText");
	}
	public void  call(){
		System.out.println("call");
	}
	public void  camera(){
		System.out.println("camera");
			
	}
	public void  voiceRecord(){
		System.out.println("voiceRecord");
	}
	public void  installApp(){
		System.out.println("installApp");	
	}
	public static void main(String[] args) {
		Phone1 phn= new Phone1();
		phn.switchOnphone1();
		phn.unLock();
		phn.passWord();
		phn.sendText();
		phn.call();
		phn.camera();
		phn.voiceRecord();
		phn.installApp();
	}		
}

