package chapter8.inheritance2;

public class Dog extends Animal {

	@Override
	void run() {
		System.out.println("강아지가 뛰어다닌다.");
	}

	@Override
	void cry() {
		System.out.println("강아지가 하울링한다.");
	}

	
}
