import java.io.*;
import java.util.Scanner;

public class Score {
    private String score;
    private File file;

    public Score(){
        this.file = new File("score.txt");
        this.score="";
        writeScore();
        getScore();
    }

    public void getScore(){
        try {
            Scanner reader = new Scanner(this.file);
            while(reader.hasNextLine()){
                String data = reader.nextLine();
                this.score = data;
                //reader.close();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void writeScore(){
        try {
            FileWriter fileWriter = new FileWriter(this.file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "0"; //TODO: we should swap this "0" with the actual score of the player.
            bufferedWriter.write(data);
            bufferedWriter.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public String addScore(){
        return this.score;
    }

}
