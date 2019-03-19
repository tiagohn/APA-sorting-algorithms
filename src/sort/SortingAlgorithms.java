package sort;

/*
*    Classe utilizada para agrupar algoritmos.
*    @version 1.1
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

   /**
   * Método de ordenação por meio da divisão e conquista (Merge Sort) - seguindo o pseudocódigo da aula.
   * Você deve utiliza-lo para ordenar arrays de int (integer).
   * @param a conjunto de números a serem ordenados (array)
   * @param p indica posição do primeiro número do array a ser ordenado
   * @param r indica a posição do ultimo número do array a ser ordenado
   * @return array ordenado
   * @author Tiago Henrique Nascimento <tiagohn.cc.ufpb@gmail.com>
   * @since 1.1
   * @version 1.0
   */
  
    public int[] mergeSort(int[] a, int p, int r)
    {
        if (p < r) {
            int q = Math.round((p + r) / 2); //round retorna um int arredondando sempre para cima. O Math.floor() retorna um double arredondando para baixo.
            mergeSort(a, p, q);
            mergeSort(a, q + 1, r);
            merge(a, p, q, r);
        }
        return a;
    }
  
    private void merge(int[] a, int p,int q, int r)
    {
        int left[] = cut(a, p, q);
        int right[] = cut(a, q+1, r);
        
        int i = 0;
        int j = 0;
      
        for (int k = p; k <= r; k++) {
            if(i == left.length) {
                // indice de "left" (i) finalizado
                a[k] = right[j];
                j += 1;
            } else if(j == right.length){
                // indice do "right" (j) finalizado
                a[k] = left[i];
                i += 1;
            } else if (left[i] < right[j]) {
                // "left" < "right"
                a[k] = left[i];
                i += 1;
            } else {
                // "right" <= "left"
                a[k] = right[j];
                j += 1;
            }
        }
    }

   /**
   * Método fragmentador de array.
   * Você deve utiliza-lo para extrair um fragmento de um conjunto de dados (array de Integers).
   * @param a conjunto de dados no qual será extraido o fragmento(array)
   * @param start indica a posição do primeiro elemento a ser capturado.
   * @param end indica a posição do ultimo elemento a ser capturado.
   * @return fragmento retirado do conjunto de dados (array) original.
   * @author Tiago Henrique Nascimento <tiagohn.cc.ufpb@gmail.com>
   * @since 1.1.0
   * @version 1.0
   */
  
    private int[] cut (int[] a, int start, int end)
    {
        int[] arr = new int[((end - start) + 1)];
        int count = 0;
        for (int i = start; i <= end; i++) {
            arr[count] = a[i];
            count ++;
        }
        return arr;
    }
}
