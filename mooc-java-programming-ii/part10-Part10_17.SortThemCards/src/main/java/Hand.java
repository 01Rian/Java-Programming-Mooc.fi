import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand> {

  private List<Card> cards;

  public Hand() {
    this.cards = new ArrayList<>();
  }

  public void add(Card card) {
    this.cards.add(card);
  }

  public void print() {
    this.cards.stream().forEach(System.out::println);
  }

  public void sort() {
    Collections.sort(cards);
  }

  @Override
  public int compareTo(Hand o) {
    int sumThisHand = this.cards.stream().mapToInt(Card::getValue).sum();
    int sumOtherHand = o.cards.stream().mapToInt(Card::getValue).sum();

    return Integer.compare(sumThisHand, sumOtherHand);
  }

  public void sortBySuit() {
    Collections.sort(cards, new BySuitInValueOrder());
  }
}
