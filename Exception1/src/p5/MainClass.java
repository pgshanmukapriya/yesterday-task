package p5;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int hourlywage=0;
		int IdNum=0;
		System.out.println("enter IdNumber:");
		int IdNumber=sc.nextInt();
		try {
			System.out.println("enter hourlyWage:");
			hourlywage=sc.nextInt();
			if(hourlywage <6|hourlywage>50) {
				throw new EmployeeException("entered wage is invalid");
			}
			else
				System.out.println("valid hourlyWage:" +hourlywage);		
		}
		catch(Exception e) {
			System.out.println("Error:"  +e.getMessage());
		}
	}

}
