/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package praktikum1;

/**
 *
 * @author jneferboy
 */
public class BruteForce {

    final int minASCII = 97;
    final int maxASCII = 122;
    final int stringLength = 4;

    CharNode firstNode = new CharNode(minASCII);

    public BruteForce() {

        CharNode tempNode = firstNode;
        //Create stringLength number of CharNodes as a doubly linked list
        //The last node is used as an end of string marker
        for(int i = 0; i < stringLength; i++) {
            CharNode nextNode = new CharNode(minASCII - 1);
            tempNode.setNextNode(nextNode);
            nextNode.setPreviousNode(tempNode);
            tempNode = nextNode;

            //Link the last node with the first node, and the first node with
            //the last node to make it a circular linked list
            if (i == stringLength - 1) {
                nextNode.setNextNode(firstNode);
                firstNode.setPreviousNode(nextNode);
            }
        }
        //keep printing and incrementing the nodes until the last
        //marker node is incremented
        while (firstNode.getPreviousNode().getData() == (minASCII - 1)) {
            printData();
            firstNode.incrementData();
        }
    }

    private void printData() {

        CharNode tempNode = firstNode;

        while (tempNode.getData() != (minASCII -1)){
            System.out.print((char)tempNode.getData());
            tempNode = tempNode.getNextNode();
        }
        System.out.println();
    }

    /*
     * One CharNode represents one character. Each CharNode links to
     * the next CharNode and to the previous CharNode. Based on the
     * circular doubly linked list data structure.
     */
    private class CharNode {

        private int data = 0;
        private CharNode nextNode = null;
        private CharNode previousNode = null;

        public CharNode(int data) {
            this.data = data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public int getData() {
            return data;
        }

        public void setNextNode(CharNode nextNode) {
            this.nextNode = nextNode;
        }

        public CharNode getNextNode() {
            return nextNode;
        }

        //Automatically increment the next node and reset data to minASCII
        //once maxASCII is reached
        public void incrementData() {
            if (data >= maxASCII) {
                this.getNextNode().incrementData();
                data = minASCII;
            }
            else
                data++;
        }

        public CharNode getPreviousNode() {
            return previousNode;
        }

        public void setPreviousNode(CharNode previousNode) {
            this.previousNode = previousNode;
        }
    }

    public static void main(String[] args) {
        new BruteForce();
    }
    
}
