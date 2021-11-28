class EndGame {
    int Ticket;
    int Tax;

    EndGame(){
    }

    EndGame(int Tic, int T) {
        Ticket = Tic;
        Tax = T;
        System.out.println("Total Cost for the movie is " + (Ticket + Tax));
    }
}
class Food extends EndGame{
        int popcorn;
        int cococola;

        Food (int p, int c)
        {
            popcorn = p;
            cococola = c;
            System.out.println("Total cost of snacks is "+(popcorn+cococola));
        }
}

public class Movie {

    public static void main(String[] args) {
        EndGame eg = new EndGame(210, 50);
        Food f = new Food(120, 90);

    }
}
