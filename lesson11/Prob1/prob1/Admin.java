package prob1;
import java.util.*;

public class Admin {
	public static HashMap<Key, Student> processStudents(List<Student> students) {
		HashMap<Key, Student> studentMap = new HashMap<>();
		for (Student student : students) {
			Key key = new Key(student.getFirstName(), student.getLastName());
			studentMap.put(key, student);
		}
		return studentMap;
	}
}