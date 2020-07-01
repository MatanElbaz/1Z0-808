package Tests;

public class Question58 {
	public String name;
	public int moons;
	public Question58(String name, int moons) {
		this.name = name;
		this.moons = moons;
	}
	public static void main(String[] args) {
		Question58[] planets = {
				new Question58("Mercury", 0),
				new Question58("Venus", 0),
				new Question58("Earth", 1),
				new Question58("Mars", 2)
		};
		System.out.println(planets);
		System.out.println(planets[2]);
		System.out.println(planets[2].moons);
		//Correct Answer: C
	}

}
