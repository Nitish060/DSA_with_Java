/* INHERITANCE */

public class OOPS12 {
    public static void main(String[] args) {
        Queen q = new Queen();
        q.moves();
    }
}

interface Chessplayer{
    void moves();
}

class Queen implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (in all directions)");
    }
}

class Roak implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right");
    }
}

class King implements Chessplayer{
    public void moves(){
        System.out.println("up,down,left,right,diagonal (by 1 step)");
    }
}

/* MULTILEVEL INHERITANCE
 * 
 * interface Hebivore{
 * 
 * }
 * 
 * interface Carnivore{
 * 
 * }
 * 
 * class Bear implements Herbivore,Carnivore{
 * 
 * }
 */