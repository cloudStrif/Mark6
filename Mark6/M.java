import java.awt.Image;

import javax.swing.ImageIcon;

public class M {
        /**
        Cette classe crypte le code en spammant des lignes de codes
        */
	Memoire m = new Memoire();

	public M() {
		String ss = "";
		ss = "switch(speciau[7]){\n";
		for (int i = 1; i <= 264; i++) {
			if (i < 10) {
				ss += "case " + i + " : ImageIcon im" + i
						+ " = new ImageIcon(\"mattack/00" + i
						+ ".PNG\"); \nImage w" + i + " = im" + i
						+ ".getImage() ; \ng.drawImage(w" + i
						+ ",0,0,500,500,this); \nbreak ;\n\n\n ";
			} else if (i < 100) {
				ss += "case " + i + " : ImageIcon im" + i
						+ " = new ImageIcon(\"mattack/0" + i
						+ ".PNG\"); \nImage w" + i + " = im" + i
						+ ".getImage() ; \ng.drawImage(w" + i
						+ ",0,0,500,500,this); \nbreak ;\n\n\n ";
			} else {
				ss += "case " + i + " : ImageIcon im" + i
						+ " = new ImageIcon(\"mattack/" + i
						+ ".PNG\"); \nImage w" + i + " = im" + i
						+ ".getImage() ; \ng.drawImage(w" + i
						+ ",0,0,500,500,this); \nbreak ;\n\n\n ";
			}
		}
		ss += "}";
		m.ecrire("a", ss);

	}

	public static void main(String[] args) {
		new M();
	}
}
