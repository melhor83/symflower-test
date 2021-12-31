package pan.symflower.test;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        runCalculation(10, new Integer[] {5, 10, 20});
    }

    public static Integer runCalculation(Integer idx, Integer[] allValues) {
        if (idx == null || allValues == null) {
            return 0;
        }
        Integer calc = 0;
        for(Integer val : allValues) {
            if (val == null) {
                continue;
            }
            calc += val*idx;
        }
        return calc;
    }

}
