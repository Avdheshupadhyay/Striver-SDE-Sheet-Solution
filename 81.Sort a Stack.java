public class Solution {
    public void sortedInsert(Stack<Integer> stack, int num) {
        if (stack.isEmpty() || stack.peek() <= num) {
            stack.push(num);
            return;
        }

        int temp = stack.pop();
        sortedInsert(stack, num);
        stack.push(temp);
    }

    public void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int num = stack.pop();
            sortStack(stack);
            sortedInsert(stack, num);
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        while (T-- > 0) {
            int N = sc.nextInt();
            Stack<Integer> stack = new Stack<>();
            for (int i = 0; i < N; i++) {
                stack.push(sc.nextInt());
            }

            sol.sortStack(stack);
            while (!stack.isEmpty()) {
                System.out.print(stack.pop() + " ");
            }
            System.out.println();
        }
    }
}
