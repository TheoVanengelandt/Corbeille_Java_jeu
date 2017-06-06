package jpu2016.dogfight.gameframe;
import javax.swing.JPanel;

import java.awt.Graphics;
import java.awt.Dimension;

import java.util.Observable;


public class GamePanel extends JPanel {

	private static final long serialVersionUID = 1L;

	public GamePanel( IGraphicsBuilder graphicBuilder ) {
		setPreferredSize(new Dimension(1920, 1080));
	}
	

	public void update(Observable observable) {
		
	}
	
	public void paintComponent(Graphics graphic ) {
		 int largeur = getSize().width;
		 int hauteur = getSize().height;

		 super.paintComponent(graphic);
		 //graphic.fillOval(10, 10, largeur - 20, hauteur - 20);
	}
}
