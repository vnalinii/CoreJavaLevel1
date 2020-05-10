
// Java program to illustrate the 
// concept of Multiple inheritance 

interface ifone {
	public void print_geek();
}

interface iftwo {
	public void print_for();
}

interface ifthree extends ifone, iftwo {
	public void print_geek();
}

class child implements ifthree {
	@Override
	public void print_geek() {
		System.out.println("Geeks");
	}

	public void print_for() {
		System.out.println("for");
	}
}

// Drived class 
public class MultipleInheritence {
	public static void main(String[] args) {
		child c = new child();
		c.print_geek();
		c.print_for();
		c.print_geek();
	}
}
