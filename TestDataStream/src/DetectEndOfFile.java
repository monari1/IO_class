import java.io.*;

public class DetectEndOfFile {
    public static void main(String[] args) {
        try {
            try (DataOutputStream output1 = new DataOutputStream(new FileOutputStream("test.dat"))) {
                output1.writeDouble(4.5);
                output1.writeDouble(4.8);
                output1.writeDouble(4.9);
            }
            try (DataInputStream input1 = new DataInputStream(new FileInputStream("test.dat"))) {
                while (true)
                    System.out.println(input1.readDouble());
            }
        }
        catch (EOFException ex){
            System.out.println("All data were read");

        }
        catch (IOException ex){
            ex.printStackTrace();
        }
    }
}
