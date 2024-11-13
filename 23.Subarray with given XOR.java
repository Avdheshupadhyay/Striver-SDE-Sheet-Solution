public static int subarrayXorCount(int[] A, int B) {
    int count = 0, prefixXor = 0;
    HashMap<Integer, Integer> xorMap = new HashMap<>();

    for (int num : A) {
        prefixXor ^= num;
        if (prefixXor == B) count++;
        int requiredXor = prefixXor ^ B;
        count += xorMap.getOrDefault(requiredXor, 0);
        xorMap.put(prefixXor, xorMap.getOrDefault(prefixXor, 0) + 1);
    }

    return count;
}