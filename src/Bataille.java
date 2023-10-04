import java.util.ArrayList;
import java.util.Date;

public class Bataille {

    String nom;
    Date dateDebut;

    public Bataille(String nom, Date dateDebut, Date dateFin, String lieux, ArrayList<Habitant> participants) {
        this.nom = nom;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.lieux = lieux;
        this.participants = participants;
    }

    Date dateFin;
    String lieux;
    ArrayList<Habitant> participants;

}
