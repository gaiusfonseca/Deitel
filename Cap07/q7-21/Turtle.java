
public class Turtle {
    
    private boolean penDown;
    private TurtlePosition position;
    private int direction;

    public Turtle(){
        this.penDown = false;
        this.position = new TurtlePosition(0, 0);
        this.direction = 0;
    }

    public boolean isPenDown(){
        return this.penDown;
    }

    public void setPen(boolean penPosition){
        this.penDown = penPosition;
    }

    public TurtlePosition getPosition(){
        return this.position;
    }

    public void setPosition(TurtlePosition position){
        this.position = position;
    }

    public int getDirection(){
        return this.direction;
    }

    public void turnRight(){

        if(this.direction == 3){
            this.direction = 0;
        }else{
            this.direction++;
        }
    }

    public void turnLeft(){

        if(this.direction == 0){
            this.direction = 3;
        }else{
            this.direction--;
        }
    }

    public void move(int[][] floor, int moves){

        //cria uma referencia a posição atual para calcular a posição futura posteiormente
        TurtlePosition finalPosition = new TurtlePosition(this.position.getX(), this.position.getY());

        switch(direction){
            
            //movimenta a tartaruga para direita
            case 0:
                //define a posição de destino
                finalPosition.setX(moves);

                //verifica se a caneta está voltada para baixo
                if(this.penDown){
                    
                    //modifica o array
                    for(int x = this.position.getX(); x <= finalPosition.getX(); x++){
                        floor[this.position.getY()][x] = 1;
                    }
                }

                //estabelece a nova posição como a posição final
                this.position = finalPosition;
                break;
            
            //movimenta a tartaruga para baixo
            case 1:
                //define a posição de destino
                finalPosition.setY(moves);

                //verifica se a caneta está voltada para baixo
                if(this.penDown){

                    //modifica o array
                    for(int y = this.position.getY(); y <= finalPosition.getY(); y++){
                        floor[y][this.position.getX()] = 1;
                    }
                }

                //estabelece a nova posição como a posição final
                this.position = finalPosition;
                break;
            
            //movimenta a tartaruga para a esquerda
            case 2:
                //define a posição de destino
                finalPosition.setX(-moves);

                //verifica se a caneta está voltada para baixo
                if(this.penDown){

                    //modifica o array
                    for(int x = this.position.getX(); x >= finalPosition.getX(); x--){
                        floor[this.position.getY()][x] = 1;
                    }
                }

                //estabelece a nova posição como a posição final
                this.position = finalPosition;
                break;
            case 3:
                //define a posição de destino
                finalPosition.setY(-moves);

                //verifica se a caneta está voltada para baixo
                if(this.penDown){

                    //modifica o array
                    for(int y = this.position.getY(); y >= finalPosition.getY(); y--){
                        floor[y][this.position.getX()] = 1;
                    }
                }

                //estabelece a nova posição como a posição final
                this.position = finalPosition;
                break;
        }
    }
}
