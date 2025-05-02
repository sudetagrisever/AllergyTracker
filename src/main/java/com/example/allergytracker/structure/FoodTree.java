package com.example.allergytracker.structure;

import java.util.ArrayList;
import java.util.List;

public class FoodTree {

    private Node root;

    static class Node {
        String food;
        Node left, right;

        Node(String food) {
            this.food = food;
        }
    }

    public void insert(String food) {
        root = insertRecursive(root, food);
    }

    private Node insertRecursive(Node root, String food) {
        if (root == null) return new Node(food);
        if (food.compareToIgnoreCase(root.food) < 0)
            root.left = insertRecursive(root.left, food);
        else if (food.compareToIgnoreCase(root.food) > 0)
            root.right = insertRecursive(root.right, food);
        return root;
    }

    public boolean search(String food) {
        return searchRecursive(root, food);
    }

    private boolean searchRecursive(Node root, String food) {
        if (root == null) return false;
        if (root.food.equalsIgnoreCase(food)) return true;
        return food.compareToIgnoreCase(root.food) < 0
                ? searchRecursive(root.left, food)
                : searchRecursive(root.right, food);
    }

    public List<String> getAllFoods() {
        List<String> result = new ArrayList<>();
        inOrderTraversal(root, result);
        return result;
    }

    private void inOrderTraversal(Node node, List<String> list) {
        if (node != null) {
            inOrderTraversal(node.left, list);
            list.add(node.food);
            inOrderTraversal(node.right, list);
        }
    }
}

