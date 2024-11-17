package polymorfix;

public class TestCard {
    public static void main(String[] arg) {
        Card[] cards = {
                new CreditCard(), new DebitCard()
        };

        for (Card card : cards) {
            card.sendMoney();
        }
    }
}
