#author: 袁佳林
from collections import deque
n = int(input())
postorder = list(map(int, input().split()))
inorder= list(map(int, input().split()))
class TreeNode:
    def __init__(self, val=0, left=None, right=None):
        self.val = val
        self.left = left
        self.right = right

def buildTree(inorder, postorder):
    if not postorder:
        return None
    root = TreeNode(postorder[-1])
    i = inorder.index(root.val)     # 寻找切割点之后将数组分割为左右子树再递归建树
    inorder_left, inorder_right = inorder[:i], inorder[i + 1:]
    postorder_left, postorder_right = postorder[:len(inorder_left)], postorder[len(inorder_left):-1]
    root.left = buildTree(inorder_left, postorder_left)
    root.right = buildTree(inorder_right, postorder_right)
    return root

def Bfs(root):
    res = []
    if not root:return res
    deq = deque([root])
    while deq:
        for _ in range(len(deq)):
            cur = deq.popleft()
            res.append(cur.val)
            if cur.left:
                deq.append(cur.left)
            if cur.right:
                deq.append(cur.right)
    return res

print(" ".join(map(str, Bfs(buildTree(inorder, postorder)))))




