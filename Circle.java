public class Circle {     
    private double r;
    public void Circle() {
        this.r=0;
    }
    public void setRadius(float radius){
        this.r=radius;
    }
    public double getRadius(){
        return r;
    }
    public double area(){
        return Math.PI*r*r;
    }
    public double perimeter(){
        return Math.PI*2*r;
    }
    public double diameter(){
        return 2*r;
    }
}
