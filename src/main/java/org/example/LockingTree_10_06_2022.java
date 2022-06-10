package org.example;

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
