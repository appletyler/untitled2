public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width; // метод нужен для получения имени
    }

    public void setWidth(int width) {
        this.width = width; // метод нужен для установки ширины
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getArea(){
        return(int)(height*width);
    }
    public int getPerimeter(){
        return (int)(height*2+width*2);
    }




}
