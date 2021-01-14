import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class StudentsIO {
    Gson gson = new GsonBuilder().setPrettyPrinting().create();
    public void saveToFile(){
        try(FileWriter fileWriter = new FileWriter("students.json")){
            gson.toJson(StudentManager.studentList, fileWriter);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readFromFile(){
        try (Reader reader = new FileReader("students.json")){
            Type classOfT = new TypeToken<ArrayList<Students>>(){}.getType();
            StudentManager.studentList = gson.fromJson(reader, classOfT);
            if(StudentManager.studentList == null){
                StudentManager.studentList = new ArrayList<>();
            }else {
                int maxId = -1;
                for (Students st : StudentManager.studentList) {
                    if (st.getId() > maxId) {
                        maxId = st.getId();
                    }
                }
                StudentManager.idStudents = maxId + 1;
            }
        } catch (IOException e) {
            new ArrayList<Students>();
            StudentManager.idStudents = 1;
        }
    }
}
