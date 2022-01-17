
package za.co.bakery.domain;

import java.util.ArrayList;

/**
 *
 * @author StuartLittle
 */
public class Recipe {
    private String steps;
    private ArrayList<IngredientItem> ingredients;
    private String recipeName;
    private int recipeID;

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.recipeID;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Recipe other = (Recipe) obj;
        if (this.recipeID != other.recipeID) {
            return false;
        }
        return true;
    }

    public Recipe(String steps, ArrayList<IngredientItem> ingredients, String recipeName) {
        this.steps = steps;
        this.ingredients = ingredients;
        this.recipeName = recipeName;
    }
    
    public String getRecipeName() {
        return recipeName;
    }

    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
   

    public String getSteps() {
        return steps;
    }

    public void setSteps(String steps) {
        this.steps = steps;
    }

    public ArrayList<IngredientItem> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<IngredientItem> ingredients) {
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return recipeName;
    }
    
}
