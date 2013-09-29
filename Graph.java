import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Graph extends JFrame {
	MeineCanvas malf;
	int aktFunktion = 0;
	



	public static void main(String[] args) {
		
		Graph frame = new Graph("График функции");
		frame.pack();
		frame.setSize(950, 350);
		frame.setResizable(false);
		frame.setVisible(true);

	}
	Grafh(String titel){
		super(titel);
		
		//Создание и добавление холста для рисования
		malf = new MeineCanvas();
		add(malf);
		
		setLayout(new FlowLayout());
		
		JButton f1 = new JButton("tan(x)");
		JButton f2 = new JButton("x^3");
		JButton f3 = new JButton("x^6");
		JButton f4 = new JButton("cos(x)");
		JButton f5 = new JButton("sin(x)");
		JButton f6 = new JButton("log(x)");
		JButton f7 = new JButton("atan(x)");
		JButton f8 = new JButton("sqrt(x)");
		add(f1);
		add(f2);
		add(f3);
		add(f4);
		add(f5);
		add(f6);
		add(f7);
		add(f8);
		
		//Обработчик событий для кнопок
		class ActionLausch implements ActionListener{
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
				//Вызов перерисовки
				malf.repaint();
				
			}
		}
		f1.addActionListener(new ActionLausch());
		f2.addActionListener(new ActionLausch());
		f3.addActionListener(new ActionLausch());
		f4.addActionListener(new ActionLausch());
		f5.addActionListener(new ActionLausch());
		f6.addActionListener(new ActionLausch());
		f7.addActionListener(new ActionLausch());
		f8.addActionListener(new ActionLausch());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
	//@SuppressWarnings("serial")
	class MeineCanvas extends Canvas {
		MeineCanvas(){
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

}}
