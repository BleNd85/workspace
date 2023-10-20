package main.java.com.lab111.labwork2;
/**
* Class which implements interface If2, consists
* of field of Cl1's type, constructor Cl2(), methods which allow to print
* information about class and method in console
 */
public class Cl2 implements If2{
	/**
	 * Field of Cl1's type
	 */
	Cl1 cl1;
	/**
	 * Constructor Cl2() of Cl2
	 */
	public Cl2() {
        super();
    }
	/**
	 * Method which prints information about class and method in console
	 */
    @Override
    public void meth2() {
        System.out.println("Method 2 / " + Cl2.class);
    }
    /**
     * Method which prints information about class and method in console
     */
    @Override
    public void meth1() {
        System.out.println("Method 1 / " + Cl2.class);

    }
}
