import java.util.Objects;

public class Student {

    private String FIO;
    private String group;
    private int iDNumber;
    private int bal;

    //конструктор
    public Student(String _FIO, String _group, int iDNumber, int bal) {
        FIO = _FIO;
        group = _group;
        this.iDNumber = iDNumber;
        this.bal = bal;
    }

    public Student(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public Student(int iDNumber, int bal){

        this.iDNumber = iDNumber;
        this.bal = bal;
    }

    //геттеры и сеттеры

    public void setBal(int bal) {
        this.bal = bal;
    }

    public int getBal() {
        return bal;
    }

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String _FIO) {
        FIO = _FIO;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String _group) {
        group = _group;
    }

    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    @Override
    public int hashCode() {
        return Objects.hash(iDNumber);
    }

    @Override
    public String toString() {
        return FIO + " " + group + " " + iDNumber + " " + bal;
    }
}