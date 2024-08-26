class Solution {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        dfs(root, res, 0);
        return res;
    }

    private void dfs(Node root, List<List<Integer>> res, int level) {
        if(root == null)
            return;

        if(res.size() <= level)
            res.add(new ArrayList<>());

        res.get(level).add(root.val);

        for(Node child : root.children)
            dfs(child, res, level + 1);
    }
}