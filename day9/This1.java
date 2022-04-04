package day9;

 class This1 {
	int sum;
	This1(int example){
		this.sum=example;
	}
	void display() {
		System.out.println("sum ="+sum);
	}

	public static void main(String[] args) {
		This1 s=new This1(500);
		s.display();
		This1 two=new This1(750);
		two.display();
		
	}

}
