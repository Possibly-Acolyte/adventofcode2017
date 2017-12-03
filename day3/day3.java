/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adventofcode;

/**
 *
 * @author Edward
 */
public class day3 {
    public day3(){}
    
    /*
    * Gives the amount of width required for the input
    */
    public int calculateMemoryWidth(int input){
        int sqrt = (int) Math.ceil(Math.sqrt(input));  
        if(sqrt%2 == 0) return sqrt + 1;
        else return sqrt;
    }
    
    public int calculateManhattanDistance(int input){
        int width = calculateMemoryWidth(input);
        int[] q = new int[]{(int)Math.floor(width/2),(int) Math.floor(width/2)};  //q = square 1, always located in the middle
        int[] p = new int[]{width-1, 0}; //p will always lay on the edge of the square, so p1 or p2 will always be 0 or width-1
        boolean found = false;
        int current_number = (int)Math.pow(width, 2);
        for(int rot = 0; rot < 4; rot++){ //we rotate the square as the precise location of the input doesnt matter, only its location compared to the center
            for(int i = 0; i < width -1; i++){
                if(current_number == input){
                    p[1] = width -1 -i;
                    found = true;
                    break;
                }else{
                    current_number--;
                }
            }
            if(found){
                break;
            }
        }
        return ((int)Math.abs(p[0]-q[0])) + ((int)Math.abs(p[1]-q[1]));
    }
}
