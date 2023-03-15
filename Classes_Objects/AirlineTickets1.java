/*Create a class that captures airline tickets. Each ticket lists the 
  departure and arrival cities, a flight number, and a seat assignment. 
  A seat assignment has both a row and a letter for the seat within the 
  row (such as 12F). Make two examples of tickets. */

package Classes_Objects;

 class AirlineTickets1 
 {
            private String Departure;
            private String Arrival;
            private String FlightNumber;
            private int SeatRow;
            private char SeatLetter;

  public AirlineTickets1(String d, String a, String f, int s, char c)
            {
                Departure = d;
                Arrival = a;
                FlightNumber = f;
                SeatRow = s;
                SeatLetter = c;
            }

    public String getDeparture()
    {
        return Departure; 
    }
    
    public String getArrival()
    {
       return Arrival;
    }
    
    public String getFlightNumber()
    {
        return FlightNumber;
    }
     
    public int getSeatRow()
    {
        return SeatRow; 
    }
    public char getSeatLetter()
    {
        return SeatLetter;
    }
    public class AirlineTickets
    {
        public static void main(String[] args) 
        {
          AirlineTickets1 t1 = new AirlineTickets1("Jaipur", "Mumbai", "014256", 12, 'A');

          System.out.println("Departing from: " + t1.getDeparture());
          System.out.println("Arriving at: " + t1.getArrival());
          System.out.println("Your Flight Number: " + t1.getFlightNumber());
          System.out.println("Your Seat Row: " + t1.getSeatRow());
          System.out.println("Your Seat Letter: " + t1.getSeatLetter());

          System.out.println();

          AirlineTickets1 t2 = new AirlineTickets1("Pune", "Nagpur", "013478", 10, 'S');
          
          System.out.println("Departing from: " + t2.getDeparture());
          System.out.println("Arriving at: " + t2.getArrival());
          System.out.println("Your Flight Number: " + t2.getFlightNumber());
          System.out.println("Your Seat Row: " + t2.getSeatRow());
          System.out.println("Your Seat Letter: " + t2.getSeatLetter());
        
        }
    }
     
}
