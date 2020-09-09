
/**
 * Write a description of class Player here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Player
{
    private String name;
    private String color;
    public Player(String n,String c){
        name=n;
        if(c.equals("y")){
            color="yellow";
        }
        else{
            color="red";    
        }

    }

    public String getName(){
        return name;    
    }

    public String toString(){
        return name+" has the "+color+" team";    
    }
}
