package fundamentos;


public class wrappers {
	public static void main(String[] args) {
		
		
		// Byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer i = Integer.parseInt(entrada.next());
		Integer i = 10000; // int
		Long l = 100000000L;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 100);
		System.out.println(l / 3);
		
		Float f = 123.10f;
		System.out.println(f);
		
		Double d = 123.546;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.err.println(bo.toString().toUpperCase());

		Character c = '$'; // char
		System.out.println(c.toString());
	}
	
}
