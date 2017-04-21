import java.util.Scanner;

public class Ticket {

    public String desc;
    private int _ID;
    private int priority;
    private String username;

    public Ticket() { //subject to change
     desc = "help";
     _ID = (int)(Math.random()*1000);
     priority = 1;
     username = "tracer";
    }

    public Ticket(String woes , String name) { //subject to change
     desc = woes;
     _ID = (int)(Math.random()*1000);
     priority = 1;
     username = name;
    }

    public String getDesc() {
        return desc;
    }
    public int getID() {
        return _ID;
    }

    public int getPriority() {
        return priority;
    }

    public String getName() {
        return username;
    }

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        //Scanner sd = new Scanner(System.in);
        String input2 = "harddrive";

        Ticket hero = new Ticket(input2 , input);

        System.out.println(hero.getDesc());
        System.out.println(hero.getID());
        System.out.println(hero.getPriority());
        System.out.println(hero.getName());
    }

}
