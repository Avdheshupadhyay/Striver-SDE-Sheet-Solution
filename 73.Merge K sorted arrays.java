public int[] mergeKSortedArrays(int[][] arrays) {
    PriorityQueue<Integer> pq = new PriorityQueue<>();

    for (int[] array : arrays) {
        for (int num : array) {
            pq.add(num);
        }
    }

    int size = pq.size();
    int[] result = new int[size];
    int i = 0;
    while (!pq.isEmpty()) {
        result[i++] = pq.poll();
    }

    return result;
}
