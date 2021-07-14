package org.example.command;

/**
 * @author MortonShaw
 * @date 2021/7/14 21:09
 */
public class DeleteCommand implements Command {

    Content c;
    String deleted;

    public DeleteCommand(Content c) {
        this.c = c;
    }

    @Override
    public void exec() {
        deleted = c.msg.substring(0, 5);
        c.msg = c.msg.substring(5);
    }

    @Override
    public void undo() {
        c.msg = deleted + c.msg;
    }

}
