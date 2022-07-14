package academy.mindswap;

public class Table {

    private boolean isFree;
    private String order;

    public Table() {
        this.isFree = true;
        this.order = "";
    }
    public boolean isFree() {
        return isFree;
    }
    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }
    public void saveOrder() {}
    public boolean occupy() {
        return isFree = false;
    }
    public boolean unnocupy() {
        return isFree = true;
    }
}
