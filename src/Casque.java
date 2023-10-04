public class Casque {

    String forme;
    String grade;
    String etat;
    boolean estDansMuse;
    Habitant possesseur;
    Bataille bataille;

    public Casque(String forme, String grade, String etat, boolean estDansMuse, Habitant possesseur, Bataille bataille) {
        this.forme = forme;
        this.grade = grade;
        this.etat = etat;
        this.estDansMuse = estDansMuse;
        this.possesseur = possesseur;
        this.bataille = bataille;
    }
}
