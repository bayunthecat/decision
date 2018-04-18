package com.mine.university.core;

import com.scalified.tree.TraversalAction;
import com.scalified.tree.TreeNode;
import com.scalified.tree.multinode.ArrayMultiTreeNode;
import org.junit.jupiter.api.Test;

public class TestTree {

    @Test
    public void testTree() {
        TreeNode<String> root = new ArrayMultiTreeNode<>("root");
        root.add(new ArrayMultiTreeNode<>("level-1-child-1"));
        root.add(new ArrayMultiTreeNode<>("level-1-child-2"));
        root.add(new ArrayMultiTreeNode<>("level-1-child-3"));

        root.traversePostOrder(new TraversalAction<TreeNode<String>>() {

            private boolean completed;

            @Override
            public void perform(TreeNode<String> stringTreeNode) {
                if (stringTreeNode.data().contains("child-1")) {
                    completed = true;
                }
            }

            @Override
            public boolean isCompleted() {
                return completed;
            }

        });
        System.out.println(root);
    }
}
