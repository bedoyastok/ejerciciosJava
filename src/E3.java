class E3{
    public static void main (String [] args){
        
        int [] vectorEntrada = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13, -8};
        int s = 0;
        double promedio = 0;
        
        for(int i = 0; i < vectorEntrada.length; i++){
            
            s = s + vectorEntrada[i];
        }
        promedio = s / vectorEntrada.length;
        
        System.out.println(promedio);
    }
}