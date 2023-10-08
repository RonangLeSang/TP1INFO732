import java.util.Date;

public class Combattant extends Habitant{

    private String specialite;
    private Convocation convocation;

    public Combattant(String nom, String voie, int numero, int nnig, Date naissance, int poids, String specialite, Village village) {
        super(nom, voie, numero, nnig, naissance, poids, village);
        this.specialite = specialite;
    }
}
