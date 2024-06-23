public class Box<T> implements Shippable{

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>(15);
        Number number = integerBox.getContents();
        System.out.println(number.getClass().getSimpleName());
    }

    private T contents;
    public Box(T contents) {
        this.contents = contents;
    }
    public T getContents() {
        return contents;
    }
    public void setContents(T contents) {
        this.contents = contents;
    }

    @Override
    public void ship(Object stuff) {

    }
}