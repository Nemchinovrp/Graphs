class ActionEvents implements ActionListener{
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
