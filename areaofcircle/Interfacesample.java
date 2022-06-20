package areaofcircle;
interface sample{
	void area();
}
public class Interfacesample implements sample{
	public static void main(String[] args)
	{
	Interfacesample obj=new Interfacesample();
	obj.area();
	}
	public void area() {
		int radius=5;
		double areaOfCircle=(22*radius*radius)/7;
		System.out.println(areaOfCircle);
	}
}