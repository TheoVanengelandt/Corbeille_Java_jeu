package jpu2016.dogfight.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

public interface IGraphicsBuilder {
	
	public void applyModelToGraphic (Graphics graphics , ImageObserver observer);
	
	int getGlobalWidth();
	int getGlobalHeight();
}
