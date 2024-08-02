package gof.design.patterns.gof.composite.application;

import gof.design.patterns.gof.composite.tree.Node;

public class Application {

    public static void main(String[] args) {

        var nodeRootLevel = new Node(5);
        var leafFirstLevel = nodeRootLevel.addLeaf(2);
        var nodeFirstLevel = nodeRootLevel.addNode(2);
        nodeFirstLevel.addLeaf(45);
        nodeFirstLevel.addLeaf(13);
        var nodeSecondLevel = nodeFirstLevel.addNode(7);
        nodeSecondLevel.addLeaf(4);
        nodeSecondLevel.addLeaf(1);

        System.out.println("Tree sum before increment: " + nodeRootLevel.sum());
        System.out.println("Tree sum after increment: " + nodeRootLevel.increment());
        System.out.println("Tree sum after decrement: " + nodeRootLevel.decrement());
        nodeRootLevel.remove(leafFirstLevel);
        nodeFirstLevel.remove(nodeSecondLevel);
        System.out.println("Tree sum after removal of first-level leaf and second-level node: " + nodeRootLevel.sum());
        System.out.println("Tree sum after increment: " + nodeRootLevel.increment());
        System.out.println("Tree sum after decrement: " + nodeRootLevel.decrement());
    }

}
