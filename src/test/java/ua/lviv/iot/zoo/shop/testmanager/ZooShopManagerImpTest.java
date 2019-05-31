package ua.lviv.iot.zoo.shop.testmanager;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.zoo.shop.manager.ZooManager;
import ua.lviv.iot.zoo.shop.models.AnimalWoolType;
import ua.lviv.iot.zoo.shop.models.Birds;
import ua.lviv.iot.zoo.shop.models.BirdsSoundsType;
import ua.lviv.iot.zoo.shop.models.Fish;
import ua.lviv.iot.zoo.shop.models.FishFormType;
import ua.lviv.iot.zoo.shop.models.KindOfAnimal;
import ua.lviv.iot.zoo.shop.models.Mamals;
import ua.lviv.iot.zoo.shop.models.Sex;
import ua.lviv.iot.zoo.shop.models.ShopAnimal;
import writer.Writer;

public class ZooShopManagerImpTest {

    private List<ShopAnimal> newShopAnimal;
    private ZooManager zooManager;

    public void setUp() {

        zooManager = new ZooManager();

    }

    @BeforeEach
    public void beforeEach() {
        newShopAnimal = new ArrayList<>();
        newShopAnimal.add(new Mamals("Sanya", 400, KindOfAnimal.CASUAL, "Orange", 4, 350, Sex.FEMALE, "SpecialGrain",
                AnimalWoolType.LONG));
        newShopAnimal.add(new Fish("Krasava", 1500, KindOfAnimal.CASUAL, "Grey", 7, 2000, Sex.MALE, "SpecialGrain",
                FishFormType.THIN));
        newShopAnimal.add(new Birds("Krasava", 1500, KindOfAnimal.CASUAL, "Grey", 6, 2000, Sex.FEMALE, "SpecialGrain",
                BirdsSoundsType.SOUNDS));
        newShopAnimal.add(new Mamals("Krasava", 1500, KindOfAnimal.PREDATORS, "Grey", 3, 200, Sex.MALE, "AIGrain",
                AnimalWoolType.SHORT));
        zooManager = new ZooManager(newShopAnimal);

    }

    @Test
    public void testFindBySex() {

        Assertions.assertEquals(2, zooManager.findBySex(Sex.FEMALE).size());
        Assertions.assertEquals(2, zooManager.findBySex(Sex.MALE).size());
    }

    @Test
    public void testSortByFood() {
        Assertions.assertEquals("AIGrain", ZooManager.sortByFood(newShopAnimal).get(0).getFood());
    }

    @Test
    public void testSortByName() {
        Assertions.assertEquals("Krasava", ZooManager.sortByName(newShopAnimal).get(0).getName());
    }

    @Test
    public void testSortByPrice() {
        Assertions.assertEquals(400, ZooManager.sortByPriceIncrease(newShopAnimal).get(0).getPrice());
        Assertions.assertEquals(1500, ZooManager.sortByPriceDecrease(newShopAnimal).get(0).getPrice());
    }

    @Test
    public void testSortByWeight() {
        Assertions.assertEquals(200, ZooManager.sortByWeightIncrease(newShopAnimal).get(0).getWeight());
        Assertions.assertEquals(2000, ZooManager.sortByWeightDecrease(newShopAnimal).get(0).getWeight());
    }

    @Test
    public void testSortByColour() {
        Assertions.assertEquals("Grey", ZooManager.sortByColour(newShopAnimal).get(0).getColour());
    }

    @Test
    public void testSortByAgeIncrease() {
        Assertions.assertEquals(3, ZooManager.sortByAgeIncrease(newShopAnimal).get(0).getAge());
    }

    @Test
    void testToString() {
        for (int index = 0; index < newShopAnimal.size(); index++) {
            if (newShopAnimal.get(index).toString().getClass() == String.class) {
                Assertions.assertTrue(true);
            } else {
                Assertions.assertTrue(false);
            }
        }
    }

    @Test
    void testGetHeaders() {
        for (int index = 0; index < newShopAnimal.size(); index++) {
            if (newShopAnimal.get(index).getHeaders().getClass() == String.class) {
                Assertions.assertTrue(true);
            } else {
                Assertions.assertTrue(false);
            }
        }
    }

    @Test
    void testToCSV() {
        for (int index = 0; index < newShopAnimal.size(); index++) {
            if (newShopAnimal.get(index).toCSV().getClass() == String.class) {
                Assertions.assertTrue(true);
            } else {
                Assertions.assertTrue(false);
            }
        }
    }

    @Test
    public void test_Writer() throws IOException {
        Writer wr = new Writer();
        wr.writeToFile(newShopAnimal);
        System.out.println(newShopAnimal);
    }

    @Test
    public void test_creating_file() throws IOException {
        File myFile = new File("my_Shop");
        Assertions.assertTrue(myFile.exists());
    }

}
