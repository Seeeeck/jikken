package Model;

public enum Direction{
    U(0),
    R(1),
    D(2),
    L(3);

    private int directionCode;

    private Direction(int directionCode){
        this.directionCode = directionCode;
    }

    public int getDirectionCode(){
        return directionCode;
    }

    public boolean compatibleWith(Direction newDirection) {
        return Math.abs(directionCode - newDirection.directionCode) != 2;
    }
}