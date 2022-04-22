import java.util.Arrays;

public class Wector {

    int[] vector;

    public Wector(int[] vector) {
        this.vector = vector;
    }

    public int[] getVector() {
        return vector;
    }

    public void setVector(int[] vector) {
        this.vector = vector;
    }

    public int getLength() {
        return vector.length;
    }

    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i : vector) {
            if (i < min) {
                min = i;
            }
        }
        return min;
    }

    public int getMax() {
        int max = Integer.MIN_VALUE;
        for (int i : vector) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

    public void sortAscending() {
        for (int i = vector.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (vector[j] > vector[j + 1]) {
                    int tmp = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = tmp;
                }
            }
        }
    }

    public void multiplyByNumber(int number) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] *= number;
        }
    }

    public void addVector(int[] vector1) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] += vector1[i];
        }
    }

    public int scalarProduct(int[] vector1) {
        int result = 0;
        for (int i = 0; i < vector.length; i++) {
            result += vector[i] * vector1[i];
        }
        return result;
    }

    public int evkl() { //сумма квадратов ветора а2 + б2 + с2
        int result = 0;
        for (int i : vector) {
            result += i * i;
        }
        return result;
    }
}
