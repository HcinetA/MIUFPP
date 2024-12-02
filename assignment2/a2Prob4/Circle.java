package a2Prob4;

public record Circle(double radius) {

    public Circle {
        if (radius<=0){
            throw new IllegalArgumentException("Radius must be positive.");
        }

    }

    public double computeArea(){
        return Math.PI * radius * radius;
    }
}
