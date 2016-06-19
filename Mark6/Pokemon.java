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
import javax.swing.JTextField;

public class Pokemon extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Pokemon2 pan = new Pokemon2();
	private JPanel container = new JPanel();
	private JTextField jtf;

	JAnimatedIcon[] ai = new JAnimatedIcon[20];
	JAnimatedIcon[] ai2 = new JAnimatedIcon[20];

	int mon = 0;
	Thread attack2;

	// pokemon de ash
	JAnimatedIcon me;
	JAnimatedIcon me2;
	int ennemi = 0;
	Thread thread1, thread2;
	boolean tour = true;
	String en = "";

	public Pokemon() {
		this.setTitle("PocketMonster");
		this.setSize(500, 538);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		this.setResizable(false);

		container.setLayout(new BorderLayout());
		container.add(pan, BorderLayout.CENTER);

		// setIconImage(new
		// ImageIcon(this.getClass().getResource("images/BlackKnight.png")).getImage());
		jtf = new JTextField();

		JPanel south = new JPanel();
		south.add(jtf);

		jtf.setPreferredSize(new Dimension(0, 0));
		jtf.addKeyListener(new ClavierListener());
		container.add(south, BorderLayout.SOUTH);

		this.setContentPane(container);

		this.setVisible(true);

		// PV préalable hoho mewtwo lugia (th)
		pan.PV.add(300);
		pan.PV.add(290);
		pan.PV.add(290);

		// combat();
		// music("image/lav.mid");
		pan.affiche = 4;
		pause(6000);
		pan.affiche = 3;
		pan.repaint();
	}

	int select = 0;

	public void combat(int num) {
		// if (Math.random() >= 0.5)
		// music("image/wild.mid");
		// else
		music("image/pok.mid");
		pan.affiche = 0;
		pan.repaint();
		tour = true;
		int rand = (int) (Math.random() * 8);
		poke(num);

		pan.ecrire = true;
		ecrire("Un pokemon sauvage apparait");
		pan.ecrire = false;
		pan.ash = -1;
		for (int i = 0; i < 3; i++) {
			pan.ash2 -= 40;
			pan.ash++;
			pan.repaint();
			pause(200);
		}
		// pause(200);
		pan.ash2 -= 80;
		change(0);
		pan.repaint();
	}

	public void change(int o) {

		if (o == 0 && pan.PV.get(0) > 0) {
			if (me2 != null)
				pan.remove(me2);
			select = 0;
			pan.mypok = "ho-oh.gif";
			pan.perso(0);
			me = new JAnimatedIcon("image/pokemon/" + pan.mypok, 30);
			me2 = new JAnimatedIcon(me, 200, 200);
			pan.add(me2);
			me2.setLocation(50, 180);
		} else if (o == 1 && pan.PV.get(2) > 0) {
			if (me2 != null)
				pan.remove(me2);
			select = 2;
			pan.mypok = "lugia.gif";
			pan.perso(1);
			me = new JAnimatedIcon("image/pokemon/" + pan.mypok, 30);
			me2 = new JAnimatedIcon(me, 200, 200);
			pan.add(me2);
			me2.setLocation(50, 180);
		} else if (o == 2 && pan.PV.get(1) > 0) {
			if (me2 != null)
				pan.remove(me2);
			select = 1;
			pan.mypok = "mewtwo.gif";
			pan.perso(2);
			me = new JAnimatedIcon("image/pokemon/" + pan.mypok, 30);
			me2 = new JAnimatedIcon(me, 200, 200);
			pan.add(me2);
			me2.setLocation(10, 180);
		}
		pan.repaint();
	}

	public void poke(int mo) {
		// choisi aleatoirement un ennemi
		this.mon = mo;
		pan.PV2 = new ArrayList<Integer>();
		if (mon == 0) {
			ai[0] = new JAnimatedIcon("image/pokemon/latios.gif", 30);
			ai2[0] = new JAnimatedIcon(ai[0], 150, 150);
			pan.add(ai2[0]);
			ai2[0].setLocation(317, 64);
			pan.PV2.add(340);
			en = "no";
		}
		if (mon == 1) {
			ai[1] = new JAnimatedIcon("image/pokemon/groudon.gif", 30);
			ai2[1] = new JAnimatedIcon(ai[1], 150, 150);
			pan.add(ai2[1]);
			ai2[1].setLocation(317, 64);
			pan.PV2.add(380);
			en = "fire";
		}
		if (mon == 2) {
			ai[mon] = new JAnimatedIcon("image/pokemon/rayquaza.gif", 30);
			ai2[mon] = new JAnimatedIcon(ai[mon], 150, 150);
			pan.add(ai2[mon]);
			ai2[mon].setLocation(317, 64);
			pan.PV2.add(420);
			en = "elec";
		}
		if (mon == 3) {
			ai[mon] = new JAnimatedIcon("image/pokemon/blastoise-mega.gif", 30);
			ai2[mon] = new JAnimatedIcon(ai[mon], 150, 150);
			pan.add(ai2[mon]);
			ai2[mon].setLocation(317, 64);
			pan.PV2.add(460);
			en = "water";
		}
		if (mon == 4) {
			ai[mon] = new JAnimatedIcon("image/pokemon/charizard-megax.gif", 30);
			ai2[mon] = new JAnimatedIcon(ai[mon], 150, 150);
			pan.add(ai2[mon]);
			ai2[mon].setLocation(317, 64);
			pan.PV2.add(450);
			en = "fire";
		}
		if (mon == 5) {
			ai[mon] = new JAnimatedIcon("image/pokemon/espeon.gif", 30);
			ai2[mon] = new JAnimatedIcon(ai[mon], 120, 120);
			pan.add(ai2[mon]);
			ai2[mon].setLocation(317, 64);
			pan.PV2.add(320);
			en = "no";
		}
		if (mon == 6) {
			ai[mon] = new JAnimatedIcon("image/pokemon/pikachu-2.gif", 30);
			ai2[mon] = new JAnimatedIcon(ai[mon], 150, 150);
			pan.add(ai2[mon]);
			ai2[mon].setLocation(317, 64);
			pan.PV2.add(220);
			en = "elec";
		}
		if (mon == 7) {
			// flor
			ai[mon] = new JAnimatedIcon("image/pokemon/venusaur-female.gif", 30);
			ai2[mon] = new JAnimatedIcon(ai[mon], 150, 150);
			pan.add(ai2[mon]);
			ai2[mon].setLocation(317, 64);
			pan.PV2.add(420);
			en = "flo";
		}
		/*if (mon == 8) {
			// flor
			ai[mon] = new JAnimatedIcon("image/pokemon/empoleon.gif", 30);
			ai2[mon] = new JAnimatedIcon(ai[mon], 150, 150);
			pan.add(ai2[mon]);
			ai2[mon].setLocation(317, 64);
			pan.PV2.add(500);
			en = "water";
		}*/
	}

	public void erase() {
		// Pokemon is KO
		for (int i = 0; i < ai2.length; i++) {
			if (ai2[i] != null) {
				pan.remove(ai2[i]);
			}
		}
	}

	public void musicoff() {
		if (sequencer != null)
			sequencer.stop();
	}

	Sequencer sequencer;
	Thread song;

	class Song implements Runnable {
		String s = "";

		public Song(String s) {
			this.s = s;
		}

		public void run() {
			try {
				Sequence sequence = MidiSystem.getSequence(new File(s));
				sequencer = MidiSystem.getSequencer();
				sequencer.open();
				sequencer.setSequence(sequence);
				sequencer.setLoopCount(100);
				sequencer.start();

			} catch (Exception e) { 
				System.out.println(e.getMessage());
			}
		}
	}

	public void music(String s) {
		//song = new Thread(new Song(s));
	//	song.start();

	}

	public void pause(int a) {
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	Thread useless;

	class U implements Runnable {
		int o;

		public U(int o) {
			this.o = o;
		}

		public void run() {
			if (o == 0) {
				pan.affiche = 1;
				pan.repaint();
				mouvement = false;
				ecrire("Bienvenu dans le musee hante RED");
				ecrire("on dit que les pokemons empaille(statut)\nsont ceux de RED");
				ecrire("maitre de la ligue.Il y a aussi \ndes pokemons legendaires morts.");
				ecrire("la legende dit que leurs ames \n sont toujours presents dans ces statuts");
				ecrire("en particulier pour le pikachu mort de\n RED ,ce ne sont que des");
				ecrire("legendes ,mais je vous ai prevenu!\nBonne Visite dans ce Musee!");
				ecrire("Appuyer sur  l , m, ou o pour \n changer de pokemon");
				ecrire("ho-oh , Lugia et Mewtwo sont vos \npokemons");
				ecrire("Bouton p = Donne une potions a tous vos \n pokemons");
				ecrire("bouton r = texte rapide \n bouton s = texte lent");
				mouvement = true;
			} else if (o == 1) {
				ecrire("Ash utilise potion sur tous ses pokemons!\n+180 PVS a tous!");
				for (int i = 0; i < pan.PV.size(); i++) {
					pan.PV.set(i, pan.PV.get(i) + 180);
				}
				pan.potion--;
				pan.repaint();
			} else if (o == 2) {
				mouvement = false;
				ecrire("Vous avez PURIFIE tous les \npokemons de RED !");
				ecrire("felicitation Ash !Et Merci !");
				ecrire("Ce jeu t'as plus ?");
				pause(5000);
				ecrire("Tu vas adorer GOLDENSUN chapitre I\nENLEVEMENT");
				mouvement = true;
			}
		}
	}

	class ClavierListener implements KeyListener {
		int posx = 0;
		int posy = 0;

		@Override
		public void keyPressed(KeyEvent arg0) {
			// TODO Auto-generated method stub

			if (arg0.getKeyChar() == 'p') {
				if (pan.potion > 0) {
					useless = new Thread(new U(1));
					useless.start();
				}
			}
			if (arg0.getKeyChar() == 'r') {
				boutonA = 60;
			}
			if (arg0.getKeyChar() == 's') {
				boutonA = 150;
			}
			if (pan.affiche == 3) {
				if (arg0.getKeyCode() == 65) {
					useless = new Thread(new U(0));
					useless.start();
				}
			}
			if (pan.affiche == 0) {
				if (tour) {
					// BASIC CHANGE MODE
					if (arg0.getKeyChar() == 'o') {
						change(0);
					}
					if (arg0.getKeyChar() == 'l') {
						change(1);
					}
					if (arg0.getKeyChar() == 'm') {
						change(2);
					}

					if (arg0.getKeyCode() == 37) {
						if (posx - 1 >= 0) {
							pan.bool[posy][posx] = false;
							posx -= 1;
							pan.bool[posy][posx] = true;
							pan.repaint();
						}
					}
					if (arg0.getKeyCode() == 38) {
						if (posy - 1 >= 0) {
							pan.bool[posy][posx] = false;
							posy -= 1;
							pan.bool[posy][posx] = true;
							pan.repaint();
						}
					}
					if (arg0.getKeyCode() == 39) {
						if (posx + 1 <= pan.boutons.length - 1) {
							pan.bool[posy][posx] = false;
							posx += 1;
							pan.bool[posy][posx] = true;
							pan.repaint();
						}
					}
					if (arg0.getKeyCode() == 40) {

						if (posy + 1 <= pan.boutons[0].length - 1) {
							pan.bool[posy][posx] = false;
							posy += 1;
							pan.bool[posy][posx] = true;
						}

						pan.repaint();
					}
					if (arg0.getKeyCode() == 10) {

						thread1 = new Thread(new Dep1());
						thread1.start();
						tour = false;
					}
				}
			} else if (pan.affiche == 1) {

				if (mouvement) {
					if (pan.level == 8 && pan.y1 > 340) {
						attack2 = new Thread(new Pause(5));
						attack2.start();
					}
					if (pan.level == 88 && pan.y1 <= 15) {
						attack2 = new Thread(new Pause(6));
						attack2.start();
					}
					if (pan.level == 9 && pan.between(pan.x1, 200, 300)
							&& pan.between(pan.y1, 200, 280) && pan.yami[0]) {
						// TORTANK
						attack2 = new Thread(new Pause(13));
						attack2.start();

					}
					if (pan.level == 10 && pan.between(pan.x1, 200, 300)
							&& pan.between(pan.y1, 200, 280) && pan.yami[1]) {
						// TORTANK
						attack2 = new Thread(new Pause(14));
						attack2.start();
					}
					if (pan.level == 11 && pan.between(pan.x1, 200, 300)
							&& pan.between(pan.y1, 200, 280) && pan.yami[2]) {
						// TORTANK
						attack2 = new Thread(new Pause(17));
						attack2.start();
					}
					if (pan.level == 1000 && pan.between(pan.x1, 200, 300)
							&& pan.between(pan.y1, 200, 280) && pan.yami[3]) {
						// TORTANK
						attack2 = new Thread(new Pause(11));
						attack2.start();
					}
					if (pan.level == 1001 && pan.between(pan.x1, 200, 260)
							&& pan.between(pan.y1, 200, 250) && pan.yami[4]) {
						// TORTANK
						attack2 = new Thread(new Pause(15));
						attack2.start();
					}
				/*	if (pan.level == 7 && pan.between(pan.x1, 390, 430)
							&& pan.between(pan.y1, 200, 250) && pan.yami[8]) {
						attack2 = new Thread(new Pause(18));
						attack2.start();
					}*/
					if (pan.level == 1002 && pan.between(pan.x1, 200, 260)
							&& pan.between(pan.y1, 200, 250) && pan.yami[5]) {
						// TORTANK
						attack2 = new Thread(new Pause(16));
						attack2.start();
					}
					if (pan.level == 1003 && pan.between(pan.x1, 200, 300)
							&& pan.between(pan.y1, 200, 280) && pan.yami[6]) {
						// TORTANK
						attack2 = new Thread(new Pause(12));
						attack2.start();
					}
					if (pan.level == 111 && pan.between(pan.x1, 200, 300)
							&& pan.between(pan.y1, 200, 280) && pan.yami[7]) {
						// TORTANK
						attack2 = new Thread(new Pause(10));
						attack2.start();
					}

					if (arg0.getKeyCode() == 37) {
						pan.orientation = 1;
						pan.avance++;
						if (pan.avance == 4)
							pan.avance = 1;
						pan.x1 -= 20;
						ennemy();
						pan.repaint();
					}
					if (arg0.getKeyCode() == 38) {
						pan.orientation = 3;
						pan.avance++;
						if (pan.avance == 4)
							pan.avance = 1;
						pan.y1 -= 20;
						ennemy();
						pan.repaint();
					}
					if (arg0.getKeyCode() == 39) {
						pan.orientation = 0;
						pan.avance++;
						if (pan.avance == 4)
							pan.avance = 1;
						pan.x1 += 20;
						ennemy();
						pan.repaint();
					}
					if (arg0.getKeyCode() == 40) {
						pan.orientation = 2;
						pan.avance++;
						if (pan.avance == 4)
							pan.avance = 1;
						pan.y1 += 20;
						ennemy();
						pan.repaint();
					}
				}
			}
		}

		@Override
		public void keyReleased(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}

		@Override
		public void keyTyped(KeyEvent arg0) {
			// TODO Auto-generated method stub

		}
	}

	boolean mouvement = true;

	class Dep1 implements Runnable {
		public void run() {
			if (pan.bool[0][0]) {
				if (pan.mypok.equals("ho-oh.gif")) {
					// Attaque de HOHO
					pan.speciaux[0] = true;
					for (int i = 0; i < 144; i++) {
						pan.speciau[0]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[0] = false;
					pan.speciau[0] = 1;
					if (en.equals("flo")) {

						ecrire("faiblesse!! ! -180 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 180);
					} else if (en.equals("fire")) {
						ecrire("-30pv ,resistance au feu !");
						pan.PV2.set(0, pan.PV2.get(0) - 30);
					} else {
						ecrire("-120 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 120);
					}
				}

				// lugia
				if (pan.mypok.equals("lugia.gif")) {
					// Attaque de HOHO
					pan.speciaux[3] = true;
					for (int i = 0; i < 133; i++) {
						pan.speciau[3]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[3] = false;
					pan.speciau[3] = 1;
					if (en.equals("flo")) {
						ecrire("resistance herbe ! -60 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 60);
					} else if (en.equals("fire")) {
						ecrire("Faiblesse ! -200 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 200);
					} else {
						ecrire("-140 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 140);
					}
				}
				// mewtwo
				if (pan.mypok.equals("mewtwo.gif")) {
					// Attaque de HOHO
					pan.speciaux[7] = true;
					for (int i = 0; i < 264; i++) {
						pan.speciau[7]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[7] = false;
					pan.speciau[7] = 1;
					if (en.equals("flo")) {

						ecrire(" herbe! -130 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 130);
					} else if (en.equals("fire")) {
						ecrire(" -120 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 120);
					} else {
						ecrire("-110 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 110);
					}
				}
			}
			if (pan.bool[0][1]) {
				if (pan.mypok.equals("ho-oh.gif")) {
					// Attaque de HOHO
					pan.speciaux[1] = true;
					for (int i = 0; i < 189; i++) {
						pan.speciau[1]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[1] = false;
					pan.speciau[1] = 1;
					if (en.equals("flo")) {
						ecrire("coup critique ! -190 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 190);
					} else if (en.equals("fire") || en.equals("water")) {
						ecrire("-50pv ,resistance au feu !");
						pan.PV2.set(0, pan.PV2.get(0) - 50);
					} else {
						ecrire("-160 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 160);
					}
				}
				// lugia
				if (pan.mypok.equals("lugia.gif")) {
					// Attaque de HOHO
					pan.speciaux[4] = true;
					for (int i = 0; i < 5; i++) {
						pan.speciau[4]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[4] = false;
					pan.speciau[4] = 1;
					if (en.equals("flo")) {

						ecrire("faiblesse herbe! -190 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 190);
					} else if (en.equals("fire")) {
						ecrire(" -90 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 90);
					} else {
						ecrire("-80 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 80);
					}
				}
				// mewtwo
				if (pan.mypok.equals("mewtwo.gif")) {
					// Attaque de HOHO
					pan.speciaux[8] = true;
					for (int i = 0; i < 132; i++) {
						pan.speciau[8]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[8] = false;
					pan.speciau[8] = 1;
					if (en.equals("flo")) {
						ecrire(" herbe! -190 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 190);
					} else if (en.equals("fire")) {
						ecrire(" -140 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 140);
					} else {
						ecrire("-130 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 130);
					}
				}
			}
			if (pan.bool[1][0]) {
				if (pan.mypok.equals("mewtwo.gif")) {
					// Attaque de HOHO
					pan.speciaux[4] = true;
					for (int i = 0; i < 5; i++) {
						pan.speciau[4]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[4] = false;
					pan.speciau[4] = 1;
					if (en.equals("flo")) {

						ecrire(" herbe! -90 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 90);
					} else if (en.equals("fire")) {
						ecrire(" -100 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 100);
					} else if (en.equals("water")) {
						ecrire(" faiblesse -190 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 190);
					} else {
						ecrire("-80 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 80);
					}
				}
				if (pan.mypok.equals("ho-oh.gif")) {
					// Attaque Lugia
					pan.speciaux[2] = true;
					for (int i = 0; i < 151; i++) {
						pan.speciau[2]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[2] = false;
					pan.speciau[2] = 1;
					if (en.equals("flo")) {
						ecrire("faiblesse ! -190 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 190);
					} else if (en.equals("fire")) {
						ecrire("-60pv ,resistance au feu !");
						pan.PV2.set(0, pan.PV2.get(0) - 60);
					} else {
						ecrire("-140 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 140);
					}
				}
				// lugia
				if (pan.mypok.equals("lugia.gif")) {
					// Attaque delugia
					pan.speciaux[5] = true;
					for (int i = 0; i < 828; i++) {
						pan.speciau[5]++;
						pause(10);
						pan.repaint();
					}
					pan.speciaux[5] = false;
					pan.speciau[5] = 1;
					if (en.equals("flo")) {

						ecrire("resistance herbe -170 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 170);
					} else if (en.equals("fire")) {
						ecrire(" faiblaisse ! -200 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 200);
					} else {
						ecrire("-190 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 190);
					}
				}
			}
			if (pan.bool[1][1]) {
				// oo
				if (pan.mypok.equals("ho-oh.gif")) {
					pan.pic = true;
					pan.repaint();
					pause(200);
					pan.pic = false;
					pan.repaint();
					if (en.equals("flo")) {
						ecrire(" herbe!faible -150 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 150);
					} else if (en.equals("fire")) {
						ecrire("-90 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 90);
					} else {
						ecrire("-90 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 90);
					}
				}

				// lugia
				if (pan.mypok.equals("lugia.gif")) {
					// Attaque delugia
					pan.speciaux[6] = true;
					for (int i = 0; i < 47; i++) {
						pan.speciau[6]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[6] = false;
					pan.speciau[6] = 1;
					if (en.equals("flo")) {

						ecrire("resistance herbe -70 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 70);
					} else if (en.equals("fire") || en.equals("elec")) {
						ecrire(" faiblaisse ! -140 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 140);
					} else {
						ecrire("-100 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 100);
					}
				}
				// mewtwo
				if (pan.mypok.equals("mewtwo.gif")) {
					// Attaque de HOHO
					pan.speciaux[9] = true;
					for (int i = 0; i < 132; i++) {
						pan.speciau[9]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[9] = false;
					pan.speciau[9] = 1;
					if (en.equals("flo")) {

						ecrire(" herbe! -90 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 90);
					} else if (en.equals("fire")) {
						ecrire("Faiblesse !  -150 pv");
						pan.PV2.set(0, pan.PV2.get(0) - 150);
					} else {
						ecrire("-90 degats !");
						pan.PV2.set(0, pan.PV2.get(0) - 90);
					}
				}
			}
			if (pan.PV2.get(0) <= 0) {
				erase();
				ecrire("Pokemon Sauvage Vaincu ! Legendaire ?");
				ecrire("Ash a vaincu !");
				pan.remove(me2);
				pan.affiche = 1;
				musicoff();
				music("image/lav.mid");
				pan.ash2 = 80;
				pan.ash = 0;
				win++;
				if (win == 8) {
					useless = new Thread(new U(2));
					useless.start();
				}
				pan.repaint();

			} else {
				// tour adverse
				thread2 = new Thread(new Dep());
				thread2.start();
			}
		}
	}

	int win = 0;

	class Dep implements Runnable {
		// attaque du pokemon adverse
		public void run() {
			int c = 0;
			if (mon == 8) {
				c = (int) (Math.random() * 4);
				if (c == 0) {
					ecrire("Lathios utilise boule d'eau");
					pan.speciaux[10] = true;
					for (int i = 0; i < 59; i++) {
						pan.speciau[10]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[10] = false;
					pan.speciau[10] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -50 pv");
						pan.PV.set(select, pan.PV.get(select) - 50);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -110 pv");
						pan.PV.set(select, pan.PV.get(select) - 110);
					} else {
						ecrire("-60 degats !");
						pan.PV.set(select, pan.PV.get(select) - 60);
					}
				} else if (c == 1) {
					ecrire("Lathios utilise bulle d'eau");
					pan.speciaux[11] = true;
					for (int i = 0; i < 59; i++) {
						pan.speciau[11]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[11] = false;
					pan.speciau[11] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -30 pv");
						pan.PV.set(select, pan.PV.get(select) - 30);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-60 degats !");
						pan.PV.set(select, pan.PV.get(select) - 60);
					}
				} else if (c == 2) {
					ecrire("Lathios utilise lame eguisee");
					pan.speciaux[12] = true;
					for (int i = 0; i < 30; i++) {
						pan.speciau[12]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[12] = false;
					pan.speciau[12] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -30 pv");
						pan.PV.set(select, pan.PV.get(select) - 30);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -120 pv");
						pan.PV.set(select, pan.PV.get(select) - 120);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				} else if (c == 3) {
					ecrire("Lathios utilise LuminEclat");
					pan.speciaux[13] = true;
					for (int i = 0; i < 244; i++) {
						pan.speciau[13]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[13] = false;
					pan.speciau[13] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -80 pv");
						pan.PV.set(select, pan.PV.get(select) - 80);
					} else {
						ecrire("-90 degats !");
						pan.PV.set(select, pan.PV.get(select) - 90);
					}
				}

			}
			if (mon == 0) {
				// latios
				c = (int) (Math.random() * 4);
				if (c == 0) {
					ecrire("Lathios utilise boule d'eau");
					pan.speciaux[10] = true;
					for (int i = 0; i < 59; i++) {
						pan.speciau[10]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[10] = false;
					pan.speciau[10] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -50 pv");
						pan.PV.set(select, pan.PV.get(select) - 50);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -110 pv");
						pan.PV.set(select, pan.PV.get(select) - 110);
					} else {
						ecrire("-60 degats !");
						pan.PV.set(select, pan.PV.get(select) - 60);
					}
				} else if (c == 1) {
					ecrire("Lathios utilise bulle d'eau");
					pan.speciaux[11] = true;
					for (int i = 0; i < 59; i++) {
						pan.speciau[11]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[11] = false;
					pan.speciau[11] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -30 pv");
						pan.PV.set(select, pan.PV.get(select) - 30);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-60 degats !");
						pan.PV.set(select, pan.PV.get(select) - 60);
					}
				} else if (c == 2) {
					ecrire("Lathios utilise lame eguisee");
					pan.speciaux[12] = true;
					for (int i = 0; i < 30; i++) {
						pan.speciau[12]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[12] = false;
					pan.speciau[12] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -30 pv");
						pan.PV.set(select, pan.PV.get(select) - 30);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -120 pv");
						pan.PV.set(select, pan.PV.get(select) - 120);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				} else if (c == 3) {
					ecrire("Lathios utilise LuminEclat");
					pan.speciaux[13] = true;
					for (int i = 0; i < 244; i++) {
						pan.speciau[13]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[13] = false;
					pan.speciau[13] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -80 pv");
						pan.PV.set(select, pan.PV.get(select) - 80);
					} else {
						ecrire("-90 degats !");
						pan.PV.set(select, pan.PV.get(select) - 90);
					}
				}
			} else if (mon == 1) {
				c = (int) (Math.random() * 3);
				// groudon
				if (c == 0) {
					ecrire("Groudon utilise Purgatoire");
					pan.speciaux[14] = true;
					for (int i = 0; i < 53; i++) {
						pan.speciau[14]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[14] = false;
					pan.speciau[14] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -100 pv");
						pan.PV.set(select, pan.PV.get(select) - 100);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-120 degats !");
						pan.PV.set(select, pan.PV.get(select) - 120);
					}
				} else if (c == 1) {
					ecrire("Groudon utilise Onde sonore");
					pan.speciaux[15] = true;
					for (int i = 0; i < 60; i++) {
						pan.speciau[15]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[15] = false;
					pan.speciau[15] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				} else if (c == 2) {
					ecrire("Groudon utilise lance flamme");
					pan.speciaux[0] = true;
					for (int i = 0; i < 144; i++) {
						pan.speciau[0]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[0] = false;
					pan.speciau[0] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				}
			} else if (mon == 2) {
				c = (int) (Math.random() * 3);

				if (c == 0) {
					ecrire("RayQuaza utilise Fatal Foudre");
					pan.speciaux[16] = true;
					pan.speciau[16] = 154;
					for (int i = 154; i < 363; i++) {
						pan.speciau[16]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[16] = false;
					pan.speciau[16] = 154;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -130 pv");
						pan.PV.set(select, pan.PV.get(select) - 130);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -140 pv");
						pan.PV.set(select, pan.PV.get(select) - 140);
					} else {
						ecrire("-120 degats !");
						pan.PV.set(select, pan.PV.get(select) - 120);
					}
				} else if (c == 1) {
					ecrire("Rayquaza utilise Onde sonore");
					pan.speciaux[15] = true;
					for (int i = 0; i < 60; i++) {
						pan.speciau[15]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[15] = false;
					pan.speciau[15] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				} else if (c == 2) {
					ecrire("Rayquaza utilise eclair rouge");
					pan.speciaux[4] = true;
					for (int i = 0; i < 5; i++) {
						pan.speciau[4]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[4] = false;
					pan.speciau[4] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				}
			} else if (mon == 3) {
				c = (int) (Math.random() * 4);
				if (c == 0) {
					ecrire("Mage Tortank utilise boule d'eau");
					pan.speciaux[10] = true;
					for (int i = 0; i < 59; i++) {
						pan.speciau[10]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[10] = false;
					pan.speciau[10] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -50 pv");
						pan.PV.set(select, pan.PV.get(select) - 50);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -110 pv");
						pan.PV.set(select, pan.PV.get(select) - 110);
					} else {
						ecrire("-60 degats !");
						pan.PV.set(select, pan.PV.get(select) - 60);
					}
				} else if (c == 1) {
					ecrire("Tortank Mega utilise bulle d'eau");
					pan.speciaux[11] = true;
					for (int i = 0; i < 59; i++) {
						pan.speciau[11]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[11] = false;
					pan.speciau[11] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -30 pv");
						pan.PV.set(select, pan.PV.get(select) - 30);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-60 degats !");
						pan.PV.set(select, pan.PV.get(select) - 60);
					}
				} else if (c == 2) {
					ecrire("Tortank utilise bulle d'eau");
					pan.speciaux[12] = true;
					for (int i = 0; i < 30; i++) {
						pan.speciau[12]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[12] = false;
					pan.speciau[12] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -100 pv");
						pan.PV.set(select, pan.PV.get(select) - 100);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -120 pv");
						pan.PV.set(select, pan.PV.get(select) - 120);
					} else {
						ecrire("-70 degats !");
						pan.PV.set(select, pan.PV.get(select) - 70);
					}
				} else if (c == 3) {
					pan.speciaux[6] = true;
					for (int i = 0; i < 47; i++) {
						pan.speciau[6]++;
						pause(40);
						pan.repaint();
					}
					pan.speciau[6] = 1;
					pan.speciaux[6] = false;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -100 pv");
						pan.PV.set(select, pan.PV.get(select) - 100);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("Faiblesse !  -120 pv");
						pan.PV.set(select, pan.PV.get(select) - 120);
					} else {
						ecrire("-70 degats !");
						pan.PV.set(select, pan.PV.get(select) - 70);
					}
				}
			} else if (mon == 4) {
				c = (int) (Math.random() * 3);
				if (c == 0) {
					ecrire("Mage Draco feu utilise Purgatoire");
					pan.speciaux[14] = true;
					for (int i = 0; i < 53; i++) {
						pan.speciau[14]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[14] = false;
					pan.speciau[14] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -100 pv");
						pan.PV.set(select, pan.PV.get(select) - 100);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-120 degats !");
						pan.PV.set(select, pan.PV.get(select) - 120);
					}
				} else if (c == 1) {
					ecrire("Charizard utilise lance flamme");
					pan.speciaux[0] = true;
					for (int i = 0; i < 144; i++) {
						pan.speciau[0]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[0] = false;
					pan.speciau[0] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				} else if (c == 2) {
					ecrire("Charizard utilise flamme supreme");
					pan.speciaux[1] = true;
					for (int i = 0; i < 189; i++) {
						pan.speciau[1]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[1] = false;
					pan.speciau[1] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -120 pv");
						pan.PV.set(select, pan.PV.get(select) - 120);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -60 pv");
						pan.PV.set(select, pan.PV.get(select) - 60);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				}
			} else if (mon == 5) {
				c = (int) (Math.random() * 2);
				// espeon
				if (c == 0) {
					ecrire("Mentali utilise shining star");
					pan.speciaux[9] = true;
					for (int i = 0; i < 92; i++) {
						pan.speciau[9]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[9] = false;
					pan.speciau[9] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -70 pv");
						pan.PV.set(select, pan.PV.get(select) - 70);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -60 pv");
						pan.PV.set(select, pan.PV.get(select) - 60);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				} else if (c == 1) {
					ecrire("Mentali utilise Psy");
					pan.speciaux[7] = true;
					for (int i = 0; i < 264; i++) {
						pan.speciau[7]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[7] = false;
					pan.speciau[7] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -60 pv");
						pan.PV.set(select, pan.PV.get(select) - 60);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				}
			} else if (mon == 6) {
				c = (int) (Math.random() * 3);
				// pika
				if (c == 0) {
					ecrire("Pikachu utilise Fatal Foudre");
					pan.speciaux[16] = true;
					pan.speciau[16] = 154;
					for (int i = 154; i < 363; i++) {
						pan.speciau[16]++;
						pause(70);
						pan.repaint();
					}
					pan.speciaux[16] = false;
					pan.speciau[16] = 154;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -130 pv");
						pan.PV.set(select, pan.PV.get(select) - 130);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -140 pv");
						pan.PV.set(select, pan.PV.get(select) - 140);
					} else {
						ecrire("-120 degats !");
						pan.PV.set(select, pan.PV.get(select) - 120);
					}
				} else if (c == 1) {
					ecrire("pikachu utilise eclair rouge");
					pan.speciaux[4] = true;
					for (int i = 0; i < 5; i++) {
						pan.speciau[4]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[4] = false;
					pan.speciau[4] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				} else if (c == 2) {
					ecrire("Pikachu utilise Onde sonore");
					pan.speciaux[15] = true;
					for (int i = 0; i < 60; i++) {
						pan.speciau[15]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[15] = false;
					pan.speciau[15] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				}
			} else if (mon == 7) {
				c = (int) (Math.random() * 2);
				// florizard
				if (c == 0) {
					ecrire("Florizard utilise Lance SOLEIL");
					pan.speciaux[1] = true;
					for (int i = 0; i < 189; i++) {
						pan.speciau[1]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[1] = false;
					pan.speciau[1] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -120 pv");
						pan.PV.set(select, pan.PV.get(select) - 120);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -60 pv");
						pan.PV.set(select, pan.PV.get(select) - 60);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				} else if (c == 1) {
					ecrire("Florizard utilise Onde sonore");
					pan.speciaux[15] = true;
					for (int i = 0; i < 60; i++) {
						pan.speciau[15]++;
						pause(40);
						pan.repaint();
					}
					pan.speciaux[15] = false;
					pan.speciau[15] = 1;
					if (pan.mypok.equals("mewtwo.gif")) {
						ecrire(" resistance -40 pv");
						pan.PV.set(select, pan.PV.get(select) - 40);
					} else if (pan.mypok.equals("ho-oh.gif")) {
						ecrire("resistance !  -90 pv");
						pan.PV.set(select, pan.PV.get(select) - 90);
					} else {
						ecrire("-80 degats !");
						pan.PV.set(select, pan.PV.get(select) - 80);
					}
				}
			}
			if (pan.PV.get(select) <= 0) {
				// plus de PV
				pan.remove(me2);
				for (int i = 0; i < pan.PV.size(); i++) {
					if (pan.PV.get(i) > 0) {
						if (i == 1)
							change(i + 1);
						if (i == 2)
							change(i - 1);
						else
							change(i);
					}
				}
				if (pan.PV.get(0) <= 0 && pan.PV.get(1) <= 0
						&& pan.PV.get(2) <= 0) {
					// on a perdu
					ecrire("Tous les pokemons de Ash sont KO \nFin de partie");
					ecrire("Merci d'avoir joue a ce jeu Pokemon ! \nBy Chen Patrick");
					System.exit(0);
					pause(3000);
				}

				/*
				 * if (select == 0) change(1); if (select == 1) change(2); if
				 * (select == 2) change(0);
				 */
				pan.repaint();
			}
			tour = true;
		}
	}

	int boutonA = 150;

	public void ecrire(String f) {
		pan.ecrire = true;
		// Texte a droite

		pan.TEXTE = "";
		String cont = "";
		pan.panneau = true;
		for (int i = 0; i < f.length(); i++) {
			cont += f.charAt(i);
			pan.TEXTE = cont;
			pan.repaint();

			pause(boutonA);
		}
		pan.ecrire = false;
		pan.repaint();
		pan.panneau = false;
	}

	public static void main(String[] args) {
		new Pokemon();
	}

	class Pause implements Runnable {
		int value;

		public Pause(int value) {
			this.value = value;
		}

		public void run() {
			if (value == 5) {
				pan.level = 88;
				mouvement = false;
				avance(4);
				mouvement = true;

			} else if (value == 6) {
				mouvement = false;
				avance(5);
				mouvement = true;
				pan.level = 8;
			} else if (value >= 10) {
				mouvement = false;
				for (int i = 0; i < 12; i++) {
					if (i % 2 == 0)
						pan.animX2 = true;
					else
						pan.animX2 = false;
					pause(100);
					pan.repaint();
				}
				musicoff();
				combat(value - 10);
				if (pan.level == 9) {
					ecrire("Tortank est desormais libre ! ");
					ecrire("Tortank etais un pokemon de RED\n il a megeevolue meme mort");
					pan.yami[0] = false;
				}

				if (pan.level == 10) {
					ecrire("Draco feu etais un pokemon\nde RED");
					pan.yami[1] = false;
				}

				if (pan.level == 11) {
					ecrire("3 eme force de RED \nforce de la nature ");
					pan.yami[2] = false;
				}
				if (pan.level == 1000) {
					ecrire("Legendaire capture par RED ");
					pan.yami[3] = false;
				}
				if (pan.level == 1001) {
					ecrire("Pokemon favorie de RED");
					pan.yami[4] = false;
				}
				if (pan.level == 1002) {
					ecrire("Premierpokemon de RED");
					pan.yami[5] = false;
				}
				if (pan.level == 1003) {
					ecrire("Legendaire avec une force \n enorme,puissant ");
					pan.yami[6] = false;
				}
				if (pan.level == 111) {
					ecrire("Celebre Lathios mort au combat...");
					pan.yami[7] = false;
				}
				if (pan.level == 7) {
					ecrire("Mais ce pokemon est vivant !?\n");
					pan.yami[8] = false;
				}
				mouvement = true;

			}
		}
	}

	public void avance(int o) {
		if (o == 4) {
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
		}

	}

	public void ennemy() {
		if (monstre) {
			if ((int) (1 + Math.random() * 70) == 6) {
				attack2 = new Thread(new Pause(0));
				attack2.start();
			}
		}
	}

	boolean monstre = false;
}
