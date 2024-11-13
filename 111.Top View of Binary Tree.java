public static void topView(Node head, int dis, int level, Map<Integer, Pair<Integer, Integer>> map) {
    if (head == null) return;

    if (!map.containsKey(dis) || level < map.get(dis).second) {
        map.put(dis, new Pair(head.data, level));
    }

    topView(head.left, dis - 1, level + 1, map);
    topView(head.right, dis + 1, level + 1, map);
}

public static void topView(Node head) {
    Map<Integer, Pair<Integer, Integer>> map = new TreeMap<>();
    topView(head, 0, 0, map);

    for (Map.Entry<Integer, Pair<Integer, Integer>> entry : map.entrySet()) {
        System.out.print(entry.getValue().getKey() + " ");
    }
}