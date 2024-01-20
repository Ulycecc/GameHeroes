package Units;

/*
* Это координаты точки
* */
public class Coordinates {
    public int x; // абсцисса точки
    public int y; // ордината точки
    public static int y_min = 1;
    public static int y_max = 10;
    public static int x_min = 1;
    public static int x_max = 10;

    // возвращает строку с описанием точки
    public String toString() {
        return "("+x+";"+y+")";
    }
    // выводит на экран описание точки
    public void printCoordinates() {
        System.out.print(this.toString());
    }
    // метод перемещает точку на указанный вектор

    public void moveCoordinates(int a, int b) {
        x = x + a;
        y = y + b;
    }
    public Coordinates creatingCoordinates(int a, int b) {
        Coordinates Coord = new Coordinates();
        Coord.x = this.x + a;
        if(Coord.x > x_max)Coord.x = x_max;
        if(Coord.x < x_min)Coord.x = x_min;
        Coord.y = this.y + b;
        if(Coord.y > y_max)Coord.y = y_max;
        if(Coord.y < y_min)Coord.y = y_min;
        return Coord;
    }
    // метод изменяет координаты точки на указанные
    public void setCoordinates(int a, int b) {
        x = a;
        y = b;
    }
    // конструктор по умолчанию, создающий точку в начале координат
    public Coordinates() {
        this(0, 0);
    }
    // конструктор, создающий точку с указанными координатами
    public Coordinates(int a, int b) {
        x = a;
        y = b;
    }
    // метод вычисляющий расстояние между точками
    public Double length(Coordinates p) {
        return Math.sqrt( Math.pow(p.x-x,2) + Math.pow(p.y-y,2) );
    }
    // метод проверяющий совпадают ли точки
    public boolean equalsCoordinates(Coordinates p) {
        if(this.x == p.x && this.y == p.y) {
            return true;
        }
        else {
            return false;
        }
    }

}