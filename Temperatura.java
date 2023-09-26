package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
	//converter tempretura de F para C, 	
		final double fator = 5/9.0;
		final double ajuste =32;
		
		final double Fahrenheit = 86;
		final double celsius = (Fahrenheit-ajuste)*fator;
		
		System.out.println("O resultado e:"+ celsius + "C" ) ;
		
	}

}
