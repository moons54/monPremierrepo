package application;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.awt.Font;
import javax.swing.UIManager;
//import org.eclipse.swt.SWT;
import ocrpro.analysedoc;
import ocrpro.fichesecteur;

import javax.swing.JFormattedTextField;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;
import javax.swing.border.TitledBorder;

import javax.swing.JTextArea;
import javax.swing.JCheckBox;
import javax.swing.JScrollPane;

import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Eerpm extends JInternalFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFormattedTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Eerpm frame = new Eerpm();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws FileNotFoundException 
	 * @throws Exception 
	 */
	public Eerpm() throws FileNotFoundException  {
		analysedoc obj = new analysedoc();
		//obj.traitementdoc();
			try {
				obj.recupkbis();
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			fichesecteur obj2 = new fichesecteur();
		
		setAutoscrolls(true);
		setMaximizable(true);
		//setMaximumSize();
		setResizable(true);
		setIconifiable(true);
		setClosable(true);
		setBounds(0, 0, 1265, 698);
		getContentPane().setLayout(new BoxLayout(getContentPane(), BoxLayout.X_AXIS));
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.window);
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbldatedoc = new JLabel("Date du document");
		lbldatedoc.setBounds(81, 20, 116, 23);
		lbldatedoc.setBackground(UIManager.getColor("Button.background"));
		panel.add(lbldatedoc);
		
		JFormattedTextField formattedTextField_8 = new JFormattedTextField(analysedoc.getListeformulaire().get("date du document").toString().replace("[", "").replace("[", ""));
		formattedTextField_8.setOpaque(true);
		formattedTextField_8.setBounds(232, 20, 336, 30);
		formattedTextField_8.setSelectionColor(Color.GRAY);
		formattedTextField_8.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_8.setFont(new Font("Palatino", Font.PLAIN, 13));
		formattedTextField_8.setColumns(10);
		formattedTextField_8.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		formattedTextField_8.setBackground(new Color(248, 248, 255));
		panel.add(formattedTextField_8);
		
		JLabel lblDocumentPersonneMorale = new JLabel("Document Personne Morale");
		lblDocumentPersonneMorale.setBounds(599, 21, 172, 16);
		panel.add(lblDocumentPersonneMorale);
		
		JLabel lblStatutComplet = new JLabel("Statut complet ");
		lblStatutComplet.setBounds(783, 32, 393, 16);
		lblStatutComplet.setBackground(new Color(240, 255, 255));
		panel.add(lblStatutComplet);
		
		JCheckBox chxstatut = new JCheckBox("");
		chxstatut.setBounds(1201, 29, 28, 23);
		panel.add(chxstatut);
		
		JLabel lblNouvelleRelation = new JLabel("Nom Personne Morale");
		lblNouvelleRelation.setBounds(60, 59, 137, 23);
		lblNouvelleRelation.setBackground(UIManager.getColor("Button.background"));
		panel.add(lblNouvelleRelation);
		
		textField = new JFormattedTextField(analysedoc.getListeformulaire().get("raison sociale").toString().replace("[","" ).replace("]", ""));
		textField.setOpaque(true);
		textField.setBounds(232, 59, 336, 30);
		textField.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		textField.setSelectionColor(Color.GRAY);
		textField.setFont(new Font("Palatino", Font.PLAIN, 13));
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBackground(new Color(248, 248, 255));
		panel.add(textField);
		textField.setColumns(10);
		
		JLabel lblCertifiConformeA = new JLabel("Certifié conforme à l'orginal");
		lblCertifiConformeA.setBounds(783, 60, 393, 16);
		lblCertifiConformeA.setBackground(new Color(240, 255, 255));
		panel.add(lblCertifiConformeA);
		
		JCheckBox chxstatutcertifie = new JCheckBox("");
		chxstatutcertifie.setBounds(1201, 57, 28, 23);
		panel.add(chxstatutcertifie);
		
		JLabel lblsiren = new JLabel("SIREN");
		lblsiren.setBounds(161, 94, 36, 30);
		lblsiren.setBackground(UIManager.getColor("Button.background"));
		panel.add(lblsiren);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(analysedoc.getListeformulaire().get("nimmatriculation").toString().replace("[", "").replaceAll("]", ""));
		formattedTextField.setOpaque(true);
		formattedTextField.setBounds(232, 94, 336, 33);
		formattedTextField.setSelectionColor(Color.GRAY);
		formattedTextField.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField.setFont(new Font("Palatino", Font.PLAIN, 13));
		formattedTextField.setColumns(10);
		formattedTextField.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		formattedTextField.setBackground(new Color(248, 248, 255));
		panel.add(formattedTextField);
		
		JLabel lblExtraitKbis = new JLabel("Extrait KBIS moins de 3 mois");
		lblExtraitKbis.setBounds(783, 88, 393, 16);
		lblExtraitKbis.setBackground(new Color(240, 255, 255));
		panel.add(lblExtraitKbis);
		
		JCheckBox chxextrait = new JCheckBox("");
		chxextrait.setBounds(1201, 85, 28, 23);
		panel.add(chxextrait);
		
		JLabel lblcapital = new JLabel("Capital Social");
		lblcapital.setBounds(112, 136, 85, 16);
		lblcapital.setBackground(UIManager.getColor("Button.background"));
		panel.add(lblcapital);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(analysedoc.getListeformulaire().get("capital sociale").toString().replace("[", "").replaceAll("]", ""));
		formattedTextField_1.setOpaque(true);
		formattedTextField_1.setBounds(232, 136, 336, 33);
		formattedTextField_1.setSelectionColor(Color.GRAY);
		formattedTextField_1.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_1.setFont(new Font("Palatino", Font.PLAIN, 13));
		formattedTextField_1.setColumns(10);
		formattedTextField_1.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		formattedTextField_1.setBackground(new Color(248, 248, 255));
		panel.add(formattedTextField_1);
		
		JLabel lblVerificationFibenmodule = new JLabel(" FIBEN (module 27) sauf si creation");
		lblVerificationFibenmodule.setBounds(783, 116, 393, 16);
		lblVerificationFibenmodule.setBackground(new Color(240, 255, 255));
		panel.add(lblVerificationFibenmodule);
		
		JCheckBox chxfiben = new JCheckBox("");
		chxfiben.setBounds(1201, 113, 28, 23);
		panel.add(chxfiben);
		
		JLabel lblFccDeLa = new JLabel("FCC de la Personne Morale sauf si creation");
		lblFccDeLa.setBounds(783, 144, 393, 16);
		lblFccDeLa.setBackground(new Color(240, 255, 255));
		panel.add(lblFccDeLa);
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setBounds(1201, 141, 28, 23);
		panel.add(checkBox);
		
		JLabel lblgerant = new JLabel("Dirigeant(s)");
		lblgerant.setBounds(124, 178, 73, 16);
		lblgerant.setBackground(UIManager.getColor("Button.background"));
		panel.add(lblgerant);
		
		JTextArea dirigeant = new JTextArea(analysedoc.getListeformulaire().get("Gérant").toString().replace("[", "").replace("]", ""));
		dirigeant.setBounds(0, 178, 336, 85);
		dirigeant.setLineWrap(true);
		dirigeant.setWrapStyleWord(true);
		dirigeant.setSelectionColor(Color.GRAY);
		dirigeant.setFont(new Font("Palatino", Font.PLAIN, 13));
		dirigeant.setColumns(10);
		dirigeant.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		dirigeant.setBackground(new Color(248, 248, 255));

		JScrollPane scrollPane = new JScrollPane(dirigeant); 
		
		scrollPane.setBounds(232, 176, 336	, 85);
		panel.add(scrollPane);
		
		//panel.add(dirigeant);
		JLabel lblConventionDeCompte = new JLabel("Convention de compte signé par les representants");
		lblConventionDeCompte.setBounds(783, 176, 393, 16);
		lblConventionDeCompte.setBackground(new Color(240, 255, 255));
		lblConventionDeCompte.setToolTipText("help");
		panel.add(lblConventionDeCompte);
		
		JCheckBox chxcompte = new JCheckBox("");
		chxcompte.setBounds(1201, 172, 28, 23);
		panel.add(chxcompte);
		
		JLabel lblAutocertificationFiscalSignee = new JLabel("Auto-certification fiscal signee par les representants");
		lblAutocertificationFiscalSignee.setBounds(783, 207, 393, 16);
		lblAutocertificationFiscalSignee.setBackground(new Color(240, 255, 255));
		panel.add(lblAutocertificationFiscalSignee);
		
		JCheckBox chxear = new JCheckBox("");
		chxear.setBounds(1201, 204, 28, 23);
		panel.add(chxear);
		
		JLabel lblProcurationSigne = new JLabel("Conformitée des procurations");
		lblProcurationSigne.setBounds(783, 237, 393, 16);
		lblProcurationSigne.setBackground(new Color(240, 255, 255));
		lblProcurationSigne.setToolTipText("Conformité des signatures et des mentions obligatoires ( mandant et mandataires)");
		panel.add(lblProcurationSigne);
		
		JCheckBox chxprocuration = new JCheckBox("");
		chxprocuration.setBounds(1201, 234, 28, 23);
		panel.add(chxprocuration);
		
		JLabel lbladresse = new JLabel("Adresse siege sociale");
		lbladresse.setBounds(62, 273, 135, 20);
		lbladresse.setBackground(UIManager.getColor("Button.background"));
		panel.add(lbladresse);
		
		JFormattedTextField formattedTextField_3 = new JFormattedTextField(analysedoc.getListeformulaire().get("adresse du siege").toString().replace("[", "").replace("]", ""));
		formattedTextField_3.setOpaque(true);
		formattedTextField_3.setBounds(232, 273, 336, 35);
		formattedTextField_3.setSelectionColor(Color.GRAY);
		formattedTextField_3.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_3.setFont(new Font("Palatino", Font.PLAIN, 13));
		formattedTextField_3.setColumns(10);
		formattedTextField_3.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		formattedTextField_3.setBackground(new Color(248, 248, 255));
		panel.add(formattedTextField_3);
		
		JLabel lblDocumentBeneficiaireEffectif = new JLabel("Document personnes liés ");
		lblDocumentBeneficiaireEffectif.setBounds(599, 251, 164, 16);
		lblDocumentBeneficiaireEffectif.setToolTipText("concerne beneficiaire effectif , dirigeant règlementaire, associés à 25 % et plus et personne(s) habilité(s) a faire mouvementer le compte");
		panel.add(lblDocumentBeneficiaireEffectif);
		
		JLabel lblactivites = new JLabel("Activités");
		lblactivites.setBounds(142, 336, 55, 33);
		lblactivites.setBackground(UIManager.getColor("Button.background"));
		panel.add(lblactivites);
		
		JTextArea activites = new JTextArea(analysedoc.getListeformulaire().get("activites").toString().replace("[", "").replace("]", ""));
		activites.setBounds(0, 336, 336, 84);
		activites.setWrapStyleWord(true);
		activites.setLineWrap(true);
		activites.setSelectionColor(Color.GRAY);
		activites.setFont(new Font("Palatino", Font.PLAIN, 13));
		activites.setColumns(10);
		activites.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		activites.setBackground(new Color(248, 248, 255));
		//panel.add(activites);
JScrollPane scrollPane1 = new JScrollPane(activites); 
		
		scrollPane1.setBounds(230, 340, 336	, 84);
		panel.add(scrollPane1);
		
		JLabel lblJustificatifDidentit = new JLabel("justificatif d'identité ");
		lblJustificatifDidentit.setBounds(783, 283, 132, 16);
		panel.add(lblJustificatifDidentit);
		
		JCheckBox chxidentite = new JCheckBox("");
		chxidentite.setBounds(1201, 280, 28, 23);
		panel.add(chxidentite);
		
		JLabel lbldatecreation = new JLabel("Date de Création");
		lbldatecreation.setBounds(92, 436, 105, 23);
		lbldatecreation.setBackground(UIManager.getColor("Button.background"));
		panel.add(lbldatecreation);
		
		JFormattedTextField formattedTextField_5 = new JFormattedTextField(analysedoc.getListeformulaire().get("date de création").toString().replace("[", "").replace("]", ""));
		formattedTextField_5.setOpaque(true);
		formattedTextField_5.setBounds(232, 436, 336, 35);
		formattedTextField_5.setSelectionColor(Color.GRAY);
		formattedTextField_5.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_5.setFont(new Font("Palatino", Font.PLAIN, 13));
		formattedTextField_5.setColumns(10);
		formattedTextField_5.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		formattedTextField_5.setBackground(new Color(248, 248, 255));
		panel.add(formattedTextField_5);
		
		JLabel lblCreationDansLe = new JLabel("création dans le SI");
		lblCreationDansLe.setBounds(783, 316, 115, 16);
		panel.add(lblCreationDansLe);
		
		JCheckBox checkBox_1 = new JCheckBox("");
		checkBox_1.setBounds(1201, 313, 28, 23);
		panel.add(checkBox_1);
		
		JLabel lblInterrogationFccDu = new JLabel("Interrogation FCC du representant");
		lblInterrogationFccDu.setBounds(783, 344, 214, 16);
		panel.add(lblInterrogationFccDu);
		
		JCheckBox chxfccpp = new JCheckBox("");
		chxfccpp.setBounds(1201, 341, 28, 23);
		panel.add(chxfccpp);
		
		JLabel lbladresseatablissement = new JLabel("Adresse établissement");
		lbladresseatablissement.setBounds(57, 479, 142, 20);
		lbladresseatablissement.setBackground(UIManager.getColor("Button.background"));
		panel.add(lbladresseatablissement);
		
		JFormattedTextField formattedTextField_6 = new JFormattedTextField(analysedoc.getListeformulaire().get("adresse établissement").toString().replace("[", "").replace("]", ""));
		formattedTextField_6.setOpaque(true);
		formattedTextField_6.setBounds(232, 479, 336, 36);
		formattedTextField_6.setSelectionColor(Color.GRAY);
		formattedTextField_6.setHorizontalAlignment(SwingConstants.RIGHT);
		formattedTextField_6.setFont(new Font("Palatino", Font.PLAIN, 13));
		formattedTextField_6.setColumns(10);
		formattedTextField_6.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		formattedTextField_6.setBackground(new Color(248, 248, 255));
		panel.add(formattedTextField_6);
		
		JLabel lblFiabilisationDesDonnes = new JLabel("Fiabilisation des données");
		lblFiabilisationDesDonnes.setBounds(599, 354, 160, 16);
		panel.add(lblFiabilisationDesDonnes);
		
		JLabel label = new JLabel("Activités Etablissement");
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setBounds(60, 560, 147, 63);
		label.setBackground(UIManager.getColor("Button.background"));
		label.setFont(new Font("Lucida Grande", Font.PLAIN, 13));
		panel.add(label);
		
		JTextArea activiteseta = new JTextArea(analysedoc.getListeformulaire().get("activites établissement").toString().replace("[", "").replace("]", ""));
		activiteseta.setBounds(232, 540, 336, 86);
		activiteseta.setLineWrap(true);
		activiteseta.setWrapStyleWord(true);
		activiteseta.setSelectionColor(Color.GRAY);
		activiteseta.setFont(new Font("Palatino", Font.PLAIN, 13));
		activiteseta.setColumns(10);
		activiteseta.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		activiteseta.setBackground(new Color(248, 248, 255));
		//panel.add(activiteseta);
JScrollPane scrollPane2 = new JScrollPane(activiteseta); 
		
		scrollPane2.setBounds(232, 540, 336	, 86);
		panel.add(scrollPane2);
		
		JLabel lblSaisieDuNumro = new JLabel("Saisie du numéro SIREN et code activité economique");
		lblSaisieDuNumro.setBounds(783, 388, 329, 16);
		panel.add(lblSaisieDuNumro);
		
		JCheckBox chxnaf = new JCheckBox("");
		chxnaf.setBounds(1201, 381, 28, 23);
		panel.add(chxnaf);
		
		JLabel lblSaisieDesCoordonnes = new JLabel("Saisie des coordonnées telephonique + email du client de le SI");
		lblSaisieDesCoordonnes.setBounds(783, 419, 393, 16);
		panel.add(lblSaisieDesCoordonnes);
		
		JCheckBox chxcoherencemail = new JCheckBox("");
		chxcoherencemail.setBounds(1201, 416, 28, 23);
		panel.add(chxcoherencemail);
		
		JLabel lblCohrenceDeLadresse = new JLabel("Cohérence de l'adresse kbis et du SI");
		lblCohrenceDeLadresse.setBounds(783, 447, 226, 16);
		panel.add(lblCohrenceDeLadresse);
		
		JCheckBox chxcoherencekbis = new JCheckBox("");
		chxcoherencekbis.setBounds(1201, 444, 28, 23);
		panel.add(chxcoherencekbis);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(new Color(248, 248, 255));
		lblNewLabel.setBorder(new TitledBorder(null, "", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		lblNewLabel.setBounds(578, 20, 657, 485);
		panel.add(lblNewLabel);
		
		
		JComboBox<String> comboBox = new JComboBox<String>();
		comboBox.setBounds(580, 538, 649, 23);
	//	comboBox.addItem(analysedoc.getListeformulaire().get("Gérant"));
	//	comboBox.add
		//comboBox.add(obj.getDirigeant(),null );
		panel.add(comboBox);
		
		JComboBox<String> comboBox_1 = new JComboBox<String>();
		comboBox_1.setOpaque(true);
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//comboBox_1.;
				if (comboBox_1.getSelectedItem().toString().startsWith(" E"))
				{
					//comboBox_1.addActionListener(this);
					System.out.println("valide");
					getForeground();
					comboBox_1.setBackground(Color.red);
				}
				else 
				{
					getForeground();
					comboBox_1.setBackground(Color.GRAY);
				}
			}
		});
		comboBox_1.setBounds(580, 584, 649, 23);
		//obj2.recherchenaf();
		 FileReader naf = new FileReader("/Users/aurelienmimouni/Downloads/docinput/fichesecto/naf.txt");
		 // naf.createNewFile("/Users/aurelienmimouni/Downloads/docinput/fichesecto/secto2016.pdf");
		//naf.read();
		//System.out.println(naff.readLine().la);
		 String thisLine = null;
	    //  ocrpro.fichesecteur.getTextt();
	      
	      try {
	      
	         // open input stream test.txt for reading purpose.
	          BufferedReader naff = new BufferedReader(naf);
		
	         while ((thisLine = naff.readLine()) != null)
	           // System.out.println(thisLine);
	        	 //if(!Pattern.matches("\r", thisLine)){
	        	// if(thisLine.contains(" "))
	        	// if(!Pattern.matches("\ ", thisLine));
	        	ocrpro.fichesecteur.getTextt().add(thisLine.trim());
	        	//System.out.println(thisLine.toString().replaceAll("\\s+", ""));
	      //   comboBox_1.addItem(thisLine.trim());
	        	// obj2.getTextt().add(thisLine.trim());
	        	 System.out.println(fichesecteur.getTextt());
	        // }       
	      } catch(Exception e) {
	         e.printStackTrace();
	      }
	      System.out.println("test de sortie" + thisLine);
		//System.out.println(naff.toString().in);
		//comboBox_1.addItem(obj2.getTextt());
	      
	     int p = 0;
	     for ( p=0;p<fichesecteur.getTextt().size();p++){
	      while ( fichesecteur.getTextt().get(p).isEmpty()){
	    	p++; 
	      }
	      comboBox_1.addItem(fichesecteur.getTextt().get(p).trim().replace(",", "").replace("[", "").replace("]", ""));
	      p++;}
		//for (int k=0;k<obj2.getTextt().size();k++){
			//comboBox_1.addItem(obj2.getTextt().subList(k, k+1).toString().replace(is empty, Is empty ).replace("]", "")+"   "+k );
			//comboBox_1.addItem(thisLine.toString().subSequence(k, k+1)+"   "+k );
			
	//	}
		
		panel.add(comboBox_1);
		if (comboBox_1.getSelectedItem().toString().startsWith("56"))
		{
			System.out.println("valide");
		}
		for (int j=0;j<analysedoc.getListeformulaire().get("Gérant").size();j++)
		{	
		
		
			
		
	comboBox.addItem(analysedoc.getListeformulaire().get("Gérant").subList(j,j+ 1).toString().replace("[", "").replace("]", "") );
	
		
		
		
		}
		}
	}

	

