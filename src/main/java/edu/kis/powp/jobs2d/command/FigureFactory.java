package edu.kis.powp.jobs2d.command;
import static java.lang.Math.sqrt;

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
    public static ComplexCommand createTriangle(int x, int y, int a) {
        ComplexCommand command = new ComplexCommand();
        command.addCommand(new SetPositionCommand(x +a/2, y));
        command.addCommand(new OperateToCommand(x , y+(int)(a*sqrt(3)/2 )));
        command.addCommand(new OperateToCommand(x + a, y+(int)(a*sqrt(3)/2 )));
        command.addCommand(new OperateToCommand(x +a/2, y));
        return command;
    }
}
