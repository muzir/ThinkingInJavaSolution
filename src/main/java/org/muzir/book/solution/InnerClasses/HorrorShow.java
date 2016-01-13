package org.muzir.book.solution.InnerClasses;
// : interfaces/HorrorShow.java
// Extending an interface with inheritance.

interface Monster {
	void menace();
}

interface DangerousMonster extends Monster {
	void destroy();
}

interface Lethal {
	void kill();
}

class DragonZilla {
	public DangerousMonster getMonster() {
		return new DangerousMonster() {
			public void destroy() {
			}

			public void menace() {
			}
		};
	}
}

interface Vampire extends DangerousMonster, Lethal {
	void drinkBlood();
}

class VeryBadVampire {
	public Vampire getVampire() {
		return new Vampire() {
			public void menace() {
			}

			public void destroy() {
			}

			public void kill() {
			}

			public void drinkBlood() {
			}
		};
	}
}

public class HorrorShow {
	static void u(Monster b) {
		b.menace();
	}

	static void v(DangerousMonster d) {
		d.menace();
		d.destroy();
	}

	static void w(Lethal l) {
		l.kill();
	}

	public static void main(String[] args) {
		DragonZilla dragonZilla = new DragonZilla();
		DangerousMonster barney = dragonZilla.getMonster();
		u(barney);
		v(barney);
		VeryBadVampire veryBadVampire = new VeryBadVampire();
		Vampire vlad = veryBadVampire.getVampire();
		u(vlad);
		v(vlad);
		w(vlad);
	}
} /// :~
