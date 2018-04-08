package test01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.lang.model.element.Element;

@Target(value= {ElementType.METHOD,ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Test {
	String studentName() default "";
	int age() default 0;
	String[] schools() default {"�廪��ѧ","������ѧ"};
}
class ss{
	@Test(studentName="dsd",age=1,schools= {"�廪��ѧ"})
	public void xx() {
	
}
}