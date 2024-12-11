package Lesson8.prob1;

// Common task: Make sure to check your code should not throw any runtime exception
public class MyPersonList {
	private final int INITIAL_LENGTH = 3;
	private Person[] PersonArray;
	private int size;

	// Default Constructor
	public MyPersonList() {
		PersonArray = new Person[INITIAL_LENGTH];
		size = 0;
	}

	// 1. Add a Person as the last element, ensure enough room, else resize
	public void add(Person p) {
		if (size == PersonArray.length) {
			resize();
		}
		PersonArray[size++] = p;
	}

	// 2. Get person information by passing the index
	public Person get(int i) {
		if (i < 0 || i >= size) {
			throw new IndexOutOfBoundsException("Invalid index: " + i);
		}
		return PersonArray[i];
	}

	// 3. Find the Person object using last name
	public boolean find(String lastName) {
		for (int i = 0; i < size; i++) {
			if (PersonArray[i].getLast().equals(lastName)) {
				return true;
			}
		}
		return false;
	}

	// 4. Remove the person object by passing its last name
	public boolean remove(String lastName) {
		for (int i = 0; i < size; i++) {
			if (PersonArray[i].getLast().equals(lastName)) {
				for (int j = i; j < size - 1; j++) {
					PersonArray[j] = PersonArray[j + 1];
				}
				PersonArray[--size] = null;
				return true;
			}
		}
		return false;
	}

	// 5. Resize the list
	private void resize() {
		Person[] newArray = new Person[PersonArray.length * 2];
		System.arraycopy(PersonArray, 0, newArray, 0, size);
		PersonArray = newArray;
	}

	// To display all the persons in the list
	public String toString() {
		if (size == 0) return "[]";
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < size - 1; ++i) {
			sb.append(PersonArray[i] + ", \n");
		}
		sb.append(PersonArray[size - 1] + "]");
		return sb.toString();
	}

	// Return the size
	public int size() {
		return size;
	}

	public static void main(String[] args) {
		MyPersonList list = new MyPersonList();
		list.add(new Person("Bruce", "Tom", 36));
		list.add(new Person("Paul", "Corozza", 51));
		list.add(new Person("Joe", "Lermon", 53));
		list.add(new Person("Anne", "Dow", 55));
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		list.remove("Tom");
		System.out.println("\nSize() : " + list.size() + "\n" + list);
		System.out.println("\nSearching for Lermon: " + list.find("Lermon"));
		System.out.println(list.get(2));
	}
}
