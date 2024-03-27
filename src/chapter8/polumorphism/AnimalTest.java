package chapter8.polumorphism;

//부모클래스 : super
class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{

	//재정의
	@Override
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
	}
	
	//추가
	public void readBook() {
		System.out.println("사람이 책을 읽습니다.");
	}
	
}

class Tiger extends Animal{
	
	//재졍의
	@Override
	public void move() {
		System.out.println("호랑이가 네 발로 뜁니다.");
		}

	//추가
	public void hunting() {
		System.out.println("호랑이가 사냥을 합니다.");
	}
}
	
	
class Eagle extends Animal{
	//재정의
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 납니다.");
	}
	
	//추가
	public void flying() {
		System.out.println("독수리가 날개를 쭉 펴고 멀리 날아갑니다.");
	}
}

//Animal 클래스를 상속받는 Lion클래스

class Lion extends Animal{
	
	
	@Override
	public void move() {
		System.out.println("사자가 네 발로 뜁니다.");
	}
	
	
	public void hunting() {
		System.out.println("사자가 사냥을 합니다.");
	}
}
	
	
public class AnimalTest {

	public static void main(String[] args) {
		//다형성작업
		AnimalTest aTest = new AnimalTest();
		aTest.moveAnimal(new Human()); //1)
		aTest.moveAnimal(new Tiger()); //2)
		aTest.moveAnimal(new Eagle()); //3)
		aTest.moveAnimal(new Lion());

		/*
		Human human = new Human();
		human.move();
		
		Tiger tiger = new Tiger();
		tiger.move();
		
		Eagle eagle = new Eagle();
		eagle.move();
		
		Lion lion = new Lion();
		lion.move();
		*/
	}
	
		
	//다형성 기능의 메서드 정의
	//Animal animal 부모클래스 변수가 여러 자식객체를 갖게되는 의미 또는 성질을 다형성.
	public void moveAnimal(Animal animal) {
		// 재정의된 move()메서드가 호출 된다.
		animal.move(); // animal = new Human() 또는 new Tiger() 또는 new Eagle() 또는 new Lion()
		
	}

}
