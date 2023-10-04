import java.util.Date;

public class Combattant extends Habitant{

    String specialite;
    Convocation convocation;

    public Combattant(String nom, String voie, int numero, int nnig, Date naissance, int poids, String specialite) {
        super(nom, voie, numero, nnig, naissance, poids);
        this.specialite = specialite;
    }
}
