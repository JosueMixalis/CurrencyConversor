/**
 * Conversor - agrega las partes esenciales para los conversores.
 * 
 * Descripcion:
 * 	Esta clase agrega los metodos valorNumero para recibir el valor a convertir.
 * 	el metodo seleccion selecciona la conversion a hacer, el metodo ultimo 
 * 	da el valor ya hecho la conversion 
 * 
 * @author Josue Mixalis.
 */

package mx.com.CurrencyConversor.Model;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public abstract class Conversor {

	private static Double inputValue;
	private static String change;

	/**
	 * Lanza un mensaje para que se pueda escribir el input
	 * 
	 * @param requerimiento
	 * @return double
	 */

	protected static double valorNumero(String requerimiento) {
		boolean numero = false;
		String input = null;
		do {
			input = JOptionPane.showInputDialog(requerimiento);
			if (input == null)
				System.exit(0);
			numero = isNumber(input);
			if (numero == false)
				JOptionPane.showMessageDialog(null, "Por favor introduzca un numero de la forma: ###.##");
		} while (numero == false);
		inputValue = Double.parseDouble(input);
		return inputValue;
	}

	/**
	 * Lanza un mensaje donde pide al usuario la seleccion entre una opcion de las
	 * que se hizo en un array para que el usuario pueda elegir entre ellas
	 * devolviendo un string para hacer el cambio debido a su eleccion.
	 * 
	 * @param options
	 * @param frase
	 * @return String
	 */
	protected static String seleccion(String[] options, String frase) {
		change = (String) JOptionPane.showInputDialog(null, frase, "Input", JOptionPane.INFORMATION_MESSAGE, null,
				options, options[0]);
		if (change == null)
			System.exit(0);
		return change;
	}

	/**
	 * Lanza un mensaje con el valor obtenido una vez hecha la conversion-
	 * 
	 * @param mensaje
	 * @param nuevoValor
	 */

	protected static void ultimoMensaje(String mensaje, Double nuevoValor) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null,
				inputValue + " " + change.toLowerCase() + mensaje + decimalFormat.format(nuevoValor));
	}

	/**
	 * Verefica si el string es un double
	 * 
	 * @param valor
	 * @return true si es double
	 */
	protected static boolean isNumber(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		} catch (NumberFormatException e) {
			return false;
		}
	}
	
}
