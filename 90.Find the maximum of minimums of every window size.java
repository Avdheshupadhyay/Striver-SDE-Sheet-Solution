public static int[] maxMin(int[] arr, int n) {
    int[] pse = new int[n];
    int[] nse = new int[n];
    int[] result = new int[n];
    
    Stack<Integer> stack = new Stack<>();
    
    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
            stack.pop();
        }
        pse[i] = stack.isEmpty() ? -1 : stack.peek();
        stack.push(i);
    }
    
    stack.clear();
    
    for (int i = n - 1; i >= 0; i--) {
        while (!stack.isEmpty() && arr[stack.peek()] >= arr[i]) {
            stack.pop();
        }
        nse[i] = stack.isEmpty() ? n : stack.peek();
        stack.push(i);
    }
    
    int[] minForWindow = new int[n + 1];
    for (int i = 0; i < n; i++) {
        int len = nse[i] - pse[i] - 1;
        minForWindow[len] = Math.max(minForWindow[len], arr[i]);
    }
    
    for (int i = n - 1; i >= 1; i--) {
        minForWindow[i] = Math.max(minForWindow[i], minForWindow[i + 1]);
    }
    
    for (int i = 0; i < n; i++) {
        result[i] = minForWindow[i + 1];
    }
    
    return result;
}