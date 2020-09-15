package innlevering;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave6 {

	public static void main(String[] args) {
		String inntektstreng  =showInputDialog("Tast inn din inntekt for å beregne skattesats");
		int inntekt = Integer.parseInt(inntektstreng);
		String resultat = "";
		
		if (inntekt <= 180800) {
			resultat += "Ingen ekstra trinnskatt";
		}
		else if (inntekt <= 254500) {
			resultat += "1.9% ekstra trinnskatt";
		}
		else if (inntekt <= 639750) {
			resultat += "4.2% ekstra trinnskatt";
		}
		else if (inntekt <= 999550) {
			resultat += "13.2% ekstra trinnskatt";
		}
		else {
			resultat += "16.2% ekstra trinnskatt";
		}
		
		showMessageDialog(null, resultat);
	}
}