/**
 * Conversor Temperatura - Agrega toda la funcionalidad para la conversion de temperaturas
 * 
 * Extiende El conversor y lo aplica para recibir y enviar los mensajes al usuario
 * para obtener el input depues lo maneja dependiendo la opcion elegida y devuelve el valor
 * del conversor
 * 
 * @author Josue Mixalis.
 */

package mx.com.CurrencyConversor.Model;

public class ConversorTemperatura extends Conversor {
	
	
	public static void main(String[] args) {
		String[] options = { "De grados Farenheit a celsius", "De grados Celsius a Farenheit",
				"De grados Celsius a Kelvin", "De grados Kelvin a Celsius" };
		
		double valor  = valorNumero("Por favor  escriba los grados a convertir ");
		String choose = seleccion(options,"Elija los grados a convertir ");
		double newValue = 0;
		
		switch (choose) {
		case "De grados Farenheit a celsius":
			newValue = (valor - 32) / 1.8;
			break;
		case "De grados Celsius a Farenheit":
			newValue = (valor * 9 / 5) + 32;
			break;
		case "De Grados Celsius a Kelvin":
			newValue = valor+273.15;
			break;
		case "De grados Kelvin a Celsius":
			newValue = valor-273.15;
			break;

		default:
			break;
		}
	
		ultimoMensaje(" son: ",newValue);
	}
}
