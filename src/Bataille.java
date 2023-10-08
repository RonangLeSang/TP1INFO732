import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Bataille {

    private String nom;
    private Date dateDebut;
    private Date dateFin;
    private String lieux;
    private ArrayList<Habitant> participants;

    public Bataille(String nom, Date dateDebut, Date dateFin, String lieux, ArrayList<Habitant> participants, Village village) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.lieux = lieux;
        this.participants = participants;
        village.ajoutBatailles(this);
    }

    public Bataille(Village village){
        Scanner sc = new Scanner(System.in);
        System.out.println("nom ? ");
        nom = sc.nextLine();
        dateDebut = new Date();
        dateFin = new Date();
        System.out.println("lieux ? ");
        lieux = sc.nextLine();
        participants = new ArrayList<>();
        village.ajoutBatailles(this);
    }

    public String getNom() {
        return nom;
    }

    public void ajouter(Habitant habitant){
        participants.add(habitant);
    }

    @Override
    public String toString() {
        return "Bataille{" +
                "nom='" + nom + '\'' +
                ", lieux='" + lieux + '\'' +
                '}';
    }
}
