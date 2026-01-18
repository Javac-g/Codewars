class Food {
  private final String name;
  private final double protein;
  private final double carbohydrates;
  private final double fat;

  @java.beans.ConstructorProperties({"name", "protein", "carbohydrates", "fat"})
  Food(String name, double protein, double carbohydrates, double fat) {
    this.name = name;
    this.protein = protein;
    this.carbohydrates = carbohydrates;
    this.fat = fat;
  }

  // Getters
  String getName() { return name; }
  double getProtein() { return protein; }
  double getCarbohydrates() { return carbohydrates; }
  double getFat() { return fat; }

  // Calories calculation
  int getCalories() {
    return (int) Math.round(protein * 4 + carbohydrates * 4 + fat * 9);
  }
}
