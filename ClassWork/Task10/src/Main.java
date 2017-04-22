import java.io.*;

public class Main {
    public static String readNextLine(InputStream inputStream) throws IOException {
        int point = inputStream.read();
        String string = new String();
        while (point != '\n') {
            string += (char)point;
            point = inputStream.read();
        }
        return string;
    }

    public static void main(String[] args) throws Exception {
        Rectangle rectangle1 = new Rectangle(1, 2);
        Triangle triangle1 = new Triangle(4, 5, 6);

        OutputStream outputStream = new FileOutputStream("output.txt");


        byte figureBites1[] = (triangle1.toString() + "\n").getBytes();
        outputStream.write(figureBites1);

        byte figureBites2[] = (rectangle1.toString() + "\n").getBytes() ;
        outputStream.write(figureBites2);

        InputStream inputStream = new FileInputStream("output.txt");

        byte bytesFromFile[] = new byte[100];
        inputStream.read(bytesFromFile);

        for (int i = 0; i < bytesFromFile.length; i++) {
            System.out.print((char)bytesFromFile[i]);
        }
        InputStream inputStream1 = new FileInputStream("output.txt");
        System.out.println("Demonstration readNextLine:");
        String string = readNextLine(inputStream1);

        System.out.println(string);

    }
}
