import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private List<Carte> carti;

    public Biblioteca(){
        this.carti=new ArrayList<>();
    }

    public void addCarte(Carte carte){
        carti.add(carte);
        System.out.println("Carte adaugata: "+carte.getTitlu());
    }


}
