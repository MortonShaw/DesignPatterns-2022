package org.example.command;

/**
 * @author MortonShaw
 * @date 2021/7/14 21:05
 */
public class InsertCommand implements Command {

    Content c;

    String strToInsert = "http://www.mashibing.com";

    public InsertCommand(Content c) {
        this.c = c;
    }

    @Override
    public void exec() {
        c.msg += strToInsert;
    }

    @Override
    public void undo() {
        c.msg = c.msg.substring(0, c.msg.length() - strToInsert.length());
    }

}
