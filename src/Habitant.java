import java.util.ArrayList;
import java.util.Date;

public class Habitant {

    String nom;
    String voie;
    int numero;
    int nnig;
    Date naissance;

    public Habitant(String nom, String voie, int numero, int nnig, Date naissance, int poids) {
        this.nom = nom;
        this.voie = voie;
        this.numero = numero;
        this.nnig = nnig;
        this.naissance = naissance;
        this.poids = poids;
        this.dossierMedicale = new ArrayList<>();
    }

    int poids;
    ArrayList<Ingestion> dossierMedicale;


}
