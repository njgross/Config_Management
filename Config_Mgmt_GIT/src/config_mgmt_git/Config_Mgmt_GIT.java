/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config_mgmt_git;

/**
 *
 * @author gross_000
 */
public class Config_Mgmt_GIT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ninety_Nine_Bottles_Of_Beer();
    }
    
    public static void Ninety_Nine_Bottles_Of_Beer(){
    for(int i=99; i>1; i--){
    System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer");
    System.out.println("take one down, pass it around, "+(i-1)+" bottles of beer on the wall.");
            }
    System.out.println("1 bottle of beer on the wall, 1 bottle of beer");
    System.out.println("take one down, pass it around, no more bottles of beer on the wall.");
}
    
}

