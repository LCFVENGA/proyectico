package interfaz;

import javax.swing.JOptionPane;

import mundo.PotenciaInt;

public class Main {

	public static void main(String[] args) {

		switch(JOptionPane.showInputDialog("QUE OPERCION DESEA EFECTUAR\n1.MULTUPLICACION\n2.FACTORIAL\n3.POTENCIA"))
		{
		case "1":
			JOptionPane.showMessageDialog(null, "El resultado de la multi es: "+PotenciaInt.multiplicar(Integer.parseInt(JOptionPane.showInputDialog("numero a")), Integer.parseInt(JOptionPane.showInputDialog("numero b"))));
			break;
		case "2":
			JOptionPane.showMessageDialog(null, "El resultado de la multi es: "+PotenciaInt.factorial(Integer.parseInt(JOptionPane.showInputDialog("numero a"))));
			break;
		case "3":
			JOptionPane.showMessageDialog(null, "El resultado de la multi es: "+PotenciaInt.multiplicar(Integer.parseInt(JOptionPane.showInputDialog("numero a")), Integer.parseInt(JOptionPane.showInputDialog("^b"))));
			break;
			default: JOptionPane.showMessageDialog(null, "Esa opcion no esta.");
			break;
		}
	}

}
