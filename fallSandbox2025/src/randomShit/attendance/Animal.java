package randomShit.attendance;

public abstract class Animal {
    private final String name;

    protected Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract String getType();

    public String describe() {
        return getType() + " named " + name;
    }
}
