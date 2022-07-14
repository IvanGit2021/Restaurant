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
    public void setFree(boolean free) {
        isFree = free;
    }
    public String getOrder() {
        return order;
    }
    public void setOrder(String order) {
        this.order = order;
    }
}
