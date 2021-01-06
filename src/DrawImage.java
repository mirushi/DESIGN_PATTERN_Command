public class DrawImage extends Command {

    public DrawImage (Application application, Editor editor) {
        super(application, editor);
    }

    @Override
    public boolean execute() {
        //Vẽ hình ảnh hiện tại lên màn hình.
        editor.drawCurrentImage(this.application.getPcScreen());
        return false;
    }
}
