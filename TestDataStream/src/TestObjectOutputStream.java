import java.io.*;
import java.util.Date;

public class TestObjectOutputStream {
    public static void main(String[] args) throws IOException {
        try (ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("object.dat"));) {
            output.writeUTF("John");
            output.writeDouble(84.5);
            output.writeObject(new java.util.Date());

        }

    }
}

class TestObjectInputStream{
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        try (ObjectInputStream input = new ObjectInputStream( new FileInputStream("object.dat")); ){
            String name = input.readUTF();
            double score = input.readDouble();
            java.util.Date date = (java.util.Date)(input.readObject());

            System.out.println(name + " " + score + " " + date);

        }

    }
}
