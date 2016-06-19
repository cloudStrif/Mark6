import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class ZAffichage extends JPanel {
	/* Classe qui gere l affichage de l'interface graphique*/
	int[][] t = new int[12][10];
	int x = 0;
	int y = 0;
	boolean won = false;
	int orientation = 0;
	int avance = 1;
	int mechant = 0;
	int mechant1 = 0;
	int mechant2 = 0;
	int mechant3 = 0;
	int mechant4 = 0;
	int vie = 9;
	boolean couleur = false;

	boolean makeLaby = true;

	public void affiche(Graphics g) {
		if (vie >= 26)
			vie = 26;
		if (vie <= 0)
			System.exit(0);
		for (int i = 0; i < t.length; i++) {
			for (int j = 0; j < t[0].length; j++) {
				ImageIcon imageIcon;
				// if (makeLaby)
				// imageIcon = new ImageIcon("ressource/tileb2.png");
				// else
				// imageIcon = new ImageIcon("ressource/tileblue2.png");
				// imageIcon = new ImageIcon("ressource/fond.png");
				// Image w = imageIcon.getImage();

				// g.drawImage(w, x, y, this.getWidth(),this.getHeight(), this);

				if (t[i][j] == 2) {
					ImageIcon image;
					if (makeLaby)
						image = new ImageIcon("ressource/tileb.png");
					else
						image = new ImageIcon("ressource/tilegr.png");
					Image d = image.getImage();

					g.drawImage(d, x, y, (int) (600 / t[0].length),
							(int) (600 / t.length), this);
				}
				if (t[i][j] == 40) {
					if (mechant4 == 0) {
						ImageIcon imag22 = new ImageIcon("ressource/bat.png");
						Image w22 = imag22.getImage();

						g.drawImage(w22, x, y, (int) (600 / t[0].length),
								(int) (600 / t.length), this);
					} else if (mechant4 == 1) {
						ImageIcon imag = new ImageIcon("ressource/bat2.png");
						Image w2 = imag.getImage();

						g.drawImage(w2, x, y, (int) (600 / t[0].length),
								(int) (600 / t.length), this);
					}
				}
				if (t[i][j] == 12) {
					if (couleur) {
						if (mechant3 == 4) {
							ImageIcon imag22 = new ImageIcon(
									"ressource/chb.png");
							Image w22 = imag22.getImage();

							g.drawImage(w22, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
						} else if (mechant3 == 3) {
							ImageIcon imag = new ImageIcon("ressource/chb2.png");
							Image w2 = imag.getImage();

							g.drawImage(w2, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
						}
						if (mechant3 == 1) {
							ImageIcon imag22 = new ImageIcon(
									"ressource/chh.png");
							Image w22 = imag22.getImage();

							g.drawImage(w22, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
						} else if (mechant3 == 2) {
							ImageIcon imag = new ImageIcon("ressource/chh2.png");
							Image w2 = imag.getImage();

							g.drawImage(w2, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
						}
					} else {
						if (mechant3 == 4) {
							ImageIcon imag22 = new ImageIcon(
									"ressource/chbo.png");
							Image w22 = imag22.getImage();

							g.drawImage(w22, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
						} else if (mechant3 == 3) {
							ImageIcon imag = new ImageIcon(
									"ressource/chbo2.png");
							Image w2 = imag.getImage();

							g.drawImage(w2, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
						}
						if (mechant3 == 1) {
							ImageIcon imag22 = new ImageIcon(
									"ressource/chbo3.png");
							Image w22 = imag22.getImage();

							g.drawImage(w22, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
						} else if (mechant3 == 2) {
							ImageIcon imag = new ImageIcon(
									"ressource/chbo4.png");
							Image w2 = imag.getImage();

							g.drawImage(w2, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
						}
					}

				}

				if (t[i][j] == 4) {
					if (mechant == 0) {
						ImageIcon imag22 = new ImageIcon("ressource/mg.png");
						Image w22 = imag22.getImage();

						g.drawImage(w22, x, y, (int) (600 / t[0].length),
								(int) (600 / t.length), this);
					} else if (mechant == 1) {
						ImageIcon imag = new ImageIcon("ressource/md.png");
						Image w2 = imag.getImage();

						g.drawImage(w2, x, y, (int) (600 / t[0].length),
								(int) (600 / t.length), this);
					}
				}
				if (t[i][j] == 5) {
					if (mechant1 == 0) {
						ImageIcon imag22 = new ImageIcon("ressource/m2g.png");
						Image w22 = imag22.getImage();

						g.drawImage(w22, x, y, (int) (600 / t[0].length),
								(int) (600 / t.length), this);
					} else if (mechant1 == 1) {
						ImageIcon imag = new ImageIcon("ressource/m2d.png");
						Image w2 = imag.getImage();

						g.drawImage(w2, x, y, (int) (600 / t[0].length),
								(int) (600 / t.length), this);
					}
				}
				if (t[i][j] == 7) {
					ImageIcon imag22 = new ImageIcon("ressource/coeur.png");
					Image w22 = imag22.getImage();

					g.drawImage(w22, x, y, (int) (600 / t[0].length),
							(int) (600 / t.length), this);
				}

				if (t[i][j] == 1) {
					if (orientation == 0) {
						switch (avance) {
						case 1:

							ImageIcon imag = new ImageIcon("ressource/lb.png");
							Image w2 = imag.getImage();

							g.drawImage(w2, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
							break;

						case 2:

							ImageIcon image = new ImageIcon("ressource/lb2.png");
							Image d = image.getImage();

							g.drawImage(d, x, y, (int) (600 / t[0].length) + 5,
									(int) (600 / t.length) + 5, this);
							break;
						case 3:

							ImageIcon image3 = new ImageIcon("ressource/sb.png");
							Image d3 = image3.getImage();

							g.drawImage(d3, x, y,
									(int) (600 / t[0].length) + 10,
									(int) (600 / t.length) + 40, this);
							break;
						}
					}
					if (orientation == 1) {
						switch (avance) {
						case 1:
							ImageIcon imag = new ImageIcon("ressource/lg.png");
							Image w2 = imag.getImage();

							g.drawImage(w2, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
							break;

						case 2:

							ImageIcon image = new ImageIcon("ressource/lg2.png");
							Image d = image.getImage();

							g.drawImage(d, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
							break;
						case 3:

							ImageIcon ima4 = new ImageIcon("ressource/sg.png");
							Image d4 = ima4.getImage();

							g.drawImage(d4, x - 30, y - 10,
									(int) (600 / t[0].length) + 30,
									(int) (600 / t.length) + 20, this);
							break;
						}
					}
					if (orientation == 2) {
						switch (avance) {
						case 1:

							ImageIcon imag = new ImageIcon("ressource/ld.png");
							Image w2 = imag.getImage();

							g.drawImage(w2, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
							break;

						case 2:

							ImageIcon image = new ImageIcon("ressource/ld2.png");
							Image d = image.getImage();

							g.drawImage(d, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
							break;
						case 3:

							ImageIcon image5 = new ImageIcon("ressource/sd.png");
							Image d5 = image5.getImage();

							g.drawImage(d5, x, y,
									(int) (600 / t[0].length) + 50,
									(int) (600 / t.length), this);
							break;
						}
					}
					if (orientation == 3) {
						switch (avance) {
						case 1:

							ImageIcon imag = new ImageIcon("ressource/lh.png");
							Image w2 = imag.getImage();

							g.drawImage(w2, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
							break;

						case 2:

							ImageIcon image = new ImageIcon("ressource/lh2.png");
							Image d = image.getImage();

							g.drawImage(d, x, y, (int) (600 / t[0].length),
									(int) (600 / t.length), this);
							break;
						case 3:

							ImageIcon image6 = new ImageIcon("ressource/sh.png");
							Image d6 = image6.getImage();

							g.drawImage(d6, x, y - 30,
									(int) (600 / t[0].length),
									(int) (600 / t.length) + 30, this);
							break;
						}
					}
				}
				ImageIcon image6 = new ImageIcon("ressource/coeur.png");
				Image d6 = image6.getImage();
				for (int k = 0; k < vie; k++) {
					g.drawImage(d6, 20 + k * 15, 40, this);
				}

				if (t[i][j] == 11) {
					ImageIcon image64 = new ImageIcon("ressource/zelda.png");
					Image d64 = image64.getImage();

					g.drawImage(d64, x, y, (int) (600 / t[0].length),
							(int) (600 / t.length), this);
				}
				if (t[i][j] == 42) {
					ImageIcon image64 = new ImageIcon("ressource/zeld.png");
					Image d64 = image64.getImage();

					g.drawImage(d64, x, y, (int) (600 / t[0].length),
							(int) (600 / t.length), this);
				}
				if (t[i][j] == 111) {
					ImageIcon image64 = new ImageIcon("ressource/cat.png");
					Image d64 = image64.getImage();

					g.drawImage(d64, x, y, (int) (600 / t[0].length),
							(int) (600 / t.length), this);
				}

				if (t[i][j] == 6) {
					ImageIcon image64 = new ImageIcon("ressource/spider.png");
					Image d64 = image64.getImage();

					g.drawImage(d64, x, y, (int) (600 / t[0].length),
							(int) (600 / t.length), this);
				}

				x = x + (int) (600 / t[0].length);
			}
			x = 0;
			y = y + (int) (600 / t.length);
		}
		x = y = 0;
	}

	boolean af = false;
	boolean won2 = false;

	public void paintComponent(Graphics g) {
		ImageIcon imageIcon = new ImageIcon("ressource/fond.png");
		Image w = imageIcon.getImage();

		g.drawImage(w, x, y, this.getWidth(), this.getHeight() + 30, this);
		affiche(g);
		if (af) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 600, 600);
		}

		if (won) {
			g.setColor(Color.white);
			g.setFont(new Font("Arial", Font.BOLD, 25));
			drawString(g, TEXTE, 100, 330);
		}
		if (won2) {
			g.setColor(Color.white);
			g.setFont(new Font("Arial", Font.BOLD, 18));
			drawString(g, TEXTE, 150, 305);
		}
		ImageIcon image648 = new ImageIcon("ressource/epe.png");
		Image d64f = image648.getImage();
		g.setFont(new Font("Arial", Font.BOLD, 13));
		g.setColor(Color.WHITE);
		g.drawString("Espace ou Enter =", 350, 40);
		g.drawImage(d64f, 470, 10, 80, 50, this);
	}

	private void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());
	}

	String TEXTE = "";
}
