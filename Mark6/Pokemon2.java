import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Pokemon2 extends JPanel {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// effet
	boolean[] speciaux = { false, false, false, false, false, false, false,
			false, false, false, false, false, false, false, false, false,
			false };
	int[] speciau = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	// ohoh lugia mewtwo
	ArrayList<Integer> PV = new ArrayList<Integer>();
	ArrayList<Integer> PV2 = new ArrayList<Integer>();
	String mypok = "ho-oh.gif";
	// Ecran de jeu
	int affiche = 4;
	int o = 0;
	int potion = 3;

	// data pokemon
	int[] data = { 1, 22 };
	int x2 = 300;
	int y2 = 90;
	int xp = 30;
	int yp = 250;
	int borderp = 150;
	int borderp2 = 170;

	boolean ecrire = true;
	boolean pokemon = false;
	int ash = 0;
	int ash2 = 80;

	String TEXTE = "";
	JAnimatedIcon ai2;
	JAnimatedIcon ai;
	int xm = 0;
	int ym = 415;
	String[][] boutons = { { "", "" }, { "", "" } };
	boolean[][] bool = { { true, false }, { false, false } };

	private void drawString(Graphics g, String text, int x, int y) {
		for (String line : text.split("\n"))
			g.drawString(line, x, y += g.getFontMetrics().getHeight());
	}

	boolean pic = false;

	public void attack(Graphics g) {
		if (pic) {
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, 500, 500);
		}

		if (speciaux[0]) {
			switch (speciau[0]) {
			case 1:
				ImageIcon im1 = new ImageIcon("DragonCloud/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("DragonCloud/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("DragonCloud/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("DragonCloud/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("DragonCloud/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("DragonCloud/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("DragonCloud/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("DragonCloud/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("DragonCloud/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("DragonCloud/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("DragonCloud/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("DragonCloud/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("DragonCloud/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("DragonCloud/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("DragonCloud/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("DragonCloud/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("DragonCloud/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("DragonCloud/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("DragonCloud/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("DragonCloud/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("DragonCloud/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("DragonCloud/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("DragonCloud/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("DragonCloud/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("DragonCloud/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("DragonCloud/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("DragonCloud/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("DragonCloud/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("DragonCloud/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("DragonCloud/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("DragonCloud/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("DragonCloud/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("DragonCloud/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("DragonCloud/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("DragonCloud/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("DragonCloud/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("DragonCloud/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("DragonCloud/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("DragonCloud/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("DragonCloud/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("DragonCloud/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("DragonCloud/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("DragonCloud/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("DragonCloud/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("DragonCloud/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("DragonCloud/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("DragonCloud/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("DragonCloud/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("DragonCloud/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("DragonCloud/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("DragonCloud/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("DragonCloud/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("DragonCloud/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("DragonCloud/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("DragonCloud/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("DragonCloud/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("DragonCloud/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("DragonCloud/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("DragonCloud/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("DragonCloud/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("DragonCloud/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("DragonCloud/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("DragonCloud/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("DragonCloud/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("DragonCloud/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("DragonCloud/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("DragonCloud/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("DragonCloud/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("DragonCloud/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("DragonCloud/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("DragonCloud/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("DragonCloud/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("DragonCloud/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("DragonCloud/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("DragonCloud/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("DragonCloud/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("DragonCloud/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("DragonCloud/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("DragonCloud/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("DragonCloud/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("DragonCloud/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("DragonCloud/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("DragonCloud/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("DragonCloud/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("DragonCloud/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("DragonCloud/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("DragonCloud/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("DragonCloud/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("DragonCloud/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("DragonCloud/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("DragonCloud/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("DragonCloud/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			case 93:
				ImageIcon im93 = new ImageIcon("DragonCloud/093.PNG");
				Image w93 = im93.getImage();
				g.drawImage(w93, 0, 0, 500, 500, this);
				break;

			case 94:
				ImageIcon im94 = new ImageIcon("DragonCloud/094.PNG");
				Image w94 = im94.getImage();
				g.drawImage(w94, 0, 0, 500, 500, this);
				break;

			case 95:
				ImageIcon im95 = new ImageIcon("DragonCloud/095.PNG");
				Image w95 = im95.getImage();
				g.drawImage(w95, 0, 0, 500, 500, this);
				break;

			case 96:
				ImageIcon im96 = new ImageIcon("DragonCloud/096.PNG");
				Image w96 = im96.getImage();
				g.drawImage(w96, 0, 0, 500, 500, this);
				break;

			case 97:
				ImageIcon im97 = new ImageIcon("DragonCloud/097.PNG");
				Image w97 = im97.getImage();
				g.drawImage(w97, 0, 0, 500, 500, this);
				break;

			case 98:
				ImageIcon im98 = new ImageIcon("DragonCloud/098.PNG");
				Image w98 = im98.getImage();
				g.drawImage(w98, 0, 0, 500, 500, this);
				break;

			case 99:
				ImageIcon im99 = new ImageIcon("DragonCloud/099.PNG");
				Image w99 = im99.getImage();
				g.drawImage(w99, 0, 0, 500, 500, this);
				break;

			case 100:
				ImageIcon im100 = new ImageIcon("DragonCloud/100.PNG");
				Image w100 = im100.getImage();
				g.drawImage(w100, 0, 0, 500, 500, this);
				break;

			case 101:
				ImageIcon im101 = new ImageIcon("DragonCloud/101.PNG");
				Image w101 = im101.getImage();
				g.drawImage(w101, 0, 0, 500, 500, this);
				break;

			case 102:
				ImageIcon im102 = new ImageIcon("DragonCloud/102.PNG");
				Image w102 = im102.getImage();
				g.drawImage(w102, 0, 0, 500, 500, this);
				break;

			case 103:
				ImageIcon im103 = new ImageIcon("DragonCloud/103.PNG");
				Image w103 = im103.getImage();
				g.drawImage(w103, 0, 0, 500, 500, this);
				break;

			case 104:
				ImageIcon im104 = new ImageIcon("DragonCloud/104.PNG");
				Image w104 = im104.getImage();
				g.drawImage(w104, 0, 0, 500, 500, this);
				break;

			case 105:
				ImageIcon im105 = new ImageIcon("DragonCloud/105.PNG");
				Image w105 = im105.getImage();
				g.drawImage(w105, 0, 0, 500, 500, this);
				break;

			case 106:
				ImageIcon im106 = new ImageIcon("DragonCloud/106.PNG");
				Image w106 = im106.getImage();
				g.drawImage(w106, 0, 0, 500, 500, this);
				break;

			case 107:
				ImageIcon im107 = new ImageIcon("DragonCloud/107.PNG");
				Image w107 = im107.getImage();
				g.drawImage(w107, 0, 0, 500, 500, this);
				break;

			case 108:
				ImageIcon im108 = new ImageIcon("DragonCloud/108.PNG");
				Image w108 = im108.getImage();
				g.drawImage(w108, 0, 0, 500, 500, this);
				break;

			case 109:
				ImageIcon im109 = new ImageIcon("DragonCloud/109.PNG");
				Image w109 = im109.getImage();
				g.drawImage(w109, 0, 0, 500, 500, this);
				break;

			case 110:
				ImageIcon im110 = new ImageIcon("DragonCloud/110.PNG");
				Image w110 = im110.getImage();
				g.drawImage(w110, 0, 0, 500, 500, this);
				break;

			case 111:
				ImageIcon im111 = new ImageIcon("DragonCloud/111.PNG");
				Image w111 = im111.getImage();
				g.drawImage(w111, 0, 0, 500, 500, this);
				break;

			case 112:
				ImageIcon im112 = new ImageIcon("DragonCloud/112.PNG");
				Image w112 = im112.getImage();
				g.drawImage(w112, 0, 0, 500, 500, this);
				break;

			case 113:
				ImageIcon im113 = new ImageIcon("DragonCloud/113.PNG");
				Image w113 = im113.getImage();
				g.drawImage(w113, 0, 0, 500, 500, this);
				break;

			case 114:
				ImageIcon im114 = new ImageIcon("DragonCloud/114.PNG");
				Image w114 = im114.getImage();
				g.drawImage(w114, 0, 0, 500, 500, this);
				break;

			case 115:
				ImageIcon im115 = new ImageIcon("DragonCloud/115.PNG");
				Image w115 = im115.getImage();
				g.drawImage(w115, 0, 0, 500, 500, this);
				break;

			case 116:
				ImageIcon im116 = new ImageIcon("DragonCloud/116.PNG");
				Image w116 = im116.getImage();
				g.drawImage(w116, 0, 0, 500, 500, this);
				break;

			case 117:
				ImageIcon im117 = new ImageIcon("DragonCloud/117.PNG");
				Image w117 = im117.getImage();
				g.drawImage(w117, 0, 0, 500, 500, this);
				break;

			case 118:
				ImageIcon im118 = new ImageIcon("DragonCloud/118.PNG");
				Image w118 = im118.getImage();
				g.drawImage(w118, 0, 0, 500, 500, this);
				break;

			case 119:
				ImageIcon im119 = new ImageIcon("DragonCloud/119.PNG");
				Image w119 = im119.getImage();
				g.drawImage(w119, 0, 0, 500, 500, this);
				break;

			case 120:
				ImageIcon im120 = new ImageIcon("DragonCloud/120.PNG");
				Image w120 = im120.getImage();
				g.drawImage(w120, 0, 0, 500, 500, this);
				break;

			case 121:
				ImageIcon im121 = new ImageIcon("DragonCloud/121.PNG");
				Image w121 = im121.getImage();
				g.drawImage(w121, 0, 0, 500, 500, this);
				break;

			case 122:
				ImageIcon im122 = new ImageIcon("DragonCloud/122.PNG");
				Image w122 = im122.getImage();
				g.drawImage(w122, 0, 0, 500, 500, this);
				break;

			case 123:
				ImageIcon im123 = new ImageIcon("DragonCloud/123.PNG");
				Image w123 = im123.getImage();
				g.drawImage(w123, 0, 0, 500, 500, this);
				break;

			case 124:
				ImageIcon im124 = new ImageIcon("DragonCloud/124.PNG");
				Image w124 = im124.getImage();
				g.drawImage(w124, 0, 0, 500, 500, this);
				break;

			case 125:
				ImageIcon im125 = new ImageIcon("DragonCloud/125.PNG");
				Image w125 = im125.getImage();
				g.drawImage(w125, 0, 0, 500, 500, this);
				break;

			case 126:
				ImageIcon im126 = new ImageIcon("DragonCloud/126.PNG");
				Image w126 = im126.getImage();
				g.drawImage(w126, 0, 0, 500, 500, this);
				break;

			case 127:
				ImageIcon im127 = new ImageIcon("DragonCloud/127.PNG");
				Image w127 = im127.getImage();
				g.drawImage(w127, 0, 0, 500, 500, this);
				break;

			case 128:
				ImageIcon im128 = new ImageIcon("DragonCloud/128.PNG");
				Image w128 = im128.getImage();
				g.drawImage(w128, 0, 0, 500, 500, this);
				break;

			case 129:
				ImageIcon im129 = new ImageIcon("DragonCloud/129.PNG");
				Image w129 = im129.getImage();
				g.drawImage(w129, 0, 0, 500, 500, this);
				break;

			case 130:
				ImageIcon im130 = new ImageIcon("DragonCloud/130.PNG");
				Image w130 = im130.getImage();
				g.drawImage(w130, 0, 0, 500, 500, this);
				break;

			case 131:
				ImageIcon im131 = new ImageIcon("DragonCloud/131.PNG");
				Image w131 = im131.getImage();
				g.drawImage(w131, 0, 0, 500, 500, this);
				break;

			case 132:
				ImageIcon im132 = new ImageIcon("DragonCloud/132.PNG");
				Image w132 = im132.getImage();
				g.drawImage(w132, 0, 0, 500, 500, this);
				break;

			case 133:
				ImageIcon im133 = new ImageIcon("DragonCloud/133.PNG");
				Image w133 = im133.getImage();
				g.drawImage(w133, 0, 0, 500, 500, this);
				break;

			case 134:
				ImageIcon im134 = new ImageIcon("DragonCloud/134.PNG");
				Image w134 = im134.getImage();
				g.drawImage(w134, 0, 0, 500, 500, this);
				break;

			case 135:
				ImageIcon im135 = new ImageIcon("DragonCloud/135.PNG");
				Image w135 = im135.getImage();
				g.drawImage(w135, 0, 0, 500, 500, this);
				break;

			case 136:
				ImageIcon im136 = new ImageIcon("DragonCloud/136.PNG");
				Image w136 = im136.getImage();
				g.drawImage(w136, 0, 0, 500, 500, this);
				break;

			case 137:
				ImageIcon im137 = new ImageIcon("DragonCloud/137.PNG");
				Image w137 = im137.getImage();
				g.drawImage(w137, 0, 0, 500, 500, this);
				break;

			case 138:
				ImageIcon im138 = new ImageIcon("DragonCloud/138.PNG");
				Image w138 = im138.getImage();
				g.drawImage(w138, 0, 0, 500, 500, this);
				break;

			case 139:
				ImageIcon im139 = new ImageIcon("DragonCloud/139.PNG");
				Image w139 = im139.getImage();
				g.drawImage(w139, 0, 0, 500, 500, this);
				break;

			case 140:
				ImageIcon im140 = new ImageIcon("DragonCloud/140.PNG");
				Image w140 = im140.getImage();
				g.drawImage(w140, 0, 0, 500, 500, this);
				break;

			case 141:
				ImageIcon im141 = new ImageIcon("DragonCloud/141.PNG");
				Image w141 = im141.getImage();
				g.drawImage(w141, 0, 0, 500, 500, this);
				break;

			case 142:
				ImageIcon im142 = new ImageIcon("DragonCloud/142.PNG");
				Image w142 = im142.getImage();
				g.drawImage(w142, 0, 0, 500, 500, this);
				break;

			case 143:
				ImageIcon im143 = new ImageIcon("DragonCloud/143.PNG");
				Image w143 = im143.getImage();
				g.drawImage(w143, 0, 0, 500, 500, this);
				break;

			case 144:
				ImageIcon im144 = new ImageIcon("DragonCloud/144.PNG");
				Image w144 = im144.getImage();
				g.drawImage(w144, 0, 0, 500, 500, this);
				break;

			}
		}
		// suite 2 hoho
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

			case 189:
				ImageIcon im189 = new ImageIcon("Megiddo/189.PNG");
				Image w189 = im189.getImage();
				g.drawImage(w189, 0, 0, 500, 500, this);
				break;

			}
		}
		// suite 3
		if (speciaux[2]) {
			switch (speciau[2]) {
			case 1:
				ImageIcon im1 = new ImageIcon("Zagan/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("Zagan/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("Zagan/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("Zagan/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("Zagan/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("Zagan/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("Zagan/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("Zagan/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("Zagan/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("Zagan/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("Zagan/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("Zagan/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("Zagan/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("Zagan/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("Zagan/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("Zagan/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("Zagan/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("Zagan/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("Zagan/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("Zagan/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("Zagan/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("Zagan/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("Zagan/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("Zagan/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("Zagan/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("Zagan/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("Zagan/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("Zagan/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("Zagan/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("Zagan/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("Zagan/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("Zagan/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("Zagan/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("Zagan/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("Zagan/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("Zagan/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("Zagan/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("Zagan/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("Zagan/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("Zagan/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("Zagan/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("Zagan/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("Zagan/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("Zagan/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("Zagan/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("Zagan/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("Zagan/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("Zagan/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("Zagan/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("Zagan/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("Zagan/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("Zagan/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("Zagan/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("Zagan/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("Zagan/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("Zagan/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("Zagan/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("Zagan/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("Zagan/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("Zagan/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("Zagan/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("Zagan/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("Zagan/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("Zagan/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("Zagan/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("Zagan/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("Zagan/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("Zagan/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("Zagan/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("Zagan/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("Zagan/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("Zagan/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("Zagan/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("Zagan/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("Zagan/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("Zagan/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("Zagan/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("Zagan/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("Zagan/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("Zagan/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("Zagan/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("Zagan/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("Zagan/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("Zagan/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("Zagan/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("Zagan/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("Zagan/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("Zagan/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("Zagan/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("Zagan/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("Zagan/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("Zagan/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			case 93:
				ImageIcon im93 = new ImageIcon("Zagan/093.PNG");
				Image w93 = im93.getImage();
				g.drawImage(w93, 0, 0, 500, 500, this);
				break;

			case 94:
				ImageIcon im94 = new ImageIcon("Zagan/094.PNG");
				Image w94 = im94.getImage();
				g.drawImage(w94, 0, 0, 500, 500, this);
				break;

			case 95:
				ImageIcon im95 = new ImageIcon("Zagan/095.PNG");
				Image w95 = im95.getImage();
				g.drawImage(w95, 0, 0, 500, 500, this);
				break;

			case 96:
				ImageIcon im96 = new ImageIcon("Zagan/096.PNG");
				Image w96 = im96.getImage();
				g.drawImage(w96, 0, 0, 500, 500, this);
				break;

			case 97:
				ImageIcon im97 = new ImageIcon("Zagan/097.PNG");
				Image w97 = im97.getImage();
				g.drawImage(w97, 0, 0, 500, 500, this);
				break;

			case 98:
				ImageIcon im98 = new ImageIcon("Zagan/098.PNG");
				Image w98 = im98.getImage();
				g.drawImage(w98, 0, 0, 500, 500, this);
				break;

			case 99:
				ImageIcon im99 = new ImageIcon("Zagan/099.PNG");
				Image w99 = im99.getImage();
				g.drawImage(w99, 0, 0, 500, 500, this);
				break;

			case 100:
				ImageIcon im100 = new ImageIcon("Zagan/100.PNG");
				Image w100 = im100.getImage();
				g.drawImage(w100, 0, 0, 500, 500, this);
				break;

			case 101:
				ImageIcon im101 = new ImageIcon("Zagan/101.PNG");
				Image w101 = im101.getImage();
				g.drawImage(w101, 0, 0, 500, 500, this);
				break;

			case 102:
				ImageIcon im102 = new ImageIcon("Zagan/102.PNG");
				Image w102 = im102.getImage();
				g.drawImage(w102, 0, 0, 500, 500, this);
				break;

			case 103:
				ImageIcon im103 = new ImageIcon("Zagan/103.PNG");
				Image w103 = im103.getImage();
				g.drawImage(w103, 0, 0, 500, 500, this);
				break;

			case 104:
				ImageIcon im104 = new ImageIcon("Zagan/104.PNG");
				Image w104 = im104.getImage();
				g.drawImage(w104, 0, 0, 500, 500, this);
				break;

			case 105:
				ImageIcon im105 = new ImageIcon("Zagan/105.PNG");
				Image w105 = im105.getImage();
				g.drawImage(w105, 0, 0, 500, 500, this);
				break;

			case 106:
				ImageIcon im106 = new ImageIcon("Zagan/106.PNG");
				Image w106 = im106.getImage();
				g.drawImage(w106, 0, 0, 500, 500, this);
				break;

			case 107:
				ImageIcon im107 = new ImageIcon("Zagan/107.PNG");
				Image w107 = im107.getImage();
				g.drawImage(w107, 0, 0, 500, 500, this);
				break;

			case 108:
				ImageIcon im108 = new ImageIcon("Zagan/108.PNG");
				Image w108 = im108.getImage();
				g.drawImage(w108, 0, 0, 500, 500, this);
				break;

			case 109:
				ImageIcon im109 = new ImageIcon("Zagan/109.PNG");
				Image w109 = im109.getImage();
				g.drawImage(w109, 0, 0, 500, 500, this);
				break;

			case 110:
				ImageIcon im110 = new ImageIcon("Zagan/110.PNG");
				Image w110 = im110.getImage();
				g.drawImage(w110, 0, 0, 500, 500, this);
				break;

			case 111:
				ImageIcon im111 = new ImageIcon("Zagan/111.PNG");
				Image w111 = im111.getImage();
				g.drawImage(w111, 0, 0, 500, 500, this);
				break;

			case 112:
				ImageIcon im112 = new ImageIcon("Zagan/112.PNG");
				Image w112 = im112.getImage();
				g.drawImage(w112, 0, 0, 500, 500, this);
				break;

			case 113:
				ImageIcon im113 = new ImageIcon("Zagan/113.PNG");
				Image w113 = im113.getImage();
				g.drawImage(w113, 0, 0, 500, 500, this);
				break;

			case 114:
				ImageIcon im114 = new ImageIcon("Zagan/114.PNG");
				Image w114 = im114.getImage();
				g.drawImage(w114, 0, 0, 500, 500, this);
				break;

			case 115:
				ImageIcon im115 = new ImageIcon("Zagan/115.PNG");
				Image w115 = im115.getImage();
				g.drawImage(w115, 0, 0, 500, 500, this);
				break;

			case 116:
				ImageIcon im116 = new ImageIcon("Zagan/116.PNG");
				Image w116 = im116.getImage();
				g.drawImage(w116, 0, 0, 500, 500, this);
				break;

			case 117:
				ImageIcon im117 = new ImageIcon("Zagan/117.PNG");
				Image w117 = im117.getImage();
				g.drawImage(w117, 0, 0, 500, 500, this);
				break;

			case 118:
				ImageIcon im118 = new ImageIcon("Zagan/118.PNG");
				Image w118 = im118.getImage();
				g.drawImage(w118, 0, 0, 500, 500, this);
				break;

			case 119:
				ImageIcon im119 = new ImageIcon("Zagan/119.PNG");
				Image w119 = im119.getImage();
				g.drawImage(w119, 0, 0, 500, 500, this);
				break;

			case 120:
				ImageIcon im120 = new ImageIcon("Zagan/120.PNG");
				Image w120 = im120.getImage();
				g.drawImage(w120, 0, 0, 500, 500, this);
				break;

			case 121:
				ImageIcon im121 = new ImageIcon("Zagan/121.PNG");
				Image w121 = im121.getImage();
				g.drawImage(w121, 0, 0, 500, 500, this);
				break;

			case 122:
				ImageIcon im122 = new ImageIcon("Zagan/122.PNG");
				Image w122 = im122.getImage();
				g.drawImage(w122, 0, 0, 500, 500, this);
				break;

			case 123:
				ImageIcon im123 = new ImageIcon("Zagan/123.PNG");
				Image w123 = im123.getImage();
				g.drawImage(w123, 0, 0, 500, 500, this);
				break;

			case 124:
				ImageIcon im124 = new ImageIcon("Zagan/124.PNG");
				Image w124 = im124.getImage();
				g.drawImage(w124, 0, 0, 500, 500, this);
				break;

			case 125:
				ImageIcon im125 = new ImageIcon("Zagan/125.PNG");
				Image w125 = im125.getImage();
				g.drawImage(w125, 0, 0, 500, 500, this);
				break;

			case 126:
				ImageIcon im126 = new ImageIcon("Zagan/126.PNG");
				Image w126 = im126.getImage();
				g.drawImage(w126, 0, 0, 500, 500, this);
				break;

			case 127:
				ImageIcon im127 = new ImageIcon("Zagan/127.PNG");
				Image w127 = im127.getImage();
				g.drawImage(w127, 0, 0, 500, 500, this);
				break;

			case 128:
				ImageIcon im128 = new ImageIcon("Zagan/128.PNG");
				Image w128 = im128.getImage();
				g.drawImage(w128, 0, 0, 500, 500, this);
				break;

			case 129:
				ImageIcon im129 = new ImageIcon("Zagan/129.PNG");
				Image w129 = im129.getImage();
				g.drawImage(w129, 0, 0, 500, 500, this);
				break;

			case 130:
				ImageIcon im130 = new ImageIcon("Zagan/130.PNG");
				Image w130 = im130.getImage();
				g.drawImage(w130, 0, 0, 500, 500, this);
				break;

			case 131:
				ImageIcon im131 = new ImageIcon("Zagan/131.PNG");
				Image w131 = im131.getImage();
				g.drawImage(w131, 0, 0, 500, 500, this);
				break;

			case 132:
				ImageIcon im132 = new ImageIcon("Zagan/132.PNG");
				Image w132 = im132.getImage();
				g.drawImage(w132, 0, 0, 500, 500, this);
				break;

			case 133:
				ImageIcon im133 = new ImageIcon("Zagan/133.PNG");
				Image w133 = im133.getImage();
				g.drawImage(w133, 0, 0, 500, 500, this);
				break;

			case 134:
				ImageIcon im134 = new ImageIcon("Zagan/134.PNG");
				Image w134 = im134.getImage();
				g.drawImage(w134, 0, 0, 500, 500, this);
				break;

			case 135:
				ImageIcon im135 = new ImageIcon("Zagan/135.PNG");
				Image w135 = im135.getImage();
				g.drawImage(w135, 0, 0, 500, 500, this);
				break;

			case 136:
				ImageIcon im136 = new ImageIcon("Zagan/136.PNG");
				Image w136 = im136.getImage();
				g.drawImage(w136, 0, 0, 500, 500, this);
				break;

			case 137:
				ImageIcon im137 = new ImageIcon("Zagan/137.PNG");
				Image w137 = im137.getImage();
				g.drawImage(w137, 0, 0, 500, 500, this);
				break;

			case 138:
				ImageIcon im138 = new ImageIcon("Zagan/138.PNG");
				Image w138 = im138.getImage();
				g.drawImage(w138, 0, 0, 500, 500, this);
				break;

			case 139:
				ImageIcon im139 = new ImageIcon("Zagan/139.PNG");
				Image w139 = im139.getImage();
				g.drawImage(w139, 0, 0, 500, 500, this);
				break;

			case 140:
				ImageIcon im140 = new ImageIcon("Zagan/140.PNG");
				Image w140 = im140.getImage();
				g.drawImage(w140, 0, 0, 500, 500, this);
				break;

			case 141:
				ImageIcon im141 = new ImageIcon("Zagan/141.PNG");
				Image w141 = im141.getImage();
				g.drawImage(w141, 0, 0, 500, 500, this);
				break;

			case 142:
				ImageIcon im142 = new ImageIcon("Zagan/142.PNG");
				Image w142 = im142.getImage();
				g.drawImage(w142, 0, 0, 500, 500, this);
				break;

			case 143:
				ImageIcon im143 = new ImageIcon("Zagan/143.PNG");
				Image w143 = im143.getImage();
				g.drawImage(w143, 0, 0, 500, 500, this);
				break;

			case 144:
				ImageIcon im144 = new ImageIcon("Zagan/144.PNG");
				Image w144 = im144.getImage();
				g.drawImage(w144, 0, 0, 500, 500, this);
				break;

			case 145:
				ImageIcon im145 = new ImageIcon("Zagan/145.PNG");
				Image w145 = im145.getImage();
				g.drawImage(w145, 0, 0, 500, 500, this);
				break;

			case 146:
				ImageIcon im146 = new ImageIcon("Zagan/146.PNG");
				Image w146 = im146.getImage();
				g.drawImage(w146, 0, 0, 500, 500, this);
				break;

			case 147:
				ImageIcon im147 = new ImageIcon("Zagan/147.PNG");
				Image w147 = im147.getImage();
				g.drawImage(w147, 0, 0, 500, 500, this);
				break;

			case 148:
				ImageIcon im148 = new ImageIcon("Zagan/148.PNG");
				Image w148 = im148.getImage();
				g.drawImage(w148, 0, 0, 500, 500, this);
				break;

			case 149:
				ImageIcon im149 = new ImageIcon("Zagan/149.PNG");
				Image w149 = im149.getImage();
				g.drawImage(w149, 0, 0, 500, 500, this);
				break;

			case 150:
				ImageIcon im150 = new ImageIcon("Zagan/150.PNG");
				Image w150 = im150.getImage();
				g.drawImage(w150, 0, 0, 500, 500, this);
				break;

			case 151:
				ImageIcon im151 = new ImageIcon("Zagan/151.PNG");
				Image w151 = im151.getImage();
				g.drawImage(w151, 0, 0, 500, 500, this);
				break;

			}
		}

		if (speciaux[3]) {
			switch (speciau[3]) {
			case 1:
				ImageIcon im1 = new ImageIcon("glace/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("glace/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("glace/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("glace/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("glace/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("glace/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("glace/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("glace/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("glace/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("glace/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("glace/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("glace/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("glace/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("glace/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("glace/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("glace/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("glace/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("glace/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("glace/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("glace/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("glace/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("glace/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("glace/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("glace/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("glace/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("glace/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("glace/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("glace/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("glace/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("glace/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("glace/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("glace/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("glace/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("glace/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("glace/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("glace/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("glace/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("glace/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("glace/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("glace/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("glace/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("glace/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("glace/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("glace/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("glace/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("glace/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("glace/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("glace/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("glace/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("glace/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("glace/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("glace/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("glace/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("glace/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("glace/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("glace/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("glace/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("glace/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("glace/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("glace/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("glace/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("glace/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("glace/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("glace/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("glace/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("glace/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("glace/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("glace/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("glace/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("glace/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("glace/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("glace/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("glace/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("glace/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("glace/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("glace/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("glace/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("glace/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("glace/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("glace/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("glace/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("glace/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("glace/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("glace/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("glace/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("glace/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("glace/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("glace/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("glace/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("glace/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("glace/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("glace/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			case 93:
				ImageIcon im93 = new ImageIcon("glace/093.PNG");
				Image w93 = im93.getImage();
				g.drawImage(w93, 0, 0, 500, 500, this);
				break;

			case 94:
				ImageIcon im94 = new ImageIcon("glace/094.PNG");
				Image w94 = im94.getImage();
				g.drawImage(w94, 0, 0, 500, 500, this);
				break;

			case 95:
				ImageIcon im95 = new ImageIcon("glace/095.PNG");
				Image w95 = im95.getImage();
				g.drawImage(w95, 0, 0, 500, 500, this);
				break;

			case 96:
				ImageIcon im96 = new ImageIcon("glace/096.PNG");
				Image w96 = im96.getImage();
				g.drawImage(w96, 0, 0, 500, 500, this);
				break;

			case 97:
				ImageIcon im97 = new ImageIcon("glace/097.PNG");
				Image w97 = im97.getImage();
				g.drawImage(w97, 0, 0, 500, 500, this);
				break;

			case 98:
				ImageIcon im98 = new ImageIcon("glace/098.PNG");
				Image w98 = im98.getImage();
				g.drawImage(w98, 0, 0, 500, 500, this);
				break;

			case 99:
				ImageIcon im99 = new ImageIcon("glace/099.PNG");
				Image w99 = im99.getImage();
				g.drawImage(w99, 0, 0, 500, 500, this);
				break;

			case 100:
				ImageIcon im100 = new ImageIcon("glace/100.PNG");
				Image w100 = im100.getImage();
				g.drawImage(w100, 0, 0, 500, 500, this);
				break;

			case 101:
				ImageIcon im101 = new ImageIcon("glace/101.PNG");
				Image w101 = im101.getImage();
				g.drawImage(w101, 0, 0, 500, 500, this);
				break;

			case 102:
				ImageIcon im102 = new ImageIcon("glace/102.PNG");
				Image w102 = im102.getImage();
				g.drawImage(w102, 0, 0, 500, 500, this);
				break;

			case 103:
				ImageIcon im103 = new ImageIcon("glace/103.PNG");
				Image w103 = im103.getImage();
				g.drawImage(w103, 0, 0, 500, 500, this);
				break;

			case 104:
				ImageIcon im104 = new ImageIcon("glace/104.PNG");
				Image w104 = im104.getImage();
				g.drawImage(w104, 0, 0, 500, 500, this);
				break;

			case 105:
				ImageIcon im105 = new ImageIcon("glace/105.PNG");
				Image w105 = im105.getImage();
				g.drawImage(w105, 0, 0, 500, 500, this);
				break;

			case 106:
				ImageIcon im106 = new ImageIcon("glace/106.PNG");
				Image w106 = im106.getImage();
				g.drawImage(w106, 0, 0, 500, 500, this);
				break;

			case 107:
				ImageIcon im107 = new ImageIcon("glace/107.PNG");
				Image w107 = im107.getImage();
				g.drawImage(w107, 0, 0, 500, 500, this);
				break;

			case 108:
				ImageIcon im108 = new ImageIcon("glace/108.PNG");
				Image w108 = im108.getImage();
				g.drawImage(w108, 0, 0, 500, 500, this);
				break;

			case 109:
				ImageIcon im109 = new ImageIcon("glace/109.PNG");
				Image w109 = im109.getImage();
				g.drawImage(w109, 0, 0, 500, 500, this);
				break;

			case 110:
				ImageIcon im110 = new ImageIcon("glace/110.PNG");
				Image w110 = im110.getImage();
				g.drawImage(w110, 0, 0, 500, 500, this);
				break;

			case 111:
				ImageIcon im111 = new ImageIcon("glace/111.PNG");
				Image w111 = im111.getImage();
				g.drawImage(w111, 0, 0, 500, 500, this);
				break;

			case 112:
				ImageIcon im112 = new ImageIcon("glace/112.PNG");
				Image w112 = im112.getImage();
				g.drawImage(w112, 0, 0, 500, 500, this);
				break;

			case 113:
				ImageIcon im113 = new ImageIcon("glace/113.PNG");
				Image w113 = im113.getImage();
				g.drawImage(w113, 0, 0, 500, 500, this);
				break;

			case 114:
				ImageIcon im114 = new ImageIcon("glace/114.PNG");
				Image w114 = im114.getImage();
				g.drawImage(w114, 0, 0, 500, 500, this);
				break;

			case 115:
				ImageIcon im115 = new ImageIcon("glace/115.PNG");
				Image w115 = im115.getImage();
				g.drawImage(w115, 0, 0, 500, 500, this);
				break;

			case 116:
				ImageIcon im116 = new ImageIcon("glace/116.PNG");
				Image w116 = im116.getImage();
				g.drawImage(w116, 0, 0, 500, 500, this);
				break;

			case 117:
				ImageIcon im117 = new ImageIcon("glace/117.PNG");
				Image w117 = im117.getImage();
				g.drawImage(w117, 0, 0, 500, 500, this);
				break;

			case 118:
				ImageIcon im118 = new ImageIcon("glace/118.PNG");
				Image w118 = im118.getImage();
				g.drawImage(w118, 0, 0, 500, 500, this);
				break;

			case 119:
				ImageIcon im119 = new ImageIcon("glace/119.PNG");
				Image w119 = im119.getImage();
				g.drawImage(w119, 0, 0, 500, 500, this);
				break;

			case 120:
				ImageIcon im120 = new ImageIcon("glace/120.PNG");
				Image w120 = im120.getImage();
				g.drawImage(w120, 0, 0, 500, 500, this);
				break;

			case 121:
				ImageIcon im121 = new ImageIcon("glace/121.PNG");
				Image w121 = im121.getImage();
				g.drawImage(w121, 0, 0, 500, 500, this);
				break;

			case 122:
				ImageIcon im122 = new ImageIcon("glace/122.PNG");
				Image w122 = im122.getImage();
				g.drawImage(w122, 0, 0, 500, 500, this);
				break;

			case 123:
				ImageIcon im123 = new ImageIcon("glace/123.PNG");
				Image w123 = im123.getImage();
				g.drawImage(w123, 0, 0, 500, 500, this);
				break;

			case 124:
				ImageIcon im124 = new ImageIcon("glace/124.PNG");
				Image w124 = im124.getImage();
				g.drawImage(w124, 0, 0, 500, 500, this);
				break;

			case 125:
				ImageIcon im125 = new ImageIcon("glace/125.PNG");
				Image w125 = im125.getImage();
				g.drawImage(w125, 0, 0, 500, 500, this);
				break;

			case 126:
				ImageIcon im126 = new ImageIcon("glace/126.PNG");
				Image w126 = im126.getImage();
				g.drawImage(w126, 0, 0, 500, 500, this);
				break;

			case 127:
				ImageIcon im127 = new ImageIcon("glace/127.PNG");
				Image w127 = im127.getImage();
				g.drawImage(w127, 0, 0, 500, 500, this);
				break;

			case 128:
				ImageIcon im128 = new ImageIcon("glace/128.PNG");
				Image w128 = im128.getImage();
				g.drawImage(w128, 0, 0, 500, 500, this);
				break;

			case 129:
				ImageIcon im129 = new ImageIcon("glace/129.PNG");
				Image w129 = im129.getImage();
				g.drawImage(w129, 0, 0, 500, 500, this);
				break;

			case 130:
				ImageIcon im130 = new ImageIcon("glace/130.PNG");
				Image w130 = im130.getImage();
				g.drawImage(w130, 0, 0, 500, 500, this);
				break;

			case 131:
				ImageIcon im131 = new ImageIcon("glace/131.PNG");
				Image w131 = im131.getImage();
				g.drawImage(w131, 0, 0, 500, 500, this);
				break;

			case 132:
				ImageIcon im132 = new ImageIcon("glace/132.PNG");
				Image w132 = im132.getImage();
				g.drawImage(w132, 0, 0, 500, 500, this);
				break;

			case 133:
				ImageIcon im133 = new ImageIcon("glace/133.PNG");
				Image w133 = im133.getImage();
				g.drawImage(w133, 0, 0, 500, 500, this);
				break;

			}
		}
	}

	public void attack2(Graphics g) {
		if (speciaux[4]) {
			switch (speciau[4]) {
			case 1:
				ImageIcon im1 = new ImageIcon("BoostHack/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("BoostHack/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("BoostHack/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("BoostHack/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("BoostHack/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			}
		}
		if (speciaux[5]) {
			switch (speciau[5]) {
			case 1:
				ImageIcon im1 = new ImageIcon("lugia/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("lugia/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("lugia/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("lugia/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("lugia/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("lugia/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("lugia/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("lugia/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("lugia/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("lugia/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("lugia/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("lugia/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("lugia/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("lugia/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("lugia/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("lugia/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("lugia/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("lugia/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("lugia/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("lugia/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("lugia/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("lugia/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("lugia/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("lugia/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("lugia/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("lugia/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("lugia/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("lugia/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("lugia/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("lugia/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("lugia/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("lugia/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("lugia/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("lugia/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("lugia/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("lugia/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("lugia/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("lugia/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("lugia/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("lugia/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("lugia/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("lugia/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("lugia/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("lugia/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("lugia/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("lugia/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("lugia/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("lugia/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("lugia/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("lugia/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("lugia/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("lugia/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("lugia/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("lugia/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("lugia/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("lugia/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("lugia/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("lugia/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("lugia/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("lugia/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("lugia/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("lugia/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("lugia/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("lugia/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("lugia/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("lugia/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("lugia/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("lugia/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("lugia/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("lugia/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("lugia/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("lugia/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("lugia/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("lugia/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("lugia/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("lugia/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("lugia/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("lugia/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("lugia/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("lugia/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("lugia/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("lugia/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("lugia/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("lugia/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("lugia/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("lugia/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("lugia/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("lugia/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("lugia/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("lugia/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("lugia/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("lugia/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			case 93:
				ImageIcon im93 = new ImageIcon("lugia/093.PNG");
				Image w93 = im93.getImage();
				g.drawImage(w93, 0, 0, 500, 500, this);
				break;

			case 94:
				ImageIcon im94 = new ImageIcon("lugia/094.PNG");
				Image w94 = im94.getImage();
				g.drawImage(w94, 0, 0, 500, 500, this);
				break;

			case 95:
				ImageIcon im95 = new ImageIcon("lugia/095.PNG");
				Image w95 = im95.getImage();
				g.drawImage(w95, 0, 0, 500, 500, this);
				break;

			case 96:
				ImageIcon im96 = new ImageIcon("lugia/096.PNG");
				Image w96 = im96.getImage();
				g.drawImage(w96, 0, 0, 500, 500, this);
				break;

			case 97:
				ImageIcon im97 = new ImageIcon("lugia/097.PNG");
				Image w97 = im97.getImage();
				g.drawImage(w97, 0, 0, 500, 500, this);
				break;

			case 98:
				ImageIcon im98 = new ImageIcon("lugia/098.PNG");
				Image w98 = im98.getImage();
				g.drawImage(w98, 0, 0, 500, 500, this);
				break;

			case 99:
				ImageIcon im99 = new ImageIcon("lugia/099.PNG");
				Image w99 = im99.getImage();
				g.drawImage(w99, 0, 0, 500, 500, this);
				break;

			case 100:
				ImageIcon im100 = new ImageIcon("lugia/100.PNG");
				Image w100 = im100.getImage();
				g.drawImage(w100, 0, 0, 500, 500, this);
				break;

			case 101:
				ImageIcon im101 = new ImageIcon("lugia/101.PNG");
				Image w101 = im101.getImage();
				g.drawImage(w101, 0, 0, 500, 500, this);
				break;

			case 102:
				ImageIcon im102 = new ImageIcon("lugia/102.PNG");
				Image w102 = im102.getImage();
				g.drawImage(w102, 0, 0, 500, 500, this);
				break;

			case 103:
				ImageIcon im103 = new ImageIcon("lugia/103.PNG");
				Image w103 = im103.getImage();
				g.drawImage(w103, 0, 0, 500, 500, this);
				break;

			case 104:
				ImageIcon im104 = new ImageIcon("lugia/104.PNG");
				Image w104 = im104.getImage();
				g.drawImage(w104, 0, 0, 500, 500, this);
				break;

			case 105:
				ImageIcon im105 = new ImageIcon("lugia/105.PNG");
				Image w105 = im105.getImage();
				g.drawImage(w105, 0, 0, 500, 500, this);
				break;

			case 106:
				ImageIcon im106 = new ImageIcon("lugia/106.PNG");
				Image w106 = im106.getImage();
				g.drawImage(w106, 0, 0, 500, 500, this);
				break;

			case 107:
				ImageIcon im107 = new ImageIcon("lugia/107.PNG");
				Image w107 = im107.getImage();
				g.drawImage(w107, 0, 0, 500, 500, this);
				break;

			case 108:
				ImageIcon im108 = new ImageIcon("lugia/108.PNG");
				Image w108 = im108.getImage();
				g.drawImage(w108, 0, 0, 500, 500, this);
				break;

			case 109:
				ImageIcon im109 = new ImageIcon("lugia/109.PNG");
				Image w109 = im109.getImage();
				g.drawImage(w109, 0, 0, 500, 500, this);
				break;

			case 110:
				ImageIcon im110 = new ImageIcon("lugia/110.PNG");
				Image w110 = im110.getImage();
				g.drawImage(w110, 0, 0, 500, 500, this);
				break;

			case 111:
				ImageIcon im111 = new ImageIcon("lugia/111.PNG");
				Image w111 = im111.getImage();
				g.drawImage(w111, 0, 0, 500, 500, this);
				break;

			case 112:
				ImageIcon im112 = new ImageIcon("lugia/112.PNG");
				Image w112 = im112.getImage();
				g.drawImage(w112, 0, 0, 500, 500, this);
				break;

			case 113:
				ImageIcon im113 = new ImageIcon("lugia/113.PNG");
				Image w113 = im113.getImage();
				g.drawImage(w113, 0, 0, 500, 500, this);
				break;

			case 114:
				ImageIcon im114 = new ImageIcon("lugia/114.PNG");
				Image w114 = im114.getImage();
				g.drawImage(w114, 0, 0, 500, 500, this);
				break;

			case 115:
				ImageIcon im115 = new ImageIcon("lugia/115.PNG");
				Image w115 = im115.getImage();
				g.drawImage(w115, 0, 0, 500, 500, this);
				break;

			case 116:
				ImageIcon im116 = new ImageIcon("lugia/116.PNG");
				Image w116 = im116.getImage();
				g.drawImage(w116, 0, 0, 500, 500, this);
				break;

			case 117:
				ImageIcon im117 = new ImageIcon("lugia/117.PNG");
				Image w117 = im117.getImage();
				g.drawImage(w117, 0, 0, 500, 500, this);
				break;

			case 118:
				ImageIcon im118 = new ImageIcon("lugia/118.PNG");
				Image w118 = im118.getImage();
				g.drawImage(w118, 0, 0, 500, 500, this);
				break;

			case 119:
				ImageIcon im119 = new ImageIcon("lugia/119.PNG");
				Image w119 = im119.getImage();
				g.drawImage(w119, 0, 0, 500, 500, this);
				break;

			case 120:
				ImageIcon im120 = new ImageIcon("lugia/120.PNG");
				Image w120 = im120.getImage();
				g.drawImage(w120, 0, 0, 500, 500, this);
				break;

			case 121:
				ImageIcon im121 = new ImageIcon("lugia/121.PNG");
				Image w121 = im121.getImage();
				g.drawImage(w121, 0, 0, 500, 500, this);
				break;

			case 122:
				ImageIcon im122 = new ImageIcon("lugia/122.PNG");
				Image w122 = im122.getImage();
				g.drawImage(w122, 0, 0, 500, 500, this);
				break;

			case 123:
				ImageIcon im123 = new ImageIcon("lugia/123.PNG");
				Image w123 = im123.getImage();
				g.drawImage(w123, 0, 0, 500, 500, this);
				break;

			case 124:
				ImageIcon im124 = new ImageIcon("lugia/124.PNG");
				Image w124 = im124.getImage();
				g.drawImage(w124, 0, 0, 500, 500, this);
				break;

			case 125:
				ImageIcon im125 = new ImageIcon("lugia/125.PNG");
				Image w125 = im125.getImage();
				g.drawImage(w125, 0, 0, 500, 500, this);
				break;

			case 126:
				ImageIcon im126 = new ImageIcon("lugia/126.PNG");
				Image w126 = im126.getImage();
				g.drawImage(w126, 0, 0, 500, 500, this);
				break;

			case 127:
				ImageIcon im127 = new ImageIcon("lugia/127.PNG");
				Image w127 = im127.getImage();
				g.drawImage(w127, 0, 0, 500, 500, this);
				break;

			case 128:
				ImageIcon im128 = new ImageIcon("lugia/128.PNG");
				Image w128 = im128.getImage();
				g.drawImage(w128, 0, 0, 500, 500, this);
				break;

			case 129:
				ImageIcon im129 = new ImageIcon("lugia/129.PNG");
				Image w129 = im129.getImage();
				g.drawImage(w129, 0, 0, 500, 500, this);
				break;

			case 130:
				ImageIcon im130 = new ImageIcon("lugia/130.PNG");
				Image w130 = im130.getImage();
				g.drawImage(w130, 0, 0, 500, 500, this);
				break;

			case 131:
				ImageIcon im131 = new ImageIcon("lugia/131.PNG");
				Image w131 = im131.getImage();
				g.drawImage(w131, 0, 0, 500, 500, this);
				break;

			case 132:
				ImageIcon im132 = new ImageIcon("lugia/132.PNG");
				Image w132 = im132.getImage();
				g.drawImage(w132, 0, 0, 500, 500, this);
				break;

			case 133:
				ImageIcon im133 = new ImageIcon("lugia/133.PNG");
				Image w133 = im133.getImage();
				g.drawImage(w133, 0, 0, 500, 500, this);
				break;

			case 134:
				ImageIcon im134 = new ImageIcon("lugia/134.PNG");
				Image w134 = im134.getImage();
				g.drawImage(w134, 0, 0, 500, 500, this);
				break;

			case 135:
				ImageIcon im135 = new ImageIcon("lugia/135.PNG");
				Image w135 = im135.getImage();
				g.drawImage(w135, 0, 0, 500, 500, this);
				break;

			case 136:
				ImageIcon im136 = new ImageIcon("lugia/136.PNG");
				Image w136 = im136.getImage();
				g.drawImage(w136, 0, 0, 500, 500, this);
				break;

			case 137:
				ImageIcon im137 = new ImageIcon("lugia/137.PNG");
				Image w137 = im137.getImage();
				g.drawImage(w137, 0, 0, 500, 500, this);
				break;

			case 138:
				ImageIcon im138 = new ImageIcon("lugia/138.PNG");
				Image w138 = im138.getImage();
				g.drawImage(w138, 0, 0, 500, 500, this);
				break;

			case 139:
				ImageIcon im139 = new ImageIcon("lugia/139.PNG");
				Image w139 = im139.getImage();
				g.drawImage(w139, 0, 0, 500, 500, this);
				break;

			case 140:
				ImageIcon im140 = new ImageIcon("lugia/140.PNG");
				Image w140 = im140.getImage();
				g.drawImage(w140, 0, 0, 500, 500, this);
				break;

			case 141:
				ImageIcon im141 = new ImageIcon("lugia/141.PNG");
				Image w141 = im141.getImage();
				g.drawImage(w141, 0, 0, 500, 500, this);
				break;

			case 142:
				ImageIcon im142 = new ImageIcon("lugia/142.PNG");
				Image w142 = im142.getImage();
				g.drawImage(w142, 0, 0, 500, 500, this);
				break;

			case 143:
				ImageIcon im143 = new ImageIcon("lugia/143.PNG");
				Image w143 = im143.getImage();
				g.drawImage(w143, 0, 0, 500, 500, this);
				break;

			case 144:
				ImageIcon im144 = new ImageIcon("lugia/144.PNG");
				Image w144 = im144.getImage();
				g.drawImage(w144, 0, 0, 500, 500, this);
				break;

			case 145:
				ImageIcon im145 = new ImageIcon("lugia/145.PNG");
				Image w145 = im145.getImage();
				g.drawImage(w145, 0, 0, 500, 500, this);
				break;

			case 146:
				ImageIcon im146 = new ImageIcon("lugia/146.PNG");
				Image w146 = im146.getImage();
				g.drawImage(w146, 0, 0, 500, 500, this);
				break;

			case 147:
				ImageIcon im147 = new ImageIcon("lugia/147.PNG");
				Image w147 = im147.getImage();
				g.drawImage(w147, 0, 0, 500, 500, this);
				break;

			case 148:
				ImageIcon im148 = new ImageIcon("lugia/148.PNG");
				Image w148 = im148.getImage();
				g.drawImage(w148, 0, 0, 500, 500, this);
				break;

			case 149:
				ImageIcon im149 = new ImageIcon("lugia/149.PNG");
				Image w149 = im149.getImage();
				g.drawImage(w149, 0, 0, 500, 500, this);
				break;

			case 150:
				ImageIcon im150 = new ImageIcon("lugia/150.PNG");
				Image w150 = im150.getImage();
				g.drawImage(w150, 0, 0, 500, 500, this);
				break;

			case 151:
				ImageIcon im151 = new ImageIcon("lugia/151.PNG");
				Image w151 = im151.getImage();
				g.drawImage(w151, 0, 0, 500, 500, this);
				break;

			case 152:
				ImageIcon im152 = new ImageIcon("lugia/152.PNG");
				Image w152 = im152.getImage();
				g.drawImage(w152, 0, 0, 500, 500, this);
				break;

			case 153:
				ImageIcon im153 = new ImageIcon("lugia/153.PNG");
				Image w153 = im153.getImage();
				g.drawImage(w153, 0, 0, 500, 500, this);
				break;

			case 154:
				ImageIcon im154 = new ImageIcon("lugia/154.PNG");
				Image w154 = im154.getImage();
				g.drawImage(w154, 0, 0, 500, 500, this);
				break;

			case 155:
				ImageIcon im155 = new ImageIcon("lugia/155.PNG");
				Image w155 = im155.getImage();
				g.drawImage(w155, 0, 0, 500, 500, this);
				break;

			case 156:
				ImageIcon im156 = new ImageIcon("lugia/156.PNG");
				Image w156 = im156.getImage();
				g.drawImage(w156, 0, 0, 500, 500, this);
				break;

			case 157:
				ImageIcon im157 = new ImageIcon("lugia/157.PNG");
				Image w157 = im157.getImage();
				g.drawImage(w157, 0, 0, 500, 500, this);
				break;

			case 158:
				ImageIcon im158 = new ImageIcon("lugia/158.PNG");
				Image w158 = im158.getImage();
				g.drawImage(w158, 0, 0, 500, 500, this);
				break;

			case 159:
				ImageIcon im159 = new ImageIcon("lugia/159.PNG");
				Image w159 = im159.getImage();
				g.drawImage(w159, 0, 0, 500, 500, this);
				break;

			case 160:
				ImageIcon im160 = new ImageIcon("lugia/160.PNG");
				Image w160 = im160.getImage();
				g.drawImage(w160, 0, 0, 500, 500, this);
				break;

			case 161:
				ImageIcon im161 = new ImageIcon("lugia/161.PNG");
				Image w161 = im161.getImage();
				g.drawImage(w161, 0, 0, 500, 500, this);
				break;

			case 162:
				ImageIcon im162 = new ImageIcon("lugia/162.PNG");
				Image w162 = im162.getImage();
				g.drawImage(w162, 0, 0, 500, 500, this);
				break;

			case 163:
				ImageIcon im163 = new ImageIcon("lugia/163.PNG");
				Image w163 = im163.getImage();
				g.drawImage(w163, 0, 0, 500, 500, this);
				break;

			case 164:
				ImageIcon im164 = new ImageIcon("lugia/164.PNG");
				Image w164 = im164.getImage();
				g.drawImage(w164, 0, 0, 500, 500, this);
				break;

			case 165:
				ImageIcon im165 = new ImageIcon("lugia/165.PNG");
				Image w165 = im165.getImage();
				g.drawImage(w165, 0, 0, 500, 500, this);
				break;

			case 166:
				ImageIcon im166 = new ImageIcon("lugia/166.PNG");
				Image w166 = im166.getImage();
				g.drawImage(w166, 0, 0, 500, 500, this);
				break;

			case 167:
				ImageIcon im167 = new ImageIcon("lugia/167.PNG");
				Image w167 = im167.getImage();
				g.drawImage(w167, 0, 0, 500, 500, this);
				break;

			case 168:
				ImageIcon im168 = new ImageIcon("lugia/168.PNG");
				Image w168 = im168.getImage();
				g.drawImage(w168, 0, 0, 500, 500, this);
				break;

			case 169:
				ImageIcon im169 = new ImageIcon("lugia/169.PNG");
				Image w169 = im169.getImage();
				g.drawImage(w169, 0, 0, 500, 500, this);
				break;

			case 170:
				ImageIcon im170 = new ImageIcon("lugia/170.PNG");
				Image w170 = im170.getImage();
				g.drawImage(w170, 0, 0, 500, 500, this);
				break;

			case 171:
				ImageIcon im171 = new ImageIcon("lugia/171.PNG");
				Image w171 = im171.getImage();
				g.drawImage(w171, 0, 0, 500, 500, this);
				break;

			case 172:
				ImageIcon im172 = new ImageIcon("lugia/172.PNG");
				Image w172 = im172.getImage();
				g.drawImage(w172, 0, 0, 500, 500, this);
				break;

			case 173:
				ImageIcon im173 = new ImageIcon("lugia/173.PNG");
				Image w173 = im173.getImage();
				g.drawImage(w173, 0, 0, 500, 500, this);
				break;

			case 174:
				ImageIcon im174 = new ImageIcon("lugia/174.PNG");
				Image w174 = im174.getImage();
				g.drawImage(w174, 0, 0, 500, 500, this);
				break;

			case 175:
				ImageIcon im175 = new ImageIcon("lugia/175.PNG");
				Image w175 = im175.getImage();
				g.drawImage(w175, 0, 0, 500, 500, this);
				break;

			case 176:
				ImageIcon im176 = new ImageIcon("lugia/176.PNG");
				Image w176 = im176.getImage();
				g.drawImage(w176, 0, 0, 500, 500, this);
				break;

			case 177:
				ImageIcon im177 = new ImageIcon("lugia/177.PNG");
				Image w177 = im177.getImage();
				g.drawImage(w177, 0, 0, 500, 500, this);
				break;

			case 178:
				ImageIcon im178 = new ImageIcon("lugia/178.PNG");
				Image w178 = im178.getImage();
				g.drawImage(w178, 0, 0, 500, 500, this);
				break;

			case 179:
				ImageIcon im179 = new ImageIcon("lugia/179.PNG");
				Image w179 = im179.getImage();
				g.drawImage(w179, 0, 0, 500, 500, this);
				break;

			case 180:
				ImageIcon im180 = new ImageIcon("lugia/180.PNG");
				Image w180 = im180.getImage();
				g.drawImage(w180, 0, 0, 500, 500, this);
				break;

			case 181:
				ImageIcon im181 = new ImageIcon("lugia/181.PNG");
				Image w181 = im181.getImage();
				g.drawImage(w181, 0, 0, 500, 500, this);
				break;

			case 182:
				ImageIcon im182 = new ImageIcon("lugia/182.PNG");
				Image w182 = im182.getImage();
				g.drawImage(w182, 0, 0, 500, 500, this);
				break;

			case 183:
				ImageIcon im183 = new ImageIcon("lugia/183.PNG");
				Image w183 = im183.getImage();
				g.drawImage(w183, 0, 0, 500, 500, this);
				break;

			case 184:
				ImageIcon im184 = new ImageIcon("lugia/184.PNG");
				Image w184 = im184.getImage();
				g.drawImage(w184, 0, 0, 500, 500, this);
				break;

			case 185:
				ImageIcon im185 = new ImageIcon("lugia/185.PNG");
				Image w185 = im185.getImage();
				g.drawImage(w185, 0, 0, 500, 500, this);
				break;

			case 186:
				ImageIcon im186 = new ImageIcon("lugia/186.PNG");
				Image w186 = im186.getImage();
				g.drawImage(w186, 0, 0, 500, 500, this);
				break;

			case 187:
				ImageIcon im187 = new ImageIcon("lugia/187.PNG");
				Image w187 = im187.getImage();
				g.drawImage(w187, 0, 0, 500, 500, this);
				break;

			case 188:
				ImageIcon im188 = new ImageIcon("lugia/188.PNG");
				Image w188 = im188.getImage();
				g.drawImage(w188, 0, 0, 500, 500, this);
				break;

			case 189:
				ImageIcon im189 = new ImageIcon("lugia/189.PNG");
				Image w189 = im189.getImage();
				g.drawImage(w189, 0, 0, 500, 500, this);
				break;

			case 190:
				ImageIcon im190 = new ImageIcon("lugia/190.PNG");
				Image w190 = im190.getImage();
				g.drawImage(w190, 0, 0, 500, 500, this);
				break;

			case 191:
				ImageIcon im191 = new ImageIcon("lugia/191.PNG");
				Image w191 = im191.getImage();
				g.drawImage(w191, 0, 0, 500, 500, this);
				break;

			case 192:
				ImageIcon im192 = new ImageIcon("lugia/192.PNG");
				Image w192 = im192.getImage();
				g.drawImage(w192, 0, 0, 500, 500, this);
				break;

			case 193:
				ImageIcon im193 = new ImageIcon("lugia/193.PNG");
				Image w193 = im193.getImage();
				g.drawImage(w193, 0, 0, 500, 500, this);
				break;

			case 194:
				ImageIcon im194 = new ImageIcon("lugia/194.PNG");
				Image w194 = im194.getImage();
				g.drawImage(w194, 0, 0, 500, 500, this);
				break;

			case 195:
				ImageIcon im195 = new ImageIcon("lugia/195.PNG");
				Image w195 = im195.getImage();
				g.drawImage(w195, 0, 0, 500, 500, this);
				break;

			case 196:
				ImageIcon im196 = new ImageIcon("lugia/196.PNG");
				Image w196 = im196.getImage();
				g.drawImage(w196, 0, 0, 500, 500, this);
				break;

			case 197:
				ImageIcon im197 = new ImageIcon("lugia/197.PNG");
				Image w197 = im197.getImage();
				g.drawImage(w197, 0, 0, 500, 500, this);
				break;

			case 198:
				ImageIcon im198 = new ImageIcon("lugia/198.PNG");
				Image w198 = im198.getImage();
				g.drawImage(w198, 0, 0, 500, 500, this);
				break;

			case 199:
				ImageIcon im199 = new ImageIcon("lugia/199.PNG");
				Image w199 = im199.getImage();
				g.drawImage(w199, 0, 0, 500, 500, this);
				break;

			case 200:
				ImageIcon im200 = new ImageIcon("lugia/200.PNG");
				Image w200 = im200.getImage();
				g.drawImage(w200, 0, 0, 500, 500, this);
				break;

			case 201:
				ImageIcon im201 = new ImageIcon("lugia/201.PNG");
				Image w201 = im201.getImage();
				g.drawImage(w201, 0, 0, 500, 500, this);
				break;

			case 202:
				ImageIcon im202 = new ImageIcon("lugia/202.PNG");
				Image w202 = im202.getImage();
				g.drawImage(w202, 0, 0, 500, 500, this);
				break;

			case 203:
				ImageIcon im203 = new ImageIcon("lugia/203.PNG");
				Image w203 = im203.getImage();
				g.drawImage(w203, 0, 0, 500, 500, this);
				break;

			case 204:
				ImageIcon im204 = new ImageIcon("lugia/204.PNG");
				Image w204 = im204.getImage();
				g.drawImage(w204, 0, 0, 500, 500, this);
				break;

			case 205:
				ImageIcon im205 = new ImageIcon("lugia/205.PNG");
				Image w205 = im205.getImage();
				g.drawImage(w205, 0, 0, 500, 500, this);
				break;

			case 206:
				ImageIcon im206 = new ImageIcon("lugia/206.PNG");
				Image w206 = im206.getImage();
				g.drawImage(w206, 0, 0, 500, 500, this);
				break;

			case 207:
				ImageIcon im207 = new ImageIcon("lugia/207.PNG");
				Image w207 = im207.getImage();
				g.drawImage(w207, 0, 0, 500, 500, this);
				break;

			case 208:
				ImageIcon im208 = new ImageIcon("lugia/208.PNG");
				Image w208 = im208.getImage();
				g.drawImage(w208, 0, 0, 500, 500, this);
				break;

			case 209:
				ImageIcon im209 = new ImageIcon("lugia/209.PNG");
				Image w209 = im209.getImage();
				g.drawImage(w209, 0, 0, 500, 500, this);
				break;

			case 210:
				ImageIcon im210 = new ImageIcon("lugia/210.PNG");
				Image w210 = im210.getImage();
				g.drawImage(w210, 0, 0, 500, 500, this);
				break;

			case 211:
				ImageIcon im211 = new ImageIcon("lugia/211.PNG");
				Image w211 = im211.getImage();
				g.drawImage(w211, 0, 0, 500, 500, this);
				break;

			case 212:
				ImageIcon im212 = new ImageIcon("lugia/212.PNG");
				Image w212 = im212.getImage();
				g.drawImage(w212, 0, 0, 500, 500, this);
				break;

			case 213:
				ImageIcon im213 = new ImageIcon("lugia/213.PNG");
				Image w213 = im213.getImage();
				g.drawImage(w213, 0, 0, 500, 500, this);
				break;

			case 214:
				ImageIcon im214 = new ImageIcon("lugia/214.PNG");
				Image w214 = im214.getImage();
				g.drawImage(w214, 0, 0, 500, 500, this);
				break;

			case 215:
				ImageIcon im215 = new ImageIcon("lugia/215.PNG");
				Image w215 = im215.getImage();
				g.drawImage(w215, 0, 0, 500, 500, this);
				break;

			case 216:
				ImageIcon im216 = new ImageIcon("lugia/216.PNG");
				Image w216 = im216.getImage();
				g.drawImage(w216, 0, 0, 500, 500, this);
				break;

			case 217:
				ImageIcon im217 = new ImageIcon("lugia/217.PNG");
				Image w217 = im217.getImage();
				g.drawImage(w217, 0, 0, 500, 500, this);
				break;

			case 218:
				ImageIcon im218 = new ImageIcon("lugia/218.PNG");
				Image w218 = im218.getImage();
				g.drawImage(w218, 0, 0, 500, 500, this);
				break;

			case 219:
				ImageIcon im219 = new ImageIcon("lugia/219.PNG");
				Image w219 = im219.getImage();
				g.drawImage(w219, 0, 0, 500, 500, this);
				break;

			case 220:
				ImageIcon im220 = new ImageIcon("lugia/220.PNG");
				Image w220 = im220.getImage();
				g.drawImage(w220, 0, 0, 500, 500, this);
				break;

			case 221:
				ImageIcon im221 = new ImageIcon("lugia/221.PNG");
				Image w221 = im221.getImage();
				g.drawImage(w221, 0, 0, 500, 500, this);
				break;

			case 222:
				ImageIcon im222 = new ImageIcon("lugia/222.PNG");
				Image w222 = im222.getImage();
				g.drawImage(w222, 0, 0, 500, 500, this);
				break;

			case 223:
				ImageIcon im223 = new ImageIcon("lugia/223.PNG");
				Image w223 = im223.getImage();
				g.drawImage(w223, 0, 0, 500, 500, this);
				break;

			case 224:
				ImageIcon im224 = new ImageIcon("lugia/224.PNG");
				Image w224 = im224.getImage();
				g.drawImage(w224, 0, 0, 500, 500, this);
				break;

			case 225:
				ImageIcon im225 = new ImageIcon("lugia/225.PNG");
				Image w225 = im225.getImage();
				g.drawImage(w225, 0, 0, 500, 500, this);
				break;

			case 226:
				ImageIcon im226 = new ImageIcon("lugia/226.PNG");
				Image w226 = im226.getImage();
				g.drawImage(w226, 0, 0, 500, 500, this);
				break;

			case 227:
				ImageIcon im227 = new ImageIcon("lugia/227.PNG");
				Image w227 = im227.getImage();
				g.drawImage(w227, 0, 0, 500, 500, this);
				break;

			case 228:
				ImageIcon im228 = new ImageIcon("lugia/228.PNG");
				Image w228 = im228.getImage();
				g.drawImage(w228, 0, 0, 500, 500, this);
				break;

			case 229:
				ImageIcon im229 = new ImageIcon("lugia/229.PNG");
				Image w229 = im229.getImage();
				g.drawImage(w229, 0, 0, 500, 500, this);
				break;

			case 230:
				ImageIcon im230 = new ImageIcon("lugia/230.PNG");
				Image w230 = im230.getImage();
				g.drawImage(w230, 0, 0, 500, 500, this);
				break;

			case 231:
				ImageIcon im231 = new ImageIcon("lugia/231.PNG");
				Image w231 = im231.getImage();
				g.drawImage(w231, 0, 0, 500, 500, this);
				break;

			case 232:
				ImageIcon im232 = new ImageIcon("lugia/232.PNG");
				Image w232 = im232.getImage();
				g.drawImage(w232, 0, 0, 500, 500, this);
				break;

			case 233:
				ImageIcon im233 = new ImageIcon("lugia/233.PNG");
				Image w233 = im233.getImage();
				g.drawImage(w233, 0, 0, 500, 500, this);
				break;

			case 234:
				ImageIcon im234 = new ImageIcon("lugia/234.PNG");
				Image w234 = im234.getImage();
				g.drawImage(w234, 0, 0, 500, 500, this);
				break;

			case 235:
				ImageIcon im235 = new ImageIcon("lugia/235.PNG");
				Image w235 = im235.getImage();
				g.drawImage(w235, 0, 0, 500, 500, this);
				break;

			case 236:
				ImageIcon im236 = new ImageIcon("lugia/236.PNG");
				Image w236 = im236.getImage();
				g.drawImage(w236, 0, 0, 500, 500, this);
				break;

			case 237:
				ImageIcon im237 = new ImageIcon("lugia/237.PNG");
				Image w237 = im237.getImage();
				g.drawImage(w237, 0, 0, 500, 500, this);
				break;

			case 238:
				ImageIcon im238 = new ImageIcon("lugia/238.PNG");
				Image w238 = im238.getImage();
				g.drawImage(w238, 0, 0, 500, 500, this);
				break;

			case 239:
				ImageIcon im239 = new ImageIcon("lugia/239.PNG");
				Image w239 = im239.getImage();
				g.drawImage(w239, 0, 0, 500, 500, this);
				break;

			case 240:
				ImageIcon im240 = new ImageIcon("lugia/240.PNG");
				Image w240 = im240.getImage();
				g.drawImage(w240, 0, 0, 500, 500, this);
				break;

			case 241:
				ImageIcon im241 = new ImageIcon("lugia/241.PNG");
				Image w241 = im241.getImage();
				g.drawImage(w241, 0, 0, 500, 500, this);
				break;

			case 242:
				ImageIcon im242 = new ImageIcon("lugia/242.PNG");
				Image w242 = im242.getImage();
				g.drawImage(w242, 0, 0, 500, 500, this);
				break;

			case 243:
				ImageIcon im243 = new ImageIcon("lugia/243.PNG");
				Image w243 = im243.getImage();
				g.drawImage(w243, 0, 0, 500, 500, this);
				break;

			case 244:
				ImageIcon im244 = new ImageIcon("lugia/244.PNG");
				Image w244 = im244.getImage();
				g.drawImage(w244, 0, 0, 500, 500, this);
				break;

			case 245:
				ImageIcon im245 = new ImageIcon("lugia/245.PNG");
				Image w245 = im245.getImage();
				g.drawImage(w245, 0, 0, 500, 500, this);
				break;

			case 246:
				ImageIcon im246 = new ImageIcon("lugia/246.PNG");
				Image w246 = im246.getImage();
				g.drawImage(w246, 0, 0, 500, 500, this);
				break;

			case 247:
				ImageIcon im247 = new ImageIcon("lugia/247.PNG");
				Image w247 = im247.getImage();
				g.drawImage(w247, 0, 0, 500, 500, this);
				break;

			case 248:
				ImageIcon im248 = new ImageIcon("lugia/248.PNG");
				Image w248 = im248.getImage();
				g.drawImage(w248, 0, 0, 500, 500, this);
				break;

			case 249:
				ImageIcon im249 = new ImageIcon("lugia/249.PNG");
				Image w249 = im249.getImage();
				g.drawImage(w249, 0, 0, 500, 500, this);
				break;

			case 250:
				ImageIcon im250 = new ImageIcon("lugia/250.PNG");
				Image w250 = im250.getImage();
				g.drawImage(w250, 0, 0, 500, 500, this);
				break;

			case 251:
				ImageIcon im251 = new ImageIcon("lugia/251.PNG");
				Image w251 = im251.getImage();
				g.drawImage(w251, 0, 0, 500, 500, this);
				break;

			case 252:
				ImageIcon im252 = new ImageIcon("lugia/252.PNG");
				Image w252 = im252.getImage();
				g.drawImage(w252, 0, 0, 500, 500, this);
				break;

			case 253:
				ImageIcon im253 = new ImageIcon("lugia/253.PNG");
				Image w253 = im253.getImage();
				g.drawImage(w253, 0, 0, 500, 500, this);
				break;

			case 254:
				ImageIcon im254 = new ImageIcon("lugia/254.PNG");
				Image w254 = im254.getImage();
				g.drawImage(w254, 0, 0, 500, 500, this);
				break;

			case 255:
				ImageIcon im255 = new ImageIcon("lugia/255.PNG");
				Image w255 = im255.getImage();
				g.drawImage(w255, 0, 0, 500, 500, this);
				break;

			case 256:
				ImageIcon im256 = new ImageIcon("lugia/256.PNG");
				Image w256 = im256.getImage();
				g.drawImage(w256, 0, 0, 500, 500, this);
				break;

			case 257:
				ImageIcon im257 = new ImageIcon("lugia/257.PNG");
				Image w257 = im257.getImage();
				g.drawImage(w257, 0, 0, 500, 500, this);
				break;

			case 258:
				ImageIcon im258 = new ImageIcon("lugia/258.PNG");
				Image w258 = im258.getImage();
				g.drawImage(w258, 0, 0, 500, 500, this);
				break;

			case 259:
				ImageIcon im259 = new ImageIcon("lugia/259.PNG");
				Image w259 = im259.getImage();
				g.drawImage(w259, 0, 0, 500, 500, this);
				break;

			case 260:
				ImageIcon im260 = new ImageIcon("lugia/260.PNG");
				Image w260 = im260.getImage();
				g.drawImage(w260, 0, 0, 500, 500, this);
				break;

			case 261:
				ImageIcon im261 = new ImageIcon("lugia/261.PNG");
				Image w261 = im261.getImage();
				g.drawImage(w261, 0, 0, 500, 500, this);
				break;

			case 262:
				ImageIcon im262 = new ImageIcon("lugia/262.PNG");
				Image w262 = im262.getImage();
				g.drawImage(w262, 0, 0, 500, 500, this);
				break;

			case 263:
				ImageIcon im263 = new ImageIcon("lugia/263.PNG");
				Image w263 = im263.getImage();
				g.drawImage(w263, 0, 0, 500, 500, this);
				break;

			case 264:
				ImageIcon im264 = new ImageIcon("lugia/264.PNG");
				Image w264 = im264.getImage();
				g.drawImage(w264, 0, 0, 500, 500, this);
				break;

			case 265:
				ImageIcon im265 = new ImageIcon("lugia/265.PNG");
				Image w265 = im265.getImage();
				g.drawImage(w265, 0, 0, 500, 500, this);
				break;

			case 266:
				ImageIcon im266 = new ImageIcon("lugia/266.PNG");
				Image w266 = im266.getImage();
				g.drawImage(w266, 0, 0, 500, 500, this);
				break;

			case 267:
				ImageIcon im267 = new ImageIcon("lugia/267.PNG");
				Image w267 = im267.getImage();
				g.drawImage(w267, 0, 0, 500, 500, this);
				break;

			case 268:
				ImageIcon im268 = new ImageIcon("lugia/268.PNG");
				Image w268 = im268.getImage();
				g.drawImage(w268, 0, 0, 500, 500, this);
				break;

			case 269:
				ImageIcon im269 = new ImageIcon("lugia/269.PNG");
				Image w269 = im269.getImage();
				g.drawImage(w269, 0, 0, 500, 500, this);
				break;

			case 270:
				ImageIcon im270 = new ImageIcon("lugia/270.PNG");
				Image w270 = im270.getImage();
				g.drawImage(w270, 0, 0, 500, 500, this);
				break;

			case 271:
				ImageIcon im271 = new ImageIcon("lugia/271.PNG");
				Image w271 = im271.getImage();
				g.drawImage(w271, 0, 0, 500, 500, this);
				break;

			case 272:
				ImageIcon im272 = new ImageIcon("lugia/272.PNG");
				Image w272 = im272.getImage();
				g.drawImage(w272, 0, 0, 500, 500, this);
				break;

			case 273:
				ImageIcon im273 = new ImageIcon("lugia/273.PNG");
				Image w273 = im273.getImage();
				g.drawImage(w273, 0, 0, 500, 500, this);
				break;

			case 274:
				ImageIcon im274 = new ImageIcon("lugia/274.PNG");
				Image w274 = im274.getImage();
				g.drawImage(w274, 0, 0, 500, 500, this);
				break;

			case 275:
				ImageIcon im275 = new ImageIcon("lugia/275.PNG");
				Image w275 = im275.getImage();
				g.drawImage(w275, 0, 0, 500, 500, this);
				break;

			case 276:
				ImageIcon im276 = new ImageIcon("lugia/276.PNG");
				Image w276 = im276.getImage();
				g.drawImage(w276, 0, 0, 500, 500, this);
				break;

			case 277:
				ImageIcon im277 = new ImageIcon("lugia/277.PNG");
				Image w277 = im277.getImage();
				g.drawImage(w277, 0, 0, 500, 500, this);
				break;

			case 278:
				ImageIcon im278 = new ImageIcon("lugia/278.PNG");
				Image w278 = im278.getImage();
				g.drawImage(w278, 0, 0, 500, 500, this);
				break;

			case 279:
				ImageIcon im279 = new ImageIcon("lugia/279.PNG");
				Image w279 = im279.getImage();
				g.drawImage(w279, 0, 0, 500, 500, this);
				break;

			case 280:
				ImageIcon im280 = new ImageIcon("lugia/280.PNG");
				Image w280 = im280.getImage();
				g.drawImage(w280, 0, 0, 500, 500, this);
				break;

			case 281:
				ImageIcon im281 = new ImageIcon("lugia/281.PNG");
				Image w281 = im281.getImage();
				g.drawImage(w281, 0, 0, 500, 500, this);
				break;

			case 282:
				ImageIcon im282 = new ImageIcon("lugia/282.PNG");
				Image w282 = im282.getImage();
				g.drawImage(w282, 0, 0, 500, 500, this);
				break;

			case 283:
				ImageIcon im283 = new ImageIcon("lugia/283.PNG");
				Image w283 = im283.getImage();
				g.drawImage(w283, 0, 0, 500, 500, this);
				break;

			case 284:
				ImageIcon im284 = new ImageIcon("lugia/284.PNG");
				Image w284 = im284.getImage();
				g.drawImage(w284, 0, 0, 500, 500, this);
				break;

			case 285:
				ImageIcon im285 = new ImageIcon("lugia/285.PNG");
				Image w285 = im285.getImage();
				g.drawImage(w285, 0, 0, 500, 500, this);
				break;

			case 286:
				ImageIcon im286 = new ImageIcon("lugia/286.PNG");
				Image w286 = im286.getImage();
				g.drawImage(w286, 0, 0, 500, 500, this);
				break;

			case 287:
				ImageIcon im287 = new ImageIcon("lugia/287.PNG");
				Image w287 = im287.getImage();
				g.drawImage(w287, 0, 0, 500, 500, this);
				break;

			case 288:
				ImageIcon im288 = new ImageIcon("lugia/288.PNG");
				Image w288 = im288.getImage();
				g.drawImage(w288, 0, 0, 500, 500, this);
				break;

			case 289:
				ImageIcon im289 = new ImageIcon("lugia/289.PNG");
				Image w289 = im289.getImage();
				g.drawImage(w289, 0, 0, 500, 500, this);
				break;

			case 290:
				ImageIcon im290 = new ImageIcon("lugia/290.PNG");
				Image w290 = im290.getImage();
				g.drawImage(w290, 0, 0, 500, 500, this);
				break;

			case 291:
				ImageIcon im291 = new ImageIcon("lugia/291.PNG");
				Image w291 = im291.getImage();
				g.drawImage(w291, 0, 0, 500, 500, this);
				break;

			case 292:
				ImageIcon im292 = new ImageIcon("lugia/292.PNG");
				Image w292 = im292.getImage();
				g.drawImage(w292, 0, 0, 500, 500, this);
				break;

			case 293:
				ImageIcon im293 = new ImageIcon("lugia/293.PNG");
				Image w293 = im293.getImage();
				g.drawImage(w293, 0, 0, 500, 500, this);
				break;

			case 294:
				ImageIcon im294 = new ImageIcon("lugia/294.PNG");
				Image w294 = im294.getImage();
				g.drawImage(w294, 0, 0, 500, 500, this);
				break;

			case 295:
				ImageIcon im295 = new ImageIcon("lugia/295.PNG");
				Image w295 = im295.getImage();
				g.drawImage(w295, 0, 0, 500, 500, this);
				break;

			case 296:
				ImageIcon im296 = new ImageIcon("lugia/296.PNG");
				Image w296 = im296.getImage();
				g.drawImage(w296, 0, 0, 500, 500, this);
				break;

			case 297:
				ImageIcon im297 = new ImageIcon("lugia/297.PNG");
				Image w297 = im297.getImage();
				g.drawImage(w297, 0, 0, 500, 500, this);
				break;

			case 298:
				ImageIcon im298 = new ImageIcon("lugia/298.PNG");
				Image w298 = im298.getImage();
				g.drawImage(w298, 0, 0, 500, 500, this);
				break;

			case 299:
				ImageIcon im299 = new ImageIcon("lugia/299.PNG");
				Image w299 = im299.getImage();
				g.drawImage(w299, 0, 0, 500, 500, this);
				break;

			case 300:
				ImageIcon im300 = new ImageIcon("lugia/300.PNG");
				Image w300 = im300.getImage();
				g.drawImage(w300, 0, 0, 500, 500, this);
				break;

			case 301:
				ImageIcon im301 = new ImageIcon("lugia/301.PNG");
				Image w301 = im301.getImage();
				g.drawImage(w301, 0, 0, 500, 500, this);
				break;

			case 302:
				ImageIcon im302 = new ImageIcon("lugia/302.PNG");
				Image w302 = im302.getImage();
				g.drawImage(w302, 0, 0, 500, 500, this);
				break;

			case 303:
				ImageIcon im303 = new ImageIcon("lugia/303.PNG");
				Image w303 = im303.getImage();
				g.drawImage(w303, 0, 0, 500, 500, this);
				break;

			case 304:
				ImageIcon im304 = new ImageIcon("lugia/304.PNG");
				Image w304 = im304.getImage();
				g.drawImage(w304, 0, 0, 500, 500, this);
				break;

			case 305:
				ImageIcon im305 = new ImageIcon("lugia/305.PNG");
				Image w305 = im305.getImage();
				g.drawImage(w305, 0, 0, 500, 500, this);
				break;

			case 306:
				ImageIcon im306 = new ImageIcon("lugia/306.PNG");
				Image w306 = im306.getImage();
				g.drawImage(w306, 0, 0, 500, 500, this);
				break;

			case 307:
				ImageIcon im307 = new ImageIcon("lugia/307.PNG");
				Image w307 = im307.getImage();
				g.drawImage(w307, 0, 0, 500, 500, this);
				break;

			case 308:
				ImageIcon im308 = new ImageIcon("lugia/308.PNG");
				Image w308 = im308.getImage();
				g.drawImage(w308, 0, 0, 500, 500, this);
				break;

			case 309:
				ImageIcon im309 = new ImageIcon("lugia/309.PNG");
				Image w309 = im309.getImage();
				g.drawImage(w309, 0, 0, 500, 500, this);
				break;

			case 310:
				ImageIcon im310 = new ImageIcon("lugia/310.PNG");
				Image w310 = im310.getImage();
				g.drawImage(w310, 0, 0, 500, 500, this);
				break;

			case 311:
				ImageIcon im311 = new ImageIcon("lugia/311.PNG");
				Image w311 = im311.getImage();
				g.drawImage(w311, 0, 0, 500, 500, this);
				break;

			case 312:
				ImageIcon im312 = new ImageIcon("lugia/312.PNG");
				Image w312 = im312.getImage();
				g.drawImage(w312, 0, 0, 500, 500, this);
				break;

			case 313:
				ImageIcon im313 = new ImageIcon("lugia/313.PNG");
				Image w313 = im313.getImage();
				g.drawImage(w313, 0, 0, 500, 500, this);
				break;

			case 314:
				ImageIcon im314 = new ImageIcon("lugia/314.PNG");
				Image w314 = im314.getImage();
				g.drawImage(w314, 0, 0, 500, 500, this);
				break;

			case 315:
				ImageIcon im315 = new ImageIcon("lugia/315.PNG");
				Image w315 = im315.getImage();
				g.drawImage(w315, 0, 0, 500, 500, this);
				break;

			case 316:
				ImageIcon im316 = new ImageIcon("lugia/316.PNG");
				Image w316 = im316.getImage();
				g.drawImage(w316, 0, 0, 500, 500, this);
				break;

			case 317:
				ImageIcon im317 = new ImageIcon("lugia/317.PNG");
				Image w317 = im317.getImage();
				g.drawImage(w317, 0, 0, 500, 500, this);
				break;

			case 318:
				ImageIcon im318 = new ImageIcon("lugia/318.PNG");
				Image w318 = im318.getImage();
				g.drawImage(w318, 0, 0, 500, 500, this);
				break;

			case 319:
				ImageIcon im319 = new ImageIcon("lugia/319.PNG");
				Image w319 = im319.getImage();
				g.drawImage(w319, 0, 0, 500, 500, this);
				break;

			case 320:
				ImageIcon im320 = new ImageIcon("lugia/320.PNG");
				Image w320 = im320.getImage();
				g.drawImage(w320, 0, 0, 500, 500, this);
				break;

			case 321:
				ImageIcon im321 = new ImageIcon("lugia/321.PNG");
				Image w321 = im321.getImage();
				g.drawImage(w321, 0, 0, 500, 500, this);
				break;

			case 322:
				ImageIcon im322 = new ImageIcon("lugia/322.PNG");
				Image w322 = im322.getImage();
				g.drawImage(w322, 0, 0, 500, 500, this);
				break;

			case 323:
				ImageIcon im323 = new ImageIcon("lugia/323.PNG");
				Image w323 = im323.getImage();
				g.drawImage(w323, 0, 0, 500, 500, this);
				break;

			case 324:
				ImageIcon im324 = new ImageIcon("lugia/324.PNG");
				Image w324 = im324.getImage();
				g.drawImage(w324, 0, 0, 500, 500, this);
				break;

			case 325:
				ImageIcon im325 = new ImageIcon("lugia/325.PNG");
				Image w325 = im325.getImage();
				g.drawImage(w325, 0, 0, 500, 500, this);
				break;

			case 326:
				ImageIcon im326 = new ImageIcon("lugia/326.PNG");
				Image w326 = im326.getImage();
				g.drawImage(w326, 0, 0, 500, 500, this);
				break;

			case 327:
				ImageIcon im327 = new ImageIcon("lugia/327.PNG");
				Image w327 = im327.getImage();
				g.drawImage(w327, 0, 0, 500, 500, this);
				break;

			case 328:
				ImageIcon im328 = new ImageIcon("lugia/328.PNG");
				Image w328 = im328.getImage();
				g.drawImage(w328, 0, 0, 500, 500, this);
				break;

			case 329:
				ImageIcon im329 = new ImageIcon("lugia/329.PNG");
				Image w329 = im329.getImage();
				g.drawImage(w329, 0, 0, 500, 500, this);
				break;

			case 330:
				ImageIcon im330 = new ImageIcon("lugia/330.PNG");
				Image w330 = im330.getImage();
				g.drawImage(w330, 0, 0, 500, 500, this);
				break;

			case 331:
				ImageIcon im331 = new ImageIcon("lugia/331.PNG");
				Image w331 = im331.getImage();
				g.drawImage(w331, 0, 0, 500, 500, this);
				break;

			case 332:
				ImageIcon im332 = new ImageIcon("lugia/332.PNG");
				Image w332 = im332.getImage();
				g.drawImage(w332, 0, 0, 500, 500, this);
				break;

			case 333:
				ImageIcon im333 = new ImageIcon("lugia/333.PNG");
				Image w333 = im333.getImage();
				g.drawImage(w333, 0, 0, 500, 500, this);
				break;

			case 334:
				ImageIcon im334 = new ImageIcon("lugia/334.PNG");
				Image w334 = im334.getImage();
				g.drawImage(w334, 0, 0, 500, 500, this);
				break;

			case 335:
				ImageIcon im335 = new ImageIcon("lugia/335.PNG");
				Image w335 = im335.getImage();
				g.drawImage(w335, 0, 0, 500, 500, this);
				break;

			case 336:
				ImageIcon im336 = new ImageIcon("lugia/336.PNG");
				Image w336 = im336.getImage();
				g.drawImage(w336, 0, 0, 500, 500, this);
				break;

			case 337:
				ImageIcon im337 = new ImageIcon("lugia/337.PNG");
				Image w337 = im337.getImage();
				g.drawImage(w337, 0, 0, 500, 500, this);
				break;

			case 338:
				ImageIcon im338 = new ImageIcon("lugia/338.PNG");
				Image w338 = im338.getImage();
				g.drawImage(w338, 0, 0, 500, 500, this);
				break;

			case 339:
				ImageIcon im339 = new ImageIcon("lugia/339.PNG");
				Image w339 = im339.getImage();
				g.drawImage(w339, 0, 0, 500, 500, this);
				break;

			case 340:
				ImageIcon im340 = new ImageIcon("lugia/340.PNG");
				Image w340 = im340.getImage();
				g.drawImage(w340, 0, 0, 500, 500, this);
				break;

			case 341:
				ImageIcon im341 = new ImageIcon("lugia/341.PNG");
				Image w341 = im341.getImage();
				g.drawImage(w341, 0, 0, 500, 500, this);
				break;

			case 342:
				ImageIcon im342 = new ImageIcon("lugia/342.PNG");
				Image w342 = im342.getImage();
				g.drawImage(w342, 0, 0, 500, 500, this);
				break;

			case 343:
				ImageIcon im343 = new ImageIcon("lugia/343.PNG");
				Image w343 = im343.getImage();
				g.drawImage(w343, 0, 0, 500, 500, this);
				break;

			case 344:
				ImageIcon im344 = new ImageIcon("lugia/344.PNG");
				Image w344 = im344.getImage();
				g.drawImage(w344, 0, 0, 500, 500, this);
				break;

			case 345:
				ImageIcon im345 = new ImageIcon("lugia/345.PNG");
				Image w345 = im345.getImage();
				g.drawImage(w345, 0, 0, 500, 500, this);
				break;

			case 346:
				ImageIcon im346 = new ImageIcon("lugia/346.PNG");
				Image w346 = im346.getImage();
				g.drawImage(w346, 0, 0, 500, 500, this);
				break;

			case 347:
				ImageIcon im347 = new ImageIcon("lugia/347.PNG");
				Image w347 = im347.getImage();
				g.drawImage(w347, 0, 0, 500, 500, this);
				break;

			case 348:
				ImageIcon im348 = new ImageIcon("lugia/348.PNG");
				Image w348 = im348.getImage();
				g.drawImage(w348, 0, 0, 500, 500, this);
				break;

			case 349:
				ImageIcon im349 = new ImageIcon("lugia/349.PNG");
				Image w349 = im349.getImage();
				g.drawImage(w349, 0, 0, 500, 500, this);
				break;

			case 350:
				ImageIcon im350 = new ImageIcon("lugia/350.PNG");
				Image w350 = im350.getImage();
				g.drawImage(w350, 0, 0, 500, 500, this);
				break;

			case 351:
				ImageIcon im351 = new ImageIcon("lugia/351.PNG");
				Image w351 = im351.getImage();
				g.drawImage(w351, 0, 0, 500, 500, this);
				break;

			case 352:
				ImageIcon im352 = new ImageIcon("lugia/352.PNG");
				Image w352 = im352.getImage();
				g.drawImage(w352, 0, 0, 500, 500, this);
				break;

			case 353:
				ImageIcon im353 = new ImageIcon("lugia/353.PNG");
				Image w353 = im353.getImage();
				g.drawImage(w353, 0, 0, 500, 500, this);
				break;

			case 354:
				ImageIcon im354 = new ImageIcon("lugia/354.PNG");
				Image w354 = im354.getImage();
				g.drawImage(w354, 0, 0, 500, 500, this);
				break;

			case 355:
				ImageIcon im355 = new ImageIcon("lugia/355.PNG");
				Image w355 = im355.getImage();
				g.drawImage(w355, 0, 0, 500, 500, this);
				break;

			case 356:
				ImageIcon im356 = new ImageIcon("lugia/356.PNG");
				Image w356 = im356.getImage();
				g.drawImage(w356, 0, 0, 500, 500, this);
				break;

			case 357:
				ImageIcon im357 = new ImageIcon("lugia/357.PNG");
				Image w357 = im357.getImage();
				g.drawImage(w357, 0, 0, 500, 500, this);
				break;

			case 358:
				ImageIcon im358 = new ImageIcon("lugia/358.PNG");
				Image w358 = im358.getImage();
				g.drawImage(w358, 0, 0, 500, 500, this);
				break;

			case 359:
				ImageIcon im359 = new ImageIcon("lugia/359.PNG");
				Image w359 = im359.getImage();
				g.drawImage(w359, 0, 0, 500, 500, this);
				break;

			case 360:
				ImageIcon im360 = new ImageIcon("lugia/360.PNG");
				Image w360 = im360.getImage();
				g.drawImage(w360, 0, 0, 500, 500, this);
				break;

			case 361:
				ImageIcon im361 = new ImageIcon("lugia/361.PNG");
				Image w361 = im361.getImage();
				g.drawImage(w361, 0, 0, 500, 500, this);
				break;

			case 362:
				ImageIcon im362 = new ImageIcon("lugia/362.PNG");
				Image w362 = im362.getImage();
				g.drawImage(w362, 0, 0, 500, 500, this);
				break;

			case 363:
				ImageIcon im363 = new ImageIcon("lugia/363.PNG");
				Image w363 = im363.getImage();
				g.drawImage(w363, 0, 0, 500, 500, this);
				break;

			case 364:
				ImageIcon im364 = new ImageIcon("lugia/364.PNG");
				Image w364 = im364.getImage();
				g.drawImage(w364, 0, 0, 500, 500, this);
				break;

			case 365:
				ImageIcon im365 = new ImageIcon("lugia/365.PNG");
				Image w365 = im365.getImage();
				g.drawImage(w365, 0, 0, 500, 500, this);
				break;

			case 366:
				ImageIcon im366 = new ImageIcon("lugia/366.PNG");
				Image w366 = im366.getImage();
				g.drawImage(w366, 0, 0, 500, 500, this);
				break;

			case 367:
				ImageIcon im367 = new ImageIcon("lugia/367.PNG");
				Image w367 = im367.getImage();
				g.drawImage(w367, 0, 0, 500, 500, this);
				break;

			case 368:
				ImageIcon im368 = new ImageIcon("lugia/368.PNG");
				Image w368 = im368.getImage();
				g.drawImage(w368, 0, 0, 500, 500, this);
				break;

			case 369:
				ImageIcon im369 = new ImageIcon("lugia/369.PNG");
				Image w369 = im369.getImage();
				g.drawImage(w369, 0, 0, 500, 500, this);
				break;

			case 370:
				ImageIcon im370 = new ImageIcon("lugia/370.PNG");
				Image w370 = im370.getImage();
				g.drawImage(w370, 0, 0, 500, 500, this);
				break;

			case 371:
				ImageIcon im371 = new ImageIcon("lugia/371.PNG");
				Image w371 = im371.getImage();
				g.drawImage(w371, 0, 0, 500, 500, this);
				break;

			case 372:
				ImageIcon im372 = new ImageIcon("lugia/372.PNG");
				Image w372 = im372.getImage();
				g.drawImage(w372, 0, 0, 500, 500, this);
				break;

			case 373:
				ImageIcon im373 = new ImageIcon("lugia/373.PNG");
				Image w373 = im373.getImage();
				g.drawImage(w373, 0, 0, 500, 500, this);
				break;

			case 374:
				ImageIcon im374 = new ImageIcon("lugia/374.PNG");
				Image w374 = im374.getImage();
				g.drawImage(w374, 0, 0, 500, 500, this);
				break;

			case 375:
				ImageIcon im375 = new ImageIcon("lugia/375.PNG");
				Image w375 = im375.getImage();
				g.drawImage(w375, 0, 0, 500, 500, this);
				break;

			case 376:
				ImageIcon im376 = new ImageIcon("lugia/376.PNG");
				Image w376 = im376.getImage();
				g.drawImage(w376, 0, 0, 500, 500, this);
				break;

			case 377:
				ImageIcon im377 = new ImageIcon("lugia/377.PNG");
				Image w377 = im377.getImage();
				g.drawImage(w377, 0, 0, 500, 500, this);
				break;

			case 378:
				ImageIcon im378 = new ImageIcon("lugia/378.PNG");
				Image w378 = im378.getImage();
				g.drawImage(w378, 0, 0, 500, 500, this);
				break;

			case 379:
				ImageIcon im379 = new ImageIcon("lugia/379.PNG");
				Image w379 = im379.getImage();
				g.drawImage(w379, 0, 0, 500, 500, this);
				break;

			case 380:
				ImageIcon im380 = new ImageIcon("lugia/380.PNG");
				Image w380 = im380.getImage();
				g.drawImage(w380, 0, 0, 500, 500, this);
				break;

			case 381:
				ImageIcon im381 = new ImageIcon("lugia/381.PNG");
				Image w381 = im381.getImage();
				g.drawImage(w381, 0, 0, 500, 500, this);
				break;

			case 382:
				ImageIcon im382 = new ImageIcon("lugia/382.PNG");
				Image w382 = im382.getImage();
				g.drawImage(w382, 0, 0, 500, 500, this);
				break;

			case 383:
				ImageIcon im383 = new ImageIcon("lugia/383.PNG");
				Image w383 = im383.getImage();
				g.drawImage(w383, 0, 0, 500, 500, this);
				break;

			case 384:
				ImageIcon im384 = new ImageIcon("lugia/384.PNG");
				Image w384 = im384.getImage();
				g.drawImage(w384, 0, 0, 500, 500, this);
				break;

			case 385:
				ImageIcon im385 = new ImageIcon("lugia/385.PNG");
				Image w385 = im385.getImage();
				g.drawImage(w385, 0, 0, 500, 500, this);
				break;

			case 386:
				ImageIcon im386 = new ImageIcon("lugia/386.PNG");
				Image w386 = im386.getImage();
				g.drawImage(w386, 0, 0, 500, 500, this);
				break;

			case 387:
				ImageIcon im387 = new ImageIcon("lugia/387.PNG");
				Image w387 = im387.getImage();
				g.drawImage(w387, 0, 0, 500, 500, this);
				break;

			case 388:
				ImageIcon im388 = new ImageIcon("lugia/388.PNG");
				Image w388 = im388.getImage();
				g.drawImage(w388, 0, 0, 500, 500, this);
				break;

			case 389:
				ImageIcon im389 = new ImageIcon("lugia/389.PNG");
				Image w389 = im389.getImage();
				g.drawImage(w389, 0, 0, 500, 500, this);
				break;

			case 390:
				ImageIcon im390 = new ImageIcon("lugia/390.PNG");
				Image w390 = im390.getImage();
				g.drawImage(w390, 0, 0, 500, 500, this);
				break;

			case 391:
				ImageIcon im391 = new ImageIcon("lugia/391.PNG");
				Image w391 = im391.getImage();
				g.drawImage(w391, 0, 0, 500, 500, this);
				break;

			case 392:
				ImageIcon im392 = new ImageIcon("lugia/392.PNG");
				Image w392 = im392.getImage();
				g.drawImage(w392, 0, 0, 500, 500, this);
				break;

			case 393:
				ImageIcon im393 = new ImageIcon("lugia/393.PNG");
				Image w393 = im393.getImage();
				g.drawImage(w393, 0, 0, 500, 500, this);
				break;

			case 394:
				ImageIcon im394 = new ImageIcon("lugia/394.PNG");
				Image w394 = im394.getImage();
				g.drawImage(w394, 0, 0, 500, 500, this);
				break;

			case 395:
				ImageIcon im395 = new ImageIcon("lugia/395.PNG");
				Image w395 = im395.getImage();
				g.drawImage(w395, 0, 0, 500, 500, this);
				break;

			case 396:
				ImageIcon im396 = new ImageIcon("lugia/396.PNG");
				Image w396 = im396.getImage();
				g.drawImage(w396, 0, 0, 500, 500, this);
				break;

			case 397:
				ImageIcon im397 = new ImageIcon("lugia/397.PNG");
				Image w397 = im397.getImage();
				g.drawImage(w397, 0, 0, 500, 500, this);
				break;

			case 398:
				ImageIcon im398 = new ImageIcon("lugia/398.PNG");
				Image w398 = im398.getImage();
				g.drawImage(w398, 0, 0, 500, 500, this);
				break;

			case 399:
				ImageIcon im399 = new ImageIcon("lugia/399.PNG");
				Image w399 = im399.getImage();
				g.drawImage(w399, 0, 0, 500, 500, this);
				break;

			case 400:
				ImageIcon im400 = new ImageIcon("lugia/400.PNG");
				Image w400 = im400.getImage();
				g.drawImage(w400, 0, 0, 500, 500, this);
				break;

			case 401:
				ImageIcon im401 = new ImageIcon("lugia/401.PNG");
				Image w401 = im401.getImage();
				g.drawImage(w401, 0, 0, 500, 500, this);
				break;

			case 402:
				ImageIcon im402 = new ImageIcon("lugia/402.PNG");
				Image w402 = im402.getImage();
				g.drawImage(w402, 0, 0, 500, 500, this);
				break;

			case 403:
				ImageIcon im403 = new ImageIcon("lugia/403.PNG");
				Image w403 = im403.getImage();
				g.drawImage(w403, 0, 0, 500, 500, this);
				break;

			case 404:
				ImageIcon im404 = new ImageIcon("lugia/404.PNG");
				Image w404 = im404.getImage();
				g.drawImage(w404, 0, 0, 500, 500, this);
				break;

			case 405:
				ImageIcon im405 = new ImageIcon("lugia/405.PNG");
				Image w405 = im405.getImage();
				g.drawImage(w405, 0, 0, 500, 500, this);
				break;

			case 406:
				ImageIcon im406 = new ImageIcon("lugia/406.PNG");
				Image w406 = im406.getImage();
				g.drawImage(w406, 0, 0, 500, 500, this);
				break;

			case 407:
				ImageIcon im407 = new ImageIcon("lugia/407.PNG");
				Image w407 = im407.getImage();
				g.drawImage(w407, 0, 0, 500, 500, this);
				break;

			case 408:
				ImageIcon im408 = new ImageIcon("lugia/408.PNG");
				Image w408 = im408.getImage();
				g.drawImage(w408, 0, 0, 500, 500, this);
				break;

			case 409:
				ImageIcon im409 = new ImageIcon("lugia/409.PNG");
				Image w409 = im409.getImage();
				g.drawImage(w409, 0, 0, 500, 500, this);
				break;

			case 410:
				ImageIcon im410 = new ImageIcon("lugia/410.PNG");
				Image w410 = im410.getImage();
				g.drawImage(w410, 0, 0, 500, 500, this);
				break;

			case 411:
				ImageIcon im411 = new ImageIcon("lugia/411.PNG");
				Image w411 = im411.getImage();
				g.drawImage(w411, 0, 0, 500, 500, this);
				break;

			case 412:
				ImageIcon im412 = new ImageIcon("lugia/412.PNG");
				Image w412 = im412.getImage();
				g.drawImage(w412, 0, 0, 500, 500, this);
				break;

			case 413:
				ImageIcon im413 = new ImageIcon("lugia/413.PNG");
				Image w413 = im413.getImage();
				g.drawImage(w413, 0, 0, 500, 500, this);
				break;

			case 414:
				ImageIcon im414 = new ImageIcon("lugia/414.PNG");
				Image w414 = im414.getImage();
				g.drawImage(w414, 0, 0, 500, 500, this);
				break;

			case 415:
				ImageIcon im415 = new ImageIcon("lugia/415.PNG");
				Image w415 = im415.getImage();
				g.drawImage(w415, 0, 0, 500, 500, this);
				break;

			case 416:
				ImageIcon im416 = new ImageIcon("lugia/416.PNG");
				Image w416 = im416.getImage();
				g.drawImage(w416, 0, 0, 500, 500, this);
				break;

			case 417:
				ImageIcon im417 = new ImageIcon("lugia/417.PNG");
				Image w417 = im417.getImage();
				g.drawImage(w417, 0, 0, 500, 500, this);
				break;

			case 418:
				ImageIcon im418 = new ImageIcon("lugia/418.PNG");
				Image w418 = im418.getImage();
				g.drawImage(w418, 0, 0, 500, 500, this);
				break;

			case 419:
				ImageIcon im419 = new ImageIcon("lugia/419.PNG");
				Image w419 = im419.getImage();
				g.drawImage(w419, 0, 0, 500, 500, this);
				break;

			case 420:
				ImageIcon im420 = new ImageIcon("lugia/420.PNG");
				Image w420 = im420.getImage();
				g.drawImage(w420, 0, 0, 500, 500, this);
				break;

			case 421:
				ImageIcon im421 = new ImageIcon("lugia/421.PNG");
				Image w421 = im421.getImage();
				g.drawImage(w421, 0, 0, 500, 500, this);
				break;

			case 422:
				ImageIcon im422 = new ImageIcon("lugia/422.PNG");
				Image w422 = im422.getImage();
				g.drawImage(w422, 0, 0, 500, 500, this);
				break;

			case 423:
				ImageIcon im423 = new ImageIcon("lugia/423.PNG");
				Image w423 = im423.getImage();
				g.drawImage(w423, 0, 0, 500, 500, this);
				break;

			case 424:
				ImageIcon im424 = new ImageIcon("lugia/424.PNG");
				Image w424 = im424.getImage();
				g.drawImage(w424, 0, 0, 500, 500, this);
				break;

			case 425:
				ImageIcon im425 = new ImageIcon("lugia/425.PNG");
				Image w425 = im425.getImage();
				g.drawImage(w425, 0, 0, 500, 500, this);
				break;

			case 426:
				ImageIcon im426 = new ImageIcon("lugia/426.PNG");
				Image w426 = im426.getImage();
				g.drawImage(w426, 0, 0, 500, 500, this);
				break;

			case 427:
				ImageIcon im427 = new ImageIcon("lugia/427.PNG");
				Image w427 = im427.getImage();
				g.drawImage(w427, 0, 0, 500, 500, this);
				break;

			case 428:
				ImageIcon im428 = new ImageIcon("lugia/428.PNG");
				Image w428 = im428.getImage();
				g.drawImage(w428, 0, 0, 500, 500, this);
				break;

			case 429:
				ImageIcon im429 = new ImageIcon("lugia/429.PNG");
				Image w429 = im429.getImage();
				g.drawImage(w429, 0, 0, 500, 500, this);
				break;

			case 430:
				ImageIcon im430 = new ImageIcon("lugia/430.PNG");
				Image w430 = im430.getImage();
				g.drawImage(w430, 0, 0, 500, 500, this);
				break;

			case 431:
				ImageIcon im431 = new ImageIcon("lugia/431.PNG");
				Image w431 = im431.getImage();
				g.drawImage(w431, 0, 0, 500, 500, this);
				break;

			case 432:
				ImageIcon im432 = new ImageIcon("lugia/432.PNG");
				Image w432 = im432.getImage();
				g.drawImage(w432, 0, 0, 500, 500, this);
				break;

			case 433:
				ImageIcon im433 = new ImageIcon("lugia/433.PNG");
				Image w433 = im433.getImage();
				g.drawImage(w433, 0, 0, 500, 500, this);
				break;

			case 434:
				ImageIcon im434 = new ImageIcon("lugia/434.PNG");
				Image w434 = im434.getImage();
				g.drawImage(w434, 0, 0, 500, 500, this);
				break;

			case 435:
				ImageIcon im435 = new ImageIcon("lugia/435.PNG");
				Image w435 = im435.getImage();
				g.drawImage(w435, 0, 0, 500, 500, this);
				break;

			case 436:
				ImageIcon im436 = new ImageIcon("lugia/436.PNG");
				Image w436 = im436.getImage();
				g.drawImage(w436, 0, 0, 500, 500, this);
				break;

			case 437:
				ImageIcon im437 = new ImageIcon("lugia/437.PNG");
				Image w437 = im437.getImage();
				g.drawImage(w437, 0, 0, 500, 500, this);
				break;

			case 438:
				ImageIcon im438 = new ImageIcon("lugia/438.PNG");
				Image w438 = im438.getImage();
				g.drawImage(w438, 0, 0, 500, 500, this);
				break;

			case 439:
				ImageIcon im439 = new ImageIcon("lugia/439.PNG");
				Image w439 = im439.getImage();
				g.drawImage(w439, 0, 0, 500, 500, this);
				break;

			case 440:
				ImageIcon im440 = new ImageIcon("lugia/440.PNG");
				Image w440 = im440.getImage();
				g.drawImage(w440, 0, 0, 500, 500, this);
				break;

			case 441:
				ImageIcon im441 = new ImageIcon("lugia/441.PNG");
				Image w441 = im441.getImage();
				g.drawImage(w441, 0, 0, 500, 500, this);
				break;

			case 442:
				ImageIcon im442 = new ImageIcon("lugia/442.PNG");
				Image w442 = im442.getImage();
				g.drawImage(w442, 0, 0, 500, 500, this);
				break;

			case 443:
				ImageIcon im443 = new ImageIcon("lugia/443.PNG");
				Image w443 = im443.getImage();
				g.drawImage(w443, 0, 0, 500, 500, this);
				break;

			case 444:
				ImageIcon im444 = new ImageIcon("lugia/444.PNG");
				Image w444 = im444.getImage();
				g.drawImage(w444, 0, 0, 500, 500, this);
				break;

			case 445:
				ImageIcon im445 = new ImageIcon("lugia/445.PNG");
				Image w445 = im445.getImage();
				g.drawImage(w445, 0, 0, 500, 500, this);
				break;

			case 446:
				ImageIcon im446 = new ImageIcon("lugia/446.PNG");
				Image w446 = im446.getImage();
				g.drawImage(w446, 0, 0, 500, 500, this);
				break;

			case 447:
				ImageIcon im447 = new ImageIcon("lugia/447.PNG");
				Image w447 = im447.getImage();
				g.drawImage(w447, 0, 0, 500, 500, this);
				break;

			case 448:
				ImageIcon im448 = new ImageIcon("lugia/448.PNG");
				Image w448 = im448.getImage();
				g.drawImage(w448, 0, 0, 500, 500, this);
				break;

			case 449:
				ImageIcon im449 = new ImageIcon("lugia/449.PNG");
				Image w449 = im449.getImage();
				g.drawImage(w449, 0, 0, 500, 500, this);
				break;

			case 450:
				ImageIcon im450 = new ImageIcon("lugia/450.PNG");
				Image w450 = im450.getImage();
				g.drawImage(w450, 0, 0, 500, 500, this);
				break;

			case 451:
				ImageIcon im451 = new ImageIcon("lugia/451.PNG");
				Image w451 = im451.getImage();
				g.drawImage(w451, 0, 0, 500, 500, this);
				break;

			case 452:
				ImageIcon im452 = new ImageIcon("lugia/452.PNG");
				Image w452 = im452.getImage();
				g.drawImage(w452, 0, 0, 500, 500, this);
				break;

			case 453:
				ImageIcon im453 = new ImageIcon("lugia/453.PNG");
				Image w453 = im453.getImage();
				g.drawImage(w453, 0, 0, 500, 500, this);
				break;

			case 454:
				ImageIcon im454 = new ImageIcon("lugia/454.PNG");
				Image w454 = im454.getImage();
				g.drawImage(w454, 0, 0, 500, 500, this);
				break;

			case 455:
				ImageIcon im455 = new ImageIcon("lugia/455.PNG");
				Image w455 = im455.getImage();
				g.drawImage(w455, 0, 0, 500, 500, this);
				break;

			case 456:
				ImageIcon im456 = new ImageIcon("lugia/456.PNG");
				Image w456 = im456.getImage();
				g.drawImage(w456, 0, 0, 500, 500, this);
				break;

			case 457:
				ImageIcon im457 = new ImageIcon("lugia/457.PNG");
				Image w457 = im457.getImage();
				g.drawImage(w457, 0, 0, 500, 500, this);
				break;

			case 458:
				ImageIcon im458 = new ImageIcon("lugia/458.PNG");
				Image w458 = im458.getImage();
				g.drawImage(w458, 0, 0, 500, 500, this);
				break;

			case 459:
				ImageIcon im459 = new ImageIcon("lugia/459.PNG");
				Image w459 = im459.getImage();
				g.drawImage(w459, 0, 0, 500, 500, this);
				break;

			case 460:
				ImageIcon im460 = new ImageIcon("lugia/460.PNG");
				Image w460 = im460.getImage();
				g.drawImage(w460, 0, 0, 500, 500, this);
				break;

			case 461:
				ImageIcon im461 = new ImageIcon("lugia/461.PNG");
				Image w461 = im461.getImage();
				g.drawImage(w461, 0, 0, 500, 500, this);
				break;

			case 462:
				ImageIcon im462 = new ImageIcon("lugia/462.PNG");
				Image w462 = im462.getImage();
				g.drawImage(w462, 0, 0, 500, 500, this);
				break;

			case 463:
				ImageIcon im463 = new ImageIcon("lugia/463.PNG");
				Image w463 = im463.getImage();
				g.drawImage(w463, 0, 0, 500, 500, this);
				break;

			case 464:
				ImageIcon im464 = new ImageIcon("lugia/464.PNG");
				Image w464 = im464.getImage();
				g.drawImage(w464, 0, 0, 500, 500, this);
				break;

			case 465:
				ImageIcon im465 = new ImageIcon("lugia/465.PNG");
				Image w465 = im465.getImage();
				g.drawImage(w465, 0, 0, 500, 500, this);
				break;

			case 466:
				ImageIcon im466 = new ImageIcon("lugia/466.PNG");
				Image w466 = im466.getImage();
				g.drawImage(w466, 0, 0, 500, 500, this);
				break;

			case 467:
				ImageIcon im467 = new ImageIcon("lugia/467.PNG");
				Image w467 = im467.getImage();
				g.drawImage(w467, 0, 0, 500, 500, this);
				break;

			case 468:
				ImageIcon im468 = new ImageIcon("lugia/468.PNG");
				Image w468 = im468.getImage();
				g.drawImage(w468, 0, 0, 500, 500, this);
				break;

			case 469:
				ImageIcon im469 = new ImageIcon("lugia/469.PNG");
				Image w469 = im469.getImage();
				g.drawImage(w469, 0, 0, 500, 500, this);
				break;

			case 470:
				ImageIcon im470 = new ImageIcon("lugia/470.PNG");
				Image w470 = im470.getImage();
				g.drawImage(w470, 0, 0, 500, 500, this);
				break;

			case 471:
				ImageIcon im471 = new ImageIcon("lugia/471.PNG");
				Image w471 = im471.getImage();
				g.drawImage(w471, 0, 0, 500, 500, this);
				break;

			case 472:
				ImageIcon im472 = new ImageIcon("lugia/472.PNG");
				Image w472 = im472.getImage();
				g.drawImage(w472, 0, 0, 500, 500, this);
				break;

			case 473:
				ImageIcon im473 = new ImageIcon("lugia/473.PNG");
				Image w473 = im473.getImage();
				g.drawImage(w473, 0, 0, 500, 500, this);
				break;

			case 474:
				ImageIcon im474 = new ImageIcon("lugia/474.PNG");
				Image w474 = im474.getImage();
				g.drawImage(w474, 0, 0, 500, 500, this);
				break;

			case 475:
				ImageIcon im475 = new ImageIcon("lugia/475.PNG");
				Image w475 = im475.getImage();
				g.drawImage(w475, 0, 0, 500, 500, this);
				break;

			case 476:
				ImageIcon im476 = new ImageIcon("lugia/476.PNG");
				Image w476 = im476.getImage();
				g.drawImage(w476, 0, 0, 500, 500, this);
				break;

			case 477:
				ImageIcon im477 = new ImageIcon("lugia/477.PNG");
				Image w477 = im477.getImage();
				g.drawImage(w477, 0, 0, 500, 500, this);
				break;

			case 478:
				ImageIcon im478 = new ImageIcon("lugia/478.PNG");
				Image w478 = im478.getImage();
				g.drawImage(w478, 0, 0, 500, 500, this);
				break;

			case 479:
				ImageIcon im479 = new ImageIcon("lugia/479.PNG");
				Image w479 = im479.getImage();
				g.drawImage(w479, 0, 0, 500, 500, this);
				break;

			case 480:
				ImageIcon im480 = new ImageIcon("lugia/480.PNG");
				Image w480 = im480.getImage();
				g.drawImage(w480, 0, 0, 500, 500, this);
				break;

			case 481:
				ImageIcon im481 = new ImageIcon("lugia/481.PNG");
				Image w481 = im481.getImage();
				g.drawImage(w481, 0, 0, 500, 500, this);
				break;

			case 482:
				ImageIcon im482 = new ImageIcon("lugia/482.PNG");
				Image w482 = im482.getImage();
				g.drawImage(w482, 0, 0, 500, 500, this);
				break;

			case 483:
				ImageIcon im483 = new ImageIcon("lugia/483.PNG");
				Image w483 = im483.getImage();
				g.drawImage(w483, 0, 0, 500, 500, this);
				break;

			case 484:
				ImageIcon im484 = new ImageIcon("lugia/484.PNG");
				Image w484 = im484.getImage();
				g.drawImage(w484, 0, 0, 500, 500, this);
				break;

			case 485:
				ImageIcon im485 = new ImageIcon("lugia/485.PNG");
				Image w485 = im485.getImage();
				g.drawImage(w485, 0, 0, 500, 500, this);
				break;

			case 486:
				ImageIcon im486 = new ImageIcon("lugia/486.PNG");
				Image w486 = im486.getImage();
				g.drawImage(w486, 0, 0, 500, 500, this);
				break;

			case 487:
				ImageIcon im487 = new ImageIcon("lugia/487.PNG");
				Image w487 = im487.getImage();
				g.drawImage(w487, 0, 0, 500, 500, this);
				break;

			case 488:
				ImageIcon im488 = new ImageIcon("lugia/488.PNG");
				Image w488 = im488.getImage();
				g.drawImage(w488, 0, 0, 500, 500, this);
				break;

			case 489:
				ImageIcon im489 = new ImageIcon("lugia/489.PNG");
				Image w489 = im489.getImage();
				g.drawImage(w489, 0, 0, 500, 500, this);
				break;

			case 490:
				ImageIcon im490 = new ImageIcon("lugia/490.PNG");
				Image w490 = im490.getImage();
				g.drawImage(w490, 0, 0, 500, 500, this);
				break;

			case 491:
				ImageIcon im491 = new ImageIcon("lugia/491.PNG");
				Image w491 = im491.getImage();
				g.drawImage(w491, 0, 0, 500, 500, this);
				break;

			case 492:
				ImageIcon im492 = new ImageIcon("lugia/492.PNG");
				Image w492 = im492.getImage();
				g.drawImage(w492, 0, 0, 500, 500, this);
				break;

			case 493:
				ImageIcon im493 = new ImageIcon("lugia/493.PNG");
				Image w493 = im493.getImage();
				g.drawImage(w493, 0, 0, 500, 500, this);
				break;

			case 494:
				ImageIcon im494 = new ImageIcon("lugia/494.PNG");
				Image w494 = im494.getImage();
				g.drawImage(w494, 0, 0, 500, 500, this);
				break;

			case 495:
				ImageIcon im495 = new ImageIcon("lugia/495.PNG");
				Image w495 = im495.getImage();
				g.drawImage(w495, 0, 0, 500, 500, this);
				break;

			case 496:
				ImageIcon im496 = new ImageIcon("lugia/496.PNG");
				Image w496 = im496.getImage();
				g.drawImage(w496, 0, 0, 500, 500, this);
				break;

			case 497:
				ImageIcon im497 = new ImageIcon("lugia/497.PNG");
				Image w497 = im497.getImage();
				g.drawImage(w497, 0, 0, 500, 500, this);
				break;

			case 498:
				ImageIcon im498 = new ImageIcon("lugia/498.PNG");
				Image w498 = im498.getImage();
				g.drawImage(w498, 0, 0, 500, 500, this);
				break;

			case 499:
				ImageIcon im499 = new ImageIcon("lugia/499.PNG");
				Image w499 = im499.getImage();
				g.drawImage(w499, 0, 0, 500, 500, this);
				break;

			case 500:
				ImageIcon im500 = new ImageIcon("lugia/500.PNG");
				Image w500 = im500.getImage();
				g.drawImage(w500, 0, 0, 500, 500, this);
				break;

			case 501:
				ImageIcon im501 = new ImageIcon("lugia/501.PNG");
				Image w501 = im501.getImage();
				g.drawImage(w501, 0, 0, 500, 500, this);
				break;

			case 502:
				ImageIcon im502 = new ImageIcon("lugia/502.PNG");
				Image w502 = im502.getImage();
				g.drawImage(w502, 0, 0, 500, 500, this);
				break;

			case 503:
				ImageIcon im503 = new ImageIcon("lugia/503.PNG");
				Image w503 = im503.getImage();
				g.drawImage(w503, 0, 0, 500, 500, this);
				break;

			case 504:
				ImageIcon im504 = new ImageIcon("lugia/504.PNG");
				Image w504 = im504.getImage();
				g.drawImage(w504, 0, 0, 500, 500, this);
				break;

			case 505:
				ImageIcon im505 = new ImageIcon("lugia/505.PNG");
				Image w505 = im505.getImage();
				g.drawImage(w505, 0, 0, 500, 500, this);
				break;

			case 506:
				ImageIcon im506 = new ImageIcon("lugia/506.PNG");
				Image w506 = im506.getImage();
				g.drawImage(w506, 0, 0, 500, 500, this);
				break;

			case 507:
				ImageIcon im507 = new ImageIcon("lugia/507.PNG");
				Image w507 = im507.getImage();
				g.drawImage(w507, 0, 0, 500, 500, this);
				break;

			case 508:
				ImageIcon im508 = new ImageIcon("lugia/508.PNG");
				Image w508 = im508.getImage();
				g.drawImage(w508, 0, 0, 500, 500, this);
				break;

			case 509:
				ImageIcon im509 = new ImageIcon("lugia/509.PNG");
				Image w509 = im509.getImage();
				g.drawImage(w509, 0, 0, 500, 500, this);
				break;

			case 510:
				ImageIcon im510 = new ImageIcon("lugia/510.PNG");
				Image w510 = im510.getImage();
				g.drawImage(w510, 0, 0, 500, 500, this);
				break;

			case 511:
				ImageIcon im511 = new ImageIcon("lugia/511.PNG");
				Image w511 = im511.getImage();
				g.drawImage(w511, 0, 0, 500, 500, this);
				break;

			case 512:
				ImageIcon im512 = new ImageIcon("lugia/512.PNG");
				Image w512 = im512.getImage();
				g.drawImage(w512, 0, 0, 500, 500, this);
				break;

			case 513:
				ImageIcon im513 = new ImageIcon("lugia/513.PNG");
				Image w513 = im513.getImage();
				g.drawImage(w513, 0, 0, 500, 500, this);
				break;

			case 514:
				ImageIcon im514 = new ImageIcon("lugia/514.PNG");
				Image w514 = im514.getImage();
				g.drawImage(w514, 0, 0, 500, 500, this);
				break;

			case 515:
				ImageIcon im515 = new ImageIcon("lugia/515.PNG");
				Image w515 = im515.getImage();
				g.drawImage(w515, 0, 0, 500, 500, this);
				break;

			case 516:
				ImageIcon im516 = new ImageIcon("lugia/516.PNG");
				Image w516 = im516.getImage();
				g.drawImage(w516, 0, 0, 500, 500, this);
				break;

			case 517:
				ImageIcon im517 = new ImageIcon("lugia/517.PNG");
				Image w517 = im517.getImage();
				g.drawImage(w517, 0, 0, 500, 500, this);
				break;

			case 518:
				ImageIcon im518 = new ImageIcon("lugia/518.PNG");
				Image w518 = im518.getImage();
				g.drawImage(w518, 0, 0, 500, 500, this);
				break;

			case 519:
				ImageIcon im519 = new ImageIcon("lugia/519.PNG");
				Image w519 = im519.getImage();
				g.drawImage(w519, 0, 0, 500, 500, this);
				break;

			case 520:
				ImageIcon im520 = new ImageIcon("lugia/520.PNG");
				Image w520 = im520.getImage();
				g.drawImage(w520, 0, 0, 500, 500, this);
				break;

			case 521:
				ImageIcon im521 = new ImageIcon("lugia/521.PNG");
				Image w521 = im521.getImage();
				g.drawImage(w521, 0, 0, 500, 500, this);
				break;

			case 522:
				ImageIcon im522 = new ImageIcon("lugia/522.PNG");
				Image w522 = im522.getImage();
				g.drawImage(w522, 0, 0, 500, 500, this);
				break;

			case 523:
				ImageIcon im523 = new ImageIcon("lugia/523.PNG");
				Image w523 = im523.getImage();
				g.drawImage(w523, 0, 0, 500, 500, this);
				break;

			case 524:
				ImageIcon im524 = new ImageIcon("lugia/524.PNG");
				Image w524 = im524.getImage();
				g.drawImage(w524, 0, 0, 500, 500, this);
				break;

			case 525:
				ImageIcon im525 = new ImageIcon("lugia/525.PNG");
				Image w525 = im525.getImage();
				g.drawImage(w525, 0, 0, 500, 500, this);
				break;

			case 526:
				ImageIcon im526 = new ImageIcon("lugia/526.PNG");
				Image w526 = im526.getImage();
				g.drawImage(w526, 0, 0, 500, 500, this);
				break;

			case 527:
				ImageIcon im527 = new ImageIcon("lugia/527.PNG");
				Image w527 = im527.getImage();
				g.drawImage(w527, 0, 0, 500, 500, this);
				break;

			case 528:
				ImageIcon im528 = new ImageIcon("lugia/528.PNG");
				Image w528 = im528.getImage();
				g.drawImage(w528, 0, 0, 500, 500, this);
				break;

			case 529:
				ImageIcon im529 = new ImageIcon("lugia/529.PNG");
				Image w529 = im529.getImage();
				g.drawImage(w529, 0, 0, 500, 500, this);
				break;

			case 530:
				ImageIcon im530 = new ImageIcon("lugia/530.PNG");
				Image w530 = im530.getImage();
				g.drawImage(w530, 0, 0, 500, 500, this);
				break;

			case 531:
				ImageIcon im531 = new ImageIcon("lugia/531.PNG");
				Image w531 = im531.getImage();
				g.drawImage(w531, 0, 0, 500, 500, this);
				break;

			case 532:
				ImageIcon im532 = new ImageIcon("lugia/532.PNG");
				Image w532 = im532.getImage();
				g.drawImage(w532, 0, 0, 500, 500, this);
				break;

			case 533:
				ImageIcon im533 = new ImageIcon("lugia/533.PNG");
				Image w533 = im533.getImage();
				g.drawImage(w533, 0, 0, 500, 500, this);
				break;

			case 534:
				ImageIcon im534 = new ImageIcon("lugia/534.PNG");
				Image w534 = im534.getImage();
				g.drawImage(w534, 0, 0, 500, 500, this);
				break;

			case 535:
				ImageIcon im535 = new ImageIcon("lugia/535.PNG");
				Image w535 = im535.getImage();
				g.drawImage(w535, 0, 0, 500, 500, this);
				break;

			case 536:
				ImageIcon im536 = new ImageIcon("lugia/536.PNG");
				Image w536 = im536.getImage();
				g.drawImage(w536, 0, 0, 500, 500, this);
				break;

			case 537:
				ImageIcon im537 = new ImageIcon("lugia/537.PNG");
				Image w537 = im537.getImage();
				g.drawImage(w537, 0, 0, 500, 500, this);
				break;

			case 538:
				ImageIcon im538 = new ImageIcon("lugia/538.PNG");
				Image w538 = im538.getImage();
				g.drawImage(w538, 0, 0, 500, 500, this);
				break;

			case 539:
				ImageIcon im539 = new ImageIcon("lugia/539.PNG");
				Image w539 = im539.getImage();
				g.drawImage(w539, 0, 0, 500, 500, this);
				break;

			case 540:
				ImageIcon im540 = new ImageIcon("lugia/540.PNG");
				Image w540 = im540.getImage();
				g.drawImage(w540, 0, 0, 500, 500, this);
				break;

			case 541:
				ImageIcon im541 = new ImageIcon("lugia/541.PNG");
				Image w541 = im541.getImage();
				g.drawImage(w541, 0, 0, 500, 500, this);
				break;

			case 542:
				ImageIcon im542 = new ImageIcon("lugia/542.PNG");
				Image w542 = im542.getImage();
				g.drawImage(w542, 0, 0, 500, 500, this);
				break;

			case 543:
				ImageIcon im543 = new ImageIcon("lugia/543.PNG");
				Image w543 = im543.getImage();
				g.drawImage(w543, 0, 0, 500, 500, this);
				break;

			case 544:
				ImageIcon im544 = new ImageIcon("lugia/544.PNG");
				Image w544 = im544.getImage();
				g.drawImage(w544, 0, 0, 500, 500, this);
				break;

			case 545:
				ImageIcon im545 = new ImageIcon("lugia/545.PNG");
				Image w545 = im545.getImage();
				g.drawImage(w545, 0, 0, 500, 500, this);
				break;

			case 546:
				ImageIcon im546 = new ImageIcon("lugia/546.PNG");
				Image w546 = im546.getImage();
				g.drawImage(w546, 0, 0, 500, 500, this);
				break;

			case 547:
				ImageIcon im547 = new ImageIcon("lugia/547.PNG");
				Image w547 = im547.getImage();
				g.drawImage(w547, 0, 0, 500, 500, this);
				break;

			case 548:
				ImageIcon im548 = new ImageIcon("lugia/548.PNG");
				Image w548 = im548.getImage();
				g.drawImage(w548, 0, 0, 500, 500, this);
				break;

			case 549:
				ImageIcon im549 = new ImageIcon("lugia/549.PNG");
				Image w549 = im549.getImage();
				g.drawImage(w549, 0, 0, 500, 500, this);
				break;

			case 550:
				ImageIcon im550 = new ImageIcon("lugia/550.PNG");
				Image w550 = im550.getImage();
				g.drawImage(w550, 0, 0, 500, 500, this);
				break;

			case 551:
				ImageIcon im551 = new ImageIcon("lugia/551.PNG");
				Image w551 = im551.getImage();
				g.drawImage(w551, 0, 0, 500, 500, this);
				break;

			case 552:
				ImageIcon im552 = new ImageIcon("lugia/552.PNG");
				Image w552 = im552.getImage();
				g.drawImage(w552, 0, 0, 500, 500, this);
				break;

			case 553:
				ImageIcon im553 = new ImageIcon("lugia/553.PNG");
				Image w553 = im553.getImage();
				g.drawImage(w553, 0, 0, 500, 500, this);
				break;

			case 554:
				ImageIcon im554 = new ImageIcon("lugia/554.PNG");
				Image w554 = im554.getImage();
				g.drawImage(w554, 0, 0, 500, 500, this);
				break;

			case 555:
				ImageIcon im555 = new ImageIcon("lugia/555.PNG");
				Image w555 = im555.getImage();
				g.drawImage(w555, 0, 0, 500, 500, this);
				break;

			case 556:
				ImageIcon im556 = new ImageIcon("lugia/556.PNG");
				Image w556 = im556.getImage();
				g.drawImage(w556, 0, 0, 500, 500, this);
				break;

			case 557:
				ImageIcon im557 = new ImageIcon("lugia/557.PNG");
				Image w557 = im557.getImage();
				g.drawImage(w557, 0, 0, 500, 500, this);
				break;

			case 558:
				ImageIcon im558 = new ImageIcon("lugia/558.PNG");
				Image w558 = im558.getImage();
				g.drawImage(w558, 0, 0, 500, 500, this);
				break;

			case 559:
				ImageIcon im559 = new ImageIcon("lugia/559.PNG");
				Image w559 = im559.getImage();
				g.drawImage(w559, 0, 0, 500, 500, this);
				break;

			case 560:
				ImageIcon im560 = new ImageIcon("lugia/560.PNG");
				Image w560 = im560.getImage();
				g.drawImage(w560, 0, 0, 500, 500, this);
				break;

			case 561:
				ImageIcon im561 = new ImageIcon("lugia/561.PNG");
				Image w561 = im561.getImage();
				g.drawImage(w561, 0, 0, 500, 500, this);
				break;

			case 562:
				ImageIcon im562 = new ImageIcon("lugia/562.PNG");
				Image w562 = im562.getImage();
				g.drawImage(w562, 0, 0, 500, 500, this);
				break;

			case 563:
				ImageIcon im563 = new ImageIcon("lugia/563.PNG");
				Image w563 = im563.getImage();
				g.drawImage(w563, 0, 0, 500, 500, this);
				break;

			case 564:
				ImageIcon im564 = new ImageIcon("lugia/564.PNG");
				Image w564 = im564.getImage();
				g.drawImage(w564, 0, 0, 500, 500, this);
				break;

			case 565:
				ImageIcon im565 = new ImageIcon("lugia/565.PNG");
				Image w565 = im565.getImage();
				g.drawImage(w565, 0, 0, 500, 500, this);
				break;

			case 566:
				ImageIcon im566 = new ImageIcon("lugia/566.PNG");
				Image w566 = im566.getImage();
				g.drawImage(w566, 0, 0, 500, 500, this);
				break;

			case 567:
				ImageIcon im567 = new ImageIcon("lugia/567.PNG");
				Image w567 = im567.getImage();
				g.drawImage(w567, 0, 0, 500, 500, this);
				break;

			case 568:
				ImageIcon im568 = new ImageIcon("lugia/568.PNG");
				Image w568 = im568.getImage();
				g.drawImage(w568, 0, 0, 500, 500, this);
				break;

			case 569:
				ImageIcon im569 = new ImageIcon("lugia/569.PNG");
				Image w569 = im569.getImage();
				g.drawImage(w569, 0, 0, 500, 500, this);
				break;

			case 570:
				ImageIcon im570 = new ImageIcon("lugia/570.PNG");
				Image w570 = im570.getImage();
				g.drawImage(w570, 0, 0, 500, 500, this);
				break;

			case 571:
				ImageIcon im571 = new ImageIcon("lugia/571.PNG");
				Image w571 = im571.getImage();
				g.drawImage(w571, 0, 0, 500, 500, this);
				break;

			case 572:
				ImageIcon im572 = new ImageIcon("lugia/572.PNG");
				Image w572 = im572.getImage();
				g.drawImage(w572, 0, 0, 500, 500, this);
				break;

			case 573:
				ImageIcon im573 = new ImageIcon("lugia/573.PNG");
				Image w573 = im573.getImage();
				g.drawImage(w573, 0, 0, 500, 500, this);
				break;

			case 574:
				ImageIcon im574 = new ImageIcon("lugia/574.PNG");
				Image w574 = im574.getImage();
				g.drawImage(w574, 0, 0, 500, 500, this);
				break;

			case 575:
				ImageIcon im575 = new ImageIcon("lugia/575.PNG");
				Image w575 = im575.getImage();
				g.drawImage(w575, 0, 0, 500, 500, this);
				break;

			case 576:
				ImageIcon im576 = new ImageIcon("lugia/576.PNG");
				Image w576 = im576.getImage();
				g.drawImage(w576, 0, 0, 500, 500, this);
				break;

			case 577:
				ImageIcon im577 = new ImageIcon("lugia/577.PNG");
				Image w577 = im577.getImage();
				g.drawImage(w577, 0, 0, 500, 500, this);
				break;

			case 578:
				ImageIcon im578 = new ImageIcon("lugia/578.PNG");
				Image w578 = im578.getImage();
				g.drawImage(w578, 0, 0, 500, 500, this);
				break;

			case 579:
				ImageIcon im579 = new ImageIcon("lugia/579.PNG");
				Image w579 = im579.getImage();
				g.drawImage(w579, 0, 0, 500, 500, this);
				break;

			case 580:
				ImageIcon im580 = new ImageIcon("lugia/580.PNG");
				Image w580 = im580.getImage();
				g.drawImage(w580, 0, 0, 500, 500, this);
				break;

			case 581:
				ImageIcon im581 = new ImageIcon("lugia/581.PNG");
				Image w581 = im581.getImage();
				g.drawImage(w581, 0, 0, 500, 500, this);
				break;

			case 582:
				ImageIcon im582 = new ImageIcon("lugia/582.PNG");
				Image w582 = im582.getImage();
				g.drawImage(w582, 0, 0, 500, 500, this);
				break;

			case 583:
				ImageIcon im583 = new ImageIcon("lugia/583.PNG");
				Image w583 = im583.getImage();
				g.drawImage(w583, 0, 0, 500, 500, this);
				break;

			case 584:
				ImageIcon im584 = new ImageIcon("lugia/584.PNG");
				Image w584 = im584.getImage();
				g.drawImage(w584, 0, 0, 500, 500, this);
				break;

			case 585:
				ImageIcon im585 = new ImageIcon("lugia/585.PNG");
				Image w585 = im585.getImage();
				g.drawImage(w585, 0, 0, 500, 500, this);
				break;

			case 586:
				ImageIcon im586 = new ImageIcon("lugia/586.PNG");
				Image w586 = im586.getImage();
				g.drawImage(w586, 0, 0, 500, 500, this);
				break;

			case 587:
				ImageIcon im587 = new ImageIcon("lugia/587.PNG");
				Image w587 = im587.getImage();
				g.drawImage(w587, 0, 0, 500, 500, this);
				break;

			case 588:
				ImageIcon im588 = new ImageIcon("lugia/588.PNG");
				Image w588 = im588.getImage();
				g.drawImage(w588, 0, 0, 500, 500, this);
				break;

			case 589:
				ImageIcon im589 = new ImageIcon("lugia/589.PNG");
				Image w589 = im589.getImage();
				g.drawImage(w589, 0, 0, 500, 500, this);
				break;

			case 590:
				ImageIcon im590 = new ImageIcon("lugia/590.PNG");
				Image w590 = im590.getImage();
				g.drawImage(w590, 0, 0, 500, 500, this);
				break;

			case 591:
				ImageIcon im591 = new ImageIcon("lugia/591.PNG");
				Image w591 = im591.getImage();
				g.drawImage(w591, 0, 0, 500, 500, this);
				break;

			case 592:
				ImageIcon im592 = new ImageIcon("lugia/592.PNG");
				Image w592 = im592.getImage();
				g.drawImage(w592, 0, 0, 500, 500, this);
				break;

			case 593:
				ImageIcon im593 = new ImageIcon("lugia/593.PNG");
				Image w593 = im593.getImage();
				g.drawImage(w593, 0, 0, 500, 500, this);
				break;

			case 594:
				ImageIcon im594 = new ImageIcon("lugia/594.PNG");
				Image w594 = im594.getImage();
				g.drawImage(w594, 0, 0, 500, 500, this);
				break;

			case 595:
				ImageIcon im595 = new ImageIcon("lugia/595.PNG");
				Image w595 = im595.getImage();
				g.drawImage(w595, 0, 0, 500, 500, this);
				break;

			case 596:
				ImageIcon im596 = new ImageIcon("lugia/596.PNG");
				Image w596 = im596.getImage();
				g.drawImage(w596, 0, 0, 500, 500, this);
				break;

			case 597:
				ImageIcon im597 = new ImageIcon("lugia/597.PNG");
				Image w597 = im597.getImage();
				g.drawImage(w597, 0, 0, 500, 500, this);
				break;

			case 598:
				ImageIcon im598 = new ImageIcon("lugia/598.PNG");
				Image w598 = im598.getImage();
				g.drawImage(w598, 0, 0, 500, 500, this);
				break;

			case 599:
				ImageIcon im599 = new ImageIcon("lugia/599.PNG");
				Image w599 = im599.getImage();
				g.drawImage(w599, 0, 0, 500, 500, this);
				break;

			case 600:
				ImageIcon im600 = new ImageIcon("lugia/600.PNG");
				Image w600 = im600.getImage();
				g.drawImage(w600, 0, 0, 500, 500, this);
				break;

			case 601:
				ImageIcon im601 = new ImageIcon("lugia/601.PNG");
				Image w601 = im601.getImage();
				g.drawImage(w601, 0, 0, 500, 500, this);
				break;

			case 602:
				ImageIcon im602 = new ImageIcon("lugia/602.PNG");
				Image w602 = im602.getImage();
				g.drawImage(w602, 0, 0, 500, 500, this);
				break;

			case 603:
				ImageIcon im603 = new ImageIcon("lugia/603.PNG");
				Image w603 = im603.getImage();
				g.drawImage(w603, 0, 0, 500, 500, this);
				break;

			case 604:
				ImageIcon im604 = new ImageIcon("lugia/604.PNG");
				Image w604 = im604.getImage();
				g.drawImage(w604, 0, 0, 500, 500, this);
				break;

			case 605:
				ImageIcon im605 = new ImageIcon("lugia/605.PNG");
				Image w605 = im605.getImage();
				g.drawImage(w605, 0, 0, 500, 500, this);
				break;

			case 606:
				ImageIcon im606 = new ImageIcon("lugia/606.PNG");
				Image w606 = im606.getImage();
				g.drawImage(w606, 0, 0, 500, 500, this);
				break;

			case 607:
				ImageIcon im607 = new ImageIcon("lugia/607.PNG");
				Image w607 = im607.getImage();
				g.drawImage(w607, 0, 0, 500, 500, this);
				break;

			case 608:
				ImageIcon im608 = new ImageIcon("lugia/608.PNG");
				Image w608 = im608.getImage();
				g.drawImage(w608, 0, 0, 500, 500, this);
				break;

			case 609:
				ImageIcon im609 = new ImageIcon("lugia/609.PNG");
				Image w609 = im609.getImage();
				g.drawImage(w609, 0, 0, 500, 500, this);
				break;

			case 610:
				ImageIcon im610 = new ImageIcon("lugia/610.PNG");
				Image w610 = im610.getImage();
				g.drawImage(w610, 0, 0, 500, 500, this);
				break;

			case 611:
				ImageIcon im611 = new ImageIcon("lugia/611.PNG");
				Image w611 = im611.getImage();
				g.drawImage(w611, 0, 0, 500, 500, this);
				break;

			case 612:
				ImageIcon im612 = new ImageIcon("lugia/612.PNG");
				Image w612 = im612.getImage();
				g.drawImage(w612, 0, 0, 500, 500, this);
				break;

			case 613:
				ImageIcon im613 = new ImageIcon("lugia/613.PNG");
				Image w613 = im613.getImage();
				g.drawImage(w613, 0, 0, 500, 500, this);
				break;

			case 614:
				ImageIcon im614 = new ImageIcon("lugia/614.PNG");
				Image w614 = im614.getImage();
				g.drawImage(w614, 0, 0, 500, 500, this);
				break;

			case 615:
				ImageIcon im615 = new ImageIcon("lugia/615.PNG");
				Image w615 = im615.getImage();
				g.drawImage(w615, 0, 0, 500, 500, this);
				break;

			case 616:
				ImageIcon im616 = new ImageIcon("lugia/616.PNG");
				Image w616 = im616.getImage();
				g.drawImage(w616, 0, 0, 500, 500, this);
				break;

			case 617:
				ImageIcon im617 = new ImageIcon("lugia/617.PNG");
				Image w617 = im617.getImage();
				g.drawImage(w617, 0, 0, 500, 500, this);
				break;

			case 618:
				ImageIcon im618 = new ImageIcon("lugia/618.PNG");
				Image w618 = im618.getImage();
				g.drawImage(w618, 0, 0, 500, 500, this);
				break;

			case 619:
				ImageIcon im619 = new ImageIcon("lugia/619.PNG");
				Image w619 = im619.getImage();
				g.drawImage(w619, 0, 0, 500, 500, this);
				break;

			case 620:
				ImageIcon im620 = new ImageIcon("lugia/620.PNG");
				Image w620 = im620.getImage();
				g.drawImage(w620, 0, 0, 500, 500, this);
				break;

			case 621:
				ImageIcon im621 = new ImageIcon("lugia/621.PNG");
				Image w621 = im621.getImage();
				g.drawImage(w621, 0, 0, 500, 500, this);
				break;

			case 622:
				ImageIcon im622 = new ImageIcon("lugia/622.PNG");
				Image w622 = im622.getImage();
				g.drawImage(w622, 0, 0, 500, 500, this);
				break;

			case 623:
				ImageIcon im623 = new ImageIcon("lugia/623.PNG");
				Image w623 = im623.getImage();
				g.drawImage(w623, 0, 0, 500, 500, this);
				break;

			case 624:
				ImageIcon im624 = new ImageIcon("lugia/624.PNG");
				Image w624 = im624.getImage();
				g.drawImage(w624, 0, 0, 500, 500, this);
				break;

			case 625:
				ImageIcon im625 = new ImageIcon("lugia/625.PNG");
				Image w625 = im625.getImage();
				g.drawImage(w625, 0, 0, 500, 500, this);
				break;

			case 626:
				ImageIcon im626 = new ImageIcon("lugia/626.PNG");
				Image w626 = im626.getImage();
				g.drawImage(w626, 0, 0, 500, 500, this);
				break;

			case 627:
				ImageIcon im627 = new ImageIcon("lugia/627.PNG");
				Image w627 = im627.getImage();
				g.drawImage(w627, 0, 0, 500, 500, this);
				break;

			case 628:
				ImageIcon im628 = new ImageIcon("lugia/628.PNG");
				Image w628 = im628.getImage();
				g.drawImage(w628, 0, 0, 500, 500, this);
				break;

			case 629:
				ImageIcon im629 = new ImageIcon("lugia/629.PNG");
				Image w629 = im629.getImage();
				g.drawImage(w629, 0, 0, 500, 500, this);
				break;

			case 630:
				ImageIcon im630 = new ImageIcon("lugia/630.PNG");
				Image w630 = im630.getImage();
				g.drawImage(w630, 0, 0, 500, 500, this);
				break;

			case 631:
				ImageIcon im631 = new ImageIcon("lugia/631.PNG");
				Image w631 = im631.getImage();
				g.drawImage(w631, 0, 0, 500, 500, this);
				break;

			case 632:
				ImageIcon im632 = new ImageIcon("lugia/632.PNG");
				Image w632 = im632.getImage();
				g.drawImage(w632, 0, 0, 500, 500, this);
				break;

			case 633:
				ImageIcon im633 = new ImageIcon("lugia/633.PNG");
				Image w633 = im633.getImage();
				g.drawImage(w633, 0, 0, 500, 500, this);
				break;

			case 634:
				ImageIcon im634 = new ImageIcon("lugia/634.PNG");
				Image w634 = im634.getImage();
				g.drawImage(w634, 0, 0, 500, 500, this);
				break;

			case 635:
				ImageIcon im635 = new ImageIcon("lugia/635.PNG");
				Image w635 = im635.getImage();
				g.drawImage(w635, 0, 0, 500, 500, this);
				break;

			case 636:
				ImageIcon im636 = new ImageIcon("lugia/636.PNG");
				Image w636 = im636.getImage();
				g.drawImage(w636, 0, 0, 500, 500, this);
				break;

			case 637:
				ImageIcon im637 = new ImageIcon("lugia/637.PNG");
				Image w637 = im637.getImage();
				g.drawImage(w637, 0, 0, 500, 500, this);
				break;

			case 638:
				ImageIcon im638 = new ImageIcon("lugia/638.PNG");
				Image w638 = im638.getImage();
				g.drawImage(w638, 0, 0, 500, 500, this);
				break;

			case 639:
				ImageIcon im639 = new ImageIcon("lugia/639.PNG");
				Image w639 = im639.getImage();
				g.drawImage(w639, 0, 0, 500, 500, this);
				break;

			case 640:
				ImageIcon im640 = new ImageIcon("lugia/640.PNG");
				Image w640 = im640.getImage();
				g.drawImage(w640, 0, 0, 500, 500, this);
				break;

			case 641:
				ImageIcon im641 = new ImageIcon("lugia/641.PNG");
				Image w641 = im641.getImage();
				g.drawImage(w641, 0, 0, 500, 500, this);
				break;

			case 642:
				ImageIcon im642 = new ImageIcon("lugia/642.PNG");
				Image w642 = im642.getImage();
				g.drawImage(w642, 0, 0, 500, 500, this);
				break;

			case 643:
				ImageIcon im643 = new ImageIcon("lugia/643.PNG");
				Image w643 = im643.getImage();
				g.drawImage(w643, 0, 0, 500, 500, this);
				break;

			case 644:
				ImageIcon im644 = new ImageIcon("lugia/644.PNG");
				Image w644 = im644.getImage();
				g.drawImage(w644, 0, 0, 500, 500, this);
				break;

			case 645:
				ImageIcon im645 = new ImageIcon("lugia/645.PNG");
				Image w645 = im645.getImage();
				g.drawImage(w645, 0, 0, 500, 500, this);
				break;

			case 646:
				ImageIcon im646 = new ImageIcon("lugia/646.PNG");
				Image w646 = im646.getImage();
				g.drawImage(w646, 0, 0, 500, 500, this);
				break;

			case 647:
				ImageIcon im647 = new ImageIcon("lugia/647.PNG");
				Image w647 = im647.getImage();
				g.drawImage(w647, 0, 0, 500, 500, this);
				break;

			case 648:
				ImageIcon im648 = new ImageIcon("lugia/648.PNG");
				Image w648 = im648.getImage();
				g.drawImage(w648, 0, 0, 500, 500, this);
				break;

			case 649:
				ImageIcon im649 = new ImageIcon("lugia/649.PNG");
				Image w649 = im649.getImage();
				g.drawImage(w649, 0, 0, 500, 500, this);
				break;

			case 650:
				ImageIcon im650 = new ImageIcon("lugia/650.PNG");
				Image w650 = im650.getImage();
				g.drawImage(w650, 0, 0, 500, 500, this);
				break;

			case 651:
				ImageIcon im651 = new ImageIcon("lugia/651.PNG");
				Image w651 = im651.getImage();
				g.drawImage(w651, 0, 0, 500, 500, this);
				break;

			case 652:
				ImageIcon im652 = new ImageIcon("lugia/652.PNG");
				Image w652 = im652.getImage();
				g.drawImage(w652, 0, 0, 500, 500, this);
				break;

			case 653:
				ImageIcon im653 = new ImageIcon("lugia/653.PNG");
				Image w653 = im653.getImage();
				g.drawImage(w653, 0, 0, 500, 500, this);
				break;

			case 654:
				ImageIcon im654 = new ImageIcon("lugia/654.PNG");
				Image w654 = im654.getImage();
				g.drawImage(w654, 0, 0, 500, 500, this);
				break;

			case 655:
				ImageIcon im655 = new ImageIcon("lugia/655.PNG");
				Image w655 = im655.getImage();
				g.drawImage(w655, 0, 0, 500, 500, this);
				break;

			case 656:
				ImageIcon im656 = new ImageIcon("lugia/656.PNG");
				Image w656 = im656.getImage();
				g.drawImage(w656, 0, 0, 500, 500, this);
				break;

			case 657:
				ImageIcon im657 = new ImageIcon("lugia/657.PNG");
				Image w657 = im657.getImage();
				g.drawImage(w657, 0, 0, 500, 500, this);
				break;

			case 658:
				ImageIcon im658 = new ImageIcon("lugia/658.PNG");
				Image w658 = im658.getImage();
				g.drawImage(w658, 0, 0, 500, 500, this);
				break;

			case 659:
				ImageIcon im659 = new ImageIcon("lugia/659.PNG");
				Image w659 = im659.getImage();
				g.drawImage(w659, 0, 0, 500, 500, this);
				break;

			case 660:
				ImageIcon im660 = new ImageIcon("lugia/660.PNG");
				Image w660 = im660.getImage();
				g.drawImage(w660, 0, 0, 500, 500, this);
				break;

			case 661:
				ImageIcon im661 = new ImageIcon("lugia/661.PNG");
				Image w661 = im661.getImage();
				g.drawImage(w661, 0, 0, 500, 500, this);
				break;

			case 662:
				ImageIcon im662 = new ImageIcon("lugia/662.PNG");
				Image w662 = im662.getImage();
				g.drawImage(w662, 0, 0, 500, 500, this);
				break;

			case 663:
				ImageIcon im663 = new ImageIcon("lugia/663.PNG");
				Image w663 = im663.getImage();
				g.drawImage(w663, 0, 0, 500, 500, this);
				break;

			case 664:
				ImageIcon im664 = new ImageIcon("lugia/664.PNG");
				Image w664 = im664.getImage();
				g.drawImage(w664, 0, 0, 500, 500, this);
				break;

			case 665:
				ImageIcon im665 = new ImageIcon("lugia/665.PNG");
				Image w665 = im665.getImage();
				g.drawImage(w665, 0, 0, 500, 500, this);
				break;

			case 666:
				ImageIcon im666 = new ImageIcon("lugia/666.PNG");
				Image w666 = im666.getImage();
				g.drawImage(w666, 0, 0, 500, 500, this);
				break;

			case 667:
				ImageIcon im667 = new ImageIcon("lugia/667.PNG");
				Image w667 = im667.getImage();
				g.drawImage(w667, 0, 0, 500, 500, this);
				break;

			case 668:
				ImageIcon im668 = new ImageIcon("lugia/668.PNG");
				Image w668 = im668.getImage();
				g.drawImage(w668, 0, 0, 500, 500, this);
				break;

			case 669:
				ImageIcon im669 = new ImageIcon("lugia/669.PNG");
				Image w669 = im669.getImage();
				g.drawImage(w669, 0, 0, 500, 500, this);
				break;

			case 670:
				ImageIcon im670 = new ImageIcon("lugia/670.PNG");
				Image w670 = im670.getImage();
				g.drawImage(w670, 0, 0, 500, 500, this);
				break;

			case 671:
				ImageIcon im671 = new ImageIcon("lugia/671.PNG");
				Image w671 = im671.getImage();
				g.drawImage(w671, 0, 0, 500, 500, this);
				break;

			case 672:
				ImageIcon im672 = new ImageIcon("lugia/672.PNG");
				Image w672 = im672.getImage();
				g.drawImage(w672, 0, 0, 500, 500, this);
				break;

			case 673:
				ImageIcon im673 = new ImageIcon("lugia/673.PNG");
				Image w673 = im673.getImage();
				g.drawImage(w673, 0, 0, 500, 500, this);
				break;

			case 674:
				ImageIcon im674 = new ImageIcon("lugia/674.PNG");
				Image w674 = im674.getImage();
				g.drawImage(w674, 0, 0, 500, 500, this);
				break;

			case 675:
				ImageIcon im675 = new ImageIcon("lugia/675.PNG");
				Image w675 = im675.getImage();
				g.drawImage(w675, 0, 0, 500, 500, this);
				break;

			case 676:
				ImageIcon im676 = new ImageIcon("lugia/676.PNG");
				Image w676 = im676.getImage();
				g.drawImage(w676, 0, 0, 500, 500, this);
				break;

			case 677:
				ImageIcon im677 = new ImageIcon("lugia/677.PNG");
				Image w677 = im677.getImage();
				g.drawImage(w677, 0, 0, 500, 500, this);
				break;

			case 678:
				ImageIcon im678 = new ImageIcon("lugia/678.PNG");
				Image w678 = im678.getImage();
				g.drawImage(w678, 0, 0, 500, 500, this);
				break;

			case 679:
				ImageIcon im679 = new ImageIcon("lugia/679.PNG");
				Image w679 = im679.getImage();
				g.drawImage(w679, 0, 0, 500, 500, this);
				break;

			case 680:
				ImageIcon im680 = new ImageIcon("lugia/680.PNG");
				Image w680 = im680.getImage();
				g.drawImage(w680, 0, 0, 500, 500, this);
				break;

			case 681:
				ImageIcon im681 = new ImageIcon("lugia/681.PNG");
				Image w681 = im681.getImage();
				g.drawImage(w681, 0, 0, 500, 500, this);
				break;

			case 682:
				ImageIcon im682 = new ImageIcon("lugia/682.PNG");
				Image w682 = im682.getImage();
				g.drawImage(w682, 0, 0, 500, 500, this);
				break;

			case 683:
				ImageIcon im683 = new ImageIcon("lugia/683.PNG");
				Image w683 = im683.getImage();
				g.drawImage(w683, 0, 0, 500, 500, this);
				break;

			case 684:
				ImageIcon im684 = new ImageIcon("lugia/684.PNG");
				Image w684 = im684.getImage();
				g.drawImage(w684, 0, 0, 500, 500, this);
				break;

			case 685:
				ImageIcon im685 = new ImageIcon("lugia/685.PNG");
				Image w685 = im685.getImage();
				g.drawImage(w685, 0, 0, 500, 500, this);
				break;

			case 686:
				ImageIcon im686 = new ImageIcon("lugia/686.PNG");
				Image w686 = im686.getImage();
				g.drawImage(w686, 0, 0, 500, 500, this);
				break;

			case 687:
				ImageIcon im687 = new ImageIcon("lugia/687.PNG");
				Image w687 = im687.getImage();
				g.drawImage(w687, 0, 0, 500, 500, this);
				break;

			case 688:
				ImageIcon im688 = new ImageIcon("lugia/688.PNG");
				Image w688 = im688.getImage();
				g.drawImage(w688, 0, 0, 500, 500, this);
				break;

			case 689:
				ImageIcon im689 = new ImageIcon("lugia/689.PNG");
				Image w689 = im689.getImage();
				g.drawImage(w689, 0, 0, 500, 500, this);
				break;

			case 690:
				ImageIcon im690 = new ImageIcon("lugia/690.PNG");
				Image w690 = im690.getImage();
				g.drawImage(w690, 0, 0, 500, 500, this);
				break;

			case 691:
				ImageIcon im691 = new ImageIcon("lugia/691.PNG");
				Image w691 = im691.getImage();
				g.drawImage(w691, 0, 0, 500, 500, this);
				break;

			case 692:
				ImageIcon im692 = new ImageIcon("lugia/692.PNG");
				Image w692 = im692.getImage();
				g.drawImage(w692, 0, 0, 500, 500, this);
				break;

			case 693:
				ImageIcon im693 = new ImageIcon("lugia/693.PNG");
				Image w693 = im693.getImage();
				g.drawImage(w693, 0, 0, 500, 500, this);
				break;

			case 694:
				ImageIcon im694 = new ImageIcon("lugia/694.PNG");
				Image w694 = im694.getImage();
				g.drawImage(w694, 0, 0, 500, 500, this);
				break;

			case 695:
				ImageIcon im695 = new ImageIcon("lugia/695.PNG");
				Image w695 = im695.getImage();
				g.drawImage(w695, 0, 0, 500, 500, this);
				break;

			case 696:
				ImageIcon im696 = new ImageIcon("lugia/696.PNG");
				Image w696 = im696.getImage();
				g.drawImage(w696, 0, 0, 500, 500, this);
				break;

			case 697:
				ImageIcon im697 = new ImageIcon("lugia/697.PNG");
				Image w697 = im697.getImage();
				g.drawImage(w697, 0, 0, 500, 500, this);
				break;

			case 698:
				ImageIcon im698 = new ImageIcon("lugia/698.PNG");
				Image w698 = im698.getImage();
				g.drawImage(w698, 0, 0, 500, 500, this);
				break;

			case 699:
				ImageIcon im699 = new ImageIcon("lugia/699.PNG");
				Image w699 = im699.getImage();
				g.drawImage(w699, 0, 0, 500, 500, this);
				break;

			case 700:
				ImageIcon im700 = new ImageIcon("lugia/700.PNG");
				Image w700 = im700.getImage();
				g.drawImage(w700, 0, 0, 500, 500, this);
				break;

			case 701:
				ImageIcon im701 = new ImageIcon("lugia/701.PNG");
				Image w701 = im701.getImage();
				g.drawImage(w701, 0, 0, 500, 500, this);
				break;

			case 702:
				ImageIcon im702 = new ImageIcon("lugia/702.PNG");
				Image w702 = im702.getImage();
				g.drawImage(w702, 0, 0, 500, 500, this);
				break;

			case 703:
				ImageIcon im703 = new ImageIcon("lugia/703.PNG");
				Image w703 = im703.getImage();
				g.drawImage(w703, 0, 0, 500, 500, this);
				break;

			case 704:
				ImageIcon im704 = new ImageIcon("lugia/704.PNG");
				Image w704 = im704.getImage();
				g.drawImage(w704, 0, 0, 500, 500, this);
				break;

			case 705:
				ImageIcon im705 = new ImageIcon("lugia/705.PNG");
				Image w705 = im705.getImage();
				g.drawImage(w705, 0, 0, 500, 500, this);
				break;

			case 706:
				ImageIcon im706 = new ImageIcon("lugia/706.PNG");
				Image w706 = im706.getImage();
				g.drawImage(w706, 0, 0, 500, 500, this);
				break;

			case 707:
				ImageIcon im707 = new ImageIcon("lugia/707.PNG");
				Image w707 = im707.getImage();
				g.drawImage(w707, 0, 0, 500, 500, this);
				break;

			case 708:
				ImageIcon im708 = new ImageIcon("lugia/708.PNG");
				Image w708 = im708.getImage();
				g.drawImage(w708, 0, 0, 500, 500, this);
				break;

			case 709:
				ImageIcon im709 = new ImageIcon("lugia/709.PNG");
				Image w709 = im709.getImage();
				g.drawImage(w709, 0, 0, 500, 500, this);
				break;

			case 710:
				ImageIcon im710 = new ImageIcon("lugia/710.PNG");
				Image w710 = im710.getImage();
				g.drawImage(w710, 0, 0, 500, 500, this);
				break;

			case 711:
				ImageIcon im711 = new ImageIcon("lugia/711.PNG");
				Image w711 = im711.getImage();
				g.drawImage(w711, 0, 0, 500, 500, this);
				break;

			case 712:
				ImageIcon im712 = new ImageIcon("lugia/712.PNG");
				Image w712 = im712.getImage();
				g.drawImage(w712, 0, 0, 500, 500, this);
				break;

			case 713:
				ImageIcon im713 = new ImageIcon("lugia/713.PNG");
				Image w713 = im713.getImage();
				g.drawImage(w713, 0, 0, 500, 500, this);
				break;

			case 714:
				ImageIcon im714 = new ImageIcon("lugia/714.PNG");
				Image w714 = im714.getImage();
				g.drawImage(w714, 0, 0, 500, 500, this);
				break;

			case 715:
				ImageIcon im715 = new ImageIcon("lugia/715.PNG");
				Image w715 = im715.getImage();
				g.drawImage(w715, 0, 0, 500, 500, this);
				break;

			case 716:
				ImageIcon im716 = new ImageIcon("lugia/716.PNG");
				Image w716 = im716.getImage();
				g.drawImage(w716, 0, 0, 500, 500, this);
				break;

			case 717:
				ImageIcon im717 = new ImageIcon("lugia/717.PNG");
				Image w717 = im717.getImage();
				g.drawImage(w717, 0, 0, 500, 500, this);
				break;

			case 718:
				ImageIcon im718 = new ImageIcon("lugia/718.PNG");
				Image w718 = im718.getImage();
				g.drawImage(w718, 0, 0, 500, 500, this);
				break;

			case 719:
				ImageIcon im719 = new ImageIcon("lugia/719.PNG");
				Image w719 = im719.getImage();
				g.drawImage(w719, 0, 0, 500, 500, this);
				break;

			case 720:
				ImageIcon im720 = new ImageIcon("lugia/720.PNG");
				Image w720 = im720.getImage();
				g.drawImage(w720, 0, 0, 500, 500, this);
				break;

			case 721:
				ImageIcon im721 = new ImageIcon("lugia/721.PNG");
				Image w721 = im721.getImage();
				g.drawImage(w721, 0, 0, 500, 500, this);
				break;

			case 722:
				ImageIcon im722 = new ImageIcon("lugia/722.PNG");
				Image w722 = im722.getImage();
				g.drawImage(w722, 0, 0, 500, 500, this);
				break;

			case 723:
				ImageIcon im723 = new ImageIcon("lugia/723.PNG");
				Image w723 = im723.getImage();
				g.drawImage(w723, 0, 0, 500, 500, this);
				break;

			case 724:
				ImageIcon im724 = new ImageIcon("lugia/724.PNG");
				Image w724 = im724.getImage();
				g.drawImage(w724, 0, 0, 500, 500, this);
				break;

			case 725:
				ImageIcon im725 = new ImageIcon("lugia/725.PNG");
				Image w725 = im725.getImage();
				g.drawImage(w725, 0, 0, 500, 500, this);
				break;

			case 726:
				ImageIcon im726 = new ImageIcon("lugia/726.PNG");
				Image w726 = im726.getImage();
				g.drawImage(w726, 0, 0, 500, 500, this);
				break;

			case 727:
				ImageIcon im727 = new ImageIcon("lugia/727.PNG");
				Image w727 = im727.getImage();
				g.drawImage(w727, 0, 0, 500, 500, this);
				break;

			case 728:
				ImageIcon im728 = new ImageIcon("lugia/728.PNG");
				Image w728 = im728.getImage();
				g.drawImage(w728, 0, 0, 500, 500, this);
				break;

			case 729:
				ImageIcon im729 = new ImageIcon("lugia/729.PNG");
				Image w729 = im729.getImage();
				g.drawImage(w729, 0, 0, 500, 500, this);
				break;

			case 730:
				ImageIcon im730 = new ImageIcon("lugia/730.PNG");
				Image w730 = im730.getImage();
				g.drawImage(w730, 0, 0, 500, 500, this);
				break;

			case 731:
				ImageIcon im731 = new ImageIcon("lugia/731.PNG");
				Image w731 = im731.getImage();
				g.drawImage(w731, 0, 0, 500, 500, this);
				break;

			case 732:
				ImageIcon im732 = new ImageIcon("lugia/732.PNG");
				Image w732 = im732.getImage();
				g.drawImage(w732, 0, 0, 500, 500, this);
				break;

			case 733:
				ImageIcon im733 = new ImageIcon("lugia/733.PNG");
				Image w733 = im733.getImage();
				g.drawImage(w733, 0, 0, 500, 500, this);
				break;

			case 734:
				ImageIcon im734 = new ImageIcon("lugia/734.PNG");
				Image w734 = im734.getImage();
				g.drawImage(w734, 0, 0, 500, 500, this);
				break;

			case 735:
				ImageIcon im735 = new ImageIcon("lugia/735.PNG");
				Image w735 = im735.getImage();
				g.drawImage(w735, 0, 0, 500, 500, this);
				break;

			case 736:
				ImageIcon im736 = new ImageIcon("lugia/736.PNG");
				Image w736 = im736.getImage();
				g.drawImage(w736, 0, 0, 500, 500, this);
				break;

			case 737:
				ImageIcon im737 = new ImageIcon("lugia/737.PNG");
				Image w737 = im737.getImage();
				g.drawImage(w737, 0, 0, 500, 500, this);
				break;

			case 738:
				ImageIcon im738 = new ImageIcon("lugia/738.PNG");
				Image w738 = im738.getImage();
				g.drawImage(w738, 0, 0, 500, 500, this);
				break;

			case 739:
				ImageIcon im739 = new ImageIcon("lugia/739.PNG");
				Image w739 = im739.getImage();
				g.drawImage(w739, 0, 0, 500, 500, this);
				break;

			case 740:
				ImageIcon im740 = new ImageIcon("lugia/740.PNG");
				Image w740 = im740.getImage();
				g.drawImage(w740, 0, 0, 500, 500, this);
				break;

			case 741:
				ImageIcon im741 = new ImageIcon("lugia/741.PNG");
				Image w741 = im741.getImage();
				g.drawImage(w741, 0, 0, 500, 500, this);
				break;

			case 742:
				ImageIcon im742 = new ImageIcon("lugia/742.PNG");
				Image w742 = im742.getImage();
				g.drawImage(w742, 0, 0, 500, 500, this);
				break;

			case 743:
				ImageIcon im743 = new ImageIcon("lugia/743.PNG");
				Image w743 = im743.getImage();
				g.drawImage(w743, 0, 0, 500, 500, this);
				break;

			case 744:
				ImageIcon im744 = new ImageIcon("lugia/744.PNG");
				Image w744 = im744.getImage();
				g.drawImage(w744, 0, 0, 500, 500, this);
				break;

			case 745:
				ImageIcon im745 = new ImageIcon("lugia/745.PNG");
				Image w745 = im745.getImage();
				g.drawImage(w745, 0, 0, 500, 500, this);
				break;

			case 746:
				ImageIcon im746 = new ImageIcon("lugia/746.PNG");
				Image w746 = im746.getImage();
				g.drawImage(w746, 0, 0, 500, 500, this);
				break;

			case 747:
				ImageIcon im747 = new ImageIcon("lugia/747.PNG");
				Image w747 = im747.getImage();
				g.drawImage(w747, 0, 0, 500, 500, this);
				break;

			case 748:
				ImageIcon im748 = new ImageIcon("lugia/748.PNG");
				Image w748 = im748.getImage();
				g.drawImage(w748, 0, 0, 500, 500, this);
				break;

			case 749:
				ImageIcon im749 = new ImageIcon("lugia/749.PNG");
				Image w749 = im749.getImage();
				g.drawImage(w749, 0, 0, 500, 500, this);
				break;

			case 750:
				ImageIcon im750 = new ImageIcon("lugia/750.PNG");
				Image w750 = im750.getImage();
				g.drawImage(w750, 0, 0, 500, 500, this);
				break;

			case 751:
				ImageIcon im751 = new ImageIcon("lugia/751.PNG");
				Image w751 = im751.getImage();
				g.drawImage(w751, 0, 0, 500, 500, this);
				break;

			case 752:
				ImageIcon im752 = new ImageIcon("lugia/752.PNG");
				Image w752 = im752.getImage();
				g.drawImage(w752, 0, 0, 500, 500, this);
				break;

			case 753:
				ImageIcon im753 = new ImageIcon("lugia/753.PNG");
				Image w753 = im753.getImage();
				g.drawImage(w753, 0, 0, 500, 500, this);
				break;

			case 754:
				ImageIcon im754 = new ImageIcon("lugia/754.PNG");
				Image w754 = im754.getImage();
				g.drawImage(w754, 0, 0, 500, 500, this);
				break;

			case 755:
				ImageIcon im755 = new ImageIcon("lugia/755.PNG");
				Image w755 = im755.getImage();
				g.drawImage(w755, 0, 0, 500, 500, this);
				break;

			case 756:
				ImageIcon im756 = new ImageIcon("lugia/756.PNG");
				Image w756 = im756.getImage();
				g.drawImage(w756, 0, 0, 500, 500, this);
				break;

			case 757:
				ImageIcon im757 = new ImageIcon("lugia/757.PNG");
				Image w757 = im757.getImage();
				g.drawImage(w757, 0, 0, 500, 500, this);
				break;

			case 758:
				ImageIcon im758 = new ImageIcon("lugia/758.PNG");
				Image w758 = im758.getImage();
				g.drawImage(w758, 0, 0, 500, 500, this);
				break;

			case 759:
				ImageIcon im759 = new ImageIcon("lugia/759.PNG");
				Image w759 = im759.getImage();
				g.drawImage(w759, 0, 0, 500, 500, this);
				break;

			case 760:
				ImageIcon im760 = new ImageIcon("lugia/760.PNG");
				Image w760 = im760.getImage();
				g.drawImage(w760, 0, 0, 500, 500, this);
				break;

			case 761:
				ImageIcon im761 = new ImageIcon("lugia/761.PNG");
				Image w761 = im761.getImage();
				g.drawImage(w761, 0, 0, 500, 500, this);
				break;

			case 762:
				ImageIcon im762 = new ImageIcon("lugia/762.PNG");
				Image w762 = im762.getImage();
				g.drawImage(w762, 0, 0, 500, 500, this);
				break;

			case 763:
				ImageIcon im763 = new ImageIcon("lugia/763.PNG");
				Image w763 = im763.getImage();
				g.drawImage(w763, 0, 0, 500, 500, this);
				break;

			case 764:
				ImageIcon im764 = new ImageIcon("lugia/764.PNG");
				Image w764 = im764.getImage();
				g.drawImage(w764, 0, 0, 500, 500, this);
				break;

			case 765:
				ImageIcon im765 = new ImageIcon("lugia/765.PNG");
				Image w765 = im765.getImage();
				g.drawImage(w765, 0, 0, 500, 500, this);
				break;

			case 766:
				ImageIcon im766 = new ImageIcon("lugia/766.PNG");
				Image w766 = im766.getImage();
				g.drawImage(w766, 0, 0, 500, 500, this);
				break;

			case 767:
				ImageIcon im767 = new ImageIcon("lugia/767.PNG");
				Image w767 = im767.getImage();
				g.drawImage(w767, 0, 0, 500, 500, this);
				break;

			case 768:
				ImageIcon im768 = new ImageIcon("lugia/768.PNG");
				Image w768 = im768.getImage();
				g.drawImage(w768, 0, 0, 500, 500, this);
				break;

			case 769:
				ImageIcon im769 = new ImageIcon("lugia/769.PNG");
				Image w769 = im769.getImage();
				g.drawImage(w769, 0, 0, 500, 500, this);
				break;

			case 770:
				ImageIcon im770 = new ImageIcon("lugia/770.PNG");
				Image w770 = im770.getImage();
				g.drawImage(w770, 0, 0, 500, 500, this);
				break;

			case 771:
				ImageIcon im771 = new ImageIcon("lugia/771.PNG");
				Image w771 = im771.getImage();
				g.drawImage(w771, 0, 0, 500, 500, this);
				break;

			case 772:
				ImageIcon im772 = new ImageIcon("lugia/772.PNG");
				Image w772 = im772.getImage();
				g.drawImage(w772, 0, 0, 500, 500, this);
				break;

			case 773:
				ImageIcon im773 = new ImageIcon("lugia/773.PNG");
				Image w773 = im773.getImage();
				g.drawImage(w773, 0, 0, 500, 500, this);
				break;

			case 774:
				ImageIcon im774 = new ImageIcon("lugia/774.PNG");
				Image w774 = im774.getImage();
				g.drawImage(w774, 0, 0, 500, 500, this);
				break;

			case 775:
				ImageIcon im775 = new ImageIcon("lugia/775.PNG");
				Image w775 = im775.getImage();
				g.drawImage(w775, 0, 0, 500, 500, this);
				break;

			case 776:
				ImageIcon im776 = new ImageIcon("lugia/776.PNG");
				Image w776 = im776.getImage();
				g.drawImage(w776, 0, 0, 500, 500, this);
				break;

			case 777:
				ImageIcon im777 = new ImageIcon("lugia/777.PNG");
				Image w777 = im777.getImage();
				g.drawImage(w777, 0, 0, 500, 500, this);
				break;

			case 778:
				ImageIcon im778 = new ImageIcon("lugia/778.PNG");
				Image w778 = im778.getImage();
				g.drawImage(w778, 0, 0, 500, 500, this);
				break;

			case 779:
				ImageIcon im779 = new ImageIcon("lugia/779.PNG");
				Image w779 = im779.getImage();
				g.drawImage(w779, 0, 0, 500, 500, this);
				break;

			case 780:
				ImageIcon im780 = new ImageIcon("lugia/780.PNG");
				Image w780 = im780.getImage();
				g.drawImage(w780, 0, 0, 500, 500, this);
				break;

			case 781:
				ImageIcon im781 = new ImageIcon("lugia/781.PNG");
				Image w781 = im781.getImage();
				g.drawImage(w781, 0, 0, 500, 500, this);
				break;

			case 782:
				ImageIcon im782 = new ImageIcon("lugia/782.PNG");
				Image w782 = im782.getImage();
				g.drawImage(w782, 0, 0, 500, 500, this);
				break;

			case 783:
				ImageIcon im783 = new ImageIcon("lugia/783.PNG");
				Image w783 = im783.getImage();
				g.drawImage(w783, 0, 0, 500, 500, this);
				break;

			case 784:
				ImageIcon im784 = new ImageIcon("lugia/784.PNG");
				Image w784 = im784.getImage();
				g.drawImage(w784, 0, 0, 500, 500, this);
				break;

			case 785:
				ImageIcon im785 = new ImageIcon("lugia/785.PNG");
				Image w785 = im785.getImage();
				g.drawImage(w785, 0, 0, 500, 500, this);
				break;

			case 786:
				ImageIcon im786 = new ImageIcon("lugia/786.PNG");
				Image w786 = im786.getImage();
				g.drawImage(w786, 0, 0, 500, 500, this);
				break;

			case 787:
				ImageIcon im787 = new ImageIcon("lugia/787.PNG");
				Image w787 = im787.getImage();
				g.drawImage(w787, 0, 0, 500, 500, this);
				break;

			case 788:
				ImageIcon im788 = new ImageIcon("lugia/788.PNG");
				Image w788 = im788.getImage();
				g.drawImage(w788, 0, 0, 500, 500, this);
				break;

			case 789:
				ImageIcon im789 = new ImageIcon("lugia/789.PNG");
				Image w789 = im789.getImage();
				g.drawImage(w789, 0, 0, 500, 500, this);
				break;

			case 790:
				ImageIcon im790 = new ImageIcon("lugia/790.PNG");
				Image w790 = im790.getImage();
				g.drawImage(w790, 0, 0, 500, 500, this);
				break;

			case 791:
				ImageIcon im791 = new ImageIcon("lugia/791.PNG");
				Image w791 = im791.getImage();
				g.drawImage(w791, 0, 0, 500, 500, this);
				break;

			case 792:
				ImageIcon im792 = new ImageIcon("lugia/792.PNG");
				Image w792 = im792.getImage();
				g.drawImage(w792, 0, 0, 500, 500, this);
				break;

			case 793:
				ImageIcon im793 = new ImageIcon("lugia/793.PNG");
				Image w793 = im793.getImage();
				g.drawImage(w793, 0, 0, 500, 500, this);
				break;

			case 794:
				ImageIcon im794 = new ImageIcon("lugia/794.PNG");
				Image w794 = im794.getImage();
				g.drawImage(w794, 0, 0, 500, 500, this);
				break;

			case 795:
				ImageIcon im795 = new ImageIcon("lugia/795.PNG");
				Image w795 = im795.getImage();
				g.drawImage(w795, 0, 0, 500, 500, this);
				break;

			case 796:
				ImageIcon im796 = new ImageIcon("lugia/796.PNG");
				Image w796 = im796.getImage();
				g.drawImage(w796, 0, 0, 500, 500, this);
				break;

			case 797:
				ImageIcon im797 = new ImageIcon("lugia/797.PNG");
				Image w797 = im797.getImage();
				g.drawImage(w797, 0, 0, 500, 500, this);
				break;

			case 798:
				ImageIcon im798 = new ImageIcon("lugia/798.PNG");
				Image w798 = im798.getImage();
				g.drawImage(w798, 0, 0, 500, 500, this);
				break;

			case 799:
				ImageIcon im799 = new ImageIcon("lugia/799.PNG");
				Image w799 = im799.getImage();
				g.drawImage(w799, 0, 0, 500, 500, this);
				break;

			case 800:
				ImageIcon im800 = new ImageIcon("lugia/800.PNG");
				Image w800 = im800.getImage();
				g.drawImage(w800, 0, 0, 500, 500, this);
				break;

			case 801:
				ImageIcon im801 = new ImageIcon("lugia/801.PNG");
				Image w801 = im801.getImage();
				g.drawImage(w801, 0, 0, 500, 500, this);
				break;

			case 802:
				ImageIcon im802 = new ImageIcon("lugia/802.PNG");
				Image w802 = im802.getImage();
				g.drawImage(w802, 0, 0, 500, 500, this);
				break;

			case 803:
				ImageIcon im803 = new ImageIcon("lugia/803.PNG");
				Image w803 = im803.getImage();
				g.drawImage(w803, 0, 0, 500, 500, this);
				break;

			case 804:
				ImageIcon im804 = new ImageIcon("lugia/804.PNG");
				Image w804 = im804.getImage();
				g.drawImage(w804, 0, 0, 500, 500, this);
				break;

			case 805:
				ImageIcon im805 = new ImageIcon("lugia/805.PNG");
				Image w805 = im805.getImage();
				g.drawImage(w805, 0, 0, 500, 500, this);
				break;

			case 806:
				ImageIcon im806 = new ImageIcon("lugia/806.PNG");
				Image w806 = im806.getImage();
				g.drawImage(w806, 0, 0, 500, 500, this);
				break;

			case 807:
				ImageIcon im807 = new ImageIcon("lugia/807.PNG");
				Image w807 = im807.getImage();
				g.drawImage(w807, 0, 0, 500, 500, this);
				break;

			case 808:
				ImageIcon im808 = new ImageIcon("lugia/808.PNG");
				Image w808 = im808.getImage();
				g.drawImage(w808, 0, 0, 500, 500, this);
				break;

			case 809:
				ImageIcon im809 = new ImageIcon("lugia/809.PNG");
				Image w809 = im809.getImage();
				g.drawImage(w809, 0, 0, 500, 500, this);
				break;

			case 810:
				ImageIcon im810 = new ImageIcon("lugia/810.PNG");
				Image w810 = im810.getImage();
				g.drawImage(w810, 0, 0, 500, 500, this);
				break;

			case 811:
				ImageIcon im811 = new ImageIcon("lugia/811.PNG");
				Image w811 = im811.getImage();
				g.drawImage(w811, 0, 0, 500, 500, this);
				break;

			case 812:
				ImageIcon im812 = new ImageIcon("lugia/812.PNG");
				Image w812 = im812.getImage();
				g.drawImage(w812, 0, 0, 500, 500, this);
				break;

			case 813:
				ImageIcon im813 = new ImageIcon("lugia/813.PNG");
				Image w813 = im813.getImage();
				g.drawImage(w813, 0, 0, 500, 500, this);
				break;

			case 814:
				ImageIcon im814 = new ImageIcon("lugia/814.PNG");
				Image w814 = im814.getImage();
				g.drawImage(w814, 0, 0, 500, 500, this);
				break;

			case 815:
				ImageIcon im815 = new ImageIcon("lugia/815.PNG");
				Image w815 = im815.getImage();
				g.drawImage(w815, 0, 0, 500, 500, this);
				break;

			case 816:
				ImageIcon im816 = new ImageIcon("lugia/816.PNG");
				Image w816 = im816.getImage();
				g.drawImage(w816, 0, 0, 500, 500, this);
				break;

			case 817:
				ImageIcon im817 = new ImageIcon("lugia/817.PNG");
				Image w817 = im817.getImage();
				g.drawImage(w817, 0, 0, 500, 500, this);
				break;

			case 818:
				ImageIcon im818 = new ImageIcon("lugia/818.PNG");
				Image w818 = im818.getImage();
				g.drawImage(w818, 0, 0, 500, 500, this);
				break;

			case 819:
				ImageIcon im819 = new ImageIcon("lugia/819.PNG");
				Image w819 = im819.getImage();
				g.drawImage(w819, 0, 0, 500, 500, this);
				break;

			case 820:
				ImageIcon im820 = new ImageIcon("lugia/820.PNG");
				Image w820 = im820.getImage();
				g.drawImage(w820, 0, 0, 500, 500, this);
				break;

			case 821:
				ImageIcon im821 = new ImageIcon("lugia/821.PNG");
				Image w821 = im821.getImage();
				g.drawImage(w821, 0, 0, 500, 500, this);
				break;

			case 822:
				ImageIcon im822 = new ImageIcon("lugia/822.PNG");
				Image w822 = im822.getImage();
				g.drawImage(w822, 0, 0, 500, 500, this);
				break;

			case 823:
				ImageIcon im823 = new ImageIcon("lugia/823.PNG");
				Image w823 = im823.getImage();
				g.drawImage(w823, 0, 0, 500, 500, this);
				break;

			case 824:
				ImageIcon im824 = new ImageIcon("lugia/824.PNG");
				Image w824 = im824.getImage();
				g.drawImage(w824, 0, 0, 500, 500, this);
				break;

			case 825:
				ImageIcon im825 = new ImageIcon("lugia/825.PNG");
				Image w825 = im825.getImage();
				g.drawImage(w825, 0, 0, 500, 500, this);
				break;

			case 826:
				ImageIcon im826 = new ImageIcon("lugia/826.PNG");
				Image w826 = im826.getImage();
				g.drawImage(w826, 0, 0, 500, 500, this);
				break;

			case 827:
				ImageIcon im827 = new ImageIcon("lugia/827.PNG");
				Image w827 = im827.getImage();
				g.drawImage(w827, 0, 0, 500, 500, this);
				break;

			case 828:
				ImageIcon im828 = new ImageIcon("lugia/828.PNG");
				Image w828 = im828.getImage();
				g.drawImage(w828, 0, 0, 500, 500, this);
				break;

			}
		}
		if (speciaux[6]) {
			switch (speciau[6]) {
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

			case 47:
				ImageIcon im47 = new ImageIcon("LetheAlbion/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			}
		}
	}

	public void attack3(Graphics g) {
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

		if (speciaux[8]) {
			switch (speciau[8]) {
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

	}

	public void attack4(Graphics g) {
		if (speciaux[9]) {
			switch (speciau[9]) {
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
	}

	public void attacke(Graphics g) {
		if (speciaux[10]) {
			switch (speciau[10]) {
			case 1:
				ImageIcon im1 = new ImageIcon("BruteForce/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("BruteForce/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("BruteForce/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("BruteForce/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("BruteForce/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("BruteForce/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("BruteForce/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("BruteForce/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("BruteForce/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("BruteForce/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("BruteForce/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("BruteForce/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("BruteForce/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("BruteForce/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("BruteForce/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("BruteForce/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("BruteForce/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("BruteForce/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("BruteForce/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("BruteForce/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("BruteForce/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("BruteForce/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("BruteForce/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("BruteForce/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("BruteForce/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("BruteForce/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("BruteForce/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("BruteForce/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("BruteForce/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("BruteForce/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("BruteForce/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("BruteForce/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("BruteForce/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("BruteForce/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("BruteForce/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("BruteForce/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("BruteForce/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("BruteForce/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("BruteForce/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("BruteForce/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("BruteForce/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("BruteForce/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("BruteForce/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("BruteForce/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("BruteForce/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("BruteForce/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("BruteForce/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("BruteForce/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("BruteForce/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("BruteForce/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("BruteForce/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("BruteForce/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("BruteForce/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("BruteForce/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("BruteForce/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("BruteForce/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("BruteForce/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("BruteForce/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("BruteForce/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			}
		}
		if (speciaux[11]) {
			switch (speciau[11]) {
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

		if (speciaux[12]) {
			switch (speciau[12]) {
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
		if (speciaux[13]) {
			switch (speciau[13]) {
			case 1:
				ImageIcon im1 = new ImageIcon("Meteor/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("Meteor/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("Meteor/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("Meteor/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("Meteor/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("Meteor/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("Meteor/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("Meteor/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("Meteor/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("Meteor/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("Meteor/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("Meteor/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("Meteor/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("Meteor/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("Meteor/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("Meteor/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("Meteor/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("Meteor/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("Meteor/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("Meteor/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("Meteor/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("Meteor/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("Meteor/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("Meteor/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("Meteor/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("Meteor/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("Meteor/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("Meteor/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("Meteor/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("Meteor/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("Meteor/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("Meteor/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("Meteor/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("Meteor/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("Meteor/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("Meteor/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("Meteor/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("Meteor/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("Meteor/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("Meteor/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("Meteor/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("Meteor/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("Meteor/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("Meteor/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("Meteor/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("Meteor/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("Meteor/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("Meteor/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("Meteor/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("Meteor/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("Meteor/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("Meteor/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("Meteor/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("Meteor/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("Meteor/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("Meteor/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("Meteor/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("Meteor/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("Meteor/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("Meteor/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			case 61:
				ImageIcon im61 = new ImageIcon("Meteor/061.PNG");
				Image w61 = im61.getImage();
				g.drawImage(w61, 0, 0, 500, 500, this);
				break;

			case 62:
				ImageIcon im62 = new ImageIcon("Meteor/062.PNG");
				Image w62 = im62.getImage();
				g.drawImage(w62, 0, 0, 500, 500, this);
				break;

			case 63:
				ImageIcon im63 = new ImageIcon("Meteor/063.PNG");
				Image w63 = im63.getImage();
				g.drawImage(w63, 0, 0, 500, 500, this);
				break;

			case 64:
				ImageIcon im64 = new ImageIcon("Meteor/064.PNG");
				Image w64 = im64.getImage();
				g.drawImage(w64, 0, 0, 500, 500, this);
				break;

			case 65:
				ImageIcon im65 = new ImageIcon("Meteor/065.PNG");
				Image w65 = im65.getImage();
				g.drawImage(w65, 0, 0, 500, 500, this);
				break;

			case 66:
				ImageIcon im66 = new ImageIcon("Meteor/066.PNG");
				Image w66 = im66.getImage();
				g.drawImage(w66, 0, 0, 500, 500, this);
				break;

			case 67:
				ImageIcon im67 = new ImageIcon("Meteor/067.PNG");
				Image w67 = im67.getImage();
				g.drawImage(w67, 0, 0, 500, 500, this);
				break;

			case 68:
				ImageIcon im68 = new ImageIcon("Meteor/068.PNG");
				Image w68 = im68.getImage();
				g.drawImage(w68, 0, 0, 500, 500, this);
				break;

			case 69:
				ImageIcon im69 = new ImageIcon("Meteor/069.PNG");
				Image w69 = im69.getImage();
				g.drawImage(w69, 0, 0, 500, 500, this);
				break;

			case 70:
				ImageIcon im70 = new ImageIcon("Meteor/070.PNG");
				Image w70 = im70.getImage();
				g.drawImage(w70, 0, 0, 500, 500, this);
				break;

			case 71:
				ImageIcon im71 = new ImageIcon("Meteor/071.PNG");
				Image w71 = im71.getImage();
				g.drawImage(w71, 0, 0, 500, 500, this);
				break;

			case 72:
				ImageIcon im72 = new ImageIcon("Meteor/072.PNG");
				Image w72 = im72.getImage();
				g.drawImage(w72, 0, 0, 500, 500, this);
				break;

			case 73:
				ImageIcon im73 = new ImageIcon("Meteor/073.PNG");
				Image w73 = im73.getImage();
				g.drawImage(w73, 0, 0, 500, 500, this);
				break;

			case 74:
				ImageIcon im74 = new ImageIcon("Meteor/074.PNG");
				Image w74 = im74.getImage();
				g.drawImage(w74, 0, 0, 500, 500, this);
				break;

			case 75:
				ImageIcon im75 = new ImageIcon("Meteor/075.PNG");
				Image w75 = im75.getImage();
				g.drawImage(w75, 0, 0, 500, 500, this);
				break;

			case 76:
				ImageIcon im76 = new ImageIcon("Meteor/076.PNG");
				Image w76 = im76.getImage();
				g.drawImage(w76, 0, 0, 500, 500, this);
				break;

			case 77:
				ImageIcon im77 = new ImageIcon("Meteor/077.PNG");
				Image w77 = im77.getImage();
				g.drawImage(w77, 0, 0, 500, 500, this);
				break;

			case 78:
				ImageIcon im78 = new ImageIcon("Meteor/078.PNG");
				Image w78 = im78.getImage();
				g.drawImage(w78, 0, 0, 500, 500, this);
				break;

			case 79:
				ImageIcon im79 = new ImageIcon("Meteor/079.PNG");
				Image w79 = im79.getImage();
				g.drawImage(w79, 0, 0, 500, 500, this);
				break;

			case 80:
				ImageIcon im80 = new ImageIcon("Meteor/080.PNG");
				Image w80 = im80.getImage();
				g.drawImage(w80, 0, 0, 500, 500, this);
				break;

			case 81:
				ImageIcon im81 = new ImageIcon("Meteor/081.PNG");
				Image w81 = im81.getImage();
				g.drawImage(w81, 0, 0, 500, 500, this);
				break;

			case 82:
				ImageIcon im82 = new ImageIcon("Meteor/082.PNG");
				Image w82 = im82.getImage();
				g.drawImage(w82, 0, 0, 500, 500, this);
				break;

			case 83:
				ImageIcon im83 = new ImageIcon("Meteor/083.PNG");
				Image w83 = im83.getImage();
				g.drawImage(w83, 0, 0, 500, 500, this);
				break;

			case 84:
				ImageIcon im84 = new ImageIcon("Meteor/084.PNG");
				Image w84 = im84.getImage();
				g.drawImage(w84, 0, 0, 500, 500, this);
				break;

			case 85:
				ImageIcon im85 = new ImageIcon("Meteor/085.PNG");
				Image w85 = im85.getImage();
				g.drawImage(w85, 0, 0, 500, 500, this);
				break;

			case 86:
				ImageIcon im86 = new ImageIcon("Meteor/086.PNG");
				Image w86 = im86.getImage();
				g.drawImage(w86, 0, 0, 500, 500, this);
				break;

			case 87:
				ImageIcon im87 = new ImageIcon("Meteor/087.PNG");
				Image w87 = im87.getImage();
				g.drawImage(w87, 0, 0, 500, 500, this);
				break;

			case 88:
				ImageIcon im88 = new ImageIcon("Meteor/088.PNG");
				Image w88 = im88.getImage();
				g.drawImage(w88, 0, 0, 500, 500, this);
				break;

			case 89:
				ImageIcon im89 = new ImageIcon("Meteor/089.PNG");
				Image w89 = im89.getImage();
				g.drawImage(w89, 0, 0, 500, 500, this);
				break;

			case 90:
				ImageIcon im90 = new ImageIcon("Meteor/090.PNG");
				Image w90 = im90.getImage();
				g.drawImage(w90, 0, 0, 500, 500, this);
				break;

			case 91:
				ImageIcon im91 = new ImageIcon("Meteor/091.PNG");
				Image w91 = im91.getImage();
				g.drawImage(w91, 0, 0, 500, 500, this);
				break;

			case 92:
				ImageIcon im92 = new ImageIcon("Meteor/092.PNG");
				Image w92 = im92.getImage();
				g.drawImage(w92, 0, 0, 500, 500, this);
				break;

			case 93:
				ImageIcon im93 = new ImageIcon("Meteor/093.PNG");
				Image w93 = im93.getImage();
				g.drawImage(w93, 0, 0, 500, 500, this);
				break;

			case 94:
				ImageIcon im94 = new ImageIcon("Meteor/094.PNG");
				Image w94 = im94.getImage();
				g.drawImage(w94, 0, 0, 500, 500, this);
				break;

			case 95:
				ImageIcon im95 = new ImageIcon("Meteor/095.PNG");
				Image w95 = im95.getImage();
				g.drawImage(w95, 0, 0, 500, 500, this);
				break;

			case 96:
				ImageIcon im96 = new ImageIcon("Meteor/096.PNG");
				Image w96 = im96.getImage();
				g.drawImage(w96, 0, 0, 500, 500, this);
				break;

			case 97:
				ImageIcon im97 = new ImageIcon("Meteor/097.PNG");
				Image w97 = im97.getImage();
				g.drawImage(w97, 0, 0, 500, 500, this);
				break;

			case 98:
				ImageIcon im98 = new ImageIcon("Meteor/098.PNG");
				Image w98 = im98.getImage();
				g.drawImage(w98, 0, 0, 500, 500, this);
				break;

			case 99:
				ImageIcon im99 = new ImageIcon("Meteor/099.PNG");
				Image w99 = im99.getImage();
				g.drawImage(w99, 0, 0, 500, 500, this);
				break;

			case 100:
				ImageIcon im100 = new ImageIcon("Meteor/100.PNG");
				Image w100 = im100.getImage();
				g.drawImage(w100, 0, 0, 500, 500, this);
				break;

			case 101:
				ImageIcon im101 = new ImageIcon("Meteor/101.PNG");
				Image w101 = im101.getImage();
				g.drawImage(w101, 0, 0, 500, 500, this);
				break;

			case 102:
				ImageIcon im102 = new ImageIcon("Meteor/102.PNG");
				Image w102 = im102.getImage();
				g.drawImage(w102, 0, 0, 500, 500, this);
				break;

			case 103:
				ImageIcon im103 = new ImageIcon("Meteor/103.PNG");
				Image w103 = im103.getImage();
				g.drawImage(w103, 0, 0, 500, 500, this);
				break;

			case 104:
				ImageIcon im104 = new ImageIcon("Meteor/104.PNG");
				Image w104 = im104.getImage();
				g.drawImage(w104, 0, 0, 500, 500, this);
				break;

			case 105:
				ImageIcon im105 = new ImageIcon("Meteor/105.PNG");
				Image w105 = im105.getImage();
				g.drawImage(w105, 0, 0, 500, 500, this);
				break;

			case 106:
				ImageIcon im106 = new ImageIcon("Meteor/106.PNG");
				Image w106 = im106.getImage();
				g.drawImage(w106, 0, 0, 500, 500, this);
				break;

			case 107:
				ImageIcon im107 = new ImageIcon("Meteor/107.PNG");
				Image w107 = im107.getImage();
				g.drawImage(w107, 0, 0, 500, 500, this);
				break;

			case 108:
				ImageIcon im108 = new ImageIcon("Meteor/108.PNG");
				Image w108 = im108.getImage();
				g.drawImage(w108, 0, 0, 500, 500, this);
				break;

			case 109:
				ImageIcon im109 = new ImageIcon("Meteor/109.PNG");
				Image w109 = im109.getImage();
				g.drawImage(w109, 0, 0, 500, 500, this);
				break;

			case 110:
				ImageIcon im110 = new ImageIcon("Meteor/110.PNG");
				Image w110 = im110.getImage();
				g.drawImage(w110, 0, 0, 500, 500, this);
				break;

			case 111:
				ImageIcon im111 = new ImageIcon("Meteor/111.PNG");
				Image w111 = im111.getImage();
				g.drawImage(w111, 0, 0, 500, 500, this);
				break;

			case 112:
				ImageIcon im112 = new ImageIcon("Meteor/112.PNG");
				Image w112 = im112.getImage();
				g.drawImage(w112, 0, 0, 500, 500, this);
				break;

			case 113:
				ImageIcon im113 = new ImageIcon("Meteor/113.PNG");
				Image w113 = im113.getImage();
				g.drawImage(w113, 0, 0, 500, 500, this);
				break;

			case 114:
				ImageIcon im114 = new ImageIcon("Meteor/114.PNG");
				Image w114 = im114.getImage();
				g.drawImage(w114, 0, 0, 500, 500, this);
				break;

			case 115:
				ImageIcon im115 = new ImageIcon("Meteor/115.PNG");
				Image w115 = im115.getImage();
				g.drawImage(w115, 0, 0, 500, 500, this);
				break;

			case 116:
				ImageIcon im116 = new ImageIcon("Meteor/116.PNG");
				Image w116 = im116.getImage();
				g.drawImage(w116, 0, 0, 500, 500, this);
				break;

			case 117:
				ImageIcon im117 = new ImageIcon("Meteor/117.PNG");
				Image w117 = im117.getImage();
				g.drawImage(w117, 0, 0, 500, 500, this);
				break;

			case 118:
				ImageIcon im118 = new ImageIcon("Meteor/118.PNG");
				Image w118 = im118.getImage();
				g.drawImage(w118, 0, 0, 500, 500, this);
				break;

			case 119:
				ImageIcon im119 = new ImageIcon("Meteor/119.PNG");
				Image w119 = im119.getImage();
				g.drawImage(w119, 0, 0, 500, 500, this);
				break;

			case 120:
				ImageIcon im120 = new ImageIcon("Meteor/120.PNG");
				Image w120 = im120.getImage();
				g.drawImage(w120, 0, 0, 500, 500, this);
				break;

			case 121:
				ImageIcon im121 = new ImageIcon("Meteor/121.PNG");
				Image w121 = im121.getImage();
				g.drawImage(w121, 0, 0, 500, 500, this);
				break;

			case 122:
				ImageIcon im122 = new ImageIcon("Meteor/122.PNG");
				Image w122 = im122.getImage();
				g.drawImage(w122, 0, 0, 500, 500, this);
				break;

			case 123:
				ImageIcon im123 = new ImageIcon("Meteor/123.PNG");
				Image w123 = im123.getImage();
				g.drawImage(w123, 0, 0, 500, 500, this);
				break;

			case 124:
				ImageIcon im124 = new ImageIcon("Meteor/124.PNG");
				Image w124 = im124.getImage();
				g.drawImage(w124, 0, 0, 500, 500, this);
				break;

			case 125:
				ImageIcon im125 = new ImageIcon("Meteor/125.PNG");
				Image w125 = im125.getImage();
				g.drawImage(w125, 0, 0, 500, 500, this);
				break;

			case 126:
				ImageIcon im126 = new ImageIcon("Meteor/126.PNG");
				Image w126 = im126.getImage();
				g.drawImage(w126, 0, 0, 500, 500, this);
				break;

			case 127:
				ImageIcon im127 = new ImageIcon("Meteor/127.PNG");
				Image w127 = im127.getImage();
				g.drawImage(w127, 0, 0, 500, 500, this);
				break;

			case 128:
				ImageIcon im128 = new ImageIcon("Meteor/128.PNG");
				Image w128 = im128.getImage();
				g.drawImage(w128, 0, 0, 500, 500, this);
				break;

			case 129:
				ImageIcon im129 = new ImageIcon("Meteor/129.PNG");
				Image w129 = im129.getImage();
				g.drawImage(w129, 0, 0, 500, 500, this);
				break;

			case 130:
				ImageIcon im130 = new ImageIcon("Meteor/130.PNG");
				Image w130 = im130.getImage();
				g.drawImage(w130, 0, 0, 500, 500, this);
				break;

			case 131:
				ImageIcon im131 = new ImageIcon("Meteor/131.PNG");
				Image w131 = im131.getImage();
				g.drawImage(w131, 0, 0, 500, 500, this);
				break;

			case 132:
				ImageIcon im132 = new ImageIcon("Meteor/132.PNG");
				Image w132 = im132.getImage();
				g.drawImage(w132, 0, 0, 500, 500, this);
				break;

			case 133:
				ImageIcon im133 = new ImageIcon("Meteor/133.PNG");
				Image w133 = im133.getImage();
				g.drawImage(w133, 0, 0, 500, 500, this);
				break;

			case 134:
				ImageIcon im134 = new ImageIcon("Meteor/134.PNG");
				Image w134 = im134.getImage();
				g.drawImage(w134, 0, 0, 500, 500, this);
				break;

			case 135:
				ImageIcon im135 = new ImageIcon("Meteor/135.PNG");
				Image w135 = im135.getImage();
				g.drawImage(w135, 0, 0, 500, 500, this);
				break;

			case 136:
				ImageIcon im136 = new ImageIcon("Meteor/136.PNG");
				Image w136 = im136.getImage();
				g.drawImage(w136, 0, 0, 500, 500, this);
				break;

			case 137:
				ImageIcon im137 = new ImageIcon("Meteor/137.PNG");
				Image w137 = im137.getImage();
				g.drawImage(w137, 0, 0, 500, 500, this);
				break;

			case 138:
				ImageIcon im138 = new ImageIcon("Meteor/138.PNG");
				Image w138 = im138.getImage();
				g.drawImage(w138, 0, 0, 500, 500, this);
				break;

			case 139:
				ImageIcon im139 = new ImageIcon("Meteor/139.PNG");
				Image w139 = im139.getImage();
				g.drawImage(w139, 0, 0, 500, 500, this);
				break;

			case 140:
				ImageIcon im140 = new ImageIcon("Meteor/140.PNG");
				Image w140 = im140.getImage();
				g.drawImage(w140, 0, 0, 500, 500, this);
				break;

			case 141:
				ImageIcon im141 = new ImageIcon("Meteor/141.PNG");
				Image w141 = im141.getImage();
				g.drawImage(w141, 0, 0, 500, 500, this);
				break;

			case 142:
				ImageIcon im142 = new ImageIcon("Meteor/142.PNG");
				Image w142 = im142.getImage();
				g.drawImage(w142, 0, 0, 500, 500, this);
				break;

			case 143:
				ImageIcon im143 = new ImageIcon("Meteor/143.PNG");
				Image w143 = im143.getImage();
				g.drawImage(w143, 0, 0, 500, 500, this);
				break;

			case 144:
				ImageIcon im144 = new ImageIcon("Meteor/144.PNG");
				Image w144 = im144.getImage();
				g.drawImage(w144, 0, 0, 500, 500, this);
				break;

			case 145:
				ImageIcon im145 = new ImageIcon("Meteor/145.PNG");
				Image w145 = im145.getImage();
				g.drawImage(w145, 0, 0, 500, 500, this);
				break;

			case 146:
				ImageIcon im146 = new ImageIcon("Meteor/146.PNG");
				Image w146 = im146.getImage();
				g.drawImage(w146, 0, 0, 500, 500, this);
				break;

			case 147:
				ImageIcon im147 = new ImageIcon("Meteor/147.PNG");
				Image w147 = im147.getImage();
				g.drawImage(w147, 0, 0, 500, 500, this);
				break;

			case 148:
				ImageIcon im148 = new ImageIcon("Meteor/148.PNG");
				Image w148 = im148.getImage();
				g.drawImage(w148, 0, 0, 500, 500, this);
				break;

			case 149:
				ImageIcon im149 = new ImageIcon("Meteor/149.PNG");
				Image w149 = im149.getImage();
				g.drawImage(w149, 0, 0, 500, 500, this);
				break;

			case 150:
				ImageIcon im150 = new ImageIcon("Meteor/150.PNG");
				Image w150 = im150.getImage();
				g.drawImage(w150, 0, 0, 500, 500, this);
				break;

			case 151:
				ImageIcon im151 = new ImageIcon("Meteor/151.PNG");
				Image w151 = im151.getImage();
				g.drawImage(w151, 0, 0, 500, 500, this);
				break;

			case 152:
				ImageIcon im152 = new ImageIcon("Meteor/152.PNG");
				Image w152 = im152.getImage();
				g.drawImage(w152, 0, 0, 500, 500, this);
				break;

			case 153:
				ImageIcon im153 = new ImageIcon("Meteor/153.PNG");
				Image w153 = im153.getImage();
				g.drawImage(w153, 0, 0, 500, 500, this);
				break;

			case 154:
				ImageIcon im154 = new ImageIcon("Meteor/154.PNG");
				Image w154 = im154.getImage();
				g.drawImage(w154, 0, 0, 500, 500, this);
				break;

			case 155:
				ImageIcon im155 = new ImageIcon("Meteor/155.PNG");
				Image w155 = im155.getImage();
				g.drawImage(w155, 0, 0, 500, 500, this);
				break;

			case 156:
				ImageIcon im156 = new ImageIcon("Meteor/156.PNG");
				Image w156 = im156.getImage();
				g.drawImage(w156, 0, 0, 500, 500, this);
				break;

			case 157:
				ImageIcon im157 = new ImageIcon("Meteor/157.PNG");
				Image w157 = im157.getImage();
				g.drawImage(w157, 0, 0, 500, 500, this);
				break;

			case 158:
				ImageIcon im158 = new ImageIcon("Meteor/158.PNG");
				Image w158 = im158.getImage();
				g.drawImage(w158, 0, 0, 500, 500, this);
				break;

			case 159:
				ImageIcon im159 = new ImageIcon("Meteor/159.PNG");
				Image w159 = im159.getImage();
				g.drawImage(w159, 0, 0, 500, 500, this);
				break;

			case 160:
				ImageIcon im160 = new ImageIcon("Meteor/160.PNG");
				Image w160 = im160.getImage();
				g.drawImage(w160, 0, 0, 500, 500, this);
				break;

			case 161:
				ImageIcon im161 = new ImageIcon("Meteor/161.PNG");
				Image w161 = im161.getImage();
				g.drawImage(w161, 0, 0, 500, 500, this);
				break;

			case 162:
				ImageIcon im162 = new ImageIcon("Meteor/162.PNG");
				Image w162 = im162.getImage();
				g.drawImage(w162, 0, 0, 500, 500, this);
				break;

			case 163:
				ImageIcon im163 = new ImageIcon("Meteor/163.PNG");
				Image w163 = im163.getImage();
				g.drawImage(w163, 0, 0, 500, 500, this);
				break;

			case 164:
				ImageIcon im164 = new ImageIcon("Meteor/164.PNG");
				Image w164 = im164.getImage();
				g.drawImage(w164, 0, 0, 500, 500, this);
				break;

			case 165:
				ImageIcon im165 = new ImageIcon("Meteor/165.PNG");
				Image w165 = im165.getImage();
				g.drawImage(w165, 0, 0, 500, 500, this);
				break;

			case 166:
				ImageIcon im166 = new ImageIcon("Meteor/166.PNG");
				Image w166 = im166.getImage();
				g.drawImage(w166, 0, 0, 500, 500, this);
				break;

			case 167:
				ImageIcon im167 = new ImageIcon("Meteor/167.PNG");
				Image w167 = im167.getImage();
				g.drawImage(w167, 0, 0, 500, 500, this);
				break;

			case 168:
				ImageIcon im168 = new ImageIcon("Meteor/168.PNG");
				Image w168 = im168.getImage();
				g.drawImage(w168, 0, 0, 500, 500, this);
				break;

			case 169:
				ImageIcon im169 = new ImageIcon("Meteor/169.PNG");
				Image w169 = im169.getImage();
				g.drawImage(w169, 0, 0, 500, 500, this);
				break;

			case 170:
				ImageIcon im170 = new ImageIcon("Meteor/170.PNG");
				Image w170 = im170.getImage();
				g.drawImage(w170, 0, 0, 500, 500, this);
				break;

			case 171:
				ImageIcon im171 = new ImageIcon("Meteor/171.PNG");
				Image w171 = im171.getImage();
				g.drawImage(w171, 0, 0, 500, 500, this);
				break;

			case 172:
				ImageIcon im172 = new ImageIcon("Meteor/172.PNG");
				Image w172 = im172.getImage();
				g.drawImage(w172, 0, 0, 500, 500, this);
				break;

			case 173:
				ImageIcon im173 = new ImageIcon("Meteor/173.PNG");
				Image w173 = im173.getImage();
				g.drawImage(w173, 0, 0, 500, 500, this);
				break;

			case 174:
				ImageIcon im174 = new ImageIcon("Meteor/174.PNG");
				Image w174 = im174.getImage();
				g.drawImage(w174, 0, 0, 500, 500, this);
				break;

			case 175:
				ImageIcon im175 = new ImageIcon("Meteor/175.PNG");
				Image w175 = im175.getImage();
				g.drawImage(w175, 0, 0, 500, 500, this);
				break;

			case 176:
				ImageIcon im176 = new ImageIcon("Meteor/176.PNG");
				Image w176 = im176.getImage();
				g.drawImage(w176, 0, 0, 500, 500, this);
				break;

			case 177:
				ImageIcon im177 = new ImageIcon("Meteor/177.PNG");
				Image w177 = im177.getImage();
				g.drawImage(w177, 0, 0, 500, 500, this);
				break;

			case 178:
				ImageIcon im178 = new ImageIcon("Meteor/178.PNG");
				Image w178 = im178.getImage();
				g.drawImage(w178, 0, 0, 500, 500, this);
				break;

			case 179:
				ImageIcon im179 = new ImageIcon("Meteor/179.PNG");
				Image w179 = im179.getImage();
				g.drawImage(w179, 0, 0, 500, 500, this);
				break;

			case 180:
				ImageIcon im180 = new ImageIcon("Meteor/180.PNG");
				Image w180 = im180.getImage();
				g.drawImage(w180, 0, 0, 500, 500, this);
				break;

			case 181:
				ImageIcon im181 = new ImageIcon("Meteor/181.PNG");
				Image w181 = im181.getImage();
				g.drawImage(w181, 0, 0, 500, 500, this);
				break;

			case 182:
				ImageIcon im182 = new ImageIcon("Meteor/182.PNG");
				Image w182 = im182.getImage();
				g.drawImage(w182, 0, 0, 500, 500, this);
				break;

			case 183:
				ImageIcon im183 = new ImageIcon("Meteor/183.PNG");
				Image w183 = im183.getImage();
				g.drawImage(w183, 0, 0, 500, 500, this);
				break;

			case 184:
				ImageIcon im184 = new ImageIcon("Meteor/184.PNG");
				Image w184 = im184.getImage();
				g.drawImage(w184, 0, 0, 500, 500, this);
				break;

			case 185:
				ImageIcon im185 = new ImageIcon("Meteor/185.PNG");
				Image w185 = im185.getImage();
				g.drawImage(w185, 0, 0, 500, 500, this);
				break;

			case 186:
				ImageIcon im186 = new ImageIcon("Meteor/186.PNG");
				Image w186 = im186.getImage();
				g.drawImage(w186, 0, 0, 500, 500, this);
				break;

			case 187:
				ImageIcon im187 = new ImageIcon("Meteor/187.PNG");
				Image w187 = im187.getImage();
				g.drawImage(w187, 0, 0, 500, 500, this);
				break;

			case 188:
				ImageIcon im188 = new ImageIcon("Meteor/188.PNG");
				Image w188 = im188.getImage();
				g.drawImage(w188, 0, 0, 500, 500, this);
				break;

			case 189:
				ImageIcon im189 = new ImageIcon("Meteor/189.PNG");
				Image w189 = im189.getImage();
				g.drawImage(w189, 0, 0, 500, 500, this);
				break;

			case 190:
				ImageIcon im190 = new ImageIcon("Meteor/190.PNG");
				Image w190 = im190.getImage();
				g.drawImage(w190, 0, 0, 500, 500, this);
				break;

			case 191:
				ImageIcon im191 = new ImageIcon("Meteor/191.PNG");
				Image w191 = im191.getImage();
				g.drawImage(w191, 0, 0, 500, 500, this);
				break;

			case 192:
				ImageIcon im192 = new ImageIcon("Meteor/192.PNG");
				Image w192 = im192.getImage();
				g.drawImage(w192, 0, 0, 500, 500, this);
				break;

			case 193:
				ImageIcon im193 = new ImageIcon("Meteor/193.PNG");
				Image w193 = im193.getImage();
				g.drawImage(w193, 0, 0, 500, 500, this);
				break;

			case 194:
				ImageIcon im194 = new ImageIcon("Meteor/194.PNG");
				Image w194 = im194.getImage();
				g.drawImage(w194, 0, 0, 500, 500, this);
				break;

			case 195:
				ImageIcon im195 = new ImageIcon("Meteor/195.PNG");
				Image w195 = im195.getImage();
				g.drawImage(w195, 0, 0, 500, 500, this);
				break;

			case 196:
				ImageIcon im196 = new ImageIcon("Meteor/196.PNG");
				Image w196 = im196.getImage();
				g.drawImage(w196, 0, 0, 500, 500, this);
				break;

			case 197:
				ImageIcon im197 = new ImageIcon("Meteor/197.PNG");
				Image w197 = im197.getImage();
				g.drawImage(w197, 0, 0, 500, 500, this);
				break;

			case 198:
				ImageIcon im198 = new ImageIcon("Meteor/198.PNG");
				Image w198 = im198.getImage();
				g.drawImage(w198, 0, 0, 500, 500, this);
				break;

			case 199:
				ImageIcon im199 = new ImageIcon("Meteor/199.PNG");
				Image w199 = im199.getImage();
				g.drawImage(w199, 0, 0, 500, 500, this);
				break;

			case 200:
				ImageIcon im200 = new ImageIcon("Meteor/200.PNG");
				Image w200 = im200.getImage();
				g.drawImage(w200, 0, 0, 500, 500, this);
				break;

			case 201:
				ImageIcon im201 = new ImageIcon("Meteor/201.PNG");
				Image w201 = im201.getImage();
				g.drawImage(w201, 0, 0, 500, 500, this);
				break;

			case 202:
				ImageIcon im202 = new ImageIcon("Meteor/202.PNG");
				Image w202 = im202.getImage();
				g.drawImage(w202, 0, 0, 500, 500, this);
				break;

			case 203:
				ImageIcon im203 = new ImageIcon("Meteor/203.PNG");
				Image w203 = im203.getImage();
				g.drawImage(w203, 0, 0, 500, 500, this);
				break;

			case 204:
				ImageIcon im204 = new ImageIcon("Meteor/204.PNG");
				Image w204 = im204.getImage();
				g.drawImage(w204, 0, 0, 500, 500, this);
				break;

			case 205:
				ImageIcon im205 = new ImageIcon("Meteor/205.PNG");
				Image w205 = im205.getImage();
				g.drawImage(w205, 0, 0, 500, 500, this);
				break;

			case 206:
				ImageIcon im206 = new ImageIcon("Meteor/206.PNG");
				Image w206 = im206.getImage();
				g.drawImage(w206, 0, 0, 500, 500, this);
				break;

			case 207:
				ImageIcon im207 = new ImageIcon("Meteor/207.PNG");
				Image w207 = im207.getImage();
				g.drawImage(w207, 0, 0, 500, 500, this);
				break;

			case 208:
				ImageIcon im208 = new ImageIcon("Meteor/208.PNG");
				Image w208 = im208.getImage();
				g.drawImage(w208, 0, 0, 500, 500, this);
				break;

			case 209:
				ImageIcon im209 = new ImageIcon("Meteor/209.PNG");
				Image w209 = im209.getImage();
				g.drawImage(w209, 0, 0, 500, 500, this);
				break;

			case 210:
				ImageIcon im210 = new ImageIcon("Meteor/210.PNG");
				Image w210 = im210.getImage();
				g.drawImage(w210, 0, 0, 500, 500, this);
				break;

			case 211:
				ImageIcon im211 = new ImageIcon("Meteor/211.PNG");
				Image w211 = im211.getImage();
				g.drawImage(w211, 0, 0, 500, 500, this);
				break;

			case 212:
				ImageIcon im212 = new ImageIcon("Meteor/212.PNG");
				Image w212 = im212.getImage();
				g.drawImage(w212, 0, 0, 500, 500, this);
				break;

			case 213:
				ImageIcon im213 = new ImageIcon("Meteor/213.PNG");
				Image w213 = im213.getImage();
				g.drawImage(w213, 0, 0, 500, 500, this);
				break;

			case 214:
				ImageIcon im214 = new ImageIcon("Meteor/214.PNG");
				Image w214 = im214.getImage();
				g.drawImage(w214, 0, 0, 500, 500, this);
				break;

			case 215:
				ImageIcon im215 = new ImageIcon("Meteor/215.PNG");
				Image w215 = im215.getImage();
				g.drawImage(w215, 0, 0, 500, 500, this);
				break;

			case 216:
				ImageIcon im216 = new ImageIcon("Meteor/216.PNG");
				Image w216 = im216.getImage();
				g.drawImage(w216, 0, 0, 500, 500, this);
				break;

			case 217:
				ImageIcon im217 = new ImageIcon("Meteor/217.PNG");
				Image w217 = im217.getImage();
				g.drawImage(w217, 0, 0, 500, 500, this);
				break;

			case 218:
				ImageIcon im218 = new ImageIcon("Meteor/218.PNG");
				Image w218 = im218.getImage();
				g.drawImage(w218, 0, 0, 500, 500, this);
				break;

			case 219:
				ImageIcon im219 = new ImageIcon("Meteor/219.PNG");
				Image w219 = im219.getImage();
				g.drawImage(w219, 0, 0, 500, 500, this);
				break;

			case 220:
				ImageIcon im220 = new ImageIcon("Meteor/220.PNG");
				Image w220 = im220.getImage();
				g.drawImage(w220, 0, 0, 500, 500, this);
				break;

			case 221:
				ImageIcon im221 = new ImageIcon("Meteor/221.PNG");
				Image w221 = im221.getImage();
				g.drawImage(w221, 0, 0, 500, 500, this);
				break;

			case 222:
				ImageIcon im222 = new ImageIcon("Meteor/222.PNG");
				Image w222 = im222.getImage();
				g.drawImage(w222, 0, 0, 500, 500, this);
				break;

			case 223:
				ImageIcon im223 = new ImageIcon("Meteor/223.PNG");
				Image w223 = im223.getImage();
				g.drawImage(w223, 0, 0, 500, 500, this);
				break;

			case 224:
				ImageIcon im224 = new ImageIcon("Meteor/224.PNG");
				Image w224 = im224.getImage();
				g.drawImage(w224, 0, 0, 500, 500, this);
				break;

			case 225:
				ImageIcon im225 = new ImageIcon("Meteor/225.PNG");
				Image w225 = im225.getImage();
				g.drawImage(w225, 0, 0, 500, 500, this);
				break;

			case 226:
				ImageIcon im226 = new ImageIcon("Meteor/226.PNG");
				Image w226 = im226.getImage();
				g.drawImage(w226, 0, 0, 500, 500, this);
				break;

			case 227:
				ImageIcon im227 = new ImageIcon("Meteor/227.PNG");
				Image w227 = im227.getImage();
				g.drawImage(w227, 0, 0, 500, 500, this);
				break;

			case 228:
				ImageIcon im228 = new ImageIcon("Meteor/228.PNG");
				Image w228 = im228.getImage();
				g.drawImage(w228, 0, 0, 500, 500, this);
				break;

			case 229:
				ImageIcon im229 = new ImageIcon("Meteor/229.PNG");
				Image w229 = im229.getImage();
				g.drawImage(w229, 0, 0, 500, 500, this);
				break;

			case 230:
				ImageIcon im230 = new ImageIcon("Meteor/230.PNG");
				Image w230 = im230.getImage();
				g.drawImage(w230, 0, 0, 500, 500, this);
				break;

			case 231:
				ImageIcon im231 = new ImageIcon("Meteor/231.PNG");
				Image w231 = im231.getImage();
				g.drawImage(w231, 0, 0, 500, 500, this);
				break;

			case 232:
				ImageIcon im232 = new ImageIcon("Meteor/232.PNG");
				Image w232 = im232.getImage();
				g.drawImage(w232, 0, 0, 500, 500, this);
				break;

			case 233:
				ImageIcon im233 = new ImageIcon("Meteor/233.PNG");
				Image w233 = im233.getImage();
				g.drawImage(w233, 0, 0, 500, 500, this);
				break;

			case 234:
				ImageIcon im234 = new ImageIcon("Meteor/234.PNG");
				Image w234 = im234.getImage();
				g.drawImage(w234, 0, 0, 500, 500, this);
				break;

			case 235:
				ImageIcon im235 = new ImageIcon("Meteor/235.PNG");
				Image w235 = im235.getImage();
				g.drawImage(w235, 0, 0, 500, 500, this);
				break;

			case 236:
				ImageIcon im236 = new ImageIcon("Meteor/236.PNG");
				Image w236 = im236.getImage();
				g.drawImage(w236, 0, 0, 500, 500, this);
				break;

			case 237:
				ImageIcon im237 = new ImageIcon("Meteor/237.PNG");
				Image w237 = im237.getImage();
				g.drawImage(w237, 0, 0, 500, 500, this);
				break;

			case 238:
				ImageIcon im238 = new ImageIcon("Meteor/238.PNG");
				Image w238 = im238.getImage();
				g.drawImage(w238, 0, 0, 500, 500, this);
				break;

			case 239:
				ImageIcon im239 = new ImageIcon("Meteor/239.PNG");
				Image w239 = im239.getImage();
				g.drawImage(w239, 0, 0, 500, 500, this);
				break;

			case 240:
				ImageIcon im240 = new ImageIcon("Meteor/240.PNG");
				Image w240 = im240.getImage();
				g.drawImage(w240, 0, 0, 500, 500, this);
				break;

			case 241:
				ImageIcon im241 = new ImageIcon("Meteor/241.PNG");
				Image w241 = im241.getImage();
				g.drawImage(w241, 0, 0, 500, 500, this);
				break;

			case 242:
				ImageIcon im242 = new ImageIcon("Meteor/242.PNG");
				Image w242 = im242.getImage();
				g.drawImage(w242, 0, 0, 500, 500, this);
				break;

			case 243:
				ImageIcon im243 = new ImageIcon("Meteor/243.PNG");
				Image w243 = im243.getImage();
				g.drawImage(w243, 0, 0, 500, 500, this);
				break;

			case 244:
				ImageIcon im244 = new ImageIcon("Meteor/244.PNG");
				Image w244 = im244.getImage();
				g.drawImage(w244, 0, 0, 500, 500, this);
				break;

			}
		}
	}

	public void attacke2(Graphics g) {
		if (speciaux[14]) {
			switch (speciau[14]) {
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

			case 53:
				ImageIcon im53 = new ImageIcon("Purgatory/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			}
		}
		if (speciaux[15]) {
			switch (speciau[15]) {
			case 1:
				ImageIcon im1 = new ImageIcon("SonicWave/001.PNG");
				Image w1 = im1.getImage();
				g.drawImage(w1, 0, 0, 500, 500, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("SonicWave/002.PNG");
				Image w2 = im2.getImage();
				g.drawImage(w2, 0, 0, 500, 500, this);
				break;

			case 3:
				ImageIcon im3 = new ImageIcon("SonicWave/003.PNG");
				Image w3 = im3.getImage();
				g.drawImage(w3, 0, 0, 500, 500, this);
				break;

			case 4:
				ImageIcon im4 = new ImageIcon("SonicWave/004.PNG");
				Image w4 = im4.getImage();
				g.drawImage(w4, 0, 0, 500, 500, this);
				break;

			case 5:
				ImageIcon im5 = new ImageIcon("SonicWave/005.PNG");
				Image w5 = im5.getImage();
				g.drawImage(w5, 0, 0, 500, 500, this);
				break;

			case 6:
				ImageIcon im6 = new ImageIcon("SonicWave/006.PNG");
				Image w6 = im6.getImage();
				g.drawImage(w6, 0, 0, 500, 500, this);
				break;

			case 7:
				ImageIcon im7 = new ImageIcon("SonicWave/007.PNG");
				Image w7 = im7.getImage();
				g.drawImage(w7, 0, 0, 500, 500, this);
				break;

			case 8:
				ImageIcon im8 = new ImageIcon("SonicWave/008.PNG");
				Image w8 = im8.getImage();
				g.drawImage(w8, 0, 0, 500, 500, this);
				break;

			case 9:
				ImageIcon im9 = new ImageIcon("SonicWave/009.PNG");
				Image w9 = im9.getImage();
				g.drawImage(w9, 0, 0, 500, 500, this);
				break;

			case 10:
				ImageIcon im10 = new ImageIcon("SonicWave/010.PNG");
				Image w10 = im10.getImage();
				g.drawImage(w10, 0, 0, 500, 500, this);
				break;

			case 11:
				ImageIcon im11 = new ImageIcon("SonicWave/011.PNG");
				Image w11 = im11.getImage();
				g.drawImage(w11, 0, 0, 500, 500, this);
				break;

			case 12:
				ImageIcon im12 = new ImageIcon("SonicWave/012.PNG");
				Image w12 = im12.getImage();
				g.drawImage(w12, 0, 0, 500, 500, this);
				break;

			case 13:
				ImageIcon im13 = new ImageIcon("SonicWave/013.PNG");
				Image w13 = im13.getImage();
				g.drawImage(w13, 0, 0, 500, 500, this);
				break;

			case 14:
				ImageIcon im14 = new ImageIcon("SonicWave/014.PNG");
				Image w14 = im14.getImage();
				g.drawImage(w14, 0, 0, 500, 500, this);
				break;

			case 15:
				ImageIcon im15 = new ImageIcon("SonicWave/015.PNG");
				Image w15 = im15.getImage();
				g.drawImage(w15, 0, 0, 500, 500, this);
				break;

			case 16:
				ImageIcon im16 = new ImageIcon("SonicWave/016.PNG");
				Image w16 = im16.getImage();
				g.drawImage(w16, 0, 0, 500, 500, this);
				break;

			case 17:
				ImageIcon im17 = new ImageIcon("SonicWave/017.PNG");
				Image w17 = im17.getImage();
				g.drawImage(w17, 0, 0, 500, 500, this);
				break;

			case 18:
				ImageIcon im18 = new ImageIcon("SonicWave/018.PNG");
				Image w18 = im18.getImage();
				g.drawImage(w18, 0, 0, 500, 500, this);
				break;

			case 19:
				ImageIcon im19 = new ImageIcon("SonicWave/019.PNG");
				Image w19 = im19.getImage();
				g.drawImage(w19, 0, 0, 500, 500, this);
				break;

			case 20:
				ImageIcon im20 = new ImageIcon("SonicWave/020.PNG");
				Image w20 = im20.getImage();
				g.drawImage(w20, 0, 0, 500, 500, this);
				break;

			case 21:
				ImageIcon im21 = new ImageIcon("SonicWave/021.PNG");
				Image w21 = im21.getImage();
				g.drawImage(w21, 0, 0, 500, 500, this);
				break;

			case 22:
				ImageIcon im22 = new ImageIcon("SonicWave/022.PNG");
				Image w22 = im22.getImage();
				g.drawImage(w22, 0, 0, 500, 500, this);
				break;

			case 23:
				ImageIcon im23 = new ImageIcon("SonicWave/023.PNG");
				Image w23 = im23.getImage();
				g.drawImage(w23, 0, 0, 500, 500, this);
				break;

			case 24:
				ImageIcon im24 = new ImageIcon("SonicWave/024.PNG");
				Image w24 = im24.getImage();
				g.drawImage(w24, 0, 0, 500, 500, this);
				break;

			case 25:
				ImageIcon im25 = new ImageIcon("SonicWave/025.PNG");
				Image w25 = im25.getImage();
				g.drawImage(w25, 0, 0, 500, 500, this);
				break;

			case 26:
				ImageIcon im26 = new ImageIcon("SonicWave/026.PNG");
				Image w26 = im26.getImage();
				g.drawImage(w26, 0, 0, 500, 500, this);
				break;

			case 27:
				ImageIcon im27 = new ImageIcon("SonicWave/027.PNG");
				Image w27 = im27.getImage();
				g.drawImage(w27, 0, 0, 500, 500, this);
				break;

			case 28:
				ImageIcon im28 = new ImageIcon("SonicWave/028.PNG");
				Image w28 = im28.getImage();
				g.drawImage(w28, 0, 0, 500, 500, this);
				break;

			case 29:
				ImageIcon im29 = new ImageIcon("SonicWave/029.PNG");
				Image w29 = im29.getImage();
				g.drawImage(w29, 0, 0, 500, 500, this);
				break;

			case 30:
				ImageIcon im30 = new ImageIcon("SonicWave/030.PNG");
				Image w30 = im30.getImage();
				g.drawImage(w30, 0, 0, 500, 500, this);
				break;

			case 31:
				ImageIcon im31 = new ImageIcon("SonicWave/031.PNG");
				Image w31 = im31.getImage();
				g.drawImage(w31, 0, 0, 500, 500, this);
				break;

			case 32:
				ImageIcon im32 = new ImageIcon("SonicWave/032.PNG");
				Image w32 = im32.getImage();
				g.drawImage(w32, 0, 0, 500, 500, this);
				break;

			case 33:
				ImageIcon im33 = new ImageIcon("SonicWave/033.PNG");
				Image w33 = im33.getImage();
				g.drawImage(w33, 0, 0, 500, 500, this);
				break;

			case 34:
				ImageIcon im34 = new ImageIcon("SonicWave/034.PNG");
				Image w34 = im34.getImage();
				g.drawImage(w34, 0, 0, 500, 500, this);
				break;

			case 35:
				ImageIcon im35 = new ImageIcon("SonicWave/035.PNG");
				Image w35 = im35.getImage();
				g.drawImage(w35, 0, 0, 500, 500, this);
				break;

			case 36:
				ImageIcon im36 = new ImageIcon("SonicWave/036.PNG");
				Image w36 = im36.getImage();
				g.drawImage(w36, 0, 0, 500, 500, this);
				break;

			case 37:
				ImageIcon im37 = new ImageIcon("SonicWave/037.PNG");
				Image w37 = im37.getImage();
				g.drawImage(w37, 0, 0, 500, 500, this);
				break;

			case 38:
				ImageIcon im38 = new ImageIcon("SonicWave/038.PNG");
				Image w38 = im38.getImage();
				g.drawImage(w38, 0, 0, 500, 500, this);
				break;

			case 39:
				ImageIcon im39 = new ImageIcon("SonicWave/039.PNG");
				Image w39 = im39.getImage();
				g.drawImage(w39, 0, 0, 500, 500, this);
				break;

			case 40:
				ImageIcon im40 = new ImageIcon("SonicWave/040.PNG");
				Image w40 = im40.getImage();
				g.drawImage(w40, 0, 0, 500, 500, this);
				break;

			case 41:
				ImageIcon im41 = new ImageIcon("SonicWave/041.PNG");
				Image w41 = im41.getImage();
				g.drawImage(w41, 0, 0, 500, 500, this);
				break;

			case 42:
				ImageIcon im42 = new ImageIcon("SonicWave/042.PNG");
				Image w42 = im42.getImage();
				g.drawImage(w42, 0, 0, 500, 500, this);
				break;

			case 43:
				ImageIcon im43 = new ImageIcon("SonicWave/043.PNG");
				Image w43 = im43.getImage();
				g.drawImage(w43, 0, 0, 500, 500, this);
				break;

			case 44:
				ImageIcon im44 = new ImageIcon("SonicWave/044.PNG");
				Image w44 = im44.getImage();
				g.drawImage(w44, 0, 0, 500, 500, this);
				break;

			case 45:
				ImageIcon im45 = new ImageIcon("SonicWave/045.PNG");
				Image w45 = im45.getImage();
				g.drawImage(w45, 0, 0, 500, 500, this);
				break;

			case 46:
				ImageIcon im46 = new ImageIcon("SonicWave/046.PNG");
				Image w46 = im46.getImage();
				g.drawImage(w46, 0, 0, 500, 500, this);
				break;

			case 47:
				ImageIcon im47 = new ImageIcon("SonicWave/047.PNG");
				Image w47 = im47.getImage();
				g.drawImage(w47, 0, 0, 500, 500, this);
				break;

			case 48:
				ImageIcon im48 = new ImageIcon("SonicWave/048.PNG");
				Image w48 = im48.getImage();
				g.drawImage(w48, 0, 0, 500, 500, this);
				break;

			case 49:
				ImageIcon im49 = new ImageIcon("SonicWave/049.PNG");
				Image w49 = im49.getImage();
				g.drawImage(w49, 0, 0, 500, 500, this);
				break;

			case 50:
				ImageIcon im50 = new ImageIcon("SonicWave/050.PNG");
				Image w50 = im50.getImage();
				g.drawImage(w50, 0, 0, 500, 500, this);
				break;

			case 51:
				ImageIcon im51 = new ImageIcon("SonicWave/051.PNG");
				Image w51 = im51.getImage();
				g.drawImage(w51, 0, 0, 500, 500, this);
				break;

			case 52:
				ImageIcon im52 = new ImageIcon("SonicWave/052.PNG");
				Image w52 = im52.getImage();
				g.drawImage(w52, 0, 0, 500, 500, this);
				break;

			case 53:
				ImageIcon im53 = new ImageIcon("SonicWave/053.PNG");
				Image w53 = im53.getImage();
				g.drawImage(w53, 0, 0, 500, 500, this);
				break;

			case 54:
				ImageIcon im54 = new ImageIcon("SonicWave/054.PNG");
				Image w54 = im54.getImage();
				g.drawImage(w54, 0, 0, 500, 500, this);
				break;

			case 55:
				ImageIcon im55 = new ImageIcon("SonicWave/055.PNG");
				Image w55 = im55.getImage();
				g.drawImage(w55, 0, 0, 500, 500, this);
				break;

			case 56:
				ImageIcon im56 = new ImageIcon("SonicWave/056.PNG");
				Image w56 = im56.getImage();
				g.drawImage(w56, 0, 0, 500, 500, this);
				break;

			case 57:
				ImageIcon im57 = new ImageIcon("SonicWave/057.PNG");
				Image w57 = im57.getImage();
				g.drawImage(w57, 0, 0, 500, 500, this);
				break;

			case 58:
				ImageIcon im58 = new ImageIcon("SonicWave/058.PNG");
				Image w58 = im58.getImage();
				g.drawImage(w58, 0, 0, 500, 500, this);
				break;

			case 59:
				ImageIcon im59 = new ImageIcon("SonicWave/059.PNG");
				Image w59 = im59.getImage();
				g.drawImage(w59, 0, 0, 500, 500, this);
				break;

			case 60:
				ImageIcon im60 = new ImageIcon("SonicWave/060.PNG");
				Image w60 = im60.getImage();
				g.drawImage(w60, 0, 0, 500, 500, this);
				break;

			}
		}
	}

	public void attacke3(Graphics g) {
		if (speciaux[16]) {
			switch (speciau[16]) {
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

			case 363:
				ImageIcon im363 = new ImageIcon("Thor/363.PNG");
				Image w363 = im363.getImage();
				g.drawImage(w363, 0, 0, 500, 500, this);
				break;

			}
		}
	}

	public Pokemon2() {
		this.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {

			}
		});

		this.addMouseMotionListener(new MouseMotionListener() {
			public void mouseDragged(MouseEvent e) {
			}

			public void mouseMoved(MouseEvent e) {
				// System.out.println(e.getX() + "   " + e.getY());
			}
		});
		this.setLayout(null);

		/*
		 * JAnimatedIcon ai = new JAnimatedIcon("lugia.gif", 30); JAnimatedIcon
		 * ai2 = new JAnimatedIcon(ai, 200, 200); this.add(ai2);
		 * ai.setLocation(200, 200); ai.setSize(100, 100);
		 */
	}

	public void perso(int perso) {
		// Liste des attaques
		if (perso == 0) {
			boutons[0][0] = "LanceFlamme";
			boutons[0][1] = "Comete";
			boutons[1][0] = "flamme";
			boutons[1][1] = "aeropique";

		} else if (perso == 1) {
			boutons[0][0] = "Gele";
			boutons[0][1] = "Coupe d'acier";
			boutons[1][0] = "argent";
			boutons[1][1] = "Surf";

		} else if (perso == 2) {
			boutons[0][0] = "Psy";
			boutons[0][1] = "luminPsychose";
			boutons[1][0] = "red thunder";
			boutons[1][1] = "shining star";

		}
	}

	public void paintComponent(Graphics g) {
		if (affiche == 0) {
			// MODE COMBAT
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 1000, 1000);
			ImageIcon imageIcon = new ImageIcon("image/map/roche.png");
			Image w = imageIcon.getImage();
			g.drawImage(w, 0, 0, 500, 400, this);
			g.setColor(Color.blue);
			g.setFont(new Font("TimesRoman", Font.BOLD, 20));
			Graphics2D g21 = (Graphics2D) g;
			if (PV.size() != 0) {
				if (mypok.equals("ho-oh.gif"))
					drawString(g21, "PV " + mypok + " :" + PV.get(0), 290, 320);
				if (mypok.equals("mewtwo.gif"))
					drawString(g21, "PV " + mypok + " :" + PV.get(1), 270, 300);
				if (mypok.equals("lugia.gif"))
					drawString(g21, "PV " + mypok + " :" + PV.get(2), 290, 320);
				g.setColor(Color.RED);
				drawString(g21, "nombre potion : " + potion, 280, 350);
			}
			if (PV2.size() != 0)
				drawString(g21, "PV :" + PV2.get(0), 23, 80);

			attack(g);
			attack2(g);
			attack3(g);
			attack4(g);
			attacke(g);
			attacke2(g);
			attacke3(g);
			switch (ash) {
			case 0:
				ImageIcon image14 = new ImageIcon("image/perso/s.png");
				Image d14 = image14.getImage();

				g.drawImage(d14, ash2, 265, 115, 135, this);
				break;
			case 1:
				ImageIcon im1 = new ImageIcon("image/perso/s1.png");
				Image w1 = im1.getImage();
				g.drawImage(w1, ash2, 265, 115, 135, this);
				break;

			case 2:
				ImageIcon im2 = new ImageIcon("image/perso/s2.png");
				Image w2 = im2.getImage();
				g.drawImage(w2, ash2, 265, 115, 135, this);
				break;
			}

			ImageIcon image = new ImageIcon("image/menu/menu.png");
			Image d = image.getImage();
			g.drawImage(d, 0, 400, 500, 100, this);
			if (ecrire) {
				g.setColor(Color.blue);
				g.setFont(new Font("TimesRoman", Font.BOLD, 20));
				Graphics2D g2 = (Graphics2D) g;
				drawString(g2, TEXTE, 30, 410);
			} else {
				for (int i = 0; i < boutons.length; i++) {
					for (int j = 0; j < boutons[0].length; j++) {

						if (bool[i][j]) {
							g.setColor(Color.BLACK);
							g.drawRect(xm, ym,
									(int) (500 / boutons[0].length) - 1,
									(int) (70 / boutons.length) - 1);
						}

						g.setColor(Color.BLACK);
						g.setFont(new Font("Arial", Font.BOLD, 13));
						g.drawString(boutons[i][j] + "", xm + 100, ym + 20);

						xm = xm + (int) (500 / boutons[0].length);
					}
					xm = 0;
					ym = ym + (int) (70 / boutons.length);
				}
				xm = 0;
				ym = 415;
			}
		} else if (affiche == 1) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 700, 700);
			// SCENE 1
			if (level == 7) {
				// Map central du chateau
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 500, 500);

				ImageIcon image = new ImageIcon("image/map/cast.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);

				/*if (yami[8]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/pap.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 390, 200, 100, 80, this);
				}*/
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

					level = 8;
					x1 = 60;
					map = 0;
					map2 = 100;
					size = 500;
					size2 = 900;
				}
				if (x1 <= 15) {

					level = 9;
					x1 = 420;

				}
				if (y1 <= 20) {

					level = 10;
					y1 = 405;
				}

				if (y1 >= 440) {
					level = 11;
					y1 = 70;
				}

			}
			if (level == 9) {
				ImageIcon image = new ImageIcon("image/map/castgauche.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);

				if (yami[0]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/tor.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 200, 200, 100, 80, this);
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

			if (level == 10) {
				ImageIcon image = new ImageIcon("image/map/casthaut.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);
				if (yami[1]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/dra.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 200, 200, 100, 80, this);
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
			if (level == 11) {
				ImageIcon image = new ImageIcon("image/map/castbas.gif");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);
				if (yami[2]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/flo.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 200, 200, 100, 80, this);
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
			if (level == 8) {
				// Map a gauche dansle chateau
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 500, 500);
				ImageIcon image = new ImageIcon("image/map/castdroite.gif");
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
					level = 1000;
					x1 = 70;
				}

				if (x1 <= 30) {
					level = 7;
					x1 = 420;
				}
			}
			if (level == 1000) {
				ImageIcon imageIcon = new ImageIcon("image/map/final1.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);
				if (yami[3]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/groud.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 200, 200, 100, 80, this);
				}
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
				ImageIcon imageIcon = new ImageIcon("image/map/final2.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);
				if (yami[4]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/ment.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 200, 200, 60, 50, this);
				}
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
				ImageIcon imageIcon = new ImageIcon("image/map/final4.gif");
				Image w = imageIcon.getImage();
				g.drawImage(w, 0, 0, 500, 500, this);
				if (yami[5]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/pik.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 200, 200, 60, 50, this);
				}
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
				ImageIcon image = new ImageIcon("image/map/maproche.png");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);
				if (yami[6]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/ray.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 200, 200, 120, 100, this);
				}
				if (y1 <= 60) {
					y1 = 60;
				}
				if (y1 >= 450) {
					y1 = 450;
				}
				if (x1 >= 390) {
					x1 = 390;
				}
				if (between(y1, 70, 210) && x1 <= 40) {
					x1 = 45;
				}
				if (between(y1, 280, 420) && x1 <= 40) {
					x1 = 45;
				}
				if (x1 <= 30) {
					level = 1002;
					x1 = 395;
				}
			}

			if (level == 88) {
				// Map a gauche dansle chateau
				g.setColor(Color.BLACK);
				g.fillRect(0, 0, 500, 500);
				ImageIcon image = new ImageIcon("image/map/castdroite.gif");
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
				ImageIcon image = new ImageIcon("image/map/map1.png");
				Image d = image.getImage();
				g.drawImage(d, 0, 0, 500, 500, this);
				if (yami[7]) {
					ImageIcon im122 = new ImageIcon("image/pokemon/latios.png");
					Image w122 = im122.getImage();
					g.drawImage(w122, 200, 200, 110, 90, this);
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
			if (orientation == 0) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/perso/sdroite.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, x1, y1, 40, 40, this);
					// g.drawImage(w,x,y,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("image/perso/sdroite1.png");
					Image d = image.getImage();

					g.drawImage(d, x1, y1, 40, 40, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("image/perso/sdroite2.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, x1, y1, 40, 40, this);

					break;

				}
			}
			if (orientation == 1) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon(
							"image/perso/sgauche.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, x1, y1, 40, 40, this);
					// g.drawImage(w,x,y,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("image/perso/sgauche1.png");
					Image d = image.getImage();

					g.drawImage(d, x1, y1, 40, 40, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("image/perso/sgauche2.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, x1, y1, 40, 40, this);

					break;

				}
			}
			if (orientation == 2) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon("image/perso/sbas.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, x1, y1, 38, 38, this);
					// g.drawImage(w,x,y,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("image/perso/sbas1.png");
					Image d = image.getImage();

					g.drawImage(d, x1, y1, 40, 40, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("image/perso/sbas2.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, x1, y1, 40, 40, this);

					break;

				}
			}
			if (orientation == 3) {
				switch (avance) {
				case 1:

					ImageIcon imageIcon = new ImageIcon("image/perso/shaut.png");
					Image w = imageIcon.getImage();

					g.drawImage(w, x1, y1, 38, 38, this);
					// g.drawImage(w,x,y,this);
					break;

				case 2:

					ImageIcon image = new ImageIcon("image/perso/shaut1.png");
					Image d = image.getImage();

					g.drawImage(d, x1, y1, 40, 40, this);
					break;

				case 3:

					ImageIcon image2 = new ImageIcon("image/perso/shaut2.png");
					Image d1 = image2.getImage();

					g.drawImage(d1, x1, y1, 40, 40, this);
					break;
				}
			}
			if (panneau) {
				ImageIcon image = new ImageIcon("image/menu/menu.png");
				Image d = image.getImage();
				g.drawImage(d, 0, 400, 500, 100, this);
				g.setColor(Color.blue);
				g.setFont(new Font("TimesRoman", Font.BOLD, 20));
				Graphics2D g2 = (Graphics2D) g;
				drawString(g2, TEXTE, 30, 410);
			}
			repaint();
			if (animX2) {
				g.setColor(Color.WHITE);
				g.fillRect(0, 0, 600, 600);
			}
		} else if (affiche == 3) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 600, 600);
			ImageIcon image = new ImageIcon("image/menu/map2.gif");
			Image d = image.getImage();
			g.drawImage(d, 0, 0, 500, 500, this);
			ImageIcon image2 = new ImageIcon("image/menu/logo.png");
			Image d1 = image2.getImage();
			g.drawImage(d1, 150, 80, this);
			ImageIcon im122 = new ImageIcon("image/perso/ash.png");
			Image w122 = im122.getImage();
			g.drawImage(w122, 390, 230, this);
			ImageIcon im124 = new ImageIcon("image/perso/perle.png");
			Image w124 = im124.getImage();
			g.drawImage(w124, 100, 404, this);
			g.setColor(Color.black);
			g.setFont(new Font("TimesRoman", Font.BOLD, 20));
			g.drawString("Appuyer sur a", 140, 280);
			g.setColor(Color.BLUE);
			g.drawString("MUSEE HANTE RED", 140, 170);
		} else if (affiche == 4) {
			g.setColor(Color.BLACK);
			g.fillRect(0, 0, 600, 600);
			g.setColor(Color.blue);
			g.setFont(new Font("TimesRoman", Font.BOLD, 20));
			Graphics2D g2 = (Graphics2D) g;
			drawString(g2, "Pokemon -Musee hante- Par Patrick Chen", 0, 150);
		}
	}

	boolean panneau = false;

	public boolean between(int c, int a, int b) {
		return c <= b && c >= a;
	}

	boolean animX2 = false;
	int level = 7; // Level de depart
	int map = 0;
	int map2 = 0;
	int size = 500;
	int size2 = 500;
	int avance = 1;
	int orientation = 0;
	int x1 = 230;
	int y1 = 240;
	boolean[] yami = { true, true, true, true, true, true, true, true, true };

}
