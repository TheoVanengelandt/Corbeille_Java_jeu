package jpu2016.dogfight.gameframe;

import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;


import jpu2016.dogfight.view.EventPerformer;


public class GameFrame implements KeyListener{
	
	GamePanel panel = new GamePanel(null);
	
	public GameFrame( String title, EventPerformer performer,IGraphicsBuilder graphicbuilder, Observable observable) {
		
	}
	
	
	public void KeyPressed(KeyEvent KeyEvent){}
	
	public void KeyReleased(KeyEvent KeyEvent){}
	
	public void KeyType(KeyEvent KeyEvent){
		if (KeyEvent.getKeyChar() == 'c') {
			//a changer
		}
			
	}
}
