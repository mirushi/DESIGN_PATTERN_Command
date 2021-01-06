import java.util.List;
import java.util.Stack;

public class Application {
    private PCScreen pcScreen;
    private Stack<Editor> editors = new Stack<>();
    private Editor activeEditor;
    private CommandHistory history;

    public void createUI () {
        //Tạo ra các thao tác.
        Command addEffect = new AddEffect(this, activeEditor, "123ef");
        Command addText = new AddText(this, activeEditor, "some cool text");
        Command drawImage = new DrawImage(this, activeEditor);
        Command undoCommand = new UndoCommand(this, activeEditor);

        //Tạo ra các nút bấm sẽ gọi đến các thao tác bên trên.
        Button addEffectButton = new Button(addEffect);
        Button addTextButton = new Button(addText);
        Button drawImageButton = new Button(drawImage);
        Button undoCommandButton = new Button(undoCommand);
    }

    public void executeCommand (Command command) {
        //Thực thi một Command được truyền vào và xác định xem command này có cần lưu lại trạng thái hay không.
        if (command.execute()) {
            history.push(command);
        }
    }

    public Application (PCScreen pcScreen) {
        this.pcScreen = pcScreen;
    }

    public PCScreen getPcScreen () {
        return pcScreen;
    }

    public void undo () {
        //Lấy ra command gần nhất và tiến hành gọi undo.
        Command command = history.pop();
        if (command != null) {
            command.undo();
        }
    }
}
