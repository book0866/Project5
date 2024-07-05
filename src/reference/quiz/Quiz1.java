package reference.quiz;

public class Quiz1 {

	public static void main(String[] args) {
		
		// 회원을 생성하고, 회원이 대여한 책 3권을 추가하세요.
		Book book1 = new Book("책1", 10000, "북판사", 100);
		Book book2 = new Book("책2", 20000, "북판사", 200);
		Book book3 = new Book("책3", 30000, "북판사", 300);
		
		Member member = new Member(101, "이름", 책1, 책2, 책3);
		
	}

}


//책(Book)을 정의하는 클래스를 만드세요.
//속성: 제목, 가격, 출판사, 페이지 수
class Book {
	
	String bookTitle;
	int bookPrice;
	String bookCompany;
	int bookPage;
	
	
	public Book(String bookTitle, int bookPrice, String bookCompany, int bookPage) {
		super();
		this.bookTitle = bookTitle;
		this.bookPrice = bookPrice;
		this.bookCompany = bookCompany;
		this.bookPage = bookPage;
	}
	
}


// 도서관이 회원(Member)을 정의하는 클래스를 만드세요.
// 속성: 회원번호, 이름, 대여한 책1, 책2, 책3

class Member {
	
	int memberNo;
	String memberName;
	Book book1;
	Book book2;
	Book book3;
	
	
	public Member(int memberNo, String memberName, Book book1, Book book2, Book book3) {
		super();
		this.memberNo = memberNo;
		this.memberName = memberName;
		this.book1 = book1;
		this.book2 = book2;
		this.book3 = book3;
	}
	
}













