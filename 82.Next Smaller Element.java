public int[] nearestSmallerElement(int[] A) {
    int n = A.length;
    int[] result = new int[n];
    Stack<Integer> stack = new Stack<>();
    
    for (int i = 0; i < n; i++) {
        while (!stack.isEmpty() && stack.peek() >= A[i]) {
            stack.pop();
        }
        
        if (stack.isEmpty()) {
            result[i] = -1;
        } else {
            result[i] = stack.peek();
        }
        
        stack.push(A[i]);
    }
    
    return result;
}