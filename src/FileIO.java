import java.io.*;

public class FileIO {

    public static String makeFile(String input){
        try{
            BufferedWriter w = new BufferedWriter(new FileWriter("E:\\Bootcamp Sigmaka\\Intellij\\gen-20-java-basic-structure\\out\\production\\io\\out.txt"));
            w.write(input);
            w.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return input;
    }

    public static void readFile(){
        try{
            BufferedReader r = new BufferedReader(new FileReader("E:\\Bootcamp Sigmaka\\Intellij\\gen-20-java-basic-structure\\out\\production\\io\\out.txt"));
            String row;
            while((row = r.readLine()) != null){
                System.out.println(row);
            }
            r.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
