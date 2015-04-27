package menjacnica.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;

import java.awt.Toolkit;

import javax.swing.JMenuItem;
import javax.swing.KeyStroke;

import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;

import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;
import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.border.TitledBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.File;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MenjacnicaGUI extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private static JTextArea textArea;
	private static JScrollPane scrollPane_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MenjacnicaGUI frame = new MenjacnicaGUI();
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
	public MenjacnicaGUI() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				izlazak();
			}
		});
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(MenjacnicaGUI.class.getResource("/resources/theletterm_m012.jpg")));
		setTitle("Menjacnica");
		setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		setBounds(100, 100, 650, 477);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		
		
		
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));
		
		
		JScrollPane scrollPane = new JScrollPane();
		contentPane.add(scrollPane, BorderLayout.CENTER);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
				{null, null, null, null, null, null},
			},
			new String[] {
				"\u0160ifra", "Skra\u0107eni naziv", "Prodajni", "Srednji", "Kupovni", "Naziv"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(85);
		table.getColumnModel().getColumn(1).setPreferredWidth(85);
		table.getColumnModel().getColumn(2).setPreferredWidth(85);
		table.getColumnModel().getColumn(3).setPreferredWidth(85);
		table.getColumnModel().getColumn(4).setPreferredWidth(85);
		table.getColumnModel().getColumn(5).setPreferredWidth(85);
		scrollPane.setViewportView(table);
		
		JPopupMenu popupMenu = new JPopupMenu();
		addPopup(table, popupMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Dodaj kurs");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dodajK();
			}
		});
		popupMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmObrisiKurs = new JMenuItem("Obrisi kurs");
		mntmObrisiKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				obrisiK();
			}
		});
		popupMenu.add(mntmObrisiKurs);
		
		JMenuItem mntmIzvrsiZamenu = new JMenuItem("Izvrsi zamenu");
		mntmIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				izvrsiZ();
			}
		});
		popupMenu.add(mntmIzvrsiZamenu);
		
		//JScrollPane scrollPane_1 = new JScrollPane();
		//scrollPane_1.setPreferredSize(new Dimension(2, 66));
		//scrollPane_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		contentPane.add(getScrollPane_1(), BorderLayout.SOUTH);
		
		//final JTextArea textArea = new JTextArea();
		//textArea.setWrapStyleWord(true);
		//textArea.setLineWrap(true);
		scrollPane_1.setViewportView(getTextArea());
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Open");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fc = new JFileChooser();
				int rv = fc.showOpenDialog(contentPane);
				if(rv == JFileChooser.APPROVE_OPTION){
					File file = fc.getSelectedFile();
					getTextArea().append("\n"+"Ucitan fajl: "+file.getAbsolutePath());
				}
			}
		});
		mntmNewMenuItem.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/directory.gif")));
		mntmNewMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, InputEvent.CTRL_MASK));
		mnFile.add(mntmNewMenuItem);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				JFileChooser fc = new JFileChooser();
				int rv = fc.showSaveDialog(contentPane);
				if(rv== JFileChooser.APPROVE_OPTION){
					File file = fc.getSelectedFile();
					getTextArea().append("\n"+"Sacuvan fajl: "+file.getAbsolutePath());
				}
			}
		});
		mntmSave.setIcon(new ImageIcon(MenjacnicaGUI.class.getResource("/javax/swing/plaf/metal/icons/ocean/floppy.gif")));
		mntmSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_MASK));
		mnFile.add(mntmSave);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				izlazak();
			}
		});
		mntmExit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, InputEvent.ALT_MASK));
		mnFile.add(mntmExit);
		
		JMenu mnEdit = new JMenu("Help");
		menuBar.add(mnEdit);
		
		JMenuItem mntmAbout = new JMenuItem("About");
		mntmAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(contentPane, "Author: Petar Jelenkovic 105/13", "About",JOptionPane.INFORMATION_MESSAGE);
						
			}
		});
		mnEdit.add(mntmAbout);
		
		
		JPanel panel = new JPanel();
		panel.setPreferredSize(new Dimension(130, 10));
		contentPane.add(panel, BorderLayout.EAST);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JButton btnDodajKurs = new JButton("Dodaj kurs");
		btnDodajKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dodajK();
				
			}
		});
		btnDodajKurs.setPreferredSize(new Dimension(120, 23));
		panel.add(btnDodajKurs);
		
		JButton btnObrisiKurs = new JButton("Obrisi kurs");
		btnObrisiKurs.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				obrisiK();
			}
		});
		btnObrisiKurs.setPreferredSize(new Dimension(120, 23));
		panel.add(btnObrisiKurs);
		
		JButton btnIzvrsiZamenu = new JButton("Izvrsi zamenu");
		btnIzvrsiZamenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				izvrsiZ();
			}
		});
		btnIzvrsiZamenu.setPreferredSize(new Dimension(120, 23));
		panel.add(btnIzvrsiZamenu);
	}

	private static void addPopup(Component component, final JPopupMenu popup) {
		component.addMouseListener(new MouseAdapter() {
			public void mousePressed(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			public void mouseReleased(MouseEvent e) {
				if (e.isPopupTrigger()) {
					showMenu(e);
				}
			}
			private void showMenu(MouseEvent e) {
				popup.show(e.getComponent(), e.getX(), e.getY());
			}
		});
	}
	
	private  void izlazak(){
		int a = JOptionPane.showConfirmDialog(contentPane, "Da li zelite da izadjete iz programa?", "Upozorenje", JOptionPane.YES_NO_CANCEL_OPTION);
		if(a == JOptionPane.YES_OPTION){
			System.exit(0);
		}
	}
	
	private void dodajK(){
		DodajKursGUI dk = new DodajKursGUI();
		dk.setVisible(true);
	}
	
	private void obrisiK(){
		ObrisiKursGUI ok = new ObrisiKursGUI();
		ok.setVisible(true);
	}
	
	private static JTextArea getTextArea(){
		if(textArea == null) {
			textArea = new JTextArea();
			textArea.setWrapStyleWord(true);
			textArea.setLineWrap(true);
			scrollPane_1.setViewportView(textArea);
		}
		return textArea;
	}
	
	public static void naKraj(String cx){
		getTextArea().append("\n"+cx);
	}
	
	private JScrollPane getScrollPane_1(){
		if(scrollPane_1 == null){
			scrollPane_1 = new JScrollPane();
			scrollPane_1.setPreferredSize(new Dimension(2, 66));
			scrollPane_1.setBorder(new TitledBorder(null, "STATUS", TitledBorder.LEADING, TitledBorder.TOP, null, null));
			
		}
		return scrollPane_1;
	}
	
	private void izvrsiZ(){
		IzvrsiZamenuGUI iz = new IzvrsiZamenuGUI();
		iz.setVisible(true);
	}
	
	
}
