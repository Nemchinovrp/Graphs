package mma;
import javax.swing.*;

import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")

public class Graph extends JFrame implements ActionListener {
	MainCanvas canvas;
	int aktFunktion = 0;
	Graph frame;
	public static void main(String[] args) {
		Graph grafic = new Graph();
		grafic.Gui();
	}
		
	public void Gui(){
	    frame = new Graph();
	    canvas = new MainCanvas();
		frame.getContentPane().add(BorderLayout.CENTER, canvas);
		JPanel panel = new JPanel();
	
		GridLayout gl = new GridLayout(8,1);
		panel.setLayout(gl);
		
		JButton f1 = new JButton("tan(x)");
		JButton f2 = new JButton("x^3");
		JButton f3 = new JButton("x^6");
		JButton f4 = new JButton("cos(x)");
		JButton f5 = new JButton("sin(x)");
		JButton f6 = new JButton("log(x)");
		JButton f7 = new JButton("atan(x)");
		JButton f8 = new JButton("sqrt(x)");
		panel.add(f1);
		panel.add(f2);
		panel.add(f3);
		panel.add(f4);
		panel.add(f5);
		panel.add(f6);
		panel.add(f7);
		panel.add(f8);
		f1.addActionListener(this);
		f2.addActionListener(this);
		f3.addActionListener(this);
		f4.addActionListener(this);
		f5.addActionListener(this);
		f6.addActionListener(this);
		f7.addActionListener(this);
		f8.addActionListener(this);
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.getContentPane().add(BorderLayout.EAST, panel);
		frame.pack();
		frame.setSize(390, 350);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		
		}
	
	public void actionPerformed(ActionEvent e){
				String label;
				label = e.getActionCommand();
				if(label.equals("tan(x)"))
					aktFunktion = 1;
				if(label.equals("x^3"))
					aktFunktion = 2;
				if(label.equals("x^6"))
					aktFunktion = 3;
				if(label.equals("cos(x)"))
					aktFunktion = 4;
				if(label.equals("sin(x)"))
					aktFunktion = 5;
				if(label.equals("log(x)"))
					aktFunktion = 6;
				if(label.equals("atan(x)"))
					aktFunktion = 7;
				if(label.equals("sqrt(x)"))
					aktFunktion = 8;
				
				canvas.repaint();
				
			}
	class MainCanvas extends Canvas {
		MainCanvas(){
			setBackground(Color.black);
			setForeground(Color.green);
		}
		//Самый выжный метод, выполняющий рисование
		public void paint(Graphics g){
			double x,y=0;
			int xpos, ypos;
			
			g.translate(150, 150);
			
			g.setColor(Color.red);
			g.drawLine(0, -150, 0, 150);
			g.drawLine(-150, 0, 150, 0);
			g.drawString("-3", -150, 12);
			g.drawString("-3", 4, 147);
			g.drawString("+3", 135, 12);
			g.drawString("+3", 4, -140);
			
			g.setColor(new Color(255,255,0));
			
			if(aktFunktion == 0)
				return;
			for(x=-3.0;x<=3; x+=0.005){
				if(aktFunktion ==1)
					y = Math.tan(x);
				if(aktFunktion ==2)
					y = Math.pow(x, 3);
				if(aktFunktion ==3)
					y = Math.pow(x, 6);
				if(aktFunktion ==4)
					y = Math.cos(x);
				if(aktFunktion ==5)
					y = Math.sin(x);
				if(aktFunktion ==6)
					y = Math.log(x);
				if(aktFunktion ==7)
					y = Math.atan(x);
				if(aktFunktion ==8)
					y = Math.sqrt(x);
				xpos = (int) (x*50);
				ypos = (int) (-y*50);
				
				g.fillOval(xpos, ypos, 3, 3);
				
			}
		}
		public Dimension getMinimumSize(){
			return new Dimension(300,300);		
			}
	
	public Dimension getPreferredSize(){
		return getMinimumSize();
	}

}
	}





