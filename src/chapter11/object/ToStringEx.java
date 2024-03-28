package chapter11.object;

class Book/*extends Object*/{
	//필드
	int bookNumber;
	String bookTitle;
	
	//매개변수가 있는 생성자
	public Book(int bookNumber, String bookTitle) {
		super(); //부모클래스의 기본생성자호출
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + "]";
	}

	//재정의 : 필드의 정보를 확인하는 목적
	

}

public class ToStringEx {
	
	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		
		// toString()메서드를 재정을 안하면, Ojbect클래스의 toString()aptjemsms
		// 다음과 같이 출력돤다.chapter11.object.Book@75a1cd57
		// 재정의한 경우에는 Book Book [bookNumber=200, bookTitle=개미] 출력된다.
		System.out.println(book1); //System.out.println(book1.String());
		
	}

}
