import java.util.ArrayList;

public class Village {

    private String nom;
    private ArrayList<Habitant> habitants;
    private Muse muse;
    private ArrayList<Quartier> quartiers;
    private ArrayList<Bataille> batailles;


    public Village(String nom, Muse muse) {
        this.nom = nom;
        this.muse = muse;
        this.habitants = new ArrayList<>();
        this.quartiers = new ArrayList<>();
        this.batailles = new ArrayList<>();
    }

    public ArrayList<Habitant> getHabitants() {
        return habitants;
    }

    public ArrayList<Quartier> getQuartiers() {
        return quartiers;
    }

    public ArrayList<Bataille> getBatailles() {
        return batailles;
    }

    public void ajoutHabitant(Habitant habitant){
        habitants.add(habitant);
    }

    public void afficherHabitants(){
        int i = 1;
        for(Habitant habitant : habitants){
            System.out.println(i + " : " + habitant.toString());
            i++;
        }
    }

    public void ajoutQuartier(Quartier quartier){
        quartiers.add(quartier);
    }

    public void afficherQuartiers(){
        int i = 1;
        for(Quartier quartier : quartiers){
            System.out.println(i + " : " + quartier.toString());
            i++;
        }
    }

    public void ajoutBatailles(Bataille bataille){
        batailles.add(bataille);
    }

    public void afficherBatailles(){
        int i = 1;
        for(Bataille bataille : batailles){
            System.out.println(i + " : " + bataille.toString());
            i++;
        }
    }

}
