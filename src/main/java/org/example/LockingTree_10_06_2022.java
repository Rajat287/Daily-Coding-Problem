package org.example;
/*Implement locking in a Binary Tree. A binary tree can be locked or unlocked only if all of its descendants or ancestors
are not locked. Design a binary tree node class with following methods:
# is_Locked, which returns whether the node is locked
# lock, which attempts to lock the node. If it cannot be locked, then it should return false. Otherwise, it should lock it and return true.
# unLock, which unlocks the node. If it cannot be unlocked, then it should return false. Otherwise, it should unlock it and retrun true.
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
