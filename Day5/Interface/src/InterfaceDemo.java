interface Movies{
    void movieName();
    void genre();
}
class ActionMovie implements Movies{
    @Override
    public void movieName(){
        System.out.println("Movie Name: John Wick");
    }

    @Override
    public void genre(){
        System.out.println("Genre: Action");
    }
}
class RomanceMovie implements Movies{
    @Override
    public void movieName(){
        System.out.println("Movie Name: Titanic");
    }

    @Override
    public void genre(){
        System.out.println("Genre: Romance");
    }
}

class Comedy implements Movies{
    @Override
    public void movieName() {
        System.out.println("Movie Name: Booksmart");
    }

    @Override
    public void genre() {
        System.out.println("Genre: Comedy");
    }
}

class SciFiMovie implements Movies{
    @Override
    public void movieName() {
        System.out.println("Movie Name: Divergent");
    }

    @Override
    public void genre(){
        System.out.println("Genre: Science Fiction");
    }
}


public class InterfaceDemo {
    public static void main(String[] args){
        Movies actionMovie = new ActionMovie();
        Movies romanceMovie = new RomanceMovie();
        Movies comicMovie = new Comedy();
        Movies sciFiMovie = new SciFiMovie();
        actionMovie.movieName();
        actionMovie.genre();
        System.out.println();
        romanceMovie.movieName();
        romanceMovie.genre();
        System.out.println();
        comicMovie.movieName();
        comicMovie.genre();
        System.out.println();
        sciFiMovie.movieName();
        sciFiMovie.genre();
    }
}
