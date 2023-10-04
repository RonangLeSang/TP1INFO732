import java.util.ArrayList;

public class Village {

    String nom;
    ArrayList<Habitant> habitants;
    Muse muse;
    ArrayList<Quartier> quartiers;
    ArrayList<Bataille> batailles;


    public Village(String nom, Muse muse) {
        this.nom = nom;
        this.muse = muse;
        this.habitants = new ArrayList<>();
        this.quartiers = new ArrayList<>();
        this.batailles = new ArrayList<>();
    }

}
