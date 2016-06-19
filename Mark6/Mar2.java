import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Mar2 extends JPanel {
	/**
	 * 
	 */
	boolean animation = false;
	boolean start1 = false;// Ne qua afficher le logo du debut
	private static final long serialVersionUID = 1L;
	// boolean de pouvoir speiaux
	boolean[] speciaux = { false, false, false, false, false, false, false,
			false };
	int[] speciau = { 1, 1, 1, 1, 1, 1, 1, 1 };
	// boolean qui anime le debut
	boolean afficher = false;
	// NOmbre d'objets
	int Objet = 0;

	// Objets a afficher
	boolean[] bool = { true, true, true, true, true };
	boolean[] confirmer = { true, true, true, true, true };

	// Mewto
	int mewto = 99;

	// eruza coord
	int avancez = 1;
	int orientationz = -1;

	// paramtres du sabreur legendaire
	int avancel = 1;
	int orientationl = 0;
	int xl = -1000;
	int yl = -1000;

	// nombre de combat gagne!
	int combatG = 0;
	// nombre de potions
	int potion = 3;
	/**
	 * gestion dela map
	 */
	int map = 0;
	int map2 = 0;
	int size = 500;
	int size2 = 700;

	// coordonné du mechant principal DEMON BLEU
	int xd = 250;
	int yd = 30;
	// coordoné de la princesse Emilia(celle qui meurt)
	int ye = -110;

	// coordonne de ZORK
	int pox = -50;
	int poy = 210;
	// gestion des PV
	ArrayList<Integer> PV = new ArrayList<Integer>();
	// Gestion de PP Magie
	ArrayList<Integer> PP = new ArrayList<Integer>();
	// Nom des creatures
	ArrayList<String> NAME = new ArrayList<String>();

	// Liste contenant les PV des ennemies pour l'instant mettons ceci: on ne
	// vois pas ses pv dans l'ecran
	ArrayList<Integer> PV2 = new ArrayList<Integer>();

	int numerojoueur = 0;
	// coordonné de Pavel lorsque vue de haut
	int x1 = 300;
	int y1 = 380;

	// coordonne des joueurs
	int x = 300;
	int y = 380;
	int x2 = 340;
	int y2 = 380;
	int x3 = 380;
	int y3 = 380;
	int orientation = 0;
	int avance = 1;
	int orientation2 = 0;
	int avance2 = 1;
	int orientation3 = 0;
	int avance3 = 1;

	// ennemy pendant la MAP de combat
	int[] tx = { 120, 50, -1000, 20 };
	int[] ty = { 380, 360, -1000, 370 };// coordonnée de Vlad
	// avancem[0]

	// 0,1,3,4,5,6,7,9 ,10 ,11,12== mechants(golems faucheuse)
	// 2,8 == coordonnée de perso hors combat
	int[] avancem = { 1, 1,/* perso non combatant */1, 42, 42, 2, 42, 42, 1,
			42, 42, 43, 42, 42, 25, 25, 25, 11, 11, 12, 12, 13, 13, 33, 22, 11,
			1, 1 };// Gestion
	// des
	// animations
	// de
	// combat
	// des
	// ennemies
	// 26 = MAGIE DE FELIX
	int cursor = 140;

	// level = map : mode = rpg ou action
	int level = 0;
	boolean mode = false;

	boolean animX2 = false;

	boolean debutjeu = true;

	public void init() {

		map = 0;
		map2 = 0;
		size = 500;
		size2 = 700;
		repaint();
	}

	// Verifie si il y a un bloc
	public boolean between(int c, int a, int b) {
		return c <= b && c >= a;
	}

	// boolean en fin
	boolean findejeu = false;

	public void paint(Graphics g) {
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, 600, 600);

		if (!mode) {

			if (level == 0) {
				// level 0 donc dans la premiere scene de ce Theatre
				ImageIcon imageIcon = new ImageIcon(
						"image/Map/BattleMap-CrystalCastle.gif");

				Image w = imageIcon.getImage();
				g.drawImage(w, map, map2, size, size2, this);
				// Collisions et Zone de delimitage pendant le tournage
				if (x1 <= 20)
					x1 = 30;
				if (x1 >= 450)
					x1 = 420;
				if (y1 <= 180)
					y1 = 185;
				if (y1 >= 490) {
					y1 = 230;
					x1 = 210;
					level = 1;
					repaint();
				}
			}

			if (level == 1) {
				// Map 2 on sort de la place principale du chateau
				ImageIcon imageIcon = new ImageIcon("image/Map/map2.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, map, map2, size, size2, this);
				// Dimension de la Map (réaussage
				map = map2 = 0;
				size = 500;
				size2 = 600;
				// personnage
				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/sbas3.png");
				Image d = image.getImage();
				g.drawImage(d, 70, 60, this);

				// gestion des collisions
				if (x1 <= 80 && between(y1, 190, 230)) {
					x1 = 90;
				} else if (x1 >= 480 && between(y1, 190, 230)) {
					x1 = 470;
				} else if (between(y1, 190, 230) && between(x1, 80, 230)
						&& y1 >= 210) {
					y1 = 210;
				} else if (between(y1, 190, 230) && between(x1, 310, 470)
						&& y1 >= 210) {
					y1 = 210;
				} else if (between(y1, 190, 230) && between(x1, 90, 460)
						&& y1 <= 210) {
					y1 = 220;
				} else if (between(y1, 250, 330) && x1 <= 220) {
					x1 = 240;
				} else if (between(y1, 250, 330) && x1 >= 320) {
					x1 = 290;
				} else if (between(y1, 330, 390) && x1 <= 200) {
					x1 = 210;
				} else if (between(y1, 330, 390) && x1 >= 320) {
					x1 = 310;
				}
			}
			if (level == 2) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 600, 600);

				ImageIcon imageIcon = new ImageIcon("image/Map/map4.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, map, map2, size, size2, this);

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/pavel/princesse.png");
				Image d1 = image2.getImage();
				g.drawImage(d1, 100, ye, 30, 40, this);
			}
			if (level == -3) {
				ImageIcon imageIcon = new ImageIcon("image/Map/neige.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, this.getWidth(), this.getHeight(), this);
				if (between(x1, 30, 80) && between(y1, 230, 290)) {
					x1 = 90;
				} else if (between(x1, 260, 310) && between(y1, 230, 290)) {
					x1 = 250;
				} else if (between(x1, 260, 310) && between(y1, 330, 410)) {
					x1 = 250;
				}

				else if (/* x1 <= 80 */between(x1, 30, 80)
						&& between(y1, 330, 410)) {
					x1 = 90;
				}

				else if (/* y1 >= 410 */between(y1, 410, 450)
						&& between(x1, 80, 140)) {
					y1 = 400;
				} else if (/* y1 >= 410 */between(y1, 410, 450)
						&& between(x1, 200, 260)) {
					y1 = 400;
				}

				else if (/* y1 <= 230 */between(y1, 190, 230)
						&& between(x1, 80, 260)) {
					y1 = 240;
				} else if (between(x1, 390, 410) && y1 < 440) {
					x1 = 400;
				} else if (x1 <= 0) {
					x1 = 10;
				} else if (x1 >= 460) {
					x1 = 450;
				} else if (y1 <= 0) {
					y1 = 10;
				} else if (y1 >= 500) {
					y1 = 480;
				} else if (between(x1, 320, 420) && between(y1, 320, 400)) {
					y1 = 410;
				} else if (between(y1, 320, 400) && between(x1, 320, 400)) {
					x1 = 410;
				} else if (between(x1, 10, 70) && between(y1, 20, 120)) {
					y1 = 120;
				} else if (between(x1, 110, 230) && between(y1, 20, 120)) {
					y1 = 120;
				} else if (between(x1, 380, 420) && between(y1, 180, 280)) {
					x1 = 430;
				} else if (between(x1, 280, 300) && between(y1, 20, 120)) {
					y1 = 120;
				} else if (between(y1, 20, 120) && between(x1, 340, 400)) {
					x1 = 330;
				} else if (y1 <= 110 && between(x1, 70, 120)) {
					x1 = 380;
					y1 = 470;
					level = -4;
				} else if (y1 <= 110 && between(x1, 230, 280)) {
					level = -5;
					x1 = 270;
					y1 = 230;
				}

			}

			if (level == 3) {
				// Village perdu
				ImageIcon imageIcon = new ImageIcon("image/Map/map3.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, this.getWidth(), this.getHeight(), this);
				if (/* x1 <= 80 */between(x1, 30, 80) && between(y1, 230, 290)) {
					x1 = 90;
				} else if (/* x1 >= 260 */between(x1, 260, 310)
						&& between(y1, 230, 290)) {
					x1 = 250;
				} else if (/* x1 >= 260 */between(x1, 260, 310)
						&& between(y1, 330, 410)) {
					x1 = 250;
				}

				else if (/* x1 <= 80 */between(x1, 30, 80)
						&& between(y1, 330, 410)) {
					x1 = 90;
				}

				else if (/* y1 >= 410 */between(y1, 410, 450)
						&& between(x1, 80, 140)) {
					y1 = 400;
				} else if (/* y1 >= 410 */between(y1, 410, 450)
						&& between(x1, 200, 260)) {
					y1 = 400;
				}

				else if (/* y1 <= 230 */between(y1, 190, 230)
						&& between(x1, 80, 260)) {
					y1 = 240;
				} else if (between(x1, 390, 410) && y1 < 440) {
					x1 = 400;
				} else if (x1 <= 0) {
					x1 = 10;
				} else if (x1 >= 460) {
					x1 = 450;
				} else if (y1 <= 0) {
					y1 = 10;
				} else if (y1 >= 500) {
					y1 = 480;
				} else if (between(x1, 320, 420) && between(y1, 320, 400)) {
					y1 = 410;
				} else if (between(y1, 320, 400) && between(x1, 320, 400)) {
					x1 = 410;
				} else if (between(x1, 10, 70) && between(y1, 20, 120)) {
					y1 = 120;
				} else if (between(x1, 110, 230) && between(y1, 20, 120)) {
					y1 = 120;
				} else if (between(x1, 380, 420) && between(y1, 180, 280)) {
					x1 = 430;
				} else if (between(x1, 280, 300) && between(y1, 20, 120)) {
					y1 = 120;
				} else if (between(y1, 20, 120) && between(x1, 340, 400)) {
					x1 = 330;
				} else if (y1 <= 110 && between(x1, 70, 120)) {
					x1 = 380;
					y1 = 470;
					level = 4;
				} else if (y1 <= 110 && between(x1, 230, 280)) {
					level = 5;
					x1 = 270;
					y1 = 230;
				}

			}
			if (level == 33) {
				// Map temporaire identique a Map 3
				ImageIcon imageIcon = new ImageIcon("image/Map/map3.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, this.getWidth(), this.getHeight(), this);
				ImageIcon imageIco = new ImageIcon(
						"image/Personnage/pavel/dekens.png");
				Image ww = imageIco.getImage();
				g.drawImage(ww, 160, 310, this);
			}

			if (level == 4) {
				// maison 1
				g.setColor(Color.white);
				g.fillRect(0, 0, 600, 600);
				ImageIcon imageIcon = new ImageIcon("image/Map/map7.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);
				ImageIcon imageIco = new ImageIcon(
						"image/Personnage/mechant/sbas.png");
				Image ww = imageIco.getImage();
				g.drawImage(ww, 30, 190, this);

				if (between(x1, 365, 410) && y1 >= 480) {
					level = 3;
					x1 = 75;
					y1 = 120;
				} else if (between(x1, 250, 270) && between(y1, 310, 320)) {
					x1 = 220;
					y1 = 170;
				}

				else if (between(x1, 220, 240) && between(y1, 180, 210)) {
					x1 = 250;
					y1 = 360;
				} else if (y1 >= 490 && x1 <= 325) {
					y1 = 460;
				}

				else if (between(x1, 240, 430) && between(y1, 370, 430)
						&& x1 <= 290) {
					x1 = 295;
					System.out.println("whta ?");
				} else if (between(x1, 260, 430) && between(y1, 370, 430)
						&& x1 >= 410) {
					x1 = 410;
				} else if (x1 >= 425 && y1 >= 290 && between(x1, 330, 490)) {
					x1 = 410;
				} else if (y1 <= 290 && y1 >= 110 && x1 >= 490) {
					x1 = 480;
				} else if (y1 <= 60) {
					y1 = 70;
				} else if (y1 <= 290 && between(x1, 295, 330)) {
					x1 = 335;
				}

				else if (between(x1, -10, 190) && between(y1, 170, 270)
						&& x1 >= 170) {
					// l'autre chambre
					x1 = 160;
					System.out.println("1");
				}

				else if (between(x1, -10, 190) && between(y1, 160, 270)
						&& x1 <= 0) {
					// l'autre chambre
					System.out.println("2");
					x1 = 10;
				} else if (between(x1, -10, 190) && between(y1, 160, 280)
						&& y1 >= 260) {
					// l'autre chambre
					System.out.println("3");
					y1 = 250;
				} else if (between(x1, -10, 260) && between(y1, 140, 280)
						&& y1 <= 150) {
					// l'autre chambre
					System.out.println("4");
					y1 = 160;
				} else if (between(x1, 260, 300) && between(y1, 130, 170)
						&& x1 >= 270) {
					x1 = 255;
				} else if (between(x1, 190, 235) && between(y1, 320, 360)
						&& x1 <= 240) {
					System.out.println("5");
					x1 = 260;
				} else if (x1 >= 500) {
					level = 6;
					x1 = 20;
					y1 = 350;
				}

			}
			if (level == -4) {
				// maison 1
				g.setColor(Color.white);
				g.fillRect(0, 0, 600, 600);
				ImageIcon imageIcon = new ImageIcon("image/Map/map7.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);
				ImageIcon imageIco = new ImageIcon(
						"image/Personnage/mechant/sbas.png");
				Image ww = imageIco.getImage();
				g.drawImage(ww, 30, 190, this);

				if (between(x1, 365, 410) && y1 >= 480) {
					level = -3;
					x1 = 75;
					y1 = 120;
				} else if (between(x1, 250, 270) && between(y1, 310, 320)) {
					x1 = 220;
					y1 = 170;
				}

				else if (between(x1, 220, 240) && between(y1, 180, 210)) {
					x1 = 250;
					y1 = 360;
				} else if (y1 >= 490 && x1 <= 325) {
					y1 = 460;
				}

				else if (between(x1, 240, 430) && between(y1, 370, 430)
						&& x1 <= 290) {
					x1 = 295;
					System.out.println("whta ?");
				} else if (between(x1, 260, 430) && between(y1, 370, 430)
						&& x1 >= 410) {
					x1 = 410;
				} else if (x1 >= 425 && y1 >= 290 && between(x1, 330, 490)) {
					x1 = 410;
				} else if (y1 <= 290 && y1 >= 0 && x1 >= 490) {
					x1 = 480;
				} else if (y1 <= 60) {
					y1 = 70;
				} else if (y1 <= 290 && between(x1, 295, 330)) {
					x1 = 335;
				}

				else if (between(x1, -10, 190) && between(y1, 170, 270)
						&& x1 >= 170) {
					// l'autre chambre
					x1 = 160;
					System.out.println("1");
				}

				else if (between(x1, -10, 190) && between(y1, 160, 270)
						&& x1 <= 0) {
					// l'autre chambre
					System.out.println("2");
					x1 = 10;
				} else if (between(x1, -10, 190) && between(y1, 160, 280)
						&& y1 >= 260) {
					// l'autre chambre
					System.out.println("3");
					y1 = 250;
				} else if (between(x1, -10, 260) && between(y1, 140, 280)
						&& y1 <= 150) {
					// l'autre chambre
					System.out.println("4");
					y1 = 160;
				} else if (between(x1, 260, 300) && between(y1, 130, 170)
						&& x1 >= 270) {
					x1 = 255;
				} else if (between(x1, 190, 235) && between(y1, 320, 360)
						&& x1 <= 240) {
					System.out.println("5");
					x1 = 260;
				}

			}
			if (level == -5) {
				// Maison 2
				g.setColor(Color.black);
				g.fillRect(0, 0, 600, 600);
				// maison 2
				ImageIcon image = new ImageIcon("image/Map/map88.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 400, 300, this);
				ImageIcon imm = new ImageIcon(
						"image/Personnage/pavel/dekens.png");
				Image d2 = imm.getImage();
				g.drawImage(d2, 70, 30, this);

				ImageIcon poule = new ImageIcon(
						"image/Personnage/erza/ebas.png");
				Image dp = poule.getImage();
				g.drawImage(dp, 270, 130, this);

				// DELIMITATION
				if (x1 <= 175) {
					x1 = 180;
				} else if (y1 <= 100) {
					y1 = 110;
				} else if (x1 >= 355) {
					x1 = 345;
				} else if (between(x1, 175, 235) && y1 >= 260) {
					y1 = 240;
				} else if (between(x1, 315, 365) && y1 >= 260) {
					y1 = 240;
				} else if (y1 >= 300) {

					level = -3;
					x1 = 250;
					y1 = 140;

				}

			}

			if (level == 5) {
				// Maison 2
				g.setColor(Color.black);
				g.fillRect(0, 0, 600, 600);
				// maison 2
				ImageIcon image = new ImageIcon("image/Map/map88.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 400, 300, this);
				ImageIcon imm = new ImageIcon(
						"image/Personnage/pavel/dekens.png");
				Image d2 = imm.getImage();
				g.drawImage(d2, 70, 30, this);

				// DELIMITATION
				if (x1 <= 175) {
					x1 = 180;
				} else if (y1 <= 100) {
					y1 = 110;
				} else if (x1 >= 355) {
					x1 = 345;
				} else if (between(x1, 175, 235) && y1 >= 260) {
					y1 = 240;
				} else if (between(x1, 315, 365) && y1 >= 260) {
					y1 = 240;
				} else if (y1 >= 300) {
					level = 3;
					x1 = 250;
					y1 = 140;
				}

			}
			if (level == 6) {
				ImageIcon image = new ImageIcon("image/Map/map82.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);
				ImageIcon imageIco = new ImageIcon(
						"image/Personnage/pavel/dekens.png");
				Image ww = imageIco.getImage();
				g.drawImage(ww, 160, 310, this);
			}
			if (level == 7) {
				// Map central du chateau
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 500, 500);

				ImageIcon image = new ImageIcon("image/Map/cast.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);
				if (bool[3]) {
					ImageIcon im = new ImageIcon("image/Map/couronne.png");
					Image dd = im.getImage();
					g.drawImage(dd, 150, 170, this);
				}
				if (between(x1, 140, 170) && between(y1, 150, 180)
						&& confirmer[3]) {
					bool[3] = false;
					Objet++;
					confirmer[3] = false;
					repaint();
				}

				// on reviens au chateau
				if (between(x1, 40, 170) && y1 >= 280) {
					y1 = 270;
				}
				if (between(x1, 310, 430) && y1 >= 280) {
					y1 = 270;
				}
				if (between(x1, 40, 170) && y1 <= 170) {
					y1 = 180;
				}
				if (between(x1, 310, 430) && y1 <= 170) {
					y1 = 180;
				}

				if (between(y1, 50, 170) && x1 <= 195) {
					x1 = 195;
				} else if (between(y1, 290, 430) && x1 <= 195) {
					x1 = 195;
				}

				if (between(y1, 50, 170) && x1 >= 280) {
					x1 = 280;
				}
				if (between(y1, 290, 430) && x1 >= 280) {
					x1 = 280;
				}

				if (between(y1, 180, 215) && x1 >= 430) {
					x1 = 430;
				}
				if (between(y1, 180, 215) && x1 <= 50) {
					x1 = 50;
				}
				if (between(y1, 260, 320) && x1 <= 50) {
					x1 = 50;
				}
				if (between(y1, 260, 320) && x1 >= 430) {
					x1 = 430;
				}
				if (between(x1, 260, 330) && y1 >= 430) {
					y1 = 420;
				}
				if (between(x1, 170, 220) && y1 >= 430) {
					y1 = 420;
				}
				if (between(x1, 260, 330) && y1 <= 50) {
					y1 = 60;
				}
				if (between(x1, 170, 220) && y1 <= 50) {
					y1 = 60;
				}
				if (x1 >= 450) {
					System.out.println("a");
					level = 8;
					x1 = 60;
					map = 0;
					map2 = 100;
					size = 500;
					size2 = 900;
				}
				if (x1 <= 15) {
					System.out.println("a");
					level = 9;
					x1 = 420;

				}
				if (y1 <= 20) {
					System.out.println("a");
					level = 10;
					y1 = 405;
				}

				if (y1 >= 440) {
					System.out.println("a");
					level = 11;
					y1 = 70;
				}

			}
			if (level == 8) {
				// Map a gauche dansle chateau
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 500, 500);
				ImageIcon image = new ImageIcon("image/Map/castdroite.gif");
				Image d = image.getImage();
				map = 0;
				map2 = 100;
				size = 500;
				size2 = 900;
				g.drawImage(d, map, map2, size, size2, this);

				if (y1 <= 170) {
					y1 = 170;
				}
				if (y1 >= 285 && between(x1, 58, 170)) {
					y1 = 280;
				}
				if (y1 >= 285 && between(x1, 315, 464)) {
					y1 = 280;
				}

				if (between(y1, 290, 490) && x1 <= 200) {
					x1 = 200;
				}
				if (between(y1, 290, 490) && x1 >= 290) {
					x1 = 290;
				}
				if (between(y1, 250, 299) && x1 <= 56) {
					x1 = 65;
				}
				if (between(y1, 160, 208) && x1 <= 56) {
					x1 = 65;
				}

				if (between(y1, 250, 299) && x1 >= 450) {
					x1 = 450;
				}
				if (between(y1, 160, 208) && x1 >= 450) {
					x1 = 450;
				}
				if (x1 >= 460) {
					if (debutjeu)
						level = 7;
					else
						level = 1000;
					x1 = 70;
				}
				if (x1 <= 30) {
					level = 7;
					x1 = 420;
				}
			}
			if (level == 88) {
				// Map a gauche dansle chateau
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 500, 500);
				ImageIcon image = new ImageIcon("image/Map/castdroite.gif");
				Image d = image.getImage();
				g.drawImage(d, map, map2, size, size2, this);
				if (x1 <= 200) {
					x1 = 200;
				}
				if (x1 >= 314) {
					x1 = 314;
				}
				if (between(x1, 200, 235) && y1 >= 366) {
					y1 = 360;
				}
				if (between(x1, 280, 330) && y1 >= 366) {
					y1 = 360;
				}
				if (y1 >= 410) {
					level = 111;
					y1 = 70;
					map = 0;
					map2 = 0;
					size = 500;
					size2 = 1700;
				}
			}
			if (level == 111) {
				// Map suposéfinel
				ImageIcon image = new ImageIcon("image/Map/finalbout.png");
				Image d = image.getImage();
				g.drawImage(d, map, map2, size, size2, this);
			}

			if (level == 11) {
				ImageIcon image = new ImageIcon("image/Map/castbas.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);

				if (bool[0]) {
					ImageIcon im = new ImageIcon("image/Map/crane.png");
					Image dd = im.getImage();
					g.drawImage(dd, 150, 150, this);
				}
				if (between(x1, 140, 170) && between(y1, 140, 160)
						&& confirmer[0]) {
					bool[0] = false;
					Objet++;
					confirmer[0] = false;
					repaint();
				}

				if (y1 >= 410) {
					y1 = 400;
				}
				if (x1 <= 60) {
					x1 = 65;
				}
				if (x1 >= 440) {
					x1 = 430;
				}
				if (between(x1, 36, 216) && y1 <= 60) {
					y1 = 65;
				}
				if (between(x1, 270, 442) && y1 <= 60) {
					y1 = 65;
				}
				if (y1 <= 44) {
					level = 7;
					y1 = 400;
				}
			}

			if (level == 10) {
				ImageIcon image = new ImageIcon("image/Map/casthaut.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);

				if (bool[1]) {
					ImageIcon im = new ImageIcon("image/Map/cross.png");
					Image dd = im.getImage();
					g.drawImage(dd, 150, 150, this);
				}
				if (between(x1, 140, 170) && between(y1, 140, 160)
						&& confirmer[1]) {
					bool[1] = false;
					confirmer[1] = false;
					Objet++;
					repaint();
				}

				if (y1 <= 60) {
					y1 = 65;
				}
				if (x1 >= 440) {
					x1 = 430;
				}
				if (x1 <= 60) {
					x1 = 65;
				}
				if (between(x1, 36, 216) && y1 >= 440) {
					y1 = 445;
				}
				if (between(x1, 270, 442) && y1 >= 440) {
					y1 = 445;
				}
				if (y1 >= 470) {
					level = 7;
					y1 = 70;
				}
			}

			if (level == 9) {
				ImageIcon image = new ImageIcon("image/Map/castgauche.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);

				if (bool[2]) {
					ImageIcon im = new ImageIcon("image/Map/wings.png");
					Image dd = im.getImage();
					g.drawImage(dd, 150, 150, this);
				}
				if (between(x1, 140, 170) && between(y1, 140, 160)
						&& confirmer[2]) {
					bool[2] = false;
					Objet++;
					confirmer[2] = false;
					repaint();
				}

				if (y1 <= 90) {
					y1 = 95;
				}
				if (y1 >= 410) {
					y1 = 400;
				}
				if (x1 <= 85) {
					x1 = 90;
				}
				if (between(y1, 70, 210) && x1 >= 440) {
					x1 = 430;
				}
				if (between(y1, 280, 420) && x1 >= 440) {
					x1 = 430;
				}
				if (x1 >= 465) {
					level = 7;
					x1 = 70;
				}
			}

			if (level == 1000) {
				ImageIcon imageIcon = new ImageIcon("image/Map/final1.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);

				if (between(y1, 230, 260) && x1 <= 65) {// ERROR
					level = 8;
					x1 = 410;
				}

				if (between(y1, 160, 230) && x1 <= 70) {
					x1 = 70;
				}
				if (between(y1, 260, 300) && x1 <= 70) {
					x1 = 70;
				}
				/*
				 * if (y1 <= 160) { y1 = 170; } if (y1 >= 300) { y1 = 290; }
				 */
				if (between(y1, 160, 190) && x1 >= 245 && between(x1, 240, 280)) {
					x1 = 240;
				}
				if (between(y1, 260, 300) && x1 >= 245 && between(x1, 240, 280)) {
					x1 = 240;
				}
				if (between(y1, 140, 190) && x1 >= 445) {
					x1 = 440;
				}
				if (between(y1, 260, 380) && x1 >= 445) {
					x1 = 440;
				}

				if (between(x1, 70, 245) && y1 <= 160) {
					y1 = 170;
				}
				if (between(x1, 70, 245) && y1 >= 300) {
					y1 = 290;
				}
				if (between(x1, 250, 450) && y1 <= 130) {
					y1 = 140;
				}
				if (between(x1, 250, 450) && y1 >= 360) {
					y1 = 350;
				}
				if (x1 >= 480) {
					level = 1001;
					x1 = 90;
				}
			}
			if (level == 1001) {
				ImageIcon imageIcon = new ImageIcon("image/Map/final2.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);
				if (y1 <= 65) {
					y1 = 70;
				}
				if (y1 >= 420) {
					y1 = 415;
				}
				if (between(y1, 50, 215) && x1 <= 70) {
					x1 = 80;
				}
				if (between(y1, 270, 440) && x1 <= 70) {
					x1 = 80;
				}
				if (between(y1, 50, 215) && x1 >= 440) {
					x1 = 430;
				}
				if (between(y1, 270, 440) && x1 >= 440) {
					x1 = 430;
				}
				if (x1 <= 40) {
					level = 1000;
					x1 = 410;
				}
				if (x1 >= 470) {
					level = 1002;
					x1 = 70;
				}
			}

			if (level == 1002) {
				ImageIcon imageIcon = new ImageIcon("image/Map/final4.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);
				if (y1 <= 170) {
					y1 = 170;
				}
				if (y1 >= 317) {
					y1 = 310;
				}
				if (x1 <= 20) {
					level = 1001;
					x1 = 430;
				}
				if (between(y1, 150, 215) && x1 <= 50) {
					x1 = 50;
				}
				if (between(y1, 266, 350) && x1 <= 50) {
					x1 = 50;
				}
				if (between(y1, 150, 215) && x1 >= 450) {
					x1 = 440;
				}
				if (between(y1, 266, 350) && x1 >= 450) {
					x1 = 440;
				}
				if (x1 >= 510) {
					level = 1003;
					x1 = 70;
				}
			}
			if (level == 1003) {
				ImageIcon imageIcon = new ImageIcon("image/Map/final3.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/pavel/princessegauche.png");
				Image d1 = image2.getImage();
				g.drawImage(d1, 397, 168, 30, 40, this);
			}
			if (level == 1004) {
				ImageIcon imageIcon = new ImageIcon("image/Map/final3.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/pavel/princessegauche.png");
				Image d1 = image2.getImage();
				g.drawImage(d1, 397, ty[2], 30, 40, this);
			}
			if (animX2) {
				if (Objet == 4)
					g.setColor(Color.BLACK);
				else
					g.setColor(Color.WHITE);
				g.fillRect(0, 0, 600, 600);
			}

			if (magiklink2) {
				g.setColor(Color.gray);
				g.fillOval(0, 0, 500, 500);
				g.setColor(Color.YELLOW);
				tapis(g, i, 40, 10, 440, 440);
			}
			if (orientation == 0) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/pavel/sdroite.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, x1, y1, this);
					// g.drawImage(w,x,y,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/pavel/sdroite2.png");
					Image d = image.getImage();

					g.drawImage(d, x1, y1, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/pavel/sdroite3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, x1, y1, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/pavel/sdroite.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, x1, y1, this);

					break;
				}
			}
			if (orientation == 1) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/pavel/sgauche.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, x1, y1, this);
					// g.drawImage(w,x,y,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/pavel/sgauche2.png");
					Image d = image.getImage();

					g.drawImage(d, x1, y1, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/pavel/sgauche3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, x1, y1, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/pavel/sgauche2.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, x1, y1, this);

					break;
				}
			}

			if (orientation == 2) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/pavel/sbas.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, x1, y1, this);
					// g.drawImage(w,x,y,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/pavel/sbas2.png");
					Image d = image.getImage();

					g.drawImage(d, x1, y1, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/pavel/sbas3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, x1, y1, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/pavel/sbas2.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, x1, y1, this);

					break;
				}
			}
			if (orientation == 3) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/pavel/shaut.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, x1, y1, this);
					// g.drawImage(w,x,y,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/pavel/shaut2.png");
					Image d = image.getImage();

					g.drawImage(d, x1, y1, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/pavel/shaut3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, x1, y1, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/pavel/shaut2.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, x1, y1, this);

					break;
				}
			}
			// Vlad
			switch (avancem[8]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/pavel/vladgauche.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[2], ty[2], this);
				// g.drawImage(w,x,y,this);
				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/pavel/vladgauche2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[2], ty[2], this);
				break;

			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/pavel/vladgauche3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[2], ty[2], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/pavel/vladdroite.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[2], ty[2], this);

				break;

			case 5:

				ImageIcon image5 = new ImageIcon(
						"image/Personnage/pavel/vladdroite2.png");
				Image d5 = image5.getImage();

				g.drawImage(d5, tx[2], ty[2], this);
				break;

			case 6:

				ImageIcon image6 = new ImageIcon(
						"image/Personnage/pavel/vladdroite3.png");
				Image d6 = image6.getImage();

				g.drawImage(d6, tx[2], ty[2], this);
				break;
			}

			// Mechant principal
			switch (avancem[2]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/s2bas.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, xd, yd, this);
				// g.drawImage(w,x,y,this);
				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/s2bas2.png");
				Image d = image.getImage();

				g.drawImage(d, xd, yd, this);
				break;

			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/s2bas3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, xd, yd, this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/s2gauche.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, xd, yd, this);

				break;

			case 5:

				ImageIcon image5 = new ImageIcon(
						"image/Personnage/mechant/s2gauche2.png");
				Image d5 = image5.getImage();

				g.drawImage(d5, xd, yd, this);
				break;

			case 6:

				ImageIcon image6 = new ImageIcon(
						"image/Personnage/mechant/s2gauche3.png");
				Image d6 = image6.getImage();

				g.drawImage(d6, xd, yd, this);
				break;

			case 7:

				ImageIcon image7 = new ImageIcon(
						"image/Personnage/mechant/s2droite.png");
				Image d7 = image7.getImage();

				g.drawImage(d7, xd, yd, this);
				break;

			case 8:

				ImageIcon image8 = new ImageIcon(
						"image/Personnage/mechant/s2droite2.png");
				Image d8 = image8.getImage();

				g.drawImage(d8, xd, yd, this);
				break;

			case 9:

				ImageIcon image9 = new ImageIcon(
						"image/Personnage/mechant/s2droite3.png");
				Image d9 = image9.getImage();

				g.drawImage(d9, xd, yd, this);
				break;

			case 10:

				ImageIcon image10 = new ImageIcon(
						"image/Personnage/mechant/s2haut.png");
				Image d10 = image10.getImage();

				g.drawImage(d10, xd, yd, this);
				break;

			}

			// SABREUR LEGENDAIRE

			if (orientationl == 0) {
				switch (avancel) {
				case 1:

					ImageIcon imageIcon = new ImageIcon("img/d1.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, xl, yl, 30, 35, this);
					// g.drawImage(w,xl,yl,20,30,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("img/d2.gif");
					Image d = image.getImage();

					g.drawImage(d, xl, yl, 30, 35, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("img/d3.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, xl, yl, 30, 35, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon("img/d4.gif");
					Image d2 = image3.getImage();

					g.drawImage(d2, xl, yl, 30, 35, this);

					break;
				}
			}
			if (orientationl == 1) {
				switch (avancel) {
				case 1:

					ImageIcon imageIcon = new ImageIcon("img/l4.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, xl, yl, 30, 35, this);
					// g.drawImage(w,xl,yl,20,30,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("img/l3.gif");
					Image d = image.getImage();

					g.drawImage(d, xl, yl, 30, 35, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("img/l2.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, xl, yl, 30, 35, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon("img/l1.gif");
					Image d2 = image3.getImage();

					g.drawImage(d2, xl, yl, 30, 35, this);

					break;
				}
			}

			if (orientationl == 2) {
				switch (avancel) {
				case 1:

					ImageIcon imageIcon = new ImageIcon("img/b1.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, xl, yl, 30, 35, this);
					// g.drawImage(w,xl,yl,20,30,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("img/b2.gif");
					Image d = image.getImage();

					g.drawImage(d, xl, yl, 30, 35, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("img/b3.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, xl, yl, 30, 35, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon("img/b4.gif");
					Image d2 = image3.getImage();

					g.drawImage(d2, xl, yl, 30, 35, this);

					break;
				}
			}
			if (orientationl == 3) {
				switch (avancel) {
				case 1:

					ImageIcon imageIcon = new ImageIcon("img/h1.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, xl, yl, 30, 35, this);
					// g.drawImage(w,xl,yl,20,30,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("img/h2.gif");
					Image d = image.getImage();

					g.drawImage(d, xl, yl, 30, 35, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("img/h3.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, xl, yl, 30, 35, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon("img/h4.gif");
					Image d2 = image3.getImage();

					g.drawImage(d2, xl, yl, 30, 35, this);

					break;
				}
			}
			// Tourner
			if (orientationl == 4) {
				switch (avancel) {
				case 1:

					ImageIcon imageIcon = new ImageIcon("img/e2.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, xl, yl, 30, 35, this);
					// g.drawImage(w,xl,yl,20,30,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("img/e3.gif");
					Image d = image.getImage();

					g.drawImage(d, xl, yl, 30, 35, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("img/e4.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, xl, yl, 30, 35, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon("img/e5.gif");
					Image d2 = image3.getImage();

					g.drawImage(d2, xl, yl, 30, 35, this);

					break;

				case 5:

					ImageIcon image5 = new ImageIcon("img/ed4.gif");
					Image d5 = image5.getImage();

					g.drawImage(d5, xl, yl, 30, 35, this);
					break;

				case 6:

					ImageIcon image6 = new ImageIcon("img/ed3.gif");
					Image d6 = image6.getImage();

					g.drawImage(d6, xl, yl, 30, 35, this);
					break;

				case 7:

					ImageIcon image7 = new ImageIcon("img/ed2.gif");
					Image d7 = image7.getImage();

					g.drawImage(d7, xl, yl, 30, 35, this);
					break;

				case 8:

					ImageIcon image8 = new ImageIcon("img/eh1.gif");
					Image d8 = image8.getImage();

					g.drawImage(d8, xl, yl, 30, 35, this);
					break;

				case 9:

					ImageIcon image9 = new ImageIcon("img/eh2.gif");
					Image d9 = image9.getImage();

					g.drawImage(d9, xl, yl, 30, 35, this);
					break;

				case 10:

					ImageIcon image10 = new ImageIcon("img/eh3.gif");
					Image d10 = image10.getImage();

					g.drawImage(d10, xl, yl, 30, 35, this);
					break;
				case 11:

					ImageIcon image11 = new ImageIcon("img/eh4.gif");
					Image d11 = image11.getImage();

					g.drawImage(d11, xl, yl, 30, 35, this);
					break;
				case 12:

					ImageIcon image12 = new ImageIcon("img/eh5.gif");
					Image d12 = image12.getImage();

					g.drawImage(d12, xl, yl, 30, 35, this);
					break;
				case 13:

					ImageIcon image13 = new ImageIcon("img/eg2.gif");
					Image d13 = image13.getImage();

					g.drawImage(d13, xl, yl, 30, 35, this);
					break;
				case 14:

					ImageIcon image14 = new ImageIcon("img/eg3.gif");
					Image d14 = image14.getImage();

					g.drawImage(d14, xl, yl, 30, 35, this);
					break;
				case 15:

					ImageIcon image1a = new ImageIcon("img/eg4.gif");
					Image d1a = image1a.getImage();

					g.drawImage(d1a, xl, yl, 30, 35, this);
					break;
				case 16:

					ImageIcon image16 = new ImageIcon("img/eg5.gif");
					Image d16 = image16.getImage();

					g.drawImage(d16, xl, yl, 30, 35, this);
					break;
				}
			}

			if (level == -1) {
				ImageIcon imageIcon = new ImageIcon("image/Map/paysage.jpg");
				Image w = imageIcon.getImage();
				g.drawImage(w, map, map2, size, size2, this);
				ImageIcon image16 = new ImageIcon(
						"image/Personnage/pavel/logo2.png");
				Image d16 = image16.getImage();
				g.setColor(Color.WHITE);
				if (start1) {
					g.drawImage(d16, 70, 10, 350, 150, this);
					g.drawString("By Patrick Chen", 10, 470);
					if (afficher) {
						g.setFont(new Font("Arial", Font.BOLD, 20));

						g.drawString("Appuyer sur a", 170, 410);
					}
					g.setFont(new Font("Arial", Font.BOLD, 20));
					g.drawString("Chapitre I : enlevement", 150, 270);
				}
			}
			if (level == -2) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 600, 600);
			}

			if (findejeu) {
				ImageIcon imageIcon = new ImageIcon("image/Map/a.jpg");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 700, this);
			}
			if (!bool[4]) {
				ImageIcon imageIcon = new ImageIcon("image/Map/M.jpg");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 700, this);
			}

		} else {
			if (level == 0 || level == 1 || level == 8 || level == 9
					|| level == 10 || level == 7 || level == 11 || level == 88
					|| level == 111) {

				// ImageIcon imageIcon = new ImageIcon("image/Map/map.png");
				ImageIcon imageIcon = new ImageIcon("image/Map/map2.png");
				Image w = imageIcon.getImage();
				g.drawImage(w, map, 0, size, 500, this);
			} else if (level == 2) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 600, 600);
			} else if (level == 3 || level == 33 || level == 5) { // Map de la
																	// foret
																	// (dans le
				// village donc)
				ImageIcon imageIcon = new ImageIcon("image/Map/map.png");
				Image w = imageIcon.getImage();
				g.drawImage(w, map, map2, size, size2, this);
			} else if (level == -5 || level == -3) {// map < 0) {
				// MAP dans la neige
				ImageIcon imageIcon = new ImageIcon("image/Map/mapneige.png");
				Image w = imageIcon.getImage();
				g.drawImage(w, map, map2, size, 740, this);
			} else if (level >= 1000) {
				// MAP de fin
				ImageIcon imageIcon = new ImageIcon("image/Map/MAPP.png");
				Image w = imageIcon.getImage();
				g.drawImage(w, map, 0, size, 560, this);
			}
			if (magikp) {

				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 1000, 1000);

				int x0 = 500 / 2;
				int y0 = 500 / 2;
				int x, y;
				double a, b;
				a = 0.7;
				b = 0.7;
				g.setColor(Color.WHITE);
				for (int teta = 0; teta < 180 * 3; teta += 5) {
					x = (int) (x0 + (a * teta)
							* Math.cos((Math.PI * teta * b) / 180));
					y = (int) (y0 + (a * teta)
							* Math.sin((Math.PI * teta * b) / 180));
					g.fillOval(x, y, 10, 10);
				}
			}
			if (DEMON) {
				switch (incre) {
				case 1:
					ImageIcon im1 = new ImageIcon("image/Personnage/sort/f.png");
					Image w1 = im1.getImage();
					g.drawImage(w1, 0, 0, 500, 500, this);
					break;

				case 2:
					ImageIcon im2 = new ImageIcon(
							"image/Personnage/sort/f1.png");
					Image w2 = im2.getImage();
					g.drawImage(w2, 0, 0, 500, 500, this);
					break;

				case 3:
					ImageIcon im3 = new ImageIcon(
							"image/Personnage/sort/f2.png");
					Image w3 = im3.getImage();
					g.drawImage(w3, 0, 0, 500, 500, this);
					break;

				case 4:
					ImageIcon im4 = new ImageIcon(
							"image/Personnage/sort/f3.png");
					Image w4 = im4.getImage();
					g.drawImage(w4, 0, 0, 500, 500, this);
					break;

				case 5:
					ImageIcon im5 = new ImageIcon(
							"image/Personnage/sort/f4.png");
					Image w5 = im5.getImage();
					g.drawImage(w5, 0, 0, 500, 500, this);
					break;

				case 6:
					ImageIcon im6 = new ImageIcon(
							"image/Personnage/sort/f5.png");
					Image w6 = im6.getImage();
					g.drawImage(w6, 0, 0, 500, 500, this);
					break;

				case 7:
					ImageIcon im7 = new ImageIcon(
							"image/Personnage/sort/f6.png");
					Image w7 = im7.getImage();
					g.drawImage(w7, 0, 0, 500, 500, this);
					break;

				case 8:
					ImageIcon im8 = new ImageIcon(
							"image/Personnage/sort/f7.png");
					Image w8 = im8.getImage();
					g.drawImage(w8, 0, 0, 500, 500, this);
					break;

				case 9:
					ImageIcon im9 = new ImageIcon(
							"image/Personnage/sort/f8.png");
					Image w9 = im9.getImage();
					g.drawImage(w9, 0, 0, 500, 500, this);
					break;
				}

			}

			if (VLAD) {
				switch (avancem[27]) {
				case 1:
					ImageIcon im1 = new ImageIcon("Thor/001.PNG");
					Image w1 = im1.getImage();
					g.drawImage(w1, 0, 0, 500, 500, this);
					break;

				case 2:
					ImageIcon im2 = new ImageIcon("Thor/002.PNG");
					Image w2 = im2.getImage();
					g.drawImage(w2, 0, 0, 500, 500, this);
					break;

				case 3:
					ImageIcon im3 = new ImageIcon("Thor/003.PNG");
					Image w3 = im3.getImage();
					g.drawImage(w3, 0, 0, 500, 500, this);
					break;

				case 4:
					ImageIcon im4 = new ImageIcon("Thor/004.PNG");
					Image w4 = im4.getImage();
					g.drawImage(w4, 0, 0, 500, 500, this);
					break;

				case 5:
					ImageIcon im5 = new ImageIcon("Thor/005.PNG");
					Image w5 = im5.getImage();
					g.drawImage(w5, 0, 0, 500, 500, this);
					break;

				case 6:
					ImageIcon im6 = new ImageIcon("Thor/006.PNG");
					Image w6 = im6.getImage();
					g.drawImage(w6, 0, 0, 500, 500, this);
					break;

				case 7:
					ImageIcon im7 = new ImageIcon("Thor/007.PNG");
					Image w7 = im7.getImage();
					g.drawImage(w7, 0, 0, 500, 500, this);
					break;

				case 8:
					ImageIcon im8 = new ImageIcon("Thor/008.PNG");
					Image w8 = im8.getImage();
					g.drawImage(w8, 0, 0, 500, 500, this);
					break;

				case 9:
					ImageIcon im9 = new ImageIcon("Thor/009.PNG");
					Image w9 = im9.getImage();
					g.drawImage(w9, 0, 0, 500, 500, this);
					break;

				case 10:
					ImageIcon im10 = new ImageIcon("Thor/010.PNG");
					Image w10 = im10.getImage();
					g.drawImage(w10, 0, 0, 500, 500, this);
					break;

				case 11:
					ImageIcon im11 = new ImageIcon("Thor/011.PNG");
					Image w11 = im11.getImage();
					g.drawImage(w11, 0, 0, 500, 500, this);
					break;

				case 12:
					ImageIcon im12 = new ImageIcon("Thor/012.PNG");
					Image w12 = im12.getImage();
					g.drawImage(w12, 0, 0, 500, 500, this);
					break;

				case 13:
					ImageIcon im13 = new ImageIcon("Thor/013.PNG");
					Image w13 = im13.getImage();
					g.drawImage(w13, 0, 0, 500, 500, this);
					break;

				case 14:
					ImageIcon im14 = new ImageIcon("Thor/014.PNG");
					Image w14 = im14.getImage();
					g.drawImage(w14, 0, 0, 500, 500, this);
					break;

				case 15:
					ImageIcon im15 = new ImageIcon("Thor/015.PNG");
					Image w15 = im15.getImage();
					g.drawImage(w15, 0, 0, 500, 500, this);
					break;

				case 16:
					ImageIcon im16 = new ImageIcon("Thor/016.PNG");
					Image w16 = im16.getImage();
					g.drawImage(w16, 0, 0, 500, 500, this);
					break;

				case 17:
					ImageIcon im17 = new ImageIcon("Thor/017.PNG");
					Image w17 = im17.getImage();
					g.drawImage(w17, 0, 0, 500, 500, this);
					break;

				case 18:
					ImageIcon im18 = new ImageIcon("Thor/018.PNG");
					Image w18 = im18.getImage();
					g.drawImage(w18, 0, 0, 500, 500, this);
					break;

				case 19:
					ImageIcon im19 = new ImageIcon("Thor/019.PNG");
					Image w19 = im19.getImage();
					g.drawImage(w19, 0, 0, 500, 500, this);
					break;

				case 20:
					ImageIcon im20 = new ImageIcon("Thor/020.PNG");
					Image w20 = im20.getImage();
					g.drawImage(w20, 0, 0, 500, 500, this);
					break;

				case 21:
					ImageIcon im21 = new ImageIcon("Thor/021.PNG");
					Image w21 = im21.getImage();
					g.drawImage(w21, 0, 0, 500, 500, this);
					break;

				case 22:
					ImageIcon im22 = new ImageIcon("Thor/022.PNG");
					Image w22 = im22.getImage();
					g.drawImage(w22, 0, 0, 500, 500, this);
					break;

				case 23:
					ImageIcon im23 = new ImageIcon("Thor/023.PNG");
					Image w23 = im23.getImage();
					g.drawImage(w23, 0, 0, 500, 500, this);
					break;

				case 24:
					ImageIcon im24 = new ImageIcon("Thor/024.PNG");
					Image w24 = im24.getImage();
					g.drawImage(w24, 0, 0, 500, 500, this);
					break;

				case 25:
					ImageIcon im25 = new ImageIcon("Thor/025.PNG");
					Image w25 = im25.getImage();
					g.drawImage(w25, 0, 0, 500, 500, this);
					break;

				case 26:
					ImageIcon im26 = new ImageIcon("Thor/026.PNG");
					Image w26 = im26.getImage();
					g.drawImage(w26, 0, 0, 500, 500, this);
					break;

				case 27:
					ImageIcon im27 = new ImageIcon("Thor/027.PNG");
					Image w27 = im27.getImage();
					g.drawImage(w27, 0, 0, 500, 500, this);
					break;

				case 28:
					ImageIcon im28 = new ImageIcon("Thor/028.PNG");
					Image w28 = im28.getImage();
					g.drawImage(w28, 0, 0, 500, 500, this);
					break;

				case 29:
					ImageIcon im29 = new ImageIcon("Thor/029.PNG");
					Image w29 = im29.getImage();
					g.drawImage(w29, 0, 0, 500, 500, this);
					break;

				case 30:
					ImageIcon im30 = new ImageIcon("Thor/030.PNG");
					Image w30 = im30.getImage();
					g.drawImage(w30, 0, 0, 500, 500, this);
					break;

				case 31:
					ImageIcon im31 = new ImageIcon("Thor/031.PNG");
					Image w31 = im31.getImage();
					g.drawImage(w31, 0, 0, 500, 500, this);
					break;

				case 32:
					ImageIcon im32 = new ImageIcon("Thor/032.PNG");
					Image w32 = im32.getImage();
					g.drawImage(w32, 0, 0, 500, 500, this);
					break;

				case 33:
					ImageIcon im33 = new ImageIcon("Thor/033.PNG");
					Image w33 = im33.getImage();
					g.drawImage(w33, 0, 0, 500, 500, this);
					break;

				case 34:
					ImageIcon im34 = new ImageIcon("Thor/034.PNG");
					Image w34 = im34.getImage();
					g.drawImage(w34, 0, 0, 500, 500, this);
					break;

				case 35:
					ImageIcon im35 = new ImageIcon("Thor/035.PNG");
					Image w35 = im35.getImage();
					g.drawImage(w35, 0, 0, 500, 500, this);
					break;

				case 36:
					ImageIcon im36 = new ImageIcon("Thor/036.PNG");
					Image w36 = im36.getImage();
					g.drawImage(w36, 0, 0, 500, 500, this);
					break;

				case 37:
					ImageIcon im37 = new ImageIcon("Thor/037.PNG");
					Image w37 = im37.getImage();
					g.drawImage(w37, 0, 0, 500, 500, this);
					break;

				case 38:
					ImageIcon im38 = new ImageIcon("Thor/038.PNG");
					Image w38 = im38.getImage();
					g.drawImage(w38, 0, 0, 500, 500, this);
					break;

				case 39:
					ImageIcon im39 = new ImageIcon("Thor/039.PNG");
					Image w39 = im39.getImage();
					g.drawImage(w39, 0, 0, 500, 500, this);
					break;

				case 40:
					ImageIcon im40 = new ImageIcon("Thor/040.PNG");
					Image w40 = im40.getImage();
					g.drawImage(w40, 0, 0, 500, 500, this);
					break;

				case 41:
					ImageIcon im41 = new ImageIcon("Thor/041.PNG");
					Image w41 = im41.getImage();
					g.drawImage(w41, 0, 0, 500, 500, this);
					break;

				case 42:
					ImageIcon im42 = new ImageIcon("Thor/042.PNG");
					Image w42 = im42.getImage();
					g.drawImage(w42, 0, 0, 500, 500, this);
					break;

				case 43:
					ImageIcon im43 = new ImageIcon("Thor/043.PNG");
					Image w43 = im43.getImage();
					g.drawImage(w43, 0, 0, 500, 500, this);
					break;

				case 44:
					ImageIcon im44 = new ImageIcon("Thor/044.PNG");
					Image w44 = im44.getImage();
					g.drawImage(w44, 0, 0, 500, 500, this);
					break;

				case 45:
					ImageIcon im45 = new ImageIcon("Thor/045.PNG");
					Image w45 = im45.getImage();
					g.drawImage(w45, 0, 0, 500, 500, this);
					break;

				case 46:
					ImageIcon im46 = new ImageIcon("Thor/046.PNG");
					Image w46 = im46.getImage();
					g.drawImage(w46, 0, 0, 500, 500, this);
					break;

				case 47:
					ImageIcon im47 = new ImageIcon("Thor/047.PNG");
					Image w47 = im47.getImage();
					g.drawImage(w47, 0, 0, 500, 500, this);
					break;

				case 48:
					ImageIcon im48 = new ImageIcon("Thor/048.PNG");
					Image w48 = im48.getImage();
					g.drawImage(w48, 0, 0, 500, 500, this);
					break;

				case 49:
					ImageIcon im49 = new ImageIcon("Thor/049.PNG");
					Image w49 = im49.getImage();
					g.drawImage(w49, 0, 0, 500, 500, this);
					break;

				case 50:
					ImageIcon im50 = new ImageIcon("Thor/050.PNG");
					Image w50 = im50.getImage();
					g.drawImage(w50, 0, 0, 500, 500, this);
					break;

				case 51:
					ImageIcon im51 = new ImageIcon("Thor/051.PNG");
					Image w51 = im51.getImage();
					g.drawImage(w51, 0, 0, 500, 500, this);
					break;

				case 52:
					ImageIcon im52 = new ImageIcon("Thor/052.PNG");
					Image w52 = im52.getImage();
					g.drawImage(w52, 0, 0, 500, 500, this);
					break;

				case 53:
					ImageIcon im53 = new ImageIcon("Thor/053.PNG");
					Image w53 = im53.getImage();
					g.drawImage(w53, 0, 0, 500, 500, this);
					break;

				case 54:
					ImageIcon im54 = new ImageIcon("Thor/054.PNG");
					Image w54 = im54.getImage();
					g.drawImage(w54, 0, 0, 500, 500, this);
					break;

				case 55:
					ImageIcon im55 = new ImageIcon("Thor/055.PNG");
					Image w55 = im55.getImage();
					g.drawImage(w55, 0, 0, 500, 500, this);
					break;

				case 56:
					ImageIcon im56 = new ImageIcon("Thor/056.PNG");
					Image w56 = im56.getImage();
					g.drawImage(w56, 0, 0, 500, 500, this);
					break;

				case 57:
					ImageIcon im57 = new ImageIcon("Thor/057.PNG");
					Image w57 = im57.getImage();
					g.drawImage(w57, 0, 0, 500, 500, this);
					break;

				case 58:
					ImageIcon im58 = new ImageIcon("Thor/058.PNG");
					Image w58 = im58.getImage();
					g.drawImage(w58, 0, 0, 500, 500, this);
					break;

				case 59:
					ImageIcon im59 = new ImageIcon("Thor/059.PNG");
					Image w59 = im59.getImage();
					g.drawImage(w59, 0, 0, 500, 500, this);
					break;

				case 60:
					ImageIcon im60 = new ImageIcon("Thor/060.PNG");
					Image w60 = im60.getImage();
					g.drawImage(w60, 0, 0, 500, 500, this);
					break;

				case 61:
					ImageIcon im61 = new ImageIcon("Thor/061.PNG");
					Image w61 = im61.getImage();
					g.drawImage(w61, 0, 0, 500, 500, this);
					break;

				case 62:
					ImageIcon im62 = new ImageIcon("Thor/062.PNG");
					Image w62 = im62.getImage();
					g.drawImage(w62, 0, 0, 500, 500, this);
					break;

				case 63:
					ImageIcon im63 = new ImageIcon("Thor/063.PNG");
					Image w63 = im63.getImage();
					g.drawImage(w63, 0, 0, 500, 500, this);
					break;

				case 64:
					ImageIcon im64 = new ImageIcon("Thor/064.PNG");
					Image w64 = im64.getImage();
					g.drawImage(w64, 0, 0, 500, 500, this);
					break;

				case 65:
					ImageIcon im65 = new ImageIcon("Thor/065.PNG");
					Image w65 = im65.getImage();
					g.drawImage(w65, 0, 0, 500, 500, this);
					break;

				case 66:
					ImageIcon im66 = new ImageIcon("Thor/066.PNG");
					Image w66 = im66.getImage();
					g.drawImage(w66, 0, 0, 500, 500, this);
					break;

				case 67:
					ImageIcon im67 = new ImageIcon("Thor/067.PNG");
					Image w67 = im67.getImage();
					g.drawImage(w67, 0, 0, 500, 500, this);
					break;

				case 68:
					ImageIcon im68 = new ImageIcon("Thor/068.PNG");
					Image w68 = im68.getImage();
					g.drawImage(w68, 0, 0, 500, 500, this);
					break;

				case 69:
					ImageIcon im69 = new ImageIcon("Thor/069.PNG");
					Image w69 = im69.getImage();
					g.drawImage(w69, 0, 0, 500, 500, this);
					break;

				case 70:
					ImageIcon im70 = new ImageIcon("Thor/070.PNG");
					Image w70 = im70.getImage();
					g.drawImage(w70, 0, 0, 500, 500, this);
					break;

				case 71:
					ImageIcon im71 = new ImageIcon("Thor/071.PNG");
					Image w71 = im71.getImage();
					g.drawImage(w71, 0, 0, 500, 500, this);
					break;

				case 72:
					ImageIcon im72 = new ImageIcon("Thor/072.PNG");
					Image w72 = im72.getImage();
					g.drawImage(w72, 0, 0, 500, 500, this);
					break;

				case 73:
					ImageIcon im73 = new ImageIcon("Thor/073.PNG");
					Image w73 = im73.getImage();
					g.drawImage(w73, 0, 0, 500, 500, this);
					break;

				case 74:
					ImageIcon im74 = new ImageIcon("Thor/074.PNG");
					Image w74 = im74.getImage();
					g.drawImage(w74, 0, 0, 500, 500, this);
					break;

				case 75:
					ImageIcon im75 = new ImageIcon("Thor/075.PNG");
					Image w75 = im75.getImage();
					g.drawImage(w75, 0, 0, 500, 500, this);
					break;

				case 76:
					ImageIcon im76 = new ImageIcon("Thor/076.PNG");
					Image w76 = im76.getImage();
					g.drawImage(w76, 0, 0, 500, 500, this);
					break;

				case 77:
					ImageIcon im77 = new ImageIcon("Thor/077.PNG");
					Image w77 = im77.getImage();
					g.drawImage(w77, 0, 0, 500, 500, this);
					break;

				case 78:
					ImageIcon im78 = new ImageIcon("Thor/078.PNG");
					Image w78 = im78.getImage();
					g.drawImage(w78, 0, 0, 500, 500, this);
					break;

				case 79:
					ImageIcon im79 = new ImageIcon("Thor/079.PNG");
					Image w79 = im79.getImage();
					g.drawImage(w79, 0, 0, 500, 500, this);
					break;

				case 80:
					ImageIcon im80 = new ImageIcon("Thor/080.PNG");
					Image w80 = im80.getImage();
					g.drawImage(w80, 0, 0, 500, 500, this);
					break;

				case 81:
					ImageIcon im81 = new ImageIcon("Thor/081.PNG");
					Image w81 = im81.getImage();
					g.drawImage(w81, 0, 0, 500, 500, this);
					break;

				case 82:
					ImageIcon im82 = new ImageIcon("Thor/082.PNG");
					Image w82 = im82.getImage();
					g.drawImage(w82, 0, 0, 500, 500, this);
					break;

				case 83:
					ImageIcon im83 = new ImageIcon("Thor/083.PNG");
					Image w83 = im83.getImage();
					g.drawImage(w83, 0, 0, 500, 500, this);
					break;

				case 84:
					ImageIcon im84 = new ImageIcon("Thor/084.PNG");
					Image w84 = im84.getImage();
					g.drawImage(w84, 0, 0, 500, 500, this);
					break;

				case 85:
					ImageIcon im85 = new ImageIcon("Thor/085.PNG");
					Image w85 = im85.getImage();
					g.drawImage(w85, 0, 0, 500, 500, this);
					break;

				case 86:
					ImageIcon im86 = new ImageIcon("Thor/086.PNG");
					Image w86 = im86.getImage();
					g.drawImage(w86, 0, 0, 500, 500, this);
					break;

				case 87:
					ImageIcon im87 = new ImageIcon("Thor/087.PNG");
					Image w87 = im87.getImage();
					g.drawImage(w87, 0, 0, 500, 500, this);
					break;

				case 88:
					ImageIcon im88 = new ImageIcon("Thor/088.PNG");
					Image w88 = im88.getImage();
					g.drawImage(w88, 0, 0, 500, 500, this);
					break;

				case 89:
					ImageIcon im89 = new ImageIcon("Thor/089.PNG");
					Image w89 = im89.getImage();
					g.drawImage(w89, 0, 0, 500, 500, this);
					break;

				case 90:
					ImageIcon im90 = new ImageIcon("Thor/090.PNG");
					Image w90 = im90.getImage();
					g.drawImage(w90, 0, 0, 500, 500, this);
					break;

				case 91:
					ImageIcon im91 = new ImageIcon("Thor/091.PNG");
					Image w91 = im91.getImage();
					g.drawImage(w91, 0, 0, 500, 500, this);
					break;

				case 92:
					ImageIcon im92 = new ImageIcon("Thor/092.PNG");
					Image w92 = im92.getImage();
					g.drawImage(w92, 0, 0, 500, 500, this);
					break;

				case 93:
					ImageIcon im93 = new ImageIcon("Thor/093.PNG");
					Image w93 = im93.getImage();
					g.drawImage(w93, 0, 0, 500, 500, this);
					break;

				case 94:
					ImageIcon im94 = new ImageIcon("Thor/094.PNG");
					Image w94 = im94.getImage();
					g.drawImage(w94, 0, 0, 500, 500, this);
					break;

				case 95:
					ImageIcon im95 = new ImageIcon("Thor/095.PNG");
					Image w95 = im95.getImage();
					g.drawImage(w95, 0, 0, 500, 500, this);
					break;

				case 96:
					ImageIcon im96 = new ImageIcon("Thor/096.PNG");
					Image w96 = im96.getImage();
					g.drawImage(w96, 0, 0, 500, 500, this);
					break;

				case 97:
					ImageIcon im97 = new ImageIcon("Thor/097.PNG");
					Image w97 = im97.getImage();
					g.drawImage(w97, 0, 0, 500, 500, this);
					break;

				case 98:
					ImageIcon im98 = new ImageIcon("Thor/098.PNG");
					Image w98 = im98.getImage();
					g.drawImage(w98, 0, 0, 500, 500, this);
					break;

				case 99:
					ImageIcon im99 = new ImageIcon("Thor/099.PNG");
					Image w99 = im99.getImage();
					g.drawImage(w99, 0, 0, 500, 500, this);
					break;

				case 100:
					ImageIcon im100 = new ImageIcon("Thor/100.PNG");
					Image w100 = im100.getImage();
					g.drawImage(w100, 0, 0, 500, 500, this);
					break;

				case 101:
					ImageIcon im101 = new ImageIcon("Thor/101.PNG");
					Image w101 = im101.getImage();
					g.drawImage(w101, 0, 0, 500, 500, this);
					break;

				case 102:
					ImageIcon im102 = new ImageIcon("Thor/102.PNG");
					Image w102 = im102.getImage();
					g.drawImage(w102, 0, 0, 500, 500, this);
					break;

				case 103:
					ImageIcon im103 = new ImageIcon("Thor/103.PNG");
					Image w103 = im103.getImage();
					g.drawImage(w103, 0, 0, 500, 500, this);
					break;

				case 104:
					ImageIcon im104 = new ImageIcon("Thor/104.PNG");
					Image w104 = im104.getImage();
					g.drawImage(w104, 0, 0, 500, 500, this);
					break;

				case 105:
					ImageIcon im105 = new ImageIcon("Thor/105.PNG");
					Image w105 = im105.getImage();
					g.drawImage(w105, 0, 0, 500, 500, this);
					break;

				case 106:
					ImageIcon im106 = new ImageIcon("Thor/106.PNG");
					Image w106 = im106.getImage();
					g.drawImage(w106, 0, 0, 500, 500, this);
					break;

				case 107:
					ImageIcon im107 = new ImageIcon("Thor/107.PNG");
					Image w107 = im107.getImage();
					g.drawImage(w107, 0, 0, 500, 500, this);
					break;

				case 108:
					ImageIcon im108 = new ImageIcon("Thor/108.PNG");
					Image w108 = im108.getImage();
					g.drawImage(w108, 0, 0, 500, 500, this);
					break;

				case 109:
					ImageIcon im109 = new ImageIcon("Thor/109.PNG");
					Image w109 = im109.getImage();
					g.drawImage(w109, 0, 0, 500, 500, this);
					break;

				case 110:
					ImageIcon im110 = new ImageIcon("Thor/110.PNG");
					Image w110 = im110.getImage();
					g.drawImage(w110, 0, 0, 500, 500, this);
					break;

				case 111:
					ImageIcon im111 = new ImageIcon("Thor/111.PNG");
					Image w111 = im111.getImage();
					g.drawImage(w111, 0, 0, 500, 500, this);
					break;

				case 112:
					ImageIcon im112 = new ImageIcon("Thor/112.PNG");
					Image w112 = im112.getImage();
					g.drawImage(w112, 0, 0, 500, 500, this);
					break;

				case 113:
					ImageIcon im113 = new ImageIcon("Thor/113.PNG");
					Image w113 = im113.getImage();
					g.drawImage(w113, 0, 0, 500, 500, this);
					break;

				case 114:
					ImageIcon im114 = new ImageIcon("Thor/114.PNG");
					Image w114 = im114.getImage();
					g.drawImage(w114, 0, 0, 500, 500, this);
					break;

				case 115:
					ImageIcon im115 = new ImageIcon("Thor/115.PNG");
					Image w115 = im115.getImage();
					g.drawImage(w115, 0, 0, 500, 500, this);
					break;

				case 116:
					ImageIcon im116 = new ImageIcon("Thor/116.PNG");
					Image w116 = im116.getImage();
					g.drawImage(w116, 0, 0, 500, 500, this);
					break;

				case 117:
					ImageIcon im117 = new ImageIcon("Thor/117.PNG");
					Image w117 = im117.getImage();
					g.drawImage(w117, 0, 0, 500, 500, this);
					break;

				case 118:
					ImageIcon im118 = new ImageIcon("Thor/118.PNG");
					Image w118 = im118.getImage();
					g.drawImage(w118, 0, 0, 500, 500, this);
					break;

				case 119:
					ImageIcon im119 = new ImageIcon("Thor/119.PNG");
					Image w119 = im119.getImage();
					g.drawImage(w119, 0, 0, 500, 500, this);
					break;

				case 120:
					ImageIcon im120 = new ImageIcon("Thor/120.PNG");
					Image w120 = im120.getImage();
					g.drawImage(w120, 0, 0, 500, 500, this);
					break;

				case 121:
					ImageIcon im121 = new ImageIcon("Thor/121.PNG");
					Image w121 = im121.getImage();
					g.drawImage(w121, 0, 0, 500, 500, this);
					break;

				case 122:
					ImageIcon im122 = new ImageIcon("Thor/122.PNG");
					Image w122 = im122.getImage();
					g.drawImage(w122, 0, 0, 500, 500, this);
					break;

				case 123:
					ImageIcon im123 = new ImageIcon("Thor/123.PNG");
					Image w123 = im123.getImage();
					g.drawImage(w123, 0, 0, 500, 500, this);
					break;

				case 124:
					ImageIcon im124 = new ImageIcon("Thor/124.PNG");
					Image w124 = im124.getImage();
					g.drawImage(w124, 0, 0, 500, 500, this);
					break;

				case 125:
					ImageIcon im125 = new ImageIcon("Thor/125.PNG");
					Image w125 = im125.getImage();
					g.drawImage(w125, 0, 0, 500, 500, this);
					break;

				case 126:
					ImageIcon im126 = new ImageIcon("Thor/126.PNG");
					Image w126 = im126.getImage();
					g.drawImage(w126, 0, 0, 500, 500, this);
					break;

				case 127:
					ImageIcon im127 = new ImageIcon("Thor/127.PNG");
					Image w127 = im127.getImage();
					g.drawImage(w127, 0, 0, 500, 500, this);
					break;

				case 128:
					ImageIcon im128 = new ImageIcon("Thor/128.PNG");
					Image w128 = im128.getImage();
					g.drawImage(w128, 0, 0, 500, 500, this);
					break;

				case 129:
					ImageIcon im129 = new ImageIcon("Thor/129.PNG");
					Image w129 = im129.getImage();
					g.drawImage(w129, 0, 0, 500, 500, this);
					break;

				case 130:
					ImageIcon im130 = new ImageIcon("Thor/130.PNG");
					Image w130 = im130.getImage();
					g.drawImage(w130, 0, 0, 500, 500, this);
					break;

				case 131:
					ImageIcon im131 = new ImageIcon("Thor/131.PNG");
					Image w131 = im131.getImage();
					g.drawImage(w131, 0, 0, 500, 500, this);
					break;

				case 132:
					ImageIcon im132 = new ImageIcon("Thor/132.PNG");
					Image w132 = im132.getImage();
					g.drawImage(w132, 0, 0, 500, 500, this);
					break;

				case 133:
					ImageIcon im133 = new ImageIcon("Thor/133.PNG");
					Image w133 = im133.getImage();
					g.drawImage(w133, 0, 0, 500, 500, this);
					break;

				case 134:
					ImageIcon im134 = new ImageIcon("Thor/134.PNG");
					Image w134 = im134.getImage();
					g.drawImage(w134, 0, 0, 500, 500, this);
					break;

				case 135:
					ImageIcon im135 = new ImageIcon("Thor/135.PNG");
					Image w135 = im135.getImage();
					g.drawImage(w135, 0, 0, 500, 500, this);
					break;

				case 136:
					ImageIcon im136 = new ImageIcon("Thor/136.PNG");
					Image w136 = im136.getImage();
					g.drawImage(w136, 0, 0, 500, 500, this);
					break;

				case 137:
					ImageIcon im137 = new ImageIcon("Thor/137.PNG");
					Image w137 = im137.getImage();
					g.drawImage(w137, 0, 0, 500, 500, this);
					break;

				case 138:
					ImageIcon im138 = new ImageIcon("Thor/138.PNG");
					Image w138 = im138.getImage();
					g.drawImage(w138, 0, 0, 500, 500, this);
					break;

				case 139:
					ImageIcon im139 = new ImageIcon("Thor/139.PNG");
					Image w139 = im139.getImage();
					g.drawImage(w139, 0, 0, 500, 500, this);
					break;

				case 140:
					ImageIcon im140 = new ImageIcon("Thor/140.PNG");
					Image w140 = im140.getImage();
					g.drawImage(w140, 0, 0, 500, 500, this);
					break;

				case 141:
					ImageIcon im141 = new ImageIcon("Thor/141.PNG");
					Image w141 = im141.getImage();
					g.drawImage(w141, 0, 0, 500, 500, this);
					break;

				case 142:
					ImageIcon im142 = new ImageIcon("Thor/142.PNG");
					Image w142 = im142.getImage();
					g.drawImage(w142, 0, 0, 500, 500, this);
					break;

				case 143:
					ImageIcon im143 = new ImageIcon("Thor/143.PNG");
					Image w143 = im143.getImage();
					g.drawImage(w143, 0, 0, 500, 500, this);
					break;

				case 144:
					ImageIcon im144 = new ImageIcon("Thor/144.PNG");
					Image w144 = im144.getImage();
					g.drawImage(w144, 0, 0, 500, 500, this);
					break;

				case 145:
					ImageIcon im145 = new ImageIcon("Thor/145.PNG");
					Image w145 = im145.getImage();
					g.drawImage(w145, 0, 0, 500, 500, this);
					break;

				case 146:
					ImageIcon im146 = new ImageIcon("Thor/146.PNG");
					Image w146 = im146.getImage();
					g.drawImage(w146, 0, 0, 500, 500, this);
					break;

				case 147:
					ImageIcon im147 = new ImageIcon("Thor/147.PNG");
					Image w147 = im147.getImage();
					g.drawImage(w147, 0, 0, 500, 500, this);
					break;

				case 148:
					ImageIcon im148 = new ImageIcon("Thor/148.PNG");
					Image w148 = im148.getImage();
					g.drawImage(w148, 0, 0, 500, 500, this);
					break;

				case 149:
					ImageIcon im149 = new ImageIcon("Thor/149.PNG");
					Image w149 = im149.getImage();
					g.drawImage(w149, 0, 0, 500, 500, this);
					break;

				case 150:
					ImageIcon im150 = new ImageIcon("Thor/150.PNG");
					Image w150 = im150.getImage();
					g.drawImage(w150, 0, 0, 500, 500, this);
					break;

				case 151:
					ImageIcon im151 = new ImageIcon("Thor/151.PNG");
					Image w151 = im151.getImage();
					g.drawImage(w151, 0, 0, 500, 500, this);
					break;

				case 152:
					ImageIcon im152 = new ImageIcon("Thor/152.PNG");
					Image w152 = im152.getImage();
					g.drawImage(w152, 0, 0, 500, 500, this);
					break;

				case 153:
					ImageIcon im153 = new ImageIcon("Thor/153.PNG");
					Image w153 = im153.getImage();
					g.drawImage(w153, 0, 0, 500, 500, this);
					break;

				case 154:
					ImageIcon im154 = new ImageIcon("Thor/154.PNG");
					Image w154 = im154.getImage();
					g.drawImage(w154, 0, 0, 500, 500, this);
					break;

				case 155:
					ImageIcon im155 = new ImageIcon("Thor/155.PNG");
					Image w155 = im155.getImage();
					g.drawImage(w155, 0, 0, 500, 500, this);
					break;

				case 156:
					ImageIcon im156 = new ImageIcon("Thor/156.PNG");
					Image w156 = im156.getImage();
					g.drawImage(w156, 0, 0, 500, 500, this);
					break;

				case 157:
					ImageIcon im157 = new ImageIcon("Thor/157.PNG");
					Image w157 = im157.getImage();
					g.drawImage(w157, 0, 0, 500, 500, this);
					break;

				case 158:
					ImageIcon im158 = new ImageIcon("Thor/158.PNG");
					Image w158 = im158.getImage();
					g.drawImage(w158, 0, 0, 500, 500, this);
					break;

				case 159:
					ImageIcon im159 = new ImageIcon("Thor/159.PNG");
					Image w159 = im159.getImage();
					g.drawImage(w159, 0, 0, 500, 500, this);
					break;

				case 160:
					ImageIcon im160 = new ImageIcon("Thor/160.PNG");
					Image w160 = im160.getImage();
					g.drawImage(w160, 0, 0, 500, 500, this);
					break;

				case 161:
					ImageIcon im161 = new ImageIcon("Thor/161.PNG");
					Image w161 = im161.getImage();
					g.drawImage(w161, 0, 0, 500, 500, this);
					break;

				case 162:
					ImageIcon im162 = new ImageIcon("Thor/162.PNG");
					Image w162 = im162.getImage();
					g.drawImage(w162, 0, 0, 500, 500, this);
					break;

				case 163:
					ImageIcon im163 = new ImageIcon("Thor/163.PNG");
					Image w163 = im163.getImage();
					g.drawImage(w163, 0, 0, 500, 500, this);
					break;

				case 164:
					ImageIcon im164 = new ImageIcon("Thor/164.PNG");
					Image w164 = im164.getImage();
					g.drawImage(w164, 0, 0, 500, 500, this);
					break;

				case 165:
					ImageIcon im165 = new ImageIcon("Thor/165.PNG");
					Image w165 = im165.getImage();
					g.drawImage(w165, 0, 0, 500, 500, this);
					break;

				case 166:
					ImageIcon im166 = new ImageIcon("Thor/166.PNG");
					Image w166 = im166.getImage();
					g.drawImage(w166, 0, 0, 500, 500, this);
					break;

				case 167:
					ImageIcon im167 = new ImageIcon("Thor/167.PNG");
					Image w167 = im167.getImage();
					g.drawImage(w167, 0, 0, 500, 500, this);
					break;

				case 168:
					ImageIcon im168 = new ImageIcon("Thor/168.PNG");
					Image w168 = im168.getImage();
					g.drawImage(w168, 0, 0, 500, 500, this);
					break;

				case 169:
					ImageIcon im169 = new ImageIcon("Thor/169.PNG");
					Image w169 = im169.getImage();
					g.drawImage(w169, 0, 0, 500, 500, this);
					break;

				case 170:
					ImageIcon im170 = new ImageIcon("Thor/170.PNG");
					Image w170 = im170.getImage();
					g.drawImage(w170, 0, 0, 500, 500, this);
					break;

				case 171:
					ImageIcon im171 = new ImageIcon("Thor/171.PNG");
					Image w171 = im171.getImage();
					g.drawImage(w171, 0, 0, 500, 500, this);
					break;

				case 172:
					ImageIcon im172 = new ImageIcon("Thor/172.PNG");
					Image w172 = im172.getImage();
					g.drawImage(w172, 0, 0, 500, 500, this);
					break;

				case 173:
					ImageIcon im173 = new ImageIcon("Thor/173.PNG");
					Image w173 = im173.getImage();
					g.drawImage(w173, 0, 0, 500, 500, this);
					break;

				case 174:
					ImageIcon im174 = new ImageIcon("Thor/174.PNG");
					Image w174 = im174.getImage();
					g.drawImage(w174, 0, 0, 500, 500, this);
					break;

				case 175:
					ImageIcon im175 = new ImageIcon("Thor/175.PNG");
					Image w175 = im175.getImage();
					g.drawImage(w175, 0, 0, 500, 500, this);
					break;

				case 176:
					ImageIcon im176 = new ImageIcon("Thor/176.PNG");
					Image w176 = im176.getImage();
					g.drawImage(w176, 0, 0, 500, 500, this);
					break;

				case 177:
					ImageIcon im177 = new ImageIcon("Thor/177.PNG");
					Image w177 = im177.getImage();
					g.drawImage(w177, 0, 0, 500, 500, this);
					break;

				case 178:
					ImageIcon im178 = new ImageIcon("Thor/178.PNG");
					Image w178 = im178.getImage();
					g.drawImage(w178, 0, 0, 500, 500, this);
					break;

				case 179:
					ImageIcon im179 = new ImageIcon("Thor/179.PNG");
					Image w179 = im179.getImage();
					g.drawImage(w179, 0, 0, 500, 500, this);
					break;

				case 180:
					ImageIcon im180 = new ImageIcon("Thor/180.PNG");
					Image w180 = im180.getImage();
					g.drawImage(w180, 0, 0, 500, 500, this);
					break;

				case 181:
					ImageIcon im181 = new ImageIcon("Thor/181.PNG");
					Image w181 = im181.getImage();
					g.drawImage(w181, 0, 0, 500, 500, this);
					break;

				case 182:
					ImageIcon im182 = new ImageIcon("Thor/182.PNG");
					Image w182 = im182.getImage();
					g.drawImage(w182, 0, 0, 500, 500, this);
					break;

				case 183:
					ImageIcon im183 = new ImageIcon("Thor/183.PNG");
					Image w183 = im183.getImage();
					g.drawImage(w183, 0, 0, 500, 500, this);
					break;

				case 184:
					ImageIcon im184 = new ImageIcon("Thor/184.PNG");
					Image w184 = im184.getImage();
					g.drawImage(w184, 0, 0, 500, 500, this);
					break;

				case 185:
					ImageIcon im185 = new ImageIcon("Thor/185.PNG");
					Image w185 = im185.getImage();
					g.drawImage(w185, 0, 0, 500, 500, this);
					break;

				case 186:
					ImageIcon im186 = new ImageIcon("Thor/186.PNG");
					Image w186 = im186.getImage();
					g.drawImage(w186, 0, 0, 500, 500, this);
					break;

				case 187:
					ImageIcon im187 = new ImageIcon("Thor/187.PNG");
					Image w187 = im187.getImage();
					g.drawImage(w187, 0, 0, 500, 500, this);
					break;

				case 188:
					ImageIcon im188 = new ImageIcon("Thor/188.PNG");
					Image w188 = im188.getImage();
					g.drawImage(w188, 0, 0, 500, 500, this);
					break;

				case 189:
					ImageIcon im189 = new ImageIcon("Thor/189.PNG");
					Image w189 = im189.getImage();
					g.drawImage(w189, 0, 0, 500, 500, this);
					break;

				case 190:
					ImageIcon im190 = new ImageIcon("Thor/190.PNG");
					Image w190 = im190.getImage();
					g.drawImage(w190, 0, 0, 500, 500, this);
					break;

				case 191:
					ImageIcon im191 = new ImageIcon("Thor/191.PNG");
					Image w191 = im191.getImage();
					g.drawImage(w191, 0, 0, 500, 500, this);
					break;

				case 192:
					ImageIcon im192 = new ImageIcon("Thor/192.PNG");
					Image w192 = im192.getImage();
					g.drawImage(w192, 0, 0, 500, 500, this);
					break;

				case 193:
					ImageIcon im193 = new ImageIcon("Thor/193.PNG");
					Image w193 = im193.getImage();
					g.drawImage(w193, 0, 0, 500, 500, this);
					break;

				case 194:
					ImageIcon im194 = new ImageIcon("Thor/194.PNG");
					Image w194 = im194.getImage();
					g.drawImage(w194, 0, 0, 500, 500, this);
					break;

				case 195:
					ImageIcon im195 = new ImageIcon("Thor/195.PNG");
					Image w195 = im195.getImage();
					g.drawImage(w195, 0, 0, 500, 500, this);
					break;

				case 196:
					ImageIcon im196 = new ImageIcon("Thor/196.PNG");
					Image w196 = im196.getImage();
					g.drawImage(w196, 0, 0, 500, 500, this);
					break;

				case 197:
					ImageIcon im197 = new ImageIcon("Thor/197.PNG");
					Image w197 = im197.getImage();
					g.drawImage(w197, 0, 0, 500, 500, this);
					break;

				case 198:
					ImageIcon im198 = new ImageIcon("Thor/198.PNG");
					Image w198 = im198.getImage();
					g.drawImage(w198, 0, 0, 500, 500, this);
					break;

				case 199:
					ImageIcon im199 = new ImageIcon("Thor/199.PNG");
					Image w199 = im199.getImage();
					g.drawImage(w199, 0, 0, 500, 500, this);
					break;

				case 200:
					ImageIcon im200 = new ImageIcon("Thor/200.PNG");
					Image w200 = im200.getImage();
					g.drawImage(w200, 0, 0, 500, 500, this);
					break;

				case 201:
					ImageIcon im201 = new ImageIcon("Thor/201.PNG");
					Image w201 = im201.getImage();
					g.drawImage(w201, 0, 0, 500, 500, this);
					break;

				case 202:
					ImageIcon im202 = new ImageIcon("Thor/202.PNG");
					Image w202 = im202.getImage();
					g.drawImage(w202, 0, 0, 500, 500, this);
					break;

				case 203:
					ImageIcon im203 = new ImageIcon("Thor/203.PNG");
					Image w203 = im203.getImage();
					g.drawImage(w203, 0, 0, 500, 500, this);
					break;

				case 204:
					ImageIcon im204 = new ImageIcon("Thor/204.PNG");
					Image w204 = im204.getImage();
					g.drawImage(w204, 0, 0, 500, 500, this);
					break;

				case 205:
					ImageIcon im205 = new ImageIcon("Thor/205.PNG");
					Image w205 = im205.getImage();
					g.drawImage(w205, 0, 0, 500, 500, this);
					break;

				case 206:
					ImageIcon im206 = new ImageIcon("Thor/206.PNG");
					Image w206 = im206.getImage();
					g.drawImage(w206, 0, 0, 500, 500, this);
					break;

				case 207:
					ImageIcon im207 = new ImageIcon("Thor/207.PNG");
					Image w207 = im207.getImage();
					g.drawImage(w207, 0, 0, 500, 500, this);
					break;

				case 208:
					ImageIcon im208 = new ImageIcon("Thor/208.PNG");
					Image w208 = im208.getImage();
					g.drawImage(w208, 0, 0, 500, 500, this);
					break;

				case 209:
					ImageIcon im209 = new ImageIcon("Thor/209.PNG");
					Image w209 = im209.getImage();
					g.drawImage(w209, 0, 0, 500, 500, this);
					break;

				case 210:
					ImageIcon im210 = new ImageIcon("Thor/210.PNG");
					Image w210 = im210.getImage();
					g.drawImage(w210, 0, 0, 500, 500, this);
					break;

				case 211:
					ImageIcon im211 = new ImageIcon("Thor/211.PNG");
					Image w211 = im211.getImage();
					g.drawImage(w211, 0, 0, 500, 500, this);
					break;

				case 212:
					ImageIcon im212 = new ImageIcon("Thor/212.PNG");
					Image w212 = im212.getImage();
					g.drawImage(w212, 0, 0, 500, 500, this);
					break;

				case 213:
					ImageIcon im213 = new ImageIcon("Thor/213.PNG");
					Image w213 = im213.getImage();
					g.drawImage(w213, 0, 0, 500, 500, this);
					break;

				case 214:
					ImageIcon im214 = new ImageIcon("Thor/214.PNG");
					Image w214 = im214.getImage();
					g.drawImage(w214, 0, 0, 500, 500, this);
					break;

				case 215:
					ImageIcon im215 = new ImageIcon("Thor/215.PNG");
					Image w215 = im215.getImage();
					g.drawImage(w215, 0, 0, 500, 500, this);
					break;

				case 216:
					ImageIcon im216 = new ImageIcon("Thor/216.PNG");
					Image w216 = im216.getImage();
					g.drawImage(w216, 0, 0, 500, 500, this);
					break;

				case 217:
					ImageIcon im217 = new ImageIcon("Thor/217.PNG");
					Image w217 = im217.getImage();
					g.drawImage(w217, 0, 0, 500, 500, this);
					break;

				case 218:
					ImageIcon im218 = new ImageIcon("Thor/218.PNG");
					Image w218 = im218.getImage();
					g.drawImage(w218, 0, 0, 500, 500, this);
					break;

				case 219:
					ImageIcon im219 = new ImageIcon("Thor/219.PNG");
					Image w219 = im219.getImage();
					g.drawImage(w219, 0, 0, 500, 500, this);
					break;

				case 220:
					ImageIcon im220 = new ImageIcon("Thor/220.PNG");
					Image w220 = im220.getImage();
					g.drawImage(w220, 0, 0, 500, 500, this);
					break;

				case 221:
					ImageIcon im221 = new ImageIcon("Thor/221.PNG");
					Image w221 = im221.getImage();
					g.drawImage(w221, 0, 0, 500, 500, this);
					break;

				case 222:
					ImageIcon im222 = new ImageIcon("Thor/222.PNG");
					Image w222 = im222.getImage();
					g.drawImage(w222, 0, 0, 500, 500, this);
					break;

				case 223:
					ImageIcon im223 = new ImageIcon("Thor/223.PNG");
					Image w223 = im223.getImage();
					g.drawImage(w223, 0, 0, 500, 500, this);
					break;

				case 224:
					ImageIcon im224 = new ImageIcon("Thor/224.PNG");
					Image w224 = im224.getImage();
					g.drawImage(w224, 0, 0, 500, 500, this);
					break;

				case 225:
					ImageIcon im225 = new ImageIcon("Thor/225.PNG");
					Image w225 = im225.getImage();
					g.drawImage(w225, 0, 0, 500, 500, this);
					break;

				case 226:
					ImageIcon im226 = new ImageIcon("Thor/226.PNG");
					Image w226 = im226.getImage();
					g.drawImage(w226, 0, 0, 500, 500, this);
					break;

				case 227:
					ImageIcon im227 = new ImageIcon("Thor/227.PNG");
					Image w227 = im227.getImage();
					g.drawImage(w227, 0, 0, 500, 500, this);
					break;

				case 228:
					ImageIcon im228 = new ImageIcon("Thor/228.PNG");
					Image w228 = im228.getImage();
					g.drawImage(w228, 0, 0, 500, 500, this);
					break;

				case 229:
					ImageIcon im229 = new ImageIcon("Thor/229.PNG");
					Image w229 = im229.getImage();
					g.drawImage(w229, 0, 0, 500, 500, this);
					break;

				case 230:
					ImageIcon im230 = new ImageIcon("Thor/230.PNG");
					Image w230 = im230.getImage();
					g.drawImage(w230, 0, 0, 500, 500, this);
					break;

				case 231:
					ImageIcon im231 = new ImageIcon("Thor/231.PNG");
					Image w231 = im231.getImage();
					g.drawImage(w231, 0, 0, 500, 500, this);
					break;

				case 232:
					ImageIcon im232 = new ImageIcon("Thor/232.PNG");
					Image w232 = im232.getImage();
					g.drawImage(w232, 0, 0, 500, 500, this);
					break;

				case 233:
					ImageIcon im233 = new ImageIcon("Thor/233.PNG");
					Image w233 = im233.getImage();
					g.drawImage(w233, 0, 0, 500, 500, this);
					break;

				case 234:
					ImageIcon im234 = new ImageIcon("Thor/234.PNG");
					Image w234 = im234.getImage();
					g.drawImage(w234, 0, 0, 500, 500, this);
					break;

				case 235:
					ImageIcon im235 = new ImageIcon("Thor/235.PNG");
					Image w235 = im235.getImage();
					g.drawImage(w235, 0, 0, 500, 500, this);
					break;

				case 236:
					ImageIcon im236 = new ImageIcon("Thor/236.PNG");
					Image w236 = im236.getImage();
					g.drawImage(w236, 0, 0, 500, 500, this);
					break;

				case 237:
					ImageIcon im237 = new ImageIcon("Thor/237.PNG");
					Image w237 = im237.getImage();
					g.drawImage(w237, 0, 0, 500, 500, this);
					break;

				case 238:
					ImageIcon im238 = new ImageIcon("Thor/238.PNG");
					Image w238 = im238.getImage();
					g.drawImage(w238, 0, 0, 500, 500, this);
					break;

				case 239:
					ImageIcon im239 = new ImageIcon("Thor/239.PNG");
					Image w239 = im239.getImage();
					g.drawImage(w239, 0, 0, 500, 500, this);
					break;

				case 240:
					ImageIcon im240 = new ImageIcon("Thor/240.PNG");
					Image w240 = im240.getImage();
					g.drawImage(w240, 0, 0, 500, 500, this);
					break;

				case 241:
					ImageIcon im241 = new ImageIcon("Thor/241.PNG");
					Image w241 = im241.getImage();
					g.drawImage(w241, 0, 0, 500, 500, this);
					break;

				case 242:
					ImageIcon im242 = new ImageIcon("Thor/242.PNG");
					Image w242 = im242.getImage();
					g.drawImage(w242, 0, 0, 500, 500, this);
					break;

				case 243:
					ImageIcon im243 = new ImageIcon("Thor/243.PNG");
					Image w243 = im243.getImage();
					g.drawImage(w243, 0, 0, 500, 500, this);
					break;

				case 244:
					ImageIcon im244 = new ImageIcon("Thor/244.PNG");
					Image w244 = im244.getImage();
					g.drawImage(w244, 0, 0, 500, 500, this);
					break;

				case 245:
					ImageIcon im245 = new ImageIcon("Thor/245.PNG");
					Image w245 = im245.getImage();
					g.drawImage(w245, 0, 0, 500, 500, this);
					break;

				case 246:
					ImageIcon im246 = new ImageIcon("Thor/246.PNG");
					Image w246 = im246.getImage();
					g.drawImage(w246, 0, 0, 500, 500, this);
					break;

				case 247:
					ImageIcon im247 = new ImageIcon("Thor/247.PNG");
					Image w247 = im247.getImage();
					g.drawImage(w247, 0, 0, 500, 500, this);
					break;

				case 248:
					ImageIcon im248 = new ImageIcon("Thor/248.PNG");
					Image w248 = im248.getImage();
					g.drawImage(w248, 0, 0, 500, 500, this);
					break;

				case 249:
					ImageIcon im249 = new ImageIcon("Thor/249.PNG");
					Image w249 = im249.getImage();
					g.drawImage(w249, 0, 0, 500, 500, this);
					break;

				case 250:
					ImageIcon im250 = new ImageIcon("Thor/250.PNG");
					Image w250 = im250.getImage();
					g.drawImage(w250, 0, 0, 500, 500, this);
					break;

				case 251:
					ImageIcon im251 = new ImageIcon("Thor/251.PNG");
					Image w251 = im251.getImage();
					g.drawImage(w251, 0, 0, 500, 500, this);
					break;

				case 252:
					ImageIcon im252 = new ImageIcon("Thor/252.PNG");
					Image w252 = im252.getImage();
					g.drawImage(w252, 0, 0, 500, 500, this);
					break;

				case 253:
					ImageIcon im253 = new ImageIcon("Thor/253.PNG");
					Image w253 = im253.getImage();
					g.drawImage(w253, 0, 0, 500, 500, this);
					break;

				case 254:
					ImageIcon im254 = new ImageIcon("Thor/254.PNG");
					Image w254 = im254.getImage();
					g.drawImage(w254, 0, 0, 500, 500, this);
					break;

				case 255:
					ImageIcon im255 = new ImageIcon("Thor/255.PNG");
					Image w255 = im255.getImage();
					g.drawImage(w255, 0, 0, 500, 500, this);
					break;

				case 256:
					ImageIcon im256 = new ImageIcon("Thor/256.PNG");
					Image w256 = im256.getImage();
					g.drawImage(w256, 0, 0, 500, 500, this);
					break;

				case 257:
					ImageIcon im257 = new ImageIcon("Thor/257.PNG");
					Image w257 = im257.getImage();
					g.drawImage(w257, 0, 0, 500, 500, this);
					break;

				case 258:
					ImageIcon im258 = new ImageIcon("Thor/258.PNG");
					Image w258 = im258.getImage();
					g.drawImage(w258, 0, 0, 500, 500, this);
					break;

				case 259:
					ImageIcon im259 = new ImageIcon("Thor/259.PNG");
					Image w259 = im259.getImage();
					g.drawImage(w259, 0, 0, 500, 500, this);
					break;

				case 260:
					ImageIcon im260 = new ImageIcon("Thor/260.PNG");
					Image w260 = im260.getImage();
					g.drawImage(w260, 0, 0, 500, 500, this);
					break;

				case 261:
					ImageIcon im261 = new ImageIcon("Thor/261.PNG");
					Image w261 = im261.getImage();
					g.drawImage(w261, 0, 0, 500, 500, this);
					break;

				case 262:
					ImageIcon im262 = new ImageIcon("Thor/262.PNG");
					Image w262 = im262.getImage();
					g.drawImage(w262, 0, 0, 500, 500, this);
					break;

				case 263:
					ImageIcon im263 = new ImageIcon("Thor/263.PNG");
					Image w263 = im263.getImage();
					g.drawImage(w263, 0, 0, 500, 500, this);
					break;

				case 264:
					ImageIcon im264 = new ImageIcon("Thor/264.PNG");
					Image w264 = im264.getImage();
					g.drawImage(w264, 0, 0, 500, 500, this);
					break;

				case 265:
					ImageIcon im265 = new ImageIcon("Thor/265.PNG");
					Image w265 = im265.getImage();
					g.drawImage(w265, 0, 0, 500, 500, this);
					break;

				case 266:
					ImageIcon im266 = new ImageIcon("Thor/266.PNG");
					Image w266 = im266.getImage();
					g.drawImage(w266, 0, 0, 500, 500, this);
					break;

				case 267:
					ImageIcon im267 = new ImageIcon("Thor/267.PNG");
					Image w267 = im267.getImage();
					g.drawImage(w267, 0, 0, 500, 500, this);
					break;

				case 268:
					ImageIcon im268 = new ImageIcon("Thor/268.PNG");
					Image w268 = im268.getImage();
					g.drawImage(w268, 0, 0, 500, 500, this);
					break;

				case 269:
					ImageIcon im269 = new ImageIcon("Thor/269.PNG");
					Image w269 = im269.getImage();
					g.drawImage(w269, 0, 0, 500, 500, this);
					break;

				case 270:
					ImageIcon im270 = new ImageIcon("Thor/270.PNG");
					Image w270 = im270.getImage();
					g.drawImage(w270, 0, 0, 500, 500, this);
					break;

				case 271:
					ImageIcon im271 = new ImageIcon("Thor/271.PNG");
					Image w271 = im271.getImage();
					g.drawImage(w271, 0, 0, 500, 500, this);
					break;

				case 272:
					ImageIcon im272 = new ImageIcon("Thor/272.PNG");
					Image w272 = im272.getImage();
					g.drawImage(w272, 0, 0, 500, 500, this);
					break;

				case 273:
					ImageIcon im273 = new ImageIcon("Thor/273.PNG");
					Image w273 = im273.getImage();
					g.drawImage(w273, 0, 0, 500, 500, this);
					break;

				case 274:
					ImageIcon im274 = new ImageIcon("Thor/274.PNG");
					Image w274 = im274.getImage();
					g.drawImage(w274, 0, 0, 500, 500, this);
					break;

				case 275:
					ImageIcon im275 = new ImageIcon("Thor/275.PNG");
					Image w275 = im275.getImage();
					g.drawImage(w275, 0, 0, 500, 500, this);
					break;

				case 276:
					ImageIcon im276 = new ImageIcon("Thor/276.PNG");
					Image w276 = im276.getImage();
					g.drawImage(w276, 0, 0, 500, 500, this);
					break;

				case 277:
					ImageIcon im277 = new ImageIcon("Thor/277.PNG");
					Image w277 = im277.getImage();
					g.drawImage(w277, 0, 0, 500, 500, this);
					break;

				case 278:
					ImageIcon im278 = new ImageIcon("Thor/278.PNG");
					Image w278 = im278.getImage();
					g.drawImage(w278, 0, 0, 500, 500, this);
					break;

				case 279:
					ImageIcon im279 = new ImageIcon("Thor/279.PNG");
					Image w279 = im279.getImage();
					g.drawImage(w279, 0, 0, 500, 500, this);
					break;

				case 280:
					ImageIcon im280 = new ImageIcon("Thor/280.PNG");
					Image w280 = im280.getImage();
					g.drawImage(w280, 0, 0, 500, 500, this);
					break;

				case 281:
					ImageIcon im281 = new ImageIcon("Thor/281.PNG");
					Image w281 = im281.getImage();
					g.drawImage(w281, 0, 0, 500, 500, this);
					break;

				case 282:
					ImageIcon im282 = new ImageIcon("Thor/282.PNG");
					Image w282 = im282.getImage();
					g.drawImage(w282, 0, 0, 500, 500, this);
					break;

				case 283:
					ImageIcon im283 = new ImageIcon("Thor/283.PNG");
					Image w283 = im283.getImage();
					g.drawImage(w283, 0, 0, 500, 500, this);
					break;

				case 284:
					ImageIcon im284 = new ImageIcon("Thor/284.PNG");
					Image w284 = im284.getImage();
					g.drawImage(w284, 0, 0, 500, 500, this);
					break;

				case 285:
					ImageIcon im285 = new ImageIcon("Thor/285.PNG");
					Image w285 = im285.getImage();
					g.drawImage(w285, 0, 0, 500, 500, this);
					break;

				case 286:
					ImageIcon im286 = new ImageIcon("Thor/286.PNG");
					Image w286 = im286.getImage();
					g.drawImage(w286, 0, 0, 500, 500, this);
					break;

				case 287:
					ImageIcon im287 = new ImageIcon("Thor/287.PNG");
					Image w287 = im287.getImage();
					g.drawImage(w287, 0, 0, 500, 500, this);
					break;

				case 288:
					ImageIcon im288 = new ImageIcon("Thor/288.PNG");
					Image w288 = im288.getImage();
					g.drawImage(w288, 0, 0, 500, 500, this);
					break;

				case 289:
					ImageIcon im289 = new ImageIcon("Thor/289.PNG");
					Image w289 = im289.getImage();
					g.drawImage(w289, 0, 0, 500, 500, this);
					break;

				case 290:
					ImageIcon im290 = new ImageIcon("Thor/290.PNG");
					Image w290 = im290.getImage();
					g.drawImage(w290, 0, 0, 500, 500, this);
					break;

				case 291:
					ImageIcon im291 = new ImageIcon("Thor/291.PNG");
					Image w291 = im291.getImage();
					g.drawImage(w291, 0, 0, 500, 500, this);
					break;

				case 292:
					ImageIcon im292 = new ImageIcon("Thor/292.PNG");
					Image w292 = im292.getImage();
					g.drawImage(w292, 0, 0, 500, 500, this);
					break;

				case 293:
					ImageIcon im293 = new ImageIcon("Thor/293.PNG");
					Image w293 = im293.getImage();
					g.drawImage(w293, 0, 0, 500, 500, this);
					break;

				case 294:
					ImageIcon im294 = new ImageIcon("Thor/294.PNG");
					Image w294 = im294.getImage();
					g.drawImage(w294, 0, 0, 500, 500, this);
					break;

				case 295:
					ImageIcon im295 = new ImageIcon("Thor/295.PNG");
					Image w295 = im295.getImage();
					g.drawImage(w295, 0, 0, 500, 500, this);
					break;

				case 296:
					ImageIcon im296 = new ImageIcon("Thor/296.PNG");
					Image w296 = im296.getImage();
					g.drawImage(w296, 0, 0, 500, 500, this);
					break;

				case 297:
					ImageIcon im297 = new ImageIcon("Thor/297.PNG");
					Image w297 = im297.getImage();
					g.drawImage(w297, 0, 0, 500, 500, this);
					break;

				case 298:
					ImageIcon im298 = new ImageIcon("Thor/298.PNG");
					Image w298 = im298.getImage();
					g.drawImage(w298, 0, 0, 500, 500, this);
					break;

				case 299:
					ImageIcon im299 = new ImageIcon("Thor/299.PNG");
					Image w299 = im299.getImage();
					g.drawImage(w299, 0, 0, 500, 500, this);
					break;

				case 300:
					ImageIcon im300 = new ImageIcon("Thor/300.PNG");
					Image w300 = im300.getImage();
					g.drawImage(w300, 0, 0, 500, 500, this);
					break;

				case 301:
					ImageIcon im301 = new ImageIcon("Thor/301.PNG");
					Image w301 = im301.getImage();
					g.drawImage(w301, 0, 0, 500, 500, this);
					break;

				case 302:
					ImageIcon im302 = new ImageIcon("Thor/302.PNG");
					Image w302 = im302.getImage();
					g.drawImage(w302, 0, 0, 500, 500, this);
					break;

				case 303:
					ImageIcon im303 = new ImageIcon("Thor/303.PNG");
					Image w303 = im303.getImage();
					g.drawImage(w303, 0, 0, 500, 500, this);
					break;

				case 304:
					ImageIcon im304 = new ImageIcon("Thor/304.PNG");
					Image w304 = im304.getImage();
					g.drawImage(w304, 0, 0, 500, 500, this);
					break;

				case 305:
					ImageIcon im305 = new ImageIcon("Thor/305.PNG");
					Image w305 = im305.getImage();
					g.drawImage(w305, 0, 0, 500, 500, this);
					break;

				case 306:
					ImageIcon im306 = new ImageIcon("Thor/306.PNG");
					Image w306 = im306.getImage();
					g.drawImage(w306, 0, 0, 500, 500, this);
					break;

				case 307:
					ImageIcon im307 = new ImageIcon("Thor/307.PNG");
					Image w307 = im307.getImage();
					g.drawImage(w307, 0, 0, 500, 500, this);
					break;

				case 308:
					ImageIcon im308 = new ImageIcon("Thor/308.PNG");
					Image w308 = im308.getImage();
					g.drawImage(w308, 0, 0, 500, 500, this);
					break;

				case 309:
					ImageIcon im309 = new ImageIcon("Thor/309.PNG");
					Image w309 = im309.getImage();
					g.drawImage(w309, 0, 0, 500, 500, this);
					break;

				case 310:
					ImageIcon im310 = new ImageIcon("Thor/310.PNG");
					Image w310 = im310.getImage();
					g.drawImage(w310, 0, 0, 500, 500, this);
					break;

				case 311:
					ImageIcon im311 = new ImageIcon("Thor/311.PNG");
					Image w311 = im311.getImage();
					g.drawImage(w311, 0, 0, 500, 500, this);
					break;

				case 312:
					ImageIcon im312 = new ImageIcon("Thor/312.PNG");
					Image w312 = im312.getImage();
					g.drawImage(w312, 0, 0, 500, 500, this);
					break;

				case 313:
					ImageIcon im313 = new ImageIcon("Thor/313.PNG");
					Image w313 = im313.getImage();
					g.drawImage(w313, 0, 0, 500, 500, this);
					break;

				case 314:
					ImageIcon im314 = new ImageIcon("Thor/314.PNG");
					Image w314 = im314.getImage();
					g.drawImage(w314, 0, 0, 500, 500, this);
					break;

				case 315:
					ImageIcon im315 = new ImageIcon("Thor/315.PNG");
					Image w315 = im315.getImage();
					g.drawImage(w315, 0, 0, 500, 500, this);
					break;

				case 316:
					ImageIcon im316 = new ImageIcon("Thor/316.PNG");
					Image w316 = im316.getImage();
					g.drawImage(w316, 0, 0, 500, 500, this);
					break;

				case 317:
					ImageIcon im317 = new ImageIcon("Thor/317.PNG");
					Image w317 = im317.getImage();
					g.drawImage(w317, 0, 0, 500, 500, this);
					break;

				case 318:
					ImageIcon im318 = new ImageIcon("Thor/318.PNG");
					Image w318 = im318.getImage();
					g.drawImage(w318, 0, 0, 500, 500, this);
					break;

				case 319:
					ImageIcon im319 = new ImageIcon("Thor/319.PNG");
					Image w319 = im319.getImage();
					g.drawImage(w319, 0, 0, 500, 500, this);
					break;

				case 320:
					ImageIcon im320 = new ImageIcon("Thor/320.PNG");
					Image w320 = im320.getImage();
					g.drawImage(w320, 0, 0, 500, 500, this);
					break;

				case 321:
					ImageIcon im321 = new ImageIcon("Thor/321.PNG");
					Image w321 = im321.getImage();
					g.drawImage(w321, 0, 0, 500, 500, this);
					break;

				case 322:
					ImageIcon im322 = new ImageIcon("Thor/322.PNG");
					Image w322 = im322.getImage();
					g.drawImage(w322, 0, 0, 500, 500, this);
					break;

				case 323:
					ImageIcon im323 = new ImageIcon("Thor/323.PNG");
					Image w323 = im323.getImage();
					g.drawImage(w323, 0, 0, 500, 500, this);
					break;

				case 324:
					ImageIcon im324 = new ImageIcon("Thor/324.PNG");
					Image w324 = im324.getImage();
					g.drawImage(w324, 0, 0, 500, 500, this);
					break;

				case 325:
					ImageIcon im325 = new ImageIcon("Thor/325.PNG");
					Image w325 = im325.getImage();
					g.drawImage(w325, 0, 0, 500, 500, this);
					break;

				case 326:
					ImageIcon im326 = new ImageIcon("Thor/326.PNG");
					Image w326 = im326.getImage();
					g.drawImage(w326, 0, 0, 500, 500, this);
					break;

				case 327:
					ImageIcon im327 = new ImageIcon("Thor/327.PNG");
					Image w327 = im327.getImage();
					g.drawImage(w327, 0, 0, 500, 500, this);
					break;

				case 328:
					ImageIcon im328 = new ImageIcon("Thor/328.PNG");
					Image w328 = im328.getImage();
					g.drawImage(w328, 0, 0, 500, 500, this);
					break;

				case 329:
					ImageIcon im329 = new ImageIcon("Thor/329.PNG");
					Image w329 = im329.getImage();
					g.drawImage(w329, 0, 0, 500, 500, this);
					break;

				case 330:
					ImageIcon im330 = new ImageIcon("Thor/330.PNG");
					Image w330 = im330.getImage();
					g.drawImage(w330, 0, 0, 500, 500, this);
					break;

				case 331:
					ImageIcon im331 = new ImageIcon("Thor/331.PNG");
					Image w331 = im331.getImage();
					g.drawImage(w331, 0, 0, 500, 500, this);
					break;

				case 332:
					ImageIcon im332 = new ImageIcon("Thor/332.PNG");
					Image w332 = im332.getImage();
					g.drawImage(w332, 0, 0, 500, 500, this);
					break;

				case 333:
					ImageIcon im333 = new ImageIcon("Thor/333.PNG");
					Image w333 = im333.getImage();
					g.drawImage(w333, 0, 0, 500, 500, this);
					break;

				case 334:
					ImageIcon im334 = new ImageIcon("Thor/334.PNG");
					Image w334 = im334.getImage();
					g.drawImage(w334, 0, 0, 500, 500, this);
					break;

				case 335:
					ImageIcon im335 = new ImageIcon("Thor/335.PNG");
					Image w335 = im335.getImage();
					g.drawImage(w335, 0, 0, 500, 500, this);
					break;

				case 336:
					ImageIcon im336 = new ImageIcon("Thor/336.PNG");
					Image w336 = im336.getImage();
					g.drawImage(w336, 0, 0, 500, 500, this);
					break;

				case 337:
					ImageIcon im337 = new ImageIcon("Thor/337.PNG");
					Image w337 = im337.getImage();
					g.drawImage(w337, 0, 0, 500, 500, this);
					break;

				case 338:
					ImageIcon im338 = new ImageIcon("Thor/338.PNG");
					Image w338 = im338.getImage();
					g.drawImage(w338, 0, 0, 500, 500, this);
					break;

				case 339:
					ImageIcon im339 = new ImageIcon("Thor/339.PNG");
					Image w339 = im339.getImage();
					g.drawImage(w339, 0, 0, 500, 500, this);
					break;

				case 340:
					ImageIcon im340 = new ImageIcon("Thor/340.PNG");
					Image w340 = im340.getImage();
					g.drawImage(w340, 0, 0, 500, 500, this);
					break;

				case 341:
					ImageIcon im341 = new ImageIcon("Thor/341.PNG");
					Image w341 = im341.getImage();
					g.drawImage(w341, 0, 0, 500, 500, this);
					break;

				case 342:
					ImageIcon im342 = new ImageIcon("Thor/342.PNG");
					Image w342 = im342.getImage();
					g.drawImage(w342, 0, 0, 500, 500, this);
					break;

				case 343:
					ImageIcon im343 = new ImageIcon("Thor/343.PNG");
					Image w343 = im343.getImage();
					g.drawImage(w343, 0, 0, 500, 500, this);
					break;

				case 344:
					ImageIcon im344 = new ImageIcon("Thor/344.PNG");
					Image w344 = im344.getImage();
					g.drawImage(w344, 0, 0, 500, 500, this);
					break;

				case 345:
					ImageIcon im345 = new ImageIcon("Thor/345.PNG");
					Image w345 = im345.getImage();
					g.drawImage(w345, 0, 0, 500, 500, this);
					break;

				case 346:
					ImageIcon im346 = new ImageIcon("Thor/346.PNG");
					Image w346 = im346.getImage();
					g.drawImage(w346, 0, 0, 500, 500, this);
					break;

				case 347:
					ImageIcon im347 = new ImageIcon("Thor/347.PNG");
					Image w347 = im347.getImage();
					g.drawImage(w347, 0, 0, 500, 500, this);
					break;

				case 348:
					ImageIcon im348 = new ImageIcon("Thor/348.PNG");
					Image w348 = im348.getImage();
					g.drawImage(w348, 0, 0, 500, 500, this);
					break;

				case 349:
					ImageIcon im349 = new ImageIcon("Thor/349.PNG");
					Image w349 = im349.getImage();
					g.drawImage(w349, 0, 0, 500, 500, this);
					break;

				case 350:
					ImageIcon im350 = new ImageIcon("Thor/350.PNG");
					Image w350 = im350.getImage();
					g.drawImage(w350, 0, 0, 500, 500, this);
					break;

				case 351:
					ImageIcon im351 = new ImageIcon("Thor/351.PNG");
					Image w351 = im351.getImage();
					g.drawImage(w351, 0, 0, 500, 500, this);
					break;

				case 352:
					ImageIcon im352 = new ImageIcon("Thor/352.PNG");
					Image w352 = im352.getImage();
					g.drawImage(w352, 0, 0, 500, 500, this);
					break;

				case 353:
					ImageIcon im353 = new ImageIcon("Thor/353.PNG");
					Image w353 = im353.getImage();
					g.drawImage(w353, 0, 0, 500, 500, this);
					break;

				case 354:
					ImageIcon im354 = new ImageIcon("Thor/354.PNG");
					Image w354 = im354.getImage();
					g.drawImage(w354, 0, 0, 500, 500, this);
					break;

				case 355:
					ImageIcon im355 = new ImageIcon("Thor/355.PNG");
					Image w355 = im355.getImage();
					g.drawImage(w355, 0, 0, 500, 500, this);
					break;

				case 356:
					ImageIcon im356 = new ImageIcon("Thor/356.PNG");
					Image w356 = im356.getImage();
					g.drawImage(w356, 0, 0, 500, 500, this);
					break;

				case 357:
					ImageIcon im357 = new ImageIcon("Thor/357.PNG");
					Image w357 = im357.getImage();
					g.drawImage(w357, 0, 0, 500, 500, this);
					break;

				case 358:
					ImageIcon im358 = new ImageIcon("Thor/358.PNG");
					Image w358 = im358.getImage();
					g.drawImage(w358, 0, 0, 500, 500, this);
					break;

				case 359:
					ImageIcon im359 = new ImageIcon("Thor/359.PNG");
					Image w359 = im359.getImage();
					g.drawImage(w359, 0, 0, 500, 500, this);
					break;

				case 360:
					ImageIcon im360 = new ImageIcon("Thor/360.PNG");
					Image w360 = im360.getImage();
					g.drawImage(w360, 0, 0, 500, 500, this);
					break;

				case 361:
					ImageIcon im361 = new ImageIcon("Thor/361.PNG");
					Image w361 = im361.getImage();
					g.drawImage(w361, 0, 0, 500, 500, this);
					break;

				case 362:
					ImageIcon im362 = new ImageIcon("Thor/362.PNG");
					Image w362 = im362.getImage();
					g.drawImage(w362, 0, 0, 500, 500, this);
					break;

				}
			}
			if (PAVEL) {
				switch (avancem[26]) {
				case 1:
					ImageIcon im1 = new ImageIcon("DragonCloud/049-0/001.PNG");
					Image w1 = im1.getImage();
					g.drawImage(w1, 0, 0, 500, 500, this);
					break;

				case 2:
					ImageIcon im2 = new ImageIcon("DragonCloud/049-0/002.PNG");
					Image w2 = im2.getImage();
					g.drawImage(w2, 0, 0, 500, 500, this);
					break;

				case 3:
					ImageIcon im3 = new ImageIcon("DragonCloud/049-0/003.PNG");
					Image w3 = im3.getImage();
					g.drawImage(w3, 0, 0, 500, 500, this);
					break;

				case 4:
					ImageIcon im4 = new ImageIcon("DragonCloud/049-0/004.PNG");
					Image w4 = im4.getImage();
					g.drawImage(w4, 0, 0, 500, 500, this);
					break;

				case 5:
					ImageIcon im5 = new ImageIcon("DragonCloud/049-0/005.PNG");
					Image w5 = im5.getImage();
					g.drawImage(w5, 0, 0, 500, 500, this);
					break;

				case 6:
					ImageIcon im6 = new ImageIcon("DragonCloud/049-0/006.PNG");
					Image w6 = im6.getImage();
					g.drawImage(w6, 0, 0, 500, 500, this);
					break;

				case 7:
					ImageIcon im7 = new ImageIcon("DragonCloud/049-0/007.PNG");
					Image w7 = im7.getImage();
					g.drawImage(w7, 0, 0, 500, 500, this);
					break;

				case 8:
					ImageIcon im8 = new ImageIcon("DragonCloud/049-0/008.PNG");
					Image w8 = im8.getImage();
					g.drawImage(w8, 0, 0, 500, 500, this);
					break;

				case 9:
					ImageIcon im9 = new ImageIcon("DragonCloud/049-0/009.PNG");
					Image w9 = im9.getImage();
					g.drawImage(w9, 0, 0, 500, 500, this);
					break;

				case 10:
					ImageIcon im10 = new ImageIcon("DragonCloud/049-0/010.PNG");
					Image w10 = im10.getImage();
					g.drawImage(w10, 0, 0, 500, 500, this);
					break;

				case 11:
					ImageIcon im11 = new ImageIcon("DragonCloud/049-0/011.PNG");
					Image w11 = im11.getImage();
					g.drawImage(w11, 0, 0, 500, 500, this);
					break;

				case 12:
					ImageIcon im12 = new ImageIcon("DragonCloud/049-0/012.PNG");
					Image w12 = im12.getImage();
					g.drawImage(w12, 0, 0, 500, 500, this);
					break;

				case 13:
					ImageIcon im13 = new ImageIcon("DragonCloud/049-0/013.PNG");
					Image w13 = im13.getImage();
					g.drawImage(w13, 0, 0, 500, 500, this);
					break;

				case 14:
					ImageIcon im14 = new ImageIcon("DragonCloud/049-0/014.PNG");
					Image w14 = im14.getImage();
					g.drawImage(w14, 0, 0, 500, 500, this);
					break;

				case 15:
					ImageIcon im15 = new ImageIcon("DragonCloud/049-0/015.PNG");
					Image w15 = im15.getImage();
					g.drawImage(w15, 0, 0, 500, 500, this);
					break;

				case 16:
					ImageIcon im16 = new ImageIcon("DragonCloud/049-0/016.PNG");
					Image w16 = im16.getImage();
					g.drawImage(w16, 0, 0, 500, 500, this);
					break;

				case 17:
					ImageIcon im17 = new ImageIcon("DragonCloud/049-0/017.PNG");
					Image w17 = im17.getImage();
					g.drawImage(w17, 0, 0, 500, 500, this);
					break;

				case 18:
					ImageIcon im18 = new ImageIcon("DragonCloud/049-0/018.PNG");
					Image w18 = im18.getImage();
					g.drawImage(w18, 0, 0, 500, 500, this);
					break;

				case 19:
					ImageIcon im19 = new ImageIcon("DragonCloud/049-0/019.PNG");
					Image w19 = im19.getImage();
					g.drawImage(w19, 0, 0, 500, 500, this);
					break;

				case 20:
					ImageIcon im20 = new ImageIcon("DragonCloud/049-0/020.PNG");
					Image w20 = im20.getImage();
					g.drawImage(w20, 0, 0, 500, 500, this);
					break;

				case 21:
					ImageIcon im21 = new ImageIcon("DragonCloud/049-0/021.PNG");
					Image w21 = im21.getImage();
					g.drawImage(w21, 0, 0, 500, 500, this);
					break;

				case 22:
					ImageIcon im22 = new ImageIcon("DragonCloud/049-0/022.PNG");
					Image w22 = im22.getImage();
					g.drawImage(w22, 0, 0, 500, 500, this);
					break;

				case 23:
					ImageIcon im23 = new ImageIcon("DragonCloud/049-0/023.PNG");
					Image w23 = im23.getImage();
					g.drawImage(w23, 0, 0, 500, 500, this);
					break;

				case 24:
					ImageIcon im24 = new ImageIcon("DragonCloud/049-0/024.PNG");
					Image w24 = im24.getImage();
					g.drawImage(w24, 0, 0, 500, 500, this);
					break;

				case 25:
					ImageIcon im25 = new ImageIcon("DragonCloud/049-0/025.PNG");
					Image w25 = im25.getImage();
					g.drawImage(w25, 0, 0, 500, 500, this);
					break;

				case 26:
					ImageIcon im26 = new ImageIcon("DragonCloud/049-0/026.PNG");
					Image w26 = im26.getImage();
					g.drawImage(w26, 0, 0, 500, 500, this);
					break;

				case 27:
					ImageIcon im27 = new ImageIcon("DragonCloud/049-0/027.PNG");
					Image w27 = im27.getImage();
					g.drawImage(w27, 0, 0, 500, 500, this);
					break;

				case 28:
					ImageIcon im28 = new ImageIcon("DragonCloud/049-0/028.PNG");
					Image w28 = im28.getImage();
					g.drawImage(w28, 0, 0, 500, 500, this);
					break;

				case 29:
					ImageIcon im29 = new ImageIcon("DragonCloud/049-0/029.PNG");
					Image w29 = im29.getImage();
					g.drawImage(w29, 0, 0, 500, 500, this);
					break;

				case 30:
					ImageIcon im30 = new ImageIcon("DragonCloud/049-0/030.PNG");
					Image w30 = im30.getImage();
					g.drawImage(w30, 0, 0, 500, 500, this);
					break;

				case 31:
					ImageIcon im31 = new ImageIcon("DragonCloud/049-0/031.PNG");
					Image w31 = im31.getImage();
					g.drawImage(w31, 0, 0, 500, 500, this);
					break;

				case 32:
					ImageIcon im32 = new ImageIcon("DragonCloud/049-0/032.PNG");
					Image w32 = im32.getImage();
					g.drawImage(w32, 0, 0, 500, 500, this);
					break;

				case 33:
					ImageIcon im33 = new ImageIcon("DragonCloud/049-0/033.PNG");
					Image w33 = im33.getImage();
					g.drawImage(w33, 0, 0, 500, 500, this);
					break;

				case 34:
					ImageIcon im34 = new ImageIcon("DragonCloud/049-0/034.PNG");
					Image w34 = im34.getImage();
					g.drawImage(w34, 0, 0, 500, 500, this);
					break;

				case 35:
					ImageIcon im35 = new ImageIcon("DragonCloud/049-0/035.PNG");
					Image w35 = im35.getImage();
					g.drawImage(w35, 0, 0, 500, 500, this);
					break;

				case 36:
					ImageIcon im36 = new ImageIcon("DragonCloud/049-0/036.PNG");
					Image w36 = im36.getImage();
					g.drawImage(w36, 0, 0, 500, 500, this);
					break;

				case 37:
					ImageIcon im37 = new ImageIcon("DragonCloud/049-0/037.PNG");
					Image w37 = im37.getImage();
					g.drawImage(w37, 0, 0, 500, 500, this);
					break;

				case 38:
					ImageIcon im38 = new ImageIcon("DragonCloud/049-0/038.PNG");
					Image w38 = im38.getImage();
					g.drawImage(w38, 0, 0, 500, 500, this);
					break;

				case 39:
					ImageIcon im39 = new ImageIcon("DragonCloud/049-0/039.PNG");
					Image w39 = im39.getImage();
					g.drawImage(w39, 0, 0, 500, 500, this);
					break;

				case 40:
					ImageIcon im40 = new ImageIcon("DragonCloud/049-0/040.PNG");
					Image w40 = im40.getImage();
					g.drawImage(w40, 0, 0, 500, 500, this);
					break;

				case 41:
					ImageIcon im41 = new ImageIcon("DragonCloud/049-0/041.PNG");
					Image w41 = im41.getImage();
					g.drawImage(w41, 0, 0, 500, 500, this);
					break;

				case 42:
					ImageIcon im42 = new ImageIcon("DragonCloud/049-0/042.PNG");
					Image w42 = im42.getImage();
					g.drawImage(w42, 0, 0, 500, 500, this);
					break;

				case 43:
					ImageIcon im43 = new ImageIcon("DragonCloud/049-0/043.PNG");
					Image w43 = im43.getImage();
					g.drawImage(w43, 0, 0, 500, 500, this);
					break;

				case 44:
					ImageIcon im44 = new ImageIcon("DragonCloud/049-0/044.PNG");
					Image w44 = im44.getImage();
					g.drawImage(w44, 0, 0, 500, 500, this);
					break;

				case 45:
					ImageIcon im45 = new ImageIcon("DragonCloud/049-0/045.PNG");
					Image w45 = im45.getImage();
					g.drawImage(w45, 0, 0, 500, 500, this);
					break;

				case 46:
					ImageIcon im46 = new ImageIcon("DragonCloud/049-0/046.PNG");
					Image w46 = im46.getImage();
					g.drawImage(w46, 0, 0, 500, 500, this);
					break;

				case 47:
					ImageIcon im47 = new ImageIcon("DragonCloud/049-0/047.PNG");
					Image w47 = im47.getImage();
					g.drawImage(w47, 0, 0, 500, 500, this);
					break;

				case 48:
					ImageIcon im48 = new ImageIcon("DragonCloud/049-0/048.PNG");
					Image w48 = im48.getImage();
					g.drawImage(w48, 0, 0, 500, 500, this);
					break;

				case 49:
					ImageIcon im49 = new ImageIcon("DragonCloud/049-0/049.PNG");
					Image w49 = im49.getImage();
					g.drawImage(w49, 0, 0, 500, 500, this);
					break;

				case 50:
					ImageIcon im50 = new ImageIcon("DragonCloud/049-0/050.PNG");
					Image w50 = im50.getImage();
					g.drawImage(w50, 0, 0, 500, 500, this);
					break;

				case 51:
					ImageIcon im51 = new ImageIcon("DragonCloud/049-0/051.PNG");
					Image w51 = im51.getImage();
					g.drawImage(w51, 0, 0, 500, 500, this);
					break;

				case 52:
					ImageIcon im52 = new ImageIcon("DragonCloud/049-0/052.PNG");
					Image w52 = im52.getImage();
					g.drawImage(w52, 0, 0, 500, 500, this);
					break;

				case 53:
					ImageIcon im53 = new ImageIcon("DragonCloud/049-0/053.PNG");
					Image w53 = im53.getImage();
					g.drawImage(w53, 0, 0, 500, 500, this);
					break;

				case 54:
					ImageIcon im54 = new ImageIcon("DragonCloud/049-0/054.PNG");
					Image w54 = im54.getImage();
					g.drawImage(w54, 0, 0, 500, 500, this);
					break;

				case 55:
					ImageIcon im55 = new ImageIcon("DragonCloud/049-0/055.PNG");
					Image w55 = im55.getImage();
					g.drawImage(w55, 0, 0, 500, 500, this);
					break;

				case 56:
					ImageIcon im56 = new ImageIcon("DragonCloud/049-0/056.PNG");
					Image w56 = im56.getImage();
					g.drawImage(w56, 0, 0, 500, 500, this);
					break;

				case 57:
					ImageIcon im57 = new ImageIcon("DragonCloud/049-0/057.PNG");
					Image w57 = im57.getImage();
					g.drawImage(w57, 0, 0, 500, 500, this);
					break;

				case 58:
					ImageIcon im58 = new ImageIcon("DragonCloud/049-0/058.PNG");
					Image w58 = im58.getImage();
					g.drawImage(w58, 0, 0, 500, 500, this);
					break;

				case 59:
					ImageIcon im59 = new ImageIcon("DragonCloud/049-0/059.PNG");
					Image w59 = im59.getImage();
					g.drawImage(w59, 0, 0, 500, 500, this);
					break;

				case 60:
					ImageIcon im60 = new ImageIcon("DragonCloud/049-0/060.PNG");
					Image w60 = im60.getImage();
					g.drawImage(w60, 0, 0, 500, 500, this);
					break;

				case 61:
					ImageIcon im61 = new ImageIcon("DragonCloud/049-0/061.PNG");
					Image w61 = im61.getImage();
					g.drawImage(w61, 0, 0, 500, 500, this);
					break;

				case 62:
					ImageIcon im62 = new ImageIcon("DragonCloud/049-0/062.PNG");
					Image w62 = im62.getImage();
					g.drawImage(w62, 0, 0, 500, 500, this);
					break;

				case 63:
					ImageIcon im63 = new ImageIcon("DragonCloud/049-0/063.PNG");
					Image w63 = im63.getImage();
					g.drawImage(w63, 0, 0, 500, 500, this);
					break;

				case 64:
					ImageIcon im64 = new ImageIcon("DragonCloud/049-0/064.PNG");
					Image w64 = im64.getImage();
					g.drawImage(w64, 0, 0, 500, 500, this);
					break;

				case 65:
					ImageIcon im65 = new ImageIcon("DragonCloud/049-0/065.PNG");
					Image w65 = im65.getImage();
					g.drawImage(w65, 0, 0, 500, 500, this);
					break;

				case 66:
					ImageIcon im66 = new ImageIcon("DragonCloud/049-0/066.PNG");
					Image w66 = im66.getImage();
					g.drawImage(w66, 0, 0, 500, 500, this);
					break;

				case 67:
					ImageIcon im67 = new ImageIcon("DragonCloud/049-0/067.PNG");
					Image w67 = im67.getImage();
					g.drawImage(w67, 0, 0, 500, 500, this);
					break;

				case 68:
					ImageIcon im68 = new ImageIcon("DragonCloud/049-0/068.PNG");
					Image w68 = im68.getImage();
					g.drawImage(w68, 0, 0, 500, 500, this);
					break;

				case 69:
					ImageIcon im69 = new ImageIcon("DragonCloud/049-0/069.PNG");
					Image w69 = im69.getImage();
					g.drawImage(w69, 0, 0, 500, 500, this);
					break;

				case 70:
					ImageIcon im70 = new ImageIcon("DragonCloud/049-0/070.PNG");
					Image w70 = im70.getImage();
					g.drawImage(w70, 0, 0, 500, 500, this);
					break;

				case 71:
					ImageIcon im71 = new ImageIcon("DragonCloud/049-0/071.PNG");
					Image w71 = im71.getImage();
					g.drawImage(w71, 0, 0, 500, 500, this);
					break;

				case 72:
					ImageIcon im72 = new ImageIcon("DragonCloud/049-0/072.PNG");
					Image w72 = im72.getImage();
					g.drawImage(w72, 0, 0, 500, 500, this);
					break;

				case 73:
					ImageIcon im73 = new ImageIcon("DragonCloud/049-0/073.PNG");
					Image w73 = im73.getImage();
					g.drawImage(w73, 0, 0, 500, 500, this);
					break;

				case 74:
					ImageIcon im74 = new ImageIcon("DragonCloud/049-0/074.PNG");
					Image w74 = im74.getImage();
					g.drawImage(w74, 0, 0, 500, 500, this);
					break;

				case 75:
					ImageIcon im75 = new ImageIcon("DragonCloud/049-0/075.PNG");
					Image w75 = im75.getImage();
					g.drawImage(w75, 0, 0, 500, 500, this);
					break;

				case 76:
					ImageIcon im76 = new ImageIcon("DragonCloud/049-0/076.PNG");
					Image w76 = im76.getImage();
					g.drawImage(w76, 0, 0, 500, 500, this);
					break;

				case 77:
					ImageIcon im77 = new ImageIcon("DragonCloud/049-0/077.PNG");
					Image w77 = im77.getImage();
					g.drawImage(w77, 0, 0, 500, 500, this);
					break;

				case 78:
					ImageIcon im78 = new ImageIcon("DragonCloud/049-0/078.PNG");
					Image w78 = im78.getImage();
					g.drawImage(w78, 0, 0, 500, 500, this);
					break;

				case 79:
					ImageIcon im79 = new ImageIcon("DragonCloud/049-0/079.PNG");
					Image w79 = im79.getImage();
					g.drawImage(w79, 0, 0, 500, 500, this);
					break;

				case 80:
					ImageIcon im80 = new ImageIcon("DragonCloud/049-0/080.PNG");
					Image w80 = im80.getImage();
					g.drawImage(w80, 0, 0, 500, 500, this);
					break;

				case 81:
					ImageIcon im81 = new ImageIcon("DragonCloud/049-0/081.PNG");
					Image w81 = im81.getImage();
					g.drawImage(w81, 0, 0, 500, 500, this);
					break;

				case 82:
					ImageIcon im82 = new ImageIcon("DragonCloud/049-0/082.PNG");
					Image w82 = im82.getImage();
					g.drawImage(w82, 0, 0, 500, 500, this);
					break;

				case 83:
					ImageIcon im83 = new ImageIcon("DragonCloud/049-0/083.PNG");
					Image w83 = im83.getImage();
					g.drawImage(w83, 0, 0, 500, 500, this);
					break;

				case 84:
					ImageIcon im84 = new ImageIcon("DragonCloud/049-0/084.PNG");
					Image w84 = im84.getImage();
					g.drawImage(w84, 0, 0, 500, 500, this);
					break;

				case 85:
					ImageIcon im85 = new ImageIcon("DragonCloud/049-0/085.PNG");
					Image w85 = im85.getImage();
					g.drawImage(w85, 0, 0, 500, 500, this);
					break;

				case 86:
					ImageIcon im86 = new ImageIcon("DragonCloud/049-0/086.PNG");
					Image w86 = im86.getImage();
					g.drawImage(w86, 0, 0, 500, 500, this);
					break;

				case 87:
					ImageIcon im87 = new ImageIcon("DragonCloud/049-0/087.PNG");
					Image w87 = im87.getImage();
					g.drawImage(w87, 0, 0, 500, 500, this);
					break;

				case 88:
					ImageIcon im88 = new ImageIcon("DragonCloud/049-0/088.PNG");
					Image w88 = im88.getImage();
					g.drawImage(w88, 0, 0, 500, 500, this);
					break;

				case 89:
					ImageIcon im89 = new ImageIcon("DragonCloud/049-0/089.PNG");
					Image w89 = im89.getImage();
					g.drawImage(w89, 0, 0, 500, 500, this);
					break;

				case 90:
					ImageIcon im90 = new ImageIcon("DragonCloud/049-0/090.PNG");
					Image w90 = im90.getImage();
					g.drawImage(w90, 0, 0, 500, 500, this);
					break;

				case 91:
					ImageIcon im91 = new ImageIcon("DragonCloud/049-0/091.PNG");
					Image w91 = im91.getImage();
					g.drawImage(w91, 0, 0, 500, 500, this);
					break;

				case 92:
					ImageIcon im92 = new ImageIcon("DragonCloud/049-0/092.PNG");
					Image w92 = im92.getImage();
					g.drawImage(w92, 0, 0, 500, 500, this);
					break;

				case 93:
					ImageIcon im93 = new ImageIcon("DragonCloud/049-0/093.PNG");
					Image w93 = im93.getImage();
					g.drawImage(w93, 0, 0, 500, 500, this);
					break;

				case 94:
					ImageIcon im94 = new ImageIcon("DragonCloud/049-0/094.PNG");
					Image w94 = im94.getImage();
					g.drawImage(w94, 0, 0, 500, 500, this);
					break;

				case 95:
					ImageIcon im95 = new ImageIcon("DragonCloud/049-0/095.PNG");
					Image w95 = im95.getImage();
					g.drawImage(w95, 0, 0, 500, 500, this);
					break;

				case 96:
					ImageIcon im96 = new ImageIcon("DragonCloud/049-0/096.PNG");
					Image w96 = im96.getImage();
					g.drawImage(w96, 0, 0, 500, 500, this);
					break;

				case 97:
					ImageIcon im97 = new ImageIcon("DragonCloud/049-0/097.PNG");
					Image w97 = im97.getImage();
					g.drawImage(w97, 0, 0, 500, 500, this);
					break;

				case 98:
					ImageIcon im98 = new ImageIcon("DragonCloud/049-0/098.PNG");
					Image w98 = im98.getImage();
					g.drawImage(w98, 0, 0, 500, 500, this);
					break;

				case 99:
					ImageIcon im99 = new ImageIcon("DragonCloud/049-0/099.PNG");
					Image w99 = im99.getImage();
					g.drawImage(w99, 0, 0, 500, 500, this);
					break;

				case 100:
					ImageIcon im100 = new ImageIcon("DragonCloud/049-0/100.PNG");
					Image w100 = im100.getImage();
					g.drawImage(w100, 0, 0, 500, 500, this);
					break;

				case 101:
					ImageIcon im101 = new ImageIcon("DragonCloud/049-0/101.PNG");
					Image w101 = im101.getImage();
					g.drawImage(w101, 0, 0, 500, 500, this);
					break;

				case 102:
					ImageIcon im102 = new ImageIcon("DragonCloud/049-0/102.PNG");
					Image w102 = im102.getImage();
					g.drawImage(w102, 0, 0, 500, 500, this);
					break;

				case 103:
					ImageIcon im103 = new ImageIcon("DragonCloud/049-0/103.PNG");
					Image w103 = im103.getImage();
					g.drawImage(w103, 0, 0, 500, 500, this);
					break;

				case 104:
					ImageIcon im104 = new ImageIcon("DragonCloud/049-0/104.PNG");
					Image w104 = im104.getImage();
					g.drawImage(w104, 0, 0, 500, 500, this);
					break;

				case 105:
					ImageIcon im105 = new ImageIcon("DragonCloud/049-0/105.PNG");
					Image w105 = im105.getImage();
					g.drawImage(w105, 0, 0, 500, 500, this);
					break;

				case 106:
					ImageIcon im106 = new ImageIcon("DragonCloud/049-0/106.PNG");
					Image w106 = im106.getImage();
					g.drawImage(w106, 0, 0, 500, 500, this);
					break;

				case 107:
					ImageIcon im107 = new ImageIcon("DragonCloud/049-0/107.PNG");
					Image w107 = im107.getImage();
					g.drawImage(w107, 0, 0, 500, 500, this);
					break;

				case 108:
					ImageIcon im108 = new ImageIcon("DragonCloud/049-0/108.PNG");
					Image w108 = im108.getImage();
					g.drawImage(w108, 0, 0, 500, 500, this);
					break;

				case 109:
					ImageIcon im109 = new ImageIcon("DragonCloud/049-0/109.PNG");
					Image w109 = im109.getImage();
					g.drawImage(w109, 0, 0, 500, 500, this);
					break;

				case 110:
					ImageIcon im110 = new ImageIcon("DragonCloud/049-0/110.PNG");
					Image w110 = im110.getImage();
					g.drawImage(w110, 0, 0, 500, 500, this);
					break;

				case 111:
					ImageIcon im111 = new ImageIcon("DragonCloud/049-0/111.PNG");
					Image w111 = im111.getImage();
					g.drawImage(w111, 0, 0, 500, 500, this);
					break;

				case 112:
					ImageIcon im112 = new ImageIcon("DragonCloud/049-0/112.PNG");
					Image w112 = im112.getImage();
					g.drawImage(w112, 0, 0, 500, 500, this);
					break;

				case 113:
					ImageIcon im113 = new ImageIcon("DragonCloud/049-0/113.PNG");
					Image w113 = im113.getImage();
					g.drawImage(w113, 0, 0, 500, 500, this);
					break;

				case 114:
					ImageIcon im114 = new ImageIcon("DragonCloud/049-0/114.PNG");
					Image w114 = im114.getImage();
					g.drawImage(w114, 0, 0, 500, 500, this);
					break;

				case 115:
					ImageIcon im115 = new ImageIcon("DragonCloud/049-0/115.PNG");
					Image w115 = im115.getImage();
					g.drawImage(w115, 0, 0, 500, 500, this);
					break;

				case 116:
					ImageIcon im116 = new ImageIcon("DragonCloud/049-0/116.PNG");
					Image w116 = im116.getImage();
					g.drawImage(w116, 0, 0, 500, 500, this);
					break;

				case 117:
					ImageIcon im117 = new ImageIcon("DragonCloud/049-0/117.PNG");
					Image w117 = im117.getImage();
					g.drawImage(w117, 0, 0, 500, 500, this);
					break;

				case 118:
					ImageIcon im118 = new ImageIcon("DragonCloud/049-0/118.PNG");
					Image w118 = im118.getImage();
					g.drawImage(w118, 0, 0, 500, 500, this);
					break;

				case 119:
					ImageIcon im119 = new ImageIcon("DragonCloud/049-0/119.PNG");
					Image w119 = im119.getImage();
					g.drawImage(w119, 0, 0, 500, 500, this);
					break;

				case 120:
					ImageIcon im120 = new ImageIcon("DragonCloud/049-0/120.PNG");
					Image w120 = im120.getImage();
					g.drawImage(w120, 0, 0, 500, 500, this);
					break;

				case 121:
					ImageIcon im121 = new ImageIcon("DragonCloud/049-0/121.PNG");
					Image w121 = im121.getImage();
					g.drawImage(w121, 0, 0, 500, 500, this);
					break;

				case 122:
					ImageIcon im122 = new ImageIcon("DragonCloud/049-0/122.PNG");
					Image w122 = im122.getImage();
					g.drawImage(w122, 0, 0, 500, 500, this);
					break;

				case 123:
					ImageIcon im123 = new ImageIcon("DragonCloud/049-0/123.PNG");
					Image w123 = im123.getImage();
					g.drawImage(w123, 0, 0, 500, 500, this);
					break;

				case 124:
					ImageIcon im124 = new ImageIcon("DragonCloud/049-0/124.PNG");
					Image w124 = im124.getImage();
					g.drawImage(w124, 0, 0, 500, 500, this);
					break;

				case 125:
					ImageIcon im125 = new ImageIcon("DragonCloud/049-0/125.PNG");
					Image w125 = im125.getImage();
					g.drawImage(w125, 0, 0, 500, 500, this);
					break;

				case 126:
					ImageIcon im126 = new ImageIcon("DragonCloud/049-0/126.PNG");
					Image w126 = im126.getImage();
					g.drawImage(w126, 0, 0, 500, 500, this);
					break;

				case 127:
					ImageIcon im127 = new ImageIcon("DragonCloud/049-0/127.PNG");
					Image w127 = im127.getImage();
					g.drawImage(w127, 0, 0, 500, 500, this);
					break;

				case 128:
					ImageIcon im128 = new ImageIcon("DragonCloud/049-0/128.PNG");
					Image w128 = im128.getImage();
					g.drawImage(w128, 0, 0, 500, 500, this);
					break;

				case 129:
					ImageIcon im129 = new ImageIcon("DragonCloud/049-0/129.PNG");
					Image w129 = im129.getImage();
					g.drawImage(w129, 0, 0, 500, 500, this);
					break;

				case 130:
					ImageIcon im130 = new ImageIcon("DragonCloud/049-0/130.PNG");
					Image w130 = im130.getImage();
					g.drawImage(w130, 0, 0, 500, 500, this);
					break;

				case 131:
					ImageIcon im131 = new ImageIcon("DragonCloud/049-0/131.PNG");
					Image w131 = im131.getImage();
					g.drawImage(w131, 0, 0, 500, 500, this);
					break;

				case 132:
					ImageIcon im132 = new ImageIcon("DragonCloud/049-0/132.PNG");
					Image w132 = im132.getImage();
					g.drawImage(w132, 0, 0, 500, 500, this);
					break;

				case 133:
					ImageIcon im133 = new ImageIcon("DragonCloud/049-0/133.PNG");
					Image w133 = im133.getImage();
					g.drawImage(w133, 0, 0, 500, 500, this);
					break;

				case 134:
					ImageIcon im134 = new ImageIcon("DragonCloud/049-0/134.PNG");
					Image w134 = im134.getImage();
					g.drawImage(w134, 0, 0, 500, 500, this);
					break;

				case 135:
					ImageIcon im135 = new ImageIcon("DragonCloud/049-0/135.PNG");
					Image w135 = im135.getImage();
					g.drawImage(w135, 0, 0, 500, 500, this);
					break;

				case 136:
					ImageIcon im136 = new ImageIcon("DragonCloud/049-0/136.PNG");
					Image w136 = im136.getImage();
					g.drawImage(w136, 0, 0, 500, 500, this);
					break;

				case 137:
					ImageIcon im137 = new ImageIcon("DragonCloud/049-0/137.PNG");
					Image w137 = im137.getImage();
					g.drawImage(w137, 0, 0, 500, 500, this);
					break;

				case 138:
					ImageIcon im138 = new ImageIcon("DragonCloud/049-0/138.PNG");
					Image w138 = im138.getImage();
					g.drawImage(w138, 0, 0, 500, 500, this);
					break;

				case 139:
					ImageIcon im139 = new ImageIcon("DragonCloud/049-0/139.PNG");
					Image w139 = im139.getImage();
					g.drawImage(w139, 0, 0, 500, 500, this);
					break;

				case 140:
					ImageIcon im140 = new ImageIcon("DragonCloud/049-0/140.PNG");
					Image w140 = im140.getImage();
					g.drawImage(w140, 0, 0, 500, 500, this);
					break;

				case 141:
					ImageIcon im141 = new ImageIcon("DragonCloud/049-0/141.PNG");
					Image w141 = im141.getImage();
					g.drawImage(w141, 0, 0, 500, 500, this);
					break;

				case 142:
					ImageIcon im142 = new ImageIcon("DragonCloud/049-0/142.PNG");
					Image w142 = im142.getImage();
					g.drawImage(w142, 0, 0, 500, 500, this);
					break;

				case 143:
					ImageIcon im143 = new ImageIcon("DragonCloud/049-0/143.PNG");
					Image w143 = im143.getImage();
					g.drawImage(w143, 0, 0, 500, 500, this);
					break;

				}
			}
			if (magikp2) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, 1000, 1000);

				int x0 = 500 / 2;
				int y0 = 500 / 2;
				int x, y;
				double a, b;
				a = 0.7;
				b = 0.7;
				g.setColor(Color.BLACK);
				for (int teta = 0; teta < 180 * 3; teta += 5) {
					x = (int) (x0 + (a * teta)
							* Math.cos((Math.PI * teta * b) / 180));
					y = (int) (y0 + (a * teta)
							* Math.sin((Math.PI * teta * b) / 180));
					g.fillOval(x, y, 10, 10);
				}
			}

			if (magikc) {
				g.setColor(new Color(219, 23, 2));
				g.fillRect(0, 0, 1000, 1000);
				int x0 = 500 / 2;
				int y0 = 500 / 2;
				int x, y;
				double a, b;
				a = 0.7;
				b = 30.7;
				g.setColor(Color.GREEN);
				for (int teta = 0; teta < 180 * 3; teta += 5) {
					x = (int) (x0 + (a * teta)
							* Math.cos((Math.PI * teta * b) / 180));
					y = (int) (y0 + (a * teta)
							* Math.sin((Math.PI * teta * b) / 180));
					g.fillOval(x, y, 10, 10);
				}
			}
			// speciaux
			if (speciaux[0]) {
				switch (speciau[0]) {
				case 1:
					ImageIcon im1 = new ImageIcon("Purgatory/001.PNG");
					Image w1 = im1.getImage();
					g.drawImage(w1, 0, 0, 500, 500, this);
					break;

				case 2:
					ImageIcon im2 = new ImageIcon("Purgatory/002.PNG");
					Image w2 = im2.getImage();
					g.drawImage(w2, 0, 0, 500, 500, this);
					break;

				case 3:
					ImageIcon im3 = new ImageIcon("Purgatory/003.PNG");
					Image w3 = im3.getImage();
					g.drawImage(w3, 0, 0, 500, 500, this);
					break;

				case 4:
					ImageIcon im4 = new ImageIcon("Purgatory/004.PNG");
					Image w4 = im4.getImage();
					g.drawImage(w4, 0, 0, 500, 500, this);
					break;

				case 5:
					ImageIcon im5 = new ImageIcon("Purgatory/005.PNG");
					Image w5 = im5.getImage();
					g.drawImage(w5, 0, 0, 500, 500, this);
					break;

				case 6:
					ImageIcon im6 = new ImageIcon("Purgatory/006.PNG");
					Image w6 = im6.getImage();
					g.drawImage(w6, 0, 0, 500, 500, this);
					break;

				case 7:
					ImageIcon im7 = new ImageIcon("Purgatory/007.PNG");
					Image w7 = im7.getImage();
					g.drawImage(w7, 0, 0, 500, 500, this);
					break;

				case 8:
					ImageIcon im8 = new ImageIcon("Purgatory/008.PNG");
					Image w8 = im8.getImage();
					g.drawImage(w8, 0, 0, 500, 500, this);
					break;

				case 9:
					ImageIcon im9 = new ImageIcon("Purgatory/009.PNG");
					Image w9 = im9.getImage();
					g.drawImage(w9, 0, 0, 500, 500, this);
					break;

				case 10:
					ImageIcon im10 = new ImageIcon("Purgatory/010.PNG");
					Image w10 = im10.getImage();
					g.drawImage(w10, 0, 0, 500, 500, this);
					break;

				case 11:
					ImageIcon im11 = new ImageIcon("Purgatory/011.PNG");
					Image w11 = im11.getImage();
					g.drawImage(w11, 0, 0, 500, 500, this);
					break;

				case 12:
					ImageIcon im12 = new ImageIcon("Purgatory/012.PNG");
					Image w12 = im12.getImage();
					g.drawImage(w12, 0, 0, 500, 500, this);
					break;

				case 13:
					ImageIcon im13 = new ImageIcon("Purgatory/013.PNG");
					Image w13 = im13.getImage();
					g.drawImage(w13, 0, 0, 500, 500, this);
					break;

				case 14:
					ImageIcon im14 = new ImageIcon("Purgatory/014.PNG");
					Image w14 = im14.getImage();
					g.drawImage(w14, 0, 0, 500, 500, this);
					break;

				case 15:
					ImageIcon im15 = new ImageIcon("Purgatory/015.PNG");
					Image w15 = im15.getImage();
					g.drawImage(w15, 0, 0, 500, 500, this);
					break;

				case 16:
					ImageIcon im16 = new ImageIcon("Purgatory/016.PNG");
					Image w16 = im16.getImage();
					g.drawImage(w16, 0, 0, 500, 500, this);
					break;

				case 17:
					ImageIcon im17 = new ImageIcon("Purgatory/017.PNG");
					Image w17 = im17.getImage();
					g.drawImage(w17, 0, 0, 500, 500, this);
					break;

				case 18:
					ImageIcon im18 = new ImageIcon("Purgatory/018.PNG");
					Image w18 = im18.getImage();
					g.drawImage(w18, 0, 0, 500, 500, this);
					break;

				case 19:
					ImageIcon im19 = new ImageIcon("Purgatory/019.PNG");
					Image w19 = im19.getImage();
					g.drawImage(w19, 0, 0, 500, 500, this);
					break;

				case 20:
					ImageIcon im20 = new ImageIcon("Purgatory/020.PNG");
					Image w20 = im20.getImage();
					g.drawImage(w20, 0, 0, 500, 500, this);
					break;

				case 21:
					ImageIcon im21 = new ImageIcon("Purgatory/021.PNG");
					Image w21 = im21.getImage();
					g.drawImage(w21, 0, 0, 500, 500, this);
					break;

				case 22:
					ImageIcon im22 = new ImageIcon("Purgatory/022.PNG");
					Image w22 = im22.getImage();
					g.drawImage(w22, 0, 0, 500, 500, this);
					break;

				case 23:
					ImageIcon im23 = new ImageIcon("Purgatory/023.PNG");
					Image w23 = im23.getImage();
					g.drawImage(w23, 0, 0, 500, 500, this);
					break;

				case 24:
					ImageIcon im24 = new ImageIcon("Purgatory/024.PNG");
					Image w24 = im24.getImage();
					g.drawImage(w24, 0, 0, 500, 500, this);
					break;

				case 25:
					ImageIcon im25 = new ImageIcon("Purgatory/025.PNG");
					Image w25 = im25.getImage();
					g.drawImage(w25, 0, 0, 500, 500, this);
					break;

				case 26:
					ImageIcon im26 = new ImageIcon("Purgatory/026.PNG");
					Image w26 = im26.getImage();
					g.drawImage(w26, 0, 0, 500, 500, this);
					break;

				case 27:
					ImageIcon im27 = new ImageIcon("Purgatory/027.PNG");
					Image w27 = im27.getImage();
					g.drawImage(w27, 0, 0, 500, 500, this);
					break;

				case 28:
					ImageIcon im28 = new ImageIcon("Purgatory/028.PNG");
					Image w28 = im28.getImage();
					g.drawImage(w28, 0, 0, 500, 500, this);
					break;

				case 29:
					ImageIcon im29 = new ImageIcon("Purgatory/029.PNG");
					Image w29 = im29.getImage();
					g.drawImage(w29, 0, 0, 500, 500, this);
					break;

				case 30:
					ImageIcon im30 = new ImageIcon("Purgatory/030.PNG");
					Image w30 = im30.getImage();
					g.drawImage(w30, 0, 0, 500, 500, this);
					break;

				case 31:
					ImageIcon im31 = new ImageIcon("Purgatory/031.PNG");
					Image w31 = im31.getImage();
					g.drawImage(w31, 0, 0, 500, 500, this);
					break;

				case 32:
					ImageIcon im32 = new ImageIcon("Purgatory/032.PNG");
					Image w32 = im32.getImage();
					g.drawImage(w32, 0, 0, 500, 500, this);
					break;

				case 33:
					ImageIcon im33 = new ImageIcon("Purgatory/033.PNG");
					Image w33 = im33.getImage();
					g.drawImage(w33, 0, 0, 500, 500, this);
					break;

				case 34:
					ImageIcon im34 = new ImageIcon("Purgatory/034.PNG");
					Image w34 = im34.getImage();
					g.drawImage(w34, 0, 0, 500, 500, this);
					break;

				case 35:
					ImageIcon im35 = new ImageIcon("Purgatory/035.PNG");
					Image w35 = im35.getImage();
					g.drawImage(w35, 0, 0, 500, 500, this);
					break;

				case 36:
					ImageIcon im36 = new ImageIcon("Purgatory/036.PNG");
					Image w36 = im36.getImage();
					g.drawImage(w36, 0, 0, 500, 500, this);
					break;

				case 37:
					ImageIcon im37 = new ImageIcon("Purgatory/037.PNG");
					Image w37 = im37.getImage();
					g.drawImage(w37, 0, 0, 500, 500, this);
					break;

				case 38:
					ImageIcon im38 = new ImageIcon("Purgatory/038.PNG");
					Image w38 = im38.getImage();
					g.drawImage(w38, 0, 0, 500, 500, this);
					break;

				case 39:
					ImageIcon im39 = new ImageIcon("Purgatory/039.PNG");
					Image w39 = im39.getImage();
					g.drawImage(w39, 0, 0, 500, 500, this);
					break;

				case 40:
					ImageIcon im40 = new ImageIcon("Purgatory/040.PNG");
					Image w40 = im40.getImage();
					g.drawImage(w40, 0, 0, 500, 500, this);
					break;

				case 41:
					ImageIcon im41 = new ImageIcon("Purgatory/041.PNG");
					Image w41 = im41.getImage();
					g.drawImage(w41, 0, 0, 500, 500, this);
					break;

				case 42:
					ImageIcon im42 = new ImageIcon("Purgatory/042.PNG");
					Image w42 = im42.getImage();
					g.drawImage(w42, 0, 0, 500, 500, this);
					break;

				case 43:
					ImageIcon im43 = new ImageIcon("Purgatory/043.PNG");
					Image w43 = im43.getImage();
					g.drawImage(w43, 0, 0, 500, 500, this);
					break;

				case 44:
					ImageIcon im44 = new ImageIcon("Purgatory/044.PNG");
					Image w44 = im44.getImage();
					g.drawImage(w44, 0, 0, 500, 500, this);
					break;

				case 45:
					ImageIcon im45 = new ImageIcon("Purgatory/045.PNG");
					Image w45 = im45.getImage();
					g.drawImage(w45, 0, 0, 500, 500, this);
					break;

				case 46:
					ImageIcon im46 = new ImageIcon("Purgatory/046.PNG");
					Image w46 = im46.getImage();
					g.drawImage(w46, 0, 0, 500, 500, this);
					break;

				case 47:
					ImageIcon im47 = new ImageIcon("Purgatory/047.PNG");
					Image w47 = im47.getImage();
					g.drawImage(w47, 0, 0, 500, 500, this);
					break;

				case 48:
					ImageIcon im48 = new ImageIcon("Purgatory/048.PNG");
					Image w48 = im48.getImage();
					g.drawImage(w48, 0, 0, 500, 500, this);
					break;

				case 49:
					ImageIcon im49 = new ImageIcon("Purgatory/049.PNG");
					Image w49 = im49.getImage();
					g.drawImage(w49, 0, 0, 500, 500, this);
					break;

				case 50:
					ImageIcon im50 = new ImageIcon("Purgatory/050.PNG");
					Image w50 = im50.getImage();
					g.drawImage(w50, 0, 0, 500, 500, this);
					break;

				case 51:
					ImageIcon im51 = new ImageIcon("Purgatory/051.PNG");
					Image w51 = im51.getImage();
					g.drawImage(w51, 0, 0, 500, 500, this);
					break;

				case 52:
					ImageIcon im52 = new ImageIcon("Purgatory/052.PNG");
					Image w52 = im52.getImage();
					g.drawImage(w52, 0, 0, 500, 500, this);
					break;

				}
			}

			testspeciaux(g);

			if (magikc2) {
				g.setColor(Color.CYAN);
				g.fillRect(0, 0, 1000, 1000);
				int x0 = 500 / 2;
				int y0 = 500 / 2;
				int x, y;
				double a, b;
				a = 0.7;
				b = 30.7;
				g.setColor(Color.BLACK);
				for (int teta = 0; teta < 180 * 3; teta += 5) {
					x = (int) (x0 + (a * teta)
							* Math.cos((Math.PI * teta * b) / 180));
					y = (int) (y0 + (a * teta)
							* Math.sin((Math.PI * teta * b) / 180));
					g.fillOval(x, y, 10, 10);
				}
			}
			if (magikw) {
				int x, y;

				g.setColor(Color.PINK);
				g.fillRect(0, 0, 1000, 1000);
				g.setColor(Color.WHITE);
				for (int i = 0; i < 100; i++) {
					x = (int) (Math.random() * 500);
					y = (int) (Math.random() * 500);
					g.fillOval(x, y, 10, 10);
				}
			}
			if (magikM) {
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 1000, 1000);
				g.setColor(Color.BLUE);
				dragon2(i, 249, 249, 100, 100, g);
			}

			if (magiklink) {
				g.setColor(Color.GREEN);
				g.fillOval(0, 0, 500, 500);
				g.setColor(Color.YELLOW);
				gasket(g, i, 100, 350, 300, 280);
			}
			if (magiklink2) {
				g.setColor(Color.gray);
				g.fillOval(0, 0, 500, 500);
				g.setColor(Color.YELLOW);
				tapis(g, i, 40, 10, 440, 440);
			}
			if (magikvampire) {
				switch (i) {
				case 0:
					g.setColor(Color.BLUE);
					break;
				case 1:
					g.setColor(Color.RED);
					break;
				case 2:
					g.setColor(Color.GREEN);
					break;
				case 3:
					g.setColor(Color.MAGENTA);
					break;
				case 4:
					g.setColor(Color.YELLOW);
					break;
				case 5:
					g.setColor(Color.pink);
					break;
				case 6:
					g.setColor(Color.CYAN);
					break;
				case 7:
					g.setColor(Color.ORANGE);
					break;
				}
				g.fillRect(0, 0, 600, 600);
			}
			// Affichage des PVs
			g.setColor(Color.WHITE);
			g.setFont(new Font("Arial", Font.BOLD, 17));
			for (int ii = 0, i = 200; (ii < PV.size() && i < 500); ii++, i += 100) {
				g.drawString(NAME.get(ii) + "", i, 40);
				g.setColor(Color.RED);
				g.drawString("PV : " + PV.get(ii) + "", i, 70);
				g.setColor(Color.WHITE);
				g.drawString("PP : " + PP.get(ii) + "", i, 90);
			}
			for (int ii = 0, i = 20; (ii < PV2.size() && i < 300); ii++, i += 100) {
				g.setColor(Color.ORANGE);
				g.drawString("PV : " + PV2.get(ii) + "", i, 140);
			}
			g.setColor(Color.WHITE);
			g.drawString("combats remportés : " + combatG, 210, 190);
			g.drawString("Potions: X" + potion, 210, 220);
			// Les Personnages AnimiX
			// Attack PAVEL

			if (orientation == 0) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/pavel/ppose.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x, y, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/pavel/pm.gif");
					Image d = image.getImage();

					g.drawImage(d, x, y, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/pavel/pm2.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, x, y, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/pavel/pm3.gif");
					Image d2 = image3.getImage();

					g.drawImage(d2, x, y, this);

					break;
				case 5:

					ImageIcon imag43 = new ImageIcon(
							"image/Personnage/pavel/pattack.gif");
					Image d4 = imag43.getImage();
					ImageIcon imag4 = new ImageIcon(
							"image/Personnage/pavel/psword.gif");
					Image d44 = imag4.getImage();

					g.drawImage(d4, x, y, this);

					g.drawImage(d44, x - 40, y - 50, this);

					break;
				case 6:

					ImageIcon image1 = new ImageIcon(
							"image/Personnage/pavel/pm3.gif");
					Image dd = image1.getImage();

					g.drawImage(dd, x, y, this);

					break;

				}
			}
			// magie
			if (orientation == 1) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/pavel/pspell2.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x, y, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/pavel/pspell3.gif");
					Image d = image.getImage();

					g.drawImage(d, x, y, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/pavel/pspell.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, x, y, this);

					break;
				}
			}
			if (orientation == 2) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/pavel/phurt.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x, y, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/pavel/phurt2.gif");
					Image d = image.getImage();

					g.drawImage(d, x, y, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/pavel/phurt3.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, x, y, this);

					break;
				}
			}
			// Cyntia

			if (orientation2 == 0) {
				switch (avance2) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/elf/estand.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x2, y2, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/elf/estand2.gif");
					Image d = image.getImage();

					g.drawImage(d, x2, y2, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/elf/eback.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, x2, y2, this);

					break;
				}
			}
			if (orientation2 == 1) {
				switch (avance2) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/elf/ehurt.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x2, y2, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/elf/ehurt2.gif");
					Image d = image.getImage();

					g.drawImage(d, x2, y2, this);
					break;
				}
			}
			if (orientation2 == 2) {
				switch (avance2) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/elf/emagik.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x2, y2, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/elf/emagik2.gif");
					Image d = image.getImage();

					g.drawImage(d, x2, y2, this);
					break;
				}
			}
			if (orientation2 == 3) {
				switch (avance2) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/elf/efly.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x2, y2, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/elf/efly2.gif");
					Image d = image.getImage();

					g.drawImage(d, x2, y2, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/elf/efleche.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, x2, y2, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/elf/efleche2.gif");
					Image d2 = image3.getImage();
					ImageIcon image33 = new ImageIcon(
							"image/Personnage/elf/earc2.gif");
					Image d23 = image33.getImage();
					g.drawImage(d2, x2, y2, this);
					g.drawImage(d23, x2 - 70, y2 + 70, this);
					break;
				}
			}

			// Girl witch
			if (orientation3 == 0) {
				switch (avance3) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/sorcier/sstand.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x3, y3, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/sorcier/sinjure.gif");
					Image d = image.getImage();

					g.drawImage(d, x3, y3, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/sorcier/sspell.gif");
					Image d1 = image2.getImage();

					g.drawImage(d1, x3, y3, this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/sorcier/sspell2.gif");
					Image d2 = image3.getImage();

					g.drawImage(d2, x3, y3, this);

					break;
				}
			}

			if (orientation3 == 1) {
				switch (avance3) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/sorcier/shurt.gif");
					Image w = imageIcon.getImage();

					g.drawImage(w, x3, y3, this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/sorcier/smort.gif");
					Image d = image.getImage();

					g.drawImage(d, x3, y3, this);
					break;
				}
			}

			switch (avancem[0]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/g1.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/gpoing.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;

			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/g3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/g4.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[0], ty[0], this);

				break;
			case 5:

				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/mechant/g5.png");
				Image d44 = imag4.getImage();
				g.drawImage(d44, tx[0], ty[0], this);

				break;
			case 6:

				ImageIcon image1 = new ImageIcon(
						"image/Personnage/mechant/gattack.png");
				Image dd = image1.getImage();
				ImageIcon imag2 = new ImageIcon(
						"image/Personnage/mechant/gboule.png");
				Image dd2 = imag2.getImage();
				g.drawImage(dd, tx[0], ty[0], this);
				g.drawImage(dd2, tx[0] + 100, ty[0], this);
				break;

			}
			switch (avancem[1]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/m1.gif");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/m2.gif");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/m3.gif");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/m4.gif");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[1], ty[1], this);

				break;
			}
			// frankeinstein
			switch (avancem[3]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/b1.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/b2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/b3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/b4.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[1], ty[1], this);

				break;
			}
			// Golem Marron (roche)
			switch (avancem[4]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/r1.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/r2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/r3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/r4.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[0], ty[0], this);

				break;
			case 5:

				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/mechant/r5.png");
				Image d44 = imag4.getImage();
				g.drawImage(d44, tx[0], ty[0], this);

				break;

			}

			if (avancem[5] == 1) {
				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/mechant/mechant.png");
				Image d44 = imag4.getImage();
				g.drawImage(d44, pox, poy, this);

			}
			// villageois enrage
			switch (avancem[6]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/astand.gif");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/a.gif");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/a1.gif");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/a2.gif");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[0], ty[0], this);

				break;
			case 5:

				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/mechant/aavance2.gif");
				Image d44 = imag4.getImage();
				ImageIcon imaggg = new ImageIcon(
						"image/Personnage/mechant/acouteau.gif");
				Image d444 = imaggg.getImage();

				g.drawImage(d44, tx[0], ty[0], this);
				g.drawImage(d444, tx[0] + 100, ty[0], this);
				break;

			}
			// dame des bois
			switch (avancem[7]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/f1.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/f2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/f3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/f4.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[1], ty[1], this);

				break;
			}
			switch (avancem[9]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/bstand.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/bstand2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/battack.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;

			}
			// femme mure forte qui attaque tous ce qui bouge
			switch (avancem[10]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/wwstand.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/wwcour1.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/wwcour2.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/wwcour3.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[0], ty[0], this);

				break;
			case 5:

				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/mechant/wwhit.png");
				Image d44 = imag4.getImage();

				g.drawImage(d44, tx[0], ty[0], this);

				break;

			}
			// The legendary Link
			switch (avancem[11]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/Link/Lstand.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/Link/Lstand2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/Link/Lmarche.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/Link/Lepe.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[0], ty[0], this);

				break;
			case 5:

				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/Link/Lepe2.png");
				Image d44 = imag4.getImage();

				g.drawImage(d44, tx[0], ty[0], this);

				break;
			case 6:

				ImageIcon imagff = new ImageIcon(
						"image/Personnage/Link/Lmagik.png");
				Image d44f = imagff.getImage();

				g.drawImage(d44f, tx[0], ty[0], this);

				break;
			case 7:

				ImageIcon imagfh = new ImageIcon(
						"image/Personnage/Link/Lmagik2.png");
				Image d44fh = imagfh.getImage();

				g.drawImage(d44fh, tx[0], ty[0], this);

				break;
			}
			// VAMPIRE BOSS
			switch (avancem[12]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/vstand.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/vwalk.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/vrecul.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/mechant/vdos.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[0], ty[0], this);

				break;
			case 5:

				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/mechant/vdos2.png");
				Image d44 = imag4.getImage();

				g.drawImage(d44, tx[0], ty[0], this);

				break;
			case 6:

				ImageIcon imagff = new ImageIcon(
						"image/Personnage/mechant/vmagie.png");
				Image d44f = imagff.getImage();

				g.drawImage(d44f, tx[0], ty[0], this);

				break;

			}
			// SON ACOLYTE
			switch (avancem[13]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/death2.gif");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/death22.gif");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/death222.gif");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;
			}
			// PAVEL DARK
			switch (avancem[14]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/pavel2/pstand.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/pavel2/pmarche.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/pavel2/pmarche2.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/pavel2/pmarche3.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[0], ty[0], this);

				break;
			case 5:

				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/pavel2/pattack.png");
				Image d44 = imag4.getImage();

				g.drawImage(d44, tx[0], ty[0], this);

				break;
			case 6:
				// Magie commence Ici
				ImageIcon imagff = new ImageIcon(
						"image/Personnage/pavel2/pmagie2.png");
				Image d44f = imagff.getImage();

				g.drawImage(d44f, tx[0], ty[0], this);

				break;
			case 7:

				ImageIcon imagfh = new ImageIcon(
						"image/Personnage/pavel2/pmagie3.png");
				Image d44fh = imagfh.getImage();

				g.drawImage(d44fh, tx[0], ty[0], this);

				break;
			case 8:

				ImageIcon imagfhy = new ImageIcon(
						"image/Personnage/pavel2/pmagie.png");
				Image d44fhy = imagfhy.getImage();

				g.drawImage(d44fhy, tx[0], ty[0], this);

				break;
			}

			// SUITE DE COORDINATION
			switch (avancem[15]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/elf2/estand.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/elf2/emagie3.png");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/elf2/emagie.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/elf2/emagie.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[1], ty[1], this);

				break;
			case 5:

				ImageIcon imag4 = new ImageIcon(
						"image/Personnage/elf2/efly3.png");
				Image d44 = imag4.getImage();

				g.drawImage(d44, tx[1], ty[1], this);

				break;
			case 6:
				// Magie commence Ici
				ImageIcon imagff = new ImageIcon(
						"image/Personnage/elf2/efly.png");
				Image d44f = imagff.getImage();

				g.drawImage(d44f, tx[1], ty[1], this);

				break;
			case 7:

				ImageIcon imagfh = new ImageIcon(
						"image/Personnage/elf2/efly2.png");
				Image d44fh = imagfh.getImage();

				g.drawImage(d44fh, tx[1], ty[1], this);

				break;

			}
			switch (avancem[16]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/elf2/poul.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/elf2/poul2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/elf2/poul3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			case 4:

				ImageIcon image3 = new ImageIcon(
						"image/Personnage/elf2/poul4.png");
				Image d2 = image3.getImage();

				g.drawImage(d2, tx[0], ty[0], this);

				break;
			}
			// mewto
			if (mewto == 1) {
				ImageIcon imageIcon = new ImageIcon("Thor/mewto.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0] - 10, ty[0] - 50, this);
			}
			switch (avancem[17]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/aigle.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/aigle1.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/aigle2.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			}
			switch (avancem[18]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/ge.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/ge1.png");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/ge2.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;

			}
			switch (avancem[19]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/loup.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/loup2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/loup3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			}
			switch (avancem[20]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/morve1.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/morve2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/morve3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;

			}
			switch (avancem[21]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/pico.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/pico1.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/pico2.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], this);

				break;

			}
			switch (avancem[22]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/mechant/siren.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/mechant/seren1.png");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/mechant/siren2.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], this);

				break;

			}
			// DEMON BLEU+VLAD +fleix

			// VLAD in dark
			switch (avancem[23]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/pavel2/S.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[0], ty[0], 80, 80, this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/pavel2/S490P06.png");
				Image d = image.getImage();

				g.drawImage(d, tx[0], ty[0], 80, 80, this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/pavel2/S490P08.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[0], ty[0], 80, 80, this);

				break;
			case 4:
				ImageIcon image22 = new ImageIcon(
						"image/Personnage/pavel2/S490P14.png");
				Image d12 = image22.getImage();

				g.drawImage(d12, tx[0], ty[0], 80, 80, this);
				break;

			}
			// FELIX PAVEL s father
			switch (avancem[25]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/pavel2/p.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[3], ty[3], 80, 80, this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/pavel2/p3.png");
				Image d = image.getImage();

				g.drawImage(d, tx[3], ty[3], 80, 80, this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/pavel2/p4.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[3], ty[3], 80, 80, this);

				break;
			case 4:
				ImageIcon image22 = new ImageIcon(
						"image/Personnage/pavel2/p2.png");
				Image d12 = image22.getImage();

				g.drawImage(d12, tx[3], ty[3], 80, 80, this);
				break;

			}
			// DEMON BLEU
			switch (avancem[24]) {
			case 1:

				ImageIcon imageIcon = new ImageIcon(
						"image/Personnage/boss/boss1.png");
				Image w = imageIcon.getImage();

				g.drawImage(w, tx[1], ty[1], 80, 80, this);

				break;

			case 2:

				ImageIcon image = new ImageIcon(
						"image/Personnage/boss/boss2.png");
				Image d = image.getImage();

				g.drawImage(d, tx[1], ty[1], 80, 80, this);
				break;
			case 3:

				ImageIcon image2 = new ImageIcon(
						"image/Personnage/boss/boss3.png");
				Image d1 = image2.getImage();

				g.drawImage(d1, tx[1], ty[1], 80, 80, this);

				break;
			case 4:
				ImageIcon image22 = new ImageIcon(
						"image/Personnage/pavel2/boss3.png");
				Image d12 = image22.getImage();

				g.drawImage(d12, tx[1], ty[1], 80, 80, this);
				break;

			}
			if (orientationz == 0) {
				switch (avancez) {
				// running
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/erza/Erstand.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, tx[0], ty[0], this);

					break;
				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/erza/Errun.png");
					Image d = image.getImage();

					g.drawImage(d, tx[0], ty[0], this);
					break;
				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/erza/Errun2.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, tx[0], ty[0], this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/erza/Errun3.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, tx[0], ty[0], this);

					break;
				}
			}

			if (orientationz == 1) {
				switch (avancez) {
				// sword
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/erza/epe.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, tx[0], ty[0], this);

					break;
				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/erza/epe2.png");
					Image d = image.getImage();

					g.drawImage(d, tx[0], ty[0], this);
					break;
				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/erza/epe3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, tx[0], ty[0], this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/erza/epe4.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, tx[0], ty[0], this);

					break;
				}
			}

			if (orientationz == 2) {
				switch (avancez) {
				// sword again
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/erza/attack1.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, tx[0], ty[0], this);

					break;
				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/erza/attack2.png");
					Image d = image.getImage();

					g.drawImage(d, tx[0], ty[0], this);
					break;
				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/erza/attack3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, tx[0], ty[0], this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/erza/attack4.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, tx[0], ty[0], this);

					break;
				case 5:

					ImageIcon image6 = new ImageIcon(
							"image/Personnage/erza/attack5.png");
					Image d16 = image6.getImage();

					g.drawImage(d16, tx[0], ty[0], this);

					break;

				case 6:

					ImageIcon image36 = new ImageIcon(
							"image/Personnage/erza/attack6.png");
					Image d26 = image36.getImage();

					g.drawImage(d26, tx[0], ty[0], this);

					break;
				}
			}
			if (orientationz == 3) {
				switch (avancez) {
				// Dark form
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/erza/dark.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, tx[0], ty[0], this);

					break;
				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/erza/dark2.png");
					Image d = image.getImage();

					g.drawImage(d, tx[0], ty[0], this);
					break;
				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/erza/dark3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, tx[0], ty[0], this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/erza/dark4.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, tx[0], ty[0], this);

					break;
				case 5:

					ImageIcon image6 = new ImageIcon(
							"image/Personnage/erza/dark5.png");
					Image d16 = image6.getImage();

					g.drawImage(d16, tx[0], ty[0], this);

					break;

				case 6:

					ImageIcon image36 = new ImageIcon(
							"image/Personnage/erza/dark6.png");
					Image d26 = image36.getImage();

					g.drawImage(d26, tx[0], ty[0], this);

					break;
				}
			}

			if (orientationz == 4) {
				switch (avancez) {
				// sword again
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/erza/elec.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, tx[0], ty[0], this);

					break;
				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/erza/elec2.png");
					Image d = image.getImage();

					g.drawImage(d, tx[0], ty[0], this);
					break;
				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/erza/elec3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, tx[0], ty[0], this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/erza/elec4.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, tx[0], ty[0], this);

					break;
				case 5:

					ImageIcon image6 = new ImageIcon(
							"image/Personnage/erza/elec5.png");
					Image d16 = image6.getImage();

					g.drawImage(d16, tx[0], ty[0], this);

					break;

				}
			}

			if (orientationz == 5) {
				switch (avancez) {
				// sword again
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/erza/sword.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, tx[0], ty[0], this);

					break;
				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/erza/sword2.png");
					Image d = image.getImage();

					g.drawImage(d, tx[0], ty[0], this);
					break;
				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/erza/sword3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, tx[0], ty[0], this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/erza/sword4.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, tx[0], ty[0], this);

					break;
				case 5:

					ImageIcon image6 = new ImageIcon(
							"image/Personnage/erza/sword5.png");
					Image d16 = image6.getImage();

					g.drawImage(d16, tx[0], ty[0], this);

					break;

				case 6:

					ImageIcon image36 = new ImageIcon(
							"image/Personnage/erza/sword6.png");
					Image d26 = image36.getImage();

					g.drawImage(d26, tx[0], ty[0], this);

					break;
				}
			}
			if (orientationz == 6) {
				switch (avancez) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/Personnage/erza/fire.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, tx[0], ty[0], this);

					break;

				case 2:

					ImageIcon image = new ImageIcon(
							"image/Personnage/erza/fire2.png");
					Image d = image.getImage();

					g.drawImage(d, tx[0], ty[0], this);
					break;
				case 3:

					ImageIcon image2 = new ImageIcon(
							"image/Personnage/erza/fire3.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, tx[0], ty[0], this);

					break;

				case 4:

					ImageIcon image3 = new ImageIcon(
							"image/Personnage/erza/fire4.png");
					Image d2 = image3.getImage();

					g.drawImage(d2, tx[0], ty[0], this);

					break;
				case 5:

					ImageIcon imag4 = new ImageIcon(
							"image/Personnage/erza/fire5.png");
					Image d44 = imag4.getImage();

					g.drawImage(d44, tx[0], ty[0], this);

					break;
				case 6:
					// Magie commence Ici
					ImageIcon imagff = new ImageIcon(
							"image/Personnage/erza/fire6.png");
					Image d44f = imagff.getImage();

					g.drawImage(d44f, tx[0], ty[0], this);

					break;
				case 7:

					ImageIcon imagfh = new ImageIcon(
							"image/Personnage/erza/fire7.png");
					Image d44fh = imagfh.getImage();

					g.drawImage(d44fh, tx[0], ty[0], this);

					break;
				case 8:

					ImageIcon imagfhy = new ImageIcon(
							"image/Personnage/erza/fire8.png");
					Image d44fhy = imagfhy.getImage();

					g.drawImage(d44fhy, tx[0], ty[0], this);

					break;
				}
			}

			g.setColor(Color.BLUE);
			g.fillOval(cursor, 300, 20, 20);
		}
		if (animation) {
			ImageIcon image = new ImageIcon(

			 name + "/" + num + ".PNG");
			Image d = image.getImage();
			if (sensei)
				g.drawImage(d, this.getWidth(), 0, -1 * (this.getWidth()),
						this.getHeight(), this);
			else
				g.drawImage(d, 0, 0, this.getWidth(), this.getHeight(), this);
		}
		if (finale) {
			ImageIcon image = new ImageIcon("image/Map/m.jpg");
			Image d = image.getImage();
			g.drawImage(d, 0, 0, 500, 530, this);
		}
	}

	boolean finale = false;
	boolean magikp2 = false;
	boolean magikc2 = false;
	boolean magikp = false;
	boolean magikc = false;
	boolean magikw = false;
	boolean magikM = false;
	boolean magiklink = false;
	int i = 1;

	// Fonction subsidiaire
	static void dragon(int n, int x, int y, int z, int t, Graphics g) {
		int u, v;
		if (n == 1) {
			g.drawLine(x, y, z, t);

		} else {
			u = (x + z + t - y) / 2;
			v = (y + t - z + x) / 2;
			dragon(n - 1, x, y, u, v, g);
			dragon(n - 1, z, t, u, v, g);

		}

	}

	static void dragon2(int n, int x, int y, int z, int t, Graphics g) {

		int u, v;
		if (n == 1) {
			g.drawLine(x, y, z, t);

		} else {
			u = (x + z + t - y) / 2;
			v = (y + t - z + x) / 2;
			dragon2(n - 1, x, y, u, v, g);
			dragon3(n - 1, u, v, z, t, g);

		}
	}

	/*
	 * Fonction recursif
	 */

	static void dragon3(int n, int x, int y, int z, int t, Graphics g) {
		int u, v;
		if (n == 1) {
			g.drawLine(x, y, z, t);

		} else {
			u = (x + z - t + y) / 2;
			v = (y + t + z - x) / 2;
			dragon2(n - 1, x, y, u, v, g);
			dragon3(n - 1, u, v, z, t, g);
		}
	}

	// MAGIES

	public void gasket(Graphics g, int iteration, int j, int haut, int larg,
			int haut2) {
		if (iteration == 1) {
			// D�finition de la couleur fix�e par le tableau de couleur et son
			// indice

			Polygon polygon = new Polygon();
			polygon.addPoint(j, haut);
			polygon.addPoint(j + larg, haut);
			polygon.addPoint(j + larg / 2, haut - haut2);
			// Dessine un polygone de 3 sommets d�finis auparavant donc un
			// triangle
			// avec une couleur d�finie auparavant
			g.fillPolygon(polygon);

		} else {
			// On divise par 3 la hauteur et la largeur pour pouvoir dessiner 3
			// triangles
			int largDiv = larg / 2;
			int hautDiv = haut2 / 2;
			// Permet de dessiner 3 triangles dans le triangle pr�c�demment
			// dessin�
			gasket(g, (iteration - 1), j, haut, largDiv, hautDiv);
			gasket(g, (iteration - 1), j + largDiv / 2, haut - hautDiv,
					largDiv, hautDiv);
			gasket(g, (iteration - 1), j + largDiv, haut, largDiv, hautDiv);

		}

	}

	public void tapis(Graphics g, int iteration, int j, int k, int larg,
			int haut) {
		if (iteration == 1) {
			g.setColor(Color.orange);
			// Dessine un carr� de sommet j, k, largeur, hauteur avec une
			// couleur d�finie auparavant
			g.fillRect(j, k, larg, haut);

			// Permet de d�finir l'indice du tableau de couleur pour cr�er un
			// d�grad� de couleur

			g.setColor(Color.BLACK);
			// Dessine un carr� de sommet j, k, largeur, hauteur en noir
			g.drawRect(j, k, larg, haut);
		} else {
			// On divise par 3 la hauteur et la largeur pour pouvoir dessiner 9
			// carr�s
			int largDiv = larg / 3;
			int hautDiv = haut / 3;
			// Permet de dessiner 8 carr�s dans le carr� pr�c�demment dessin�
			tapis(g, iteration - 1, j, k, largDiv, hautDiv);
			tapis(g, iteration - 1, j + largDiv, k, largDiv, hautDiv);
			tapis(g, iteration - 1, j + 2 * largDiv, k, largDiv, hautDiv);
			tapis(g, iteration - 1, j, k + hautDiv, largDiv, hautDiv);
			tapis(g, iteration - 1, j + 2 * largDiv, k + hautDiv, largDiv,
					hautDiv);
			tapis(g, iteration - 1, j, k + 2 * hautDiv, largDiv, hautDiv);
			tapis(g, iteration - 1, j + largDiv, k + 2 * hautDiv, largDiv,
					hautDiv);
			tapis(g, iteration - 1, j + 2 * largDiv, k + 2 * hautDiv, largDiv,
					hautDiv);
		}
	}

	public void testspeciaux(Graphics g) {
		if (speciaux[4]) {
			switch (speciau[4]) {
			case 1:
				ImageIcon im1 = new ImageIcon("CuttingEdge/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("CuttingEdge/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("CuttingEdge/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("CuttingEdge/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("CuttingEdge/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("CuttingEdge/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("CuttingEdge/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("CuttingEdge/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("CuttingEdge/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("CuttingEdge/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("CuttingEdge/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("CuttingEdge/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("CuttingEdge/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("CuttingEdge/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("CuttingEdge/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("CuttingEdge/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("CuttingEdge/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("CuttingEdge/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("CuttingEdge/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("CuttingEdge/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("CuttingEdge/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("CuttingEdge/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("CuttingEdge/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("CuttingEdge/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("CuttingEdge/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("CuttingEdge/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("CuttingEdge/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("CuttingEdge/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("CuttingEdge/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("CuttingEdge/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			}
		}
		if (speciaux[1]) {
			switch (speciau[1]) {
			case 1:
				ImageIcon im1 = new ImageIcon("Megiddo/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("Megiddo/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("Megiddo/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("Megiddo/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("Megiddo/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("Megiddo/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("Megiddo/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("Megiddo/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("Megiddo/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("Megiddo/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("Megiddo/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("Megiddo/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("Megiddo/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("Megiddo/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("Megiddo/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("Megiddo/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("Megiddo/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("Megiddo/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("Megiddo/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("Megiddo/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("Megiddo/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("Megiddo/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("Megiddo/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("Megiddo/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("Megiddo/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("Megiddo/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("Megiddo/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("Megiddo/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("Megiddo/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("Megiddo/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("Megiddo/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("Megiddo/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("Megiddo/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("Megiddo/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("Megiddo/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("Megiddo/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("Megiddo/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("Megiddo/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("Megiddo/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("Megiddo/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("Megiddo/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("Megiddo/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("Megiddo/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("Megiddo/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("Megiddo/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("Megiddo/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("Megiddo/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("Megiddo/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("Megiddo/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("Megiddo/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("Megiddo/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("Megiddo/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("Megiddo/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("Megiddo/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("Megiddo/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("Megiddo/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("Megiddo/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("Megiddo/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("Megiddo/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("Megiddo/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("Megiddo/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("Megiddo/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("Megiddo/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("Megiddo/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("Megiddo/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("Megiddo/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("Megiddo/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("Megiddo/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("Megiddo/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("Megiddo/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("Megiddo/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("Megiddo/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("Megiddo/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("Megiddo/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("Megiddo/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("Megiddo/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("Megiddo/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("Megiddo/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("Megiddo/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("Megiddo/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("Megiddo/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("Megiddo/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("Megiddo/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("Megiddo/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("Megiddo/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("Megiddo/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("Megiddo/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("Megiddo/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("Megiddo/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("Megiddo/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("Megiddo/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("Megiddo/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			case 93:
				ImageIcon im93 = new ImageIcon("Megiddo/093.PNG");
				Image w93 = im93.getImage();
				g.drawImage(w93, 0, 0, 500, 500, this);
				break;

			case 94:
				ImageIcon im94 = new ImageIcon("Megiddo/094.PNG");
				Image w94 = im94.getImage();
				g.drawImage(w94, 0, 0, 500, 500, this);
				break;

			case 95:
				ImageIcon im95 = new ImageIcon("Megiddo/095.PNG");
				Image w95 = im95.getImage();
				g.drawImage(w95, 0, 0, 500, 500, this);
				break;

			case 96:
				ImageIcon im96 = new ImageIcon("Megiddo/096.PNG");
				Image w96 = im96.getImage();
				g.drawImage(w96, 0, 0, 500, 500, this);
				break;

			case 97:
				ImageIcon im97 = new ImageIcon("Megiddo/097.PNG");
				Image w97 = im97.getImage();
				g.drawImage(w97, 0, 0, 500, 500, this);
				break;

			case 98:
				ImageIcon im98 = new ImageIcon("Megiddo/098.PNG");
				Image w98 = im98.getImage();
				g.drawImage(w98, 0, 0, 500, 500, this);
				break;

			case 99:
				ImageIcon im99 = new ImageIcon("Megiddo/099.PNG");
				Image w99 = im99.getImage();
				g.drawImage(w99, 0, 0, 500, 500, this);
				break;

			case 100:
				ImageIcon im100 = new ImageIcon("Megiddo/100.PNG");
				Image w100 = im100.getImage();
				g.drawImage(w100, 0, 0, 500, 500, this);
				break;

			case 101:
				ImageIcon im101 = new ImageIcon("Megiddo/101.PNG");
				Image w101 = im101.getImage();
				g.drawImage(w101, 0, 0, 500, 500, this);
				break;

			case 102:
				ImageIcon im102 = new ImageIcon("Megiddo/102.PNG");
				Image w102 = im102.getImage();
				g.drawImage(w102, 0, 0, 500, 500, this);
				break;

			case 103:
				ImageIcon im103 = new ImageIcon("Megiddo/103.PNG");
				Image w103 = im103.getImage();
				g.drawImage(w103, 0, 0, 500, 500, this);
				break;

			case 104:
				ImageIcon im104 = new ImageIcon("Megiddo/104.PNG");
				Image w104 = im104.getImage();
				g.drawImage(w104, 0, 0, 500, 500, this);
				break;

			case 105:
				ImageIcon im105 = new ImageIcon("Megiddo/105.PNG");
				Image w105 = im105.getImage();
				g.drawImage(w105, 0, 0, 500, 500, this);
				break;

			case 106:
				ImageIcon im106 = new ImageIcon("Megiddo/106.PNG");
				Image w106 = im106.getImage();
				g.drawImage(w106, 0, 0, 500, 500, this);
				break;

			case 107:
				ImageIcon im107 = new ImageIcon("Megiddo/107.PNG");
				Image w107 = im107.getImage();
				g.drawImage(w107, 0, 0, 500, 500, this);
				break;

			case 108:
				ImageIcon im108 = new ImageIcon("Megiddo/108.PNG");
				Image w108 = im108.getImage();
				g.drawImage(w108, 0, 0, 500, 500, this);
				break;

			case 109:
				ImageIcon im109 = new ImageIcon("Megiddo/109.PNG");
				Image w109 = im109.getImage();
				g.drawImage(w109, 0, 0, 500, 500, this);
				break;

			case 110:
				ImageIcon im110 = new ImageIcon("Megiddo/110.PNG");
				Image w110 = im110.getImage();
				g.drawImage(w110, 0, 0, 500, 500, this);
				break;

			case 111:
				ImageIcon im111 = new ImageIcon("Megiddo/111.PNG");
				Image w111 = im111.getImage();
				g.drawImage(w111, 0, 0, 500, 500, this);
				break;

			case 112:
				ImageIcon im112 = new ImageIcon("Megiddo/112.PNG");
				Image w112 = im112.getImage();
				g.drawImage(w112, 0, 0, 500, 500, this);
				break;

			case 113:
				ImageIcon im113 = new ImageIcon("Megiddo/113.PNG");
				Image w113 = im113.getImage();
				g.drawImage(w113, 0, 0, 500, 500, this);
				break;

			case 114:
				ImageIcon im114 = new ImageIcon("Megiddo/114.PNG");
				Image w114 = im114.getImage();
				g.drawImage(w114, 0, 0, 500, 500, this);
				break;

			case 115:
				ImageIcon im115 = new ImageIcon("Megiddo/115.PNG");
				Image w115 = im115.getImage();
				g.drawImage(w115, 0, 0, 500, 500, this);
				break;

			case 116:
				ImageIcon im116 = new ImageIcon("Megiddo/116.PNG");
				Image w116 = im116.getImage();
				g.drawImage(w116, 0, 0, 500, 500, this);
				break;

			case 117:
				ImageIcon im117 = new ImageIcon("Megiddo/117.PNG");
				Image w117 = im117.getImage();
				g.drawImage(w117, 0, 0, 500, 500, this);
				break;

			case 118:
				ImageIcon im118 = new ImageIcon("Megiddo/118.PNG");
				Image w118 = im118.getImage();
				g.drawImage(w118, 0, 0, 500, 500, this);
				break;

			case 119:
				ImageIcon im119 = new ImageIcon("Megiddo/119.PNG");
				Image w119 = im119.getImage();
				g.drawImage(w119, 0, 0, 500, 500, this);
				break;

			case 120:
				ImageIcon im120 = new ImageIcon("Megiddo/120.PNG");
				Image w120 = im120.getImage();
				g.drawImage(w120, 0, 0, 500, 500, this);
				break;

			case 121:
				ImageIcon im121 = new ImageIcon("Megiddo/121.PNG");
				Image w121 = im121.getImage();
				g.drawImage(w121, 0, 0, 500, 500, this);
				break;

			case 122:
				ImageIcon im122 = new ImageIcon("Megiddo/122.PNG");
				Image w122 = im122.getImage();
				g.drawImage(w122, 0, 0, 500, 500, this);
				break;

			case 123:
				ImageIcon im123 = new ImageIcon("Megiddo/123.PNG");
				Image w123 = im123.getImage();
				g.drawImage(w123, 0, 0, 500, 500, this);
				break;

			case 124:
				ImageIcon im124 = new ImageIcon("Megiddo/124.PNG");
				Image w124 = im124.getImage();
				g.drawImage(w124, 0, 0, 500, 500, this);
				break;

			case 125:
				ImageIcon im125 = new ImageIcon("Megiddo/125.PNG");
				Image w125 = im125.getImage();
				g.drawImage(w125, 0, 0, 500, 500, this);
				break;

			case 126:
				ImageIcon im126 = new ImageIcon("Megiddo/126.PNG");
				Image w126 = im126.getImage();
				g.drawImage(w126, 0, 0, 500, 500, this);
				break;

			case 127:
				ImageIcon im127 = new ImageIcon("Megiddo/127.PNG");
				Image w127 = im127.getImage();
				g.drawImage(w127, 0, 0, 500, 500, this);
				break;

			case 128:
				ImageIcon im128 = new ImageIcon("Megiddo/128.PNG");
				Image w128 = im128.getImage();
				g.drawImage(w128, 0, 0, 500, 500, this);
				break;

			case 129:
				ImageIcon im129 = new ImageIcon("Megiddo/129.PNG");
				Image w129 = im129.getImage();
				g.drawImage(w129, 0, 0, 500, 500, this);
				break;

			case 130:
				ImageIcon im130 = new ImageIcon("Megiddo/130.PNG");
				Image w130 = im130.getImage();
				g.drawImage(w130, 0, 0, 500, 500, this);
				break;

			case 131:
				ImageIcon im131 = new ImageIcon("Megiddo/131.PNG");
				Image w131 = im131.getImage();
				g.drawImage(w131, 0, 0, 500, 500, this);
				break;

			case 132:
				ImageIcon im132 = new ImageIcon("Megiddo/132.PNG");
				Image w132 = im132.getImage();
				g.drawImage(w132, 0, 0, 500, 500, this);
				break;

			case 133:
				ImageIcon im133 = new ImageIcon("Megiddo/133.PNG");
				Image w133 = im133.getImage();
				g.drawImage(w133, 0, 0, 500, 500, this);
				break;

			case 134:
				ImageIcon im134 = new ImageIcon("Megiddo/134.PNG");
				Image w134 = im134.getImage();
				g.drawImage(w134, 0, 0, 500, 500, this);
				break;

			case 135:
				ImageIcon im135 = new ImageIcon("Megiddo/135.PNG");
				Image w135 = im135.getImage();
				g.drawImage(w135, 0, 0, 500, 500, this);
				break;

			case 136:
				ImageIcon im136 = new ImageIcon("Megiddo/136.PNG");
				Image w136 = im136.getImage();
				g.drawImage(w136, 0, 0, 500, 500, this);
				break;

			case 137:
				ImageIcon im137 = new ImageIcon("Megiddo/137.PNG");
				Image w137 = im137.getImage();
				g.drawImage(w137, 0, 0, 500, 500, this);
				break;

			case 138:
				ImageIcon im138 = new ImageIcon("Megiddo/138.PNG");
				Image w138 = im138.getImage();
				g.drawImage(w138, 0, 0, 500, 500, this);
				break;

			case 139:
				ImageIcon im139 = new ImageIcon("Megiddo/139.PNG");
				Image w139 = im139.getImage();
				g.drawImage(w139, 0, 0, 500, 500, this);
				break;

			case 140:
				ImageIcon im140 = new ImageIcon("Megiddo/140.PNG");
				Image w140 = im140.getImage();
				g.drawImage(w140, 0, 0, 500, 500, this);
				break;

			case 141:
				ImageIcon im141 = new ImageIcon("Megiddo/141.PNG");
				Image w141 = im141.getImage();
				g.drawImage(w141, 0, 0, 500, 500, this);
				break;

			case 142:
				ImageIcon im142 = new ImageIcon("Megiddo/142.PNG");
				Image w142 = im142.getImage();
				g.drawImage(w142, 0, 0, 500, 500, this);
				break;

			case 143:
				ImageIcon im143 = new ImageIcon("Megiddo/143.PNG");
				Image w143 = im143.getImage();
				g.drawImage(w143, 0, 0, 500, 500, this);
				break;

			case 144:
				ImageIcon im144 = new ImageIcon("Megiddo/144.PNG");
				Image w144 = im144.getImage();
				g.drawImage(w144, 0, 0, 500, 500, this);
				break;

			case 145:
				ImageIcon im145 = new ImageIcon("Megiddo/145.PNG");
				Image w145 = im145.getImage();
				g.drawImage(w145, 0, 0, 500, 500, this);
				break;

			case 146:
				ImageIcon im146 = new ImageIcon("Megiddo/146.PNG");
				Image w146 = im146.getImage();
				g.drawImage(w146, 0, 0, 500, 500, this);
				break;

			case 147:
				ImageIcon im147 = new ImageIcon("Megiddo/147.PNG");
				Image w147 = im147.getImage();
				g.drawImage(w147, 0, 0, 500, 500, this);
				break;

			case 148:
				ImageIcon im148 = new ImageIcon("Megiddo/148.PNG");
				Image w148 = im148.getImage();
				g.drawImage(w148, 0, 0, 500, 500, this);
				break;

			case 149:
				ImageIcon im149 = new ImageIcon("Megiddo/149.PNG");
				Image w149 = im149.getImage();
				g.drawImage(w149, 0, 0, 500, 500, this);
				break;

			case 150:
				ImageIcon im150 = new ImageIcon("Megiddo/150.PNG");
				Image w150 = im150.getImage();
				g.drawImage(w150, 0, 0, 500, 500, this);
				break;

			case 151:
				ImageIcon im151 = new ImageIcon("Megiddo/151.PNG");
				Image w151 = im151.getImage();
				g.drawImage(w151, 0, 0, 500, 500, this);
				break;

			case 152:
				ImageIcon im152 = new ImageIcon("Megiddo/152.PNG");
				Image w152 = im152.getImage();
				g.drawImage(w152, 0, 0, 500, 500, this);
				break;

			case 153:
				ImageIcon im153 = new ImageIcon("Megiddo/153.PNG");
				Image w153 = im153.getImage();
				g.drawImage(w153, 0, 0, 500, 500, this);
				break;

			case 154:
				ImageIcon im154 = new ImageIcon("Megiddo/154.PNG");
				Image w154 = im154.getImage();
				g.drawImage(w154, 0, 0, 500, 500, this);
				break;

			case 155:
				ImageIcon im155 = new ImageIcon("Megiddo/155.PNG");
				Image w155 = im155.getImage();
				g.drawImage(w155, 0, 0, 500, 500, this);
				break;

			case 156:
				ImageIcon im156 = new ImageIcon("Megiddo/156.PNG");
				Image w156 = im156.getImage();
				g.drawImage(w156, 0, 0, 500, 500, this);
				break;

			case 157:
				ImageIcon im157 = new ImageIcon("Megiddo/157.PNG");
				Image w157 = im157.getImage();
				g.drawImage(w157, 0, 0, 500, 500, this);
				break;

			case 158:
				ImageIcon im158 = new ImageIcon("Megiddo/158.PNG");
				Image w158 = im158.getImage();
				g.drawImage(w158, 0, 0, 500, 500, this);
				break;

			case 159:
				ImageIcon im159 = new ImageIcon("Megiddo/159.PNG");
				Image w159 = im159.getImage();
				g.drawImage(w159, 0, 0, 500, 500, this);
				break;

			case 160:
				ImageIcon im160 = new ImageIcon("Megiddo/160.PNG");
				Image w160 = im160.getImage();
				g.drawImage(w160, 0, 0, 500, 500, this);
				break;

			case 161:
				ImageIcon im161 = new ImageIcon("Megiddo/161.PNG");
				Image w161 = im161.getImage();
				g.drawImage(w161, 0, 0, 500, 500, this);
				break;

			case 162:
				ImageIcon im162 = new ImageIcon("Megiddo/162.PNG");
				Image w162 = im162.getImage();
				g.drawImage(w162, 0, 0, 500, 500, this);
				break;

			case 163:
				ImageIcon im163 = new ImageIcon("Megiddo/163.PNG");
				Image w163 = im163.getImage();
				g.drawImage(w163, 0, 0, 500, 500, this);
				break;

			case 164:
				ImageIcon im164 = new ImageIcon("Megiddo/164.PNG");
				Image w164 = im164.getImage();
				g.drawImage(w164, 0, 0, 500, 500, this);
				break;

			case 165:
				ImageIcon im165 = new ImageIcon("Megiddo/165.PNG");
				Image w165 = im165.getImage();
				g.drawImage(w165, 0, 0, 500, 500, this);
				break;

			case 166:
				ImageIcon im166 = new ImageIcon("Megiddo/166.PNG");
				Image w166 = im166.getImage();
				g.drawImage(w166, 0, 0, 500, 500, this);
				break;

			case 167:
				ImageIcon im167 = new ImageIcon("Megiddo/167.PNG");
				Image w167 = im167.getImage();
				g.drawImage(w167, 0, 0, 500, 500, this);
				break;

			case 168:
				ImageIcon im168 = new ImageIcon("Megiddo/168.PNG");
				Image w168 = im168.getImage();
				g.drawImage(w168, 0, 0, 500, 500, this);
				break;

			case 169:
				ImageIcon im169 = new ImageIcon("Megiddo/169.PNG");
				Image w169 = im169.getImage();
				g.drawImage(w169, 0, 0, 500, 500, this);
				break;

			case 170:
				ImageIcon im170 = new ImageIcon("Megiddo/170.PNG");
				Image w170 = im170.getImage();
				g.drawImage(w170, 0, 0, 500, 500, this);
				break;

			case 171:
				ImageIcon im171 = new ImageIcon("Megiddo/171.PNG");
				Image w171 = im171.getImage();
				g.drawImage(w171, 0, 0, 500, 500, this);
				break;

			case 172:
				ImageIcon im172 = new ImageIcon("Megiddo/172.PNG");
				Image w172 = im172.getImage();
				g.drawImage(w172, 0, 0, 500, 500, this);
				break;

			case 173:
				ImageIcon im173 = new ImageIcon("Megiddo/173.PNG");
				Image w173 = im173.getImage();
				g.drawImage(w173, 0, 0, 500, 500, this);
				break;

			case 174:
				ImageIcon im174 = new ImageIcon("Megiddo/174.PNG");
				Image w174 = im174.getImage();
				g.drawImage(w174, 0, 0, 500, 500, this);
				break;

			case 175:
				ImageIcon im175 = new ImageIcon("Megiddo/175.PNG");
				Image w175 = im175.getImage();
				g.drawImage(w175, 0, 0, 500, 500, this);
				break;

			case 176:
				ImageIcon im176 = new ImageIcon("Megiddo/176.PNG");
				Image w176 = im176.getImage();
				g.drawImage(w176, 0, 0, 500, 500, this);
				break;

			case 177:
				ImageIcon im177 = new ImageIcon("Megiddo/177.PNG");
				Image w177 = im177.getImage();
				g.drawImage(w177, 0, 0, 500, 500, this);
				break;

			case 178:
				ImageIcon im178 = new ImageIcon("Megiddo/178.PNG");
				Image w178 = im178.getImage();
				g.drawImage(w178, 0, 0, 500, 500, this);
				break;

			case 179:
				ImageIcon im179 = new ImageIcon("Megiddo/179.PNG");
				Image w179 = im179.getImage();
				g.drawImage(w179, 0, 0, 500, 500, this);
				break;

			case 180:
				ImageIcon im180 = new ImageIcon("Megiddo/180.PNG");
				Image w180 = im180.getImage();
				g.drawImage(w180, 0, 0, 500, 500, this);
				break;

			case 181:
				ImageIcon im181 = new ImageIcon("Megiddo/181.PNG");
				Image w181 = im181.getImage();
				g.drawImage(w181, 0, 0, 500, 500, this);
				break;

			case 182:
				ImageIcon im182 = new ImageIcon("Megiddo/182.PNG");
				Image w182 = im182.getImage();
				g.drawImage(w182, 0, 0, 500, 500, this);
				break;

			case 183:
				ImageIcon im183 = new ImageIcon("Megiddo/183.PNG");
				Image w183 = im183.getImage();
				g.drawImage(w183, 0, 0, 500, 500, this);
				break;

			case 184:
				ImageIcon im184 = new ImageIcon("Megiddo/184.PNG");
				Image w184 = im184.getImage();
				g.drawImage(w184, 0, 0, 500, 500, this);
				break;

			case 185:
				ImageIcon im185 = new ImageIcon("Megiddo/185.PNG");
				Image w185 = im185.getImage();
				g.drawImage(w185, 0, 0, 500, 500, this);
				break;

			case 186:
				ImageIcon im186 = new ImageIcon("Megiddo/186.PNG");
				Image w186 = im186.getImage();
				g.drawImage(w186, 0, 0, 500, 500, this);
				break;

			case 187:
				ImageIcon im187 = new ImageIcon("Megiddo/187.PNG");
				Image w187 = im187.getImage();
				g.drawImage(w187, 0, 0, 500, 500, this);
				break;

			case 188:
				ImageIcon im188 = new ImageIcon("Megiddo/188.PNG");
				Image w188 = im188.getImage();
				g.drawImage(w188, 0, 0, 500, 500, this);
				break;

			}
		}

		// CYNTHIA
		if (speciaux[2]) {
			switch (speciau[2]) {
			case 1:
				ImageIcon im1 = new ImageIcon("LetheAlbion/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("LetheAlbion/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("LetheAlbion/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("LetheAlbion/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("LetheAlbion/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("LetheAlbion/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("LetheAlbion/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("LetheAlbion/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("LetheAlbion/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("LetheAlbion/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("LetheAlbion/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("LetheAlbion/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("LetheAlbion/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("LetheAlbion/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("LetheAlbion/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("LetheAlbion/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("LetheAlbion/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("LetheAlbion/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("LetheAlbion/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("LetheAlbion/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("LetheAlbion/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("LetheAlbion/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("LetheAlbion/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("LetheAlbion/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("LetheAlbion/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("LetheAlbion/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("LetheAlbion/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("LetheAlbion/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("LetheAlbion/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("LetheAlbion/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("LetheAlbion/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("LetheAlbion/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("LetheAlbion/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("LetheAlbion/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("LetheAlbion/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("LetheAlbion/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("LetheAlbion/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("LetheAlbion/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("LetheAlbion/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("LetheAlbion/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("LetheAlbion/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("LetheAlbion/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("LetheAlbion/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("LetheAlbion/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("LetheAlbion/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("LetheAlbion/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			}
		}

		if (speciaux[3]) {
			switch (speciau[3]) {
			case 1:
				ImageIcon im1 = new ImageIcon("HydroSlash/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("HydroSlash/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("HydroSlash/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("HydroSlash/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("HydroSlash/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("HydroSlash/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("HydroSlash/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("HydroSlash/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("HydroSlash/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("HydroSlash/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("HydroSlash/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("HydroSlash/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("HydroSlash/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("HydroSlash/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("HydroSlash/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("HydroSlash/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("HydroSlash/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("HydroSlash/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("HydroSlash/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("HydroSlash/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("HydroSlash/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("HydroSlash/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("HydroSlash/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("HydroSlash/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("HydroSlash/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("HydroSlash/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("HydroSlash/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("HydroSlash/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("HydroSlash/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("HydroSlash/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("HydroSlash/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("HydroSlash/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("HydroSlash/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("HydroSlash/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("HydroSlash/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("HydroSlash/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("HydroSlash/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("HydroSlash/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("HydroSlash/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("HydroSlash/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("HydroSlash/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("HydroSlash/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("HydroSlash/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("HydroSlash/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("HydroSlash/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("HydroSlash/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("HydroSlash/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("HydroSlash/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("HydroSlash/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("HydroSlash/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("HydroSlash/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("HydroSlash/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("HydroSlash/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("HydroSlash/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("HydroSlash/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("HydroSlash/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("HydroSlash/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("HydroSlash/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("HydroSlash/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			}
		}

		if (speciaux[5]) {
			switch (speciau[5]) {
			case 1:
				ImageIcon im1 = new ImageIcon("ShiningStar/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("ShiningStar/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("ShiningStar/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("ShiningStar/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("ShiningStar/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("ShiningStar/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("ShiningStar/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("ShiningStar/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("ShiningStar/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("ShiningStar/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("ShiningStar/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("ShiningStar/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("ShiningStar/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("ShiningStar/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("ShiningStar/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("ShiningStar/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("ShiningStar/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("ShiningStar/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("ShiningStar/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("ShiningStar/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("ShiningStar/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("ShiningStar/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("ShiningStar/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("ShiningStar/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("ShiningStar/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("ShiningStar/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("ShiningStar/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("ShiningStar/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("ShiningStar/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("ShiningStar/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("ShiningStar/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("ShiningStar/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("ShiningStar/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("ShiningStar/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("ShiningStar/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("ShiningStar/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("ShiningStar/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("ShiningStar/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("ShiningStar/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("ShiningStar/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("ShiningStar/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("ShiningStar/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("ShiningStar/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("ShiningStar/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("ShiningStar/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("ShiningStar/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("ShiningStar/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("ShiningStar/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("ShiningStar/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("ShiningStar/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("ShiningStar/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("ShiningStar/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("ShiningStar/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("ShiningStar/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("ShiningStar/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("ShiningStar/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("ShiningStar/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("ShiningStar/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("ShiningStar/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("ShiningStar/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("ShiningStar/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("ShiningStar/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("ShiningStar/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("ShiningStar/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("ShiningStar/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("ShiningStar/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("ShiningStar/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("ShiningStar/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("ShiningStar/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("ShiningStar/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("ShiningStar/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("ShiningStar/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("ShiningStar/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("ShiningStar/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("ShiningStar/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("ShiningStar/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("ShiningStar/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("ShiningStar/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("ShiningStar/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("ShiningStar/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("ShiningStar/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("ShiningStar/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("ShiningStar/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("ShiningStar/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("ShiningStar/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("ShiningStar/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("ShiningStar/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("ShiningStar/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("ShiningStar/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("ShiningStar/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("ShiningStar/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("ShiningStar/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			}
		}
		verifmew(g);
		
	}

	public void verifmew(Graphics g) {
		if (speciaux[6]) {
			switch (speciau[6]) {
			case 1:
				ImageIcon im1 = new ImageIcon("mattack2/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("mattack2/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("mattack2/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("mattack2/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("mattack2/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("mattack2/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("mattack2/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("mattack2/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("mattack2/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("mattack2/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("mattack2/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("mattack2/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("mattack2/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("mattack2/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("mattack2/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("mattack2/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("mattack2/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("mattack2/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("mattack2/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("mattack2/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("mattack2/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("mattack2/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("mattack2/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("mattack2/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("mattack2/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("mattack2/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("mattack2/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("mattack2/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("mattack2/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("mattack2/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("mattack2/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("mattack2/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("mattack2/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("mattack2/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("mattack2/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("mattack2/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("mattack2/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("mattack2/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("mattack2/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("mattack2/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("mattack2/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("mattack2/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("mattack2/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("mattack2/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("mattack2/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("mattack2/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("mattack2/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("mattack2/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("mattack2/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("mattack2/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("mattack2/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("mattack2/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("mattack2/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("mattack2/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("mattack2/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("mattack2/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("mattack2/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("mattack2/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("mattack2/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("mattack2/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("mattack2/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("mattack2/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("mattack2/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("mattack2/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("mattack2/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("mattack2/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("mattack2/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("mattack2/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("mattack2/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("mattack2/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("mattack2/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("mattack2/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("mattack2/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("mattack2/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("mattack2/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("mattack2/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("mattack2/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("mattack2/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("mattack2/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("mattack2/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("mattack2/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("mattack2/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("mattack2/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("mattack2/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("mattack2/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("mattack2/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("mattack2/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("mattack2/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("mattack2/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("mattack2/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("mattack2/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("mattack2/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			case 93:
				ImageIcon im93 = new ImageIcon("mattack2/093.PNG");
				Image w93 = im93.getImage();
				g.drawImage(w93, 0, 0, 500, 500, this);
				break;

			case 94:
				ImageIcon im94 = new ImageIcon("mattack2/094.PNG");
				Image w94 = im94.getImage();
				g.drawImage(w94, 0, 0, 500, 500, this);
				break;

			case 95:
				ImageIcon im95 = new ImageIcon("mattack2/095.PNG");
				Image w95 = im95.getImage();
				g.drawImage(w95, 0, 0, 500, 500, this);
				break;

			case 96:
				ImageIcon im96 = new ImageIcon("mattack2/096.PNG");
				Image w96 = im96.getImage();
				g.drawImage(w96, 0, 0, 500, 500, this);
				break;

			case 97:
				ImageIcon im97 = new ImageIcon("mattack2/097.PNG");
				Image w97 = im97.getImage();
				g.drawImage(w97, 0, 0, 500, 500, this);
				break;

			case 98:
				ImageIcon im98 = new ImageIcon("mattack2/098.PNG");
				Image w98 = im98.getImage();
				g.drawImage(w98, 0, 0, 500, 500, this);
				break;

			case 99:
				ImageIcon im99 = new ImageIcon("mattack2/099.PNG");
				Image w99 = im99.getImage();
				g.drawImage(w99, 0, 0, 500, 500, this);
				break;

			case 100:
				ImageIcon im100 = new ImageIcon("mattack2/100.PNG");
				Image w100 = im100.getImage();
				g.drawImage(w100, 0, 0, 500, 500, this);
				break;

			case 101:
				ImageIcon im101 = new ImageIcon("mattack2/101.PNG");
				Image w101 = im101.getImage();
				g.drawImage(w101, 0, 0, 500, 500, this);
				break;

			case 102:
				ImageIcon im102 = new ImageIcon("mattack2/102.PNG");
				Image w102 = im102.getImage();
				g.drawImage(w102, 0, 0, 500, 500, this);
				break;

			case 103:
				ImageIcon im103 = new ImageIcon("mattack2/103.PNG");
				Image w103 = im103.getImage();
				g.drawImage(w103, 0, 0, 500, 500, this);
				break;

			case 104:
				ImageIcon im104 = new ImageIcon("mattack2/104.PNG");
				Image w104 = im104.getImage();
				g.drawImage(w104, 0, 0, 500, 500, this);
				break;

			case 105:
				ImageIcon im105 = new ImageIcon("mattack2/105.PNG");
				Image w105 = im105.getImage();
				g.drawImage(w105, 0, 0, 500, 500, this);
				break;

			case 106:
				ImageIcon im106 = new ImageIcon("mattack2/106.PNG");
				Image w106 = im106.getImage();
				g.drawImage(w106, 0, 0, 500, 500, this);
				break;

			case 107:
				ImageIcon im107 = new ImageIcon("mattack2/107.PNG");
				Image w107 = im107.getImage();
				g.drawImage(w107, 0, 0, 500, 500, this);
				break;

			case 108:
				ImageIcon im108 = new ImageIcon("mattack2/108.PNG");
				Image w108 = im108.getImage();
				g.drawImage(w108, 0, 0, 500, 500, this);
				break;

			case 109:
				ImageIcon im109 = new ImageIcon("mattack2/109.PNG");
				Image w109 = im109.getImage();
				g.drawImage(w109, 0, 0, 500, 500, this);
				break;

			case 110:
				ImageIcon im110 = new ImageIcon("mattack2/110.PNG");
				Image w110 = im110.getImage();
				g.drawImage(w110, 0, 0, 500, 500, this);
				break;

			case 111:
				ImageIcon im111 = new ImageIcon("mattack2/111.PNG");
				Image w111 = im111.getImage();
				g.drawImage(w111, 0, 0, 500, 500, this);
				break;

			case 112:
				ImageIcon im112 = new ImageIcon("mattack2/112.PNG");
				Image w112 = im112.getImage();
				g.drawImage(w112, 0, 0, 500, 500, this);
				break;

			case 113:
				ImageIcon im113 = new ImageIcon("mattack2/113.PNG");
				Image w113 = im113.getImage();
				g.drawImage(w113, 0, 0, 500, 500, this);
				break;

			case 114:
				ImageIcon im114 = new ImageIcon("mattack2/114.PNG");
				Image w114 = im114.getImage();
				g.drawImage(w114, 0, 0, 500, 500, this);
				break;

			case 115:
				ImageIcon im115 = new ImageIcon("mattack2/115.PNG");
				Image w115 = im115.getImage();
				g.drawImage(w115, 0, 0, 500, 500, this);
				break;

			case 116:
				ImageIcon im116 = new ImageIcon("mattack2/116.PNG");
				Image w116 = im116.getImage();
				g.drawImage(w116, 0, 0, 500, 500, this);
				break;

			case 117:
				ImageIcon im117 = new ImageIcon("mattack2/117.PNG");
				Image w117 = im117.getImage();
				g.drawImage(w117, 0, 0, 500, 500, this);
				break;

			case 118:
				ImageIcon im118 = new ImageIcon("mattack2/118.PNG");
				Image w118 = im118.getImage();
				g.drawImage(w118, 0, 0, 500, 500, this);
				break;

			case 119:
				ImageIcon im119 = new ImageIcon("mattack2/119.PNG");
				Image w119 = im119.getImage();
				g.drawImage(w119, 0, 0, 500, 500, this);
				break;

			case 120:
				ImageIcon im120 = new ImageIcon("mattack2/120.PNG");
				Image w120 = im120.getImage();
				g.drawImage(w120, 0, 0, 500, 500, this);
				break;

			case 121:
				ImageIcon im121 = new ImageIcon("mattack2/121.PNG");
				Image w121 = im121.getImage();
				g.drawImage(w121, 0, 0, 500, 500, this);
				break;

			case 122:
				ImageIcon im122 = new ImageIcon("mattack2/122.PNG");
				Image w122 = im122.getImage();
				g.drawImage(w122, 0, 0, 500, 500, this);
				break;

			case 123:
				ImageIcon im123 = new ImageIcon("mattack2/123.PNG");
				Image w123 = im123.getImage();
				g.drawImage(w123, 0, 0, 500, 500, this);
				break;

			case 124:
				ImageIcon im124 = new ImageIcon("mattack2/124.PNG");
				Image w124 = im124.getImage();
				g.drawImage(w124, 0, 0, 500, 500, this);
				break;

			case 125:
				ImageIcon im125 = new ImageIcon("mattack2/125.PNG");
				Image w125 = im125.getImage();
				g.drawImage(w125, 0, 0, 500, 500, this);
				break;

			case 126:
				ImageIcon im126 = new ImageIcon("mattack2/126.PNG");
				Image w126 = im126.getImage();
				g.drawImage(w126, 0, 0, 500, 500, this);
				break;

			case 127:
				ImageIcon im127 = new ImageIcon("mattack2/127.PNG");
				Image w127 = im127.getImage();
				g.drawImage(w127, 0, 0, 500, 500, this);
				break;

			case 128:
				ImageIcon im128 = new ImageIcon("mattack2/128.PNG");
				Image w128 = im128.getImage();
				g.drawImage(w128, 0, 0, 500, 500, this);
				break;

			case 129:
				ImageIcon im129 = new ImageIcon("mattack2/129.PNG");
				Image w129 = im129.getImage();
				g.drawImage(w129, 0, 0, 500, 500, this);
				break;

			case 130:
				ImageIcon im130 = new ImageIcon("mattack2/130.PNG");
				Image w130 = im130.getImage();
				g.drawImage(w130, 0, 0, 500, 500, this);
				break;

			case 131:
				ImageIcon im131 = new ImageIcon("mattack2/131.PNG");
				Image w131 = im131.getImage();
				g.drawImage(w131, 0, 0, 500, 500, this);
				break;

			case 132:
				ImageIcon im132 = new ImageIcon("mattack2/132.PNG");
				Image w132 = im132.getImage();
				g.drawImage(w132, 0, 0, 500, 500, this);
				break;

			}
		}
		if (speciaux[7]) {
			switch (speciau[7]) {
			case 1:
				ImageIcon im1 = new ImageIcon("mattack/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("mattack/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("mattack/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("mattack/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("mattack/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("mattack/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("mattack/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("mattack/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("mattack/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("mattack/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("mattack/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("mattack/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("mattack/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("mattack/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("mattack/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("mattack/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("mattack/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("mattack/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("mattack/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("mattack/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("mattack/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("mattack/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("mattack/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("mattack/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("mattack/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("mattack/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("mattack/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("mattack/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("mattack/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("mattack/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("mattack/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("mattack/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("mattack/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("mattack/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("mattack/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("mattack/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("mattack/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("mattack/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("mattack/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("mattack/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("mattack/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("mattack/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("mattack/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("mattack/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("mattack/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("mattack/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("mattack/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("mattack/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("mattack/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("mattack/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("mattack/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("mattack/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("mattack/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("mattack/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("mattack/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("mattack/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("mattack/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("mattack/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("mattack/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("mattack/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("mattack/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("mattack/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("mattack/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("mattack/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("mattack/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("mattack/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("mattack/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("mattack/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("mattack/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("mattack/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("mattack/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("mattack/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("mattack/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("mattack/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("mattack/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("mattack/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("mattack/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("mattack/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("mattack/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("mattack/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("mattack/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("mattack/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("mattack/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("mattack/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("mattack/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("mattack/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("mattack/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("mattack/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("mattack/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("mattack/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("mattack/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("mattack/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			case 93:
				ImageIcon im93 = new ImageIcon("mattack/093.PNG");
				Image w93 = im93.getImage();
				g.drawImage(w93, 0, 0, 500, 500, this);
				break;

			case 94:
				ImageIcon im94 = new ImageIcon("mattack/094.PNG");
				Image w94 = im94.getImage();
				g.drawImage(w94, 0, 0, 500, 500, this);
				break;

			case 95:
				ImageIcon im95 = new ImageIcon("mattack/095.PNG");
				Image w95 = im95.getImage();
				g.drawImage(w95, 0, 0, 500, 500, this);
				break;

			case 96:
				ImageIcon im96 = new ImageIcon("mattack/096.PNG");
				Image w96 = im96.getImage();
				g.drawImage(w96, 0, 0, 500, 500, this);
				break;

			case 97:
				ImageIcon im97 = new ImageIcon("mattack/097.PNG");
				Image w97 = im97.getImage();
				g.drawImage(w97, 0, 0, 500, 500, this);
				break;

			case 98:
				ImageIcon im98 = new ImageIcon("mattack/098.PNG");
				Image w98 = im98.getImage();
				g.drawImage(w98, 0, 0, 500, 500, this);
				break;

			case 99:
				ImageIcon im99 = new ImageIcon("mattack/099.PNG");
				Image w99 = im99.getImage();
				g.drawImage(w99, 0, 0, 500, 500, this);
				break;

			case 100:
				ImageIcon im100 = new ImageIcon("mattack/100.PNG");
				Image w100 = im100.getImage();
				g.drawImage(w100, 0, 0, 500, 500, this);
				break;

			case 101:
				ImageIcon im101 = new ImageIcon("mattack/101.PNG");
				Image w101 = im101.getImage();
				g.drawImage(w101, 0, 0, 500, 500, this);
				break;

			case 102:
				ImageIcon im102 = new ImageIcon("mattack/102.PNG");
				Image w102 = im102.getImage();
				g.drawImage(w102, 0, 0, 500, 500, this);
				break;

			case 103:
				ImageIcon im103 = new ImageIcon("mattack/103.PNG");
				Image w103 = im103.getImage();
				g.drawImage(w103, 0, 0, 500, 500, this);
				break;

			case 104:
				ImageIcon im104 = new ImageIcon("mattack/104.PNG");
				Image w104 = im104.getImage();
				g.drawImage(w104, 0, 0, 500, 500, this);
				break;

			case 105:
				ImageIcon im105 = new ImageIcon("mattack/105.PNG");
				Image w105 = im105.getImage();
				g.drawImage(w105, 0, 0, 500, 500, this);
				break;

			case 106:
				ImageIcon im106 = new ImageIcon("mattack/106.PNG");
				Image w106 = im106.getImage();
				g.drawImage(w106, 0, 0, 500, 500, this);
				break;

			case 107:
				ImageIcon im107 = new ImageIcon("mattack/107.PNG");
				Image w107 = im107.getImage();
				g.drawImage(w107, 0, 0, 500, 500, this);
				break;

			case 108:
				ImageIcon im108 = new ImageIcon("mattack/108.PNG");
				Image w108 = im108.getImage();
				g.drawImage(w108, 0, 0, 500, 500, this);
				break;

			case 109:
				ImageIcon im109 = new ImageIcon("mattack/109.PNG");
				Image w109 = im109.getImage();
				g.drawImage(w109, 0, 0, 500, 500, this);
				break;

			case 110:
				ImageIcon im110 = new ImageIcon("mattack/110.PNG");
				Image w110 = im110.getImage();
				g.drawImage(w110, 0, 0, 500, 500, this);
				break;

			case 111:
				ImageIcon im111 = new ImageIcon("mattack/111.PNG");
				Image w111 = im111.getImage();
				g.drawImage(w111, 0, 0, 500, 500, this);
				break;

			case 112:
				ImageIcon im112 = new ImageIcon("mattack/112.PNG");
				Image w112 = im112.getImage();
				g.drawImage(w112, 0, 0, 500, 500, this);
				break;

			case 113:
				ImageIcon im113 = new ImageIcon("mattack/113.PNG");
				Image w113 = im113.getImage();
				g.drawImage(w113, 0, 0, 500, 500, this);
				break;

			case 114:
				ImageIcon im114 = new ImageIcon("mattack/114.PNG");
				Image w114 = im114.getImage();
				g.drawImage(w114, 0, 0, 500, 500, this);
				break;

			case 115:
				ImageIcon im115 = new ImageIcon("mattack/115.PNG");
				Image w115 = im115.getImage();
				g.drawImage(w115, 0, 0, 500, 500, this);
				break;

			case 116:
				ImageIcon im116 = new ImageIcon("mattack/116.PNG");
				Image w116 = im116.getImage();
				g.drawImage(w116, 0, 0, 500, 500, this);
				break;

			case 117:
				ImageIcon im117 = new ImageIcon("mattack/117.PNG");
				Image w117 = im117.getImage();
				g.drawImage(w117, 0, 0, 500, 500, this);
				break;

			case 118:
				ImageIcon im118 = new ImageIcon("mattack/118.PNG");
				Image w118 = im118.getImage();
				g.drawImage(w118, 0, 0, 500, 500, this);
				break;

			case 119:
				ImageIcon im119 = new ImageIcon("mattack/119.PNG");
				Image w119 = im119.getImage();
				g.drawImage(w119, 0, 0, 500, 500, this);
				break;

			case 120:
				ImageIcon im120 = new ImageIcon("mattack/120.PNG");
				Image w120 = im120.getImage();
				g.drawImage(w120, 0, 0, 500, 500, this);
				break;

			case 121:
				ImageIcon im121 = new ImageIcon("mattack/121.PNG");
				Image w121 = im121.getImage();
				g.drawImage(w121, 0, 0, 500, 500, this);
				break;

			case 122:
				ImageIcon im122 = new ImageIcon("mattack/122.PNG");
				Image w122 = im122.getImage();
				g.drawImage(w122, 0, 0, 500, 500, this);
				break;

			case 123:
				ImageIcon im123 = new ImageIcon("mattack/123.PNG");
				Image w123 = im123.getImage();
				g.drawImage(w123, 0, 0, 500, 500, this);
				break;

			case 124:
				ImageIcon im124 = new ImageIcon("mattack/124.PNG");
				Image w124 = im124.getImage();
				g.drawImage(w124, 0, 0, 500, 500, this);
				break;

			case 125:
				ImageIcon im125 = new ImageIcon("mattack/125.PNG");
				Image w125 = im125.getImage();
				g.drawImage(w125, 0, 0, 500, 500, this);
				break;

			case 126:
				ImageIcon im126 = new ImageIcon("mattack/126.PNG");
				Image w126 = im126.getImage();
				g.drawImage(w126, 0, 0, 500, 500, this);
				break;

			case 127:
				ImageIcon im127 = new ImageIcon("mattack/127.PNG");
				Image w127 = im127.getImage();
				g.drawImage(w127, 0, 0, 500, 500, this);
				break;

			case 128:
				ImageIcon im128 = new ImageIcon("mattack/128.PNG");
				Image w128 = im128.getImage();
				g.drawImage(w128, 0, 0, 500, 500, this);
				break;

			case 129:
				ImageIcon im129 = new ImageIcon("mattack/129.PNG");
				Image w129 = im129.getImage();
				g.drawImage(w129, 0, 0, 500, 500, this);
				break;

			case 130:
				ImageIcon im130 = new ImageIcon("mattack/130.PNG");
				Image w130 = im130.getImage();
				g.drawImage(w130, 0, 0, 500, 500, this);
				break;

			case 131:
				ImageIcon im131 = new ImageIcon("mattack/131.PNG");
				Image w131 = im131.getImage();
				g.drawImage(w131, 0, 0, 500, 500, this);
				break;

			case 132:
				ImageIcon im132 = new ImageIcon("mattack/132.PNG");
				Image w132 = im132.getImage();
				g.drawImage(w132, 0, 0, 500, 500, this);
				break;

			case 133:
				ImageIcon im133 = new ImageIcon("mattack/133.PNG");
				Image w133 = im133.getImage();
				g.drawImage(w133, 0, 0, 500, 500, this);
				break;

			case 134:
				ImageIcon im134 = new ImageIcon("mattack/134.PNG");
				Image w134 = im134.getImage();
				g.drawImage(w134, 0, 0, 500, 500, this);
				break;

			case 135:
				ImageIcon im135 = new ImageIcon("mattack/135.PNG");
				Image w135 = im135.getImage();
				g.drawImage(w135, 0, 0, 500, 500, this);
				break;

			case 136:
				ImageIcon im136 = new ImageIcon("mattack/136.PNG");
				Image w136 = im136.getImage();
				g.drawImage(w136, 0, 0, 500, 500, this);
				break;

			case 137:
				ImageIcon im137 = new ImageIcon("mattack/137.PNG");
				Image w137 = im137.getImage();
				g.drawImage(w137, 0, 0, 500, 500, this);
				break;

			case 138:
				ImageIcon im138 = new ImageIcon("mattack/138.PNG");
				Image w138 = im138.getImage();
				g.drawImage(w138, 0, 0, 500, 500, this);
				break;

			case 139:
				ImageIcon im139 = new ImageIcon("mattack/139.PNG");
				Image w139 = im139.getImage();
				g.drawImage(w139, 0, 0, 500, 500, this);
				break;

			case 140:
				ImageIcon im140 = new ImageIcon("mattack/140.PNG");
				Image w140 = im140.getImage();
				g.drawImage(w140, 0, 0, 500, 500, this);
				break;

			case 141:
				ImageIcon im141 = new ImageIcon("mattack/141.PNG");
				Image w141 = im141.getImage();
				g.drawImage(w141, 0, 0, 500, 500, this);
				break;

			case 142:
				ImageIcon im142 = new ImageIcon("mattack/142.PNG");
				Image w142 = im142.getImage();
				g.drawImage(w142, 0, 0, 500, 500, this);
				break;

			case 143:
				ImageIcon im143 = new ImageIcon("mattack/143.PNG");
				Image w143 = im143.getImage();
				g.drawImage(w143, 0, 0, 500, 500, this);
				break;

			case 144:
				ImageIcon im144 = new ImageIcon("mattack/144.PNG");
				Image w144 = im144.getImage();
				g.drawImage(w144, 0, 0, 500, 500, this);
				break;

			case 145:
				ImageIcon im145 = new ImageIcon("mattack/145.PNG");
				Image w145 = im145.getImage();
				g.drawImage(w145, 0, 0, 500, 500, this);
				break;

			case 146:
				ImageIcon im146 = new ImageIcon("mattack/146.PNG");
				Image w146 = im146.getImage();
				g.drawImage(w146, 0, 0, 500, 500, this);
				break;

			case 147:
				ImageIcon im147 = new ImageIcon("mattack/147.PNG");
				Image w147 = im147.getImage();
				g.drawImage(w147, 0, 0, 500, 500, this);
				break;

			case 148:
				ImageIcon im148 = new ImageIcon("mattack/148.PNG");
				Image w148 = im148.getImage();
				g.drawImage(w148, 0, 0, 500, 500, this);
				break;

			case 149:
				ImageIcon im149 = new ImageIcon("mattack/149.PNG");
				Image w149 = im149.getImage();
				g.drawImage(w149, 0, 0, 500, 500, this);
				break;

			case 150:
				ImageIcon im150 = new ImageIcon("mattack/150.PNG");
				Image w150 = im150.getImage();
				g.drawImage(w150, 0, 0, 500, 500, this);
				break;

			case 151:
				ImageIcon im151 = new ImageIcon("mattack/151.PNG");
				Image w151 = im151.getImage();
				g.drawImage(w151, 0, 0, 500, 500, this);
				break;

			case 152:
				ImageIcon im152 = new ImageIcon("mattack/152.PNG");
				Image w152 = im152.getImage();
				g.drawImage(w152, 0, 0, 500, 500, this);
				break;

			case 153:
				ImageIcon im153 = new ImageIcon("mattack/153.PNG");
				Image w153 = im153.getImage();
				g.drawImage(w153, 0, 0, 500, 500, this);
				break;

			case 154:
				ImageIcon im154 = new ImageIcon("mattack/154.PNG");
				Image w154 = im154.getImage();
				g.drawImage(w154, 0, 0, 500, 500, this);
				break;

			case 155:
				ImageIcon im155 = new ImageIcon("mattack/155.PNG");
				Image w155 = im155.getImage();
				g.drawImage(w155, 0, 0, 500, 500, this);
				break;

			case 156:
				ImageIcon im156 = new ImageIcon("mattack/156.PNG");
				Image w156 = im156.getImage();
				g.drawImage(w156, 0, 0, 500, 500, this);
				break;

			case 157:
				ImageIcon im157 = new ImageIcon("mattack/157.PNG");
				Image w157 = im157.getImage();
				g.drawImage(w157, 0, 0, 500, 500, this);
				break;

			case 158:
				ImageIcon im158 = new ImageIcon("mattack/158.PNG");
				Image w158 = im158.getImage();
				g.drawImage(w158, 0, 0, 500, 500, this);
				break;

			case 159:
				ImageIcon im159 = new ImageIcon("mattack/159.PNG");
				Image w159 = im159.getImage();
				g.drawImage(w159, 0, 0, 500, 500, this);
				break;

			case 160:
				ImageIcon im160 = new ImageIcon("mattack/160.PNG");
				Image w160 = im160.getImage();
				g.drawImage(w160, 0, 0, 500, 500, this);
				break;

			case 161:
				ImageIcon im161 = new ImageIcon("mattack/161.PNG");
				Image w161 = im161.getImage();
				g.drawImage(w161, 0, 0, 500, 500, this);
				break;

			case 162:
				ImageIcon im162 = new ImageIcon("mattack/162.PNG");
				Image w162 = im162.getImage();
				g.drawImage(w162, 0, 0, 500, 500, this);
				break;

			case 163:
				ImageIcon im163 = new ImageIcon("mattack/163.PNG");
				Image w163 = im163.getImage();
				g.drawImage(w163, 0, 0, 500, 500, this);
				break;

			case 164:
				ImageIcon im164 = new ImageIcon("mattack/164.PNG");
				Image w164 = im164.getImage();
				g.drawImage(w164, 0, 0, 500, 500, this);
				break;

			case 165:
				ImageIcon im165 = new ImageIcon("mattack/165.PNG");
				Image w165 = im165.getImage();
				g.drawImage(w165, 0, 0, 500, 500, this);
				break;

			case 166:
				ImageIcon im166 = new ImageIcon("mattack/166.PNG");
				Image w166 = im166.getImage();
				g.drawImage(w166, 0, 0, 500, 500, this);
				break;

			case 167:
				ImageIcon im167 = new ImageIcon("mattack/167.PNG");
				Image w167 = im167.getImage();
				g.drawImage(w167, 0, 0, 500, 500, this);
				break;

			case 168:
				ImageIcon im168 = new ImageIcon("mattack/168.PNG");
				Image w168 = im168.getImage();
				g.drawImage(w168, 0, 0, 500, 500, this);
				break;

			case 169:
				ImageIcon im169 = new ImageIcon("mattack/169.PNG");
				Image w169 = im169.getImage();
				g.drawImage(w169, 0, 0, 500, 500, this);
				break;

			case 170:
				ImageIcon im170 = new ImageIcon("mattack/170.PNG");
				Image w170 = im170.getImage();
				g.drawImage(w170, 0, 0, 500, 500, this);
				break;

			case 171:
				ImageIcon im171 = new ImageIcon("mattack/171.PNG");
				Image w171 = im171.getImage();
				g.drawImage(w171, 0, 0, 500, 500, this);
				break;

			case 172:
				ImageIcon im172 = new ImageIcon("mattack/172.PNG");
				Image w172 = im172.getImage();
				g.drawImage(w172, 0, 0, 500, 500, this);
				break;

			case 173:
				ImageIcon im173 = new ImageIcon("mattack/173.PNG");
				Image w173 = im173.getImage();
				g.drawImage(w173, 0, 0, 500, 500, this);
				break;

			case 174:
				ImageIcon im174 = new ImageIcon("mattack/174.PNG");
				Image w174 = im174.getImage();
				g.drawImage(w174, 0, 0, 500, 500, this);
				break;

			case 175:
				ImageIcon im175 = new ImageIcon("mattack/175.PNG");
				Image w175 = im175.getImage();
				g.drawImage(w175, 0, 0, 500, 500, this);
				break;

			case 176:
				ImageIcon im176 = new ImageIcon("mattack/176.PNG");
				Image w176 = im176.getImage();
				g.drawImage(w176, 0, 0, 500, 500, this);
				break;

			case 177:
				ImageIcon im177 = new ImageIcon("mattack/177.PNG");
				Image w177 = im177.getImage();
				g.drawImage(w177, 0, 0, 500, 500, this);
				break;

			case 178:
				ImageIcon im178 = new ImageIcon("mattack/178.PNG");
				Image w178 = im178.getImage();
				g.drawImage(w178, 0, 0, 500, 500, this);
				break;

			case 179:
				ImageIcon im179 = new ImageIcon("mattack/179.PNG");
				Image w179 = im179.getImage();
				g.drawImage(w179, 0, 0, 500, 500, this);
				break;

			case 180:
				ImageIcon im180 = new ImageIcon("mattack/180.PNG");
				Image w180 = im180.getImage();
				g.drawImage(w180, 0, 0, 500, 500, this);
				break;

			case 181:
				ImageIcon im181 = new ImageIcon("mattack/181.PNG");
				Image w181 = im181.getImage();
				g.drawImage(w181, 0, 0, 500, 500, this);
				break;

			case 182:
				ImageIcon im182 = new ImageIcon("mattack/182.PNG");
				Image w182 = im182.getImage();
				g.drawImage(w182, 0, 0, 500, 500, this);
				break;

			case 183:
				ImageIcon im183 = new ImageIcon("mattack/183.PNG");
				Image w183 = im183.getImage();
				g.drawImage(w183, 0, 0, 500, 500, this);
				break;

			case 184:
				ImageIcon im184 = new ImageIcon("mattack/184.PNG");
				Image w184 = im184.getImage();
				g.drawImage(w184, 0, 0, 500, 500, this);
				break;

			case 185:
				ImageIcon im185 = new ImageIcon("mattack/185.PNG");
				Image w185 = im185.getImage();
				g.drawImage(w185, 0, 0, 500, 500, this);
				break;

			case 186:
				ImageIcon im186 = new ImageIcon("mattack/186.PNG");
				Image w186 = im186.getImage();
				g.drawImage(w186, 0, 0, 500, 500, this);
				break;

			case 187:
				ImageIcon im187 = new ImageIcon("mattack/187.PNG");
				Image w187 = im187.getImage();
				g.drawImage(w187, 0, 0, 500, 500, this);
				break;

			case 188:
				ImageIcon im188 = new ImageIcon("mattack/188.PNG");
				Image w188 = im188.getImage();
				g.drawImage(w188, 0, 0, 500, 500, this);
				break;

			case 189:
				ImageIcon im189 = new ImageIcon("mattack/189.PNG");
				Image w189 = im189.getImage();
				g.drawImage(w189, 0, 0, 500, 500, this);
				break;

			case 190:
				ImageIcon im190 = new ImageIcon("mattack/190.PNG");
				Image w190 = im190.getImage();
				g.drawImage(w190, 0, 0, 500, 500, this);
				break;

			case 191:
				ImageIcon im191 = new ImageIcon("mattack/191.PNG");
				Image w191 = im191.getImage();
				g.drawImage(w191, 0, 0, 500, 500, this);
				break;

			case 192:
				ImageIcon im192 = new ImageIcon("mattack/192.PNG");
				Image w192 = im192.getImage();
				g.drawImage(w192, 0, 0, 500, 500, this);
				break;

			case 193:
				ImageIcon im193 = new ImageIcon("mattack/193.PNG");
				Image w193 = im193.getImage();
				g.drawImage(w193, 0, 0, 500, 500, this);
				break;

			case 194:
				ImageIcon im194 = new ImageIcon("mattack/194.PNG");
				Image w194 = im194.getImage();
				g.drawImage(w194, 0, 0, 500, 500, this);
				break;

			case 195:
				ImageIcon im195 = new ImageIcon("mattack/195.PNG");
				Image w195 = im195.getImage();
				g.drawImage(w195, 0, 0, 500, 500, this);
				break;

			case 196:
				ImageIcon im196 = new ImageIcon("mattack/196.PNG");
				Image w196 = im196.getImage();
				g.drawImage(w196, 0, 0, 500, 500, this);
				break;

			case 197:
				ImageIcon im197 = new ImageIcon("mattack/197.PNG");
				Image w197 = im197.getImage();
				g.drawImage(w197, 0, 0, 500, 500, this);
				break;

			case 198:
				ImageIcon im198 = new ImageIcon("mattack/198.PNG");
				Image w198 = im198.getImage();
				g.drawImage(w198, 0, 0, 500, 500, this);
				break;

			case 199:
				ImageIcon im199 = new ImageIcon("mattack/199.PNG");
				Image w199 = im199.getImage();
				g.drawImage(w199, 0, 0, 500, 500, this);
				break;

			case 200:
				ImageIcon im200 = new ImageIcon("mattack/200.PNG");
				Image w200 = im200.getImage();
				g.drawImage(w200, 0, 0, 500, 500, this);
				break;

			case 201:
				ImageIcon im201 = new ImageIcon("mattack/201.PNG");
				Image w201 = im201.getImage();
				g.drawImage(w201, 0, 0, 500, 500, this);
				break;

			case 202:
				ImageIcon im202 = new ImageIcon("mattack/202.PNG");
				Image w202 = im202.getImage();
				g.drawImage(w202, 0, 0, 500, 500, this);
				break;

			case 203:
				ImageIcon im203 = new ImageIcon("mattack/203.PNG");
				Image w203 = im203.getImage();
				g.drawImage(w203, 0, 0, 500, 500, this);
				break;

			case 204:
				ImageIcon im204 = new ImageIcon("mattack/204.PNG");
				Image w204 = im204.getImage();
				g.drawImage(w204, 0, 0, 500, 500, this);
				break;

			case 205:
				ImageIcon im205 = new ImageIcon("mattack/205.PNG");
				Image w205 = im205.getImage();
				g.drawImage(w205, 0, 0, 500, 500, this);
				break;

			case 206:
				ImageIcon im206 = new ImageIcon("mattack/206.PNG");
				Image w206 = im206.getImage();
				g.drawImage(w206, 0, 0, 500, 500, this);
				break;

			case 207:
				ImageIcon im207 = new ImageIcon("mattack/207.PNG");
				Image w207 = im207.getImage();
				g.drawImage(w207, 0, 0, 500, 500, this);
				break;

			case 208:
				ImageIcon im208 = new ImageIcon("mattack/208.PNG");
				Image w208 = im208.getImage();
				g.drawImage(w208, 0, 0, 500, 500, this);
				break;

			case 209:
				ImageIcon im209 = new ImageIcon("mattack/209.PNG");
				Image w209 = im209.getImage();
				g.drawImage(w209, 0, 0, 500, 500, this);
				break;

			case 210:
				ImageIcon im210 = new ImageIcon("mattack/210.PNG");
				Image w210 = im210.getImage();
				g.drawImage(w210, 0, 0, 500, 500, this);
				break;

			case 211:
				ImageIcon im211 = new ImageIcon("mattack/211.PNG");
				Image w211 = im211.getImage();
				g.drawImage(w211, 0, 0, 500, 500, this);
				break;

			case 212:
				ImageIcon im212 = new ImageIcon("mattack/212.PNG");
				Image w212 = im212.getImage();
				g.drawImage(w212, 0, 0, 500, 500, this);
				break;

			case 213:
				ImageIcon im213 = new ImageIcon("mattack/213.PNG");
				Image w213 = im213.getImage();
				g.drawImage(w213, 0, 0, 500, 500, this);
				break;

			case 214:
				ImageIcon im214 = new ImageIcon("mattack/214.PNG");
				Image w214 = im214.getImage();
				g.drawImage(w214, 0, 0, 500, 500, this);
				break;

			case 215:
				ImageIcon im215 = new ImageIcon("mattack/215.PNG");
				Image w215 = im215.getImage();
				g.drawImage(w215, 0, 0, 500, 500, this);
				break;

			case 216:
				ImageIcon im216 = new ImageIcon("mattack/216.PNG");
				Image w216 = im216.getImage();
				g.drawImage(w216, 0, 0, 500, 500, this);
				break;

			case 217:
				ImageIcon im217 = new ImageIcon("mattack/217.PNG");
				Image w217 = im217.getImage();
				g.drawImage(w217, 0, 0, 500, 500, this);
				break;

			case 218:
				ImageIcon im218 = new ImageIcon("mattack/218.PNG");
				Image w218 = im218.getImage();
				g.drawImage(w218, 0, 0, 500, 500, this);
				break;

			case 219:
				ImageIcon im219 = new ImageIcon("mattack/219.PNG");
				Image w219 = im219.getImage();
				g.drawImage(w219, 0, 0, 500, 500, this);
				break;

			case 220:
				ImageIcon im220 = new ImageIcon("mattack/220.PNG");
				Image w220 = im220.getImage();
				g.drawImage(w220, 0, 0, 500, 500, this);
				break;

			case 221:
				ImageIcon im221 = new ImageIcon("mattack/221.PNG");
				Image w221 = im221.getImage();
				g.drawImage(w221, 0, 0, 500, 500, this);
				break;

			case 222:
				ImageIcon im222 = new ImageIcon("mattack/222.PNG");
				Image w222 = im222.getImage();
				g.drawImage(w222, 0, 0, 500, 500, this);
				break;

			case 223:
				ImageIcon im223 = new ImageIcon("mattack/223.PNG");
				Image w223 = im223.getImage();
				g.drawImage(w223, 0, 0, 500, 500, this);
				break;

			case 224:
				ImageIcon im224 = new ImageIcon("mattack/224.PNG");
				Image w224 = im224.getImage();
				g.drawImage(w224, 0, 0, 500, 500, this);
				break;

			case 225:
				ImageIcon im225 = new ImageIcon("mattack/225.PNG");
				Image w225 = im225.getImage();
				g.drawImage(w225, 0, 0, 500, 500, this);
				break;

			case 226:
				ImageIcon im226 = new ImageIcon("mattack/226.PNG");
				Image w226 = im226.getImage();
				g.drawImage(w226, 0, 0, 500, 500, this);
				break;

			case 227:
				ImageIcon im227 = new ImageIcon("mattack/227.PNG");
				Image w227 = im227.getImage();
				g.drawImage(w227, 0, 0, 500, 500, this);
				break;

			case 228:
				ImageIcon im228 = new ImageIcon("mattack/228.PNG");
				Image w228 = im228.getImage();
				g.drawImage(w228, 0, 0, 500, 500, this);
				break;

			case 229:
				ImageIcon im229 = new ImageIcon("mattack/229.PNG");
				Image w229 = im229.getImage();
				g.drawImage(w229, 0, 0, 500, 500, this);
				break;

			case 230:
				ImageIcon im230 = new ImageIcon("mattack/230.PNG");
				Image w230 = im230.getImage();
				g.drawImage(w230, 0, 0, 500, 500, this);
				break;

			case 231:
				ImageIcon im231 = new ImageIcon("mattack/231.PNG");
				Image w231 = im231.getImage();
				g.drawImage(w231, 0, 0, 500, 500, this);
				break;

			case 232:
				ImageIcon im232 = new ImageIcon("mattack/232.PNG");
				Image w232 = im232.getImage();
				g.drawImage(w232, 0, 0, 500, 500, this);
				break;

			case 233:
				ImageIcon im233 = new ImageIcon("mattack/233.PNG");
				Image w233 = im233.getImage();
				g.drawImage(w233, 0, 0, 500, 500, this);
				break;

			case 234:
				ImageIcon im234 = new ImageIcon("mattack/234.PNG");
				Image w234 = im234.getImage();
				g.drawImage(w234, 0, 0, 500, 500, this);
				break;

			case 235:
				ImageIcon im235 = new ImageIcon("mattack/235.PNG");
				Image w235 = im235.getImage();
				g.drawImage(w235, 0, 0, 500, 500, this);
				break;

			case 236:
				ImageIcon im236 = new ImageIcon("mattack/236.PNG");
				Image w236 = im236.getImage();
				g.drawImage(w236, 0, 0, 500, 500, this);
				break;

			case 237:
				ImageIcon im237 = new ImageIcon("mattack/237.PNG");
				Image w237 = im237.getImage();
				g.drawImage(w237, 0, 0, 500, 500, this);
				break;

			case 238:
				ImageIcon im238 = new ImageIcon("mattack/238.PNG");
				Image w238 = im238.getImage();
				g.drawImage(w238, 0, 0, 500, 500, this);
				break;

			case 239:
				ImageIcon im239 = new ImageIcon("mattack/239.PNG");
				Image w239 = im239.getImage();
				g.drawImage(w239, 0, 0, 500, 500, this);
				break;

			case 240:
				ImageIcon im240 = new ImageIcon("mattack/240.PNG");
				Image w240 = im240.getImage();
				g.drawImage(w240, 0, 0, 500, 500, this);
				break;

			case 241:
				ImageIcon im241 = new ImageIcon("mattack/241.PNG");
				Image w241 = im241.getImage();
				g.drawImage(w241, 0, 0, 500, 500, this);
				break;

			case 242:
				ImageIcon im242 = new ImageIcon("mattack/242.PNG");
				Image w242 = im242.getImage();
				g.drawImage(w242, 0, 0, 500, 500, this);
				break;

			case 243:
				ImageIcon im243 = new ImageIcon("mattack/243.PNG");
				Image w243 = im243.getImage();
				g.drawImage(w243, 0, 0, 500, 500, this);
				break;

			case 244:
				ImageIcon im244 = new ImageIcon("mattack/244.PNG");
				Image w244 = im244.getImage();
				g.drawImage(w244, 0, 0, 500, 500, this);
				break;

			case 245:
				ImageIcon im245 = new ImageIcon("mattack/245.PNG");
				Image w245 = im245.getImage();
				g.drawImage(w245, 0, 0, 500, 500, this);
				break;

			case 246:
				ImageIcon im246 = new ImageIcon("mattack/246.PNG");
				Image w246 = im246.getImage();
				g.drawImage(w246, 0, 0, 500, 500, this);
				break;

			case 247:
				ImageIcon im247 = new ImageIcon("mattack/247.PNG");
				Image w247 = im247.getImage();
				g.drawImage(w247, 0, 0, 500, 500, this);
				break;

			case 248:
				ImageIcon im248 = new ImageIcon("mattack/248.PNG");
				Image w248 = im248.getImage();
				g.drawImage(w248, 0, 0, 500, 500, this);
				break;

			case 249:
				ImageIcon im249 = new ImageIcon("mattack/249.PNG");
				Image w249 = im249.getImage();
				g.drawImage(w249, 0, 0, 500, 500, this);
				break;

			case 250:
				ImageIcon im250 = new ImageIcon("mattack/250.PNG");
				Image w250 = im250.getImage();
				g.drawImage(w250, 0, 0, 500, 500, this);
				break;

			case 251:
				ImageIcon im251 = new ImageIcon("mattack/251.PNG");
				Image w251 = im251.getImage();
				g.drawImage(w251, 0, 0, 500, 500, this);
				break;

			case 252:
				ImageIcon im252 = new ImageIcon("mattack/252.PNG");
				Image w252 = im252.getImage();
				g.drawImage(w252, 0, 0, 500, 500, this);
				break;

			case 253:
				ImageIcon im253 = new ImageIcon("mattack/253.PNG");
				Image w253 = im253.getImage();
				g.drawImage(w253, 0, 0, 500, 500, this);
				break;

			case 254:
				ImageIcon im254 = new ImageIcon("mattack/254.PNG");
				Image w254 = im254.getImage();
				g.drawImage(w254, 0, 0, 500, 500, this);
				break;

			case 255:
				ImageIcon im255 = new ImageIcon("mattack/255.PNG");
				Image w255 = im255.getImage();
				g.drawImage(w255, 0, 0, 500, 500, this);
				break;

			case 256:
				ImageIcon im256 = new ImageIcon("mattack/256.PNG");
				Image w256 = im256.getImage();
				g.drawImage(w256, 0, 0, 500, 500, this);
				break;

			case 257:
				ImageIcon im257 = new ImageIcon("mattack/257.PNG");
				Image w257 = im257.getImage();
				g.drawImage(w257, 0, 0, 500, 500, this);
				break;

			case 258:
				ImageIcon im258 = new ImageIcon("mattack/258.PNG");
				Image w258 = im258.getImage();
				g.drawImage(w258, 0, 0, 500, 500, this);
				break;

			case 259:
				ImageIcon im259 = new ImageIcon("mattack/259.PNG");
				Image w259 = im259.getImage();
				g.drawImage(w259, 0, 0, 500, 500, this);
				break;

			case 260:
				ImageIcon im260 = new ImageIcon("mattack/260.PNG");
				Image w260 = im260.getImage();
				g.drawImage(w260, 0, 0, 500, 500, this);
				break;

			case 261:
				ImageIcon im261 = new ImageIcon("mattack/261.PNG");
				Image w261 = im261.getImage();
				g.drawImage(w261, 0, 0, 500, 500, this);
				break;

			case 262:
				ImageIcon im262 = new ImageIcon("mattack/262.PNG");
				Image w262 = im262.getImage();
				g.drawImage(w262, 0, 0, 500, 500, this);
				break;

			case 263:
				ImageIcon im263 = new ImageIcon("mattack/263.PNG");
				Image w263 = im263.getImage();
				g.drawImage(w263, 0, 0, 500, 500, this);
				break;

			case 264:
				ImageIcon im264 = new ImageIcon("mattack/264.PNG");
				Image w264 = im264.getImage();
				g.drawImage(w264, 0, 0, 500, 500, this);
				break;

			}
		}

	}

	// variable pour les animations et oui c'est du crypatge
	String name = "";
	String num = "001";
	boolean sensei = false;

	boolean PAVEL = false;
	boolean VLAD = false;
	boolean DEMON = false;
	boolean magiklink2 = false;
	boolean magikvampire = false;
	// incrementator of blue demon magic
	int incre = 1;

}
