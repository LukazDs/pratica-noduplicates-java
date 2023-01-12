import java.util.ArrayList;

public class ArrayDefault {
    public ArrayList<String> list = new ArrayList<String>();
    public String[] array1 = new String[0];
    public String[] array2 = new String[0];

    public ArrayDefault(String[] array1, String[] array2) {
        this.array1 = array1;
        this.array2 = array2;
    }

    private void createArrayDefault() {
        for (int i = 0; i < this.array1.length; i++) {
            String element = this.array1[i];
            this.list.add(element);
        }
    }

    public ArrayList<String> duplicateElements() {
        createArrayDefault();

        ArrayList<String> listDefault = new ArrayList<String>();

        for (int i = 0; i < this.array2.length; i++) {
            String element = this.array2[i];

            if (this.list.contains(element)) {
                listDefault.add(element);
            }
        }

        return listDefault;
    }
}
