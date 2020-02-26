package ua.lviv.lgs;

import java.util.Scanner;

public class Application {

	static void menu() {
		System.out.println("Enter 1 to add faction ");
		System.out.println("Enter 2 to delete faction");
		System.out.println("Enter 3 to get all faction");
		System.out.println("Enter 4 to clear faction");
		System.out.println("Enter 5 to get this faction");
		System.out.println("Enter 6 to add deputy to faction");
		System.out.println("Enter 7 to delete deputy to faction");
		System.out.println("Enter 8 to get all grafters to faction");
		System.out.println("Enter 9 to get biggest grafter to faction");

	}

	public static void main(String[] args) {
		VerhovnaRada vr = VerhovnaRada.getInstance();

		String s = "";
		Scanner sc = new Scanner(System.in);
		boolean work = true;

		while (work) {
			menu();
			s = sc.nextLine();

			switch (s) {
			case "1":
				vr.addFaction();
				break;
			case "2":
				vr.deleteFaction();
				break;
			case "3":
				vr.getAllFactions();
				break;
			case "4":
				vr.cleanFaction();
				break;
			case "5":
				vr.getFaction();
				break;
			case "6":
				vr.addDeputyToFaction();
				break;
			case "7":
				vr.deleteDeputyToFaction();
				break;
			case "8":
				vr.getAllGrafters();
				break;
			case "9":
				vr.getBiggestGrafter();
			default:
				work = false;
				break;
			}
		}
	}

}
