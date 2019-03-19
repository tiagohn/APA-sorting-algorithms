package sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.List;

import SortingAlgorithms;

public class MainClass {  
    public static void main(String args[]) {
        String msgIn = null;
        List<String> list = new LinkedList<String>();
         
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
         
        try
        {
            while ((msgIn = reader.readLine()) != null) {
                list.add(msgIn);           
            }
            
            int cap[] = new int[list.size()];
            
            for (int index = 0; index < list.size(); index++) {
            	cap[index] = Integer.parseInt(list.get(index));
            }
            
            SortingAlgorithms run = new SortingAlgorithms();
            
            int resultIS[] = run.insertionSort(cap.clone(), cap.length);
            int resultSS[] = run.selectionSort(cap.clone(), cap.length);
            int resultMS[] = run.mergeSort(cap.clone(), 0, (cap.length-1));
           
            print(cap, "Original array");
            print(resultIS, "Insertion Sort");
            print(resultSS, "Selection Sort");
            print(resultMS, "Merge Sort");
         
        } catch (NumberFormatException | IOException e) {
            e.printStackTrace();
        }
    }
  
    public static void print(int[] a, String title)
    {
        System.out.println(title);
        for (int i = 0; i < a.length; i++) {
            if (i%15 == 0) { 
                System.out.print("\n");
            }
            System.out.print(a[i] + "  ");
        }
        System.out.print("\n\n");
    }
}
