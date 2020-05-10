
//Java program to illustrate the 
//concept of Hierarchical inheritance 

class clsone {
	public void print_geek() {
		System.out.println("Geeks");
	}
}

class clstwo extends clsone {
	public void print_for() {
		System.out.println("for");
	}
}

class clsthree extends clsone {
	/* ............ */
}

//Drived class 
public class HierarchialInheritence {
	public static void main(String[] args) {
		clsthree g = new clsthree();
		g.print_geek();
		clstwo t = new clstwo();
		t.print_for();
		g.print_geek();
	}
}
