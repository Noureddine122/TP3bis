public class CritereAnneeProdution implements Critere{
    int annee_production;

    public CritereAnneeProdution(int annee_production) {
        this.annee_production = annee_production;
    }

    @Override
    public boolean isSatisfied(Voiture v) {
        return this.annee_production == v.getAnnee_production();
    }
}
