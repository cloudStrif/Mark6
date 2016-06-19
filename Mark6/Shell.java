import static java.awt.GraphicsDevice.WindowTranslucency.TRANSLUCENT;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Desktop;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class Shell extends JFrame {
	JTextField jtf = new JTextField();
	JTextArea texte = new JTextArea("");

	JAnimatedIcon[] ai = new JAnimatedIcon[20];
	JAnimatedIcon[] ai2 = new JAnimatedIcon[20];
	JPanel container = new JPanel();
	String print = "";
	String path = "/." + System.getProperty("user.dir");// "/./home/netbook/workspace";
	ArrayList<File> courant = new ArrayList<File>();
	ArrayList<String> retenu = new ArrayList<String>();
	ArrayList<String> lis = new ArrayList<String>();
	// Gestion de processus
	HashMap<Integer, Thread> listeprocessus = new HashMap<Integer, Thread>();
	// Listage de processus pour la commande Kill
	Thread[] processus = new Thread[100];

	public Shell() {
		setTitle("Welcome sir");
		setSize(800, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		Font police = new Font("Arial", Font.BOLD, 20);
		texte.setFont(police);
		texte.setBackground(Color.black);
		texte.setForeground(new Color(20, 100, 200));
		container.setLayout(new BorderLayout());
		container.add(new JScrollPane(texte), BorderLayout.CENTER);
		JPanel north = new JPanel();
		jtf.setPreferredSize(new Dimension(780, 30));
		jtf.addKeyListener(new Clavier());
		jtf.setBackground(Color.BLACK);
		jtf.setForeground(new Color(20, 100, 200));
		north.add(jtf);
		north.setBackground(Color.BLACK);
		jtf.setFont(police);
		container.add(north, BorderLayout.NORTH);
		setContentPane(container);

		ai[2] = new JAnimatedIcon("jarvis/fond2.gif", 80);
		ai2[2] = new JAnimatedIcon(false, ai[2], 600, 400);
		texte.add(ai2[2]);
		ai2[2].setLocation(470, 0);

		ai[6] = new JAnimatedIcon("jarvis/holo.gif", 80);
		ai2[6] = new JAnimatedIcon(false, ai[6], 300, 300);
		texte.add(ai2[6]);
		ai2[6].setLocation(500, 650);

		ai[1] = new JAnimatedIcon("jarvis/jarvis.gif", 80);
		ai2[1] = new JAnimatedIcon(false, ai[1], 20, 20);
		jtf.add(ai2[1]);
		ai2[1].setLocation(750, 5);

		setVisible(true);
		ai[3] = new JAnimatedIcon("jarvis/holo.gif", 80);
		ai2[3] = new JAnimatedIcon(false, ai[3], 60, 50);
		texte.add(ai2[3]);
		ai2[3].setLocation(720, 390);

		/*
		 * ai[7] = new JAnimatedIcon("res/fond.gif", 80); ai2[7] = new
		 * JAnimatedIcon(false, ai[7], 700, 400); texte.add(ai2[7]);
		 * ai2[7].setLocation(0, 0);
		 */

		texte.setCaretColor(Color.GREEN);
		texte.setEditable(false);
	}

	public void listage(String test) {
		String tmp = "";
		for (int i = 0; i < test.length(); i++) {
			if (test.charAt(i) == ' ') {
				if (i >= 1) {
					if (test.charAt(i - 1) != ' ') {
						lis.add(tmp);
						tmp = "";
					}
				}
			} else {
				tmp += test.charAt(i);
			}
		}
		if (!tmp.equals(""))
			lis.add(tmp);
	}

	public void pause(int a) {
		try {
			Thread.sleep(a);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void ls(int pid, String chemin) {
		/*
		 * File f = null; String[] paths; String pp = ""; try { f = new File(p);
		 * paths = f.list();
		 * 
		 * for (String path : paths) { // System.out.println(path); pp = pp +
		 * "\n" + path; texte.setText(pp); pause(10); } } catch (Exception e) {
		 * // if any error occurs e.printStackTrace(); } return pp;
		 */
		processus[0] = new Thread(new LS(pid, chemin));
		processus[0].start();
	}

	int choix = 0;

	// met a jour la liste des elements
	public void courant() {
		courant = new ArrayList<File>();
		File f = new File(path);
		String[] paths;
		paths = f.list();
		for (File path : f.listFiles()) {
			courant.add(path);
		}
		listage(jtf.getText());
		for (int i = 0; i < courant.size(); i++) {
			if (courant.get(i).getName().length() >= lis.get(1).length()) {
				if ((lis.get(1)).equals(courant.get(i).getName()
						.substring(0, lis.get(1).length()))) {
					System.out.println(courant.get(i).getName());
					retenu.add(courant.get(i).getName());
				}
			}
		}

		if (choix < retenu.size()) {
			jtf.setText(lis.get(0) + " " + retenu.get(choix));
			choix++;
		} else
			choix = 0;
		lis = new ArrayList<String>();
		retenu = new ArrayList<String>();
	}

	class LS implements Runnable {
		int pid;
		String chemin = "";

		public LS(int pid, String chemin) {
			this.pid = pid;
			this.chemin = chemin;
		}

		public void run() {

			// init();
			File f = null;
			String[] paths;
			String pp = "\npid : " + pid + "\n\n";
			try {
				f = new File(chemin);
				paths = f.list();
				for (File path : f.listFiles()) {
					if (path.isDirectory())
						pp = pp + "\n" + "/" + path.getName();
					else
						pp = pp + "\n" + path.getName();
					texte.setText(pp);
					pause(20);
				}
			} catch (Exception e) {
				// if any error occurs
				e.printStackTrace();
			}
			texte.setText(pp);
			texte.repaint();
		}
	}

	class CD implements Runnable {
		int pid;

		public CD(int pid) {
			this.pid = pid;
			texte.setText("pid cd : " + pid);
		}

		public void run() {
			if (lis.size() == 1) {
				path = "/." + System.getProperty("user.dir");
				setTitle(path);

			} else if (path.equals("/.")
					&& lis.get(1).substring(0, 2).equals("..")) {

			} else if (lis.size() >= 2 && lis.get(1).length() >= 2) {

				if (lis.get(1).substring(0, 2).equals("..")) {
					nbrecul(lis.get(1));
					setTitle(path);
				} else {
					if ((new File(path + "/" + lis.get(1))).isDirectory()
							&& (new File(path + "/" + lis.get(1))).exists()
							&& !lis.get(1).equals(".")) {
						path += "/" + lis.get(1);
						setTitle(path);
					} else {
						texte.setText("Ce n'est pas un dossier ,impossible d'entrer");
					}
				}
			}
		}
	}

	class Internet implements Runnable {
		int pid;

		public Internet(int pid) {
			this.pid = pid;
			texte.setText("pid Internet = " + pid);
		}

		public void run() {

		}
	}

	class Compte implements Runnable {
		int pid;
		int combien;
		String format = "%d\n";

		public Compte(int pid, int combien, String format) {
			this.pid = pid;
			this.combien = combien;
			this.format = format;
		}

		public void run() {
			switch (format) {
			case "%d\n":
				for(int k = 0 ; k < combien ; k++){
					texte.setText("je compte en Int :"+k);
					pause(1000);
				}
				break;
			case "%f\n":
				break;
			}
		}
	}

	// retourne l indice ou lon a un slash en partant de la fin
	public int indiceCoupe() {
		for (int i = path.length() - 1; i > 0; i--) {
			if (path.charAt(i) == '/')
				return i;
		}
		// le cas echeant
		return 2;
	}

	public int indiceCoupe2() {
		for (int i = aRetour.length() - 1; i > 0; i--) {
			if (aRetour.charAt(i) == '/')
				return i;
		}
		return 2;
	}

	class Clavier implements KeyListener {
		ArrayList<String> history = new ArrayList<String>();

		int index = 0;

		public Clavier() {
			history.add("");
		}

		@Override
		public void keyPressed(KeyEvent arg0) {
			System.out.println(arg0.getKeyCode());
			setTitle(path);

			// TODO Auto-generated method stub
			if (arg0.getKeyCode() == 10) {
				history.add(jtf.getText());
				listage(jtf.getText());
				if (lis.size() > 0) {
					if (lis.get(0).equals("exit")) {
						System.exit(0);
					} else if (lis.get(0).equals("pwd")) {
						texte.setText("Pwd : " + path);
					} else if (lis.get(0).equals("clear")) {
						print = "";
						texte.setText("");
					} else if (lis.get(0).equals("ls")) {
						if (lis.size() == 1)
							ls((int) (Math.random() * 3000), path);
						else {
							if (lis.size() == 2) {
								ls((int) (Math.random() * 3000),
										pathtmp(lis.get(1)));
							} else {
								for (int i = 1; i < lis.size(); i++) {
									print += lis.get(i) + "\n";
								}
							}
							texte.setText(print);
						}
					} else if (lis.get(0).equals("cd")) {
						Thread cd = new Thread(new CD(
								(int) (Math.random() * 3000)));
						cd.start();
						pause(7);
						cd.stop();

					} else if (lis.get(0).equals("touch") && lis.size() >= 2) {
						for (int i = 1; i < lis.size(); i++) {
							try {
								(new File(path + "/" + lis.get(i)))
										.createNewFile();
							} catch (IOException e) {
								// TODO Auto-generated catch block
								e.printStackTrace();
								texte.setText("Une erreure s est produite");
							}
						}
					} else if (lis.get(0).equals("mkdir") && lis.size() >= 2) {
						for (int i = 1; i < lis.size(); i++) {
							(new File(path + "/" + lis.get(i))).mkdir();
						}
					} else if ((lis.get(0).equals("delete")
							|| lis.get(0).equals("rmdir") || lis.get(0).equals(
							"rm"))
							&& lis.size() >= 2) {
						for (int i = 1; i < lis.size(); i++) {
							(new File(path + "/" + lis.get(i))).delete();
						}

					} else if (lis.get(0).equals("cat") && lis.size() >= 2) {
						if(lis.size()==2){
							
						}
						for (int i = 1; i < lis.size(); i++) {
							if (!(new File(path + "/" + lis.get(i)))
									.isDirectory())
								cat(path/*pathtmp(lis.get(1))*/ + "/" + lis.get(i));
							else
								texte.setText("Error !ceci est un dossier !");
						}
					} else if (lis.get(0).equals("echo")) {
						if (lis.size() >= 4) {
							if (lis.get(2).equals(">")) {
								System.out.println(path + "/" + lis.get(3));
								ecrire(path + "/" + lis.get(3), lis.get(1));
							}
						}
					} else if (lis.get(0).equals("internet")) {
						String tmpp = "";
						if (lis.size() == 2)
							tmpp = lis.get(1);
						else
							tmpp = "https://google.fr";
						Desktop desktop = null;
						java.net.URI url;
						try {
							url = new java.net.URI(tmpp);
							if (Desktop.isDesktopSupported()) {
								desktop = Desktop.getDesktop();
								desktop.browse(url);

							}
						} catch (Exception ex) {
							System.out.println(ex.getMessage());
							texte.setText(ex.getMessage());
						}
					} else if (lis.get(0).equals("mvim") && lis.size() == 2) {

						texte.setEditable(true);
						for (int i = 1; i < lis.size(); i++) {
							if (!(new File(path + "/" + lis.get(i)))
									.isDirectory())
								cat(path + "/" + lis.get(i));
							else
								texte.setText("Error !ceci est un dossier !");
						}
					} else if (lis.get(0).equals("compteJusqua")
							&& lis.size() >= 2) {
						Thread e = new Thread(new Compte(10,10,"%d\n"));
						e.start();
						// tester si l argument

					} else if (lis.get(0).equals("man")) {
						texte.setText("~Infos~\n\ncd path\nls path \ncat path\ntouch path\nmkdir path \nrm |rmdir|delete path \npwd\necho * >path\n"
								+ "internet https://*\nexit\nclear\nDefault commands on ubuntu if commands not found");
					}else if(lis.get(0).equals("matrix")){
					  Appli tw = new Appli();

                // Set the window to 55% opaque (45% translucent).
                                             tw.setOpacity(0.70f);

                // Display the window.
                                                     tw.setVisible(true);
					} 
					else {

						exe(lis);
					}
				}
				jtf.setText("");

				index = history.size();
				// texte.setText(print);
				lis = new ArrayList<String>();
			}

			// Touche F1 pour l'auto completion
			if (arg0.getKeyCode() == 112) {
				courant();
			}
			if (arg0.getKeyCode() == KeyEvent.VK_DOWN) {
				if (index + 1 <= history.size() - 1) {
					index++;
					jtf.setText(history.get(index));
				}
			}
			if (arg0.getKeyCode() == KeyEvent.VK_UP) {
				if (index - 1 >= 0) {
					index--;
					jtf.setText(history.get(index));
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

	public void ecrire(String nomFic, String texte) {
		// on va chercher le chemin et le nom du fichier et on me tout ca dans
		// un String
		String adressedufichier = nomFic;

		// on met try si jamais il y a une exception
		try {
			/**
			 * BufferedWriter a besoin d un FileWriter, les 2 vont ensemble, on
			 * donne comme argument le nom du fichier true signifie qu on ajoute
			 * dans le fichier (append), on ne marque pas par dessus
			 */
			FileWriter fw = new FileWriter(adressedufichier, true);

			// le BufferedWriter output auquel on donne comme argument le
			// FileWriter fw cree juste au dessus
			BufferedWriter output = new BufferedWriter(fw);

			// on marque dans le fichier ou plutot dans le BufferedWriter qui
			// sert comme un tampon(stream)
			output.write(texte);
			// on peut utiliser plusieurs fois methode write

			output.flush();
			// ensuite flush envoie dans le fichier, ne pas oublier cette
			// methode pour le BufferedWriter

			// output.close();
			// et on le ferme
			System.out.println("fichier cr");
		} catch (IOException ioe) {
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}

	}

	// Gestion simple du cas de cd
	public void nbrecul(String s) {
		String tmp = "";
		if (lis.get(0).equals("cd")) {
			if (s.equals("..")) {
				path = path.substring(0, indiceCoupe());
			}
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '/' && tmp.equals("..")) {
					if (indiceCoupe() < path.length()) {
						try {
							path = path.substring(0, indiceCoupe());
						} catch (Exception ep) {
							texte.setText("Action impossible monsieur !");
						}
						tmp = "";
					} else
						return;
				} else if (s.charAt(i) == '/' && tmp != "") {
					if ((new File(path + "/" + tmp)).isDirectory()
							|| new File(path + "/" + tmp).exists()) {
						path = path + "/" + tmp;
						tmp = "";
					} else {
						texte.setText("il ne s agit pas d un repertoire !");
					}
				} else
					tmp += s.charAt(i);
			}
		}
	}

	String aRetour = path;

	// parse une expression et renvoie la chainemais ne change pas path
	public String pathtmp(String s) {
		// args = path
		// Variable garbage
		String tmp = "";

		if (s.equals("..")) {
			aRetour = aRetour.substring(0, indiceCoupe());
		}
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '/' && tmp.equals("..")) {
				aRetour = aRetour.substring(0, indiceCoupe2());
				tmp = "";
			} else if (s.charAt(i) == '/' && tmp != "") {
				if ((new File(aRetour + "/" + tmp)).isDirectory()) {
					aRetour = aRetour + "/" + tmp;
					tmp = "";
				}
			} else
				tmp += s.charAt(i);
		}
		String tmp2 = aRetour;
		aRetour = path;
		return tmp2;
	}

	public void cat(String ss) {
		String chaine = "";
		String fichier = ss;
		try {
			InputStream ips = new FileInputStream(fichier);
			InputStreamReader ipsr = new InputStreamReader(ips);
			BufferedReader br = new BufferedReader(ipsr);
			String ligne;
			while ((ligne = br.readLine()) != null) {
				chaine += ligne + "\n";
				// pause(30);
				// texte.setText(chaine);
			}
			br.close();
		} catch (Exception e) {
			System.out.println(e.toString());
			texte.setText(e.toString());
			return;
		}
		texte.setText(chaine);
	}

	public void echo(String nomFic, String texte) {

		String adressedufichier = System.getProperty("user.dir") + "/" + nomFic;
		try {

			FileWriter fw = new FileWriter(adressedufichier, true);

			BufferedWriter output = new BufferedWriter(fw);

			output.write(texte);

			output.flush();

			System.out.println("fichier cr");
		} catch (IOException ioe) {
			System.out.print("Erreur : ");
			ioe.printStackTrace();
		}
	}

	public void exe(ArrayList<String> lis) {
		Runtime runtime = Runtime.getRuntime();
		Process p = null;
		String[] tab = new String[lis.size()];
		for (int i = 1; i < tab.length; i++) {
			tab[i] = lis.get(i);
		}
		tab[0] = lis.get(0);
		if (tab.length >= 2)
			tab[1] = path + "/" + tab[1];

		try {
			runtime = Runtime.getRuntime();
			p = runtime.exec(tab);
		} catch (Exception e) {
			texte.setText("Commande introuvable sur le systeme ubuntu");
			System.out.println(e.getMessage());
		}
	}

	public static void main(String[] args) {
		// Determine if the GraphicsDevice supports translucency.
		GraphicsEnvironment ge = GraphicsEnvironment
				.getLocalGraphicsEnvironment();
		GraphicsDevice gd = ge.getDefaultScreenDevice();

		// If translucent windows aren't supported, exit.
		if (!gd.isWindowTranslucencySupported(TRANSLUCENT)) {
			System.err.println("Translucency is not supported");
			System.exit(0);
		}

		JFrame.setDefaultLookAndFeelDecorated(true);

		// Create the GUI on the event-dispatching thread
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				Shell tw = new Shell();

				// Set the window to 55% opaque (45% translucent).
				tw.setOpacity(0.75f);

				// Display the window.
				tw.setVisible(true);
			}
		});
	}
}
