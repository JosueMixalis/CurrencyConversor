package mx.com.CurrencyConversor.Model;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Conversor {

	private static Double inputValue;
	private static String change;

	protected static double valorNumero(String requerimiento) {
		String input = JOptionPane.showInputDialog(requerimiento);
		inputValue = Double.parseDouble(input);
		return inputValue;
	}

	protected static String seleccion(String[] options, String frase) {
		change = (String) JOptionPane.showInputDialog(null, frase , "Input", JOptionPane.INFORMATION_MESSAGE, null,
				options, options[0]);
		return change;
	}

	protected static void ultimoMensaje(String mensaje, Double nuevoValor) {
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		JOptionPane.showMessageDialog(null,
				inputValue + " " + change.toLowerCase() + mensaje + decimalFormat.format(nuevoValor));
	}
}
