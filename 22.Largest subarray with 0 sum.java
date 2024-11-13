    public static int maxLen(int[] arr) {
        HashMap<Integer, Integer> sumMap = new HashMap<>();
        int maxLen = 0, currSum = 0;

        for (int i = 0; i < arr.length; i++) {
            currSum += arr[i];

            if (currSum == 0) {
                maxLen = i + 1;
            } else if (sumMap.containsKey(currSum)) {
                maxLen = Math.max(maxLen, i - sumMap.get(currSum));
            } else {
                sumMap.put(currSum, i);
            }
        }

        return maxLen;
    }