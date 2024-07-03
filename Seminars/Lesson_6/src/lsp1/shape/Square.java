package lsp1.shape;

public class Square implements Quadrilateral {

    private int side;

    public Square(int side) {
        this.side = side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    private double getSide() {
        return side;
    }
}
