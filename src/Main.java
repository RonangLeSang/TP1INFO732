import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ArrayList<Habitant> combattants = new ArrayList<>();
        combattants.add(new Combattant("jack", "pont de thé", 29,0010201014, new Date(),85, "serrurier"));
        combattants.add(new Combattant("john", "pont de thé", 29,0010201014, new Date(),85, "serrurier"));
        combattants.add(new Combattant("jo", "pont de thé", 29,0010201014, new Date(),85, "serrurier"));
        combattants.add(new Combattant("jean", "pont de thé", 29,0010201014, new Date(),85, "serrurier"));
        Bataille b1 = new Bataille("bataille de la bute au cerfs", new Date(), new Date(), "chateauroux", combattants);

        ArrayList<Habitant> combattants2 = new ArrayList<>();
        combattants2.add(new Combattant("louis", "pont de thé", 29,0010201014, new Date(),85, "serrurier"));
        combattants2.add(new Combattant("lois", "pont de thé", 29,0010201014, new Date(),85, "serrurier"));
        combattants2.add(new Combattant("lolo", "pont de thé", 29,0010201014, new Date(),85, "serrurier"));
        combattants2.add(new Combattant("loic", "pont de thé", 29,0010201014, new Date(),85, "serrurier"));
        Bataille b2 = new Bataille("bataille du RU", new Date(), new Date(), "annecy", combattants2);

        Muse muse = new Muse("musé");
        Village village = new Village("village gaulois", muse);

        Casque c1 = new Casque("rond", "générale", "neuf", combattants.get(1), b1);
        Casque c2 = new Casque("pointe", "générale", "neuf", combattants2.get(2), b2);

        muse.ajouter(c1);
        muse.ajouter(c2);
        muse.prendre();
        muse.afficher();


    }
}