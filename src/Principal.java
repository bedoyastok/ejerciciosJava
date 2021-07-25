import java.util.Scanner;

public class Principal {
    public static void main(String[] args){

        Scanner lector = new Scanner(System.in);
        int num = 0;
        int contadorImpar = 0;

        do{
            System.out.println("Ingrese un numero > 1 y < 9: ");
            num = lector.nextInt();
        } while(num > 1 && num < 9); 
        System.out.println("tu numero es: " + num);

        System.out.println("La tabla del numero: " + num);
        for(int i = 1; i <= 100; i++){
            System.out.println(num + " x " + i + " = " + num * i);

            if((num * 1) % 2 == 1){
                contadorImpar++;
            }
        }
        System.out.println(contadorImpar);
    }
}
