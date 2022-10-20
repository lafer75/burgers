public class burger {
    public burger() {
    }

    public static void main(String[] args) {
        new BurgerMain("Bun 1", "Meat 1", "Cheese 1", "Greens 1", "Mayonnaise 1");
        new BurgerMain("Bun 1", "Meat 1", "Cheese 1", "Greens 1");
        new BurgerMain("Bun 1", "Meat 1", "Meat 2", "Cheese 1", "Greens 1", "Mayonnaise 1");
    }
}