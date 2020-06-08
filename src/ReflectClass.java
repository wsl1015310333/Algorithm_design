public class ReflectClass {
    public static void main(String args[]){
        System.out.println(""+Find(5));
    }

    public class Student {

        private String name;
        private int age;

        public Student() {}

        private Student(String name){
            this.name = name;
        }

        public Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            System.out.println("调用getName" + name);
            return name;
        }

        public int getAge() {
            System.out.println("调用getAge" + age);
            return age;
        }

        public void setMName(String name) {
            this.name = name;
            System.out.println("name是" + name);
        }

        private void setNameAndAge(String name, int age) {
            this.age = age;
            this.name = name;
            System.out.println("setNameAndAge" + name + "--" + age);
        }

}
