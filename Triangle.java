public class Triangle extends Form {
    private float base;
    private float height;
    public Triangle(float base,float height){
        this.height=height;
        this.base=base;
    }
    public void calculateAreaMethode() {
        float area = base*height/2;
        System.out.print("The result of triangle area is: "+area+"\n");
    }
}
