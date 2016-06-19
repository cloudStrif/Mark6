import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.util.ArrayList;

import javax.sound.midi.MidiSystem;
import javax.sound.midi.Sequence;
import javax.sound.midi.Sequencer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextField;

public class Marlena extends JFrame {

	/**
	 * NOYAU CRIPTE DU PROGRAMME
	 */
	private static final long serialVersionUID = 1L;
	JPanel container = new JPanel();
	Mar2 pan = new Mar2();
	Panneau2 pan2 = new Panneau2(pan.mode);
	JTextField jtf;
	int selection = 0;
	int randomMonster = 0; // 0 le duo1 sinon place au duo 2
	Thread deplacement, attack, attack2, animX, magiedefin;// animX sert juste a
															// animer
	Thread thr;
	// Tableau de parametres pour anim
	String[][] d = { { "anim2", "58" }, { "MysticFlame", "62" },
			{ "Pyroclasm", "87" }, { "RisingDragonAgatio", "182" },
			{ "Zagan", "150" }, { "anim3", "70" }, { "Odyssey", "111" },
			{ "RadiantFire", "57" }, { "anim4", "30" }, { "glace", "133" },
			{ "Liquifier", "105" }, { "Meteor", "244" },
			{ "RisingDragon", "42" }, { "Volcano", "87" } };
	// avant lecombat
	Memoire mem = new Memoire();

	// Liste des actions que nous devrons faire apprés avoir selectionné les
	// attack
	ArrayList<Integer> actionman = new ArrayList<Integer>();

	public Marlena() {
		setTitle("Rpg");
		setSize(800, 510);
		setResizable(false);

		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);
		jtf = new JTextField();

		jtf.setPreferredSize(new Dimension(0, 0));
		jtf.addKeyListener(new ClavierListener());
		JPanel south = new JPanel();
		south.add(jtf);
		container.add(south, BorderLayout.SOUTH);
		setContentPane(container);
		JSplitPane split = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,
				new JScrollPane(pan), new JScrollPane(pan2));
		split.setDividerLocation(500);
		getContentPane().add(split, BorderLayout.CENTER);

		setVisible(true);
		// debut
		pan.level = -1;
		pan.size = 1100;
		music("image/m.mid");
		thr = new Thread(new Commence(2));
		thr.start();

		commence = new Thread(new Commence(0)); // Gere l'animation du debut
		commence.start();

		/*
		 * movePavel(0); moveGolem(1); stand(); moveCyntia(1); moveGolem(0);
		 * movePavel(1); stand();
		 * 
		 * moveDead(2); stand(); moveWitch(0); stand();
		 * 
		 * moveCyntia(2); stand();
		 */

		// initialise les composants
		// commence();
	}

	// fontion animer
	public void animate(int dep, int lim, String name, boolean sens) {
		pan.sensei = sens;
		pan.animation = true;
		pan.name = name;
		for (int i = dep; i < lim; i++) {
			if (i < 10) {
				pan.num = "00" + i;
			} else if (i >= 10 && i < 100) {
				pan.num = "0" + i;
			} else if (i >= 100) {
				pan.num = "" + i;
			}
			pause(80);
			pan.repaint();
		}
		pan.animation = false;
	}

	public void start() {
		// music("image/menu2.mid");

		for (int i = 0; i < 23; i++) {
			pan.size -= 10;
			pan.map -= 10;
			pan.repaint();
			pause(300);
		}
		pan.start1 = true;
		pan.repaint();
	}

	Thread commence;

	class Commence implements Runnable {
		int op;

		public Commence(int op) {
			this.op = op;
		}

		public void run() {
			if (op == 0) {
				while (true) {
					pan.afficher = true;
					pan.repaint();
					pause(300);
					pan.afficher = false;
					pan.repaint();
					pause(300);
				}
			} else if (op == 1) {
				pan.repaint();
				commence();

			} else if (op == 2) {
				animate(1, Integer.parseInt(d[3][1]), d[3][0], false);
				start();
			}
		}
	}

	public void commence() {
		pan.PV.add(120);
		pan.PV.add(90);
		pan.PV.add(70);
		pan.PP.add(50);
		pan.PP.add(70);
		pan.PP.add(90);
		pan.NAME.add("Vondidi");
		pan.NAME.add("Cyntia");
		pan.NAME.add("Sophia");
		if (pan.mode) {
			// Iitialisation
			pan.x = 300;
			pan.y = 380;

			selection = pan.PV2.size() - 1;
			if (randomMonster == 0)
				music("image/saturos-battle-2-.mid");
			else if (randomMonster == 1) {
				// if (Math.random() <= 0.5)
				music("image/golden_sun_-_battle_theme.mid");
				// else

			} else if (randomMonster == 3 || randomMonster == 4
					|| randomMonster == 5 || randomMonster == 7
					|| randomMonster == 9261) {
				music("image/gs2.mid");
			} else if (randomMonster == 6) {
				music("image/jenna.mid");
			} else if (randomMonster == 11) {
				music("image/aga.mid");
			} else if (randomMonster == 44) {
				music("image/erza1.mid");
			} else if (randomMonster < 0 && randomMonster != -4) {
				music("image/jenna.mid");
			} else if (randomMonster == 77) {
				music("image/aga.mid");
			} else if (randomMonster == -4) {
				music("image/pok.mid");
			}
			pan.repaint();
			pan2.repaint();
			avance(0);
		} else {
			// pan.level = 1001;
			// mouvement = true;

			music("image/the-golden-sun-rises.mid");

			pan.orientation = 3;
			pan.avance = 2;
			pan.x1 = 230;
			pan.y1 = 480;
			pan.repaint();
			ecrire(mem.af("blabla/texte"));
			pan2.TEXTE = "";

			avance(1);
			histoire();

		}

	}

	public void histoire() {
		// Animations lié a l'histoire

		for (int i = 0; i < 12; i++) {
			// Pavel et son equipe marchent
			pan.orientation = 3;
			pan.avance++;
			if (pan.avance == 4)
				pan.avance = 1;
			pan.y1 -= 20;
			pan.repaint();
			pause(200);
		}
		ecrire(mem.af("blabla/texte2"));
		pan2.TEXTE = "";
		for (int i = 0; i < 18; i++) {
			pan.avancem[2]++;
			if (pan.avancem[2] == 4) {
				pan.avancem[2] = 1;
			}
			pan.yd += 20;
			pan.repaint();
			pause(200);
		}
		ecrire(mem.af("blabla/texte3"));
		// initialisation de depart nescssaire
		pan2.TEXTE = "";

		modecombat(1);

	}

	public void modecombat(int a) {
		pan.avance = 1;
		pan.orientation = 0;
		if (a == 1) {
			randomMonster = 0;
			pan.avancem[0] = 1;
			pan.avancem[1] = 1;
			pan.avancem[3] = 42;
			pan.avancem[4] = 24;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 42;
			pan.avancem[13] = 42;
		} else if (a == 2) {
			randomMonster = 1;

			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 1;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			pan.avancem[4] = 1;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 42;
			pan.avancem[13] = 42;
		} else if (a == 3) {
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 1;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 42;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			pan.avancem[13] = 42;
			randomMonster = 3;
		} else if (a == 4) {
			// on est dans le village => mechantes du village

			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 1;
			pan.avancem[7] = 1;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 42;
			pan.avancem[13] = 42;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			randomMonster = 4;
		} else if (a == 5) {
			// autre mechant du village(au chateau on aura un mixte de tous)
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 1;
			pan.avancem[10] = 1;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			pan.avancem[11] = 42;
			pan.avancem[12] = 42;
			pan.avancem[13] = 42;
			randomMonster = 5;
		} else if (a == -1) {
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 33;
			pan.avancem[13] = 33;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			pan.avancem[17] = 1;
			pan.avancem[18] = 1;
			randomMonster = -1;
		} else if (a == -2) {
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 33;
			pan.avancem[13] = 33;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			pan.avancem[19] = 1;
			pan.avancem[20] = 1;
			randomMonster = -2;
		} else if (a == -3) {
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 22;
			pan.avancem[13] = 22;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			pan.avancem[21] = 1;
			pan.avancem[22] = 1;
			randomMonster = -3;
		} else if (a == -4) {
			pan.avancem[17] = 33;
			pan.avancem[18] = 33;
			pan.avancem[19] = 33;
			pan.avancem[20] = 33;
			pan.avancem[21] = 33;
			pan.avancem[22] = 33;
			pan.mewto = 1;
			randomMonster = -4;
		} else if (a == 22) {
			// Link
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 1;
			pan.avancem[12] = 42;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			pan.avancem[13] = 42;
			randomMonster = 6;
		} else if (a == 6) {
			// VAMPIRE ET OTHERS
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 1;
			pan.avancem[13] = 1;
			pan.avancem[14] = 20;
			pan.avancem[15] = 20;
			randomMonster = 7;
		} else if (a == 42) {
			// end of file
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 42;
			pan.avancem[13] = 42;
			pan.avancem[14] = 1;
			pan.avancem[15] = 1;
			randomMonster = 11;
		} else if (a == 9261) {
			pan.avancem[0] = 42;
			pan.avancem[1] = 42;
			pan.avancem[3] = 42;
			pan.avancem[4] = 42;
			pan.avancem[5] = 42;
			pan.avancem[6] = 42;
			pan.avancem[7] = 42;
			pan.avancem[9] = 42;
			pan.avancem[10] = 42;
			pan.avancem[11] = 42;
			pan.avancem[12] = 42;
			pan.avancem[13] = 42;
			pan.avancem[14] = 42;
			pan.avancem[15] = 42;
			pan.avancem[16] = 1;
			randomMonster = 9261;
		} else if (a == 44) {
			randomMonster = 44;
			pan.orientationz = 0;
		} else if (a == 77) {
			// FINAL MONSTER
			// Positionnement des ennemies
			randomMonster = 77;
			pan.avancem[23] = 1;
			pan.avancem[24] = 1;
			pan.avancem[25] = 1;
		}
		boutonA = 5;
		// mode combat contre les 2 monstres
		// On choisi quel equipe vas combattre
		// On place les PV ICI
		pan.mode = true;
		pan2.mode = true;
		if (a == 1 || a == 2 || a == 4 || a == 5 || a == 6) {

			pan.x = 300;
			pan.y = 380;
			boutonA = 10;
			ecrire("Attention 2 ennemie approche !\n dont un Golem !");
			if (pan.PV2.size() == 0) {
				pan.PV2.add(60);
				pan.PV2.add(60);
			} else if (pan.PV2.size() == 2) {
				pan.PV2.set(0, 50);
				pan.PV2.set(1, 50);
			} else if (pan.PV2.size() == 1) {
				pan.PV2.set(0, 50);
				pan.PV2.add(60);
			}
		} else if (a == 3) {
			// ZORK donc il est seul a combattre
			pan.mode = true;
			pan2.mode = true;
			boutonA = 10;
			ecrire("Monstre Geant surgit \n il s'agit de la \n créature du DEMON BLEU");
			if (pan.level == 7 || pan.level == 8 || pan.level == 9
					|| pan.level == 10 || pan.level == 11 || pan.level == 88
					|| pan.level == 111) {
				if (pan.PV2.size() == 0 || pan.PV2.size() == 2
						|| pan.PV2.size() == 1) {
					pan.PV2 = new ArrayList<Integer>();
					pan.PV2.add(110);
				}
			} else {
				if (pan.PV2.size() == 0 || pan.PV2.size() == 2
						|| pan.PV2.size() == 1) {
					pan.PV2 = new ArrayList<Integer>();
					pan.PV2.add(230);
				}
			}
		} else if (a == 22) {
			pan.mode = true;
			pan2.mode = true;
			boutonA = 10;
			// Link PV
			ecrire("Link apparait !");

			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(190);

		} else if (a == 42) {
			boutonA = 10;
			pan.mode = true;
			pan2.mode = true;
			ecrire("Dark PAVEL et Dark Cynthia apparait !!");
			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(120);
			pan.PV2.add(100);
		} else if (a == 9261) {
			pan.mode = true;
			pan2.mode = true;
			boutonA = 10;
			// Link PV
			ecrire("Poulette surgit!!");
			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(60);
		} else if (a == 44) {
			pan.mode = true;
			pan2.mode = true;
			boutonA = 10;
			// Link PV
			ecrire("Erza apparais!!");
			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(230);
		} else if (a == -1) {
			boutonA = 10;
			pan.mode = true;
			pan2.mode = true;
			ecrire("Aigle apparait et \n gobelin!");
			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(60);
			pan.PV2.add(70);
		} else if (a == -2) {
			boutonA = 10;
			pan.mode = true;
			pan2.mode = true;
			ecrire("Loup apparait et \n Picorro!");
			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(70);
			pan.PV2.add(60);
		} else if (a == -4) {
			boutonA = 10;
			pan.mode = true;
			pan2.mode = true;
			ecrire("Mewto apparait !");
			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(210);

		} else if (a == -3) {
			boutonA = 10;
			pan.mode = true;
			pan2.mode = true;
			ecrire("Ennemies !!!");
			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(60);
			pan.PV2.add(70);
		} else if (a == 77) {
			boutonA = 10;
			pan.mode = true;
			pan2.mode = true;
			ecrire("FELIX ,DEMON BLEU \nET TRAXO !!");
			pan.PV2 = new ArrayList<Integer>();
			pan.PV2.add(140);
			pan.PV2.add(150);
			pan.PV2.add(110);
		}

		// pan.avancem[0] = 1;
		// pan.avancem[1] = 1;
		musicoff();
		commence();

	}

	public void ecrire(String f) {

		// Texte a droite
		int inc = 0;
		pan2.TEXTE = "";
		String cont = "";
		for (int i = 0; i < f.length(); i++) {
			cont += f.charAt(i);
			pan2.TEXTE = cont;
			pan2.repaint();

			pause(boutonA);
		}
	}

	int boutonA = 70;

	public void avance(int o) {
		selection = pan.PV2.size() - 1;
		pan.cursor = 140;
		if (o == 0) {
			// Simulation mode de combat(En debut de Combat)
			if (pan.mode) {
				pan.map = -200;
				pan.size = 500 + 900;
				pan.size2 = 600;
			}
			for (int i = 0; i < 30; i++) {
				pan.map -= 20;
				pan.repaint();
				pause(100);
			}
		} else if (o == 1) {
			// Animationlié NOCOMBAT
			pan.map = 0;
			pan.map2 = 0;
			pan.size = 500;
			pan.size2 = 700;
			for (int i = 0; i < 5; i++) {
				pan.map2 -= 20;

				pan.repaint();
				pause(300);
			}
		} else if (o == 2) {
			for (int i = 0; i < 9; i++) {
				pan.y1 -= 20;
				pan.yd -= 20;
				pan.ye -= 20;
				pan.map2 -= 20;
				pan.repaint();
				pause(300);
			}
		} else if (o == 3) {
			for (int i = 0; i < 9; i++) {
				pan.y1 += 20;
				pan.yd += 20;
				pan.ye += 20;
				pan.map2 += 20;
				pan.repaint();
				pause(300);
			}
		} else if (o == 4) {
			for (int i = 0; i < 15; i++) {
				pan.y1 -= 20;
				pan.map2 -= 20;
				pan.size2 -= 20;
				pan.repaint();
				pause(200);
			}
			pause(300);
		} else if (o == 5) {
			for (int i = 0; i < 15; i++) {
				pan.y1 += 20;
				pan.map2 += 20;
				pan.size2 += 20;
				pan.repaint();
				pause(200);
			}
			pause(300);
		} else if (o == 6) {
			pan.orientation = 2;
			pan.avance = 0;
			for (int i = 0; i < 30; i++) {
				pan.map2 -= 20;
				pan.size2 -= 20;
				pan.avance++;
				if (pan.avance == 5) {
					pan.avance = 1;
				}
				pan.y1 += 5;
				pause(200);
				pan.repaint();
			}
		}
	}

	public void pause(int a) {
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	Sequencer sequencer;
	Sequence sequence;

	public void music(String s) {
		musicoff();
		try {
			sequence = MidiSystem.getSequence(new File(s));
			sequencer = MidiSystem.getSequencer();
			sequencer.open();
			sequencer.setSequence(sequence);
			sequencer.setLoopCount(100);
			sequencer.start();

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	public void musicoff() {
		if (sequencer != null)
			sequencer.stop();
	}

	boolean start = false;

	class ClavierListener implements KeyListener {
		// CONTROLLER
		int posx = 0;
		int posy = 0;

		public void ennemy() {
			if (pan.level == 0 || pan.level == 1) {

				if (monstre) {
					if ((int) (1 + Math.random() * 50) == 6) {
						animX = new Thread(new AnimX(0));
						animX.start();
						// pan.mode = true;
						// modecombat();
					}
				}
			} else if (pan.level == 3 || pan.level == -3) {
				if (monstre) {
					if ((int) (1 + Math.random() * 50) == 6) {
						animX = new Thread(new AnimX(2));
						animX.start();
						// pan.mode = true;
						// modecombat();
					}
				}
			} else if (pan.level == 7 || pan.level == 8 || pan.level == 9
					|| pan.level == 10 || pan.level == 11) {
				if (monstre) {
					if ((int) (1 + Math.random() * 90) == 6) {
						animX = new Thread(new AnimX(3));
						animX.start();
						// pan.mode = true;
						// modecombat();
					}
				}
			} else if (pan.level == 5) {
				if (monstre) {
					if ((int) (1 + Math.random() * 50) == 6) {
						animX = new Thread(new AnimX(4));
						animX.start();
						// pan.mode = true;
						// modecombat();
					}
				}
			} else if (pan.level >= 1000) {
				if (monstre) {
					if ((int) (1 + Math.random() * 50) == 6) {
						animX = new Thread(new AnimX(5));
						animX.start();
					}
				}
			}
		}

		boolean sound = true;

		@Override
		public void keyPressed(KeyEvent arg0) {
			if (arg0.getKeyChar() == 's') {
				if (sound) {
					sound = false;
					sequencer.stop();
				} else {
					sound = true;
					sequencer.start();
				}
			}

			// TODO Auto-generated method stub
			/*
			 * System.out.println("Vous avez appuyé"); pan2.size ++ ;
			 * pan2.repaint();
			 */
			if (!start) {
				if (arg0.getKeyCode() == 65) {
					thr.stop();
					pan.animation = false;
					pan.level = 0;
					pan.map = 0;
					pan.map2 = 0;
					pan.size = 500;
					pan.size2 = 700;
					start = true;
					musicoff();
					commence = new Thread(new Commence(1));
					commence.start();
				}

			} else {

				if (!pan.mode) {
					System.out.println(pan.x1 + " et " + pan.y1);

					if (pan.level == 1) {
						// SI nous sommes dans la MAP 2

						/*
						 * pan.map = -70; pan.size = 800; pan.size2 = 1100;
						 * 
						 * if (pan.y >= 460) { attack2 = new Thread(new
						 * Pause(2)); attack2.start(); pan.y = 450; } if (pan.y
						 * <= 20) { attack2 = new Thread(new Pause(3));
						 * attack2.start(); pan.y = 30; }
						 */

					}
					if (pan.level == 1004 && arg0.getKeyCode() == 67) {
						attack2 = new Thread(new Pause(88));
						attack2.start();
					}
					if (mouvement) {

						if (pan.y1 >= 380 && pan.level == 1) {
							mouvement = false;
							attack2 = new Thread(new Pause(2));
							attack2.start();
						}
						if (pan.level == 1003) {
							mouvement = false;
							attack2 = new Thread(new Pause(11));
							attack2.start();
						}

						if ((pan.level == 4 && pan.between(pan.x1, 10, 70) && pan
								.between(pan.y1, 210, 250))
								|| (pan.level == -4
										&& pan.between(pan.x1, 10, 70) && pan
											.between(pan.y1, 210, 250))) {
							// PARLER
							attack2 = new Thread(new Pause(1));
							attack2.start();
						}
						if (pan.level == 6) {

							attack2 = new Thread(new Pause(3));
							attack2.start();
						}

						if (pan.level == -5) {
							attack2 = new Thread(new Pause(10));
							attack2.start();
						}

						if (pan.level == 8 && pan.y1 > 340) {

							attack2 = new Thread(new Pause(5));
							attack2.start();
						}
						if (pan.level == 88 && pan.y1 <= 15) {

							attack2 = new Thread(new Pause(6));
							attack2.start();
						}

						if (pan.level == 88 && pan.y1 >= 355) {
							if (attack2 != null) {
								attack2 = new Thread(new Pause(7));
								attack2.start();
							}
						}
						if (pan.level == 111 && pan.y1 >= 70) {
							attack2 = new Thread(new Pause(8));
							attack2.start();
						}

						// Dans lemode vue de haut
						// gestion des deplacements du personnage
						if (arg0.getKeyCode() == 37) {
							pan.orientation = 1;
							pan.avance++;
							if (pan.avance == 4)
								pan.avance = 1;
							pan.x1 -= 10;
							ennemy();
							pan.repaint();

						}

						if (arg0.getKeyChar() == 'p') {
							System.out.println(pan.potion);
							if (pan.potion == 0) {
								// DO NOTHING
							} else {
								pan2.TEXTE = "";
								ecrire("Utilisation d'une potion !");
								for (int i = 0; i < pan.PV.size(); i++) {
									pan.PV.set(i, pan.PV.get(i) + 100);
									pan.PP.set(i, pan.PP.get(i) + 50);
								}
								pan.potion--;
							}
						}

						if (arg0.getKeyCode() == 38) {
							pan.orientation = 3;
							pan.avance++;
							if (pan.avance == 4)
								pan.avance = 1;
							pan.y1 -= 10;
							ennemy();
							pan.repaint();
						}
						if (arg0.getKeyCode() == 39) {
							pan.orientation = 0;
							pan.avance++;
							if (pan.avance == 4)
								pan.avance = 1;
							pan.x1 += 10;
							ennemy();
							pan.repaint();
						}
						if (arg0.getKeyCode() == 40) {
							pan.orientation = 2;
							pan.avance++;
							if (pan.avance == 4)
								pan.avance = 1;
							pan.y1 += 10;
							ennemy();
							pan.repaint();
						}
					}
					if (arg0.getKeyCode() == 65) {

						boutonA = 10;
						// Boutons qui va permettre d'aller plus vite
					}
					if (arg0.getKeyCode() == 66) {
						boutonA = 70;
					}
				} else {

					if (tour) {

						// deplacement du cursuer
						if (arg0.getKeyCode() == 37) {
							if (!etape) {
								if (posx - 1 >= 0) {
									pan2.bool[posy][posx] = false;
									posx -= 1;
									pan2.bool[posy][posx] = true;
									pan2.repaint();
								}
							} else {
								if (selection - 1 >= 0) {
									selection--;
									pan.cursor -= 70;
									pan.repaint();
								}
							}

						}
						if (arg0.getKeyCode() == 38) {
							if (!etape) {
								if (posy - 1 >= 0) {
									pan2.bool[posy][posx] = false;
									posy -= 1;
									pan2.bool[posy][posx] = true;
								}
							} else {

							}
							pan2.repaint();
						}
						if (arg0.getKeyCode() == 39) {
							if (!etape) {
								if (posx + 1 <= pan2.boutons.length - 1) {
									pan2.bool[posy][posx] = false;
									posx += 1;
									pan2.bool[posy][posx] = true;
								}
							} else {
								if (selection + 1 < pan.PV2.size()) {// <2){
									selection++;
									pan.cursor += 70;
									pan.repaint();

								}
							}
							pan2.repaint();
						}
						if (arg0.getKeyCode() == 40) {
							if (!etape) {
								if (posy + 1 <= pan2.boutons[0].length - 1) {
									pan2.bool[posy][posx] = false;
									posy += 1;
									pan2.bool[posy][posx] = true;
								}
							} else {

							}
							pan2.repaint();
						}
						// Valider
						if (arg0.getKeyCode() == 10) {

							if (posx == 0 && posy == 0) {
								// une attaque

								if (etape) {

									etape = false;
									if (pan2.per >= 0)
										actionman.add(0);
									else
										actionman.add(-2);
									select.add(selection);
									inc++;
									if (inc >= 3) {
										inc = 0;
										deplacement = new Thread(new Exec(
												actionman));
										deplacement.start();
										actionman = new ArrayList<Integer>();

									}
									pan2.perso(inc);
									pan2.repaint();

									// }
								} else {
									// Passer d'une etape a l'autre
									etape = true;
								}
								// juste ne pas appuyer plusieur fois
								active = true;
							} else if (posx == 1 && posy == 0) {
								if (etape) {
									etape = false;
									if (pan2.per >= 0)
										actionman.add(1);
									else
										actionman.add(-3);
									select.add(selection);
									inc++;
									if (inc >= 3) {
										inc = 0;
										deplacement = new Thread(new Exec(
												actionman));
										deplacement.start();
										actionman = new ArrayList<Integer>();
									}
									pan2.perso(inc);
									pan2.repaint();

								} else {
									etape = true;
								}
							} else if (posx == 0 && posy == 1) {
								if (etape) {
									etape = false;
									if (pan2.per >= 0)
										actionman.add(-1);
									else
										actionman.add(-1);
									select.add(selection);
									inc++;
									if (inc >= 3) {
										inc = 0;
										deplacement = new Thread(new Exec(
												actionman));
										deplacement.start();
										actionman = new ArrayList<Integer>();
									}
									pan2.perso(inc);
									pan2.repaint();

								} else {
									etape = true;
								}
							} else if (posx == 1 && posy == 1) {
								if (inc == 0)
									pan2.perso(-1);
								else if (inc == 1)
									pan2.perso(-2);
								else if (inc == 2)
									pan2.perso(-3);
								pan2.repaint();
							}

						}

						if (arg0.getKeyCode() == 69) {
							if (pan.PV2.size() == 2) {
								pan.PV2.set(0, -10);
								pan.PV2.set(1, -10);
							} else if (pan.PV2.size() == 1) {
								pan.PV2.set(0, -10);
							} else if (pan.PV2.size() == 3) {
								pan.PV2.set(0, -10);
								pan.PV2.set(1, -10);
							}
							pan.repaint();
						}

					} else {
						// si ce n'est pas notre tour

					}
				}
			}

		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub
			if (arg0.getKeyCode() == 65) {
				// boutonA = 50;
			}
		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

	}

	ArrayList<Integer> mort = new ArrayList<Integer>();
	boolean tour = true; // true = notre tour ,false = joueur adverse

	boolean active = false;// verifie que l'on n'apuie que une fois sur une
							// touche

	boolean etape = false;// etape 1 et 2

	boolean monstre = true; // si true comme dans pokemon sinon rien

	boolean mouvement = false; // false on ne peut pas bouger en mode pas combat

	int inc = 0;// permet de savoir si on est pavel cyntia ou sophia (0,1,2)

	class Deplacement implements Runnable {

		public void verif() {
			if (pan.PV.get(0) <= 0) {

				if (pan.mode) {
					pan2.TEXTE = "";
					ecrire("Pavel Succombe! ");
				}
				pan.PV.set(0, 0);
				pan.PP.set(0, 0);
				pan.NAME.set(0, "DEAD");
				movePavel(3);
			}
			if (pan.PV.get(1) <= 0) {
				pan2.TEXTE = "";
				if (pan.mode) {
					pan2.TEXTE = "";
					ecrire("Cynthia Succombe !!");
				}
				pan.PV.set(1, 0);
				pan.PP.set(1, 0);
				pan.NAME.set(1, "DEAD2");
				moveCyntia(3);
			}
			if (pan.PV.get(2) <= 0) {
				pan2.TEXTE = "";
				if (pan.mode) {
					pan2.TEXTE = "";
					ecrire("Sophia Succombe!");
				}
				pan.PV.set(2, 0);
				pan.PP.set(2, 0);
				pan.NAME.set(2, "DEAD3");
				moveWitch(2);
			}

		}

		public void run() {
			// Pour le moment car il n'y a que deadman et Golem comme
			// ennemi(+Frank Einstein et Golem roche @ si randomMonster==0
			if (randomMonster == 0) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[1] = 42;

				} else {
					// attaque de dead Man
					moveDead((int) (Math.random() * 3));
					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[0] = 42;

				} else {
					// attaque du golem noir
					moveGolem((int) (Math.random() * 2), 0);
					stand();// remets nos heros d'aplombs
				}
			} else if (randomMonster == 1) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[3] = 42;

				} else {
					// attaque de dead Man
					moveFrank();
					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[4] = 42;

				} else {
					// attaque du golem noir
					moveGolem((int) (Math.random() * 2), 1);
					stand();// remets nos heros d'aplombs
				}
			} else if (randomMonster == 3) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[3] = 42;

				} else {
					// attaque de dead Man
					moveZork();
					stand();
				}
			} else if (randomMonster == 4) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[7] = 42;
					pan.repaint();
				} else {

					moveDameV();
					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[6] = 42;
					pan.repaint();

				} else {

					moveVillage();
					stand();// remets nos heros d'aplombs
				}
			} else if (randomMonster == 5) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[9] = 42;

				} else {
					moveDameVAMPIRE();

					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[10] = 42;

				} else {
					moveBlonde();

					stand();// remets nos heros d'aplombs
				}
			} else if (randomMonster == 6) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[11] = 42;

				} else {
					// attaque de dead Man
					moveLink();
					stand();
				}
			} else if (randomMonster == 7) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[13] = 42;

				} else {
					moveD();

					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[12] = 42;

				} else {
					moveboss();

					stand();// remets nos heros d'aplombs
				}
			} else if (randomMonster == 11) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[15] = 42;

				} else {
					movec2();
					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[14] = 42;

				} else {
					movePavel2();

					stand();
				}
			} else if (randomMonster == 9261) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[16] = 42;

				} else {
					movePoulette();
					stand();
				}
			} else if (randomMonster == 44) {
				if (pan.PV2.get(0) <= 0) {
					pan.orientationz = 42;

				} else {
					moveErza();
					stand();
				}
			} else if (randomMonster == -1) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[18] = 42;

				} else {
					movegol(18, 0);
					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[17] = 42;

				} else {
					movegol(17, 1);
					stand();
				}
			} else if (randomMonster == -2) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[20] = 42;

				} else {
					movegol(20, 0);
					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[19] = 42;

				} else {
					movegol(19, 1);
					stand();
				}
			} else if (randomMonster == -3) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[22] = 42;

				} else {
					movegol(22, 0);
					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[21] = 42;

				} else {
					movegol(21, 1);
					stand();
				}
			} else if (randomMonster == 77) {
				if (pan.PV2.get(0) <= 0) {
					pan.avancem[25] = 42;

				} else {
					movefinale(25);
					stand();
				}
				if (pan.PV2.get(1) <= 0) {
					pan.avancem[24] = 42;

				} else {
					movefinale(24);
					stand();
				}
				if (pan.PV2.get(2) <= 0) {
					pan.avancem[23] = 42;

				} else {
					movefinale(23);
					stand();
				}
			} else if (randomMonster == -4) {
				if (pan.PV2.get(0) <= 0) {
					pan.mewto = 42;
				} else {
					mewto();
					stand();
				}
			}

			/* if ((pan.PV2.get(0) <= 0 && pan.PV2.get(1) <= 0)) { */

			if (verifPV2()) {
				pan2.TEXTE = "";
				ecrire("les ennemies sont vaincus !");
				// Les ennemies sont mort alors
				// REMETTRE LE CURSEUR A 0
				pan2.mode = false;
				pan.mode = false;
				selection = 0;
				// reossage de la map du debut sans avance (1);
				if (pan.level != 7 || pan.level != 8 || pan.level != 88
						|| pan.level != 9 || pan.level != 10 || pan.level != 11
						|| pan.level != 111) {
					pan.map = 0;
					pan.map2 = 0;
					pan.size = 500;
					pan.size2 = 700;
				}

				musicoff();
				if (!scenefini) {
					histoire2();
					scenefini = true;
				} else {
					if (pan.level == 1 || pan.level == 0)
						music("image/boss-battle-2-.mid");
					if (pan.level == 3)
						music("image/village.mid");
					// etape = true;
				}

				if ((pan.level < 7 && pan.level >= 0) || pan.level == 33) {
					if (randomMonster == 3) {
						pan2.TEXTE = "";
						ecrire("Le Monstre succombe");
						musicoff();
						music("image/village.mid");
						pan.xd = -20;
						pan.ye = -1000;
						pan.level = 3;
						histoire4();
					}
					if (randomMonster == 5) {
						musicoff();
						music("image/village.mid");
					}
					if (randomMonster == 6) {

						musicoff();
						music("image/village.mid");
						ecrire(mem.af("blabla/text4"));

						for (int i = 0; i < 24; i++) {
							if (i % 2 == 0)
								pan.animX2 = true;
							else
								pan.animX2 = false;
							pause(100);
							pan.repaint();
						}
						pan.level = 7;
						musicoff();
						music("image/venus2.mid");
						pan.repaint();

						ecrire(mem.af("blabla/text5"));
						// pan.x1 += 60;
						pan.xl = -1000;
						pan.yl = -1000;
						pan.repaint();
						// SUITE DE LHISTOIRE <ICI>

					}
				} else if (pan.level == 7 || pan.level == 8 || pan.level == 88
						|| pan.level == 9 || pan.level == 10 || pan.level == 11) {
					music("image/venus2.mid");
				} else if (pan.level == 111) {
					music("image/village.mid");
					pan.level = -3;
					pan.animX2 = false;
					pan.xd = -1000;
					pan.yd = -1000;
					again();
					// ending();
				} else if (pan.level == -5) {
					// defaite de Erza
					music("image/village.mid");

					mouvement = false;
					ecrire(mem.af("blabla/suite2"));

					for (int i = 0; i < 28; i++) {
						if (i % 2 == 0)
							pan.animX2 = true;
						else
							pan.animX2 = false;
						pause(100);
						pan.repaint();
					}
					pan.level = 8;
					pan.debutjeu = false;
					pan.x1 = 120;
					pan.y1 = 170;
					music("image/vale.mid");
					pan.repaint();
				} else if (pan.level >= 1000) {
					music("image/vale.mid");
					if (pan.level == 1003) {
						pan.level = 1004;
						pan.repaint();
						// scene final
						// demon bleu recule
						pan.avancem[2] = 6;
						for (int i = 0; i < 4; i++) {
							pan.avancem[2]++;
							if (pan.avancem[2] == 10) {
								pan.avancem[8] = 7;
							}
							pan.xd += 20;
							pause(200);
							pan.repaint();
						}
						pan.avancem[8] = 1;
						int x = pan.xd;
						ecrire("DEMON BLEU :ARRRRMais\n comment !??je reve !\nme faire battre\n par des larves\n");
						for (int i = 0; i < 25; i++) {
							if (i % 2 == 0)
								pan.xd = -1000;
							else
								pan.xd = x;
							pause(200);
							pan.repaint();
						}
						// in the end
						musicoff();
						music("image/ivan-s-theme.mid");
						pause(3000);
						pan.avancem[8] = 3;
						for (int i = 0; i < 7; i++) {
							pan.avancem[8]++;
							pan.tx[2] += 20;
							if (pan.avancem[8] == 7)
								pan.avancem[8] = 4;
							pause(200);
							pan.repaint();
						}
						ecrire(mem.af("blabla/final3"));
						pan.tx[2] += 20;
						pause(200);
						pan.finale = true;
						pan.repaint();
					}
				}

				pan.combatG++;
				if (pan.level != 1004)
					mouvement = true;
				pan.repaint();
				pan2.repaint();

			}

			pan.repaint();
			verif();

			tour = true;
			// Le cas ou l'on perd
			if (pan.PV.get(0) <= 0 && pan.PV.get(1) <= 0 && pan.PV.get(2) <= 0) {
				pan2.TEXTE = "";
				ecrire("FIN DE PARTIE \n VOUS ETES MORT");
				pause(5000);
				System.exit(0);
			}
		}
	}

	// altternative
	public void again() {

		ecrire(mem.af("blabla/text9"));

	}

	// fin
	public void ending() {
		pan.xd = -1000;
		pan.yd = -1000;
		pan2.TEXTE = "";
		ecrire(mem.af("blabla/text8"));
		pan.findejeu = true;
		ecrire("Ainsi le DEMON BLEU parvint \n a s'echapper grace \na ses spectres de PAVEL et\n CYNTHIA \n\nIl etais partie...");
		pause(10000);
		pan.bool[4] = false;
		ecrire("Mais nos heros \n n'abandonneront pas !\n et chercheront \n a le retrouver !");
		pause(10000);
		ecrire("FIN");
		pause(10000);
	}

	// Act1 scene 4
	public void histoire4() {
		pan.ty[2] = 300;
		pan.tx[2] = 280;
		mouvement = false;
		pan2.TEXTE = "";
		ecrire(mem.af("blabla/texte7"));

		// vlad avance vers nous
		pan.avancem[8] = 0;
		for (int i = 0; i < 7; i++) {
			pan.avancem[8]++;
			pan.tx[2] -= 20;
			if (pan.avancem[8] == 4) {
				pan.avancem[8] = 1;
			}
			pause(200);
			pan.repaint();
		}
		pan2.TEXTE = "";
		ecrire(mem.af("blabla/texte8"));
		// vlad va a droite
		pan.avancem[8] = 4;
		for (int i = 0; i < 5; i++) {
			pan.avancem[8]++;
			if (pan.avancem[8] == 7) {
				pan.avancem[8] = 4;
			}
			pan.tx[2] += 15;
			pan.repaint();
			pause(200);
		}
		pan2.TEXTE = "";
		ecrire(mem.af("blabla/texte9"));
		// vlad avance vers nous
		pan.avancem[8] = 0;
		for (int i = 0; i < 13; i++) {
			pan.avancem[8]++;
			pan.tx[2] -= 20;
			if (pan.avancem[8] == 4) {
				pan.avancem[8] = 1;
			}
			pause(200);
			pan.repaint();
		}

	}

	// verifie que tous le monde est mort chez les mechants
	public boolean verifPV2() {
		for (int i = 0; i < pan.PV2.size(); i++) {
			if (pan.PV2.get(i) > 0)
				return false;
		}
		return true;
	}

	boolean scenefini = false;

	class AnimX implements Runnable {
		int value = 0;

		public AnimX(int value) {
			this.value = value;
		}

		public void run() {
			mouvement = false;
			if (value == 0) {
				// ennemi au hasard
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				pan2.TEXTE = "";
				modecombat((int) (Math.random() * 2 + 1));
				pan.repaint();
			} else if (value == 1) {
				// ennemie autre
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				pan2.TEXTE = "";
				modecombat(3);
				pan.repaint();
			} else if (value == 2) {
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				pan2.TEXTE = "";
				modecombat(((int) (Math.random() * 2) + 4));
				pan.repaint();
			} else if (value == 3) {
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				pan2.TEXTE = "";
				modecombat(((int) (Math.random() * 6) + 1));
				pan.repaint();
			} else if (value == 4) {
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				pan2.TEXTE = "";
				modecombat(9261);
				pan.repaint();
			} else if (value == 5) {
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				pan2.TEXTE = "";
				if ((int) (Math.random() * 10) == 5) {
					modecombat(((int) (Math.random() * 6) + 1));
				} else {
					modecombat(-((int) (Math.random() * 4) + 1));
				}

				pan.repaint();
			}
		}
	}

	public void histoire2() {
		// mechant va a droite puis va ver le bas parle puis repart

		music("image/boss-battle-2-.mid");
		pan.avancem[2] = 4;
		for (int i = 0; i < 12; i++) {
			pan.avancem[2]++;
			if (pan.avancem[2] == 7) {
				pan.avancem[2] = 4;
			}
			pan.xd += 10;
			pan.repaint();
			pause(200);
		}
		pan2.TEXTE = "";
		ecrire(mem.af("blabla/texte4"));
		pan.avancem[2] = 0;
		for (int i = 0; i < 10; i++) {
			pan.avancem[2]++;
			if (pan.avancem[2] == 4) {
				pan.avancem[2] = 1;
			}
			pan.yd += 20;
			pan.repaint();
			pause(200);
		}
		mouvement = true;

	}

	// classe qui execture les commande
	class Exec implements Runnable {
		ArrayList<Integer> ar;

		public Exec(ArrayList<Integer> ar) {
			this.ar = ar;
		}

		public void run() {
			// Equipe de Pavel qui passe en mode attaque
			System.out.println(ar.size());
			if (ar.get(0) != null)
				if ((ar.get(0) == 1 || ar.get(0) == -3 || ar.get(0) == -2)
						&& pan.PP.get(0) <= 0) {
				} else if (pan.PV.get(0) <= 0) {
				} else
					movePavel(ar.get(0));
			stand();
			if (ar.get(1) != null)
				if ((ar.get(1) == 1 || ar.get(1) == -2 || ar.get(1) == -3)
						&& pan.PP.get(1) <= 0) {
				} else if (pan.PV.get(1) <= 0) {
				} else
					moveCyntia(ar.get(1));
			stand();
			if (ar.get(2) != null)
				if ((ar.get(2) == 0 || ar.get(2) == -2 || ar.get(2) == -3)
						&& pan.PP.get(2) <= 0) {
				} else if (pan.PV.get(2) <= 0) {
				} else
					moveWitch(ar.get(2));
			stand();
			tour = false;
			select = new ArrayList<Integer>();
			attack = new Thread(new Deplacement());
			attack.start();
		}
	}

	class Pause implements Runnable {
		int value;

		public Pause(int value) {
			this.value = value;
		}

		public void run() {

			// Mode HISTOIRE 3(RACINE!!) act 1 Scene 3
			if (value == 2) {
				if (pan.combatG > 1) {
					pan.xd = 420;
					pan.yd = 230;
					// marche a gauche
					pan.avancem[2] = 7;
					for (int i = 0; i < 8; i++) {
						pan.avancem[2]++;
						if (pan.avancem[2] == 10) {
							pan.avancem[2] = 7;
						}
						pan.xd -= 20;
						pan.repaint();
						pause(200);
					}
					// marche vers le basFF
					pan.avancem[2] = 1;
					for (int i = 0; i < 6; i++) {
						pan.avancem[2]++;
						if (pan.avancem[2] == 4) {
							pan.avancem[2] = 1;
						}
						pan.yd += 20;
						pan.repaint();
						pause(200);
					}

					pan2.TEXTE = "";
					ecrire(mem.af("blabla/texte5"));
					// Pavel marche vers le bas
					for (int i = 0; i < 6; i++) {
						// Pavel et son equipe marchent
						pan.orientation = 2;
						pan.avance++;
						if (pan.avance == 4)
							pan.avance = 1;
						pan.y1 += 20;
						pan.repaint();
						pause(200);
					}
					// DEMON BLEU en fait de meme
					pan.avancem[2] = 1;
					for (int i = 0; i < 6; i++) {
						pan.avancem[2]++;
						if (pan.avancem[2] == 4) {
							pan.avancem[2] = 1;
						}
						pan.yd += 20;
						pan.repaint();
						pause(200);
					}
					pan.level = 2;

					// coordonné de Pavel
					pan.x1 = 400;
					pan.y1 = 150;
					// coordonné de DEMON BLEU
					pan.xd = 300;
					pan.yd = 200;

					pan.map2 = -250;
					avance(3);

					pan.repaint();

					pan.avancem[2] = 7;
					// vers la gauche
					for (int i = 0; i < 9; i++) {
						pan.avancem[2]++;
						if (pan.avancem[2] == 10) {
							pan.avancem[2] = 7;
						}
						pan.xd -= 20;
						pan.repaint();
						pause(200);
					}

					for (int i = 0; i < 15; i++) {
						// Pavel et son equipe marchent
						pan.orientation = 1;
						pan.avance++;
						if (pan.avance == 4)
							pan.avance = 1;
						pan.x1 -= 20;
						pan.repaint();
						pause(200);
					}
					pan.orientation = 2;
					pan.ye += 15;
					pan.repaint();
					pan2.TEXTE = "";
					ecrire(mem.af("blabla/texte6"));

					pan.repaint();
					animX = new Thread(new AnimX(1));
					animX.start();
					// pan.avancem[5] = 1;// apparition de zork
					zork = new Thread(new Mechant());
					zork.start();

				} else {
					mouvement = false;
					pan.orientation = 3;
					pan.avance = 0;
					for (int i = 0; i < 6; i++) {
						pan.avance++;
						if (pan.avance == 5) {
							pan.avance = 1;
						}
						pan.y1 -= 15;
						pause(200);
						pan.repaint();
					}
					pan2.TEXTE = "";
					ecrire(mem.af("blabla/neg"));
					mouvement = true;
				}

			} else if (value == 88) {
				// the end
				musicoff();
				music("image/the-end.mid");
				boutonA = 80;
				ecrire(mem.af("blabla/texte11"));
				// ecrire("\n\n\n\n\n\n\n\nFOR Corentin and Emilie");
			} else if (value == 1) {
				// DameJaune qui parle
				mouvement = false;
				pan2.TEXTE = "";
				if (pan.level == 4)
					ecrire(mem.af("blabla/text1"));
				else
					ecrire("DAME JAUNE :Encore toi !? \n Va t-en!");
				pan.orientation = 0;
				pan.avance = 0;
				for (int i = 0; i < 6; i++) {
					pan.avance++;
					if (pan.avance == 5) {
						pan.avance = 1;
					}
					pan.x1 += 20;
					pan.repaint();
					pause(200);
				}
				mouvement = true;
			} else if (value == 3) {
				// scene 4 act 1 (mode histoire)

				// scene ou Link arrive appelé par dekens
				mouvement = false;
				ecrire(mem.af("blabla/text2"));
				pan.orientation = 0;
				pan.avance = 0;
				for (int i = 0; i < 5; i++) {
					pan.avance++;
					if (pan.avance == 5) {
						pan.avance = 1;
					}
					pan.x1 += 20;
					pan.repaint();
					pause(200);
				}
				pan.level = -2;
				pause(2000);
				pan.repaint();
				pan.level = 33;
				pan.x1 = 100;
				pan.y1 = 290;
				pan.xl = 600;
				pan.yl = 300;
				// Link avance vers nous
				pan.orientationl = 1;
				pan.avancel = 1;
				for (int i = 0; i < 20; i++) {
					pan.avancel++;
					if (pan.avancel == 5)
						pan.avancel = 1;
					pan.xl -= 20;
					pause(200);
					pan.repaint();

				}

				ecrire(mem.af("blabla/text3"));
				// lancement du combat avec Link apres on rentre au chateau
				// rotation de link declarant le combat
				pan.avancel = 1;
				pan.orientationl = 4;
				for (int i = 1; i < 16; i++) {
					pan.avancel++;
					pan.repaint();
					pause(10);
				}
				pan.avancel = 1;
				pan.orientationl = 1;
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}

				pan2.TEXTE = "";
				modecombat(22);
				pan.repaint();

			} else if (value == 5) {
				pan.level = 88;
				mouvement = false;
				avance(4);
				mouvement = true;

			} else if (value == 6) {
				mouvement = false;
				avance(5);
				mouvement = true;
				pan.level = 8;
			} else if (value == 7) {
				// Le cas ou on a asse ou pas d'objets
				if (pan.Objet < 4) {
					mouvement = false;
					pan.orientation = 3;
					pan.avance = 0;
					// on fait reculé Link
					for (int i = 0; i < 6; i++) {
						pan.avance++;
						if (pan.avance == 5) {
							pan.avance = 1;
						}
						pan.y1 -= 15;
						pause(200);
						pan.repaint();
					}
					pan2.TEXTE = "";
					ecrire(mem.af("blabla/objets"));
					mouvement = true;
				}
				if (!pan.debutjeu) {
					mouvement = false;
					pan.orientation = 3;
					pan.avance = 0;
					// on fait reculé Link
					for (int i = 0; i < 6; i++) {
						pan.avance++;
						if (pan.avance == 5) {
							pan.avance = 1;
						}
						pan.y1 -= 15;
						pause(200);
						pan.repaint();
					}
					pan2.TEXTE = "";
					ecrire("il n'y a rien \n ici ,\n on est deja venu!");
					mouvement = true;
				}
			} else if (value == 8) {
				// mouvement en stop
				mouvement = false;
				ecrire(mem.af("blabla/text6"));
				avance(6);
				magiedefin = new Thread(new MagieDeFin());
				magiedefin.start();
				pan.avancem[2] = 10;
				pan.xd = 245;
				pan.yd = 420;
				pan.repaint();
				ecrire(mem.af("blabla/text7"));
				for (int i = 0; i < 25; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				modecombat(42);
				// <FIN>
			} else if (value == 9) {
				// Scene avec une poulette magique
				mouvement = false;
				pan.orientation = 3;
				pan.avance = 1;
				for (int i = 0; i < 3; i++) {
					pan.y1 -= 15;
					pan.avance++;
					pan.repaint();
					pause(200);
				}
				pan.avance = 0;
				pan.orientation = 2;
				for (int i = 0; i < 5; i++) {
					pan.y1 += 20;
					pan.avance++;
					if (pan.avance == 5)
						pan.avance = 1;
					pan.repaint();
					pause(200);
				}
				ecrire("Poulish : Bonjour etranger \n PAVEL :je cherches DEKENS \n Poulish : une legende raconte que \n si tu as un niveau siffisant \n un guerrier apparaitra");
				mouvement = true;
			} else if (value == 10) {
				mouvement = false;
				pan.avance = 0;
				pan.orientation = 3;
				for (int i = 0; i < 3; i++) {
					pan.y1 -= 20;
					pan.avance++;
					if (pan.avance == 5)
						pan.avance = 1;
					pan.repaint();
					pause(200);
				}
				ecrire(mem.af("blabla/suite"));
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				modecombat(44);
				pan.repaint();
			} else if (value == 11) {
				// FINAL SCENE combat with Blue DEMON
				mouvement = false;
				// position de vlad
				pan.tx[2] = 192;
				pan.ty[2] = 235;
				pan.avancem[2] = 1;
				// position de demon bleu
				pan.xd = 396;
				pan.yd = 243;
				ecrire("Traxo ...");
				// VLAD AVANCE PUIS RECULE
				pan.avancem[8] = 3;
				for (int i = 0; i < 5; i++) {
					pan.avancem[8]++;
					if (pan.avancem[8] == 7) {
						pan.avancem[8] = 4;
					}
					pan.tx[2] += 20;
					pause(200);
					pan.repaint();
				}
				pan.magiklink2 = true;
				for (int i = 0; i < 6; i++) {
					pan.i++;
					pan.repaint();
					pause(200);
				}
				pan.magiklink2 = false;
				for (int i = 0; i < 4; i++) {
					pan.avancem[8]++;
					if (pan.avancem[8] == 7) {
						pan.avancem[8] = 4;
					}
					pan.tx[2] -= 20;
					pause(200);
					pan.repaint();
				}
				pan.avancem[2] = 7;
				pause(2000);
				// DEMON BLEU S'AVANCE
				pan.avancem[2] = 6;
				for (int i = 0; i < 9; i++) {
					pan.avancem[2]++;
					if (pan.avancem[2] == 10) {
						pan.avancem[2] = 7;
					}
					pan.xd -= 20;
					pause(200);
					pan.repaint();
				}
				ecrire(mem.af("blabla/final"));
				pan.avancem[2] = 0;
				for (int i = 0; i < 4; i++) {
					pan.avancem[2]++;
					if (pan.avancem[2] == 4) {
						pan.avancem[8] = 1;
					}
					pan.yd += 20;
					pause(200);
					pan.repaint();
				}
				// DEMON BLEU AVANCE ENCORE
				pan.avancem[2] = 6;
				for (int i = 0; i < 4; i++) {
					pan.avancem[2]++;
					if (pan.avancem[2] == 10) {
						pan.avancem[8] = 7;
					}
					pan.xd -= 20;
					pause(200);
					pan.repaint();
				}
				pan.avancem[8] = 1;
				pan.avancem[2] = 1;
				ecrire(mem.af("blabla/final2"));
				for (int i = 0; i < 24; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				modecombat(77);
				pan.repaint();
			}
		}
	}

	class MagieDeFin implements Runnable {
		public void run() {

			pan.magiklink2 = true;
			for (int i = 0; i < 6; i++) {
				pan.i++;
				pause(150);
				pan.repaint();
			}
			pan.i = 0;
			pan.magiklink2 = false;

		}
	}

	Thread zork;

	// classe qui gere le monstre ZORK
	class Mechant implements Runnable {
		public void run() {
			while (true) {
				for (int i = 0; i < 5; i++) {
					pan.pox = pan.pox + 5;
					pan.poy = pan.poy + 5;
					pause(200);
					pan.repaint();
				}
				for (int i = 0; i < 5; i++) {
					pan.pox = pan.pox - 5;
					pan.poy = pan.poy - 5;
					pause(200);
					pan.repaint();
				}
			}
		}
	}

	public void stand() {
		if (pan.PV.get(0) != 0) {
			pan.orientation = 0;
			pan.avance = 1;
		}
		if (pan.PV.get(1) != 0) {
			pan.orientation2 = 0;
			pan.avance2 = 1;
		}
		if (pan.PV.get(2) != 0) {
			pan.orientation3 = 0;
			pan.avance3 = 1;
		}
		pan.magikp = false;
		pan.magikc = false;
		pan.magikw = false;
		pan.magikM = false;
		pan.magikp2 = false;
		pan.magikc2 = false;
		pan.magikc = false;
		pan.magiklink = false;
		pan.magiklink2 = false;
		pan.magikvampire = false;
		pan.i = 0;
		pan.repaint();
	}

	public void movePavel(int opt) {
		if (opt == 0) {
			// Attack simple
			pan2.TEXTE = "";
			ecrire("Pavel lance une attaque \n Sword attack !\n -20 Degat");
			pan.orientation = 0;
			for (int i = 0; i < 4; i++) {
				pan.avance++;
				pan.x -= 40;
				pan.repaint();
				pause(200);
			}
			pan.avance = 1;
			for (int i = 0; i < 4; i++) {

				pan.x += 40;
				pan.repaint();
				pause(200);
			}

			pan.PV2.set(select.get(0), pan.PV2.get(select.get(0)) - 20);

		} else if (opt == 1) {
			// cout de magie Noir
			pan2.TEXTE = "";
			ecrire("Pavel lance un sort de \n magie noir ! \n -35 DEGATS!");
			pan.PP.set(0, pan.PP.get(0) - 20);
			pan.orientation = 1;
			pan.avance = 0;
			for (int i = 0; i < 3; i++) {
				pan.avance++;

				pan.repaint();
				pause(300);
			}
			pan.magikp = true;
			pan.repaint();
			pause(2000);

			pan.PV2.set(select.get(0), pan.PV2.get(select.get(0)) - 35);
			// pan.orientation = 0;
			// pan.avance = 1;

		} else if (opt == 2) {
			// hurt

			pan.orientation = 2;
			pan.avance = 1;
			pause(200);
			pan.repaint();

		} else if (opt == 3) {
			// Dead
			pan.orientation = 2;
			pan.avance = 0;
			for (int i = 0; i < 3; i++) {
				pan.avance++;
				pan.repaint();
				pause(200);
			}
			pan.repaint();

		} else if (opt == -2) {
			pan.speciaux[0] = true;
			pan.orientation = 1;
			pan.avance = 0;
			for (int i = 0; i < 3; i++) {
				pan.avance++;

				pan.repaint();
				pause(300);
			}
			pan.PP.set(0, pan.PP.get(0) - 20);
			ecrire("Pavel lance un sort de \n -70 DEGATS!");
			for (int i = 0; i < 53; i++) {
				pan.speciau[0]++;
				pan.repaint();
				pause(80);
			}
			pan.speciaux[0] = false;
			pan.speciau[0] = 1;
			pan.PV2.set(select.get(0), pan.PV2.get(select.get(0)) - 70);

		} else if (opt == -3) {
			pan.speciaux[1] = true;
			pan.orientation = 1;
			pan.avance = 0;
			for (int i = 0; i < 3; i++) {
				pan.avance++;

				pan.repaint();
				pause(300);
			}
			pan.PP.set(0, pan.PP.get(0) - 35);
			ecrire("Pavel lance un sort de \n -80 DEGATS!");
			for (int i = 0; i < 188; i++) {
				pan.speciau[1]++;
				pan.repaint();
				pause(80);
			}
			pan.speciaux[1] = false;
			pan.speciau[1] = 1;
			pan.PV2.set(select.get(0), pan.PV2.get(select.get(0)) - 80);

		}

	}

	public void movec2() {
		int cible = (int) (Math.random() * 2);
		if (cible == 0) {
			pan.avancem[15] = 4;
			for (int i = 0; i < 3; i++) {
				pan.avancem[15]++;
				if (pan.avancem[15] == 8)
					pan.avancem[15] = 5;
				pan.tx[1] += 20;
				pan.ty[1] -= 20;
				pan.repaint();
				pause(200);
			}
			for (int i = 0; i < 3; i++) {
				pan.avancem[15]++;
				if (pan.avancem[15] == 8)
					pan.avancem[15] = 5;
				pan.tx[1] -= 20;
				pan.ty[1] += 20;
				pan.repaint();
				pause(200);
			}
			int cible2 = (int) (Math.random() * 3);

			switch (cible2) {
			case 0:
				ecrire("Dark CYNTHIA lance fall angel \n -20 degats sur PAVEL");
				movePavel(2);
				pan.PV.set(0, pan.PV.get(0) - 20);
				break;
			case 1:
				ecrire("Dark CYNTHIA lance fall angel \n -20 degats sur CYNTHIA");
				moveCyntia(3);
				pan.PV.set(1, pan.PV.get(1) - 20);
				break;

			case 2:
				ecrire("Dark CYNTHIA lance fall angel \n -30 degats sur\nSOPHIA");
				moveWitch(2);
				pan.PV.set(2, pan.PV.get(2) - 30);
				break;
			}
			pan.avancem[15] = 1;
		} else if (cible == 1) {
			pan.avancem[15] = 0;
			for (int i = 0; i < 3; i++) {
				pan.avancem[15]++;
				pause(200);
				pan.repaint();
			}
			pan.magikc2 = true;
			pan.avancem[15] = 1;

			int cible2 = (int) (Math.random() * 3);

			switch (cible2) {
			case 0:
				ecrire("Dark CYNTHIA lance MagicTrap \n -30 degats sur PAVEL");
				movePavel(2);
				pan.PV.set(0, pan.PV.get(0) - 30);
				break;
			case 1:
				ecrire("Dark CYNTHIA lance MagicTrap! \n -30 degats sur CYNTHIA");
				moveCyntia(3);
				pan.PV.set(1, pan.PV.get(1) - 30);
				break;

			case 2:
				ecrire("Dark CYNTHIA lance MagicTrap! \n -40 degats sur\nSOPHIA");
				moveWitch(2);
				pan.PV.set(2, pan.PV.get(2) - 40);
				break;
			}
		}
	}

	public void moveCyntia(int opt) {
		if (opt == 2) {
			// Coup en retrait d'elf
			pan.orientation2 = 0;
			pan.avance2 = 0;
			for (int i = 0; i < 3; i++) {
				pan.avance2++;
				pan.repaint();
				pause(200);
			}
		} else if (opt == 0) {
			// attack avec un arc
			pan2.TEXTE = "";
			ecrire("Cynthia lance une attaque \n aerienne ! -30 DEGATS!");
			pan.orientation2 = 3;
			pan.avance2 = 0;
			for (int i = 0; i < 4; i++) {
				pan.avance2++;
				if (i <= 2) {
					pan.x2 -= 50;
					pan.y2 -= 40;
				} else {

				}
				pan.repaint();
				pause(200);

			}
			for (int i = 0; i < 3; i++) {
				pan.avance2 = 2;
				pan.x2 += 50;
				pan.y2 += 40;
				pan.repaint();
				pause(200);
				pan.avance2 = 1;
			}
			pan.orientation2 = 0;
			pan.avance2 = 1;
			pan.repaint();

			pan.PV2.set(select.get(1), pan.PV2.get(select.get(1)) - 30);
		} else if (opt == 1) {
			// magic blinda
			pan2.TEXTE = "";
			ecrire("Cynthia lance un sort \n de magie tourbillonnant \n -40 DEGATS!");
			pan.PP.set(1, pan.PP.get(1) - 20);
			pan.orientation2 = 2;
			pan.avance2 = 0;
			for (int i = 0; i < 2; i++) {
				pan.avance2++;
				pan.repaint();
				pause(200);
			}
			pan.magikc = true;
			pan.repaint();

			pan.PV2.set(select.get(1), pan.PV2.get(select.get(1)) - 40);
			pause(2000);
		} else if (opt == 3) {
			// hurt dead
			pan.orientation2 = 1;
			pan.avance2 = 0;
			for (int i = 0; i < 2; i++) {
				pan.avance2++;
				pan.repaint();
				pause(200);
			}
		} else if (opt == -2) {
			pan.speciaux[2] = true;
			pan.orientation2 = 2;
			pan.avance2 = 0;
			for (int i = 0; i < 2; i++) {
				pan.avance2++;
				pan.repaint();
				pause(200);
			}
			pan.PP.set(1, pan.PP.get(1) - 20);
			ecrire("CYNTHIA lance un sort de \n -60 DEGATS!");
			for (int i = 0; i < 47; i++) {
				pan.speciau[2]++;
				pan.repaint();
				pause(80);
			}
			pan.speciaux[2] = false;
			pan.speciau[2] = 1;
			pan.PV2.set(select.get(1), pan.PV2.get(select.get(1)) - 60);

		} else if (opt == -3) {
			pan.speciaux[3] = true;
			pan.orientation2 = 2;
			pan.avance2 = 0;
			for (int i = 0; i < 2; i++) {
				pan.avance2++;
				pan.repaint();
				pause(200);
			}
			pan.PP.set(1, pan.PP.get(1) - 20);
			ecrire("CYNTHIA lance un sort de \n -70 DEGATS!");
			for (int i = 0; i < 60; i++) {
				pan.speciau[3]++;
				pan.repaint();
				pause(80);
			}
			pan.speciaux[3] = false;
			pan.speciau[3] = 1;
			pan.PV2.set(select.get(1), pan.PV2.get(select.get(1)) - 70);

		}
	}

	public void moveWitch(int opt) {
		if (opt == 0) {
			// Jetter un sort permet surtout de guerrir ses soldats
			pan2.TEXTE = "";
			ecrire("Sophia Declanche de la \n neige ! -15 DEGATS \n +10 PV !");
			pan.PP.set(2, pan.PP.get(2) - 10);
			for (int i = 0; i < 2; i++) {
				pan.PV.set(i, pan.PV.get(i) + 10);
			}
			pan.orientation3 = 0;
			pan.avance3 = 0;
			pan.magikw = true;
			for (int i = 0; i < 4; i++) {
				pan.avance3++;
				pan.repaint();
				pause(500);
			}

			pan.PV2.set(select.get(2), pan.PV2.get(select.get(2)) - 15);

		} else if (opt == 2) {
			pan.avance3 = 0;
			for (int i = 0; i < 2; i++) {
				pan.orientation3 = 1;
				pan.avance3++;
				pan.repaint();
				pause(200);
			}
		} else if (opt == -2) {
			pan.speciaux[4] = true;
			pan.orientation3 = 0;
			pan.avance3 = 0;

			for (int i = 0; i < 4; i++) {
				pan.avance3++;
				pan.repaint();
				pause(200);
			}
			pan.PP.set(2, pan.PP.get(2) - 20);
			ecrire("SOPHIA lance un sort de \n -60 DEGATS!");
			for (int i = 0; i < 30; i++) {
				pan.speciau[4]++;
				pan.repaint();
				pause(80);
			}
			pan.speciaux[4] = false;
			pan.speciau[4] = 1;
			pan.PV2.set(select.get(2), pan.PV2.get(select.get(2)) - 60);

			pan.speciaux[4] = false;
			pan.speciau[4] = 1;
		} else if (opt == -3) {
			pan.orientation3 = 0;
			pan.avance3 = 0;
			pan.speciaux[5] = true;

			for (int i = 0; i < 4; i++) {
				pan.avance3++;
				pan.repaint();
				pause(200);
			}
			pan.PP.set(2, pan.PP.get(2) - 25);
			ecrire("SOPHIA lance un sort de \n -50 DEGATS!");
			for (int i = 0; i < 92; i++) {
				pan.speciau[5]++;
				pan.repaint();
				pause(80);
			}
			pan.speciaux[5] = false;
			pan.speciau[5] = 1;
			pan.PV2.set(select.get(2), pan.PV2.get(select.get(2)) - 50);

			pan.speciaux[5] = false;
			pan.speciau[5] = 1;
		}
	}

	public void moveGolem(int cible, int couleur) {
		if (couleur == 0) {
			// si c'est un golem NOIR
			for (int i = 0; i < 5; i++) {
				pan.avancem[0]++;
				pan.tx[0] += 20;
				pan.repaint();
				pause(200);
			}
			pan.avancem[0] = 1;
		} else if (couleur == 1) {
			// GOLEM de roche
			for (int i = 0; i < 4; i++) {
				pan.avancem[4]++;
				pan.tx[0] += 20;
				pan.repaint();
				pause(200);
			}
			pan.avancem[4] = 1;
		}
		pan2.TEXTE = "";

		switch (cible) {
		case 0:
			movePavel(2);
			pan.PV.set(0, pan.PV.get(0) - 20);
			ecrire("Golem lance une attaque !\n -20 DEGATS");
			break;
		case 1:
			moveCyntia(3);
			pan.PV.set(1, pan.PV.get(1) - 30);
			ecrire("Golem lance une attaque !\n -30 DEGATS");
			break;

		case 2:
			moveWitch(2);
			pan.PV.set(2, pan.PV.get(2) - 40);
			ecrire("Golem lance une attaque !\n -40 DEGATS!");
			break;
		}

		for (int i = 0; i < 5; i++) {
			if (i == 4 && couleur == 1) {
				break;
			}
			pan.tx[0] -= 20;
			pan.repaint();
			pause(100);
		}
	}

	public void moveFrank() {
		// Frank crie ,et sa touche un de ses adversaire
		pan2.TEXTE = "";
		ecrire("Zombie lance Crie de !\n nuit ! ");

		pan.avancem[3] = 1;
		pause(200);
		pan.repaint();
		pan.avancem[3] = 4;
		pause(200);
		pan.repaint();
		pan.avancem[3] = 2;
		pause(200);
		pan.repaint();
		// vise une cible dans notre equipe
		int cible = (int) (Math.random() * 3);

		switch (cible) {
		case 0:
			ecrire("Frank hurle \n -30 DEGATS sur PAVEL");
			movePavel(2);
			pan.PV.set(0, pan.PV.get(0) - 30);
			break;
		case 1:
			ecrire("Frank hurle \n -20 DEGATS sur CYNTHIA");
			moveCyntia(3);
			pan.PV.set(1, pan.PV.get(1) - 20);
			break;

		case 2:
			ecrire("Frank hurle \n -30 DEGATS sur SOPHIA");
			moveWitch(2);
			pan.PV.set(2, pan.PV.get(2) - 30);
			break;
		}
	}

	public void moveZork() {
		zork.stop();

		for (int i = 0; i < 4; i++) {
			pan.pox += 20;
			pause(100 - i * 15);
			pan.repaint();
		}
		int cible = (int) (Math.random() * 3);

		switch (cible) {
		case 0:
			movePavel(2);
			pan2.TEXTE = "";
			ecrire("Zork utilise Griffons ! \n -100 DEGATS!sur Pavel");
			pan.PV.set(0, pan.PV.get(0) - 100);
			break;
		case 1:
			moveCyntia(3);
			pan2.TEXTE = "";
			ecrire("Zork utilise Griffons ! \n -80 DEGATS sur Cynthia!");
			pan.PV.set(1, pan.PV.get(1) - 80);
			break;

		case 2:
			moveWitch(2);
			pan2.TEXTE = "";
			ecrire("Zork utilise Griffons ! \n -90 DEGATS!sur Sophia");
			pan.PV.set(2, pan.PV.get(2) - 90);
			break;
		}

		pan.pox = -50;
		pan.poy = 200;
		zork = new Thread(new Mechant());
		zork.start();

	}

	public void moveDead(int deg) {
		if (deg == 0) {
			for (int i = 0; i < 3; i++) {
				pan.avancem[1]++;
				pan.tx[1] += 70;
				pause(800);
				pan.repaint();
			}
			for (int i = 0; i < 3; i++) {
				pan.tx[1] -= 70;
				pan.avancem[1] = 1;
				pan.repaint();
			}
			pan2.TEXTE = "";
			ecrire("quelleton lance une ataque \n -20 DEGATS chacuns!");
			pan.PV.set(0, pan.PV.get(0) - 20);
			pan.PV.set(1, pan.PV.get(1) - 20);
			pan.PV.set(2, pan.PV.get(2) - 20);

		} else if (deg == 1) {
			for (int i = 0; i < 4; i++) {
				pan.tx[1] += 70;
				pan.ty[1] -= 50;
				pan.magikc = true;

				pan.repaint();
				pause(400);

			}
			for (int i = 0; i < 4; i++) {
				pan.tx[1] -= 70;
				pan.ty[1] += 50;
				pan.magikc = false;
				pan.magikp = true;
				pan.repaint();
				pause(200);
			}
			pan2.TEXTE = "";
			ecrire("quelleton lance un sort \n combine ! -20 \n -30 DEGATS -30 \nDEGATS !!");
			pan.PV.set(0, pan.PV.get(0) - 20);
			pan.PV.set(1, pan.PV.get(1) - 30);
			pan.PV.set(2, pan.PV.get(2) - 30);

		} else if (deg == 2) {
			pan.magikM = true;
			for (int i = 0; i < 15; i++) {
				pan.i++;
				pan.repaint();
				pause(300);
			}
			pan2.TEXTE = "";
			ecrire("queleton lance une incantation !\nSort malefique ! \n-40 DEGATS! -50 DEGATS\n -50 DEGATS");

			pan.PV.set(0, pan.PV.get(0) - 40);
			pan.PV.set(1, pan.PV.get(1) - 50);
			pan.PV.set(2, pan.PV.get(2) - 50);

		}
		movePavel(2);
		moveCyntia(3);
		moveWitch(2);
	}

	public void moveVillage() {
		int opt = (int) (Math.random() * 2);
		if (opt == 0) {
			pan.avancem[6] = 1;
			for (int i = 0; i < 4; i++) {
				pan.avancem[6]++;
				pan.repaint();
				pause(200);
			}
			int cible = (int) (Math.random() * 3);

			switch (cible) {
			case 0:
				movePavel(2);
				pan2.TEXTE = "";
				ecrire("Villageaois lance pierre ! \n -10 DEGATS!sur Pavel");
				pan.PV.set(0, pan.PV.get(0) - 10);
				break;
			case 1:
				moveCyntia(3);
				pan2.TEXTE = "";
				ecrire("Villageois lance pierre ! \n -20 DEGATS sur Cynthia!");
				pan.PV.set(1, pan.PV.get(1) - 20);
				break;

			case 2:
				moveWitch(2);
				pan2.TEXTE = "";
				ecrire("Villageaois lance pierre! \n -20 DEGATS!sur Sophia");
				pan.PV.set(2, pan.PV.get(2) - 20);
				break;
			}
			pan.avancem[6] = 1;

		} else if (opt == 1) {
			pan.avancem[6] = 5;
			for (int i = 0; i < 4; i++) {
				pan.tx[0] += 20;
				pan.repaint();
				pause(200);
			}
			for (int i = 0; i < 4; i++) {
				pan.tx[0] -= 20;
				pan.repaint();
				pause(200);
			}
			int cible = (int) (Math.random() * 3);
			switch (cible) {
			case 0:
				movePavel(2);
				pan2.TEXTE = "";
				ecrire("Villageaois lance pierre ! \n -10 DEGATS!sur Pavel");
				pan.PV.set(0, pan.PV.get(0) - 10);
				break;
			case 1:
				moveCyntia(3);
				pan2.TEXTE = "";
				ecrire("Villageois lance pierre ! \n -10 DEGATS sur Cynthia!");
				pan.PV.set(1, pan.PV.get(1) - 10);
				break;

			case 2:
				moveWitch(2);
				pan2.TEXTE = "";
				ecrire("Villageaois lance pierre! \n -10 DEGATS!sur Sophia");
				pan.PV.set(2, pan.PV.get(2) - 10);
				break;
			}
			pan.avancem[6] = 1;
			pan.repaint();
		}
	}

	public void moveDameV() {
		pan.avancem[7] = 0;
		for (int i = 0; i < 4; i++) {
			pan.avancem[7]++;
			pan.repaint();
			pause(200);
		}
		int cible = (int) (Math.random() * 3);

		switch (cible) {
		case 0:
			movePavel(2);
			pan2.TEXTE = "";
			ecrire("Dame de truite attaque ! \n -10 DEGATS!sur Pavel");
			pan.PV.set(0, pan.PV.get(0) - 10);
			break;
		case 1:
			moveCyntia(3);
			pan2.TEXTE = "";
			ecrire("Dame de truite ! \n -20 DEGATS sur Cynthia!");
			pan.PV.set(1, pan.PV.get(1) - 20);
			break;

		case 2:
			moveWitch(2);
			pan2.TEXTE = "";
			ecrire("Dame de truite! \n -30 DEGATS!sur Sophia");
			pan.PV.set(2, pan.PV.get(2) - 30);
			break;
		}
		pan.avancem[7] = 1;
	}

	public void moveDameVAMPIRE() {
		// Attack de la dame vampire
		pan.avancem[9] = 0;
		for (int i = 0; i < 3; i++) {
			pan.avancem[9]++;
			pan.repaint();
			pause(400);
		}
		int cible = (int) (Math.random() * 3);

		switch (cible) {
		case 0:
			movePavel(2);
			pan2.TEXTE = "";
			ecrire("Dame vampire attaque ! \n -10 DEGATS!sur Pavel");
			pan.PV.set(0, pan.PV.get(0) - 10);
			break;
		case 1:
			moveCyntia(3);
			pan2.TEXTE = "";
			ecrire("Dma vampire attaque \n -20 DEGATS sur Cynthia!");
			pan.PV.set(1, pan.PV.get(1) - 20);
			break;

		case 2:
			moveWitch(2);
			pan2.TEXTE = "";
			ecrire("Dame vampire attaque! \n -10 DEGATS!sur Sophia");
			pan.PV.set(2, pan.PV.get(2) - 10);
			break;
		}
		pan.avancem[9] = 1;
	}

	public void moveBlonde() {
		// vilage
		pan.avancem[10] = 1;
		for (int i = 0; i < 4; i++) {
			pan.avancem[10]++;
			pan.repaint();
			pan.tx[0] += 30;
			pause(200);
		}
		for (int i = 0; i < 4; i++) {
			pan.repaint();
			pan.tx[0] -= 30;
			pause(200);
		}
		int cible = (int) (Math.random() * 3);

		switch (cible) {
		case 0:
			movePavel(2);
			pan2.TEXTE = "";
			ecrire("villageoise attaque! \n -10 DEGATS!sur Pavel");
			pan.PV.set(0, pan.PV.get(0) - 10);
			break;
		case 1:
			moveCyntia(3);
			pan2.TEXTE = "";
			ecrire("Villageoise lance pierre ! \n -10 DEGATS sur Cynthia!");
			pan.PV.set(1, pan.PV.get(1) - 10);
			break;

		case 2:
			moveWitch(2);
			pan2.TEXTE = "";
			ecrire("Villageaoise lance pierre! \n -20 DEGATS!sur Sophia");
			pan.PV.set(2, pan.PV.get(2) - 20);
			break;
		}
		pan.avancem[10] = 1;
	}

	public void moveLink() {
		int cible = (int) (Math.random() * 3);

		if (cible == 0) {
			// Simple cout d'épé
			for (int i = 0; i < 5; i++) {
				pan.avancem[11] = 3;
				pan.tx[0] += 20;
				pan.repaint();
				pause(200);
			}
			pan.avancem[11] = 3;
			for (int i = 0; i < 2; i++) {
				pan.avancem[11]++;
				pan.repaint();
				pause(200);
			}
			// reviens enarriere
			for (int i = 0; i < 5; i++) {
				pan.tx[0] -= 20;
				pan.repaint();
				pause(200);
			}
			pan.avancem[11] = 1;
			int cible2 = (int) (Math.random() * 3);

			switch (cible2) {
			case 0:
				movePavel(2);
				pan2.TEXTE = "";
				ecrire("Link lance lame equise! \n -20 DEGATS!sur Pavel");
				pan.PV.set(0, pan.PV.get(0) - 20);
				break;
			case 1:
				moveCyntia(3);
				pan2.TEXTE = "";
				ecrire("Link lance lame equise!! \n -20 DEGATS sur Cynthia!");
				pan.PV.set(1, pan.PV.get(1) - 20);
				break;

			case 2:
				moveWitch(2);
				pan2.TEXTE = "";
				ecrire("Link lance lame equise! \n -30 DEGATS!sur Sophia");
				pan.PV.set(2, pan.PV.get(2) - 30);
				break;
			}

		} else if (cible == 1) {
			// magik blinda
			pan.avancem[11] = 5;
			for (int i = 0; i < 2; i++) {
				pan.avancem[11]++;
				pan.repaint();
				pause(200);
			}
			pan.magiklink = true;
			for (int i = 0; i < 6; i++) {
				pan.i++;
				pause(200);
				pan.repaint();
			}
			pan.avancem[11] = 1;
			pan.PV.set(0, pan.PV.get(0) - 30);
			pan.PV.set(1, pan.PV.get(1) - 50);
			pan.PV.set(2, pan.PV.get(2) - 30);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);

			pan.repaint();
		} else if (cible == 2) {
			// magik blinda
			pan.avancem[11] = 5;
			for (int i = 0; i < 2; i++) {
				pan.avancem[11]++;
				pan.repaint();
				pause(200);
			}
			pan.magiklink2 = true;
			for (int i = 0; i < 6; i++) {
				pan.i++;
				pause(200);
				pan.repaint();
			}
			pan.avancem[11] = 1;

			pan.PV.set(0, pan.PV.get(0) - 30);
			pan.PV.set(1, pan.PV.get(1) - 40);
			pan.PV.set(2, pan.PV.get(2) - 40);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.repaint();
		}

	}

	public void moveboss() {
		int cible = (int) (Math.random() * 2);
		pan.magikvampire = true;
		if (cible == 0) {
			for (int i = 0; i < 5; i++) {
				pan.avancem[12]++;
				pan.repaint();
				pause(200);
			}
			for (int i = 0; i < 8; i++) {
				pan.i++;
				pan.repaint();
				pause(100);
			}
			int cible2 = (int) (Math.random() * 3);

			switch (cible2) {
			case 0:
				movePavel(2);
				pan2.TEXTE = "";
				ecrire("Vampire attaque \n -20 DEGATS!sur Pavel");
				pan.PV.set(0, pan.PV.get(0) - 20);
				break;
			case 1:
				moveCyntia(3);
				pan2.TEXTE = "";
				ecrire("Vampire attaque ! \n -20 DEGATS sur Cynthia!");
				pan.PV.set(1, pan.PV.get(1) - 20);
				break;

			case 2:
				moveWitch(2);
				pan2.TEXTE = "";
				ecrire("Vampire attaque! \n -30 DEGATS!sur Sophia");
				pan.PV.set(2, pan.PV.get(2) - 30);
				break;
			}
		} else if (cible == 1) {
			// regeneration
			pan.avancem[12] = 4;
			pan.repaint();
			pause(1000);
			pan.avancem[12] = 5;
			pan.repaint();
			pan.PV2.set(0, pan.PV2.get(0) + 100);
			pan.repaint();
			pan2.TEXTE = "";
			ecrire("Vampre regonfle ses PV !");
		}
	}

	public void moveD() {

		pan.magikM = true;
		for (int i = 0; i < 15; i++) {
			pan.avancem[13]++;
			if (pan.avancem[13] == 4) {
				pan.avancem[1] = 1;
			}
			pan.i++;
			pan.repaint();
			pause(300);
		}
		pan2.TEXTE = "";
		ecrire("Morto lance une incantation !\nSort malefique ! \n-20 DEGATS! -40 DEGATS -40 DEGATS \n ne connais que cette attaque! ");

		pan.PV.set(0, pan.PV.get(0) - 20);
		pan.PV.set(1, pan.PV.get(1) - 40);
		pan.PV.set(2, pan.PV.get(2) - 40);
		pan.repaint();

	}

	public void movePavel2() {
		int cible = (int) (Math.random() * 2);
		if (cible == 0) {
			// sword
			pan.avancem[14] = 0;
			for (int i = 1; i <= 5; i++) {
				pan.avancem[14]++;
				if (pan.avancem[14] == 6) {
					pan.avancem[14] = 1;
				}
				pan.tx[0] += 20;
				pan.repaint();
				pause(200);
			}
			for (int i = 1; i <= 5; i++) {
				pan.tx[0] -= 20;
				pan.repaint();
				pause(200);
			}
			int cible2 = (int) (Math.random() * 3);

			switch (cible2) {
			case 0:
				movePavel(2);
				pan2.TEXTE = "";
				ecrire("Dark Pavel utilise \n sword -20 DEGATS!sur Pavel");
				pan.PV.set(0, pan.PV.get(0) - 20);
				break;
			case 1:
				moveCyntia(3);
				pan2.TEXTE = "";
				ecrire("Dark Pavel attaque ! \n -20 DEGATS sur Cynthia!");
				pan.PV.set(1, pan.PV.get(1) - 20);
				break;

			case 2:
				moveWitch(2);
				pan2.TEXTE = "";
				ecrire("dark pavel utilise ! \n SWORD -30 DEGATS!sur Sophia");
				pan.PV.set(2, pan.PV.get(2) - 30);
				break;
			}

			pan.avancem[14] = 1;
			pan.repaint();
		} else if (cible == 1) {

			pan.avancem[14] = 5;
			for (int i = 0; i < 3; i++) {
				pan.avancem[14]++;
				pause(200);
				pan.repaint();
			}
			pan.magikp2 = true;

			int cible2 = (int) (Math.random() * 3);

			switch (cible2) {
			case 0:
				movePavel(2);
				pan2.TEXTE = "";
				ecrire("Dark Pavel utilise \n sword -30 DEGATS!sur Pavel");
				pan.PV.set(0, pan.PV.get(0) - 30);
				break;
			case 1:
				moveCyntia(3);
				pan2.TEXTE = "";
				ecrire("Dark Pavel attaque ! \n -30 DEGATS sur Cynthia!");
				pan.PV.set(1, pan.PV.get(1) - 30);
				break;

			case 2:
				moveWitch(2);
				pan2.TEXTE = "";
				ecrire("dark pavel utilise ! \n SWORD -40 DEGATS!sur Sophia");
				pan.PV.set(2, pan.PV.get(2) - 40);
				break;
			}
			pan.avancem[14] = 1;
			pan.repaint();
		}
	}

	public void movePoulette() {
		int cible = (int) (Math.random() * 2);
		if (cible == 0) {
			ecrire("Poulette lance Pic Pic \n -10 DEGATS a tous!");
			pan.avancem[16] = 3;
			pan.repaint();
			for (int i = 0; i < 8; i++) {
				pan.tx[0] += 20;
				pan.repaint();
				pause(200);
			}
			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.PV.set(0, pan.PV.get(0) - 10);
			pan.PV.set(1, pan.PV.get(1) - 10);
			pan.PV.set(2, pan.PV.get(2) - 10);
			pan.tx[0] = 120;
			pan.avancem[16] = 1;
			pan.repaint();
		} else if (cible == 1) {
			pan.avancem[16] = 2;
			ecrire("Poulette lance neige!");
			pan.repaint();
			pan.magikw = true;
			pan.repaint();
			pan.avancem[16] = 4;
			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			ecrire("+ 10 PV chacun !!!\n Poulette eternue!");
			pan.PV.set(0, pan.PV.get(0) + 10);
			pan.PV.set(1, pan.PV.get(1) + 10);
			pan.PV.set(2, pan.PV.get(2) + 10);

			pan.repaint();

		}
	}

	public void moveErza() {
		int cible = (int) (Math.random() * 6);
		pan.orientationz = 0;
		pan.avancez = 0;
		for (int i = 0; i < 4; i++) {
			pan.avancez++;
			pan.tx[0] += 40;
			pause(200);
			pan.repaint();
		}
		if (cible == 0) {
			pan.orientationz = 1;
			pan.avancez = 0;
			for (int i = 0; i < 4; i++) {
				pan.avancez++;
				pause(200);
				pan.repaint();
			}
			pan.orientationz = 0;
			pan.avancez = 1;
			pan.tx[0] = 120;

			ecrire("Erza lance sword \n -20 -20 -20");
			pan.PV.set(0, pan.PV.get(0) - 20);
			pan.PV.set(1, pan.PV.get(1) - 20);
			pan.PV.set(2, pan.PV.get(2) - 20);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.repaint();
		} else if (cible == 1) {
			pan.orientationz = 2;
			pan.avancez = 0;
			for (int i = 0; i < 6; i++) {
				pan.avancez++;
				pause(200);
				pan.repaint();
			}
			pan.orientationz = 0;
			pan.avancez = 1;
			pan.tx[0] = 120;

			ecrire("Erza attaque \n -10 -10 -10");
			pan.PV.set(0, pan.PV.get(0) - 10);
			pan.PV.set(1, pan.PV.get(1) - 10);
			pan.PV.set(2, pan.PV.get(2) - 10);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.repaint();
		} else if (cible == 2) {
			pan.orientationz = 3;
			pan.avancez = 0;
			for (int i = 0; i < 6; i++) {
				pan.avancez++;
				pause(200);
				pan.repaint();
			}
			pan.orientationz = 0;
			pan.avancez = 1;
			pan.tx[0] = 120;

			ecrire("Erza se change ! \n -20 -30 -40");
			pan.PV.set(0, pan.PV.get(0) - 20);
			pan.PV.set(1, pan.PV.get(1) - 20);
			pan.PV.set(2, pan.PV.get(2) - 20);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.repaint();
		} else if (cible == 3) {
			pan.orientationz = 4;
			pan.avancez = 0;
			for (int i = 0; i < 5; i++) {
				pan.avancez++;
				pause(200);
				pan.repaint();
			}
			pan.orientationz = 0;
			pan.avancez = 1;
			pan.tx[0] = 120;

			ecrire("Erza lance sword \n -30 -20 -20");
			pan.PV.set(0, pan.PV.get(0) - 30);
			pan.PV.set(1, pan.PV.get(1) - 20);
			pan.PV.set(2, pan.PV.get(2) - 20);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.repaint();
		} else if (cible == 4) {
			pan.orientationz = 5;
			pan.avancez = 0;
			for (int i = 0; i < 6; i++) {
				pan.avancez++;
				pause(200);
				pan.repaint();
			}
			pan.orientationz = 0;
			pan.avancez = 1;
			pan.tx[0] = 120;

			ecrire("Erza lance sword \n -30 -20 -20");
			pan.PV.set(0, pan.PV.get(0) - 30);
			pan.PV.set(1, pan.PV.get(1) - 20);
			pan.PV.set(2, pan.PV.get(2) - 20);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.repaint();
		} else if (cible == 5) {
			pan.orientationz = 6;
			pan.avancez = 0;
			for (int i = 0; i < 8; i++) {
				pan.avancez++;
				pause(200);
				pan.repaint();
			}
			pan.orientationz = 0;
			pan.avancez = 1;
			pan.tx[0] = 120;

			ecrire("Erza lance sword \n -40 -30 -30");
			pan.PV.set(0, pan.PV.get(0) - 40);
			pan.PV.set(1, pan.PV.get(1) - 30);
			pan.PV.set(2, pan.PV.get(2) - 30);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.repaint();
		}

	}

	public void movegol(int tab, int a) {
		// Run
		for (int i = 0; i < 10; i++) {
			if (a == 0) {
				pan.tx[1] += 20;
			} else if (a == 1) {
				pan.tx[0] += 20;
			}
			pan.repaint();
			pause(90);
		}
		pan.avancem[tab] = 2;
		pan.repaint();
		pause(150);
		pan.avancem[tab] = 3;
		pan.repaint();
		pause(150);

		int cible2 = (int) (Math.random() * 3);

		switch (cible2) {
		case 0:
			movePavel(2);
			pan2.TEXTE = "";
			ecrire(" -30 DEGATS!sur Pavel");
			pan.PV.set(0, pan.PV.get(0) - 30);
			break;
		case 1:
			moveCyntia(3);
			pan2.TEXTE = "";
			ecrire("-30 DEGATS sur Cynthia!");
			pan.PV.set(1, pan.PV.get(1) - 30);
			break;

		case 2:
			moveWitch(2);
			pan2.TEXTE = "";
			ecrire(" -40 DEGATS!sur Sophia");
			pan.PV.set(2, pan.PV.get(2) - 40);
			break;
		}

		pan.tx[0] = 120;

		pan.tx[1] = 50;

		pan.avancem[tab] = 1;
		pan.repaint();
	}

	public void mewto() {
		int cible = (int) (Math.random() * 2);
		if (cible == 0) {
			ecrire("Mewto utilise \n psy");
			pan.speciaux[6] = true;
			for (int i = 0; i < 132; i++) {
				pan.speciau[6]++;
				pan.repaint();
				pause(70);
			}
			ecrire("-40 DEGATS SUR TOUS");
			pan.PV.set(0, pan.PV.get(0) - 40);
			pan.PV.set(1, pan.PV.get(1) - 40);
			pan.PV.set(2, pan.PV.get(2) - 40);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.speciau[6] = 1;
			pan.speciaux[6] = false;
		} else if (cible == 1) {
			ecrire("Mewto utilise \n psy");
			pan.speciaux[7] = true;
			for (int i = 0; i < 264; i++) {
				pan.speciau[7]++;
				pan.repaint();
				pause(80);
			}
			ecrire("-60 DEGATS SUR TOUS");
			pan.PV.set(0, pan.PV.get(0) - 60);
			pan.PV.set(1, pan.PV.get(1) - 60);
			pan.PV.set(2, pan.PV.get(2) - 60);

			movePavel(2);
			moveCyntia(3);
			moveWitch(2);
			pan.speciau[7] = 1;
			pan.speciaux[7] = false;
		}
	}

	public void movefinale(int tab) {
		int damage = 0;
		int damage2 = 0;
		int cible = (int) (Math.random() * 2);

		if (cible == 0) {
			// coup d'epe classic pour les 3 persos
			pan.avancem[tab] = 2;
			if (tab == 23)
				damage = 20;
			if (tab == 25)
				damage = 30;
			if (tab == 24)
				damage = 25;
			for (int i = 0; i < 10; i++) {

				if (tab == 23)
					pan.tx[0] += 20;
				if (tab == 25)
					pan.tx[3] += 20;
				if (tab == 24)
					pan.tx[1] += 20;
				pan.repaint();
				pause(50);
			}
			pan.avancem[tab] = 3;
			pan.repaint();
			pause(100);
			for (int i = 0; i < 10; i++) {
				if (tab == 23)
					pan.tx[0] -= 20;
				if (tab == 25)
					pan.tx[3] -= 20;
				if (tab == 24)
					pan.tx[1] -= 20;
				pan.repaint();
				pause(30);
			}
			pan.avancem[tab] = 1;
			// damage
			int cible2 = (int) (Math.random() * 3);

			switch (cible2) {
			case 0:
				movePavel(2);
				pan2.TEXTE = "";
				ecrire(" DEGATS!sur Pavel");
				pan.PV.set(0, pan.PV.get(0) - damage);
				break;
			case 1:
				moveCyntia(3);
				pan2.TEXTE = "";
				ecrire(" DEGATS sur Cynthia!");
				pan.PV.set(1, pan.PV.get(1) - damage);
				break;

			case 2:
				moveWitch(2);
				pan2.TEXTE = "";
				ecrire(" DEGATS!sur Sophia");
				pan.PV.set(2, pan.PV.get(2) - damage);
				break;
			}

			pan.repaint();
		} else if (cible == 1) {
			// felix
			if (tab == 25) {
				// Magie
				pan.avancem[tab] = 4;
				pan.PAVEL = true;
				for (int i = 1; i <= 144; i++) {
					pan.avancem[26]++;
					pan.repaint();
					pause(70);
				}
				ecrire("-50 POUR TOUS \n LE MONDE");
				pan.PV.set(0, pan.PV.get(0) - 50);
				pan.PV.set(1, pan.PV.get(1) - 50);
				pan.PV.set(2, pan.PV.get(2) - 50);

				movePavel(2);
				moveCyntia(3);
				moveWitch(2);
				pan.avancem[26] = 1;
				pan.avancem[tab] = 1;
				pan.PAVEL = false;
			}
			if (tab == 24) {
				// DEMON BLEU magie
				pan.avancem[tab] = 4;
				pan.VLAD = true;
				for (int i = 1; i <= 363; i++) {
					pan.avancem[27]++;
					pan.repaint();
					pause(70);
				}
				ecrire("-40 POUR TOUS \n LE MONDE");
				pan.PV.set(0, pan.PV.get(0) - 40);
				pan.PV.set(1, pan.PV.get(1) - 40);
				pan.PV.set(2, pan.PV.get(2) - 40);

				movePavel(2);
				moveCyntia(3);
				moveWitch(2);
				pan.avancem[27] = 1;
				pan.VLAD = false;
				pan.avancem[tab] = 1;
			}
			if (tab == 23) {
				// VLAD ACTION MOVE
				pan.avancem[tab] = 4;
				pan.DEMON = true;
				for (int i = 1; i <= 9; i++) {
					pan.incre++;
					pan.repaint();
					pause(100);
				}
				ecrire("-30 POUR TOUS \n LE MONDE");
				pan.PV.set(0, pan.PV.get(0) - 40);
				pan.PV.set(1, pan.PV.get(1) - 40);
				pan.PV.set(2, pan.PV.get(2) - 40);

				movePavel(2);
				moveCyntia(3);
				moveWitch(2);
				pan.incre = 1;
				pan.DEMON = false;
				pan.avancem[tab] = 1;

			}

		}

	}

	ArrayList<Integer> select = new ArrayList<Integer>();

	public static void main(String[] args) {
		new Marlena();
	}
}
