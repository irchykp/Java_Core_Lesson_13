package ua.lviv.lgs;

import java.util.Scanner;

public class Deputy extends Human {
	private String firstName;
	private String lastName;
	private int age;
	private boolean isGrafter;
	private int bribeSize;

	public Deputy(String firstName, String lastName, int weight, int growth, int age, boolean isGrafter) {
		super(weight, growth);
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.isGrafter = isGrafter;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isGrafter() {
		return isGrafter;
	}

	public void setGrafter(boolean isGrafter) {
		this.isGrafter = isGrafter;
	}

	public int getBribeSize() {
		return bribeSize;
	}

	public void setBribeSize(int bribeSize) {
		this.bribeSize = bribeSize;
	}

	@Override
	public String toString() {
		return "Deputy [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", isGrafter=" + isGrafter
				+ ", bribeSize=" + bribeSize + ", getFirstName()=" + getFirstName() + ", getLastName()=" + getLastName()
				+ ", getAge()=" + getAge() + ", isGrafter()=" + isGrafter() + ", getBribeSize()=" + getBribeSize()
				+ "]";
	}

	public void giveBribe(boolean isGrafter) {
		if (!isGrafter) {
			System.out.println("This deputy doesn't take a bribes !");
		} else {
			System.out.println("Enter size of bribe !");
			Scanner scanner = new Scanner(System.in);
			int inputBribeSize = scanner.nextInt();
			System.out.println("Size of bribe: " + inputBribeSize);
			if (inputBribeSize > 5000) {
				System.out.println("Police will imprison the deputy !");
			} else {
				setBribeSize(inputBribeSize);
			}
			scanner.close();
		}
	}
}
