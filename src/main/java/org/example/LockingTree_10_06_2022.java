package org.example;
/*Implement locking in a Binary Tree. A binary tree can be locked or unlocked only if all of its descendants or ancestors
are not locked. Design a binary tree node class with following methods:
# is_Locked, which returns whether the node is locked
# lock, which attempts to lock the node. If it cannot be locked, then it should return false. Otherwise, it should lock it and return true.
# unLock, which unlocks the node. If it cannot be unlocked, then it should return false. Otherwise, it should unlock it and retrun true.
You may augment the node to add parent pointers or any other property you would like.
you may assume the class used in a single threaded program, so there is no need for actual locks or
mutexes. Each method should run in O(h), where h is the height of tree.
 */
public class LockingTree_10_06_2022 {
    class BinaryTreeNode{
        boolean locked;
        BinaryTreeNode parent;
        BinaryTreeNode leftChild;
        BinaryTreeNode rightChild;
    }
    boolean lock(BinaryTreeNode node){
        if(!checkLockPreCondition(node)){
            return false;
        }
        node.locked = true;
        return true;
    }
    boolean unLock(BinaryTreeNode node){
        if(!checkLockPreCondition(node)){
            return false;
        }
        node.locked = false;
        return true;
    }
    boolean is_locked(BinaryTreeNode node){
        return node.locked;
    }
    boolean checkLockPreCondition(BinaryTreeNode node){
        boolean left = checkChildLockCondition(node.leftChild);
        if(!left){
            return false;
        }
        boolean right = checkChildLockCondition(node.leftChild);
        if(!right){
            return false;
        }
        while(node.parent!=null) {
            if (node.parent.locked) {
                return false;
            }
            node.parent = node.parent.parent;
        }
        return true;
    }
    boolean checkChildLockCondition(BinaryTreeNode node){
        if(node == null){
            return true;
        }
        if(node.locked){
            return false;
        }
        boolean left = checkChildLockCondition(node.leftChild);
        if(!left){
            return false;
        }
        boolean right = checkChildLockCondition(node.rightChild);
        return right;
    }
}


/* Aravind's review : 1. When lock method is called with node 'x' to lock, you are checking if any descendant or ancestor is locked but not checking 
                         if 'x' is already locked.
                         
                      2. In ChildLockPreCondition, while it is checking if node.parent is locked , it is directly swapping node.parent 
                         with node.parent.parent which should not happen as it is overwriting 'x' parent node with it's ancestors. In this case you
                         can use a temp node of x and perform swapping on that node's parent because the actual node won't be affected.
                         
                      3. When unlock method with node 'x' is called, it's not checking if 'x' is locked or not instead checking if any node in
                         the subtree is locked which is not required. There exists only 2 cases to check here i.e., if 'x' is not locked
                         return false as the node is already unlocked and if 'x' is locked then unlock and return true and doesn't require if any of the
                         ancestor or descendant is locked becuase if it is locked no other ancestor or descendant should be locked as per the rule.
                         
                      4. Whenever you want to know if any node is locked use is_locked(node) method instead of directly contacting locked variable using 
                         node.locked.
                         
                      5. Use relevant variable names and write comment lines.
                      */
