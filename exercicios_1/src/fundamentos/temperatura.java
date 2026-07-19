package fundamentos;

public class temperatura {
	public static void main(String[] args) {
		// (ºF - 32) X 5/9 = °C
		
		final short x = 32767;
		final double y = 5.0/9.0;
		double tempFh = 86;
		double tempCh = ((tempFh - x) * y);
		System.out.println("Temperatura de " + tempFh + "°F em celcuis é: " + tempCh + "C°");
		
		tempFh = 86;
		tempCh = ((tempFh - x) * y);
		
		System.out.println("Temperatura de " + tempFh + "°F em celcuis é: " + tempCh + "C°");
		
	}
}
