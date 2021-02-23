package exam.ch1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class Person{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + "]";
	}
	
}
public class GenericTest {

	/*
	 * Key
	 * Value
	 * Type
	 * Element
	 */
	
	public static <T> T getSome(Class<T> t) {
		return null;
	}
	public static void main(String[] args) {
		
		try {
			Class<?> clazz = Class.forName("exam.ch1.Person");
			Object obj = clazz.newInstance();
			
			Method[] methods = clazz.getMethods();
			for(Method method:methods) {
//				System.out.println(method.getName());
			}
			
			methods = clazz.getDeclaredMethods();
			for(Method method:methods) {
				if("setName".equals(method.getName())) {
					//invoke란 해석하자면 어떤행위를 일으키다.
					//Person class에 있는 setName메소드를 실행시키는 인자값인 String에 "알라뷰~"를
					//인자값으로 넣어서 실행시키는거임.
					method.invoke(obj, "알라뷰~");
				}
			}
			System.out.println(obj);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
