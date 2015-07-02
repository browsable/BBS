package bbs;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

public class Main extends JFrame implements MouseListener,MouseMotionListener {
	//--------------------------------------------------------------------------------------------
	private Point p1 = new Point(0, 0);
	private Point p2 = new Point(0, 0);
	private boolean drawing;
	//--------------------------------------------------------------------------------------------
	private JPanel contentPane;
	public JLabel label;
	private ButtonGroup radioGroup;
	private final Color colorValues[] = {Color.RED, Color.BLACK, Color.WHITE};
	
	public static void main(String[] args) {
		
		
		Main application = new Main();
		application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
					frame.setVisible(true);
					//--------------------------------------------------------------------------------------------
					new Main().display();
					//--------------------------------------------------------------------------------------------

				} catch (Exception e) {
					e.printStackTrace();
				} 
			}
		});
	}
	//

	/**
<<<<<<< HEAD
	 * Create the frame.  adlfkajsldfk
=======
>>>>>>> refs/remotes/origin/master
	 * Create the frame.  
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
		panel_2.setLayout(null);

		panel_1.add(panel_2);
		
		JButton btnHole = new JButton("hole");
		btnHole.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnHole.setBounds(19, 19, 21, 16);
		panel_2.add(btnHole);
		
		JButton button = new JButton("hole");
		button.setBounds(52, 19, 21, 16);
		panel_2.add(button);
		
		JButton button_1 = new JButton("hole");
		button_1.setBounds(85, 19, 21, 16);
		panel_2.add(button_1);
		
		JButton button_2 = new JButton("hole");
		button_2.setBounds(118, 19, 21, 16);
		panel_2.add(button_2);
		
		JButton button_3 = new JButton("hole");
		button_3.setBounds(151, 19, 21, 16);
		panel_2.add(button_3);
		
		JButton button_4 = new JButton("hole");
		button_4.setBounds(184, 19, 21, 16);
		panel_2.add(button_4);
		
		JButton button_5 = new JButton("hole");
		button_5.setBounds(217, 19, 21, 16);
		panel_2.add(button_5);
		
		JButton button_6 = new JButton("hole");
		button_6.setBounds(250, 19, 21, 16);
		panel_2.add(button_6);
		
		JButton button_7 = new JButton("hole");
		button_7.setBounds(283, 19, 21, 16);
		panel_2.add(button_7);
		
		JButton button_8 = new JButton("hole");
		button_8.setBounds(316, 19, 21, 16);
		panel_2.add(button_8);
		
		JButton button_9 = new JButton("hole");
		button_9.setBounds(349, 19, 21, 16);
		panel_2.add(button_9);
		
		JButton button_10 = new JButton("hole");
		button_10.setBounds(382, 19, 21, 16);
		panel_2.add(button_10);
		
		JButton button_11 = new JButton("hole");
		button_11.setBounds(19, 47, 21, 16);
		panel_2.add(button_11);
		
		JButton button_12 = new JButton("hole");
		button_12.setBounds(52, 47, 21, 16);
		panel_2.add(button_12);
		
		JButton button_13 = new JButton("hole");
		button_13.setBounds(85, 47, 21, 16);
		panel_2.add(button_13);
		
		JButton button_14 = new JButton("hole");
		button_14.setBounds(118, 47, 21, 16);
		panel_2.add(button_14);
		
		JButton button_15 = new JButton("hole");
		button_15.setBounds(151, 47, 21, 16);
		panel_2.add(button_15);
		
		JButton button_16 = new JButton("hole");
		button_16.setBounds(184, 47, 21, 16);
		panel_2.add(button_16);
		
		JButton button_17 = new JButton("hole");
		button_17.setBounds(217, 47, 21, 16);
		panel_2.add(button_17);
		
		JButton button_18 = new JButton("hole");
		button_18.setBounds(250, 47, 21, 16);
		panel_2.add(button_18);
		
		JButton button_19 = new JButton("hole");
		button_19.setBounds(283, 47, 21, 16);
		panel_2.add(button_19);
		
		JButton button_20 = new JButton("hole");
		button_20.setBounds(316, 47, 21, 16);
		panel_2.add(button_20);
		
		JButton button_21 = new JButton("hole");
		button_21.setBounds(349, 47, 21, 16);
		panel_2.add(button_21);
		
		JButton button_22 = new JButton("hole");
		button_22.setBounds(382, 47, 21, 16);
		panel_2.add(button_22);
		
		JButton button_23 = new JButton("hole");
		button_23.setBounds(19, 85, 21, 16);
		panel_2.add(button_23);
		
		JButton button_24 = new JButton("hole");
		button_24.setBounds(52, 85, 21, 16);
		panel_2.add(button_24);
		
		JButton button_25 = new JButton("hole");
		button_25.setBounds(85, 85, 21, 16);
		panel_2.add(button_25);
		
		JButton button_26 = new JButton("hole");
		button_26.setBounds(118, 85, 21, 16);
		panel_2.add(button_26);
		
		JButton button_27 = new JButton("hole");
		button_27.setBounds(151, 85, 21, 16);
		panel_2.add(button_27);
		
		JButton button_28 = new JButton("hole");
		button_28.setBounds(184, 85, 21, 16);
		panel_2.add(button_28);
		
		JButton button_29 = new JButton("hole");
		button_29.setBounds(217, 85, 21, 16);
		panel_2.add(button_29);
		
		JButton button_30 = new JButton("hole");
		button_30.setBounds(250, 85, 21, 16);
		panel_2.add(button_30);
		
		JButton button_31 = new JButton("hole");
		button_31.setBounds(283, 85, 21, 16);
		panel_2.add(button_31);
		
		JButton button_32 = new JButton("hole");
		button_32.setBounds(316, 85, 21, 16);
		panel_2.add(button_32);
		
		JButton button_33 = new JButton("hole");
		button_33.setBounds(349, 85, 21, 16);
		panel_2.add(button_33);
		
		JButton button_34 = new JButton("hole");
		button_34.setBounds(382, 85, 21, 16);
		panel_2.add(button_34);
		
		JButton button_35 = new JButton("hole");
		button_35.setBounds(415, 19, 21, 16);
		panel_2.add(button_35);
		
		JButton button_36 = new JButton("hole");
		button_36.setBounds(415, 47, 21, 16);
		panel_2.add(button_36);
		
		JButton button_37 = new JButton("hole");
		button_37.setBounds(415, 85, 21, 16);
		panel_2.add(button_37);
		
		JButton button_38 = new JButton("hole");
		button_38.setBounds(19, 108, 21, 16);
		panel_2.add(button_38);
		
		JButton button_39 = new JButton("hole");
		button_39.setBounds(52, 108, 21, 16);
		panel_2.add(button_39);
		
		JButton button_40 = new JButton("hole");
		button_40.setBounds(85, 108, 21, 16);
		panel_2.add(button_40);
		
		JButton button_41 = new JButton("hole");
		button_41.setBounds(118, 108, 21, 16);
		panel_2.add(button_41);
		
		JButton button_42 = new JButton("hole");
		button_42.setBounds(151, 108, 21, 16);
		panel_2.add(button_42);
		
		JButton button_43 = new JButton("hole");
		button_43.setBounds(184, 108, 21, 16);
		panel_2.add(button_43);
		
		JButton button_44 = new JButton("hole");
		button_44.setBounds(217, 108, 21, 16);
		panel_2.add(button_44);
		
		JButton button_45 = new JButton("hole");
		button_45.setBounds(250, 108, 21, 16);
		panel_2.add(button_45);
		
		JButton button_46 = new JButton("hole");
		button_46.setBounds(283, 108, 21, 16);
		panel_2.add(button_46);
		
		JButton button_47 = new JButton("hole");
		button_47.setBounds(316, 108, 21, 16);
		panel_2.add(button_47);
		
		JButton button_48 = new JButton("hole");
		button_48.setBounds(349, 108, 21, 16);
		panel_2.add(button_48);
		
		JButton button_49 = new JButton("hole");
		button_49.setBounds(382, 108, 21, 16);
		panel_2.add(button_49);
		
		JButton button_50 = new JButton("hole");
		button_50.setBounds(415, 108, 21, 16);
		panel_2.add(button_50);
		
		JButton button_51 = new JButton("hole");
		button_51.setBounds(19, 129, 21, 16);
		panel_2.add(button_51);
		
		JButton button_52 = new JButton("hole");
		button_52.setBounds(52, 129, 21, 16);
		panel_2.add(button_52);
		
		JButton button_53 = new JButton("hole");
		button_53.setBounds(85, 129, 21, 16);
		panel_2.add(button_53);
		
		JButton button_54 = new JButton("hole");
		button_54.setBounds(118, 129, 21, 16);
		panel_2.add(button_54);
		
		JButton button_55 = new JButton("hole");
		button_55.setBounds(151, 129, 21, 16);
		panel_2.add(button_55);
		
		JButton button_56 = new JButton("hole");
		button_56.setBounds(184, 129, 21, 16);
		panel_2.add(button_56);
		
		JButton button_57 = new JButton("hole");
		button_57.setBounds(217, 129, 21, 16);
		panel_2.add(button_57);
		
		JButton button_58 = new JButton("hole");
		button_58.setBounds(250, 129, 21, 16);
		panel_2.add(button_58);
		
		JButton button_59 = new JButton("hole");
		button_59.setBounds(283, 129, 21, 16);
		panel_2.add(button_59);
		
		JButton button_60 = new JButton("hole");
		button_60.setBounds(316, 129, 21, 16);
		panel_2.add(button_60);
		
		JButton button_61 = new JButton("hole");
		button_61.setBounds(349, 129, 21, 16);
		panel_2.add(button_61);
		
		JButton button_62 = new JButton("hole");
		button_62.setBounds(382, 129, 21, 16);
		panel_2.add(button_62);
		
		JButton button_63 = new JButton("hole");
		button_63.setBounds(415, 129, 21, 16);
		panel_2.add(button_63);
		
		JButton button_64 = new JButton("hole");
		button_64.setBounds(19, 150, 21, 16);
		panel_2.add(button_64);
		
		JButton button_65 = new JButton("hole");
		button_65.setBounds(52, 150, 21, 16);
		panel_2.add(button_65);
		
		JButton button_66 = new JButton("hole");
		button_66.setBounds(85, 150, 21, 16);
		panel_2.add(button_66);
		
		JButton button_67 = new JButton("hole");
		button_67.setBounds(118, 150, 21, 16);
		panel_2.add(button_67);
		
		JButton button_68 = new JButton("hole");
		button_68.setBounds(151, 150, 21, 16);
		panel_2.add(button_68);
		
		JButton button_69 = new JButton("hole");
		button_69.setBounds(184, 150, 21, 16);
		panel_2.add(button_69);
		
		JButton button_70 = new JButton("hole");
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
		button_116.setBounds(19, 255, 21, 16);
		panel_2.add(button_116);
		
		JButton button_117 = new JButton("hole");
		button_117.setBounds(52, 255, 21, 16);
		panel_2.add(button_117);
		
		JButton button_118 = new JButton("hole");
		button_118.setBounds(85, 255, 21, 16);
		panel_2.add(button_118);
		
		JButton button_119 = new JButton("hole");
		button_119.setBounds(118, 255, 21, 16);
		panel_2.add(button_119);
		
		JButton button_120 = new JButton("hole");
		button_120.setBounds(151, 255, 21, 16);
		panel_2.add(button_120);
		
		JButton button_121 = new JButton("hole");
		button_121.setBounds(184, 255, 21, 16);
		panel_2.add(button_121);
		
		JButton button_122 = new JButton("hole");
		button_122.setBounds(217, 255, 21, 16);
		panel_2.add(button_122);
		
		JButton button_123 = new JButton("hole");
		button_123.setBounds(250, 255, 21, 16);
		panel_2.add(button_123);
		
		JButton button_124 = new JButton("hole");
		button_124.setBounds(283, 255, 21, 16);
		panel_2.add(button_124);
		
		JButton button_125 = new JButton("hole");
		button_125.setBounds(316, 255, 21, 16);
		panel_2.add(button_125);
		
		JButton button_126 = new JButton("hole");
		button_126.setBounds(349, 255, 21, 16);
		panel_2.add(button_126);
		
		JButton button_127 = new JButton("hole");
		button_127.setBounds(382, 255, 21, 16);
		panel_2.add(button_127);
		
		JButton button_128 = new JButton("hole");
		button_128.setBounds(415, 255, 21, 16);
		panel_2.add(button_128);
		
		JButton button_129 = new JButton("hole");
		button_129.setBounds(19, 283, 21, 16);
		panel_2.add(button_129);
		
		JButton button_130 = new JButton("hole");
		button_130.setBounds(52, 283, 21, 16);
		panel_2.add(button_130);
		
		JButton button_131 = new JButton("hole");
		button_131.setBounds(85, 283, 21, 16);
		panel_2.add(button_131);
		
		JButton button_132 = new JButton("hole");
		button_132.setBounds(118, 283, 21, 16);
		panel_2.add(button_132);
		
		JButton button_133 = new JButton("hole");
		button_133.setBounds(151, 283, 21, 16);
		panel_2.add(button_133);
		
		JButton button_134 = new JButton("hole");
		button_134.setBounds(184, 283, 21, 16);
		panel_2.add(button_134);
		
		JButton button_135 = new JButton("hole");
		button_135.setBounds(217, 283, 21, 16);
		panel_2.add(button_135);
		
		JButton button_136 = new JButton("hole");
		button_136.setBounds(250, 283, 21, 16);
		panel_2.add(button_136);
		
		JButton button_137 = new JButton("hole");
		button_137.setBounds(283, 283, 21, 16);
		panel_2.add(button_137);
		
		JButton button_138 = new JButton("hole");
		button_138.setBounds(316, 283, 21, 16);
		panel_2.add(button_138);
		
		JButton button_139 = new JButton("hole");
		button_139.setBounds(349, 283, 21, 16);
		panel_2.add(button_139);
		
		JButton button_140 = new JButton("hole");
		button_140.setBounds(382, 283, 21, 16);
		panel_2.add(button_140);
		
		JButton button_141 = new JButton("hole");
		button_141.setBounds(415, 283, 21, 16);
		panel_2.add(button_141);

	
	
		
		//radio 踰꾪듉 援�
		
		JRadioButton rdbtnRed = new JRadioButton("RED", true);
		rdbtnRed.setBounds(8, 6, 55, 23);
		panel_1.add(rdbtnRed);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("Black", false);
		rdbtnNewRadioButton.setBounds(67, 6, 70, 23);
		panel_1.add(rdbtnNewRadioButton);

		JRadioButton rdbtnWhite = new JRadioButton("White", false);
		rdbtnWhite.setBounds(141, 6, 70, 23);
		panel_1.add(rdbtnWhite);

		radioGroup = new ButtonGroup();
		radioGroup.add(rdbtnRed);
		radioGroup.add(rdbtnNewRadioButton);
		radioGroup.add(rdbtnWhite);
		
		//rdbtnRed.addItemListener( new RadioButtonHandler( ));
		//rdbtnNewRadioButton.addItemListener( new RadioButtonHandler( ));
		//rdbtnWhite.addItemListener( new RadioButtonHandler( ));
		
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_3.setBounds(12, 464, 860, 67);
		contentPane.add(panel_3);
		
		
	}

	public void paint(Graphics g){
		super.paint(g);
		g.setColor(Color.RED);
		g.drawLine(330, 178, 350, 178);
		//--------------------------------------------------------------------------------------------
		Graphics2D g2d = (Graphics2D) g;
		g2d.setColor(Color.black);
		/*
		
		if(rdbtnRed){
			g2d.setColor(Color.red);
		}
		else if(rdbtnNewRadioButton){
			g2d.setColor(Color.black);
		}
		else if(rdbtnWhite){
			g2d.setColor(Color.white);
		}
		*/
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setStroke(new BasicStroke(9, BasicStroke.CAP_ROUND, BasicStroke.JOIN_BEVEL));
		g.drawLine(p1.x, p1.y, p2.x, p2.y);
		//--------------------------------------------------------------------------------------------
	}
	//--------------------------------------------------------------------------------------------
	@Override
	public void mousePressed(MouseEvent e){
		drawing = true;
		p1 = e.getPoint();
		p2 = p1;
		repaint();
	}
	
	@Override
	public void mouseReleased(MouseEvent e){
		drawing = false;
		p2 = e.getPoint();
		repaint();
	}
	
	@Override
	public void mouseDragged(MouseEvent e){
		if(drawing){
			p2 = e.getPoint();
			repaint();
		}
	}
	
	void display(){
		JFrame f = new JFrame("LinePanel");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(this);
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
		System.out.println("버튼 위");
	}
	//--------------------------------------------------------------------------------------------
/*
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println("mouseClicked " + x + " - Y: " + y);

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println("mouseEntered " + x + " - Y: " + y);

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println("mouseExited " + x + " - Y: " + y);

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println("mousePressed X: " + x + " - Y: " + y);

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println("mouseReleased X: " + x + " - Y: " + y);

	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println("mouseDragged X: " + x + " - Y: " + y);
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		int x = e.getX();
		int y = e.getY();
		System.out.println("mouseMoved X: " + x + " - Y: " + y);
	}
*/
}
