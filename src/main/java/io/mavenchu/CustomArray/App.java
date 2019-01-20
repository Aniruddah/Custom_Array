package io.mavenchu.CustomArray;

public class App {

	public static void main(String[] args) {
		CustomArrayLst<Fellow> fellowList = new CustomArrayLst<Fellow>();

		   Fellow f1=new Fellow("bijoy","1","maniknagar");
		   Fellow f2=new Fellow("ringkon","2","sutrapur");
		   Fellow f3=new Fellow("Benazir","3","Uttara");
		   
		   fellowList.fellowAdd(f1);
		   fellowList.fellowAdd(f2);
		   fellowList.fellowAdd(f3);
		   fellowList.display();
		   System.out.println("\n");
		   
		   fellowList.remove(1);
		   
		   fellowList.display();
		   
		   fellowList.get(1).setAddress("Mirpur");;
		   System.out.println("\n");
		   fellowList.display();
		   
		 }
	
	
}

