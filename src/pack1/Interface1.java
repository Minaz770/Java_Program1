package pack1;

interface draw{
    void pencil();
}
interface draw1 extends draw{
    void paint();
}
public class Interface1 implements draw, draw1 {

    public static void main(String[] args) {
        Interface1 obj = new Interface1();
        obj.pencil();
        obj.paint();

    }
    public void pencil() {
        System.out.println("Drawing circle with pencil");
    }
    public void paint() {
        System.out.println("Drawing and painting circle with pencil and brushes");
    }

}