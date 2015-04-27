package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ObrisiKursGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblSifra;
	private JTextField textField;
	private JLabel lblNaziv;
	private JTextField textField_1;
	private JLabel lblProdajniKurs;
	private JTextField textField_2;
	private JLabel lblKupovniKurs;
	private JTextField textField_3;
	private JLabel lblSrednjiKurs;
	private JTextField textField_4;
	private JLabel lblSkraceniNaziv;
	private JTextField textField_5;
	private JCheckBox chckbxZaistaObrisi;
	private JButton btnObrisi;
	private JButton btnOdustani;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ObrisiKursGUI frame = new ObrisiKursGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ObrisiKursGUI() {
		setTitle("Obrisi kurs");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 368, 280);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblSifra());
		contentPane.add(getTextField());
		contentPane.add(getLblNaziv());
		contentPane.add(getTextField_1());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField_2());
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField_3());
		contentPane.add(getLblSrednjiKurs());
		contentPane.add(getTextField_4());
		contentPane.add(getLblSkraceniNaziv());
		contentPane.add(getTextField_5());
		contentPane.add(getChckbxZaistaObrisi());
		contentPane.add(getBtnObrisi());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblSifra() {
		if (lblSifra == null) {
			lblSifra = new JLabel("Sifra");
			lblSifra.setBounds(10, 11, 46, 14);
		}
		return lblSifra;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setEditable(false);
			textField.setBounds(10, 36, 131, 20);
			textField.setColumns(10);
		}
		return textField;
	}
	private JLabel getLblNaziv() {
		if (lblNaziv == null) {
			lblNaziv = new JLabel("Naziv");
			lblNaziv.setBounds(195, 11, 46, 14);
		}
		return lblNaziv;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(195, 36, 131, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(10, 67, 88, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setEditable(false);
			textField_2.setBounds(10, 92, 131, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(195, 67, 93, 14);
		}
		return lblKupovniKurs;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setEditable(false);
			textField_3.setBounds(195, 92, 131, 20);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JLabel getLblSrednjiKurs() {
		if (lblSrednjiKurs == null) {
			lblSrednjiKurs = new JLabel("Srednji kurs");
			lblSrednjiKurs.setBounds(10, 123, 88, 14);
		}
		return lblSrednjiKurs;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setEditable(false);
			textField_4.setBounds(10, 148, 131, 20);
			textField_4.setColumns(10);
		}
		return textField_4;
	}
	private JLabel getLblSkraceniNaziv() {
		if (lblSkraceniNaziv == null) {
			lblSkraceniNaziv = new JLabel("Skraceni naziv");
			lblSkraceniNaziv.setBounds(195, 123, 93, 14);
		}
		return lblSkraceniNaziv;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setEditable(false);
			textField_5.setBounds(195, 148, 131, 20);
			textField_5.setColumns(10);
		}
		return textField_5;
	}
	private JCheckBox getChckbxZaistaObrisi() {
		if (chckbxZaistaObrisi == null) {
			chckbxZaistaObrisi = new JCheckBox("Zaista obrisi kurs");
			chckbxZaistaObrisi.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					if(chckbxZaistaObrisi.isSelected())
						btnObrisi.setEnabled(true);
					else btnObrisi.setEnabled(false);
				}
			});
			chckbxZaistaObrisi.setBounds(10, 175, 131, 23);
		}
		
		return chckbxZaistaObrisi;
	}
	private JButton getBtnObrisi() {
		if (btnObrisi == null) {
			btnObrisi = new JButton("Obrisi");
			btnObrisi.setEnabled(false);
			btnObrisi.setBounds(10, 205, 131, 23);
		}
		
		return btnObrisi;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(195, 205, 131, 23);
		}
		return btnOdustani;
	}
}
