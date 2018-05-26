/**
 *
 */
package com.binarytree;

/**
 * @author dp250219
 *
 */
public class TreeNode<T extends Comparable<T>> implements Comparable<T> {
    private T t;
    private TreeNode<T> rightChild;
    private TreeNode<T> leftChild;
    private boolean isDeleted = false;

    public TreeNode(T t) {
        this.t = t;
    }
    public void traverseInOrder(){
        if(this != null){
            if(this.leftChild == null){
                System.out.println("Left Child: " + this.leftChild.getT());
            }else{
                this.leftChild.traverseInOrder();
            }

            System.out.println("Root Child: " + this.getT());

            if(this.rightChild == null){
                System.out.println("Right Child: " + this.rightChild.getT());
            }else{
                this.rightChild.traverseInOrder();
            }
        }
    }

    public void traversePreOrder(){
        if(this != null){

            System.out.println("Root Child: " + this.getT());

            if(this.leftChild == null){
                System.out.println("Left Child: " + this.leftChild.getT());
            }else{
                this.leftChild.traversePreOrder();
            }


            if(this.rightChild == null){
                System.out.println("Right Child: " + this.rightChild.getT());
            }else{
                this.rightChild.traversePreOrder();
            }
        }
    }

    public void traversePostOrder(){
        if(this != null){
            if(this.leftChild == null){
                System.out.println("Left Child: " + this.leftChild.getT());
            }else{
                this.leftChild.traversePostOrder();
            }


            if(this.rightChild == null){
                System.out.println("Right Child: " + this.rightChild.getT());
            }else{
                this.rightChild.traversePostOrder();
            }

            System.out.println("Root Child: " + this.getT());
        }
    }



    public TreeNode<T> smallest() {
        if (this.leftChild == null) {
            return this;
        } else {
            return this.getLeftChild().smallest();
        }
    }

    public TreeNode<T> largest() {
        if (this.rightChild == null) {
            return this;
        } else {
            return this.getRightChild().largest();
        }
    }

    public TreeNode<T> find(T t) {
        if (this.t == t && !this.isDeleted) {
            return this;
        }
        if (t.compareTo(this.t) > 0 && null != rightChild) {
            return rightChild.find(t);
        }
        if (null != leftChild) {
            return leftChild.find(t);
        }
        return null;
    }

    public void insert(T key) {
        if (key.compareTo(t) >= 0) {
            if (this.rightChild == null) {
                this.rightChild = new TreeNode<T>(key);
            } else {
                this.rightChild.insert(key);
            }
        } else {
            if (this.leftChild == null) {
                this.leftChild = new TreeNode<T>(key);
            } else {
                this.leftChild.insert(key);
            }
        }
    }

    public TreeNode<T> getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode<T> rightChild) {
        this.rightChild = rightChild;
    }

    public TreeNode<T> getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode<T> leftChild) {
        this.leftChild = leftChild;
    }

    public T getT() {
        return t;
    }

    public void delete() {
        this.isDeleted = true;
    }

    public boolean isDeleted() {
        return this.isDeleted;
    }

    @Override
    public int compareTo(T o) {
        return t.compareTo(o);
    }

}
