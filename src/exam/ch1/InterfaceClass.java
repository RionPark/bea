package exam.ch1;

interface Work{
	void goToOffice();
	void goHome();
	void working();
}
public class InterfaceClass {

	public static void main(String[] args) {
		Work w = new Work() {
			@Override
			public void goToOffice() {
				System.out.println("출근함");
			}
			@Override
			public void goHome() {
				System.out.println("퇴근함");
			}
			@Override
			public void working() {
				System.out.println("일함");
			}
		};
		w.goHome();
	}
}
