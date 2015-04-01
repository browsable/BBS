package project2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSplitPane;
import javax.swing.JRadioButton;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Panel;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JCheckBox;
import javax.swing.UIManager;
import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

public class main extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					main frame = new main();
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
	public main() {
		setTitle("BBS-Bread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmOpen = new JMenuItem("Open");
		mnFile.add(mntmOpen);
		
		JMenuItem mntmSave = new JMenuItem("Save");
		mnFile.add(mntmSave);
		
		JMenu mnEdit = new JMenu("Edit");
		menuBar.add(mnEdit);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mnEdit.add(mntmBack);
		
		JMenu mnHelp = new JMenu("Help");
		menuBar.add(mnHelp);
		
		JMenuItem mntmAbout = new JMenuItem("about...");
		mnHelp.add(mntmAbout);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(UIManager.getBorder("CheckBox.border"));
		panel.setBounds(12, 10, 137, 326);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JRadioButton rdbtnOr = new JRadioButton("7432 OR");
		rdbtnOr.setBounds(8, 66, 125, 30);
		panel.add(rdbtnOr);
		
		JRadioButton rdbtnNot = new JRadioButton("7404 NOT");
		rdbtnNot.setBounds(8, 6, 125, 30);
		panel.add(rdbtnNot);
		
		JRadioButton rdbtnAnd = new JRadioButton("7408 AND");
		rdbtnAnd.setBounds(8, 36, 125, 30);
		panel.add(rdbtnAnd);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setForeground(Color.RED);
		panel_1.setBounds(161, 10, 711, 406);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 228, 196));
		panel_2.setBounds(141, 42, 446, 307);
		panel_1.add(panel_2);
		
		JRadioButton rdbtnRed = new JRadioButton("RED");
		rdbtnRed.setBounds(8, 6, 55, 23);
		panel_1.add(rdbtnRed);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Black");
		rdbtnNewRadioButton.setBounds(67, 6, 70, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnWhite = new JRadioButton("White");
		rdbtnWhite.setBounds(141, 6, 70, 23);
		panel_1.add(rdbtnWhite);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(12, 464, 860, 67);
		contentPane.add(panel_3);
	}
}
