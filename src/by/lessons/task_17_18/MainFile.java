package by.lessons.task_17_18;

import javax.imageio.IIOException;
import java.io.*;
import java.util.ArrayList;

public class MainFile {
    public static void main(String[] args) {
        first();
        //second;
        third();


    }

    public static void first() {
        File file = new File("File.text");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write("Сериализация объектов - это процесс сохранения состояния объектов в виде последовательности байтов, а также процесс восстановления в дальнейшем из этих байтов \"живых\" объектов. Java Serialization API предоставляет разработчикам Java стандартный механизм управления сериализацией объектов. API мал и легок в применении, а его классы и методы просты для понимания");
        } catch (IOException e) {
            System.out.println("какой-нибудь текст исключения");

        }
    }

   // public static void second() {

//        FileReader fileReader= null;
//        try{
//            fileReader= new FileReader("File.text");
//            fileReader.read();
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }finally {
//            try {fileReader.close();
//        } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        public static void third() {
            Ferma ferma1 = new Ferma("Ferm1", 10);
            Ferma ferma2 = new Ferma("Ferm2", 15);
            ArrayList ferms = new ArrayList<>();
            ferms.add(ferma1);
            ferms.add(ferma2);
            try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("FileSerialized"))) {
//            FileOutputStream fos = new FileOutputStream("FileSerialized");
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
                objectOutputStream.writeObject(ferms);
//            objectOutputStream.writeObject(ferma1);
//            objectOutputStream.writeObject(ferma2);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
