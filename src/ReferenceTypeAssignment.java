class fan
{
	String brand;
	String NoofBlades;
	int Cost;
	}
public class ReferenceTypeAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fan f =new fan();
		f.brand = "Crompton";
		f.NoofBlades = "3";
		f.Cost = 5000;
		System.out.println(f.brand+ " "+ f.NoofBlades+ " "+ f.Cost);
		fan b;
		b=f;
		b.brand = "Usha";
		b.NoofBlades = "4";
		b.Cost = 3000;
		System.out.println(b.brand + " "+b.NoofBlades+ " "+ b.Cost);
	}

}
