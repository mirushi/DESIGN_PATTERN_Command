public class Editor {
    private Image currentImage;

    public void drawCurrentImage (PCScreen pcScreen) {
        //Hàm này sẽ thực hiện vẽ hình ảnh hiện tại được lưu trong Editor lên màn hình.
        //Thực hiện lặp thuật toán vẽ điểm ảnh để vẽ hình ảnh lên màn hình.
        pcScreen.drawPixel(0,1,2);
    }

    public Image getCurrentImage () {
        return this.currentImage;
    }

    public void setCurrentImage (Image image) {
        this.currentImage = image;
    }

}
