/**
 *
 */
package com.binarytree;

/**
 * @author dp250219
 *
 */
public class BinarySearchTree {
    private TreeNode<Integer> root;

    public void insert(Integer key) {
        if (this.root == null) {
            this.root = new TreeNode<Integer>(key);
        } else {
            this.root.insert(key);
        }
    }

    public TreeNode<Integer> find(Integer key) {
        if (this.root != null) {
            return this.root.find(key);
        }
        return null;
    }

    public void inOrderTraverse() {
        if (this.root != null) {
            this.root.traverseInOrder();
        }
    }

    public TreeNode<Integer> minValue() {
        if (this.root != null) {
            return this.root.smallest();
        }
        return null;
    }

    public TreeNode<Integer> maxValue() {
        if (this.root != null) {
            return this.root.largest();
        }
        return null;
    }

    public void softDelete(Integer key) {
        TreeNode<Integer> nodeToBeDeleted = this.root.find(key);
        if (null != nodeToBeDeleted) {
            nodeToBeDeleted.delete();
        }
    }

    public void delete(Integer data) {
        TreeNode<Integer> current = this.root;
        TreeNode<Integer> parent = this.root;
        boolean isLeftChild = false;
        if (null == current) {
            return;
        }

        while (null != current && current.getT() != data) {
            parent = current;

            if (current.getLeftChild().getT() < data) {
                current = current.getLeftChild();
                isLeftChild = true;
            } else if (current.getRightChild().getT() > data) {
                current = current.getRightChild();
                isLeftChild = false;
            }

            if (null == current) {
                return;
            }
            // Case1: Node to be deleted is a leaf node.
            if (current.getLeftChild() == null && current.getRightChild() == null) {
                if (this.root == current) {
                    this.root = null;

                } else if (isLeftChild) {
                    parent.setLeftChild(null);

                } else {
                    parent.setRightChild(null);

                }
                // Case2: Node to be deleted has one leaf node.
            } else if (current.getLeftChild() == null) {
                if (this.root == current) {
                    this.root = current.getRightChild();
                } else if (isLeftChild) {
                    parent.setLeftChild(current.getRightChild());
                } else {
                    parent.setRightChild(current.getRightChild());
                }
            } else if (current.getRightChild() == null) {
                if (this.root == current) {
                    this.root = current.getLeftChild();
                } else if (isLeftChild) {
                    parent.setLeftChild(current.getLeftChild());
                } else {
                    parent.setRightChild(current.getLeftChild());
                }
            }
            // Case3: Node to be deleted has children.
        }
    }

    @Override
    public String toString() {
        String result = "{";
        return result;
    }
}
