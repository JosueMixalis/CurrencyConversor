/**
 * Menu(Conversor.General)-Este programa hace conversiones 
 * 
 * Este programa le pide al usuario que eliga entre las conversiones en el programa
 * le pude al usuario algun valor y con este hace las conversion que se haya seleccionada
 * y se devuelve al valor al usuario
 * 
 * @author Josue Mixalis.
 */


package mx.com.CurrencyConversor.Model;

import javax.swing.JOptionPane;

public class Menu {

	public static void main(String[] args) {

		String[] option = { "ok" };
		String[] options = { "Si", "No" };
		String[] options2 = { "Conversor de moneda", "Conversor de temperatura" };


		int eleccion = 0;
		while (eleccion != 10) {
			switch (eleccion) {
			case 0:
				int choice = JOptionPane.showOptionDialog(null, "Este es un conversor presione si para continuar", null,
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				if (choice == 0)
					eleccion = 1;
				if (choice == 1)
					eleccion = 5;
				break;
			case 1:
				String choiceConversor = (String) JOptionPane.showInputDialog(null, "Elige el tipo de conversor",
						"Input", JOptionPane.INFORMATION_MESSAGE, null, options2, options2[0]);
				if (choiceConversor == options2[0])
					eleccion = 2;
				else
					eleccion = 3;
				if (choiceConversor == null)
					System.exit(0);
				break;
			case 2:
				ConversorMonedas.main(args);
				eleccion = 4;
				break;
			case 3:
				ConversorTemperatura.main(args);
				eleccion = 4;
				break;
			case 4:
				int eleccionRepeticion = JOptionPane.showOptionDialog(null, "Desea Continuar ", null,
						JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
				if (eleccionRepeticion == 1)
					eleccion = 5;
				else if (eleccionRepeticion == 0)
					eleccion = 1;
				else
					eleccion = 10;
				break;
			case 5:
				JOptionPane.showOptionDialog(null, "Programa Terminado ", null, JOptionPane.DEFAULT_OPTION,
						JOptionPane.INFORMATION_MESSAGE, null, option, option);
				eleccion = 10;
				break;
			default:
				break;
			}
		}
	}
}
