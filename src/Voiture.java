public class Voiture {
    String marque;
    String nom_model;
    int annee_production;
    int prix;

    public Voiture(String marque, String nom_model, int annee_production, int prix) {
        this.marque = marque;
        this.nom_model = nom_model;
        this.annee_production = annee_production;
        this.prix = prix;
    }

    @Override
    public String toString() {
        return "Voiture{" +
                "marque='" + marque + '\'' +
                ", nom_model='" + nom_model + '\'' +
                ", annee_production=" + annee_production +
                ", prix=" + prix +
                '}';
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public String getNom_model() {
        return nom_model;
    }

    public void setNom_model(String nom_model) {
        this.nom_model = nom_model;
    }

    public int getAnnee_production() {
        return annee_production;
    }

    public void setAnnee_production(int annee_production) {
        this.annee_production = annee_production;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Voiture voiture)) return false;
        return getAnnee_production() == voiture.getAnnee_production() && getPrix() == voiture.getPrix() && getMarque().equals(voiture.getMarque()) && getNom_model().equals(voiture.getNom_model());
    }
}
interface Critere{
    public boolean isSatisfied(Voiture v);
}