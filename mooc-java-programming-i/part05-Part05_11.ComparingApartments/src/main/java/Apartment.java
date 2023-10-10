
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }

    public boolean largerThan(Apartment compared) {
        if (compared.squares < this.squares) {
            return true;
        }

        return false;
    }

    public int priceDifference(Apartment compared) {
        int absPrice = this.squares * this.princePerSquare;
        int absPriceObj = compared.squares * compared.princePerSquare;

        if (absPrice < absPriceObj) {
            return absPriceObj - absPrice;
        }

        return absPrice - absPriceObj;
    }

    public boolean moreExpensiveThan(Apartment compared) {
        if (this.princePerSquare > compared.princePerSquare) {
            return true;
        }

        return false;
    }

}
