package factory;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ali Othman
 */
//Create a Factory to generate object of concrete class based on given information.
public class ShapeFactory {
    //use getShape method to get object of type shape 
    public Shape getShape(String shapetype){
        if (shapetype==null) {
           return null;
        }
        if (shapetype.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapetype.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        if (shapetype.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        
        return null;
    }
}
