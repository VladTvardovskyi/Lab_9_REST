package ua.lviv.iot.zoo.shop.manager;

import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

import ua.lviv.iot.zoo.shop.models.ShopAnimal;
import ua.lviv.iot.zoo.shop.models.Sex;

public class ZooManager {

    private List<ShopAnimal> zooShop = new ArrayList<>();

    public ZooManager() {
    }

    public ZooManager(final List<ShopAnimal> zooShop) {
        super();
        this.zooShop = zooShop;
    }

    public final List<ShopAnimal> findBySex(final Sex sex) {
        List<ShopAnimal> selectedAnimals = zooShop.stream().filter(s -> sex.equals(s.getSex()))
                .collect(Collectors.toList());
        return selectedAnimals;
    }

    public static List<ShopAnimal> sortByFood( List<ShopAnimal> zooShop) {
        System.out.println(zooShop);
        Comparator<ShopAnimal> comparator = Comparator.comparing(ShopAnimal::getFood);
        zooShop.sort(comparator);
        return zooShop;
    }

    public static List<ShopAnimal> sortByPriceIncrease(final List<ShopAnimal> zooShop) {
        zooShop.sort((o1, o2) -> (int) o1.getPrice() - (int) o2.getPrice());

        return zooShop;

    }

    public static List<ShopAnimal> sortByPriceDecrease(final List<ShopAnimal> zooShop) {
        zooShop.sort((o1, o2) -> (int) o2.getPrice() - (int) o1.getPrice());

        return zooShop;
    }

    public static List<ShopAnimal> sortByWeightIncrease(final List<ShopAnimal> zooShop) {
        zooShop.sort((o1, o2) -> (int) o1.getWeight() - (int) o2.getWeight());

        return zooShop;

    }

    public static List<ShopAnimal> sortByWeightDecrease(final List<ShopAnimal> zooShop) {
        zooShop.sort((o1, o2) -> (int) o2.getWeight() - (int) o1.getWeight());

        return zooShop;
    }
    public static List<ShopAnimal> sortByName( List<ShopAnimal> zooShop) {
        System.out.println(zooShop);
        Comparator<ShopAnimal> comparator = Comparator.comparing(ShopAnimal::getName);
        zooShop.sort(comparator);
        return zooShop;
    }
    public static List<ShopAnimal> sortByColour( List<ShopAnimal> zooShop) {
        System.out.println(zooShop);
        Comparator<ShopAnimal> comparator = Comparator.comparing(ShopAnimal::getColour);
        zooShop.sort(comparator);
        return zooShop;
    }
    public static List<ShopAnimal> sortByAgeIncrease(final List<ShopAnimal> zooShop) {
        zooShop.sort((o1, o2) -> (int) o1.getAge() - (int) o2.getAge());

        return zooShop;
    }
        
}
