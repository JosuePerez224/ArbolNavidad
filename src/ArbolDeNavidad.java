import java.util.Random;

public class ArbolDeNavidad {
    static String tree; //String that shows the result in console
    static int height = 4; //Specifies the tree's height
    static String[] prop = {"@", "*", "◯"}; //Props that are going to use in tree
    static Random random = new Random(); //Instantiate of random to create random numbers

    public static void main(String[] args) {
        tree = GenerarArbol(height);
        System.out.println(tree);
        System.out.println();
    }

    public static String GenerarArbol(int height){
        String trees = "";
        int p;

        for(int i = 1; i <= height; i++){
            trees = trees + GenerarEspacios(height - i);
            p = random.nextInt(2);

            for (int j = 0; j < i; j++){
                trees = trees  + " " + prop[p];
            }
            trees = trees + "\n";
        }

        return trees;
    }

    public static String GenerarEspacios(int n){
        String space = "";
        for (int i = 0; i < n; i++){
            space = space + " ";
        }
        return space;
    }
}
