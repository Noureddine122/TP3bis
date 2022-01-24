public class CriterePrix implements Critere{
    int prix_Critere;

    public CriterePrix(int prix_Critere) {
        this.prix_Critere = prix_Critere;
    }

    @Override
    public boolean isSatisfied(Voiture v) {
        return v.getPrix() <= this.prix_Critere;
    }
}
