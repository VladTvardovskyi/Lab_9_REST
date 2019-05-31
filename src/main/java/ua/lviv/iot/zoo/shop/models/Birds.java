package ua.lviv.iot.zoo.shop.models;

public class Birds extends ShopAnimal {

    private BirdsSoundsType birdsVoice;

    public Birds(final String name, final int price,
            final KindOfAnimal type, final String colour, final int age,
            final int weight, final Sex sex, final String food,
            final BirdsSoundsType birdsVoice) {

        super(name, price, type, colour, age, weight, sex, food);

        this.birdsVoice = birdsVoice;

    }

    public final BirdsSoundsType getbirdsVoice() {
        return birdsVoice;
    }

    public final void setbirdsVoice(final BirdsSoundsType birdsVoice) {
        this.birdsVoice = birdsVoice;
    }
    
    @Override
    public String toString() {
        return "Birds [birdsVoice=" + birdsVoice + "]";
    }
    
    public String getHeaders() {
        return super.getHeaders() + "birdsVoice";
    }
    
    public String toCSV() {
        return super.toCSV() + birdsVoice;
    }

}
