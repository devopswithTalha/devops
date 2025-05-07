package example;

import java.util.LinkedHashMap;
import java.util.Set;

class StudentMainClass {
public static void main(String[] args) {
	Student s1=new Student("Talha");
	Student s2=new Student("Nabeel");
	LinkedHashMap<Student,Integer> map = new LinkedHashMap<Student, Integer>();
	map.put(s1,50); // map.put(new Student("Talha"),50);
	map.put(s2,60); // map.put(new Student("Nabeel",60);
	Set<Student> keys=map.keySet();
	for(Student key:keys) {
		System.out.println(key+" Marks:"+map.get(key));
	}
	
	
}
}
