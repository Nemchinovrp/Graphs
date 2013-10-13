
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
