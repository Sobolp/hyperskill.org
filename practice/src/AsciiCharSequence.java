import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {
    private byte[] array;
    public AsciiCharSequence( byte [] array) {
        this.array = array;
    }

    @Override
    public int length() {
        return array.length;
    }

    @Override
    public char charAt(int index) {
        return (char) array[index];
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        byte[] resultArray = new byte[end - start];
        for (int i = start; i < end; i++){
            resultArray[i - start] = this.array[i];
        }
        return new AsciiCharSequence(resultArray);
    }

    @Override
    public String toString() {
        return new String(array);
    }
}
