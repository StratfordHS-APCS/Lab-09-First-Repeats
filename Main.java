class Main {

  /**
   * Checks to see if the first value in an array is repeated.
   *
   * @param   list    the int array to test
   * @return  true if the first element repeats, false otherwise.
   */
  public static boolean hasRepeats(int[] list) {
    if (list.length == 0)
    {
      return false;
    }
    int first = list[0];
    for(int i = 0; i<list.length; i++)
    {
      if (list[i] == first && i != 0)
      {
        retur true;
      }
    }
    return false;

  }

  // add test arrays here.
  public static void main(String[] args) {
    System.out.println(hasRepeats(new int[] {-99, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12345}));
  }
}
