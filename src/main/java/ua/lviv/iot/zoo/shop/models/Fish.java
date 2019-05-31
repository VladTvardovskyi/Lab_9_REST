package ua.lviv.iot.zoo.shop.models;

public class Fish extends ShopAnimal {

    private FishFormType fishForm;

    public Fish(final String name, final int price,
            final KindOfAnimal type, final String colour, final int age,
            final int weight, final Sex sex, final String food,
            final FishFormType formType) {
        super(name, price, type, colour, age, weight, sex, food);
        this.fishForm = formType;

    }

    public Fish(final FishFormType fishForm) {
        super();
        this.fishForm = fishForm;
    }

    public final FishFormType getFishForm() {
        return fishForm;
    }

    public final void setFishForm(final FishFormType fishForm) {
        this.fishForm = fishForm;
    }
    
    @Override
    public String toString() {
        return "Fish [fishForm=" + fishForm + "]";
    }
    
    public String getHeaders() {
        return super.getHeaders() + "fishForm";
    }
    
    public String toCSV() {
        return super.toCSV() + fishForm;
    }
    
    

}
