import java.util.Scanner;

public class Casque {

    private String forme;
    private String grade;
    private String etat;
    private boolean estDansMuse;
    private Habitant possesseur;
    private Bataille bataille;

    public Casque(Habitant possesseur, Bataille bataille){
        Scanner sc = new Scanner(System.in);
        System.out.println("forme ? ");
        forme = sc.nextLine();
        System.out.println("grade ? ");
        grade = sc.nextLine();
        System.out.println("etat ? ");
        etat = sc.nextLine();
        this.estDansMuse = true;
        this.possesseur = possesseur;
        this.bataille = bataille;
    }

    public Casque(String forme, String grade, String etat, Habitant possesseur, Bataille bataille) {
        this.forme = forme;
        this.grade = grade;
        this.etat = etat;
        this.estDansMuse = true;
        this.possesseur = possesseur;
        this.bataille = bataille;
    }

    public void setEstDansMuse(boolean estDansMuse) {
        this.estDansMuse = estDansMuse;
    }

    @Override
    public String toString() {
        return "Casque{" +
                "forme='" + forme + '\'' +
                ", grade='" + grade + '\'' +
                ", etat='" + etat + '\'' +
                ", estDansMuse=" + estDansMuse +
                ", possesseur=" + possesseur.getNom() +
                ", bataille=" + bataille.getNom() +
                '}';
    }
}
