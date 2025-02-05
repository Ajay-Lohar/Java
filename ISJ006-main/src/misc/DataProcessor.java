package misc;

public class DataProcessor<X> {
    void process(X input) {
        System.out.println(input);
    }

    public static void main(String[] args) {

        //1. accept any type of data
        DataProcessor dataProcessor = new DataProcessor();
        dataProcessor.process(100);
        dataProcessor.process("String");
        dataProcessor.process(true);

        //2. specific type of data
        DataProcessor<Integer> integer = new DataProcessor();
        integer.process(100);
        //integer.process("Abc");

        DataProcessor<String> stringDataProcessor = new DataProcessor<>();
        stringDataProcessor.process("abc");
        stringDataProcessor.process("xyz");



    }
}
