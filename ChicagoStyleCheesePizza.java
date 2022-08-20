/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzatestedrive;

/**
 *
 * @author Alunos
 */
public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza () {
name ="Chicago Style Deep Dish Cheese Pizza";
dough = "Extra Thick Crust Dough";
sauce = "Plum Tomato Sauce";
toppings.add("Shredded Mozzarella Cheese");


}
    @Override
void cut () {

System.out.println("Cutting Pizza into square slices");

}
    
}
