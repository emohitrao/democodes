package com.example.bst;

public class VaildBST {

    public boolean isValidBST(Node node){
        return predictValidBST(node,null,null);
    }

    public boolean predictValidBST(Node testNode, Integer lower, Integer higher){
        if(testNode == null){
            return true;
        }
        Integer val = testNode.getKey();
        if(lower!=null && val <= lower){
            return false;
        }
        if(higher!=null && val >= higher){
            return false;
        }
        if(!predictValidBST(testNode.getRight(),val,higher))
            return false;
        if(!predictValidBST(testNode.getLeft(),lower,val))
            return false;
        return true;

    }
}
