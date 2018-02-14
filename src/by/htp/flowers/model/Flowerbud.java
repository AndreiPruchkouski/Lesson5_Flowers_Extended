package by.htp.flowers.model;

public class Flowerbud {

	public String color;
	public int size;

	public Petal[] petal;

	public Flowerbud() {

	}

	public Flowerbud(String color, int size) {
		this.color = color;
		this.size = size;
	}

	public void onbloom(int petalCount) {

		this.color = "Green";
		this.size = 15;

		if (petalCount > 0) {
			// Объявляем и инициализируем массив для лепестков
			petal = new Petal[petalCount];
			// Заполняем его каким-то стандартным значением
			for (int i = 0; i < petal.length; i++) {
				petal[i] = new Petal(4, "oval", "white");
			}

		}

	}

	// Изменение статуса бутона при частичном увядании
	public Flower onLittleFade(String fltitle) {
		this.color = "Brown";
		this.size = 10;
		String fltitleold = fltitle;
		
		//Удаляем каждый третий лепесток из массива
		for(int i = 0; i < petal.length; i+=3) {
			this.petal[i] = null;
		}
		
		//Меняем цвет цветка
		Flower flcolor = new Flower();
		flcolor.color = "Brown";
		flcolor.title = fltitleold;
		
		return flcolor;
	}

	// Изменение статуса бутона при полном увядании
	public Flower onTotalFade(String fltitle) {
		this.color = "Gray";
		this.size = 5;
		String fltitleold = fltitle;
		
		//Работаем в лепестками
		for(int i = 0; i < petal.length; i++) {
			if(this.petal[i] != null) {
				this.petal[i] = null;
			}
		}
		
		//Меняем цвет цветка
		Flower flcolor = new Flower();
		flcolor.color = "Black";
		flcolor.title = fltitleold;
		
		return flcolor;
	}

}
