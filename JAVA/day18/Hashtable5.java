package day18;
import java.util.*;
class Book{
	int id;
	String name,author,publisher;
	int quantity;
	public  Book(int id,String name,String author,String publisher,int quantity) {
		this.id=id;
		this.name=name;
		this.author=author;
		this.publisher=publisher;
		this.quantity=quantity;
		
	}
}
public class Hashtable5 {
	public static void main(String[] args) {
		Hashtable<Integer,Book> hm=new Hashtable<Integer,Book>();
		Book b1=new Book(101,"let us c","yashwant katnekar","BPB",8);
		Book b2=new Book(102,"data communication and networking","forouzan","mc graw hill",4);
		Book b3=new Book(103,"operating system","galvin","wiley",6);// adding books to hashtable
		hm.put(1, b1);
		hm.put(2, b2);
		hm.put(3, b3);
		// traversing hashtable
		for(Map.Entry<Integer,Book> z:hm.entrySet()) {
			int key=z.getKey();
			Book b=z.getValue();
			System.out.println(key+":details:");
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
		}
		
	}

}
