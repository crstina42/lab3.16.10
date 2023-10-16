import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Biblioteca Biblioteca=new Biblioteca();



            List<Integer> listaPagini = new ArrayList<>();
            for (int i = 1; i <= 1000; i++) {
                listaPagini.add(i);
            }

        List<Carte> cartiBiblioteca = new ArrayList<>()  ;


        Carte Carte1=new Carte("Anotimpuri","Ana Maria",listaPagini,"Ana are mere multe in gradina");
        Carte Carte2=new Carte("Ciuperci","Morariu",listaPagini,"Ana are mere multe in gradina");
        Carte Carte3=new Carte("Copaci","Ilie",listaPagini,"Ana are mere multe in gradina");

        Biblioteca.addCarte(Carte1);
        Biblioteca.addCarte(Carte2);
        Biblioteca.addCarte(Carte3);

        for (Carte carte : cartiBiblioteca) {
            System.out.println(carte);
        }


    }

}