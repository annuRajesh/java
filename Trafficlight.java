package lab21;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TrafficLight extends JPanel implements ActionListener  {
	JRadioButton r1,r2,r3;
	Color red_c,yellow_c,green_c;
	TrafficLight(){
		
		//JPanel p=new JPanel();
		setBounds(0,0,640,480);
		r1=new JRadioButton("red");
		r2=new JRadioButton("yellow");
		r3=new JRadioButton("Green");
		r1.setSelected(true);
		red_c=Color.red;
		yellow_c=getBackground();
		green_c=getBackground();
		
		
		ButtonGroup bg=new ButtonGroup();
		bg.add(r1);
		bg.add(r2);bg.add(r3);
		add(r1);add(r2);add(r3);
		r1.addActionListener(this);
		r2.addActionListener(this);
		r3.addActionListener(this);
	
	
	
		
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(50,50,50,50);
		g.drawOval(50,110,50,50);
		g.drawOval(50,170,50,50);
		g.setColor(red_c);
		g.fillOval(50,50,50,50);
		g.setColor(yellow_c);
		g.fillOval(50,110,50,50);
		g.setColor(green_c);
		g.fillOval(50,170,50,50);
		
	}
	public void actionPerformed(ActionEvent e) {
		if(r1.isSelected()==true) {
			red_c=Color.red;
			yellow_c=getBackground();
			green_c=getBackground();
			
			
		}
		else if(r2.isSelected()==true) {
			red_c=getBackground();
			yellow_c=Color.yellow;
			green_c=getBackground();
		}
		else {
			red_c=getBackground();
			yellow_c=getBackground();
			green_c=Color.green;
		}
		repaint();
			
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame fr =new JFrame();
		fr.setVisible(true);
		fr.setSize(640,480);
		fr.setLayout(null);
		
		
		
		TrafficLight t =new TrafficLight();
		fr.add(t);
		

	}

}
