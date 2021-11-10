package Accsermodifier_Static_method_Static_5;

public class TH_1_Static_Method {
    private int rolo;
    private String name;
    private static String colegle;

    public TH_1_Static_Method(int rolo, String name) {
        this.rolo = rolo;
        this.name = name;
    }

    static void change() {
        colegle = "codygym";
    }

    void display() {
        System.out.println(rolo + " " + name + " " + colegle);
    }

}

