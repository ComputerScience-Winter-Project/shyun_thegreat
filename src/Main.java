package initial;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;
public class Main extends JFrame {
	
	static JButton b1=new JButton("��ư1");
	static JButton b2=new JButton("��ư2");
	static JPanel page1=new JPanel() {
		private Image background=new ImageIcon(Main.class.getResource("../image/space2.png")).getImage();
		public void paint(Graphics g) {
			g.drawImage(background, 0, 0, null);
		}
	};
	static JPanel page2=new JPanel() {
		private Image background2=new ImageIcon(Main.class.getResource("../image/space3.jpg")).getImage();
		public void paint(Graphics g) {
			g.drawImage(background2, 0, 0, null);
		}
	};
	static JPanel page3=new JPanel() {
		private Image background3=new ImageIcon(Main.class.getResource("../image/space4.png")).getImage();
		public void paint(Graphics g) {
			g.drawImage(background3, 0, 0, null);
		}
	};
	public Main() {
		homeframe();
		setpanel();
		cg();
	}

	public void homeframe() {
		setTitle("1");
		setSize(1200,800);
		setResizable(false);
		setLocationRelativeTo(null);
		setLayout(null);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void setpanel() {
		b1.setBounds(0, 0, 100, 100);
		page1.setBounds(0, 0, 1200, 800);
		page2.setBounds(0, 0, 1200, 800);
		page2.setLayout(null);
		page1.setLayout(null);
		page2.setVisible(false);
		add(page1);
		add(page2);
		page1.add(b1);
		b2.setBounds(0, 0, 100, 100);
		page3.setBounds(0, 0, 1200, 800);
		page3.setLayout(null);
		page3.setVisible(false);
		add(page3);
		page2.add(b2);
	}
	public void cg(){
		b1.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				page1.setVisible(false);//â�� ���̰�
				page2.setVisible(true);//â�� ���̰�
			} 
		});
		b2.addMouseListener(new MouseAdapter() { // ���콺 �̺�Ʈ 
			@Override public void mouseEntered(MouseEvent e) { // ���콺 �������� 
			} 
			@Override public void mouseExited(MouseEvent e) { // ���콺 �������� 	
			}
			@Override public void mousePressed(MouseEvent e) { // Ŭ�������� 
				page2.setVisible(false);//â�� ���̰�
				page3.setVisible(true);//â�� ���̰�
			} 
		});
		}
	public static void main(String[] args) {
		new Main();
		JLabel imgLbl = new JLabel();
		ImageIcon bsImg = new ImageIcon(Main.class.getResource("../image/star_�⺻.png"));
		imgLbl.setIcon(bsImg);
		imgLbl.setBounds(30, 30, 122, 130);
		imgLbl.setHorizontalAlignment(JLabel.CENTER);
	}
} 
