/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mathi
 */
import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds;
    
    public BirdDatabase(){
        this.birds = new ArrayList<>();
    }
    
    public void add(Bird bird){
        this.birds.add(bird);
    }
    
    public void printAll(){
        for(Bird bird : birds){
            System.out.println(bird);
        }
    }
    
    public Bird printOne(String name){
        for(Bird bird : birds){
            if(bird.getName().equals(name)){
                return bird;
            }
        }
        return null;
    }
    
    public boolean observation(String name){
        for(Bird bird : birds){
            if(bird.getName().equals(name)){
                bird.observation();
                return true;
            }
        }
        return false;
    }
}
