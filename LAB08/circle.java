class circle extends Point{
  circle(double r){
    super (r);
    System.out.println("Creating a Circle ? done!");
    System.out.println("The area of the Circle is "+space());
  }
  double space(){
    double area = Math.PI*getRadius()*getRadius();
    return area;
  }
}
    