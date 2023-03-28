package serialization.task1;

public class Horse extends Animal {
    private final boolean haveHorseshoes;

    public Horse(String name, boolean haveHorseshoes) {
        super(name);
        this.haveHorseshoes = haveHorseshoes;
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name=" + getName() + ", " +
                "there are horseshoes=" + haveHorseshoes +
                '}';
    }
}
