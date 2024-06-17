public class test {
    public static void main(String[] args) {

        Student student=new Student();
        student.setClasses("C04");
        student.setName("Kien");

        String a= student.getName();
        String b=student.getClasses();

        System.out.println(a);
        System.out.println(b);
    }
}
