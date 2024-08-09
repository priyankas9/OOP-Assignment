public class TestCircle {
    public static void main(String[] args) {
    
        Circle2 c1 = new Circle2();
        System.out.println(c1); 
       
        Circle2 c2 = new Circle2(2.5);
        System.out.println(c2); 

        
        Circle2 c3 = new Circle2(3.5, "blue");
        System.out.println(c3); 

        
        System.out.println("Color of c3: " + c3.getColor()); 

       
        Circle2 c4 = new Circle2();
        c4.setRadius(5.5);
        System.out.println("Radius of c4: " + c4.getRadius()); 
        c4.setColor("green");
        System.out.println("Color of c4: " + c4.getColor()); 

        
        Circle c5 = new Circle(5.5);
        System.out.println(c5.toString()); 
     
        Circle c6 = new Circle(6.6);
        System.out.println(c6);
        System.out.println("Operator '+' invokes toString() too: " + c6); 
    }
}
