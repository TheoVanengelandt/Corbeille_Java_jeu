package jpu2016.dogfight.view;

import java.util.Observable;

import jpu2016.dogfight.controller.IOrderPerformer;
import jpu2016.dogfight.modele.IDogfightModel;

public class DogfightView implements IViewSystem {
	
	public DogfightView(IOrderPerformer orderPerformer,IDogfightModel dogfightModel, Observable observable) {
		
	}
	
	private void run() {
		
	}
	
	public String displayMessage (String message) {
		return message ;
	}
	
	public void closeAll() {
		
	}
}
