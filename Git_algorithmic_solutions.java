/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_algorithmic_solutions;

/**
 *
 * @author kostasch
 */
public class Git_algorithmic_solutions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       // Display all words except the ones begining with a letter e.x "p"
        
       String animals[] = {"cat", "dog", "pig", "rabit", "parrot"};
       String temp = "";
       char p = 'p';
       
       for(int i = 0; i < animals.length; i++) {
           temp = animals[i];
           char first = temp.charAt(0);
           if(first != p) {
               System.out.print(temp + "\n");
           } 
       }
        
       // Reverse an Array 
       int arr[] = {1, 3, 10, 45, 23, 1, -2};
       int arr_reverse[] = new int[arr.length];
       int temp = 0;
       int count = 0;
       
       for(int i = arr.length; i > 0; i--) {
           counter += 1;
           temp = arr[i - 1];
           arr_reverse[count - 1] = temp;
       }
       
       for(int i = 0; i < arr.length; i++) {
           System.out.print(arr[i] + " ");
       }
        
       System.out.print("\n");
        
       for(int i = 0; i < arr_reverse.length; i++){
           System.out.print(arr_reverse[i] + " ");
       }
        
    }
    
}
