# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def inorderTraversal(self, root: Optional[TreeNode]) -> List[int]:
        if root is None: return []
        def dfs(root,res):
            if root is None: return
            dfs(root.left,res)
            res.append(root.val)
            dfs(root.right,res)
            return res
        return dfs(root,[])