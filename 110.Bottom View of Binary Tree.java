public static void bottomView(Node root) {
    if (root == null) return;

    Map<Integer, Integer> mp = new HashMap<>(); 
    Queue<pair<Node, Integer>> q = new LinkedList<>();

    q.add(new Pair(root, 0)); 

    while (!q.isEmpty()) {
        Node cur = q.poll().getKey();
        int hd = q.poll().getValue();
        mp.put(hd, cur.data);

        if (cur.left != null) q.add(new Pair(cur.left, hd - 1));
        if (cur.right != null) q.add(new Pair(cur.right, hd + 1));
    }

    
    for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
        System.out.print(entry.getValue() + " ");
    }
    System.out.println();
}
