package pojo;

public class Appli {
    private String id;
    private String name;
    private String sex;
    private String phone;
    private String dept;
    private String desc;

    public Appli(String id, String name, String sex, String phone, String dept, String desc) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.dept = dept;
        this.desc = desc;
    }

    public Appli() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "Appli{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", phone='" + phone + '\'' +
                ", dept='" + dept + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}
