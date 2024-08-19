public class ArbolDeNavidad {
    static String tree;
    static int height = 4;
    static String[] prop = {"@", ""}; //Falta poner los adornos
    public static void main(String[] args) {

        tree = GenerarArbol(height);
        System.out.println(tree);


    }

    public static String GenerarArbol(int height){
        String trees = "";

        for(int i = 1; i <= height; i++){
            trees = trees + GenerarEspacios(height - i);

            for (int j = 0; j < i; j++){
                trees = trees  + " " + "*";
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
