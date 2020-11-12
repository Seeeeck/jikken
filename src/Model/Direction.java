package Model;

public class Direction{
    private int directionCode;

    public Direction(char direction){
        switch(direction){
            case 'U':
                directionCode = 0;
                break;
            case 'R':
                directionCode = 1;
                break;
            case 'D':
                directionCode = 2;
                break;
            case 'L':
                directionCode = 3;
                break;
        }
    }

    public  int toDirectionCode(char direction){
        char[] tp = {'U','R','D','L'};
        for(int i=0;i<4;i++){
            if (direction == tp[i]){
                return i;
            }
        }
        return -1;
    }

    public void setDirectionCode(char direction){
        directionCode = toDirectionCode(direction);
    }

    public int getDirectionCode(){
        return directionCode;
    }

    public boolean compatibleWith(char newDirection) {
        return Math.abs(directionCode - toDirectionCode(newDirection)) != 2;
    }
}