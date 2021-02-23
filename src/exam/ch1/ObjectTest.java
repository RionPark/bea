package exam.ch1;

class Car{
	public void info() {
		System.out.println("나는 자동차");
	}
}
class Sonata extends Car{
	public void info() {
		super.info();
		System.out.println("난 소나타");
	}
}

class K5 extends Car{
	public void info() {
		super.info();
		System.out.println("난 K5");
	}
}
public class ObjectTest {

	public static <T extends Car> void printCarInfo(T c) {
		c.info();
	}
	
	public static void main(String[] args) {
		printCarInfo(new Car());
		printCarInfo(new K5());
		printCarInfo(new Sonata());
	}
}
