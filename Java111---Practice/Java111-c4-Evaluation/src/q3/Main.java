package q3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> arr = new ArrayList<>();
		arr.add(new Student(4, "Nafisa", 56, 78, 55));
		arr.add(new Student(10, "Partha", 55, 68, 45));
		arr.add(new Student(1, "chinku", 85, 96, 74));
		
		Collections.sort(arr, new Comparator<Student>() {
			
			public int compare(Student s1, Student s2) {
				int totalMarks = Integer.compare(s2.getTotalMarks(), s1.getTotalMarks());
				if(totalMarks !=0) {
					return totalMarks;
				}
				int nameComparison = s2.getName().compareTo(s1.getName());
				if(nameComparison != 0) {
					return nameComparison;
				}
				return Integer.compare(s1.getRollNo(), s2.getRollNo());
			}
		});
		for(Student i: arr) {
			System.out.println(i);
		}
		
	}

}
