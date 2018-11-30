package sort;

/*
*    Classe utilizada para agrupar algoritmos.
*/

public class SortingAlgorithms
{
    /**
   * Método de ordenação por inserção (Insertion Sort) - seguindo o pseudocódigo da aula.
   * Você deve utiliza-lo para ordenar arrays de int (integer).
   * @param a conjunto de números a serem ordenados (array)
   * @param n tamanho do array
   * @author Tiago Henrique Nascimento <tiagohn.cc.ufpb@gmail.com>
   * @since 1.0
   * @version 1.0
   */
   
   public int[] insertionSort(int[] a, int n)
   {
        int pivo;
        for (int i = 1; i <= (n - 1); i++) {
            pivo = a[i];
            int j = i - 1;
            while ((j >= 0) && (a[j] > pivo)) {
                a[j + 1] = a[j];
                j = j - 1;
            }
            a[j + 1] = pivo;
        }
        return a;
   }
   
   /**
   * Método de ordenação por seleção (Selection Sort) - seguindo o pseudocódigo da aula.
   * Você deve utiliza-lo para ordenar arrays de int (integer).
   * @param a conjunto de números a serem ordenados (array)
   * @param n tamanho do array
   * @author Tiago Henrique Nascimento <tiagohn.cc.ufpb@gmail.com>
   * @since 1.0
   * @version 1.0
   */
   
   public int[] selectionSort(int[] a, int n)
   {
        for (int i = 0; i <= (n - 1); i++) {
            int i_min = i;
            for (int j = i + 1; j <= (n - 1); j++) {
                if (a[j] < a[i_min]) {
                    i_min = j;
                }
            }
            if (a[i] != a[i_min]) {
                int temp = a[i];
                a[i] = a[i_min];
                a[i_min] = temp;
            }
        }
        return a;
   }
}
