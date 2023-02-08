package numeroPar;

import javax.swing.JOptionPane;

public class NumeroPar {
	public static void main (String[] args) {
		int numeroIngresado = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número deseado: "));
		if(numeroIngresado % 2 == 0) {
			JOptionPane.showMessageDialog(null, "El numero ingresado es PAR.");
			System.out.println("El numero ingresado es PAR.");
		}else {
			JOptionPane.showMessageDialog(null, "El numero ingresado es IMPAR.");
			System.out.println("El numero ingresado es IMPAR.");
		}
	}
}
