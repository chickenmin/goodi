package miniProject;

import java.io.*;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Store {
    Map<String,List<Event>>  map = new HashMap<>();;
    File f; //id 폴더
    File f2;
    Store(String id){
        f = new File("c:/temp1/" + id);
        if (!f.exists()) {
            f.mkdirs();
        }
    } //id 별 폴더 생성

    private String fileAddress(){
        return f.getAbsolutePath();
    }
    public String getFileAddress(){
        return f2.getAbsolutePath();
    }

    public Map createMap(String day, List<Event> e){
        map.put(day, e);
        return map;
    }

    public void createF(String day, String name) {
        File f1 = new File(fileAddress()+"/"+day); // 날짜 폴더
        if (!f1.exists()) {
            f1.mkdirs();
        }
       f2 = new File(f1.getAbsolutePath()+"/" +name+ ".txt");
        try {
            if (!f2.exists()) {
                f2.createNewFile();
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public File getF2() {
        return f2;
    }

    public void outToFile(Event e){
        try {
            FileWriter fw = new FileWriter(getF2());
            BufferedWriter writer = new BufferedWriter(fw);
            writer.write(e.toString());
            writer.close();
        } catch (IOException ioe){
            ioe.printStackTrace();
        }


    }





}

