package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Faction {
	private String factionName;
	private ArrayList<Deputy> deputies = new ArrayList<>();

	public Faction(String factionName, ArrayList<Deputy> deputies) {
		super();
		this.factionName = factionName;
		this.deputies = deputies;
	}

	public String getFactionName() {
		return factionName;
	}

	public void setFactionName(String factionName) {
		this.factionName = factionName;
	}

	public ArrayList<Deputy> getDeputies() {
		return deputies;
	}

	public void setDeputies(ArrayList<Deputy> deputies) {
		this.deputies = deputies;
	}

	@Override
	public String toString() {
		return "Faction [factionName=" + factionName + ", deputies=" + deputies + "]";
	}

	public void addDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Deputy: FirstName LastName Age Weight Growth IsGrafter (No|Yes)");
		System.out.println("Example: Jon Doe 50 79 176 No");
		String inputDep = scanner.next();
		String[] inputArray = inputDep.split(" ");
		deputies.add(new Deputy(inputArray[0], inputArray[1], Integer.valueOf(inputArray[2]),
				Integer.valueOf(inputArray[3]), Integer.valueOf(inputArray[4]), "Yes".equalsIgnoreCase(inputArray[5])));

	}

	public void deleteDeputy() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("You have tried to delete deputy, Enter Deputy: FirstName LastName");
		String inputDep = scanner.next();
		String[] inputArray = inputDep.split(" ");
		Iterator<Deputy> depIterator = deputies.iterator();
		while (depIterator.hasNext()) {
			Deputy next = depIterator.next();
			if (next.getFirstName().equalsIgnoreCase(inputArray[0])
					&& next.getLastName().equalsIgnoreCase(inputArray[1])) {
				deputies.remove(next);
			}

		}

	}

	public void getAllGrafter() {
		for (Deputy dep : deputies) {
			if (dep.isGrafter()) {
				System.out.println(dep);
			}
		}
	}

	public void getBiggestGrafter() {
		deputies.sort(new Comparator<Deputy>() {
			@Override
			public int compare(Deputy o1, Deputy o2) {
				return Integer.compare(o1.getBribeSize(), o2.getBribeSize()) * -1;
			}
		});
		if (deputies.size() > 0 && deputies.get(0).isGrafter()) {
			System.out.println("Biggest:");
			System.out.println(deputies.get(0));
			System.out.println();
		} else {
			System.out.println("There are no grafters");
		}
	}

	public void getAllDeputies() {
		ListIterator<Deputy> deputyIterator = deputies.listIterator();
		while (deputyIterator.hasNext()) {
			System.out.println(deputyIterator.next());
		}
	}

	public void cleanFaction() {
		deputies.clear();
	}

}
