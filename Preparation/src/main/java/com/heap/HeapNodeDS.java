/**
 *
 */
package com.heap;

import java.util.Hashtable;

/**
 * @author dp250219
 *
 */
public class HeapNodeDS {
    private int maxSize;
    private int[] nodes;
    private int cnt = 0;

    public HeapNodeDS(int maxSize) {
        nodes = new int[maxSize];
    }

    public boolean insert(int data) {
        if (maxSize == cnt) {
            return false;
        }

        nodes[cnt] = data;
        cnt++;
        moveUp(cnt);
        return false;
    }

    public void moveUp(int index) {
        int bottom = nodes[index];
        int parent = (index - 1) / 2;

        while (index > 0 && nodes[parent] < bottom) {
            nodes[index] = nodes[parent];
            index = parent;
            parent = (index - 1) / 2;
        }
        nodes[index] = bottom;
    }

    public int delete() {
        if (0 == cnt) {
            return 0;
        }
        int root = this.nodes[0];
        int currentLength = this.nodes.length;
        this.nodes[0] = this.nodes[--currentLength];
        moveDown(0);
        return root;
    }

    public void moveDown(int index) {
        int largerChildIndex = 0;
        int top = nodes[index];
        int currentLength = this.nodes.length;
        while (index < this.nodes.length/2) {

            int leftIndex = 2 * index + 1;
            int rightIndex = 2 * index + 2;

            if(rightIndex < currentLength && this.nodes[rightIndex] > this.nodes[leftIndex]){
                largerChildIndex = rightIndex;
            }else{
                largerChildIndex = leftIndex;
            }

            if(top >= this.nodes[largerChildIndex]){
                break;
            }
            this.nodes[index] = this.nodes[largerChildIndex];
            index = largerChildIndex;
        }
        nodes[index] = top;
    }

}
