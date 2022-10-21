/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author sajja
 */
interface NewInterface {
    void playGame();
    void saveGame();
   void quit();
}
abstract class Hello implements NewInterface{
    public void playGame(){
        System.out.println("Play the game!");
    }
    public static void main(String args[]){
        Hello h1=new Hello();
        h1.playGame();
    }

    @Override
    public void saveGame() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
