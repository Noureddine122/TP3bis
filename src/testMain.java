import java.util.Iterator;

public class testMain {
    public static void main(String[] args) {
        Agence a = new Agence(3);
        Voiture Adidas2009 = new Voiture("Addidas","C10",2009,99);
        Voiture Renault2009 = new Voiture("Renault","C10",2009,99);
        Voiture Tayota2010 = new Voiture("Tayota","C10",2010,98);
        a.addVoiture(Adidas2009);
        a.addVoiture(Renault2009);
        a.addVoiture(Tayota2010);
        // Les Criteres
        Critere MarqueRenault = new CritereMarque("Renault");
        Critere Anee2009 = new CritereAnneeProdution(2009);
        Critere prix100 = new CriterePrix(100);
        InterCritere gc = new InterCritere();
        gc.add(MarqueRenault);
        gc.add(Anee2009);
        gc.add(prix100);
        // Les Clients
        Client NoureddineAchibane = new Client("Noureddine","Achibane",1234,Civilization.M);
        Client OmarIbrahimi = new Client("Omar","Ibrahimi",1234,Civilization.M);
        // Louer les Voiteures
        a.LoueVoiture(NoureddineAchibane,Adidas2009);
        a.LoueVoiture(OmarIbrahimi,Renault2009);
        a.rendVoiture(NoureddineAchibane);
        a.LoueVoiture(NoureddineAchibane,Tayota2010);
        Iterator it = a.lesVoitureLoue();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        a.LesVoituresClient();
        //a.AfficheSelectionParCritere(gc);
    }
}
