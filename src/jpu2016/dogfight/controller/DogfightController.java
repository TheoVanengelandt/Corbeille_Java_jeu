package jpu2016.dogfight.controller;

import jpu2016.dogfight.modele.IDogfightModel;
import jpu2016.dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer{
	private int TIME_SLEEP = 30;
	
	public DogfightController(IDogfightModel dogfightModel){
		
	}
	
	public void orderPerfrom(UserOrder userOrder){
		
	}
	
	public void play(){
		
		
	}
	
	public void setViewSystem(IViewSystem viewSystem){
		
	}
	
	private void lauchMissile(int player){
		private Mobile weapon = new Mobile();
		
	}
	
	private void gameLoop(){
		
	}
	
	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon){
		int values = 0;
		
		if(weapon.getPosition().getX() / weapon.getWidth() != (mobile.getPosition().getX() / weapon.getWidth())){
			if(weapon.getPosition().getY() / weapon.getHeight() != (mobile.getPosition().getY() / weapon.getHeight())){
				return true;
			}
		}
		else{
			return false;
		}
	}
	
	private boolean manageCollision(final IMobile weapon1, final IMobile weapon2){
		if(isWeaponOnMobile(weapon1, weapon2) == true){
			return true;
		}
		else{
			return false;
		}
	}

}
