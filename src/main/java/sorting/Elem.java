package sorting;

/** Represents a record that contains an integer key and some data */
public class Elem {
    private int key;
    private Object data;

    /**
     * Constructor
     * @param key key stored in this record
     * @param data data stored in this record
     */
    public Elem(int key, Object data) {
        this.key = key;
        this.data = data;
    }

    /**
     * Getter for the key
     * @return key stored in this record
     */
    public int key() {
        return key;
    }

    /**
     * Getter for the data
     * @return data stored in this record
     */
    public Object data() {
        return data;
    }

    /**
     * Returns a String that contains key and data
     * @return a string representation of this record
     */
    public String toString() {
        return key + " " + data.toString();
    }
}


