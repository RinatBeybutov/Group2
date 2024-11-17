package polymorfix;

public class CreditCard extends Card {

    @Override
    public void sendMoney() {
        System.out.println("ОТправляю деньги c кредитной карты");
    }
}
