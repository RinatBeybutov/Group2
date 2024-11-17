package polymorfix;

public class DebitCard extends Card {

    @Override
    public void sendMoney() {
        System.out.println("ОТправляю деньги c дебитовой карты");
    }
}
