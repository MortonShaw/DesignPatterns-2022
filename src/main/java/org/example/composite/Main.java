package org.example.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author MortonShaw
 * @date 2021/7/12 20:09
 */
class Main {

    public static void main(String[] args) {
        BranchNode root = new BranchNode("root");
        BranchNode chapter01 = new BranchNode("chapter01");
        BranchNode chapter02 = new BranchNode("chapter02");

        Node c11 = new LeafNode("c11");
        Node c12 = new LeafNode("c12");

        BranchNode b21 = new BranchNode("section21");
        Node c211 = new LeafNode("c211");
        Node c212 = new LeafNode("c212");

        root.add(chapter01);
        root.add(chapter02);

        chapter01.add(c11);
        chapter01.add(c12);
        chapter02.add(b21);

        b21.add(c211);
        b21.add(c212);

        tree(root, 0);
    }

    static void tree(Node node, int depth) {
        for (int i = 0; i < depth; i++) {
            System.out.print(">");
        }
        node.operate();
        if (node instanceof BranchNode) {
            for (Node n : ((BranchNode) node).nodeList) {
                tree(n, depth + 1);
            }
        }
    }

}

interface Node {

    void operate();

}

class LeafNode implements Node {

    String content;

    public LeafNode(String content) {
        this.content = content;
    }

    @Override
    public void operate() {
        System.out.println(content);
    }

}

class BranchNode implements Node {

    List<Node> nodeList = new ArrayList<>();

    String name;

    public BranchNode(String name) {
        this.name = name;
    }

    @Override
    public void operate() {
        System.out.println(name);
    }

    public void add(Node node) {
        nodeList.add(node);
    }

}


