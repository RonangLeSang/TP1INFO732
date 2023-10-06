import java.util.Scanner;

public class Casque {

    String forme;
    String grade;
    String etat;
    boolean estDansMuse;
    Habitant possesseur;
    Bataille bataille;

    public Casque(){
        Scanner sc = new Scanner(System.in);
        System.out.println("forme ? ");
        forme = sc.nextLine();
        System.out.println("grade ? ");
        grade = sc.nextLine();
        System.out.println("etat ? ");
        etat = sc.nextLine();
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
