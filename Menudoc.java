package windows;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.border.BevelBorder;
import javax.swing.border.SoftBevelBorder;

//import application.Listesoc;

import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JDesktopPane;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;

public class Menudoc {

	private JFrame frmappliefa;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menudoc window = new Menudoc();
					window.frmappliefa.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Menudoc() {
		try {
			for (LookAndFeelInfo info : UIManager.getInstalledLookAndFeels()){
				if ("CDE".equals(info.getName())){
					UIManager.setLookAndFeel(info.getClassName());
					break;
					
					
				}
			}
		} catch(Exception e){
			
		}
		initialize();
		
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmappliefa = new JFrame();
		frmappliefa.setBounds(50, 50, 1200, 800);
		frmappliefa.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		final JDesktopPane desktopPane = new JDesktopPane();
		desktopPane.setOpaque(false);
		desktopPane.setInheritsPopupMenu(true);
		desktopPane.setBorder(new SoftBevelBorder(BevelBorder.RAISED, null, null, null, null));
	
		frmappliefa.getContentPane().add(desktopPane, BorderLayout.CENTER);
		desktopPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("/Users/aurelienmimouni/eclipse/java-neon/Eclipse.app/Contents/MacOS/wk1/GdocEFA/imageefa31.png"));
		lblNewLabel.setBounds(395, 266, 441, 299);
		desktopPane.add(lblNewLabel);
		
		JMenuBar menuBar = new JMenuBar();
		
		frmappliefa.setJMenuBar(menuBar);
		
		JMenu mnGestionDesOuvrages = new JMenu("Gestion des ouvrages");
		menuBar.add(mnGestionDesOuvrages);
		
		JMenu mnMneu = new JMenu("Ajout d'un ouvrage");
		mnMneu.setIcon(new ImageIcon("/Users/aurelienmimouni/eclipse/java-neon/Eclipse.app/Contents/MacOS/wk1/GdocEFA/file.png"));
		
		mnGestionDesOuvrages.add(mnMneu);

		JMenuItem mntmKids = new JMenuItem("Kids");
		mntmKids.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fenouvragekids frame2 = new Fenouvragekids();
				desktopPane.add(frame2);
				frame2.setVisible(true);
			}
		});
		mnMneu.add(mntmKids);
		
		JMenuItem mntmDocEfa = new JMenuItem("Doc EFA");
		mntmDocEfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fenacc frame3 = new Fenacc();
				desktopPane.add(frame3);
				frame3.setVisible(true);
			}
		});
		mnMneu.add(mntmDocEfa);
		
		JMenuItem mntmAuteur = new JMenuItem("Adulte");
		mntmAuteur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Fenouvrageadulte frame1 = new Fenouvrageadulte();
				desktopPane.add(frame1);
				frame1.setVisible(true);
			}
		});
		mnMneu.add(mntmAuteur);
		
		JMenu mnGestionDuStock = new JMenu("Gestion du Stock");
		menuBar.add(mnGestionDuStock);
		
		JMenuItem mntmLivresAchatvente = new JMenuItem("Livres Achat/Vente");
		mntmLivresAchatvente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Achatventeouvrages frame3 = new Achatventeouvrages();
				desktopPane.add(frame3);
				frame3.setVisible(true);
			}
		});
		mnGestionDuStock.add(mntmLivresAchatvente);
		
		JMenuItem mntmRevuesAchatventeEfa = new JMenuItem("Revues Achat/Vente EFA");
		mntmRevuesAchatventeEfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Achatventelivretefa frame4 = new Achatventelivretefa();
				desktopPane.add(frame4);
				frame4.setVisible(true);
			}
		});
		mnGestionDuStock.add(mntmRevuesAchatventeEfa);
		
		JMenu mnEtatsDuStock = new JMenu("Etats du Stock");
		menuBar.add(mnEtatsDuStock);
		
		JMenuItem mntmStock = new JMenuItem("Stock");
		mntmStock.setFont(new Font("Dialog", Font.BOLD, 13));
		mntmStock.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etatstocklivret frame5 = new etatstocklivret();
				desktopPane.add(frame5);
				frame5.setVisible(true);
			}
		});
		mnEtatsDuStock.add(mntmStock);
		
		JMenuItem mntmMesOuvragesA = new JMenuItem("Les Ouvrages à suivre");
		mntmMesOuvragesA.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				etatstocklivretprefere frame6 = new etatstocklivretprefere();
				desktopPane.add(frame6);
				frame6.setVisible(true);
			}
		});
		mnEtatsDuStock.add(mntmMesOuvragesA);
		
		
	}
}
