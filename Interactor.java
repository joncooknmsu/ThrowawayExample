
public class Interactor
{

public Interactor()
{
    System.out.println("Welcome to the Interactor -- have fun!");
}

public void interact(String prompt)
{
    System.out.println("I should respond to (" + prompt + ")");
}

public static void main(String[] args)
{
    Interactor bot = new Interactor();
    for (String arg: args) {
        bot.interact(arg);
    }
}

} // end class

