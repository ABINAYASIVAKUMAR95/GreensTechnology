package org.text;

public class TamilNadu implements Kerala,Gujarat{


	public void branch() {
		System.out.println("chennai");
		
	}

	
	public void saving() {
		System.out.println("10");
		
	}

	
	public void joinAcc() {
		System.out.println("20");
		
	}

	
	public void fixed() {
		System.out.println("30");
		
	}
public static void main(String[] args) {
	TamilNadu tam=new TamilNadu();
	tam.branch();
	tam.fixed();
	tam.joinAcc();
	tam.saving();
	tam.lan();
	tam.hindhi();
	
}


@Override
public void lan() {
	System.out.println("40");
	
}



public void hindhi() {
	System.out.println("50");
	
}

}