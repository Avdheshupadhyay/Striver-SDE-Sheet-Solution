import java.util.*;

class LFUCache {
    
    class Node {
        int key, value, frequency;
        Node prev, next;
        
        Node(int key, int value) {
            this.key = key;
            this.value = value;
            this.frequency = 1;
        }
    }

    private Map<Integer, Node> cache;
    private Map<Integer, DoublyLinkedListNode> frequencyMap;
    private int capacity, size, minFrequency;

    public LFUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new HashMap<>();
        this.frequencyMap = new HashMap<>();
        this.size = 0;
        this.minFrequency = 1;
    }

    private void updateFrequency(Node node) {
        frequencyMap.get(node.frequency).removeNode(node);
        
        node.frequency++;
        frequencyMap.computeIfAbsent(node.frequency, k -> new DoublyLinkedListNode()).addNode(node);
        if (frequencyMap.get(minFrequency).isEmpty()) {
            minFrequency++;
        }
    }

    public int get(int key) {
        if (!cache.containsKey(key)) {
            return -1;
        }

        Node node = cache.get(key);
        updateFrequency(node);
        return node.value;
    }

    public void put(int key, int value) {
        if (capacity == 0) return;

        if (cache.containsKey(key)) {
            Node node = cache.get(key);
            node.value = value;
            updateFrequency(node);
        } else {
            if (size == capacity) {
               
                Node evicted = frequencyMap.get(minFrequency).removeLastNode();
                cache.remove(evicted.key);
                size--;
            }

            Node newNode = new Node(key, value);
            cache.put(key, newNode);
            frequencyMap.computeIfAbsent(1, k -> new DoublyLinkedListNode()).addNode(newNode);
            minFrequency = 1;
            size++;
        }
    }
}

class DoublyLinkedListNode {
    Node head, tail;
    
    DoublyLinkedListNode() {
        head = new Node(-1, -1);  
        tail = new Node(-1, -1);  
        head.next = tail;
        tail.prev = head;
    }

    void addNode(Node node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    Node removeLastNode() {
        if (head.next == tail) return null;
        Node lastNode = tail.prev;
        removeNode(lastNode);
        return lastNode;
    }

    void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    boolean isEmpty() {
        return head.next == tail;
    }
}

public class Main {
    public static void main(String[] args) {
        LFUCache cache = new LFUCache(3);

        cache.put(1, 1);
        cache.put(2, 2);
        cache.put(3, 3);

        System.out.println(cache.get(1)); // returns 1
        cache.put(4, 4); // evicts key 2

        System.out.println(cache.get(2)); // returns -1 (not found)
        System.out.println(cache.get(3)); // returns 3
        System.out.println(cache.get(4)); // returns 4
    }
}
