package edu.kis.powp.jobs2d.command;

public class FigureFactory {
    public static ComplexCommand createRectangle(int x, int y, int w, int h) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(x, y));
        command.addCommand(new OperateToCommand(x + w, y));
        command.addCommand(new OperateToCommand(x + w, y + h));
        command.addCommand(new OperateToCommand(x, y + h));
        command.addCommand(new OperateToCommand(x, y));
        return command;
    }
}
