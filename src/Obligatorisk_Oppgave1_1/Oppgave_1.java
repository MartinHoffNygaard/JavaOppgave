package Obligatorisk_Oppgave1_1;

public class Oppgave_1 {
    public static void main(String[] args) {

	double radius = 23.5;
	double areal = Sirkel.beregnAreal(radius);
	double omkrets = Sirkel.beregnOmkrets(radius);
	double diameter = Sirkel.beregnDiameter(radius);

        System.out.println("Arealet av sirkelen med radius "+String.format("%.1f", radius)+" er "+String.format("%.2f", areal));
        System.out.println("Omkretsen av sirkelen med radius "+String.format("%.1f", radius)+" er "+String.format("%.2f", omkrets));
        System.out.println("Diameteren til sirkelen med radius "+String.format("%.1f", radius)+" er "+String.format("%.2f", diameter));

    }
}
