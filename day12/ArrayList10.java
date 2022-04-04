package day12;
import java.util.*;

class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
	}
}

public class ArrayList10 {

	public static void main(String[] args) {
		// creating list of books
		ArrayList<Book> list=new ArrayList<Book> ();
		// creating books
		Book b1=new Book(101,"Let us C","Yashwant Katnekar","BPB",8);
		Book b2=new Book(102,"data communications and networking","forouzan","mc graw hill",4);
		Book b3=new Book(103,"operating system","galvin","wiley",6);
		
		// adding books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		// traversing through list
		for(Book b:list) {
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
		
		
	}

}
