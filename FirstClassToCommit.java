public class FirstClassToCommit{

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FirstClassToCommit(String name) {
        this.name = name;
    }

    public FirstClassToCommit() {
    }

    @Override
    public String toString() {
        return "FirstClassToCommit{}";
    }
}
