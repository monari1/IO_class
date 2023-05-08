import java.io.*;

public class TestObjectStreamForArray {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        int [] numbers = {1, 2, 3, 4, 5};
        String [] strings = {"john", "michael", "francis", "alex", "peter"};
        try (ObjectOutputStream output = new ObjectOutputStream( new FileOutputStream("array.dat", true)); ){
            output.writeObject(numbers);
            output.writeObject(strings);

        }
        try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("array.dat"));){
            int [] newNumbers = (int[]) (input.readObject());
            String [] newStrings = (String[]) (input.readObject());
            for (int i = 0; i<newNumbers.length; i++)
                System.out.println(newNumbers[i] + " ");
            for (int i = 0; i<newStrings.length; i++)
                System.out.println(newStrings[i] + " ");

        }

    }
}
