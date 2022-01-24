import java.util.ArrayList;
import java.util.List;

public class InterCritere implements Critere{
    List<Critere> listCrit;

    public InterCritere() {
        this.listCrit = new ArrayList<Critere>();
    }
    public void add(Critere c){
        this.listCrit.add(c);
    }

    @Override
    public boolean isSatisfied(Voiture v) {
        for(Critere c : listCrit){
            if(!c.isSatisfied(v)){
                return false;
            }
        }
        return true;
    }
}
