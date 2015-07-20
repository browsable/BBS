package bbs;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.border.CompoundBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JTextPane;

public class Main extends JFrame implements MouseListener, MouseMotionListener {

	private Point p1 = new Point(0, 0);
	private Point p2 = new Point(0, 0);
	private boolean drawing;
	int i = 0;
	int Clickpoint = 0;
	int x[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
	int y[] = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,};
	int line = 0;
	int x1 = 0, x2 = 0, y1 = 0, y2 = 0;
	
	private JPanel contentPane;
	public JLabel label;
	public int flag;
	private ImageIcon img = null;
	private ButtonGroup radioGroup;
	JRadioButton rdbtnRed, rdbtnBlack, rdbtnWhite;
	Graphics2D g2d;
	private JPanel panel_5;
	private JButton button, button_1,button_2, button_3, button_4, button_5, button_6, button_7, button_8, button_9,
			button_10, button_11, button_12, button_13, button_14, button_15, button_16, button_17, button_18,
			button_19, button_20, button_21, button_22, button_23, button_24, button_25, button_26, button_27,
			button_28, button_29, button_30 /*, button_31, button_32, button_33, button_34, button_35, button_36,
			button_37, button_38, button_39, button_40, button_41, button_42, button_43, button_44, button_45,
			button_46, button_47, button_48, button_49, button_50, button_51, button_52, button_53, button_54,
			button_55, button_56, button_57, button_58, button_59, button_60, button_61, button_62, button_63,
			button_64, button_65, button_66, button_67, button_68, button_69, button_70*/;
	
	public JRadioButton getRdbtnRed() {
		return rdbtnRed;
	}

	public void setRdbtnRed(JRadioButton rdbtnRed) {
		this.rdbtnRed = rdbtnRed;
	}

	public JRadioButton getrdbtnBlack() {
		return rdbtnBlack;
	}

	public void setrdbtnBlack(JRadioButton rdbtnBlack) {
		this.rdbtnBlack = rdbtnBlack;
	}

	public JRadioButton getRdbtnWhite() {
		return rdbtnWhite;
	}

	public void setRdbtnWhite(JRadioButton rdbtnWhite) {
		this.rdbtnWhite = rdbtnWhite;
	}

	// button methods
	public void setButton(JButton button) {

		this.button = button;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton_1(JButton button_1) {

		this.button_1 = button_1;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public void setButton_2(JButton button_2) {

		this.button_2 = button_2;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public void setButton_3(JButton button_3) {

		this.button_3 = button_3;
	}

	public JButton getButton_3() {
		return button_3;
	}

	public void setButton_4(JButton button_4) {

		this.button_4 = button_4;
	}

	public JButton getButton_4() {
		return button_4;
	}

	public void setButton_5(JButton button_5) {

		this.button_5 = button_5;
	}

	public JButton getButton_5() {
		return button_5;
	}

	public void setButton_6(JButton button_6) {

		this.button_6 = button_6;
	}

	public JButton getButton_6() {
		return button_6;
	}

	public void setButton_7(JButton button_7) {

		this.button_7 = button_7;
	}

	public JButton getButton_7() {
		return button_7;
	}

	public void setButton_8(JButton button_8) {

		this.button_8 = button_8;
	}

	public JButton getButton_8() {
		return button_8;
	}

	public void setButton_9(JButton button_9) {

		this.button_9 = button_9;
	}

	public JButton getButton_9() {
		return button_9;
	}

	public void setButton_10(JButton button_10) {

		this.button_10 = button_10;
	}

	public JButton getButton_10() {
		return button_10;
	}

	public void setButton_11(JButton button_11) {

		this.button_11 = button_11;
	}

	public JButton getButton_11() {
		return button_11;
	}

	public void setButton_12(JButton button_12) {

		this.button_12 = button_12;
	}

	public JButton getButton_12() {
		return button_12;
	}

	public void setButton_13(JButton button_13) {

		this.button_13 = button_13;
	}

	public JButton getButton_13() {
		return button_13;
	}

	public void setButton_14(JButton button_14) {

		this.button_14 = button_14;
	}

	public JButton getButton_14() {
		return button_14;
	}

	public void setButton_15(JButton button_15) {

		this.button_15 = button_15;
	}

	public JButton getButton_15() {
		return button_15;
	}

	public void setButton_16(JButton button_16) {

		this.button_16 = button_16;
	}

	public JButton getButton_16() {
		return button_16;
	}

	public void setButton_17(JButton button_17) {

		this.button_17 = button_17;
	}

	public JButton getButton_17() {
		return button_17;
	}

	public void setButton_18(JButton button_18) {

		this.button_18 = button_18;
	}

	public JButton getButton_18() {
		return button_18;
	}

	public void setButton_19(JButton button_19) {

		this.button_19 = button_19;
	}

	public JButton getButton_19() {
		return button_19;
	}

	public void setButton_20(JButton button_20) {

		this.button_20 = button_20;
	}

	public JButton getButton_20() {
		return button_20;
	}

	public void setButton_21(JButton button_21) {

		this.button_21 = button_21;
	}

	public JButton getButton_21() {
		return button_21;
	}

	public void setButton_22(JButton button_22) {

		this.button_22 = button_22;
	}

	public JButton getButton_22() {
		return button_22;
	}

	public void setButton_23(JButton button_23) {

		this.button_23 = button_23;
	}

	public JButton getButton_23() {
		return button_23;
	}

	public void setButton_24(JButton button_24) {

		this.button_24 = button_24;
	}

	public JButton getButton_24() {
		return button_24;
	}

	public void setButton_25(JButton button_25) {

		this.button_25 = button_25;
	}

	public JButton getButton_25() {
		return button_25;
	}

	public void setButton_26(JButton button_26) {

		this.button_26 = button_26;
	}

	public JButton getButton_26() {
		return button_26;
	}
	
	public void setButton_27(JButton button_27) {

		this.button_27 = button_27;
	}

	public JButton getButton_27() {
		return button_27;
	}

	public void setButton_28(JButton button_28) {

		this.button_28 = button_28;
	}

	public JButton getButton_28() {
		return button_28;
	}

	public void setButton_29(JButton button_29) {

		this.button_29 = button_29;
	}

	public JButton getButton_29() {
		return button_29;
	}

	public void setButton_30(JButton button_30) {
		this.button_30 = button_30;
	}

	public JButton getButton_30() {
		return button_30;
	}
//--------------------------------------------------------------------------
/*	
	public void setButton_31(JButton button_31) {
		this.button_31 = button_31;
	}

	public JButton getButton_31() {
		return button_31;
	}

	public void setButton_32(JButton button_32) {
		this.button_32 = button_32;
	}

	public JButton getButton_32() {
		return button_32;
	}

	public void setButton_33(JButton button_33) {
		this.button_33 = button_33;
	}

	public JButton getButton_33() {
		return button_33;
	}

	public void setButton_34(JButton button_34) {
		this.button_34 = button_34;
	}

	public JButton getButton_34() {
		return button_34;
	}

	public void setButton_35(JButton button_35) {
		this.button_35 = button_35;
	}

	public JButton getButton_35() {
		return button_35;
	}

	public void setButton_36(JButton button_36) {
		this.button_36 = button_36;
	}

	public JButton getButton_36() {
		return button_36;
	}

	public void setButton_37(JButton button_37) {
		this.button_37 = button_37;
	}

	public JButton getButton_37() {
		return button_37;
	}

	public void setButton_38(JButton button_38) {
		this.button_38 = button_38;
	}

	public JButton getButton_38() {
		return button_38;
	}

	public void setButton_39(JButton button_39) {
		this.button_39 = button_39;
	}

	public JButton getButton_39() {
		return button_39;
	}

	public void setButton_40(JButton button_40) {
		this.button_40 = button_40;
	}

	public JButton getButton_40() {
		return button_40;
	}

	public void setButton_41(JButton button_41) {
		this.button_41 = button_41;
	}

	public JButton getButton_41() {
		return button_41;
	}

	public void setButton_42(JButton button_42) {
		this.button_42 = button_42;
	}

	public JButton getButton_42() {
		return button_42;
	}

	public void setButton_43(JButton button_43) {
		this.button_43 = button_43;
	}

	public JButton getButton_43() {
		return button_43;
	}

	public void setButton_44(JButton button_44) {
		this.button_44 = button_44;
	}

	public JButton getButton_44() {
		return button_44;
	}

	public void setButton_45(JButton button_45) {
		this.button_45 = button_45;
	}

	public JButton getButton_45() {
		return button_45;
	}

	public void setButton_46(JButton button_46) {
		this.button_46 = button_46;
	}

	public JButton getButton_46() {
		return button_46;
	}

	public void setButton_47(JButton button_47) {
		this.button_47 = button_47;
	}

	public JButton getButton_47() {
		return button_47;
	}

	public void setButton_48(JButton button_48) {
		this.button_48 = button_48;
	}

	public JButton getButton_48() {
		return button_48;
	}

	public void setButton_49(JButton button_49) {
		this.button_49 = button_49;
	}

	public JButton getButton_49() {
		return button_49;
	}

	public void setButton_50(JButton button_50) {
		this.button_50 = button_50;
	}

	public JButton getButton_50() {
		return button_50;
	}
*/
//--------------------------------------------------------------------------
	private JTextField textField;

	public static void main(String[] args) {

		Main application = new Main();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					new Main().display();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * <<<<<<< HEAD Create the frame. adlfkajsldfk ======= >>>>>>>
	 * refs/remotes/origin/master Create the frame.
	 */

	public Main() {
		setTitle("BBS-Bread");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setBounds(100, 100, 900, 600);
		label = new JLabel("No Mouse Event Captured", JLabel.CENTER);
		getContentPane().add(label);
		addMouseListener(this);
		addMouseMotionListener(this);
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
		panel.setBounds(12, 10, 137, 187);
		contentPane.add(panel);
		panel.setLayout(null);

		// flag
		JComboBox comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText((String) comboBox.getSelectedItem());
				if (comboBox.getSelectedItem() == "line-black") {
					System.out.println("1");
				} else if (comboBox.getSelectedItem() == "line-red") {
					System.out.println("2");
				} else if (comboBox.getSelectedItem() == "line-white") {
					System.out.println("3");
				} else if (comboBox.getSelectedItem() == "7404") {
					System.out.println("4");
				} else if (comboBox.getSelectedItem() == "led") {
					System.out.println("5");
				}
			}
		});
		comboBox.setBounds(12, 35, 113, 21);
		panel.add(comboBox);
		String[] jcs = new String[] { "select", "line-black", "line-red", "line-white", "7404", "led" };
		DefaultComboBoxModel comboModel;
		comboModel = new DefaultComboBoxModel(jcs);
		comboBox.setModel(comboModel);

		JLabel lblSelect = new JLabel("Select");
		lblSelect.setBounds(12, 10, 57, 15);
		panel.add(lblSelect);

		JPanel panel_4 = new JPanel();
		panel_4.setBorder(UIManager.getBorder("CheckBox.border"));
		panel_4.setBounds(12, 225, 137, 206);
		contentPane.add(panel_4);
		panel_4.setLayout(null);

		textField = new JTextField();
		textField.setBounds(12, 10, 116, 21);
		panel_4.add(textField);
		textField.setColumns(10);

		JTextPane textPane_1 = new JTextPane();
		textPane_1.setBounds(12, 88, 113, 108);
		panel_4.add(textPane_1);

		JLabel lblNewLabel = new JLabel("Value");
		lblNewLabel.setBounds(12, 61, 116, 15);
		panel_4.add(lblNewLabel);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setForeground(Color.RED);
		panel_1.setBounds(161, 10, 711, 421);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		JPanel panel_2 = new JPanel();
		panel_2.setBackground(new Color(255, 228, 196));
		panel_2.setBounds(12, 42, 687, 369);
		panel_2.setLayout(null);

		panel_1.add(panel_2);

		JButton btnHole = new JButton("hole");
		btnHole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHole.setBounds(19, 19, 21, 16);
		panel_2.add(btnHole);

		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(12, 464, 860, 67);
		contentPane.add(panel_3);
		panel_3.setLayout(null);

		JTextPane textPane_2 = new JTextPane();
		textPane_2.setBounds(448, 6, 400, 51);
		panel_3.add(textPane_2);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 6, 400, 51);
		panel_3.add(textPane);

		button = new JButton("hole");
		button.setBounds(52, 19, 21, 16);
		panel_2.add(button);

		button_1 = new JButton("hole");
		button_1.setBounds(85, 19, 21, 16);
		panel_2.add(button_1);

		button_2 = new JButton("hole");
		button_2.setBounds(118, 19, 21, 16);
		panel_2.add(button_2);

		button_3 = new JButton("hole");
		button_3.setBounds(151, 19, 21, 16);
		panel_2.add(button_3);

		button_4 = new JButton("hole");
		button_4.setBounds(184, 19, 21, 16);
		panel_2.add(button_4);

		button_5 = new JButton("hole");
		button_5.setBounds(217, 19, 21, 16);
		panel_2.add(button_5);

		button_6 = new JButton("hole");
		button_6.setBounds(250, 19, 21, 16);
		panel_2.add(button_6);

		button_7 = new JButton("hole");
		button_7.setBounds(283, 19, 21, 16);
		panel_2.add(button_7);

		button_8 = new JButton("hole");
		button_8.setBounds(316, 19, 21, 16);
		panel_2.add(button_8);

		button_9 = new JButton("hole");
		button_9.setBounds(349, 19, 21, 16);
		panel_2.add(button_9);

		button_10 = new JButton("hole");
		button_10.setBounds(382, 19, 21, 16);
		panel_2.add(button_10);

		button_11 = new JButton("hole");
		button_11.setBounds(415, 19, 21, 16);
		panel_2.add(button_11);

		button_12 = new JButton("hole");
		button_12.setBounds(448, 19, 21, 16);
		panel_2.add(button_12);

		button_13 = new JButton("hole");
		button_13.setBounds(85, 47, 21, 16);
		panel_2.add(button_13);

		button_14 = new JButton("hole");
		button_14.setBounds(118, 47, 21, 16);
		panel_2.add(button_14);

		button_15 = new JButton("hole");
		button_15.setBounds(151, 47, 21, 16);
		panel_2.add(button_15);

		button_16 = new JButton("hole");
		button_16.setBounds(184, 47, 21, 16);
		panel_2.add(button_16);

		button_17 = new JButton("hole");
		button_17.setBounds(217, 47, 21, 16);
		panel_2.add(button_17);

		button_18 = new JButton("hole");
		button_18.setBounds(250, 47, 21, 16);
		panel_2.add(button_18);

		button_19 = new JButton("hole");
		button_19.setBounds(283, 47, 21, 16);
		panel_2.add(button_19);

		button_20 = new JButton("hole");
		button_20.setBounds(316, 47, 21, 16);
		panel_2.add(button_20);

		button_21 = new JButton("hole");
		button_21.setBounds(349, 47, 21, 16);
		panel_2.add(button_21);

		button_22 = new JButton("hole");
		button_22.setBounds(382, 47, 21, 16);
		panel_2.add(button_22);

		button_23 = new JButton("hole");
		button_23.setBounds(19, 85, 21, 16);
		panel_2.add(button_23);

		button_24 = new JButton("hole");
		/*
		button_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		*/
		button_24.setBounds(52, 85, 21, 16);
		panel_2.add(button_24);

		button_25 = new JButton("hole");
		button_25.setBounds(85, 85, 21, 16);
		panel_2.add(button_25);

		button_26 = new JButton("hole");
		button_26.setBounds(118, 85, 21, 16);
		panel_2.add(button_26);

		button_27 = new JButton("hole");
		button_27.setBounds(151, 85, 21, 16);
		panel_2.add(button_27);

		button_28 = new JButton("hole");
		button_28.setBounds(184, 85, 21, 16);
		panel_2.add(button_28);

		button_29 = new JButton("hole");
		button_29.setBounds(217, 85, 21, 16);
		panel_2.add(button_29);

		button_30 = new JButton("hole");
		button_30.setBounds(250, 85, 21, 16);
		panel_2.add(button_30);
//--------------------------------------------------------------------------
/*
		button_31 = new JButton("hole");
		button_31.setBounds(283, 85, 21, 16);
		panel_2.add(button_31);

		button_32 = new JButton("hole");
		button_32.setBounds(316, 85, 21, 16);
		panel_2.add(button_32);

		button_33 = new JButton("hole");
		button_33.setBounds(349, 85, 21, 16);
		panel_2.add(button_33);
		
		button_34 = new JButton("hole");
		button_34.setBounds(382, 85, 21, 16);
		panel_2.add(button_34);

		button_35 = new JButton("hole");
		button_35.setBounds(19, 47, 21, 16);
		panel_2.add(button_35);
		
		button_36 = new JButton("hole");
		button_36.setBounds(415, 47, 21, 16);
		panel_2.add(button_36);

		button_37 = new JButton("hole");
		button_37.setBounds(415, 85, 21, 16);
		panel_2.add(button_37);

		button_38 = new JButton("hole");
		button_38.setBounds(19, 108, 21, 16);
		panel_2.add(button_38);

		button_39 = new JButton("hole");
		button_39.setBounds(52, 108, 21, 16);
		panel_2.add(button_39);

		button_40 = new JButton("hole");
		button_40.setBounds(85, 108, 21, 16);
		panel_2.add(button_40);

		button_41 = new JButton("hole");
		button_41.setBounds(118, 108, 21, 16);
		panel_2.add(button_41);

		button_42 = new JButton("hole");
		button_42.setBounds(151, 108, 21, 16);
		panel_2.add(button_42);

		button_43 = new JButton("hole");
		button_43.setBounds(184, 108, 21, 16);
		panel_2.add(button_43);

		button_44 = new JButton("hole");
		button_44.setBounds(217, 108, 21, 16);
		panel_2.add(button_44);

		button_45 = new JButton("hole");
		button_45.setBounds(250, 108, 21, 16);
		panel_2.add(button_45);

		button_46 = new JButton("hole");
		button_46.setBounds(283, 108, 21, 16);
		panel_2.add(button_46);

		button_47 = new JButton("hole");
		button_47.setBounds(316, 108, 21, 16);
		panel_2.add(button_47);

		button_48 = new JButton("hole");
		button_48.setBounds(349, 108, 21, 16);
		panel_2.add(button_48);

		button_49 = new JButton("hole");
		button_49.setBounds(382, 108, 21, 16);
		panel_2.add(button_49);

		button_50 = new JButton("hole");
		button_50.setBounds(415, 108, 21, 16);
		panel_2.add(button_50);

		button_51 = new JButton("hole");
		button_51.setBounds(19, 129, 21, 16);
		panel_2.add(button_51);

		button_52 = new JButton("hole");
		button_52.setBounds(52, 129, 21, 16);
		panel_2.add(button_52);

		button_53 = new JButton("hole");
		button_53.setBounds(85, 129, 21, 16);
		panel_2.add(button_53);

		button_54 = new JButton("hole");
		button_54.setBounds(118, 129, 21, 16);
		panel_2.add(button_54);

		button_55 = new JButton("hole");
		button_55.setBounds(151, 129, 21, 16);
		panel_2.add(button_55);

		button_56 = new JButton("hole");
		button_56.setBounds(184, 129, 21, 16);
		panel_2.add(button_56);

		button_57 = new JButton("hole");
		button_57.setBounds(217, 129, 21, 16);
		panel_2.add(button_57);

		button_58 = new JButton("hole");
		button_58.setBounds(250, 129, 21, 16);
		panel_2.add(button_58);

		button_59 = new JButton("hole");
		button_59.setBounds(283, 129, 21, 16);
		panel_2.add(button_59);

		button_60 = new JButton("hole");
		button_60.setBounds(316, 129, 21, 16);
		panel_2.add(button_60);

		button_61 = new JButton("hole");
		button_61.setBounds(349, 129, 21, 16);
		panel_2.add(button_61);

		button_62 = new JButton("hole");
		button_62.setBounds(382, 129, 21, 16);
		panel_2.add(button_62);

		button_63 = new JButton("hole");
		button_63.setBounds(415, 129, 21, 16);
		panel_2.add(button_63);

		button_64 = new JButton("hole");
		button_64.setBounds(19, 150, 21, 16);
		panel_2.add(button_64);

		button_65 = new JButton("hole");
		button_65.setBounds(52, 150, 21, 16);
		panel_2.add(button_65);

		button_66 = new JButton("hole");
		button_66.setBounds(85, 150, 21, 16);
		panel_2.add(button_66);

		button_67 = new JButton("hole");
		button_67.setBounds(118, 150, 21, 16);
		panel_2.add(button_67);

		button_68 = new JButton("hole");
		button_68.setBounds(151, 150, 21, 16);
		panel_2.add(button_68);

		button_69 = new JButton("hole");
		button_69.setBounds(184, 150, 21, 16);
		panel_2.add(button_69);

		button_70 = new JButton("hole");
		button_70.setBounds(217, 150, 21, 16);
		panel_2.add(button_70);

		JButton button_71 = new JButton("hole");
		button_71.setBounds(250, 150, 21, 16);
		panel_2.add(button_71);

		JButton button_72 = new JButton("hole");
		button_72.setBounds(283, 150, 21, 16);
		panel_2.add(button_72);

		JButton button_73 = new JButton("hole");
		button_73.setBounds(316, 150, 21, 16);
		panel_2.add(button_73);

		JButton button_74 = new JButton("hole");
		button_74.setBounds(349, 150, 21, 16);
		panel_2.add(button_74);

		JButton button_75 = new JButton("hole");
		button_75.setBounds(382, 150, 21, 16);
		panel_2.add(button_75);

		JButton button_76 = new JButton("hole");
		button_76.setBounds(415, 150, 21, 16);
		panel_2.add(button_76);

		JButton button_77 = new JButton("hole");
		button_77.setBounds(19, 172, 21, 16);
		panel_2.add(button_77);

		JButton button_78 = new JButton("hole");
		button_78.setBounds(52, 172, 21, 16);
		panel_2.add(button_78);

		JButton button_79 = new JButton("hole");
		button_79.setBounds(85, 172, 21, 16);
		panel_2.add(button_79);

		JButton button_80 = new JButton("hole");
		button_80.setBounds(118, 172, 21, 16);
		panel_2.add(button_80);

		JButton button_81 = new JButton("hole");
		button_81.setBounds(151, 172, 21, 16);
		panel_2.add(button_81);

		JButton button_82 = new JButton("hole");
		button_82.setBounds(184, 172, 21, 16);
		panel_2.add(button_82);

		JButton button_83 = new JButton("hole");
		button_83.setBounds(217, 172, 21, 16);
		panel_2.add(button_83);

		JButton button_84 = new JButton("hole");
		button_84.setBounds(250, 172, 21, 16);
		panel_2.add(button_84);

		JButton button_85 = new JButton("hole");
		button_85.setBounds(283, 172, 21, 16);
		panel_2.add(button_85);

		JButton button_86 = new JButton("hole");
		button_86.setBounds(316, 172, 21, 16);
		panel_2.add(button_86);

		JButton button_87 = new JButton("hole");
		button_87.setBounds(349, 172, 21, 16);
		panel_2.add(button_87);

		JButton button_88 = new JButton("hole");
		button_88.setBounds(382, 172, 21, 16);
		panel_2.add(button_88);

		JButton button_89 = new JButton("hole");
		button_89.setBounds(415, 172, 21, 16);
		panel_2.add(button_89);

		JButton button_90 = new JButton("hole");
		button_90.setBounds(19, 194, 21, 16);
		panel_2.add(button_90);

		JButton button_91 = new JButton("hole");
		button_91.setBounds(52, 194, 21, 16);
		panel_2.add(button_91);

		JButton button_92 = new JButton("hole");
		button_92.setBounds(85, 194, 21, 16);
		panel_2.add(button_92);

		JButton button_93 = new JButton("hole");
		button_93.setBounds(118, 194, 21, 16);
		panel_2.add(button_93);

		JButton button_94 = new JButton("hole");
		button_94.setBounds(151, 194, 21, 16);
		panel_2.add(button_94);

		JButton button_95 = new JButton("hole");
		button_95.setBounds(184, 194, 21, 16);
		panel_2.add(button_95);

		JButton button_96 = new JButton("hole");
		button_96.setBounds(217, 194, 21, 16);
		panel_2.add(button_96);

		JButton button_97 = new JButton("hole");
		button_97.setBounds(250, 194, 21, 16);
		panel_2.add(button_97);

		JButton button_98 = new JButton("hole");
		button_98.setBounds(283, 194, 21, 16);
		panel_2.add(button_98);

		JButton button_99 = new JButton("hole");
		button_99.setBounds(316, 194, 21, 16);
		panel_2.add(button_99);

		JButton button_100 = new JButton("hole");
		button_100.setBounds(349, 194, 21, 16);
		panel_2.add(button_100);

		JButton button_101 = new JButton("hole");
		button_101.setBounds(382, 194, 21, 16);
		panel_2.add(button_101);

		JButton button_102 = new JButton("hole");
		button_102.setBounds(415, 194, 21, 16);
		panel_2.add(button_102);

		JButton button_103 = new JButton("hole");
		button_103.setBounds(19, 217, 21, 16);
		panel_2.add(button_103);

		JButton button_104 = new JButton("hole");
		button_104.setBounds(52, 217, 21, 16);
		panel_2.add(button_104);

		JButton button_105 = new JButton("hole");
		button_105.setBounds(85, 217, 21, 16);
		panel_2.add(button_105);

		JButton button_106 = new JButton("hole");
		button_106.setBounds(118, 217, 21, 16);
		panel_2.add(button_106);

		JButton button_107 = new JButton("hole");
		button_107.setBounds(151, 217, 21, 16);
		panel_2.add(button_107);

		JButton button_108 = new JButton("hole");
		button_108.setBounds(184, 217, 21, 16);
		panel_2.add(button_108);

		JButton button_109 = new JButton("hole");
		button_109.setBounds(217, 217, 21, 16);
		panel_2.add(button_109);

		JButton button_110 = new JButton("hole");
		button_110.setBounds(250, 217, 21, 16);
		panel_2.add(button_110);

		JButton button_111 = new JButton("hole");
		button_111.setBounds(283, 217, 21, 16);
		panel_2.add(button_111);

		JButton button_112 = new JButton("hole");
		button_112.setBounds(316, 217, 21, 16);
		panel_2.add(button_112);

		JButton button_113 = new JButton("hole");
		button_113.setBounds(349, 217, 21, 16);
		panel_2.add(button_113);

		JButton button_114 = new JButton("hole");
		button_114.setBounds(382, 217, 21, 16);
		panel_2.add(button_114);

		JButton button_115 = new JButton("hole");
		button_115.setBounds(415, 217, 21, 16);
		panel_2.add(button_115);

		JButton button_116 = new JButton("hole");
		button_116.setBounds(19, 243, 21, 16);
		panel_2.add(button_116);

		JButton button_117 = new JButton("hole");
		button_117.setBounds(52, 243, 21, 16);
		panel_2.add(button_117);

		JButton button_118 = new JButton("hole");
		button_118.setBounds(85, 243, 21, 16);
		panel_2.add(button_118);

		JButton button_119 = new JButton("hole");
		button_119.setBounds(118, 243, 21, 16);
		panel_2.add(button_119);

		JButton button_120 = new JButton("hole");
		button_120.setBounds(151, 243, 21, 16);
		panel_2.add(button_120);

		JButton button_121 = new JButton("hole");
		button_121.setBounds(184, 243, 21, 16);
		panel_2.add(button_121);

		JButton button_122 = new JButton("hole");
		button_122.setBounds(217, 243, 21, 16);
		panel_2.add(button_122);

		JButton button_123 = new JButton("hole");
		button_123.setBounds(250, 243, 21, 16);
		panel_2.add(button_123);

		JButton button_124 = new JButton("hole");
		button_124.setBounds(283, 243, 21, 16);
		panel_2.add(button_124);

		JButton button_125 = new JButton("hole");
		button_125.setBounds(316, 243, 21, 16);
		panel_2.add(button_125);

		JButton button_126 = new JButton("hole");
		button_126.setBounds(349, 243, 21, 16);
		panel_2.add(button_126);

		JButton button_127 = new JButton("hole");
		button_127.setBounds(382, 243, 21, 16);
		panel_2.add(button_127);

		JButton button_128 = new JButton("hole");
		button_128.setBounds(415, 243, 21, 16);
		panel_2.add(button_128);

		JButton button_129 = new JButton("hole");
		button_129.setBounds(19, 271, 21, 16);
		panel_2.add(button_129);

		JButton button_130 = new JButton("hole");
		button_130.setBounds(52, 271, 21, 16);
		panel_2.add(button_130);

		JButton button_131 = new JButton("hole");
		button_131.setBounds(85, 271, 21, 16);
		panel_2.add(button_131);

		JButton button_132 = new JButton("hole");
		button_132.setBounds(118, 271, 21, 16);
		panel_2.add(button_132);

		JButton button_133 = new JButton("hole");
		button_133.setBounds(151, 271, 21, 16);
		panel_2.add(button_133);

		JButton button_134 = new JButton("hole");
		button_134.setBounds(184, 271, 21, 16);
		panel_2.add(button_134);

		JButton button_135 = new JButton("hole");
		button_135.setBounds(217, 271, 21, 16);
		panel_2.add(button_135);

		JButton button_136 = new JButton("hole");
		button_136.setBounds(250, 271, 21, 16);
		panel_2.add(button_136);

		JButton button_137 = new JButton("hole");
		button_137.setBounds(283, 271, 21, 16);
		panel_2.add(button_137);

		JButton button_138 = new JButton("hole");
		button_138.setBounds(316, 271, 21, 16);
		panel_2.add(button_138);

		JButton button_139 = new JButton("hole");
		button_139.setBounds(349, 271, 21, 16);
		panel_2.add(button_139);

		JButton button_140 = new JButton("hole");
		button_140.setBounds(382, 271, 21, 16);
		panel_2.add(button_140);

		JButton button_141 = new JButton("hole");
		button_141.setBounds(415, 271, 21, 16);
		panel_2.add(button_141);

		JButton button_142 = new JButton("hole");
		button_142.setBounds(547, 19, 21, 16);
		panel_2.add(button_142);

		JButton button_143 = new JButton("hole");
		button_143.setBounds(547, 271, 21, 16);
		panel_2.add(button_143);

		JButton button_144 = new JButton("hole");
		button_144.setBounds(547, 243, 21, 16);
		panel_2.add(button_144);

		JButton button_145 = new JButton("hole");
		button_145.setBounds(547, 217, 21, 16);
		panel_2.add(button_145);

		JButton button_146 = new JButton("hole");
		button_146.setBounds(547, 194, 21, 16);
		panel_2.add(button_146);

		JButton button_147 = new JButton("hole");
		button_147.setBounds(547, 172, 21, 16);
		panel_2.add(button_147);

		JButton button_148 = new JButton("hole");
		button_148.setBounds(547, 150, 21, 16);
		panel_2.add(button_148);

		JButton button_149 = new JButton("hole");
		button_149.setBounds(547, 129, 21, 16);
		panel_2.add(button_149);

		JButton button_150 = new JButton("hole");
		button_150.setBounds(547, 108, 21, 16);
		panel_2.add(button_150);

		JButton button_151 = new JButton("hole");
		button_151.setBounds(547, 85, 21, 16);
		panel_2.add(button_151);

		JButton button_152 = new JButton("hole");
		button_152.setBounds(547, 47, 21, 16);
		panel_2.add(button_152);

		JButton button_153 = new JButton("hole");
		button_153.setBounds(514, 19, 21, 16);
		panel_2.add(button_153);

		JButton button_154 = new JButton("hole");
		button_154.setBounds(481, 19, 21, 16);
		panel_2.add(button_154);

		JButton button_155 = new JButton("hole");
		button_155.setBounds(52, 47, 21, 16);
		panel_2.add(button_155);

		JButton button_156 = new JButton("hole");
		button_156.setBounds(448, 47, 21, 16);
		panel_2.add(button_156);

		JButton button_157 = new JButton("hole");
		button_157.setBounds(481, 47, 21, 16);
		panel_2.add(button_157);

		JButton button_158 = new JButton("hole");
		button_158.setBounds(514, 47, 21, 16);
		panel_2.add(button_158);

		JButton button_159 = new JButton("hole");
		button_159.setBounds(514, 85, 21, 16);
		panel_2.add(button_159);

		JButton button_160 = new JButton("hole");
		button_160.setBounds(481, 85, 21, 16);
		panel_2.add(button_160);

		JButton button_161 = new JButton("hole");
		button_161.setBounds(448, 85, 21, 16);
		panel_2.add(button_161);

		JButton button_162 = new JButton("hole");
		button_162.setBounds(448, 108, 21, 16);
		panel_2.add(button_162);

		JButton button_163 = new JButton("hole");
		button_163.setBounds(481, 108, 21, 16);
		panel_2.add(button_163);

		JButton button_164 = new JButton("hole");
		button_164.setBounds(514, 108, 21, 16);
		panel_2.add(button_164);

		JButton button_165 = new JButton("hole");
		button_165.setBounds(514, 129, 21, 16);
		panel_2.add(button_165);

		JButton button_166 = new JButton("hole");
		button_166.setBounds(481, 129, 21, 16);
		panel_2.add(button_166);

		JButton button_167 = new JButton("hole");
		button_167.setBounds(448, 129, 21, 16);
		panel_2.add(button_167);

		JButton button_168 = new JButton("hole");
		button_168.setBounds(448, 150, 21, 16);
		panel_2.add(button_168);

		JButton button_169 = new JButton("hole");
		button_169.setBounds(481, 150, 21, 16);
		panel_2.add(button_169);

		JButton button_170 = new JButton("hole");
		button_170.setBounds(514, 150, 21, 16);
		panel_2.add(button_170);

		JButton button_171 = new JButton("hole");
		button_171.setBounds(514, 172, 21, 16);
		panel_2.add(button_171);

		JButton button_172 = new JButton("hole");
		button_172.setBounds(481, 172, 21, 16);
		panel_2.add(button_172);

		JButton button_173 = new JButton("hole");
		button_173.setBounds(448, 172, 21, 16);
		panel_2.add(button_173);

		JButton button_174 = new JButton("hole");
		button_174.setBounds(448, 194, 21, 16);
		panel_2.add(button_174);

		JButton button_175 = new JButton("hole");
		button_175.setBounds(448, 217, 21, 16);
		panel_2.add(button_175);

		JButton button_176 = new JButton("hole");
		button_176.setBounds(448, 243, 21, 16);
		panel_2.add(button_176);

		JButton button_177 = new JButton("hole");
		button_177.setBounds(448, 271, 21, 16);
		panel_2.add(button_177);

		JButton button_178 = new JButton("hole");
		button_178.setBounds(481, 271, 21, 16);
		panel_2.add(button_178);

		JButton button_179 = new JButton("hole");
		button_179.setBounds(481, 243, 21, 16);
		panel_2.add(button_179);

		JButton button_180 = new JButton("hole");
		button_180.setBounds(481, 217, 21, 16);
		panel_2.add(button_180);

		JButton button_181 = new JButton("hole");
		button_181.setBounds(481, 194, 21, 16);
		panel_2.add(button_181);

		JButton button_182 = new JButton("hole");
		button_182.setBounds(514, 194, 21, 16);
		panel_2.add(button_182);

		JButton button_183 = new JButton("hole");
		button_183.setBounds(514, 217, 21, 16);
		panel_2.add(button_183);

		JButton button_184 = new JButton("hole");
		button_184.setBounds(514, 243, 21, 16);
		panel_2.add(button_184);

		JButton button_185 = new JButton("hole");
		button_185.setBounds(514, 271, 21, 16);
		panel_2.add(button_185);

		JButton button_186 = new JButton("hole");
		button_186.setBounds(646, 271, 21, 16);
		panel_2.add(button_186);

		JButton button_187 = new JButton("hole");
		button_187.setBounds(646, 243, 21, 16);
		panel_2.add(button_187);

		JButton button_188 = new JButton("hole");
		button_188.setBounds(646, 217, 21, 16);
		panel_2.add(button_188);

		JButton button_189 = new JButton("hole");
		button_189.setBounds(646, 194, 21, 16);
		panel_2.add(button_189);

		JButton button_190 = new JButton("hole");
		button_190.setBounds(646, 172, 21, 16);
		panel_2.add(button_190);

		JButton button_191 = new JButton("hole");
		button_191.setBounds(646, 150, 21, 16);
		panel_2.add(button_191);

		JButton button_192 = new JButton("hole");
		button_192.setBounds(646, 129, 21, 16);
		panel_2.add(button_192);

		JButton button_193 = new JButton("hole");
		button_193.setBounds(646, 108, 21, 16);
		panel_2.add(button_193);

		JButton button_194 = new JButton("hole");
		button_194.setBounds(646, 85, 21, 16);
		panel_2.add(button_194);

		JButton button_195 = new JButton("hole");
		button_195.setBounds(646, 47, 21, 16);
		panel_2.add(button_195);

		JButton button_196 = new JButton("hole");
		button_196.setBounds(646, 19, 21, 16);
		panel_2.add(button_196);

		JButton button_197 = new JButton("hole");
		button_197.setBounds(613, 19, 21, 16);
		panel_2.add(button_197);

		JButton button_198 = new JButton("hole");
		button_198.setBounds(613, 47, 21, 16);
		panel_2.add(button_198);

		JButton button_199 = new JButton("hole");
		button_199.setBounds(580, 19, 21, 16);
		panel_2.add(button_199);

		JButton button_200 = new JButton("hole");
		button_200.setBounds(580, 47, 21, 16);
		panel_2.add(button_200);

		JButton button_201 = new JButton("hole");
		button_201.setBounds(580, 85, 21, 16);
		panel_2.add(button_201);

		JButton button_202 = new JButton("hole");
		button_202.setBounds(580, 108, 21, 16);
		panel_2.add(button_202);

		JButton button_203 = new JButton("hole");
		button_203.setBounds(580, 129, 21, 16);
		panel_2.add(button_203);

		JButton button_204 = new JButton("hole");
		button_204.setBounds(580, 150, 21, 16);
		panel_2.add(button_204);

		JButton button_205 = new JButton("hole");
		button_205.setBounds(580, 172, 21, 16);
		panel_2.add(button_205);

		JButton button_206 = new JButton("hole");
		button_206.setBounds(613, 85, 21, 16);
		panel_2.add(button_206);

		JButton button_207 = new JButton("hole");
		button_207.setBounds(613, 108, 21, 16);
		panel_2.add(button_207);

		JButton button_208 = new JButton("hole");
		button_208.setBounds(613, 129, 21, 16);
		panel_2.add(button_208);

		JButton button_209 = new JButton("hole");
		button_209.setBounds(613, 150, 21, 16);
		panel_2.add(button_209);

		JButton button_210 = new JButton("hole");
		button_210.setBounds(613, 172, 21, 16);
		panel_2.add(button_210);

		JButton button_211 = new JButton("hole");
		button_211.setBounds(613, 194, 21, 16);
		panel_2.add(button_211);

		JButton button_212 = new JButton("hole");
		button_212.setBounds(580, 194, 21, 16);
		panel_2.add(button_212);

		JButton button_213 = new JButton("hole");
		button_213.setBounds(580, 217, 21, 16);
		panel_2.add(button_213);

		JButton button_214 = new JButton("hole");
		button_214.setBounds(613, 217, 21, 16);
		panel_2.add(button_214);

		JButton button_215 = new JButton("hole");
		button_215.setBounds(613, 243, 21, 16);
		panel_2.add(button_215);

		JButton button_216 = new JButton("hole");
		button_216.setBounds(580, 243, 21, 16);
		panel_2.add(button_216);

		JButton button_217 = new JButton("hole");
		button_217.setBounds(580, 271, 21, 16);
		panel_2.add(button_217);

		JButton button_218 = new JButton("hole");
		button_218.setBounds(613, 271, 21, 16);
		panel_2.add(button_218);

		JButton button_219 = new JButton("hole");
		button_219.setBounds(646, 343, 21, 16);
		panel_2.add(button_219);

		JButton button_220 = new JButton("hole");
		button_220.setBounds(646, 315, 21, 16);
		panel_2.add(button_220);

		JButton button_221 = new JButton("hole");
		button_221.setBounds(613, 315, 21, 16);
		panel_2.add(button_221);

		JButton button_222 = new JButton("hole");
		button_222.setBounds(613, 343, 21, 16);
		panel_2.add(button_222);

		JButton button_223 = new JButton("hole");
		button_223.setBounds(580, 343, 21, 16);
		panel_2.add(button_223);

		JButton button_224 = new JButton("hole");
		button_224.setBounds(580, 315, 21, 16);
		panel_2.add(button_224);

		JButton button_225 = new JButton("hole");
		button_225.setBounds(547, 315, 21, 16);
		panel_2.add(button_225);

		JButton button_226 = new JButton("hole");
		button_226.setBounds(547, 343, 21, 16);
		panel_2.add(button_226);

		JButton button_227 = new JButton("hole");
		button_227.setBounds(514, 343, 21, 16);
		panel_2.add(button_227);

		JButton button_228 = new JButton("hole");
		button_228.setBounds(514, 315, 21, 16);
		panel_2.add(button_228);

		JButton button_229 = new JButton("hole");
		button_229.setBounds(481, 315, 21, 16);
		panel_2.add(button_229);

		JButton button_230 = new JButton("hole");
		button_230.setBounds(481, 343, 21, 16);
		panel_2.add(button_230);

		JButton button_231 = new JButton("hole");
		button_231.setBounds(448, 343, 21, 16);
		panel_2.add(button_231);

		JButton button_232 = new JButton("hole");
		button_232.setBounds(448, 315, 21, 16);
		panel_2.add(button_232);

		JButton button_233 = new JButton("hole");
		button_233.setBounds(415, 315, 21, 16);
		panel_2.add(button_233);

		JButton button_234 = new JButton("hole");
		button_234.setBounds(415, 343, 21, 16);
		panel_2.add(button_234);

		JButton button_235 = new JButton("hole");
		button_235.setBounds(382, 343, 21, 16);
		panel_2.add(button_235);

		JButton button_236 = new JButton("hole");
		button_236.setBounds(382, 315, 21, 16);
		panel_2.add(button_236);

		JButton button_237 = new JButton("hole");
		button_237.setBounds(349, 315, 21, 16);
		panel_2.add(button_237);

		JButton button_238 = new JButton("hole");
		button_238.setBounds(349, 343, 21, 16);
		panel_2.add(button_238);

		JButton button_239 = new JButton("hole");
		button_239.setBounds(316, 343, 21, 16);
		panel_2.add(button_239);

		JButton button_240 = new JButton("hole");
		button_240.setBounds(316, 315, 21, 16);
		panel_2.add(button_240);

		JButton button_241 = new JButton("hole");
		button_241.setBounds(283, 315, 21, 16);
		panel_2.add(button_241);

		JButton button_242 = new JButton("hole");
		button_242.setBounds(283, 343, 21, 16);
		panel_2.add(button_242);

		JButton button_243 = new JButton("hole");
		button_243.setBounds(250, 343, 21, 16);
		panel_2.add(button_243);

		JButton button_244 = new JButton("hole");
		button_244.setBounds(250, 315, 21, 16);
		panel_2.add(button_244);

		JButton button_245 = new JButton("hole");
		button_245.setBounds(217, 315, 21, 16);
		panel_2.add(button_245);

		JButton button_246 = new JButton("hole");
		button_246.setBounds(217, 343, 21, 16);
		panel_2.add(button_246);

		JButton button_247 = new JButton("hole");
		button_247.setBounds(184, 343, 21, 16);
		panel_2.add(button_247);

		JButton button_248 = new JButton("hole");
		button_248.setBounds(184, 315, 21, 16);
		panel_2.add(button_248);

		JButton button_249 = new JButton("hole");
		button_249.setBounds(151, 315, 21, 16);
		panel_2.add(button_249);

		JButton button_250 = new JButton("hole");
		button_250.setBounds(151, 343, 21, 16);
		panel_2.add(button_250);

		JButton button_251 = new JButton("hole");
		button_251.setBounds(118, 343, 21, 16);
		panel_2.add(button_251);

		JButton button_252 = new JButton("hole");
		button_252.setBounds(118, 315, 21, 16);
		panel_2.add(button_252);

		JButton button_253 = new JButton("hole");
		button_253.setBounds(85, 315, 21, 16);
		panel_2.add(button_253);

		JButton button_254 = new JButton("hole");
		button_254.setBounds(85, 343, 21, 16);
		panel_2.add(button_254);

		JButton button_255 = new JButton("hole");
		button_255.setBounds(52, 343, 21, 16);
		panel_2.add(button_255);

		JButton button_256 = new JButton("hole");
		button_256.setBounds(52, 315, 21, 16);
		panel_2.add(button_256);

		JButton button_257 = new JButton("hole");
		button_257.setBounds(19, 315, 21, 16);
		panel_2.add(button_257);

		JButton button_258 = new JButton("hole");
		button_258.setBounds(19, 343, 21, 16);
		panel_2.add(button_258);
*/
//--------------------------------------------------------------------------
		JPanel panel_5 = new JPanel() {
			@Override
			public void paint(Graphics g) {
				if(img != null) {
					// 이미지 그리기
					g.drawImage(img.getImage(), 0, 0, getWidth(), getHeight(), this);
				}
			}
		};
		panel_5.setBounds(52, 98, 252, 68);
		panel_2.add(panel_5);
		panel_5.setBackground(new Color(255, 228, 196));
//-----------------------------------------------------------------------------------------------------------------------
/*
		panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { btnHole, button, button_1, button_2,
				button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_35, button_155,
				button_154, button_153, button_142, button_199, button_197, button_196, button_11, button_12, button_13,
				button_14, button_15, button_16, button_17, button_18, button_19, button_20, button_21, button_22,
				button_36, button_156, button_157, button_158, button_152, button_200, button_198, button_195,
				button_23, button_24, button_25, button_26, button_27, button_28, button_29, button_30, button_31,
				button_32, button_33, button_34, button_37, button_161, button_160, button_159, button_151, button_201,
				button_206, button_194, button_38, button_39, button_40, button_41, button_42, button_43, button_44,
				button_45, button_46, button_47, button_48, button_49, button_50, button_162, button_163, button_164,
				button_150, button_202, button_207, button_193, button_51, button_52, button_53, button_54, button_55,
				button_56, button_57, button_58, button_59, button_60, button_61, button_62, button_63, button_167,
				button_166, button_165, button_149, button_203, button_208, button_192, button_64, button_65, button_66,
				button_67, button_68, button_69, button_70, button_71, button_72, button_73, button_74, button_75,
				button_76, button_168, button_169, button_170, button_148, button_204, button_209, button_191,
				button_77, button_78, button_79, button_80, button_81, button_82, button_83, button_84, button_85,
				button_86, button_87, button_88, button_89, button_173, button_172, button_171, button_147, button_205,
				button_210, button_190, button_90, button_91, button_92, button_93, button_94, button_95, button_96,
				button_97, button_98, button_99, button_100, button_101, button_102, button_174, button_181, button_182,
				button_146, button_212, button_211, button_189, button_103, button_104, button_105, button_106,
				button_107, button_108, button_109, button_110, button_111, button_112, button_113, button_114,
				button_115, button_175, button_180, button_183, button_145, button_213, button_214, button_188,
				button_116, button_117, button_118, button_119, button_120, button_121, button_122, button_123,
				button_124, button_125, button_126, button_127, button_128, button_176, button_179, button_184,
				button_144, button_216, button_215, button_187, button_129, button_130, button_131, button_132,
				button_133, button_134, button_135, button_136, button_137, button_138, button_139, button_140,
				button_141, button_177, button_178, button_185, button_143, button_217, button_218, button_186,
				button_257, button_256, button_253, button_252, button_249, button_248, button_245, button_244,
				button_241, button_240, button_237, button_236, button_233, button_232, button_229, button_228,
				button_225, button_224, button_221, button_220, button_258, button_255, button_254, button_251,
				button_250, button_247, button_246, button_243, button_242, button_239, button_238, button_235,
				button_234, button_231, button_230, button_227, button_226, button_223, button_222, button_219, panel_2,
				rdbtnRed, rdbtnBlack, rdbtnWhite }));
*/
//30 buttons
		panel_1.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { btnHole, button, button_1, button_2,
				button_3, button_4, button_5, button_6, button_7, button_8, button_9, button_10, button_11, button_12, 
				button_13, button_14, button_15, button_16, button_17, button_18, button_19, button_20, button_21,
				button_22, button_23, button_24, button_25, button_26, button_27, button_28, button_29, button_30,
				panel_2, rdbtnRed, rdbtnBlack, rdbtnWhite }));
/*	
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { menuBar, mnFile, mntmNew, mntmOpen,
				mntmSave, mnEdit, mntmBack, mnHelp, mntmAbout, contentPane, panel, comboBox, panel_4, textField,
				panel_1, panel_2, btnHole, button, button_1, button_2, button_3, button_4, button_5, button_6, button_7,
				button_8, button_9, button_10, button_11, button_12, button_13, button_14, button_15, button_16,
				button_17, button_18, button_19, button_20, button_21, button_22, button_23, button_24, button_25,
				button_26, button_27, button_28, button_29, button_30, button_31, button_32, button_33, button_34,
				button_35, button_36, button_37, button_38, button_39, button_40, button_41, button_42, button_43,
				button_44, button_45, button_46, button_47, button_48, button_49, button_50, button_51, button_52,
				button_53, button_54, button_55, button_56, button_57, button_58, button_59, button_60, button_61,
				button_62, button_63, button_64, button_65, button_66, button_67, button_68, button_69, button_70,
				button_71, button_72, button_73, button_74, button_75, button_76, button_77, button_78, button_79,
				button_80, button_81, button_82, button_83, button_84, button_85, button_86, button_87, button_88,
				button_89, button_90, button_91, button_92, button_93, button_94, button_95, button_96, button_97,
				button_98, button_99, button_100, button_101, button_102, button_103, button_104, button_105,
				button_106, button_107, button_108, button_109, button_110, button_111, button_112, button_113,
				button_114, button_115, button_116, button_117, button_118, button_119, button_120, button_121,
				button_122, button_123, button_124, button_125, button_126, button_127, button_128, button_129,
				button_130, button_131, button_132, button_133, button_134, button_135, button_136, button_137,
				button_138, button_139, button_140, button_141, button_142, button_143, button_144, button_145,
				button_146, button_147, button_148, button_149, button_150, button_151, button_152, button_153,
				button_154, button_155, button_156, button_157, button_158, button_159, button_160, button_161,
				button_162, button_163, button_164, button_165, button_166, button_167, button_168, button_169,
				button_170, button_171, button_172, button_173, button_174, button_175, button_176, button_177,
				button_178, button_179, button_180, button_181, button_182, button_183, button_184, button_185,
				button_186, button_187, button_188, button_189, button_190, button_191, button_192, button_193,
				button_194, button_195, button_196, button_197, button_198, button_199, button_200, button_201,
				button_202, button_203, button_204, button_205, button_206, button_207, button_208, button_209,
				button_210, button_211, button_212, button_213, button_214, button_215, button_216, button_217,
				button_218, button_219, button_220, button_221, button_222, button_223, button_224, button_225,
				button_226, button_227, button_228, button_229, button_230, button_231, button_232, button_233,
				button_234, button_235, button_236, button_237, button_238, button_239, button_240, button_241,
				button_242, button_243, button_244, button_245, button_246, button_247, button_248, button_249,
				button_250, button_251, button_252, button_253, button_254, button_255, button_256, button_257,
				button_258, rdbtnRed, rdbtnBlack, rdbtnWhite, panel_3 }));
*/
//30 buttons
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { menuBar, mnFile, mntmNew, mntmOpen,
				mntmSave, mnEdit, mntmBack, mnHelp, mntmAbout, contentPane, panel, comboBox, panel_4, textField,
				panel_1, panel_2, btnHole, button, button_1, button_2, button_3, button_4, button_5, button_6, button_7,
				button_8, button_9, button_10, button_11, button_12, button_13, button_14, button_15, button_16,
				button_17, button_18, button_19, button_20, button_21, button_22, button_23, button_24, button_25,
				button_26, button_27, button_28, button_29, button_30, rdbtnRed, rdbtnBlack, rdbtnWhite, panel_3 }));
//-----------------------------------------------------------------------------------------------------------------------
		
		// radio 甕곌쑵�뱣 �뤃占�
		rdbtnRed = new JRadioButton("RED", true);
		rdbtnRed.setBounds(8, 6, 55, 23);
		panel_1.add(rdbtnRed);

		rdbtnBlack = new JRadioButton("Black", false);
		rdbtnBlack.setBounds(67, 6, 70, 23);
		panel_1.add(rdbtnBlack);

		rdbtnWhite = new JRadioButton("White", false);
		rdbtnWhite.setBounds(141, 6, 70, 23);
		panel_1.add(rdbtnWhite);

		radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnRed);
		radioGroup.add(rdbtnBlack);
		radioGroup.add(rdbtnWhite);
	}

	public void paint(Graphics g) {
		super.paint(g);
		
		g2d = (Graphics2D) g;
		
		// g2d.setColor(Color.black);
		getRdbtnRed().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				i = 0;
			}
		});
		getrdbtnBlack().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				i = 1;
			}
		});
		getRdbtnWhite().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				i = 2;
			}
		});

		// button action listener==============================================
		
		getButton().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 233;
					y[Clickpoint] = 120;
					System.out.println(Clickpoint + ", " + x[Clickpoint] + ", " + y[Clickpoint]);
					Clickpoint++;
					line++;
					System.out.println(Clickpoint + ", " + line);
				}
				
				/*
				else if (Clickpoint != 0 && x[Clickpoint - 1] == 233 && y[Clickpoint - 1] == 120){
					System.out.println(Clickpoint + ", " + x[Clickpoint] + ", " + y[Clickpoint]);
					Clickpoint++;
					System.out.println(Clickpoint);
				}
				*/
				
				else {
					x[Clickpoint] = 233;
					y[Clickpoint] = 120;
					System.out.println(Clickpoint + ", " + x[Clickpoint] + ", " + y[Clickpoint]);
					Clickpoint++;
					line++;
					System.out.println(Clickpoint + ", " + line);
				}
				if(line % 2 == 1) {
					g.drawLine(x[Clickpoint - 1], y[Clickpoint - 1], x[Clickpoint], y[Clickpoint]);
				}
				repaint();
			}
		});

		getButton_1().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 269;
					y[Clickpoint] = 120;
					System.out.println(Clickpoint + ", " + x[Clickpoint] + ", " + y[Clickpoint]);
					Clickpoint++;
					line++;
					System.out.println(Clickpoint + ", " + line);
				}
				
				/*
				else if (x[Clickpoint] == 269 && y[Clickpoint] == 120){
					x[Clickpoint] = 269;
					y[Clickpoint] = 120;
					System.out.println(Clickpoint + ", " + x[Clickpoint] + ", " + y[Clickpoint]);
					Clickpoint++;
					System.out.println(Clickpoint);
				}
				*/
				
				else {
					x[Clickpoint] = 269;
					y[Clickpoint] = 120;
					System.out.println(Clickpoint + ", " + x[Clickpoint] + ", " + y[Clickpoint]);
					Clickpoint++;
					line++;
					System.out.println(Clickpoint + ", " + line);
				}
				if(line % 2 == 1) {
					g.drawLine(x[Clickpoint - 1], y[Clickpoint - 1], x[Clickpoint], y[Clickpoint]);
				}
				repaint();
			}
		});

		getButton_2().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 301;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 301 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 301;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_3().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 333;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 333 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 333;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_4().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 365;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 365 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 365;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_5().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 397;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 397 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 397;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});
		
		getButton_6().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 429;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 429 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 429;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});
		
		getButton_7().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 461;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 461 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 461;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_8().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 495;
					y[Clickpoint] = 120;
					Clickpoint++;
				} else if ((x[Clickpoint] == 495 && y[Clickpoint] == 120)) {
				} else {
					x[Clickpoint + 1] = 495;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_9().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 527;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 527 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 527;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_10().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 562;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 562 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 562;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_11().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 594;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 594 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 594;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_12().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (Clickpoint == 0) {
					x[Clickpoint] = 626;
					y[Clickpoint] = 120;
					Clickpoint++;
				}
				if (x[Clickpoint] == 626 && y[Clickpoint] == 120) {
				} else {
					x[Clickpoint + 1] = 626;
					y[Clickpoint + 1] = 120;
					Clickpoint++;
				}
				repaint();
			}
		});

		getButton_13().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 267;
					y1 = 148;

				} else {

					x2 = 267;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_14().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 299;
					y1 = 148;

				} else {

					x2 = 299;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_15().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 331;
					y1 = 148;

				} else {

					x2 = 331;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_16().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 363;
					y1 = 148;

				} else {

					x2 = 363;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_17().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 395;
					y1 = 148;

				} else {

					x2 = 395;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_18().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 427;
					y1 = 148;

				} else {

					x2 = 427;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_19().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 460;
					y1 = 148;

				} else {

					x2 = 460;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_20().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 492;
					y1 = 148;

				} else {

					x2 = 492;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_21().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 525;
					y1 = 148;

				} else {

					x2 = 525;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_22().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 557;
					y1 = 148;

				} else {

					x2 = 557;
					y2 = 148;
				}
				repaint();
			}
		});

		getButton_23().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 198;
					y1 = 189;

				} else {

					x2 = 198;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_24().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (flag == 4) {
					img = new ImageIcon("7404.png");
					panel_5.repaint();
				} 
/*				
				else {
					if (x1 == 0) {

						x1 = 230;
						y1 = 189;

					} else {

						x2 = 230;
						y2 = 189;
					}
					repaint();
				}
*/
			}
		});
		
		getButton_25().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 263;
					y1 = 189;

				} else {

					x2 = 263;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_26().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 296;
					y1 = 189;

				} else {

					x2 = 296;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_27().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 328;
					y1 = 189;

				} else {

					x2 = 328;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_28().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 362;
					y1 = 189;

				} else {

					x2 = 362;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_29().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 396;
					y1 = 189;

				} else {

					x2 = 396;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_30().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 429;
					y1 = 189;

				} else {

					x2 = 429;
					y2 = 189;
				}
				repaint();
			}
		});
//--------------------------------------------------------------------------
/*
		getButton_31().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 462;
					y1 = 189;

				} else {

					x2 = 462;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_32().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 494;
					y1 = 189;

				} else {

					x2 = 494;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_33().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 527;
					y1 = 189;

				} else {

					x2 = 527;
					y2 = 189;
				}
				repaint();
			}
		});

		getButton_34().addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub

				if (x1 == 0) {

					x1 = 559;
					y1 = 189;

				} else {

					x2 = 559;
					y2 = 189;
				}
				repaint();
			}
		});
*/
//--------------------------------------------------------------------------		
		switch (i) {
		case 0:
			g2d.setColor(Color.red);
			break;
		case 1:
			g2d.setColor(Color.black);
			break;
		case 2:
			g2d.setColor(Color.white);
			break;
		}
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setStroke(new BasicStroke(9, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
		
		/*
		g.drawLine(x1, y1, x2, y2);
		
		for (i = 0; i < 100; i++) {
			if (Clickpoint > 2 && i % 2 == 0) {
				g.drawLine(x[i], y[i], x[i + 1], y[i + 1]);
			}
		}
		*/
		
	}

	private AbstractButton getbutton() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void mousePressed(MouseEvent e) {
		drawing = true;
		p1 = e.getPoint();
		p2 = p1;
		repaint();
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		drawing = false;
		p2 = e.getPoint();
		repaint();
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		if (drawing) {
			p2 = e.getPoint();
			repaint();
		}
	}

	void display() {
		JFrame f = new JFrame("LinePanel");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.getContentPane().add(this);
		f.pack();
		f.setLocationRelativeTo(null);
		f.setVisible(true);
	}

	@Override
	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		// System.out.println();
	}
}
