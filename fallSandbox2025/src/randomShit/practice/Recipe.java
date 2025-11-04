package randomShit.practice;

public class Recipe implements IRecipe {

    private String name = "Spaghetti";
    private String [] ingredients;

    public Recipe(String name, String[] ingredients){
        this.name = name;
        this.ingredients = ingredients;
    }
    
    public void combineIngredients(int a, int b){

        String [] newIngredientList = new String[ingredients.length-1];

        int index = 0;
        
        for (int c = 0; c < ingredients.length; c++) {
            if (c == 0){
                newIngredientList[index++] = ingredients[a] + ingredients[b];
            }else{
                newIngredientList[index++] = ingredients[c];
            }
        }
        
    }
    // Recipe r = new Recipe();
    // r.combineIngredients(1,2);


}
