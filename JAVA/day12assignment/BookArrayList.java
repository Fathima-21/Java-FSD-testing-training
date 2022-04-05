package day12assignment;
import java.util.*;
class Book implements Comparable<Book>{
	String name;
	String author;
	Integer  year;
	int copies;
	public Book(String name,String author,Integer year,int copies) {
		this.name=name;
		this.author=author;
		this.year=year;
		this.copies=copies;
	}
	public int getYear() {
		return this.year;
	}
	@Override
	public int compareTo(Book o) {
		// sort based on year
		return this. year.compareTo(o.year);
	}
}

public class BookArrayList {

	public static void main(String[] args) {
		ArrayList<Book> list=new ArrayList<Book>();
		Book b1=new Book("fundamentals of physics","sreelal",1999,250);
		Book b2=new Book("biology","jayalalitha",2000,350);
		Book b3=new Book("fundamentals of chemistry","lolan",1960,487);
		list.add(b1);
		list.add(b2);
		list.add(b3);
		Collections.sort(list);
		for(Book b:list) {
			System.out.println(b.name+" "+b.author+" "+b.year+" "+b.copies);
		}

	}

}
