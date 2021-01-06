public class Button {

    private Command command;

    public void onClick () {
        //Khi người dùng bấm vào nút này thì onClick sẽ được gọi để thực thi lệnh đã cài đặt sẵn.
        command.execute();
    }

    public Button(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }
}
