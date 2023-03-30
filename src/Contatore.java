
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Contatore extends JFrame implements ActionListener{
	
	Font font= new Font("Bodoni MT", Font.PLAIN, 15); 
	JLabel label1= new JLabel ("Base");
	JLabel label2= new JLabel ("Altezza");
	JLabel label3= new JLabel ("Area");
	JLabel label4= new JLabel ("Area");
	JTextArea a= new JTextArea(2,10);
	JTextArea b= new JTextArea(2,10);
	JTextArea c= new JTextArea(2,10);
	JButton bcalcola= new JButton ("CALCOLA");
	JButton bcancella= new JButton ("CANCELLA");
	
	public Contatore() {
		super("Calcolo Area");
		setSize (400, 150);
		//setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		Container cont=this.getContentPane();
		cont.setLayout(new FlowLayout());
		cont.add(label1);
		cont.add(a);
		cont.add(label2);
		cont.add(b);
		cont.add(bcalcola);
		cont.add(bcancella);
		cont.add(label3);
		cont.add(c);
		label1.setFont(font);
		label2.setFont(font);
		label3.setFont(font);
		a.setFont(font);
		b.setFont(font);
		c.setFont(font);
		bcalcola.addActionListener(this); 
		bcancella.addActionListener(this); 
		bcalcola.setFont(font);
		bcancella.setFont(font);
		
		setVisible(true);
	}
	
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == bcalcola) {
			 int aa= Integer.parseInt(a.getText());
			 int bb= Integer.parseInt(b.getText());
			 int ris=aa*bb;
			 String cc=""+ris;
			 c.setText(cc);
			    
		 }else if(e.getSource() == bcancella) {
			 c.setText("");
		 }
	}

}
