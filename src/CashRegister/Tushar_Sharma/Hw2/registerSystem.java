package CashRegister.Tushar_Sharma.Hw2;

public class registerSystem implements Item {

    private float costBeforeDiscount;
    private int totalPrice;
    private int numOfItems;
    private int totalQuantity;
    private int discountToApply;
    private float costAfterDiscount;
    @Override
    public float getPrice(float price) {
        costBeforeDiscount = price;
        return costBeforeDiscount;
    }

    @Override
    public int getQuantity(int quantity) {
        numOfItems = quantity;
        return numOfItems;
    }

    @Override
    public float applyDiscount(int discountChosen) {
        switch (discountChosen) {
            case 1:
                discountToApply = 10; // %10 off
                break;
            case 2:
                discountToApply = 20; // %20 off
                break;
            case 3:
                discountToApply = 50; // %50 off
                break;
            case 4:
                discountToApply = 75; // %75 off
                break;
            case 5:
                discountToApply = 90; // %90 off
                break;
            case 6:
                discountToApply = 99; // %99 off
                break;
            case 7:
                discountToApply = 100; // %100 off
                break;
            case 8:
                discountToApply = 25; // Senior Citizen Discount %25 off
                break;
        }
        return costAfterDiscount = costBeforeDiscount * discountChosen;
    }

    @Override
    public void displayData() {
        System.out.print(costAfterDiscount + "\n" + costBeforeDiscount);

    }
}
