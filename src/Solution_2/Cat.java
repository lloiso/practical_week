package Solution_2;

public class Cat implements Movable, Edible, Eat{
    public void eat(){
        System.out.println("eat");
    }
    public void beEaten(){
        System.out.println("be Eaten");
    }
    public void move(){
        System.out.println("move");
    }
}
