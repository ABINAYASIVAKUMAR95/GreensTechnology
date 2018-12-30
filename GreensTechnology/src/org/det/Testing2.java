package org.det;

public class Testing2 extends Testing {
	
	
	public void savingAcc() {
		System.out.println("5%");
		

	}
	public void CurrentAcc() {
		System.out.println("10%");
		

	}
	public void deposite() {
		System.out.println("7%");
	

	}
	public static void main(String[] args) {
		Testing2 er=new Testing2();
		er.branch();
		er.CurrentAcc();
		er.deposite();
		er.savingAcc();
		
	}


}

