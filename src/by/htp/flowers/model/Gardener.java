package by.htp.flowers.model;

public class Gardener {

	public String name;

	public Gardener(String name) {
		this.name = name;
	}

	public void informAboutFlowerState(Flower flower, Flowerbud bud) {
		// NPE
		if (flower != null) {
			System.out.println("Flower title: " + flower.title);
			System.out.println("Flower color: " + flower.color);
			System.out.println("Bud color: " + bud.color);
			System.out.println("Bud size: " + bud.size);
			if (bud.petal != null) {
				informAboutFlowerPetals(bud.petal);
			}
		}
	}

	public void informAboutFlowerPetals(Petal[] petals) {
	
		System.out.println("Flower petals count: " + getPetalsCount(petals));

		if (getPetalsCount(petals) != 0) {
			System.out.println("====Info about petals====");
			for (Petal petal : petals) {
				if (petal != null) {
					System.out.println("Petal size: " + petal.size);
					System.out.println("Petal shape: " + petal.shape);
					System.out.println("Petal color: " + petal.color);
					System.out.println("----");
				}
			}
		}

	}
	
	

	// Метод введен для определения количества оставшихся лепестков
	// (отдельные элементы массива исчезают в процессе работы приложения)
	public int getPetalsCount(Petal[] petals) {
		int count = 0;
		for (Petal petal : petals) {
			if (petal != null) {
				count++;
			}
		}
		return count;
	}
}
