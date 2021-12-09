public class BookCollection {
    public static void main(String[] args){
        Books insurgent = new Insurgent();
        Books mazeRunner = new MazeRunner();
        Books meluha = new ImmortalsOfMeluha();
        insurgent.display();
        System.out.println("-------------------------------------------------------------");
        insurgent.author();
        insurgent.protagonist();
        mazeRunner.author();
        mazeRunner.protagonist();
        meluha.author();
        meluha.protagonist();
    }
}
