
/**
 * Conversor Monedas - Agrega toda la funcionalidad para la conversion de Monedas
 * 
 * Extiende El conversor y lo aplica para recibir y enviar los mensajes al usuario
 * para obtener el input depues lo maneja dependiendo la opcion elegida y devuelve el valor
 * del conversor 
 * 
 * @author Josue Mixalis.
 */

package mx.com.CurrencyConversor.Model;

import java.util.HashMap;

public class ConversorMonedas extends Conversor {

	public static void main(String[] args) {

		String[] options = { "De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen",
				"De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos",
				"De Won Coreano a Pesos",};
		Double[] values = { 0.06, 0.053, 0.046, 8.29, 75.51, 16.75, 18.82, 21.85, 0.12, 0.013};

		HashMap<String, Double> relations = new HashMap<String, Double>();
		for (int i = 0; i < values.length; i++) {
			relations.put(options[i], values[i]);
		}

		double valor = valorNumero("Por favor ponga el valor ");
		String choose = seleccion(options, "Seleccione el tipo de cambio a hacer");

		Double newValue = valor * relations.get(choose);

		ultimoMensaje(" Son: $ ", newValue);
	}

}
