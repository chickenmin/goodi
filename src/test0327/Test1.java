package test0327;

class  Rectangle{
    int width, height, sno;
    static  int cnt;


    public Rectangle(int a, int b) {
        width = a;
        height = b;
        sno = ++cnt;
    }

    int area() {
        return width*height;
    }

    int length() {
        return (width+height)*2;
    }

    public String toString(){
        return sno+"/5 사각형:("+width +","+height+" 면적:" + area()+", 둘레:"+ length()+")";
    }
}
public class Test1 {
    public static void main(String[] args) {
        Rectangle[] rarr = new Rectangle[5];
        int totarea = 0;
        int totlength = 0;
        for(int i=0;i<rarr.length;i++) {
            int width = (int)(Math.random() * 11) + 20;
            int height =(int)(Math.random() * 11) + 20;
            rarr[i] = new Rectangle(width,height);
            totarea += rarr[i].area();
            totlength += rarr[i].length();
        }
        for(Rectangle r : rarr) {
            System.out.println(r);
        }
        System.out.println("전체 사각형 면적의 합:" + totarea);
        System.out.println("전체 사각형 둘레의 합:" + totlength);
    }
}
