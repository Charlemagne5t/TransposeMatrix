import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;
public class SolutionTest {
    @Test
    public void transposeTest1(){
        int[][] matrix = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] expected = {
                {1,4,7},
                {2,5,8},
                {3,6,9}
        };
        int[][] actual = new Solution().transpose(matrix);

        Assert.assertTrue(Arrays.deepEquals(actual, expected));
    }
}
