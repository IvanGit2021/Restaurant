package academy.mindswap;

public class Restaurant {
    private boolean isFull;
    private int numberOfOccupiedTables;
    private Table[] tables;

    public Restaurant(Table[] tables) {
        this.tables = tables;
    }
    public boolean isFull() {
        return isFull;
    }
    public int getNumberOfOccupiedTables() {
        return numberOfOccupiedTables;
    }
    public void setFull(boolean full) {
        isFull = full;
    }
    public void findTable() {}
    public void freeTable() {}
    public void order() {}
    private void checkIfTableCanBeFreed() {}
    private void occupyTable() {}

}
