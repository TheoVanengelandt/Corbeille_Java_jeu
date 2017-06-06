import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.modele.*;
import jpu2016.dogfight.view.DogfightView;
import jpu2016.dogfight.view.IViewSystem;

public class Dogfight {

	public static void main(String[] args) {
		
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController((IDogfightModel) dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel, dogfightModel);
		dogfightController.setViewSystem((IViewSystem) dogfightView);
		dogfightController.play();

	}

}
