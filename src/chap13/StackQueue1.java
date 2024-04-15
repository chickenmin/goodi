package chap13;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/*
* Stack : LIFO(Last in First out)
*   Stack 클래스 : Vector 하위 클래스
*   주요메서드
*       push(Object) : 객체를 Stack에 추가
*       Object pop() : Stack에 저장된 객체를 꺼냄. 제거
*       Object peek() : Stack에 저장된 객체를 꺼냄. 조회
*
* Queue : FIFO(First in First out)
*   Queue 인터페이스 : LinkedList가 구현 클래스임.
*   주요메서드
*       offer(Object) : 객체를 Queue에 추가
*       Object poll() : Queue에 저장된 객체를 꺼냄. 제거
*       Object peek() : Queue에 저장된 객체를 꺼냄. 조회
*
* */
public class StackQueue1 {
    public static void main(String[] args) {
        String [] subject = {"java", "SQL", "JSP","HTML","CSS","JavaScript","Spring"};
        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();
        for (String s : subject) {
            stack.push(s);  //객체 추가
            queue.offer(s); //객체 추가
        }
        System.out.println(stack);
        System.out.println(queue); //둘 다 List라 추가된 대로 순서 유지됨
        System.out.println("stack에 저장된 요소의 갯수:"+stack.size());
        System.out.println("queue에 저장된 요소의 갯수:"+queue.size());

        System.out.println("stack의 조회대상 객체: " +stack.peek());   //가장 나중에 들어간 Spring 이 조회됨
        System.out.println("stack의 조회대상 객체: " +stack.size());   //7 => 조회만 되었지, 제거는 아님
        System.out.println("stack의 조회대상 객체: " +stack.pop());    // Spring 조회 후 제거됨
        System.out.println("stack의 조회대상 객체: " +stack.size());   // 6
        System.out.println("stack의 조회대상 객체: " +stack.pop());
        System.out.println("stack의 조회대상 객체: " +stack.size());

        System.out.println("queue의 조회대상 객체: " +queue.peek());
        System.out.println("queue 조회대상 객체: " +queue.size());
        System.out.println("queue의 조회대상 객체: " +queue.poll());
        System.out.println("queue 조회대상 객체: " +queue.size());
        System.out.println("queue의 조회대상 객체: " +queue.poll());
        System.out.println("queue 조회대상 객체: " +queue.size());





    }
}
