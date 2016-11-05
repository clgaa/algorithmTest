package algorithm;

public class CloseCircle {
    private Node<Integer> first;
    
    public void init() {
        first = new Node<Integer>();
        first.data = 1;
        Node<Integer> second = new Node<Integer>();
        second.data = 5;
        Node<Integer> three = new Node<Integer>();
        three.data = 66;
        Node<Integer> four = new Node<Integer>();
        four.data = 2;
        Node<Integer> five = new Node<Integer>();
        five.data = 7;
        Node<Integer> six = new Node<Integer>();
        six.data = 8;
        first.next = second;
        second.next = three;
        three.next = four;
        four.next = five;
        five.next = six;
        six.next = three;
    }
    
    public boolean isCircle() {
        Node slow = first;
        Node quick = first;
        while(null != quick && null != quick.next) {
            slow = slow.next;
            quick = quick.next.next;
            if(slow == quick) {
                System.out.println(slow.data);
                return true;
            }
        }
        return false;
    }
    
    public int circleLength() {
        Node slow = first;
        Node quick = first;
        Node same = null;
        while(null != quick && null != quick.next) {
            slow = slow.next;
            quick = quick.next.next;
            if(slow == quick) {
                same = slow;
                break;
            }
        }
        
        if(null != same) {
            int i = 0;
            slow = same.next;
            while(slow != same) {
                i++;
                slow = slow.next;
            }
            return ++i;
        }
        return -1;
    }
    
    public Node findPort() {
        Node slow = first;
        Node quick = first;
       
        while(null != quick && null != quick.next) {
            slow = slow.next;
            quick = quick.next.next;
            if(slow == quick) {
                break;
            }
        }
        if(null == quick || null == quick.next) {
            return null;
        }
        slow = first;
        while(slow != quick) {
            slow = slow.next;
            quick = quick.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        CloseCircle circle = new CloseCircle();
        circle.init();
        System.out.println(circle.isCircle());
        System.out.println("i = " + circle.circleLength());
        Node node = circle.findPort();
        System.out.println(node.data);
    }
    
    

}
