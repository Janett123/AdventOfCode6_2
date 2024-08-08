import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> zavodyVysledku = new ArrayList<>();
        zavodyVysledku.add(zavody(61, 430));
        zavodyVysledku.add(zavody(67, 1036));
        zavodyVysledku.add(zavody(75, 1307));
        zavodyVysledku.add(zavody(71, 1150));

        //výpočet součinu
        int soucin = 1;
        //cyklus for each pro vypsání hodnot
        for (int i : zavodyVysledku) {
            soucin *= i;
        }

        System.out.println(soucin);

    }

    public static int zavody(int y, int z) {
        List<Integer> seznamVysledku = new ArrayList<>();

        int vysledek = 0;


        for (int i = 1; i < y; i++) {
            vysledek = (y - i) * i;
            // System.out.println(vysledek);

            if (vysledek > z) {
                // System.out.println(vysledek);
                seznamVysledku.add(vysledek);
                //  System.out.println(seznamVysledku);
            }
            //  System.out.println(seznamVysledku);
        }

        int velikostSeznamu = seznamVysledku.size();
        System.out.println(seznamVysledku.size());
        return velikostSeznamu;
    }

}


