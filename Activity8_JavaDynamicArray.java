import java.util.ArrayList;

public class Activity8_JavaDynamicArray {
    public static void main(String[] args) {
        ArrayList<String>dynamicArray = new ArrayList<String>();
        dynamicArray.add("First String");
        dynamicArray.add("Second String");
        dynamicArray.add("Third String");
        dynamicArray.add("Fourth String");
            for(int n=0; n<dynamicArray.size(); n++){
                System.out.println(dynamicArray.get(n));
            }

        }
    }

