package Lession5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainApp {

    public static ArrayList<FIleObject> fIleObjectArrayList = new ArrayList<>();
    public static final String pathToFile = "D:\\HomeWorkAppJC1\\resource\\test.csv";
    public static final String pathToFileOut = "D:\\HomeWorkAppJC1\\resource\\test1.csv";
    public static final String title = "value1" + ";" + "value2"
            + ";" + "value3" + ";" + System.getProperty("line.separator");

    public static void main(String[] args) throws IOException {
        createFileObjects();
        writer();

    }

    public static void createFileObjects() {

        for (int i = 1; i < 10; i++) {
            fIleObjectArrayList.add(new FIleObject(i, (i+1) * 100, (i+1) * 200));
        }
    }

    public static AppData readToObject() throws IOException {
        AppData appData = new AppData();
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(pathToFile))) {
            String line = br.readLine();
            appData.setHeader(line.split(";"));
            while ((line = br.readLine()) != null) {
                String[] values = line.split(";");
                records.add(Arrays.asList(values));
            }
        };
        int[][] resultData = new int[records.size()][3];

        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).size();j++){
                resultData[i][j] = Integer.valueOf(records.get(i).get(j));
            }
        }
        appData.setData(resultData);
        return appData;
    }
    public static void writer() throws IOException {
        try (FileWriter writer = new FileWriter(pathToFileOut);){
            writer.write(title);
            for(FIleObject fIleObject : fIleObjectArrayList) {
                writer.write(fIleObject.getValue() + ";" + fIleObject.getValueFrom()
                        + ";" + fIleObject.getValueTo() + ";"+ System.getProperty("line.separator"));
            }
        }
    }

}
