public class Overlord {
    private double value;

    public Overlord(double value) {
        this.value = value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setValue(double value) {
        this.value = (int) value;
    }

    public void setValue(String value) {
        this.value = Integer.parseInt(value);
    }

    public double multiply(double num) {
        return this.value * num;
    }

    public int multiply(int num) {
        return (int) this.value * num;
    }

    public String multiply(String num) {
        return Double.toString(this.value * Double.parseDouble(num));
    }

    public static void main(String[] args) {
        Overlord overlord = new Overlord(10);
        int result1 = overlord.multiply(5);
        double result2 = overlord.multiply(3.0);
        String result3 = overlord.multiply("2");
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}
