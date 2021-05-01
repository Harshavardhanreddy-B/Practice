
public class ClassReference {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dog d = new Dog();
		d.name = "lobo";
		d.Breed = "Pug";
		d.Cost = "500";
		System.out.println(d.name +" "+d.Breed+" "+d.Cost);

	}

}

class Dog {
	String name;
	String Breed;
	String Cost;
}
