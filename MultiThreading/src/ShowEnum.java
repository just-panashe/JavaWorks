enum ShapeType{
    SQUARE(100), RECTANGLE(200), CIRCLE(300),
    TRAPEZIUM(400), RHOMBUS(500), TRIANGLE(600), OVAL(700), HEXAGON(800);

    private int value;
    ShapeType(int value){ this.value = value;}
    int getValue() {return value;}
}

public class ShowEnum {
    public static void main(String[] args) {
        ShapeType st;
        for(ShapeType s : ShapeType.values()){
            System.out.println(s + " it has ordinal  values: " + s.ordinal());
            System.out.println("And its start value is: " + s.getValue());
        }
    }
}
