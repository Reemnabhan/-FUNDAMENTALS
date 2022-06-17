package be.intecbrussel.nature.plants;

public class Tree extends Plant {
    private LeafType leafType;

    public Tree(String name) {
        super(name);
    }

    public Tree(String name, double height) {
        super(name, height);
    }

    public void setLeafType(LeafType leafType) {
        this.leafType = leafType;
    }

    public LeafType getLeafType() {
        return leafType;
    }

    @Override
    public String toString() {
        return "Tree "+super.toString() + ", leafType=" + leafType +"\n";
    }

}


