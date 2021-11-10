package BT__TESS__1;

public class NhanVien {
    private int id;
    private String name;
    private String gioitinh;
    int age;

    private static int num = 1;

    public NhanVien(String name, String gioitinh, int age) {
        this.id = num++;
        this.name = name;
        this.gioitinh = gioitinh;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "id= " + id +
                ", name= " + name + '\'' +
                ", gioitinh ='" + gioitinh + '\'' +
                ", age = " + age +
                '}';
    }
}
