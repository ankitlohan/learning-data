package Java;

public class SecondClass {

	public static void main(String[] args) {
		String name = "Ankit Lohan";
		System.out.println(name.length());
		
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		System.out.println(name.trim());
		System.out.println(name.substring(4));
		
		System.out.println(name.substring(2, 6));
		
		System.out.println(name.repeat(2));
		System.out.println(name.replace("nk", "yy"));
		
		System.out.println(name.startsWith("An"));
		System.out.println(name.endsWith("  "));
		System.out.println(name.charAt(4));
		
		System.out.println(name.indexOf("k"));
		System.out.println(name.indexOf("n", 1));
		
		System.out.println(name.lastIndexOf("a"));
		System.out.println(name.lastIndexOf("a", 1));
		
		System.out.println(name.equals("ankit"));
		System.out.println(name.equalsIgnoreCase("ankit lohan"));

	}

}
