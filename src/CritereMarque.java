public class CritereMarque implements Critere{
    String Critere_Marque;

    public CritereMarque(String critere_Marque) {
        Critere_Marque = critere_Marque;
    }

    @Override
    public boolean isSatisfied(Voiture v) {
        return v.getMarque().equals(this.Critere_Marque);
    }
}
