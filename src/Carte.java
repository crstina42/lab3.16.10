import java.util.ArrayList;
import java.util.List;

public class Carte {
    String autor;
    String titlu;
    String text;

    List<Integer> pagini;


    public Carte(String titlu, String autor, List<Integer> pagini, String text) {

        this.titlu = titlu;
        this.autor = autor;
        this.pagini=pagini;
        this.text=text;
    }
    private List<Integer> generatePageNumbers(int numarPagini) {
        List<Integer> listaPagini = new ArrayList<>();
        for (int i = 1; i <= numarPagini; i++) {
            listaPagini.add(i);
        }
        return listaPagini;
    }

    public String getTitlu() {
        return titlu;
    }

    @Override
    public String toString() {
        return titlu+" "+autor+" "+pagini+" "+text;
    }
}
