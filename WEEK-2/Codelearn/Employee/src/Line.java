public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int x1, int y1, int x2, int y2){
        this.begin = new Point(x1,y1);
        this.end = new Point(x2,y2);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    public double getLength(){
        return (Math.sqrt(Math.pow(vertice1.getX() - vertice2.getX(), 2) + Math.pow(vertice1.getY() - vertice2.getY(), 2)))+(Math.sqrt(Math.pow(vertice1.getX() - vertice3.getX(), 2) + Math.pow(vertice1.getY() - vertice3.getY(), 2)))+(Math.sqrt(Math.pow(vertice2.getX() - vertice13.getX(), 2) + Math.pow(vertice2.getY() - vertice3.getY(), 2)));
    }
}
