package codeassignment1;

public class SchoolRecords {
	
	
	
	String school_Name [] = new String [10];
	int school_Id [] = new int [20];
	String school_Address[] = new String [10];
	public int a=0;

	void addRecords(String school, int id,String address) {
	school_Name [a] = school;
	school_Id [a] = id;
	school_Address [a] = address;
	System.out.println("School added successfull-------\n");
	a++;
	}

	void displayRecords() {
	--a;
	for(int j=0;j<=a;j++) {
	System.out.println((j+1)+". "+school_Name[j]+" "+school_Id[j]+" "+school_Address[j]+"\n");
	}
	}

	}

