package mx.com.CurrencyConversor.Model;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {
		String[] option = { "ok" };
		String[] options = { "Si", "No" };
		String[] options2 = { "Conversor de moneda", "Conversor de temperatura" };
		String[] options5 = { "Si", "No", "Cancelar" };
		int choice = JOptionPane.showOptionDialog(null, "Este es un conversor presione si para continuar", null,
				JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
		if (choice == 0) {
			int repeat = 0;
			while (repeat == 0) {
				String choiceConversor = (String) JOptionPane.showInputDialog(null, "Elige el tipo de conversor",
						"Input", JOptionPane.INFORMATION_MESSAGE, null, options2, options2[0]);
				if (choiceConversor == options2[0]) {
					ConversorMonedas.main(args);

				} else {
					ConversorTemperatura.main(args);
				}
				repeat = JOptionPane.showOptionDialog(null, "Desea Continuar ", null, JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, options5, options5[0]);
				if (repeat == 1) {
					mensaje(option, "Programa Terminado ");
					JOptionPane.showOptionDialog(null, "Programa Terminado ", null, JOptionPane.DEFAULT_OPTION,
							JOptionPane.INFORMATION_MESSAGE, null, option, option);
				}
			}

		}
	}

	protected static void mensaje(String[] options, String mensaje) {
		JOptionPane.showOptionDialog(null, mensaje, null, JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE,
				null, options, options);
	}
}
