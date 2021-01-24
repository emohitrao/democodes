package com.example.bst;

public class Node {

    private Node left;
    private Node right;
    private Integer key;

    public Node(Integer key){
        this.key = key;
        left = null;
        right = null;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public void setKey(Integer key) {
        this.key = key;
    }

    public Node getLeft() {
        return left;
    }

    public Node getRight() {
        return right;
    }

    public Integer getKey() {
        return key;
    }
}
