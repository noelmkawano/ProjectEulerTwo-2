import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Tests the ProjectEulerTwo class.
 */
public class ProjectEulerTwoTest {

  /**
   * Runs two simple tests of the compute sum method.
   * @throws Exception If problems occur.
   */
  @Test
  public void testComputeTerms() throws Exception {
  assertEquals("test for the sum of even terms below 10", 10, ProjectEulerTwo.computeTerms(10));
  assertEquals("test for the sum of even terms below 90", 44, ProjectEulerTwo.computeTerms(90));
  }
}