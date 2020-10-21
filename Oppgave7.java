package innlevering;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave7 {

	public static void main(String[] args) {
		for (int elever=10; elever>0; elever--) {
		String poengsum  =showInputDialog("Tast inn poengsum");
		int psum = Integer.parseInt(poengsum);
		String resultat = "";
		
		if (psum <= -1) {
			elever++;
			resultat += "Ugyldig inntasting!";
											
		}
		else if (psum <= 39) {
			resultat += "Dette gir karakteren F";
		}
		else if (psum <= 49) {
			resultat += "Dette gir karakteren E";
		}
		else if (psum <= 59) {
			resultat += "Dette gir karakteren D";
		}
		else if (psum <= 79) {
			resultat += "Dette gir karakteren C";
		}
		else if (psum <= 89) {
			resultat += "Dette gir karakteren B";
		}
		else if (psum <= 100) {
			resultat += "Gratulerer! Dette gir karakteren A";
		}

		else {
			resultat += "Ugyldig inntasting";
		}
		
		showMessageDialog(null, resultat);
		}
	}

}
