
abstract class Q9_MovieTicket{
    String movieName;
    String theaterName;
    int numTickets;

    abstract void calculateTotalPrice();

    void comfirmBooking(){
        System.out.println("Moviename "+movieName);
        System.out.println("TheaterName "+theaterName);
        System.out.println("Number of tickets "+numTickets);

        System.out.println(calculateTotalPrice());
    }
}

class RegularTicket extends Q9_MovieTicket {
    int RegularTicket = 250;

    


}