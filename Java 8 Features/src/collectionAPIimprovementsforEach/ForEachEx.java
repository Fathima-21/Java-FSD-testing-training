package collectionAPIimprovementsforEach;

import java.util.ArrayList;
import java.util.List;

public class ForEachEx {
	public static void main(String args[]) {
		List<String> gamesList=new ArrayList<String>();
		gamesList.add("football");
		gamesList.add("cricket");
		gamesList.add("baseball");
		System.out.println("------Passing lambda expression----");
		gamesList.forEach(games->System.out.println(games));
	}

}
