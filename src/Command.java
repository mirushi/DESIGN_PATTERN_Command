public abstract class Command {
    protected Application application;
    protected Editor editor;
    protected Image backup;

    public Command(Application application, Editor editor) {
        this.application = application;
        this.editor = editor;
    }

    //Tiến hành lưu lại trạng thái của Editor trước khi chỉnh sửa nó.
    public void saveBackup () {
        this.backup = this.editor.getCurrentImage();
    }

    public void undo () {
        this.editor.setCurrentImage(this.backup);
    }

    //Chúng ta sẽ tiến hành định nghĩa một phương thức execute abstract để bắt buộc tất cả các lớp con đưa ra implementation.
    public abstract boolean execute();
}
