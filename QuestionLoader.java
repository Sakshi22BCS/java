import java.io.*;
import java.util.*;

public class QuestionLoader {
    public static ArrayList<Question> loadQuestions(String filePath) throws IOException {
        ArrayList<Question> list = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        String line;
        
        while((line = reader.readLine()) != null) {
            String question = line;
            String[] options = new String[4];
            for(int i = 0; i < 4; i++) {
                options[i] = reader.readLine();
            }
            int answer = Integer.parseInt(reader.readLine());
            list.add(new Question(question, options, answer));
        }
        reader.close();
        return list;
    }
}
