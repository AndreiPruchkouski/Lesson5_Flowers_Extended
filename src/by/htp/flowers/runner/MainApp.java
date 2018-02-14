package by.htp.flowers.runner;

import by.htp.flowers.model.Flower;
import by.htp.flowers.model.Flowerbud;
import by.htp.flowers.model.Gardener;

public class MainApp {

	public static void main(String[] args) {
		
		Gardener gardener = new Gardener("Arnold");
		Flower fl;
		
		fl = new Flower("Rose", "Red");
		Flowerbud flbud = new Flowerbud();
//		gardener.informAboutFlowerState(fl);
		
		System.out.println("\nStatus after bloom:");
		flbud.onbloom(5);
		gardener.informAboutFlowerState(fl, flbud);
		
		System.out.println("\nStatus after littleFade:");
		fl = flbud.onLittleFade(fl.title);
		gardener.informAboutFlowerState(fl, flbud);
		
		System.out.println("\nStatus after totalFade:");
		fl = flbud.onTotalFade(fl.title);
		gardener.informAboutFlowerState(fl, flbud);
		
		
	}

}
