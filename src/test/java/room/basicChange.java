package room;

public class basicChange {
    String changeColor;
    String ChangeSize;
    String changeSpeed;

    basicChange(String changeColor, String changeSize, String changeSpeed){
        this.changeColor=changeColor;
        this.ChangeSize=changeSize;
        this.changeSpeed=changeSpeed;
    }
    public void printInfo(){
        System.out.println(changeColor+ changeSpeed+ChangeSize);
    }
}
