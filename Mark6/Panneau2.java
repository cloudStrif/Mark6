import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Panneau2 extends JPanel {

	int size = 2;
	int size2 = 2;
	// Boutons de departs
	String[][] boutons = new String[size][size2];
	boolean[][] bool = new boolean[size][size2];
	Color couleur = new Color(1, 49, 180);
	int x = 0;
	int y = 0;

	String pero = "Pavel";

	boolean mode = false;

	String TEXTE = "";
	int yy = 20;

	public Panneau2(boolean mode) {
		this.mode = mode;
		// On commence avec Pavel
		boutons[0][0] = "Sword Attack";
		boutons[0][1] = "Spiral storm";
		boutons[1][0] = "Do nothing";
		boutons[1][1] = "Sort speciaux";

	}

	int per = 0;

	public void perso(int perso) {
		this.per = perso;
		if (perso == 0) {
			boutons[0][0] = "Sword Attack";
			boutons[0][1] = "Spiral storm(20pp)";
			boutons[1][0] = "Do nothing";
			boutons[1][1] = "Sort speciaux";
			couleur = new Color(30, 127, 203);
			pero = "pavel";
		} else if (perso == 1) {
			boutons[0][0] = "Angel fall";
			boutons[0][1] = "Fire wings30pp";
			boutons[1][0] = "Fair";
			boutons[1][1] = "Sort speciaux";
			couleur = new Color(121, 28, 248);
			pero = "Cyntia";
		} else if (perso == 2) {
			boutons[0][0] = "cure 10pp";
			boutons[0][1] = "Verry Cure";
			boutons[1][0] = "Do nothing";
			boutons[1][1] = "Sort speciaux";
			couleur = new Color(253, 108, 158);
			pero = "Sophia";
		} else if (perso == -1) {
			// PAVEL
			boutons[0][0] = "Efondrement 20pp";
			boutons[0][1] = "Meteore deodys 35pp";
			boutons[1][0] = "do nothing";
			boutons[1][1] = "?";
			couleur = new Color(30, 127, 203);
			pero = "PAVEL";
		} else if (perso == -2) {
			// PAVEL
			boutons[0][0] = "deferlante 20pp";
			boutons[0][1] = "Hydosplash 20pp";
			boutons[1][0] = "do nothing";
			boutons[1][1] = "?";
			couleur = new Color(121, 28, 248);
			pero = "Cyntia";
		} else if (perso == -3) {
			boutons[0][0] = "Charge d'eau\n20pp";
			boutons[0][1] = "Flash Thunder\n25pp";
			boutons[1][0] = "do nothing";
			boutons[1][1] = "?";
			couleur = new Color(253, 108, 158);
			pero = "Sophia";
		}
	}

	public void norme() {
		for (int i = 0; i < bool[0].length; i++) {
			for (int j = 0; j < bool.length; j++) {
				bool[i][j] = false;
			}
		}
		bool[0][0] = true;
		repaint();
	}

	public void update(int size, int size2) {
		this.size = size;
		this.size2 = size2;
		boutons = new String[size][size2];
		bool = new boolean[size][size2];
	}

	public void paintComponent(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 700, 700);

		ImageIcon imageIcon = new ImageIcon("image/Map/01.png");
		Image w = imageIcon.getImage();
		g.drawImage(w, -60, -50, this.getWidth() + 120, this.getHeight() + 80,
				this);

		if (mode) {
			for (int i = 0; i < boutons.length; i++) {
				for (int j = 0; j < boutons[0].length; j++) {
					g.setColor(Color.BLACK);
					g.fillRect(x, y, (int) (290 / boutons[0].length),
							(int) (200 / boutons.length));

					g.setColor(couleur);
					g.fillRect(x, y, (int) (290 / boutons[0].length) - 1,
							(int) (200 / boutons.length) - 1);

					if (bool[i][j]) {
						g.setColor(new Color(199, 208, 204));
						g.fillRect(x, y, (int) (290 / boutons[0].length) - 1,
								(int) (200 / boutons.length) - 1);
					}
					g.setColor(Color.WHITE);
					g.setFont(new Font("Arial", Font.BOLD, 13));
					g.drawString(boutons[i][j] + "", x, y + 60);
					g.setColor(couleur);
					g.drawString(pero, 100, 350);
					x = x + (int) (290 / boutons[0].length);
				}
				x = 0;
				y = y + (int) (200 / boutons.length);
			}
			g.setColor(Color.BLUE);
			g.setFont(new Font("TimesRoman", Font.BOLD, 15));
			Graphics2D g2 = (Graphics2D) g;
			yy = 230;
			drawString(g2, TEXTE, 15, yy);
		} else {
			yy = 20;
			g.setColor(Color.blue);
			g.setFont(new Font("TimesRoman", Font.BOLD, 15));

			Graphics2D g2 = (Graphics2D) g;

			drawString(g2, TEXTE, 15, yy - 20);

		}
		x = y = 0;
	}

	private void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());
	}

	private void drawtabString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\t"))
			g.drawString(line, x += g.getFontMetrics().getHeight(), y);
	}

	ArrayList<String> mot = new ArrayList<String>();

}
