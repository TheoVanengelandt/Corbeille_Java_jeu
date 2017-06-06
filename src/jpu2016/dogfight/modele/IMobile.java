package jpu2016.dogfight.modele;

import java.awt.Dimension;
import java.awt.Image;

import com.sun.javafx.scene.paint.GradientUtils.Point;
import com.sun.javafx.scene.traversal.Direction;

public interface IMobile {
	public Direction getDirection();
	public void setDirection(Direction direction);
	public Point getPosition();
	public Dimension getDimension();
	public int getWidth();
	public int getHeight();
	public int getSpeed();
	public Image getImage();
	public void move();
	public void placeInArea(IArea area);
	public boolean isPlayer(int player);
	public void setDoghfightModel(DogfightModel doghfightModel);
	public boolean hit();
	public boolean isWeapon();
//
}
