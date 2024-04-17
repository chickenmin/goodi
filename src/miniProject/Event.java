package miniProject;

import java.io.Serializable;

public class Event implements Serializable {
   private String name,memo,startD,lastD;

    public Event(String name, String memo, String startD, String lastD) {
        this.name = name;
        this.memo = memo;
        this.startD = startD;
        this.lastD = lastD;
    }

    @Override
    public String toString() {
        return String.format("[제목]:%s\n[기간]:%s~%s\n[상세]:%s", name, startD, lastD, memo);
    }
}
