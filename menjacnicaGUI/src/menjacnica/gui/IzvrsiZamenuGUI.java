package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JSlider;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ButtonGroup;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.ChangeEvent;

public class IzvrsiZamenuGUI extends JFrame {

	private JPanel contentPane;
	private JLabel lblKupovniKurs;
	private JTextField textField;
	private JLabel lblValuta;
	private JComboBox comboBox;
	private JLabel lblProdajniKurs;
	private JTextField textField_1;
	private JLabel lblIznos;
	private JTextField textField_2;
	private JLabel lblVrstaTransakcije;
	private JRadioButton rdbtnKupovna;
	private JRadioButton rdbtnProdajna;
	private JSlider slider;
	private JButton btnIzvrsiZamenu;
	private JButton btnOdustani;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IzvrsiZamenuGUI frame = new IzvrsiZamenuGUI();
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
	public IzvrsiZamenuGUI() {
		setResizable(false);
		setTitle("Izvrsi zamenu");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 421, 316);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblKupovniKurs());
		contentPane.add(getTextField());
		contentPane.add(getLblValuta());
		contentPane.add(getComboBox());
		contentPane.add(getLblProdajniKurs());
		contentPane.add(getTextField_1());
		contentPane.add(getLblIznos());
		contentPane.add(getTextField_2());
		contentPane.add(getLblVrstaTransakcije());
		contentPane.add(getRdbtnKupovna());
		contentPane.add(getRdbtnProdajna());
		contentPane.add(getSlider());
		contentPane.add(getBtnIzvrsiZamenu());
		contentPane.add(getBtnOdustani());
	}

	private JLabel getLblKupovniKurs() {
		if (lblKupovniKurs == null) {
			lblKupovniKurs = new JLabel("Kupovni kurs");
			lblKupovniKurs.setBounds(10, 11, 97, 14);
		}
		return lblKupovniKurs;
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
	private JLabel getLblValuta() {
		if (lblValuta == null) {
			lblValuta = new JLabel("Valuta");
			lblValuta.setBounds(171, 11, 46, 14);
		}
		return lblValuta;
	}
	private JComboBox getComboBox() {
		if (comboBox == null) {
			comboBox = new JComboBox();
			comboBox.setModel(new DefaultComboBoxModel(new String[] {"EUR", "CHF", "USD"}));
			comboBox.setBounds(171, 36, 58, 20);
		}
		return comboBox;
	}
	private JLabel getLblProdajniKurs() {
		if (lblProdajniKurs == null) {
			lblProdajniKurs = new JLabel("Prodajni kurs");
			lblProdajniKurs.setBounds(263, 11, 90, 14);
		}
		return lblProdajniKurs;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(263, 36, 131, 20);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblIznos() {
		if (lblIznos == null) {
			lblIznos = new JLabel("Iznos");
			lblIznos.setBounds(10, 78, 46, 14);
		}
		return lblIznos;
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setBounds(10, 103, 160, 20);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JLabel getLblVrstaTransakcije() {
		if (lblVrstaTransakcije == null) {
			lblVrstaTransakcije = new JLabel("Vrsta transakcije");
			lblVrstaTransakcije.setBounds(195, 78, 131, 14);
		}
		return lblVrstaTransakcije;
	}
	private JRadioButton getRdbtnKupovna() {
		if (rdbtnKupovna == null) {
			rdbtnKupovna = new JRadioButton("Kupovina");
			rdbtnKupovna.setSelected(true);
			buttonGroup.add(rdbtnKupovna);
			rdbtnKupovna.setBounds(195, 102, 109, 23);
		}
		return rdbtnKupovna;
	}
	private JRadioButton getRdbtnProdajna() {
		if (rdbtnProdajna == null) {
			rdbtnProdajna = new JRadioButton("Prodaja");
			buttonGroup.add(rdbtnProdajna);
			rdbtnProdajna.setBounds(195, 128, 109, 23);
		}
		return rdbtnProdajna;
	}
	private JSlider getSlider() {
		if (slider == null) {
			slider = new JSlider();
			slider.addChangeListener(new ChangeListener() {
				public void stateChanged(ChangeEvent arg0) {
					
					getTextField_2().setText(Integer.toString(slider.getValue()));
				}
			});
			slider.setPaintLabels(true);
			slider.setMajorTickSpacing(10);
			slider.setMinorTickSpacing(5);
			slider.setPaintTicks(true);
			slider.setBounds(20, 171, 368, 45);
		}
		return slider;
	}
	private JButton getBtnIzvrsiZamenu() {
		if (btnIzvrsiZamenu == null) {
			btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
			btnIzvrsiZamenu.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					String x = "Izvrsena zamena = Valuta: "+getComboBox().getSelectedItem()+" Iznos: "+getTextField_2().getText()+" Tip: "+kojaJe();
					MenjacnicaGUI.naKraj(x);
				}
			});
			btnIzvrsiZamenu.setBounds(36, 227, 131, 23);
		}
		return btnIzvrsiZamenu;
	}
	private JButton getBtnOdustani() {
		if (btnOdustani == null) {
			btnOdustani = new JButton("Odustani");
			btnOdustani.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
					dispose();
				}
			});
			btnOdustani.setBounds(241, 227, 131, 23);
		}
		return btnOdustani;
	}
	private String kojaJe(){
		if(getRdbtnKupovna().isSelected()) return "Kupovina";
		else return "Prodaja";
	}
}
