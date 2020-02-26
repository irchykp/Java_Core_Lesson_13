package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class VerhovnaRada {

	private static VerhovnaRada instance;

	private VerhovnaRada() {

	}

	public static VerhovnaRada getInstance() {
		if (instance == null) {
			instance = new VerhovnaRada();
		}
		return instance;
	}

	ArrayList<Faction> factionArray = new ArrayList<>();

	public void addFaction() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Faction: FactionName");
		System.out.println("Example: FactionA");
		String inputFaction = scanner.next();
		factionArray.add(new Faction(inputFaction, null));

	}

	private Faction getFactionByName() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter faction name");
		String factionName = scanner.next();

		Iterator<Faction> iterator = factionArray.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();
			if (factionName != null && factionName.equalsIgnoreCase(next.getFactionName())) {
				return next;
			}
		}
		System.out.println("This faction doesn`t exist");
		return null;
	}

	public void deleteFaction() {
		Faction myFaction = getFactionByName();
		if (myFaction != null) {
			factionArray.remove(myFaction);
		}
	}

	public void cleanFaction() {
		Faction myFaction = getFactionByName();
		if (myFaction != null) {
			myFaction.cleanFaction();
		}
	}

	public void getAllFactions() {
		ListIterator<Faction> factionIterator = factionArray.listIterator();
		while (factionIterator.hasNext()) {
			System.out.println(factionIterator.next());
		}
	}

	public void getFaction() {
		Faction myFaction = getFactionByName();
		if (myFaction != null) {
			System.out.println(myFaction);
		}
	}

	public void addDeputyToFaction() {
		Faction myFaction = getFactionByName();
		if (myFaction != null) {
			myFaction.addDeputy();
		}
	}

	public void deleteDeputyToFaction() {
		Faction myFaction = getFactionByName();
		if (myFaction != null) {
			myFaction.deleteDeputy();
		}
	}

	public void getAllGrafters() {
		Faction myFaction = getFactionByName();
		if (myFaction != null) {
			myFaction.getAllGrafter();
		}
	}

	public void getBiggestGrafter() {
		Faction myFaction = getFactionByName();
		if (myFaction != null) {
			myFaction.getBiggestGrafter();
		}
	}

	public void getAllDeputies() {
		Faction myFaction = getFactionByName();
		if (myFaction != null) {
			myFaction.getAllDeputies();
		}
	}

}
