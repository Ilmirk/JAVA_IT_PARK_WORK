class Program {
	public static void sortHeroEnemies(SuperHero a[]) {
		SuperHero temp = new SuperHero(0, null);
		for(int i = a.length - 1; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				if(a[j].getEnemies() > a[j + 1].getEnemies()) {
					temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		
		Humans batman = new Humans(3, "Batman");
		Humans ironMan = new Humans(5, "Iron Man");
		Mutants magnetto = new Mutants(20, "Magnetto");
		Mutants storm = new Mutants(2, "Storm");

		SuperHero superHero[] = { batman,
			ironMan,
			magnetto,
			storm };
		for(int i = 0; i < superHero.length; i++) {
			System.out.println(superHero[i].getName() + " " + superHero[i].getEnemies());
		}

		sortHeroEnemies(superHero);
		System.out.println("After sort:");

		for(int i = 0; i < superHero.length; i++) {
			System.out.println(superHero[i].getName() + " " + superHero[i].getEnemies());
		}
	}
}