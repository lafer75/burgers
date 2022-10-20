public class BurgerMain {
    public String bun;
    public String meat;
    public String doublemeat;
    public String cheese;
    public String greens;
    public String mayonnaise;

    public BurgerMain(String bun, String meat, String cheese, String greens, String mayonnaise) {
        System.out.println("Simple burgers");
        this.setValues(bun, meat, cheese, greens, mayonnaise);
        System.out.println(this.getValues());
    }

    public BurgerMain(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println("Diet burger");
        System.out.println(this.getValuess());
    }

    public BurgerMain(String bun, String meat, String doublemeat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.doublemeat = doublemeat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Double meat");
        System.out.println(this.getValuesss());
    }

    public void setValues(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
    }

    public String getValues() {
        String info = "In a burgers " + this.bun + " " + this.meat + " " + this.cheese + " " + this.greens + " " + this.mayonnaise;
        return info;
    }

    public String getValuess() {
        String info = "In a burgers " + this.bun + " " + this.meat + " " + this.cheese + " " + this.greens;
        return info;
    }

    public String getValuesss() {
        String info = "In a burgers " + this.bun + " " + this.meat + " " + this.doublemeat + " " + this.cheese + " " + this.greens + " " + this.mayonnaise;
        return info;
    }
}
