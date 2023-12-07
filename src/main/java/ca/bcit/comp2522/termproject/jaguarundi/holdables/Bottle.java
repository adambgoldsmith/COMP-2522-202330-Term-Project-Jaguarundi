package ca.bcit.comp2522.termproject.jaguarundi.holdables;

import java.util.ArrayList;

public class Bottle extends Item {
    private final ArrayList<Ingredient> ingredients;

    public Bottle() {
        this.ingredients = new ArrayList<>();
    }

    public void addIngredient(final Ingredient ingredient) {
        this.ingredients.add(ingredient);
        System.out.println("Added ingredient to bottle");
    }

    public ArrayList<Ingredient> getIngredients() {
        return ingredients;
    }
}