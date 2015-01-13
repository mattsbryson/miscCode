public class Book{

	private String title;
	private String author;

	public Book(){
		this("", "");
	}

	public Book(String title1, String author1){
		title = title1;
		author = author1;
	} 		
	
	public String title(){
			return title;
	}

	public String toString(){
		String str;
		str = "\nTitle: " + title + " Author: " + author;
		return str;
	}



	//public void setTitle(String titl){
	//	name = titl;
	//}

}