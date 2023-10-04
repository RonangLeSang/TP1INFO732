import java.util.ArrayList;

public class Potion {

    String nom;
    String attribut;
    int tempsPause;
    int duree;
    ArrayList<Dose> doses;

    public Potion(String nom, String attribut, int tempsPause, int duree, ArrayList<Dose> doses) {
        this.nom = nom;
        this.attribut = attribut;
        this.tempsPause = tempsPause;
        this.duree = duree;
        this.doses = doses;
    }
}
