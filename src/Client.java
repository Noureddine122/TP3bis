public class Client implements Comparable<Client>{
    String Name,Prenom;
    int CIN;
    Civilization civilization;

    public Client(String name, String prenom, int CIN, Civilization civilization) {
        Name = name;
        Prenom = prenom;
        this.CIN = CIN;
        this.civilization = civilization;
    }

    @Override
    public int compareTo(Client o) {
        return this.Name.compareTo(o.Name);
    }
}
enum Civilization {
    Mme,M,Mlle
}