package Accsermodifier_Static_method_Static_5;

public class TH_2_Static_Property {
    private String name;
    private String dongco;

    public static int numberOfCars;

    public TH_2_Static_Property(String name, String dongco) {
        this.name = name;
        this.dongco = dongco;
        numberOfCars++;
    }
}
