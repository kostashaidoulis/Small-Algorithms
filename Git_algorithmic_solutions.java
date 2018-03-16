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
        
        //Factorial
        
        int fact = 5;
       
       for(int i = 1; i < 5; i++) {
           fact *= i; 
       }
       
       System.out.print(fact);
        
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
        
        //Smaller Bigger in Array With ternary operator
       int arr[] = {1, 3, 10, 45, 23, 1, -2};
       int smaller = arr[0];
       int bigger = arr[0];
       
       for(int i = 0; i < arr.length; i++) {
           
           smaller = smaller > arr[i] ? smaller = arr[i] : smaller;
           bigger = bigger < arr[i] ? bigger = arr[i] : bigger;
           
       }
       System.out.print(smaller);
       System.out.print("\n");
       System.out.print(bigger);
       System.out.print("\n");
    }
    
   //Harmonic Sequence 
    float temp = 1;
    float unchanged = 1;
        
     for(int i = 1; i < 6; i++) {
            if(i == 1) {
                temp = 1;
            } else {
                temp += (unchanged / i);
            }
            System.out.println(temp + " ");
        }
    
    //Pronic Numbers
    int pronic = 0;
    int n = 1;
    //Variable that can be changed by the user
    int set;
    for(int j = 1; j < set + 1; j++) {
            n += 1;
            pronic = j * n;
            
            System.out.println(pronic);
         }
    
}
