package matrizlatina;
import java.util.Scanner;
public class MatrizLatina {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fila = 0, column = 0;
        
        System.out.print(">> Introduzca el tamano de su matriz NxN: ");
        fila = column = sc.nextInt();
        int matriz[][] = new int[fila][column];
       
        System.out.println("\n>> Se construira una matriz de "+fila+"x"+column);
        
        System.out.println("\n>> primeros "+fila+" valores que conformarán su matriz latina.");
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < column; j++){
                System.out.print("valor en la posición["+i+"]["+j+"]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("\n>> tus primeros "+fila+" valores fueron:");
        for(int i = 0; i < 1; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("\n");
        }
        
        for(int i = 1; i < fila; i++){
            for(int j = 0; j < column; j++){
                if(j != 0) { // saltando cuando j es igual a cero, porque es con otra formula
                    matriz[i][j] = matriz[i-1][j-1]; //matriz[1][1] = matrtiz[0][0]
                } else { // J es cero
                    matriz[i][j] = matriz[i-1][column-1];
                }
            }
        }
        //soy oriana y oriannys y venimos a practicar por primera vez
        for(int i = 0; i < fila; i++){
            for(int j = 0; j < column; j++){
                System.out.print(matriz[i][j]+" ");
            }
            System.out.print("\n");
        }
        
    }
}
