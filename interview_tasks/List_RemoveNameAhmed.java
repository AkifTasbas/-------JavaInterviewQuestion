import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class List_RemoveNameAhmed {

    /*
    Given a list of people' names: "Ahmed", "John", Eric", "Ahmed".....
    Write a java operation to remove all the names named Ahmed
     */


    // solution 1
    public List<String> remove1(List<String> names) {
        Iterator<String> it = names.iterator();
        while (it.hasNext()) {
            if (it.next().equals("Ahmed"))
                it.remove();
        }
        return names;
    }


    // solution 2
    public List<String> remove2(List<String> names) {
        names.removeAll(Arrays.asList("Ahmed"));
        return names;
    }


    // solution 3
    public List<String> remove3(List<String> names) {
        names.removeIf(name -> name.equals("Ahmed"));
        return names;
    }




}
