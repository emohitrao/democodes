package com.example.bst;

public class Bst {

    Node root;

    public Bst() {
        this.root = null;
    }

    public void insertBst(Integer key){
        Node n1 = new Node(key);

        if(root == null){
            root = n1;
        }
        else{
            Node parIns = root;
            Node insNode = root;

            while (insNode!=null){
                parIns = insNode;
                if(key<insNode.getKey()){
                    insNode = insNode.getLeft();
                }
              else{
                   insNode = insNode.getRight();
                }
            }
            if(key<parIns.getKey()){
                parIns.setLeft(n1);
            }
            else{
                parIns.setRight(n1);
            }
        }
    }


}
