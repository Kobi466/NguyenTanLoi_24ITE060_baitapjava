package bai5.bai5_1;

public class LineSub extends Point {
    // Điểm kết thúc
    private Point end;

    // Constructor
    public LineSub(int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY); // Gọi constructor lớp cha để xác định điểm bắt đầu
        this.end = new Point(endX, endY); // Xác định điểm kết thúc
    }

    public LineSub(Point begin, Point end) { // Dùng khi đã có điểm
        super(begin.getX(), begin.getY()); // Gọi constructor lớp cha
        this.end = end;
    }

    // Phương thức công khai
    @Override // ghi de phuong thuc khai bao i chang chi doi noi dung ben trong
    public String toString() {
        return "LineSub [begin=" + super.toString() + ", end=" + end.toString() + "]";
    }

    public Point getBegin() {
        return new Point(super.getX(), super.getY());
    }

    public Point getEnd() {
        return end;
    }

    public void setBegin(int x, int y) {
        super.setXY(x, y);
    }

    public void setEnd(int x, int y) {
        end.setXY(x, y);
    }

    public int getBeginX() {
        return super.getX();
    }

    public int getBeginY() {
        return super.getY();
    }

    public int getEndX() {
        return end.getX();
    }

    public int getEndY() {
        return end.getY();
    }

    public void setBeginX(int x) {
        super.setX(x);
    }

    public void setBeginY(int y) {
        super.setY(y);
    }

    public void setEndX(int x) {
        end.setX(x);
    }

    public void setEndY(int y) {
        end.setY(y);
    }

    public double getLength() {
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return  Math.sqrt(xDiff * xDiff + yDiff * yDiff);
    }
    public double getGradient(){
        int xDiff = getEndX() - getBeginX();
        int yDiff = getEndY() - getBeginY();
        return  Math.atan2(yDiff, xDiff);
    }
}

