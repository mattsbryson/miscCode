public class Patron{

	private String name;
	//Book book1, book2, book3, bookn;
	//private String title1, title2, title3;

	static Book book1 = new Book();
	static Book book2 = new Book();
	static Book book3 = new Book();
	static Book bookn = new Book();
	
	String title1 = book1.title();
	String title2 = book2.title();
	String title3 = book3.title();
	
	//constructors
	public Patron(){
		this("", book1, book2, book3);
	}
	
	public Patron(String namea, Book booka, Book bookb, Book bookc){
		name = namea;
		if (booka != bookn) book1 = booka;
		if (bookb != bookn) book2 = bookb;
		if (bookc != bookn) book3 = bookc;
	}
			

	public void setName(String nm){
		name = nm;
	}

	public void checkOut1(Book booka){
		book1 = booka;
	}

	public void checkOut2(Book bookb){
		book2 = bookb;
	}
	
	public void checkOut3(Book bookc){
		book3 = bookc;
	}
	
	
	
	public String ask1(String ask){
		String answer;
		if (ask == title1)
			answer = "I have the book you are looking for.";
			else
			answer = "These are not the books you are looking for.";
		return answer;
	}

	public String ask2(String ask){
		String answer;
		if (ask == title2)
			answer = "I have the book you are looking for.";
			else
			answer = "These are not the books you are looking for.";
		return answer;
	}
	
	
	public String ask3(String ask){
		String answer;
		if (ask.equals(title3))
			answer = "I have the book you are looking for.";
			else
			answer = "These are not the books you are looking for.";
		return answer;
	}
	
	
	
	
	
	public void giveBack(String title){
		if (title == book1.title())
		book1 = null;
		if (title == book2.toString())
		book2 = null;
		if (title == book3.toString())
		book3 = null;
	}
	
	public void borrow(Book booka){
		if (book1 == bookn)  book1 = booka;
		if (book2 == bookn)  book2 = booka;
		if (book3 == bookn)  book2 = booka;
	}

	public String toString(){
		String str;
		str = "\nName: " + name + " \nBook1: " + book1 + " \nBook 2: " + book2 	+ " \nBook 3: " + book3;
		return str;
	}


}
			












		
	