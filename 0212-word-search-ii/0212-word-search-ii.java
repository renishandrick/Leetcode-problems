class Solution {

    class Node {
        Node[] child = new Node[26];
        String word;
    }

    Node root = new Node();

    public List<String> findWords(char[][] board, String[] words) {

        List<String> ans = new ArrayList<>();

        for (String word : words) {
            insert(word);
        }

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                dfs(board, i, j, root, ans);
            }
        }

        return ans;
    }

    void insert(String word) {

        Node curr = root;

        for (char ch : word.toCharArray()) {
            int index = ch - 'a';

            if (curr.child[index] == null) {
                curr.child[index] = new Node();
            }

            curr = curr.child[index];
        }

        curr.word = word;
    }

    void dfs(char[][] board, int i, int j,
             Node curr, List<String> ans) {

        if (i < 0 || j < 0 ||
            i >= board.length || j >= board[0].length ||
            board[i][j] == '#') {
            return;
        }

        char ch = board[i][j];

        if (curr.child[ch - 'a'] == null) {
            return;
        }

        curr = curr.child[ch - 'a'];

        if (curr.word != null) {
            ans.add(curr.word);
            curr.word = null;
        }
        board[i][j] = '#';
        dfs(board, i + 1, j, curr, ans);
        dfs(board, i - 1, j, curr, ans);
        dfs(board, i, j + 1, curr, ans);
        dfs(board, i, j - 1, curr, ans);
        board[i][j] = ch;
    }
}