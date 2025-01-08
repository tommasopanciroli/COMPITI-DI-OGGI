//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        System.out.print(Main.concat("Ciao sono Tommaso e sono nato nel", 2003));
        System.out.print(inserisciInArray(new String[]{"Tommaso", "Valerio", "Valentina", "Martino", "Francesco"}, "Ciaone ragazzi"));
        System.out.print(Main.moltiplicazione(6, 8));
        ;
    }


    public static int moltiplicazione(int num1, int num2) {
        return num1 * num2;
    }

    public static String[] inserisciInArray(String[] nomi, String str) {
        if (nomi.length != 5) throw new Error("Errore dell'array");
        String[] array = new String[6];
        array[0] = nomi[0];
        array[1] = nomi[1];
        array[2] = str;
        array[3] = nomi[3];
        array[4] = nomi[4];
        array[5] = nomi[5];
        return array;

    }


    public static String concat(String str, int num) {
        return str + " " + num;
    }
}




