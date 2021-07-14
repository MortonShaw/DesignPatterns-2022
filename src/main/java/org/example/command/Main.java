package org.example.command;

/**
 * @author MortonShaw
 * @date 2021/7/14 21:14
 */
public class Main {

    public static void main(String[] args) {
        Content c = new Content();

        InsertCommand insertCommand = new InsertCommand(c);
        insertCommand.exec();
        insertCommand.undo();

        CopyCommand copyCommand = new CopyCommand(c);
        copyCommand.exec();
        copyCommand.undo();

        DeleteCommand deleteCommand = new DeleteCommand(c);
        deleteCommand.exec();
        deleteCommand.undo();

        System.out.println(c.msg);
    }

}
