package org.example.command;

/**
 * @author MortonShaw
 * @date 2021/7/14 21:09
 */
public class CopyCommand implements Command {

    Content c;

    public CopyCommand(Content c) {
        this.c = c;
    }

    @Override
    public void exec() {
        c.msg += c.msg;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() / 2);
    }

}
