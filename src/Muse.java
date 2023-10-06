import java.util.ArrayList;
import java.util.Scanner;

public class Muse {

    String name;
    ArrayList<Casque> registre;

    public Muse(String name) {
        this.name = name;
        this.registre = new ArrayList<>();
    }

    public void afficher(){
        int i = 1;
        for(Casque casque : registre){
            System.out.println(i + " : " + casque.toString());
            i++;
        }
    }

    public void ajouter(Casque casque){
        registre.add(casque);
    }

    public void prendre(){
        afficher();
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        registre.get(x-1).setEstDansMuse(false);
    }

}
