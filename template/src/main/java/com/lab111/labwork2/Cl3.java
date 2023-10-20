package main.java.com.lab111.labwork2;
/**
* Class which extends class Cl1, implements interface If3, consists
* of field of If1's type, constructor Cl3(), methods which allow to print
* information about class and method in console
 */
public class Cl3 extends Cl1 implements If3 {
	/**
	 * Field of If1's type
	 */
	If1 if1;
	/**
	 *  Constructor Cl3() of Cl3
	 */
	public Cl3() {
        
    }
	/**
	 * Method which prints information about class and method in console
	 */
    public void meth3() {
        System.out.println("Method 3 / " + Cl3.class);
    }
    /**
	 * Method which prints information about class and method in console
	 */
    @Override
    public void meth2() {
        System.out.println("Method 2 / " + Cl3.class);
    }
    /**
	 * Method which prints information about class and method in console
	 */
    @Override
    public void meth1() {
    	System.out.println("Method 1 / " + Cl3.class);
    }
}
