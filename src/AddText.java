public class AddText extends Command {

    private String text;

    public AddText(Application application, Editor editor, String text) {
        super(application, editor);
        this.text = text;
    }

    @Override
    public boolean execute() {
        //Hàm này sẽ thực hiện thêm text lên hình ảnh của chúng ta.
        //Do hàm này có sự thay đổi, ta sẽ tiến hành tạo ra một Backup trước khi thực hiện thay đổi.
        saveBackup();
        //Thực hiện thao tác thêm text ở bên dưới.
        return true;
    }
}
