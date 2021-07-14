package org.example.visitor;

/**
 * @author MortonShaw
 * @date 2021/7/14 16:31
 */
class Computer {
    ComputePart cpu = new CPU();
    ComputePart memory = new Memory();
    ComputePart board = new Board();

    void accept(Visitor v) {
        this.cpu.accept(v);
        this.memory.accept(v);
        this.board.accept(v);
    }

    public static void main(String[] args) {
        PersonVisitor p = new PersonVisitor();
        new Computer().accept(p);
        System.out.println(p.totalPrice);
    }

}

abstract class ComputePart {

    abstract void accept(Visitor visitor);

    abstract double getPrice();

}

class CPU extends ComputePart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitCpu(this);
    }

    @Override
    double getPrice() {
        return 300;
    }

}

class Memory extends ComputePart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitMemory(this);
    }

    @Override
    double getPrice() {
        return 400;
    }

}

class Board extends ComputePart {

    @Override
    void accept(Visitor visitor) {
        visitor.visitBoard(this);
    }

    @Override
    double getPrice() {
        return 500;
    }

}

interface Visitor {

    void visitCpu(CPU cpu);
    void visitMemory(Memory memory);
    void visitBoard(Board board);

}

class PersonVisitor implements Visitor {

    double totalPrice = 0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.9;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.85;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.95;
    }

}

class CorporationVisitor implements Visitor {

    double totalPrice = 0;

    @Override
    public void visitCpu(CPU cpu) {
        totalPrice += cpu.getPrice() * 0.6;
    }

    @Override
    public void visitMemory(Memory memory) {
        totalPrice += memory.getPrice() * 0.75;
    }

    @Override
    public void visitBoard(Board board) {
        totalPrice += board.getPrice() * 0.75;
    }

}
