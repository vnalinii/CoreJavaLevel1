
// Java program to illustrate the 
// concept of Multilevel inheritance 

class classone {
	public void print_geek() {
		System.out.println("geeks");
	}
}

class classtwo extends classone {
	public void print_for() {
		System.out.println("for");
	}
}

class classthree extends classtwo {
	public void print_geek() {
		System.out.println("Geeks");
	}
}

// Drived class 
public class MultiLevelInheritence {
	public static void main(String[] args) {
		classthree g = new classthree();
		g.print_geek();
		g.print_for();
		g.print_geek();
	}
}
