public class Quartier {

    private String name;
    private Drapeau drapeau;

    public Quartier(String name, Drapeau drapeau) {
        this.name = name;
        this.drapeau = drapeau;
    }

    @Override
    public String toString() {
        return "Quartier{" +
                "name='" + name + '\'' +
                '}';
    }
}
