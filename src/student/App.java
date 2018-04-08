package student;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;


public class App {
	public static void main(String[] args) {
		try {
			Class c=Class.forName("student.Student");
			Annotation []a= c.getAnnotations();
			for(Annotation temp:a) {
				System.out.println(temp);
			}
			//
			
			 Table s=(Table) c.getAnnotation(Table.class);
			System.out.println(s);
			//
			
			Field f=c.getDeclaredField("studentName");
			
			Suxing s1=f.getAnnotation(Suxing.class);
			System.out.println(s1.name()+"--"+s1.len());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
