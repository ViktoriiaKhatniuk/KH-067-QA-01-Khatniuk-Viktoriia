import java.util.*;

public class Lists {
    public static void main(String[] args) {
        System.out.println("___List___");
        List<String> shoppingList = new ArrayList<>();
        shoppingList.add("chicken eggs");
        shoppingList.add("salt");
        shoppingList.add("sugar");
        shoppingList.add("regular milk");
        shoppingList.add("flour");
        shoppingList.add("baking soda");
        shoppingList.add("sunflower oil");
        System.out.println(shoppingList.size());
        shoppingList.remove("regular milk");
        System.out.println(shoppingList.size());
        shoppingList.add("oat milk");
        System.out.println(shoppingList.contains("regular milk"));
        System.out.println(shoppingList);
        shoppingList.clear();
        shoppingList.isEmpty();
        System.out.println(shoppingList);

        System.out.println("___Map___");
        Map<String, String> recipe = new HashMap<>();
        recipe.put("chicken eggs", "3 pieces");
        recipe.put("salt", "a quarter teaspoon");
        recipe.put("sugar", "two tablespoons");
        recipe.put("regular milk", "500 ml");
        recipe.put("flour", "190g");
        recipe.put("baking soda", "a quarter teaspoon");
        recipe.put("sunflower oil", "three tablespoons");
        String ingredients = recipe.get("sugar");
        System.out.println(ingredients);
        System.out.println(recipe.containsKey("salt"));
        System.out.println(recipe.containsValue("500 ml"));
        if (!recipe.isEmpty()) {
            System.out.println(recipe);
        }
        System.out.println("Ingredients for pancakes: ");
        for (Map.Entry entry : recipe.entrySet()) {
            System.out.println(entry);
        }

        System.out.println("___Set___");
        Set<String> purchases = new HashSet<>();
        purchases.add("tomatoes");
        purchases.add("vinegar");
        purchases.add("salmon");
        purchases.add("apples");
        purchases.add("water");
        purchases.add("oat milk");
        purchases.add("dog food");
        purchases.add("chicken eggs");
        purchases.add("dog food");
        System.out.println(purchases.size());
        System.out.println(purchases.contains("salt"));
        System.out.println(shoppingList.equals(purchases));
        System.out.println(purchases);
        purchases.remove("tomatoes");
        System.out.println(purchases);
        purchases.clear();
        System.out.println(purchases.isEmpty());

        System.out.println("___Queue___");
        Queue<String> cooking = new ArrayDeque<>();
        cooking.offer("chicken eggs");
        cooking.offer("salt ");
        cooking.offer("sugar");
        cooking.offer("milk");
        cooking.offer("flour");
        cooking.offer("baking soda");
        cooking.offer("sunflower oil");
        System.out.println("To make pancakes, prepare the following ingredients: ");
        System.out.println(cooking);
        System.out.println("First af all take " + ((ArrayDeque<String>) cooking).removeFirst() + ", " +
                ((ArrayDeque<String>) cooking).removeFirst() + ", " + ((ArrayDeque<String>) cooking).removeFirst()
                + " and mix it together.");
        System.out.println("After that add warm " + ((ArrayDeque<String>) cooking).removeFirst() + " and blend it.");
        System.out.println("Next step is to add " + ((ArrayDeque<String>) cooking).removeFirst() + " with " +
                ((ArrayDeque<String>) cooking).removeFirst() + " and whip by a whisk.");
        System.out.println("The last step is adding " + ((ArrayDeque<String>) cooking).removeLast() +
                ". Pancake dough is ready.");
        System.out.println(cooking);
    }
}