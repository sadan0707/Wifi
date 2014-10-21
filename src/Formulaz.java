import java.awt.Component;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Formulaz {

	public static void main(String[] args) {
		
		JFrame zgloszenie = new JFrame("Formulaz zgloszenia");
		
		zgloszenie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		zgloszenie.setSize(600,400);	
		zgloszenie.setLocation(300, 300);
		zgloszenie.setLayout(null);		// zajmuje calosc	
		zgloszenie.setResizable(false); // mozliwosc zmiany rozmiaru okna
		zgloszenie.setVisible(true);   //za pomoca tej metody mozemy zauwa¿yc okno
		
		//JPanel panel = new JPanel();
		//zgloszenie.add(panel);
		
		
		JButton wystaw = new JButton("WYSTAW");
		wystaw.setBounds(490, 10, 100, 40);
		wystaw.setBorder(null);
		
		
		zgloszenie.add(wystaw);
		
		
		
	}
}




