import java.util.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
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
import javax.swing.JTextArea;

public class Laby  {
	// verifie que tous les id sont les meme
	public  boolean non_conect(Grid g) {
		int entier = g.cell[0][0].getId();
		for (int i = 0; i < g.cell.length; i++) {
			for (int j = 0; j < g.cell[0].length; j++) {
				Cellule cel = g.cell[i][j];
				int gg = cel.getId();
				if (entier != gg)
					return false;
			}
		}
		return true;
	}

	// met la mise a jour on est donc ici dans le union
	public  Grid union(Grid g, Integer a, Integer b) {
		for (int i = 0; i < g.cell.length; i++) {
			for (int jj = 0; jj < g.cell[0].length; jj++) {
				Cellule ce = g.cell[i][jj];
				if (ce.getId() == a) {
					ce.setId(b);
				}
			}
		}
		return g;
	}

	 ArrayList<Integer> liste = new ArrayList<Integer>();

	// methode renvoyant une permutation
	static int[] permutation(int[] t) {
		for (int i = 0; i < t.length; i++)
			t[i] = i;
		int tmp;
		for (int i = 0; i < t.length; i++) {
			tmp = t[i];
			int tmp2 = i + (int) (Math.random() * (t.length - i));
			t[i] = t[tmp2];
			t[tmp2] = tmp;
		}
		return t;
	}

	// fonction qui permet de trouver un chemin
	public  void find(Cellule ce) {
		liste = new ArrayList<Integer>();
		for (int av = 0; av < 6; av++) {
			if (ce.getNeighbor(av).isWall() == true && ce.hasNeighbor(av)) {
				if (ce.getId() != ce.getNeighbor(av).getCell().getId()) {
					liste.add(av);
				}
			}
		}
	}

	// On procede ici a un parcout aleatoire a laide dune permutation

	public Grid makeLaby(int n, int m) {
		int[] t = new int[n * m];
		t = permutation(t);
		boolean bool = true;
		Grid g = new Grid(n, m);
		while (!non_conect(g)) {
			for (int i = 0; i < t.length; i++) {

				Cellule ce = g.cell[(int) (t[i] / m)][(t[i] % m)];
				bool = true;
				while (bool) {
					// g.showGrid();
					find(ce);
					if (liste.size() == 0) {
						bool = true;
						break;
					}
					int rand = liste.get((int) (Math.random() * liste.size()));
					if (ce.hasNeighbor(rand)
							&& ce.getNeighbor(rand).isWall() == true
							&& ce.getId() != ce.getNeighbor(rand).getCell()
									.getId()) {
						ce.breakWallWith(rand);

						g = union(g, ce.getId(), ce.getNeighbor(rand).getCell()
								.getId());
						bool = false;
					}

				}

			}

		}
		return g;
	}

	// Ici on suit l'ordre classqiue de parcours d'un tableau
	// ON utilise le principe d'UNION-FIND en effet a chaque cassage de mur on
	// union les ID des cellules de sorte a
	// ce que l'on saches ce qui est un chemin deja fait.Trouver un chemin
	// reviens donc a casser un mur d'on lID n'est pas la meme que
	// la cellule courante ,puis l'unir avec le chemin courant du numero de l'ID
	// si on casse un mur en a et b, on remplaces toutes les cellules de la
	// grille qui ont comme id a par b
	public  Grid makeLabyA(int n, int m) {
		boolean bool = true;
		Grid g = new Grid(n, m);
		while (!non_conect(g)) {

			for (int i = 0; i < g.cell.length; i++) {
				for (int jj = 0; jj < g.cell[0].length; jj++) {
					Cellule ce = g.cell[i][jj];
					bool = true;
					while (bool) {
						find(ce);
						if (liste.size() == 0) {
							bool = true;
							break;
						}
						int rand = liste.get((int) (Math.random() * liste
								.size()));

						if (ce.hasNeighbor(rand)
								&& ce.getNeighbor(rand).isWall() == true
								&& ce.getId() != ce.getNeighbor(rand).getCell()
										.getId()) {
							ce.breakWallWith(rand);

							g = union(g, ce.getId(), ce.getNeighbor(rand)
									.getCell().getId());
							bool = false;
						}
					}

				}
			}
		}
		return g;
	}
        
        public void exec(){
        Grid grid = makeLaby(10, 10);
	        //Grid grid = makeLabyA(30,10);
		grid.showGrid();
		// Lance une interface graphique a locasion d halloween
		new Halloween(grid, false);
        }
	
}
