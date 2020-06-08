import sun.rmi.runtime.Log;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class QuchongClass {

    public static void main(String[] args) {
        List<Person> list=new ArrayList<>();
        List<Person> listSecond=new ArrayList<>();
        list.add(new Person("1","a"));
        list.add(new Person("2","b"));
        list.add(new Person("3","c"));


        listSecond.add(new Person("2","d"));
        listSecond.add(new Person("3","e"));
        listSecond.add(new Person("4","a"));
        list.removeAll(listSecond);
        list.addAll(listSecond);

        for(Person person:list){
            System.out.println("person"+person.getId()+" "+person.getName());
        }

    }
  static   class Person{
        String id;
        String  name;

        public Person(String id, String name) {
            this.id = id;
            this.name = name;
        }

      @Override
      public boolean equals(Object o) {
          if (this == o) return true;
          if (o == null || getClass() != o.getClass()) return false;

          Person person = (Person) o;

          return id.equals(person.id);
      }

      @Override
      public int hashCode() {
          return id.hashCode();
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
    }
}
