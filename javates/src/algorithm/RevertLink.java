package algorithm;

import java.util.Iterator;

public class RevertLink<T> {

    
    public Node revert(Node x) {
        Node first = x;
        Node revert = null;
        while(null != first) {
            Node second = first.next;
            first.next = revert;
            revert = first;
            first = second;
        }
        return revert;
    }
    
    public Node revertDG(Node first) {
        if(null == first) return null;
        if(null == first.next) return first;
        Node second = first.next;
        Node ret = revertDG(second);
        second.next = first;
        first.next = null;
        return ret;
    }
    
    public static void main(String[] args) {
        Stack stack = new Stack<Integer>();
        stack.push(3);
        stack.push(5);
        stack.push(66);
        stack.push(1);
        RevertLink<Integer> rLink = new RevertLink<Integer>();
        rLink.printStack(stack);
        Node revert = rLink.revert(stack.first);
        rLink.printStack(stack);
        rLink.revertDG(revert);
        rLink.printStack(stack);
    }
    
    public void printStack(Stack stack) {
        Iterator<T> iterator = stack.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
    
}
