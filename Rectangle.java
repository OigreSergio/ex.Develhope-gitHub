public class Rectangle extends Form{
    private float base;
    private float height;

    public Rectangle(float base,float height){
        this.height=height;
        this.base=base;
    }

    @Override
    public void calculateAreaMethode() {
        float area = base*height;
        System.out.print("The result of rectangle area is = "+area+"\n");
    }
}
