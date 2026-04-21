public class Ghost extends Character implements Attack {
    public Ghost(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println("The ghost casts a spooky spell.");
    }

}
