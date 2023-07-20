package mx.com.CurrencyConversor.Model;


public class ConversorTemperatura extends Conversor {
	
	
	public static void main(String[] args) {
		String[] options = { "De grados Farenheit a celsius", "De grados Celsius a Farenheit" };
		
		double valor  = valorNumero("Por favor  escriba los grados a convertir ");
		String choose = seleccion(options,"Elija los grados a convertir ");
		double newValue = 0;
		
		if (choose == options[0]) {
			newValue = (valor - 32) / 1.8;
		} else {
			newValue = (valor * 9 / 5) + 32;
		}
		ultimoMensaje(" son: ",newValue);
	}
}
