package nl.novi.dpcc.builder.problem;

public class ImmutableDog {

    private String name;
    private boolean isFemale;

    public ImmutableDog(String name, boolean isFemale) {
        this.name = name;
        this.isFemale = isFemale;
    }

    public String getName() {
        return name;
    }

    public boolean isFemale() {
        return isFemale;
    }
}
