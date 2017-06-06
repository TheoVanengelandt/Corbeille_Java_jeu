import jpu2016.dogfight.controller.DogfightController;
import jpu2016.dogfight.modele.DogfightModel;
import jpu2016.dogfight.modele.IDogfightModel;
import jpu2016.dogfight.view.DogfightView;

public class Dogfight {

	public static void main(String[] args) {
		
		final DogfightModel dogfightModel = new DogfightModel();
		final DogfightController dogfightController = new DogfightController((IDogfightModel) dogfightModel);
		final DogfightView dogfightView = new DogfightView(dogfightController, dogfightModel);
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();

	}

}
