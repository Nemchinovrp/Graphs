import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
@SuppressWarnings("serial")
public class Graph extends JFrame {
	MainCanvas malf;
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
		malf = new MainCanvas();
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
		
		f1.addActionListener(new ActionEvents());
		f2.addActionListener(new ActionEvents());
		f3.addActionListener(new ActionEvents());
		f4.addActionListener(new ActionEvents());
		f5.addActionListener(new ActionEvents());
		f6.addActionListener(new ActionEvents());
		f7.addActionListener(new ActionEvents());
		f8.addActionListener(new ActionEvents());
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		
	}
}
