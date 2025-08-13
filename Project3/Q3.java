package java_project3;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer wrappedInt = Integer.valueOf(42);
        int primitiveInt = wrappedInt;
        int result = primitiveInt + 8;
        System.out.println("Unboxed value: " + primitiveInt);
        System.out.println("Result after addition: " + result);

	}

}
