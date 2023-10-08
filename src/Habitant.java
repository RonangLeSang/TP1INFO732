import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Habitant {

    private String nom;
    private String voie;
    private int numero;
    private int nnig;
    private Date naissance;
    private int poids;
    private ArrayList<Ingestion> dossierMedicale;

    public Habitant(String nom, String voie, int numero, int nnig, Date naissance, int poids, Village village) {
        this.nom = nom;
        this.voie = voie;
        this.numero = numero;
        this.nnig = nnig;
        this.naissance = naissance;
        this.poids = poids;
        this.dossierMedicale = new ArrayList<>();
        village.ajoutHabitant(this);
    }

    public Habitant(Village village){
        Scanner sc = new Scanner(System.in);
        System.out.println("nom ? ");
        nom = sc.nextLine();
        System.out.println("voie ? ");
        voie = sc.nextLine();
        System.out.println("numero ? ");
        numero = sc.nextInt();
        naissance = new Date();
        System.out.println("poids ? ");
        poids = sc.nextInt();
        village.ajoutHabitant(this);
    }

    public String getNom() {
        return nom;
    }

    @Override
    public String toString() {
        return "Habitant{" +
                "nom='" + nom + '\'' +
                ", voie='" + voie + '\'' +
                ", numero=" + numero +
                ", nnig=" + nnig +
                '}';
    }
}
