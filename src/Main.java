import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void menu(){
        System.out.println("0 - sortir");
        System.out.println("1 - afficher");
        System.out.println("2 - ajouter casque");
        System.out.println("3 - prendre casque");
    }

    public static Bataille choixBataille(Village village){
        System.out.println("choix de la bataille :");
        System.out.println("1 - créer une nouvelle bataille");
        System.out.println("2 - prendre une bataille existante");
        Scanner sc = new Scanner(System.in);
        int ans;
        Bataille bataille = null;
        ans = sc.nextInt();
        switch(ans){
            case(1):
                bataille = new Bataille(village);
                break;
            case(2):
                village.afficherBatailles();
                ans = sc.nextInt();
                bataille = village.getBatailles().get(ans-1);
                break;
        }
        return bataille;
    }

    public static Habitant choixHabitant(Village village){
        System.out.println("choix de l'habitant :");
        System.out.println("1 - créer un nouvel habitant");
        System.out.println("2 - prendre un habitant existant");
        Scanner sc = new Scanner(System.in);
        int ans;
        Habitant habitant = null;
        ans = sc.nextInt();
        switch(ans){
            case(1):
                habitant = new Habitant(village);
                break;
            case(2):
                village.afficherHabitants();
                ans = sc.nextInt();
                habitant = village.getHabitants().get(ans-1);
                break;
        }
        return habitant;
    }

    public static void main(String[] args) {

        Muse muse = new Muse("musé");
        Village village = new Village("village gaulois", muse);

        ArrayList<Habitant> combattants = new ArrayList<>();
        combattants.add(new Combattant("jack", "pont de thé", 29,0010201014, new Date(),85, "serrurier", village));
        combattants.add(new Combattant("john", "pont de thé", 29,0010201014, new Date(),85, "serrurier", village));
        combattants.add(new Combattant("jo", "pont de thé", 29,0010201014, new Date(),85, "serrurier", village));
        combattants.add(new Combattant("jean", "pont de thé", 29,0010201014, new Date(),85, "serrurier", village));
        Bataille b1 = new Bataille("bataille de la bute au cerfs", new Date(), new Date(), "chateauroux", combattants, village);

        ArrayList<Habitant> combattants2 = new ArrayList<>();
        combattants2.add(new Combattant("louis", "pont de thé", 29,0010201014, new Date(),85, "serrurier", village));
        combattants2.add(new Combattant("lois", "pont de thé", 29,0010201014, new Date(),85, "serrurier", village));
        combattants2.add(new Combattant("lolo", "pont de thé", 29,0010201014, new Date(),85, "serrurier", village));
        combattants2.add(new Combattant("loic", "pont de thé", 29,0010201014, new Date(),85, "serrurier", village));
        Bataille b2 = new Bataille("bataille du RU", new Date(), new Date(), "annecy", combattants2, village);

        Casque c1 = new Casque("rond", "générale", "neuf", combattants.get(1), b1);
        Casque c2 = new Casque("pointe", "générale", "neuf", combattants2.get(2), b2);

        muse.ajouter(c1);
        muse.ajouter(c2);
//        muse.prendre();
//        muse.afficher();

//        Habitant h1 = new Habitant();
//        Bataille b4 = new Bataille();
//        Casque c9 = new Casque(h1, b4);

        boolean exit = false;
        Scanner sc = new Scanner(System.in);
        int ans;
        while(! exit){
            menu();
            ans = sc.nextInt();
            switch(ans){
                case(0):
                    exit = true;
                    break;
                case(1):
                    muse.afficher();
                    break;
                case(2):
                    Bataille bataille = choixBataille(village);
                    Habitant habitant = choixHabitant(village);
                    muse.ajouter(new Casque(habitant, bataille));
                    break;
                case(3):
                    muse.prendre();
                    break;
            }
        }


    }
}