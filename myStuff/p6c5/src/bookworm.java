public class bookworm{
	public static void main(String [] args){

	Patron one;
	Book booka, bookb, bookc;
	String answer;
	
	booka = new Book("My book", "Matt");
	bookb = new Book("Hitchhikers Guide", "42");
	bookc = new Book("Steve Jobs", "Walter");

		
	//System.out.println("im book a!" + booka);
	one = new Patron("Rob", booka, bookb, bookc);

	//one.checkOut1(booka);
	//one.checkOut2(bookb);
	//one.checkOut3(bookc);

	answer = one.ask3("Steve Jobs");
	
	//System.out.println(booka.title());
	
	System.out.print(answer);
	
	System.out.println(one);

	}
}