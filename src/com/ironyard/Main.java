package com.ironyard;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		String[] firstNames = {"Sam", "Caroline", "Joe", "Sue", "Bob", "Mike", "Carol", "Greg", "Peter", "Bobby", "Marcia", "Jan", "Cindy", "Alice", "Oliver"};
		String[] lastNames = {"Smith", "Adams", "Jones", "Brady", "David", "Seinfeld", "Kramer", "Benes", "Costanza", "Sacomano", "Newman", "Childs", "Green", "Hines", "Lewis"};
		for (int i = 0; i < 15; i++) {
			Student temp = new Student();
			temp.setFirstName(firstNames[i]);
			temp.setLastName(lastNames[i]);
			temp.setId(i);
			temp.setGrade(1);
			students.add(temp);
		}
        List<Teacher> teachers = new ArrayList<>();
		String[] teachFirstNames = {"Rocky", "Apollo", "Clubber"};
		String[] teachLastNames = {"Balboa", "Creed", "Lang"};
		for (int i = 0; i < 3; i++) {
		    Teacher tempTeach = new Teacher();
		    tempTeach.setFirstName(teachFirstNames[i]);
		    tempTeach.setLastName(teachLastNames[i]);
		    tempTeach.setId(100 + i);
		    tempTeach.setGrade(1);
		    teachers.add(tempTeach);
        }
        
    }


}
