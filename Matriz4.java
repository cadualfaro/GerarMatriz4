/*
Matriz 4

0	0	0	0	0
1	1	1	1	1
2	2	2	2	2
3	3	3	3	3
 */
package matriz4;
import java.util.Arrays;
public class Matriz4 {

    public static void main(String[] args) {
        System.out.println("Matriz");
            
    int matriz [][] = new int [4][5];
    
        for (int i=0;i<matriz.length;i++)
            for (int j=0;j<matriz[i].length; j++){
                matriz [i][j] = i;
            }
        for (int i=0;i<matriz.length;i++){
            System.out.println(Arrays.toString(matriz[i]));
        }
    }
    
}
