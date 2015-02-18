/**
 * Solves Project Euler Problem Two.
 */
public class ProjectEulerTwo {

  /**
   * Computes sum of even Fibonacci Terms less than 4 million.
   * @param args Ignored.
   */
  public static void main(String[] args) {
    int sum = computeTerms(4000000);

    System.out.println(sum);
  }

  /**
   * Compute sum of even Fibonacci terms less than bound.
   * @param bound The bound for summation.
   * @return The sum.
   */
  public static int computeTerms(int bound) {
    int headTerm = 2;
    int tailTerm = 1;
    int sum = 0;

    while (headTerm < bound) {
      if ((headTerm % 2) == 0) {
        sum += headTerm;
      }
      int newHeadTerm = headTerm + tailTerm;
      tailTerm = headTerm;
      headTerm = newHeadTerm;
    }
    return sum;
  }
}
