package javageneric;

import java.util.ArrayList;

public class GenericImp {
   public void addData() {
        ArrayList<Data> data = new ArrayList<>();
        data.add(new Data(25, 1,"dhinesh",232445,"ramnad"));
       data.forEach((n)->{
           System.out.println(n.address);
           System.out.println(n.age);
           System.out.println(n.id);
           System.out.println(n.name);
           System.out.println(n.salary);
       });
   }

}
