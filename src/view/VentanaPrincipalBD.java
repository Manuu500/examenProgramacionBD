package view;

import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;

public class VentanaPrincipalBD extends JFrame {
	public static String TITULO_APLICACION = "titulo";
	public static BufferedImage iconoApp;

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		VentanaPrincipalBD v = new VentanaPrincipalBD();
		
		v.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		JTabbedPane tabedPane = new JTabbedPane();
		
		tabedPane.add("Colegio", new PanelCentroEducativo());
		v.setMinimumSize(new Dimension(800, 600));
		
		v.setContentPane(tabedPane);
		v.setVisible(true);
	}
		
	
}
