public static List<Integer> nextGreaterPermutation(List<Integer> A) {
    int n = A.size();
    int ind = -1;
    for (int i = n - 2; i >= 0; i--) {
        if (A.get(i) < A.get(i + 1)) {
            ind = i;
            break;
        }
    }

    if (ind == -1) {
        Collections.reverse(A);
        return A;
    }

    for (int i = n - 1; i > ind; i--) {
        if (A.get(i) > A.get(ind)) {
            int tmp = A.get(i);
            A.set(i, A.get(ind));
            A.set(ind, tmp);
            break;
        }
    }

    List<Integer> sublist = A.subList(ind + 1, n);
    Collections.reverse(sublist);

    return A;
}