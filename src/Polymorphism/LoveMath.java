package Polymorphism;

public class LoveMath extends Math {
	
	public int add(int x, int y, int z) {
		int total = x + y + z -10;
		return total;
	}
	
	public int add(int x, int y, int z, int q, int w) {
		int total = x + y + z + q + w;
		return total;
	}

}
