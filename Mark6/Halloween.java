import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;

public class Halloween extends JFrame {

	private JPanel container = new JPanel();
	private JTextArea jtf;
	ZAffichage p = new ZAffichage();
	// position de link
	int posx = 5;
	int posy = 1;

	Grid myGrid;
	Cellule cel;
	Thread mechant;

	public Halloween(Grid myGrid, boolean boo) {
		setTitle("Maze castle");
		setSize(1020, 620);
		p.makeLaby = boo;
		// setResizable(false);
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setLocationRelativeTo(null);
		container.setLayout(new BorderLayout());
		container.add(p, BorderLayout.CENTER);

		jtf = new JTextArea(myGrid.detail(false));
		jtf.setFont(new Font("TimesRoman", Font.BOLD, 20));
		jtf.setEditable(false);
		jtf.addKeyListener(new ClavierListener());
		jtf.setBackground(new Color(30, 30, 30));
		jtf.setForeground(Color.GREEN);
		JPanel south = new JPanel();
		south.add(jtf);

		container.add(south, BorderLayout.SOUTH);
		setContentPane(container);

		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				new JScrollPane(jtf), new JScrollPane(p));
		split.setDividerLocation(400);

		getContentPane().add(split, BorderLayout.CENTER);
		// initialisation
		cel = myGrid.cell[0][0];
		tab(cel);
		p.t[posy][posx] = 1;
		p.repaint();
		this.setVisible(true);

		if (boo)
			music("ressource/lastempl.mid", 100);
		else
			music("ressource/m2.mid", 100);

	}

	class Zar implements Runnable {
		public void run() {
			while (true) {
				for (int i = 0; i < 20; i++) {
					if (i % 2 == 0)
						p.t[5][5] = 11;
					else
						p.t[5][5] = 42;
					p.repaint();
					pause(300);
				}
			}
		}
	}

	boolean zelda = true;
	int posm = 6;
	int posm2 = 6;
	Thread zeldaa;

	// traduit dans t la cellule
	public void tab(Cellule cel) {

		if (mechant != null)
			mechant.stop();
		if (mechant1 != null)
			mechant1.stop();
		if (mechant2 != null)
			mechant2.stop();
		if (mechant3 != null)
			mechant3.stop();
		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 10; j++) {
				p.t[i][j] = 0;
			}
		}
		int rand;
		if (zelda)
			rand = -2;
		else
			rand = (int) (Math.random() * 11);

		if (zelda) {
			p.won2 = true;
			p.TEXTE = "j ai perdu mon petit chat !\nmon bebe s'est perdu !\nil est quelque part au fond\n du labyrinthe !\nHELP";

			p.t[5][5] = 11;
			zeldaa = new Thread(new Zar());
			zeldaa.start();
			zelda = false;
		}
		for (int i = 0; i < 6; i++) {

			if (cel.getNeighbor(i).isWall() == true) {
				switch (i) {
				case Cellule.WEST:
					for (int j = 4; j <= 7; j++) {
						p.t[j][0] = 2;
					}
					break;
				case Cellule.EAST:
					for (int j = 4; j <= 7; j++) {
						p.t[j][9] = 2;
					}
					break;
				case Cellule.SOUTHEAST:

					for (int j = 0; j <= 4; j++) {
						p.t[11 - j][5 + j] = 2;
					}
					break;
				case Cellule.SOUTHWEST:
					for (int j = 0; j < 5; j++) {
						p.t[11 - j][4 - j] = 2;
					}
					break;
				case Cellule.NORTHEAST:
					for (int j = 0; j < 5; j++) {
						p.t[0 + j][5 + j] = 2;
					}
					break;
				case Cellule.NORTHWEST:
					for (int j = 0; j < 5; j++) {
						p.t[0 + j][4 - j] = 2;
					}
					break;
				}
			}

		}
		if (cel.hasNeighbor(5) == false && cel.hasNeighbor(2) == false
				&& cel.hasNeighbor(4) == false) {
			sequencer.stop();
			music("ressource/zelda.mid", 100);
			p.TEXTE = "Bravo ! Vous avez gagne !!\nVous avez retrouve le chat\nde Zelda !! \n";

			p.t[5][6] = 111;
			p.t[5][5] = 11;
			p.t[5][3] = 1;
			zeldaa = new Thread(new Zar());
			zeldaa.start();
			p.won = true;
			move = false;
			p.repaint();
		} else {
			if (Math.random() >= 0.5) {
				// 7 = hurt
				p.t[7][4] = 7;
			}
			if (rand >= 0)
				zeldaa.stop();
			if (rand == 0) {
				posm = 4;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 5;
				mechant1 = new Thread(new Mechant(posm, posm2, 1));
				mechant1.start();
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 4;
				mechant = new Thread(new Mechant(posm, posm2, 0));
				mechant.start();
			} else if (rand == 1) {
				posm = 4;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 5;
				mechant1 = new Thread(new Mechant(posm, posm2, 1));
				mechant1.start();
			} else if (rand == 2) {
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 4;
				mechant = new Thread(new Mechant(posm, posm2, 0));
				mechant.start();
			} else if (rand == 3) {
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 6;
				mechant = new Thread(new Mechant(posm, posm2, 2));
				mechant.start();
				posm = 4;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 5;
				mechant1 = new Thread(new Mechant(posm, posm2, 1));
				mechant1.start();
			} else if (rand == 4) {
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 6;
				mechant = new Thread(new Mechant(posm, posm2, 2));
				mechant.start();
				posm = 4;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 5;
				mechant1 = new Thread(new Mechant(posm, posm2, 1));
				mechant1.start();
			} else if (rand == 5) {
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 12;
				mechant2 = new Thread(new Mechant(posm, posm2, 3));
				mechant2.start();
			} else if (rand == 6) {
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 12;
				mechant2 = new Thread(new Mechant(posm, posm2, 3));
				mechant2.start();
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 6;
				mechant = new Thread(new Mechant(posm, posm2, 2));
				mechant.start();
				posm = 4;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 5;
				mechant1 = new Thread(new Mechant(posm, posm2, 1));
				mechant1.start();
			} else if (rand == 7) {
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 40;
				mechant3 = new Thread(new Mechant(posm, posm2, 4));
				mechant3.start();
			} else if (rand == 8) {
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 40;
				mechant3 = new Thread(new Mechant(posm, posm2, 4));
				mechant3.start();
				posm = 4;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 5;
				mechant1 = new Thread(new Mechant(posm, posm2, 1));
				mechant1.start();
			} else if (rand == 9) {
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 40;
				mechant3 = new Thread(new Mechant(posm, posm2, 4));
				mechant3.start();
				posm = 6;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 12;
				mechant2 = new Thread(new Mechant(posm, posm2, 3));
				mechant2.start();
				posm = 4;
				posm2 = 2 + (int) (Math.random() * 6);
				p.t[posm2][posm] = 5;
				mechant1 = new Thread(new Mechant(posm, posm2, 1));
				mechant1.start();
			}
			if (Math.random() >= .5) {
				p.couleur = false;
			} else {
				p.couleur = true;
			}
		}
	}

	public void ecrire(String f) {
		p.won2 = true;
		// Texte a droite

		p.TEXTE = "";
		String cont = "";

		for (int i = 0; i < f.length(); i++) {
			cont += f.charAt(i);
			p.TEXTE = cont;
			p.repaint();

			pause(200);
		}
		p.won2 = false;
		p.repaint();

	}

	Thread mechant1;
	Thread mechant2;
	Thread mechant3;

	class Mechant implements Runnable {
		int posm;
		int posm2;
		int o;

		public Mechant(int posm, int posm2, int o) {
			this.posm = posm;
			this.posm2 = posm2;
			this.o = o;
		}

		public void avance() {
			for (int i = 0; i < 5; i++) {
				p.mechant = 0;
				if (p.t[posm2][posm - 1] <= 1 && posm > 1) {
					p.t[posm2][posm] = 0;
					posm--;
					p.t[posm2][posm] = 4;
					p.repaint();
					pause(400);
					if (p.t[posm2][posm - 1] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
			for (int i = 0; i < 5; i++) {
				p.mechant = 1;
				if (p.t[posm2][posm + 1] <= 1 && posm < 8) {
					p.t[posm2][posm] = 0;
					posm++;
					p.t[posm2][posm] = 4;
					p.repaint();
					pause(400);
					if (p.t[posm2][posm - 1] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
		}

		public void avance1() {
			for (int i = 0; i < 5; i++) {
				p.mechant1 = 0;
				if (p.t[posm2][posm - 1] <= 1 && posm > 1) {
					p.t[posm2][posm] = 0;
					posm--;
					p.t[posm2][posm] = 5;
					p.repaint();
					pause(400);
					if (p.t[posm2][posm - 1] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
			for (int i = 0; i < 5; i++) {
				p.mechant1 = 1;
				if (p.t[posm2][posm + 1] <= 1 && posm < 8) {
					p.t[posm2][posm] = 0;
					posm++;
					p.t[posm2][posm] = 5;
					p.repaint();
					pause(400);
					if (p.t[posm2][posm - 1] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
		}

		public void avance2() {
			for (int i = 0; i < 5; i++) {
				p.mechant1 = 0;
				if (p.t[posm2][posm - 1] <= 1 && posm > 1) {
					p.t[posm2][posm] = 0;
					posm--;
					p.t[posm2][posm] = 6;
					p.repaint();
					pause(400);
					if (p.t[posm2][posm - 1] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
			for (int i = 0; i < 5; i++) {
				p.mechant1 = 1;
				if (p.t[posm2 + 1][posm] <= 1 && posm2 < 10) {
					p.t[posm2][posm] = 0;
					posm2++;
					p.t[posm2][posm] = 6;
					p.repaint();
					pause(400);
					if (p.t[posm2 + 1][posm] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
			for (int i = 0; i < 5; i++) {
				p.mechant1 = 1;
				if (p.t[posm2][posm + 1] <= 1 && posm < 8) {
					p.t[posm2][posm] = 0;
					posm++;
					p.t[posm2][posm] = 6;
					p.repaint();
					pause(400);
					if (p.t[posm2][posm - 1] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
		}

		public void avance3() {
			p.mechant3 = 1;
			for (int i = 0; i < 5; i++) {
				p.mechant3++;
				if (p.mechant3 == 3)
					p.mechant3 = 1;
				if (p.t[posm2 - 1][posm] <= 1 && posm2 > 4) {
					p.t[posm2][posm] = 0;
					posm2--;
					p.t[posm2][posm] = 12;
					p.repaint();
					pause(400);
					if (p.t[posm2 - 1][posm] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
			p.mechant3 = 3;
			for (int i = 0; i < 5; i++) {
				p.mechant3++;
				if (p.mechant3 == 5)
					p.mechant3 = 3;
				if (p.t[posm2 + 1][posm] <= 1 && posm2 < 8) {
					p.t[posm2][posm] = 0;
					posm2++;
					p.t[posm2][posm] = 12;
					p.repaint();
					pause(400);
					if (p.t[posm2 + 1][posm] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
		}

		public void avance4() {
			for (int i = 0; i < 5; i++) {
				p.mechant4++;
				if (p.mechant4 == 2)
					p.mechant4 = 0;
				if (p.t[posm2][posm - 1] <= 1 && posm > 1) {
					p.t[posm2][posm] = 0;
					posm--;
					p.t[posm2][posm] = 40;
					p.repaint();
					pause(400);
					if (p.t[posm2][posm - 1] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
			for (int i = 0; i < 5; i++) {
				p.mechant4++;
				if (p.mechant4 == 2)
					p.mechant4 = 0;

				if (p.t[posm2 + 1][posm] <= 1 && posm2 < 10) {
					p.t[posm2][posm] = 0;
					posm2++;
					p.t[posm2][posm] = 40;
					p.repaint();
					pause(400);
					if (p.t[posm2 + 1][posm] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}
			for (int i = 0; i < 5; i++) {
				p.mechant4++;
				if (p.mechant4 == 2)
					p.mechant4 = 0;

				if (p.t[posm2][posm + 1] <= 1 && posm < 8) {
					p.t[posm2][posm] = 0;
					posm++;
					p.t[posm2][posm] = 40;
					p.repaint();
					pause(400);
					if (p.t[posm2][posm - 1] == 1) {
						p.vie--;
						Thread hurt = new Thread(new Hurt());
						hurt.start();
					}
				}
			}

		}

		public void run() {
			while (true) {
				if (o == 0)
					avance();
				else if (o == 1)
					avance1();
				else if (o == 2)
					avance2();
				else if (o == 3)
					avance3();
				else if (o == 4)
					avance4();
			}
		}
	}

	public boolean zone(int z) {
		if (z == Cellule.WEST) {
			for (int i = 4; i <= 7; i++) {
				if (p.t[i][0] == 1) {
					return true;
				}
			}
			return false;
		} else if (z == Cellule.EAST) {
			for (int i = 4; i <= 7; i++) {
				if (p.t[i][9] == 1) {
					return true;
				}
			}
			return false;
		} else if (z == Cellule.NORTHWEST) {
			for (int i = 0; i <= 4; i++) {
				if (p.t[0][i] == 1) {
					return true;
				}
			}
			for (int i = 0; i <= 3; i++) {
				if (p.t[i][0] == 1) {
					return true;
				}
			}
			return false;
		} else if (z == Cellule.NORTHEAST) {
			for (int i = 5; i <= 9; i++) {
				if (p.t[0][i] == 1) {
					return true;
				}
			}
			for (int i = 0; i <= 3; i++) {
				if (p.t[i][9] == 1) {
					return true;
				}
			}
			return false;
		} else if (z == Cellule.SOUTHWEST) {
			for (int i = 7; i <= 11; i++) {
				if (p.t[i][0] == 1) {
					return true;
				}
			}
			for (int i = 0; i <= 4; i++) {
				if (p.t[11][i] == 1) {
					return true;
				}
			}
			return false;
		} else if (z == Cellule.SOUTHEAST) {
			for (int i = 5; i <= 9; i++) {
				if (p.t[11][i] == 1) {
					return true;
				}
			}
			for (int i = 7; i <= 11; i++) {
				if (p.t[i][9] == 1) {
					return true;
				}
			}
			return false;
		}
		return false;
	}

	Thread pass;

	class P implements Runnable {
		public void run() {
			p.af = true;
			pause(200);
			p.af = false;
			p.repaint();
		}
	}

	boolean move = true;

	class ClavierListener implements KeyListener {

		public void keyPressed(KeyEvent arg0) {
			if (zone(Cellule.NORTHWEST)) {
				cel = cel.getNeighbor(Cellule.NORTHWEST).getCell();

				p.t[posy][posx] = 0;
				posx = 8;
				posy = 10;
				p.t[posy][posx] = 1;
				tab(cel);
				pass = new Thread(new P());
				pass.start();
			}
			if (zone(Cellule.NORTHEAST)) {
				cel = cel.getNeighbor(Cellule.NORTHEAST).getCell();

				p.t[posy][posx] = 0;
				posx = 1;
				posy = 10;
				p.t[posy][posx] = 1;
				tab(cel);
				pass = new Thread(new P());
				pass.start();
			}
			if (zone(Cellule.SOUTHWEST)) {
				cel = cel.getNeighbor(Cellule.SOUTHWEST).getCell();

				p.t[posy][posx] = 0;
				posx = 8;
				posy = 1;
				p.t[posy][posx] = 1;
				tab(cel);
				pass = new Thread(new P());
				pass.start();
			}
			if (zone(Cellule.SOUTHEAST)) {
				cel = cel.getNeighbor(Cellule.SOUTHEAST).getCell();

				p.t[posy][posx] = 0;
				posx = 1;
				posy = 1;
				p.t[posy][posx] = 1;
				tab(cel);
				pass = new Thread(new P());
				pass.start();
			}
			if (zone(Cellule.WEST)) {
				cel = cel.getNeighbor(Cellule.WEST).getCell();

				p.t[posy][posx] = 0;
				posx = 8;
				p.t[posy][posx] = 1;
				tab(cel);
				pass = new Thread(new P());
				pass.start();
			}
			if (zone(Cellule.EAST)) {
				cel = cel.getNeighbor(Cellule.EAST).getCell();

				p.t[posy][posx] = 0;
				posx = 1;
				p.t[posy][posx] = 1;
				tab(cel);
				pass = new Thread(new P());
				pass.start();
			}
			if (move) {
				if (arg0.getKeyCode() == 37) {
					p.orientation = 1;
					if (posx >= 1) {
						if (p.t[posy][posx - 1] == 0
								&& p.t[posy][posx - 1] != 7) {

							p.t[posy][posx] = 0;
							posx--;
							p.t[posy][posx] = 1;
						} else if (p.t[posy][posx - 1] == 4) {
							Thread hurt = new Thread(new Hurt());
							hurt.start();
							p.vie--;
							p.repaint();
						} else if (p.t[posy][posx - 1] == 5
								|| p.t[posy][posx - 1] == 6
								|| p.t[posy][posx - 1] == 12
								|| p.t[posy][posx - 1] == 40) {
							Thread hurt = new Thread(new Hurt());
							hurt.start();
							p.vie--;
							p.repaint();
						} else if (p.t[posy][posx - 1] == 7) {
							p.t[posy][posx] = 0;
							posx--;
							p.t[posy][posx] = 1;
							p.vie++;
							p.repaint();
						}
					}
					p.avance++;
					if (p.avance == 3)
						p.avance = 1;
					if (A) {
						avance = new Thread(new Avance());
						avance.start();
					}
				}
				if (arg0.getKeyCode() == 38) {
					p.orientation = 3;
					if (posy >= 1) {
						if (p.t[posy - 1][posx] == 0
								&& p.t[posy - 1][posx] != 7) {

							p.t[posy][posx] = 0;
							posy--;
							p.t[posy][posx] = 1;
						} else if (p.t[posy - 1][posx] == 4) {
							Thread hurt = new Thread(new Hurt());
							hurt.start();
							p.vie--;
							p.repaint();
						} else if (p.t[posy - 1][posx] == 5
								|| p.t[posy - 1][posx] == 6
								|| p.t[posy - 1][posx] == 12
								|| p.t[posy - 1][posx] == 40) {
							Thread hurt = new Thread(new Hurt());
							hurt.start();
							p.vie--;
							p.repaint();
						} else if (p.t[posy - 1][posx] == 7) {
							p.t[posy][posx] = 0;
							posy--;
							p.t[posy][posx] = 1;
							p.vie++;
							p.repaint();
						}
					}
					p.avance++;
					if (p.avance == 3)
						p.avance = 1;
					if (A) {
						avance = new Thread(new Avance());
						avance.start();
					}
				}
				p.won2 = false;
				if (arg0.getKeyCode() == 40) {
					p.orientation = 0;
					if (posy <= 10) {
						if (p.t[posy + 1][posx] == 0
								&& p.t[posy + 1][posx] != 7) {

							p.t[posy][posx] = 0;
							posy++;
							p.t[posy][posx] = 1;
						} else if (p.t[posy + 1][posx] == 4) {
							Thread hurt = new Thread(new Hurt());
							hurt.start();
							p.vie--;
							p.repaint();
						} else if (p.t[posy + 1][posx] == 5
								|| p.t[posy + 1][posx] == 6
								|| p.t[posy + 1][posx] == 12
								|| p.t[posy + 1][posx] == 40) {
							Thread hurt = new Thread(new Hurt());
							hurt.start();
							p.vie--;
							p.repaint();
						} else if (p.t[posy + 1][posx] == 7) {
							p.t[posy][posx] = 0;
							posy++;
							p.t[posy][posx] = 1;
							p.vie++;
							p.repaint();
						}

					}
					p.avance++;
					if (p.avance == 3)
						p.avance = 1;
					if (A) {
						avance = new Thread(new Avance());
						avance.start();
					}
				}
				if (arg0.getKeyCode() == 39) {
					p.orientation = 2;
					if (posx <= 8) {
						if (p.t[posy][posx + 1] == 0
								&& p.t[posy][posx + 1] != 7) {

							p.t[posy][posx] = 0;
							posx++;
							p.t[posy][posx] = 1;
						} else if (p.t[posy][posx + 1] == 4) {
							Thread hurt = new Thread(new Hurt());
							hurt.start();
							p.vie--;
							p.repaint();
						} else if (p.t[posy][posx + 1] == 5
								|| p.t[posy][posx + 1] == 6
								|| p.t[posy][posx + 1] == 12
								|| p.t[posy][posx + 1] == 40) {
							Thread hurt = new Thread(new Hurt());
							hurt.start();
							p.vie--;
							p.repaint();
						} else if (p.t[posy][posx + 1] == 7) {
							p.vie++;
							p.t[posy][posx] = 0;
							posx++;
							p.t[posy][posx] = 1;
							p.repaint();
						}
					}
					p.avance++;
					if (p.avance == 3)
						p.avance = 1;
					if (A) {
						avance = new Thread(new Avance());
						avance.start();
					}
				}
				if (arg0.getKeyCode() == 10 || arg0.getKeyCode() == 32) {
					Thread attack = new Thread(new Attack());
					attack.start();
					switch (p.orientation) {
					case 0:
						if (p.t[posy + 1][posx] == 4
								|| p.t[posy + 1][posx] == 6) {
							p.t[posy + 1][posx] = 0;
							mechant.stop();
						}
						if (p.t[posy + 1][posx] == 5) {
							p.t[posy + 1][posx] = 0;
							mechant1.stop();
						}
						if (p.t[posy + 1][posx] == 40) {
							p.t[posy + 1][posx] = 0;
							mechant3.stop();
						}
						if (p.t[posy + 1][posx] == 12) {
							if (Math.random() >= 0.8) {
								p.t[posy + 1][posx] = 0;
								mechant2.stop();
							}
						}
						break;
					case 1:
						if (p.t[posy][posx - 1] == 4
								|| p.t[posy][posx - 1] == 6) {
							p.t[posy][posx - 1] = 0;
							mechant.stop();
						}
						if (p.t[posy][posx - 1] == 5) {
							p.t[posy][posx - 1] = 0;
							mechant1.stop();
						}
						if (p.t[posy][posx - 1] == 40) {
							p.t[posy][posx - 1] = 0;
							mechant3.stop();
						}
						if (p.t[posy][posx - 1] == 12) {
							if (Math.random() >= 0.8) {
								p.t[posy][posx - 1] = 0;
								mechant2.stop();
							}
						}
						break;

					case 2:
						if (p.t[posy][posx + 1] == 4
								|| p.t[posy][posx + 1] == 6) {
							p.t[posy][posx + 1] = 0;
							mechant.stop();
						}
						if (p.t[posy][posx + 1] == 5) {
							p.t[posy][posx + 1] = 0;
							mechant1.stop();
						}
						if (p.t[posy][posx + 1] == 40) {
							p.t[posy][posx + 1] = 0;
							mechant3.stop();
						}
						if (p.t[posy][posx + 1] == 12) {
							if (Math.random() >= 0.8) {
								p.t[posy][posx + 1] = 0;
								mechant2.stop();
							}
						}
						break;
					case 3:
						if (p.t[posy - 1][posx] == 4
								|| p.t[posy - 1][posx] == 6) {
							p.t[posy - 1][posx] = 0;
							mechant.stop();
						}
						if (p.t[posy - 1][posx] == 5) {
							p.t[posy - 1][posx] = 0;
							mechant1.stop();
						}
						if (p.t[posy - 1][posx] == 40) {
							p.t[posy - 1][posx] = 0;
							mechant3.stop();
						}
						if (p.t[posy - 1][posx] == 12) {
							if (Math.random() >= 0.8) {
								p.t[posy - 1][posx] = 0;
								mechant2.stop();
							}
						}
						break;
					}
				}
			}
			p.repaint();
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			// System.out.println(arg0.getKeyCode());
		}

		@Override
		public void keyTyped(KeyEvent arg0) {

			// TODO Auto-generated method stub

		}

	}

	boolean A = true;

	class Avance implements Runnable {
		public void run() {
			A = false;
			move = false;
			// pause(45);
			move = true;
			A = true;
		}
	}

	Thread avance;

	class Hurt implements Runnable {
		public void run() {
			for (int i = 0; i < 20; i++) {
				if (i % 2 == 0) {
					p.avance = 99;
				} else {
					p.avance = 1;
				}
				p.repaint();
				pause(100);
			}
		}
	}

	class Attack implements Runnable {
		public void run() {
			p.avance = 3;
			p.repaint();
			pause(200);
			p.avance = 1;
			p.repaint();
		}
	}

	Sequencer sequencer;
	Sequence sequence;

	public void music(String s, int repet) {
		// si il y a deja du son on le ferme
		if (sequencer != null)
			sequencer.stop();
		try {
			sequence = MidiSystem.getSequence(new File(s));
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setSequence(sequence);
			sequencer.setLoopCount(repet);
			sequencer.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void pause(int a) {
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
