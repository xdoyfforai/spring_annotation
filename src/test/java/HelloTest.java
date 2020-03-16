import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author layne staley
 * @date 2020/3/16
 */
public class HelloTest {
  @Test
  public void test1() {
    System.out.println("hello world.");
    Assert.assertEquals("1","1");
  }
}