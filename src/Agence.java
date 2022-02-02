import java.util.*;

public class Agence {
    List<Voiture> listV;
    Map<Client,Voiture> Locations;

    public Agence(int v) {
        this.listV = new ArrayList<Voiture>(v);
        this.Locations = new TreeMap<Client, Voiture>();
    }
    public void addVoiture(Voiture v){
        this.listV.add(v);
    }
    private List<Voiture> selectionne(Critere c){
        List<Voiture> result = new ArrayList<Voiture>();
        for(Voiture v : listV){
            if(c.isSatisfied(v)){
                result.add(v);
            }
        }
        return result;
    }
    public void AfficheSelectionParCritere(Critere c){
        for(Voiture v :selectionne(c)){
            System.out.println(v);
        }
    }

    public void LoueVoiture(Client c, Voiture v){
        if(!this.listV.contains(v)){
            System.out.println("Desole , "+c.Name+" ,La voiture n'existe pas");
        }else if(estLoue(v)){
            System.out.println("Desole , "+c.Name+" La voiture déja louer ");
        }else if(estLoueur(c)){
            System.out.println("Desole , "+c.Name+" Rendez premierement la voiture");
        }else{
                this.Locations.put(c,v);
                System.out.println("La voiture "+ v.getNom_model()+" est bien louée à "+c.Name);
        }
    }
    public boolean estLoueur(Client client){
        return this.Locations.containsKey(client);
    }
    public boolean estLoue(Voiture v){
        return this.Locations.containsValue(v);
    }
    public void rendVoiture(Client client){
        if(this.Locations.containsKey(client)){
            this.Locations.remove(client);
            System.out.println("Merci "+client.Name+" de votre confiance :)");
        }
    }
    public Iterator lesVoitureLoue(){
        List<Voiture> result = new ArrayList<>();
        for(Map.Entry mm : this.Locations.entrySet()){
            result.add((Voiture) mm.getValue());
        }
        return result.iterator();
    }
    public void LesVoituresClient(){
        for(Map.Entry mm : this.Locations.entrySet()){
            System.out.println(mm.getKey() + " :::: Loue :::: " +mm.getValue());
        }
    }
}
