public class AddEffect extends Command {

    private String effectCode;

    public AddEffect(Application application, Editor editor, String effectCode) {
        super(application, editor);
        this.effectCode = effectCode;
    }

    @Override
    public boolean execute() {
        //Hàm này sẽ thực hiện thêm hiệu ứng với mã effectCode lên hình ảnh của chúng ta.
        //Do hàm này có sự thay đổi, ta sẽ tiến hành tạo ra một Backup trước khi thực hiện thay đổi.
        saveBackup();
        //Thực hiện thao tác thêm hiệu ứng ở bên dưới.
        return true;
    }
}
