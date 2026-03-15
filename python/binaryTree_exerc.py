class Node:
    def __init__(self, info):
        self.info = info
        self.left = None
        self.right = None
        self.level = None

    def __str__(self):
        return str(self.info)


class BinarySearchTree:
    def __init__(self):
        self.root = None

    def create(self, val):
        if self.root == None:
            self.root = Node(val)
        else:
            current = self.root

            while True:
                if val < current.info:
                    if current.left:
                        current = current.left
                    else:
                        current.left = Node(val)
                        break
                elif val > current.info:
                    if current.right:
                        current = current.right
                    else:
                        current.right = Node(val)
                        break
                else:
                    break


# Enter your code here. Read input from STDIN. Print output to STDOUT
'''
class Node:
      def __init__(self,info): 
          self.info = info  
          self.left = None  
          self.right = None 


       // this is a node of the tree , which contains info as data, left , right
'''


def height(root):
    counter = 0
    if root is None:
        return 0

    else:
        current = root
        while True:
            if current.right is not None:
                counter += 1
                current = current.right
            elif current.left is not None:
                counter += 1
                current = current.left
            else:
                return counter

# Solução recursiva
# def height(root):
#     if root is None:
#         return -1
#     left_height = height(root.left)
#     right_height = height(root.right)
#
#     return max(left_height, right_height) + 1

# com queue
# def height(root):
#     if root is None:
#         return -1
#
#     queue = [root]
#     height = -1
#
#     while queue:
#         level_size = len(queue)
#         for _ in range(level_size):
#             node = queue.pop(0)
#             if node.left: queue.append(node.left)
#             if node.right: queue.append(node.right)
#         height += 1
#
#     return height



# --- BLOCO PRINCIPAL (MAIN) ---
if __name__ == "__main__":
    tree = BinarySearchTree()

    # print("Digite a quantidade de números:")
    t = 7 #int(input())  # Ex: 7

    # print("Digite os números separados por espaço:")
    # Para a sua imagem: 3 2 5 1 4 6 7
    # arr = list(map(int, input().split()))
    arr = [3, 2, 5, 1, 4, 6, 7]

    for i in range(t):
        tree.create(arr[i])

    # print(tree.root)
    print(height(tree.root))
