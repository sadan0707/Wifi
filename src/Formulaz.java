import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class Formulaz {

	public static void main(String[] args) {
		
		JFrame zgloszenie = new JFrame("Formulaz zgloszenia");
		
		zgloszenie.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		zgloszenie.setSize(700,1000);	
		zgloszenie.setLocation(300, 100);
		zgloszenie.setLayout(null);		// zajmuje calosc	
		zgloszenie.setResizable(false); // mozliwosc zmiany rozmiaru okna
		zgloszenie.setVisible(true);   //za pomoca tej metody mozemy zauwa¿yc okno
		
		//JPanel panel = new JPanel();
		//zgloszenie.add(panel);
		
		
		JButton wystaw = new JButton("WYSTAW ZGLOSZENIE");
		wystaw.setBounds(250, 920, 200, 40);
		wystaw.setBorder(null);
		zgloszenie.add(wystaw);
		
		JLabel etykieta_nazwy = new JLabel("Nazwa urzadzenia");
		etykieta_nazwy.setBounds(20,10,120,40);
		zgloszenie.add(etykieta_nazwy);
		
		
		JTextField nazwa = new JTextField();
		nazwa.setBounds(20, 50, 650, 40);
		Font f = new Font("New Times Roman", Font.BOLD, 20);
		nazwa.setFont(f);
		nazwa.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(nazwa);
		
		JLabel etykieta_modelu = new JLabel("Model");
		etykieta_modelu.setBounds(20,110,120,40);
		zgloszenie.add(etykieta_modelu);
		
		
		JTextField model = new JTextField();
		model.setBounds(20, 150, 650, 40);
		model.setFont(f);
		model.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(model);
		
		/*JTextField nazwa = new JTextField();
		nazwa.setBounds(10, 10, 500, 40);
		Font f = new Font("New Times Roman", Font.BOLD, 24);
		nazwa.setFont(f);
		nazwa.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(nazwa);
		
		JTextField nazwa = new JTextField();
		nazwa.setBounds(10, 10, 500, 40);
		Font f = new Font("New Times Roman", Font.BOLD, 24);
		nazwa.setFont(f);
		nazwa.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(nazwa);
		
		JTextField nazwa = new JTextField();
		nazwa.setBounds(10, 10, 500, 40);
		Font f = new Font("New Times Roman", Font.BOLD, 24);
		nazwa.setFont(f);
		nazwa.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(nazwa);
		
		JTextField nazwa = new JTextField();
		nazwa.setBounds(10, 10, 500, 40);
		Font f = new Font("New Times Roman", Font.BOLD, 24);
		nazwa.setFont(f);
		nazwa.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(nazwa);
		
		JTextField nazwa = new JTextField();
		nazwa.setBounds(10, 10, 500, 40);
		Font f = new Font("New Times Roman", Font.BOLD, 24);
		nazwa.setFont(f);
		nazwa.setHorizontalAlignment(JTextField.RIGHT);
		zgloszenie.add(nazwa); */
		
		
		
		
		
		
	}
}




