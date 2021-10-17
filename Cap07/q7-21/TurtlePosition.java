public class TurtlePosition {
    
    private int x;
    private int y;

    public TurtlePosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return this.x;
    }

    public void setX(int x){

        if(this.x + x > 19){
            this.x = 19;
        }else if(this.x + x < 0){
            this.x = 0;
        }else{
            this.x += x;
        }
    }

    public int getY(){
        return this.y;
    }

    public void setY(int y){

        if(this.y + y > 19){
            this.y = 19;
        }else if(this.y + y < 0){
            this.y = 0;
        }else{
            this.y += y;
        }
    }

    @Override
    public String toString(){
        return String.format("(%d, %d)", this.getX(), this.getY());
    }
}
