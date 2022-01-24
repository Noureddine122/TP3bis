public class testMain {
    public static void main(String[] args) {
        Agence a = new Agence(3);
        a.addVoiture(new Voiture("Addidas","C10",2010,99));
        a.addVoiture(new Voiture("Fff","C10",2010,101));
        a.addVoiture(new Voiture("cxv","C10",2010,98));
        Critere c = new CriterePrix(100);
        a.AfficheSelection(c);
    }
}
