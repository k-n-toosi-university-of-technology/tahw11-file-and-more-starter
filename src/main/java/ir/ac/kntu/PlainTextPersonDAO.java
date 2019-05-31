package ir.ac.kntu;

import java.io.*;
import java.util.List;

public class PlainTextPersonDAO implements PersonDAO {
    private final String sourceFileName;

    public PlainTextPersonDAO(String sourceFileName) {
        this.sourceFileName = sourceFileName;
    }

    @Override
    public List<Person> getAllPersons() {
        File file = new File(sourceFileName);
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String readLine = bufferedReader.readLine();
            System.out.println("readLine = " + readLine);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void saveAllPersons(List<Person> list) {
        File file = new File(sourceFileName);
        try(BufferedWriter bufferedReader = new BufferedWriter(new FileWriter(file))){
            bufferedReader.write("Test");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
