package writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import ua.lviv.iot.zoo.shop.models.ShopAnimal;

public class Writer {

    public final void writeToFile(List<ShopAnimal> zooShop) throws IOException {

        File myFile = new File("my_Shop");

        try (FileOutputStream fos = new FileOutputStream(myFile); // відкриває потік
                OutputStreamWriter osw = new OutputStreamWriter(fos); // трансформує текст вбайти
                BufferedWriter bufWriter = new BufferedWriter(osw);) { // буферизує текст

            for (ShopAnimal s : zooShop) {
                bufWriter.write(s.getHeaders());
                bufWriter.newLine();
                bufWriter.write(s.toCSV());
                bufWriter.newLine();
            }

        } finally {

        }
    }

}
