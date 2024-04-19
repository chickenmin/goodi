package miniProject;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class dateRegular extends Exception{
    dateRegular() {
        super("0000/00/00 양식에 맞춰주세요.");
    }
}
public class Event implements Serializable {
    private String name,memo, start,last;

    public Event(String name, String memo, String start, String last) {
        this.name = name;
        this.memo = memo;
        this.start = start;
        this.last = last;
    }

    @Override
    public String toString() {
        return String.format("[제목]:%s\n[기간]:%s~%s\n[상세]:%s", name, start, last, memo);
    }

    public String getday(){
        String [] arr = start.split("/");
        String s="";
        for (String a : arr) {
            s += a;
        }
        return s.substring(0,8);

//        String [] s = start.split("/");
//        String str="";
//        for (int i = 0; i < 8; i++) {
//            str += s[i];
//        }
//        return str;


    } //이번트 날짜

    public String getName() {
        return name;
    } //이벤트이름


}

