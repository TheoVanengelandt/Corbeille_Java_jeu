package jpu2016.dogfight.modele;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;

import com.sun.javafx.scene.paint.GradientUtils.Point;
import com.sun.xml.internal.ws.dump.LoggingDumpTube.Position;

public class Mobile implements IMobile{
	private int speed;

	public void Mobiles(Direction direction, Position position, Dimension dimension, int speed, String image){
		
	}
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public Image getImage(){
		
	}
	
	private void moveUp(){
		
	}
	private void moveDown(){
		
	}
	private void moveRight(){
	
	}
	private void moveLeft(){
	}
	
	public Color getColor(){
		
	}

	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public Point getPosition() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public image getImage() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setDoghfightModel(doghfightModel DogfightModel) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}
}
