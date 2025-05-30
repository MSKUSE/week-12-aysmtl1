public class StackItem {

    private T data;
    private StackItem<T> next;
    public StackItem(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public StackItem<> getNext() {
        return next;
    }

    public void setNext(StackItem<> next) {
        this.next = next;
    }
}
