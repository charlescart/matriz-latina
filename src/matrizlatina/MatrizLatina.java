package matrizlatina;
import java.util.Scanner;
public class MatrizLatina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matriz[][] = new int[4][4];
        
        System.out.println(">> primeros 4 valores que conformarán su matriz latina.");
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 4; j++){
                System.out.print("valor en la posición["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        System.out.println(">> tus primeros 4 valores fueron:");
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < 4; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }
    }
}
