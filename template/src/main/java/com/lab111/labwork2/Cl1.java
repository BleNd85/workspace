package main.java.com.lab111.labwork2;
/**
* Class which implements interface If1, consists
* of field of Cl1's type, constructor Cl1(), methods which allow to print
* information about class and method in console
 */
public class Cl1 implements If1{
	/**
	 * Field of Cl1's type
	 */
	Cl1 cl1;
	
	/**
	 * Constructor Cl1() of Cl1
	 */
    public Cl1() {
    }
    /**
     * Method which prints information about class and method in console
     */
    @Override
    public void meth1() {
        System.out.println("Method 1 / " + Cl1.class);
    }
}
