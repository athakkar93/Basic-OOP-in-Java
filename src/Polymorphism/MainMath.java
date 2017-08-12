package Polymorphism;

public class MainMath {

	public static void main(String[] args) {
		Math operation = new Math();
		int basicMath = operation.add(4, 7);
		System.out.println(basicMath);
		int simpleMath = operation.add(4, 7, 11);
		System.out.println(simpleMath);
		int easyMath = operation.add(4, 7, 11, 22);
		System.out.println(easyMath);
		
		LoveMath lm = new LoveMath();
		int funky = lm.add(4, 7, 11);
		System.out.println(funky);
		int fun = lm.add(4, 7, 11, 22, 44);
		System.out.println(fun);

	}

}
