
class Rectangle{
    public double length,breadth;
    public double area(){
        return length * breadth;
    }
}
class Cuboid extends Rectangle{
    public double height;
    public double volume(){
        return area() * height;
    }
}

class Shape {
    public static void main(String[] args){
        Cuboid cuboid = new Cuboid();
        cuboid.length=3;
        cuboid.breadth=4;
        cuboid.height=5;
        System.out.println(cuboid.volume());
        System.out.println(cuboid.area());
    }
}

