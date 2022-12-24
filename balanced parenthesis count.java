import java.util.*;

class Ssaskk {
    public static int bal(String s) {
        int res = 0;
        Stack<Integer> st = new Stack<>();
        st.push(-1);
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(i);
            } else {
                st.pop();
                if (st.size() > 0) {
                    int len = i - st.peek();
                    res = Math.max(len, res);
                } else {
                    st.push(i);
                }
            }
        }
        return res / 2;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(bal(s));
    }
}