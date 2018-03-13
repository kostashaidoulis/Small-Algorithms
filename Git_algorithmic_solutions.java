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
       
       for(int i = 0; i < animals.length; i++) {
           temp = animals[i];
           char first = temp.charAt(0);
           temp = (first != p) ? animals[i] : temp;
           System.out.print(temp);
       }
    }
    
}
