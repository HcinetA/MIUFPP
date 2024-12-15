package prob1;

import java.util.*;

public class Key {
	private String firstName;
	private String lastName;

	public Key(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) return true;
		if (obj == null || getClass() != obj.getClass()) return false;
		Key key = (Key) obj;
		return Objects.equals(firstName, key.firstName) && Objects.equals(lastName, key.lastName);
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
}