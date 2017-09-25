package com.ironyard;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Random;

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

        Set<Student> set1 = new HashSet<>();
		Set<Student> set2 = new HashSet<>();
        Set<Student> set3 = new HashSet<>();

        Student[] studentArray = new Student[students.size()];
        studentArray = students.toArray(studentArray);

        for (int i = 0; i < 5; i++) {
            set1.add(studentArray[i]);
            set2.add(studentArray[i+5]);
            set3.add(studentArray[i+10]);
        }

        Map<Teacher, HashSet> classMap = new HashMap<>();

        Teacher[] teacherArray = new Teacher[teachers.size()];
        teacherArray = teachers.toArray(teacherArray);

        classMap.put(teacherArray[0], (HashSet) set1);
        classMap.put(teacherArray[1], (HashSet) set2);
        classMap.put(teacherArray[2], (HashSet) set3);

        System.out.println(classMap.keySet());
        System.out.println(classMap.values());

    }


}
