class SinhVien {

    protected int id;
    protected String name;
    protected int age;


    public SinhVien(int id,String name,int age) {
        this.id=id;
        this.name=name;
        this.age=age;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    @Override
    public String toString() {
        return "Sinhvien"+"{"+"id" + this.id + "ten" + this.name + "age" + this.age;
    }
}

