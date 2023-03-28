package threads.task4;

public enum Fork {

    FORK1("gold fork"),
    FORK2("wooden fork"),
    FORK3("silver fork"),
    FORK4("iron fork"),
    FORK5("plastic fork");

    Fork(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    final String name;
}
