/**
 * CoffeeMaker.java version 1.0 Jan 20, 2011
 * @author Trevor Douglas
 *
 * @version
 */



/**
 * <code>CoffeeMaker</code> - It makes coffee!! 
 * 
 */
public class CoffeeMaker {
	public static final int MAX_NUM_RECIPES = 4; // Maximum number of recipes
	public static final int MAX_INVENTORY = 20;
	private Recipe[] recipeArray; // This is the array of recipes
	private int numRecipes = 0;
	private Inventory inventory; // This is our inventory in the coffee maker
	
	/**
	 * Constructor for the coffee maker
	 * The inventory should be created and filled.
	 */
	public CoffeeMaker() {
		//Setup inventory

	}

	
	/**
	 * Getter of the property <tt>inventory</tt>
	 *
	 * @return Returns the inventory.
	 */
	public Inventory getInventory() {
		return inventory;
	}

	/**
	 * addRecipe Method
	 *
	 * @param recipe
	 *            Will add a recipe if possible
	 * @return true or false
	 */
	public boolean addRecipe(Recipe recipe) {


		return false;

	}

	/**
	 * getRecipe Method
	 *
	 * @param recipeName
	 *            name String
	 * @return Recipe or NULL
	 */
	public Recipe getRecipe(String recipeName) {

		return null;
	}

	/**
	 * deleteRecipe Method
	 *
	 * @param recipeName
	 *            Will delete a recipe if possible
	 * @return true or false
	 */
	public boolean deleteRecipe(String recipeName) {

		return false;
	}


	/**
	 * makeCoffee Method
	 *
	 * @param recipeName
	 *            Will make the coffee if the recipe is there
	 * @return true or false
	 */
	public boolean makeCoffee(String recipeName) {

		return false;
	}


}
