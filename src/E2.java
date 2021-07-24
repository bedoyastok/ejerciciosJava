public class E2 {
    public static void main (String [] args){
        
        int[] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        int s = 0;

        for(int i = 0; i < vectorEntrada.length; i++){
            if (vectorEntrada[i] % 2 == 0 && vectorEntrada[i] > 0){
                s = s + vectorEntrada[i];
            }
        }
        System.out.println(s);
    }
}
