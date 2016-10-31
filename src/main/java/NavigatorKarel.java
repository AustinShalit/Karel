public class NavigatorKarel extends UtilityKarel {

  private int currentRow = 1;
  private int currentColumn = 1;

  /**
   * Move the Karel to the desired position.  Will drop a beeper to indicate the Karel has reached
   * the desired position.
   *
   * @param destinationRow The row to navigate to
   * @param destinationColumn The column to navigate to
   */
  private void navigateTo(final int destinationRow, final int destinationColumn) {
    final int dRow = destinationRow - currentRow;
    final int dColumn = destinationColumn - currentColumn;

    if (dRow > 0) {
      setDirection(0);
    } else {
      setDirection(2);
    }
    moveDistance(Math.abs(dRow));

    if (dColumn > 0) {
      setDirection(1);
    } else {
      setDirection(3);
    }
    moveDistance(Math.abs(dColumn));

    putBeeper();
    currentRow = destinationRow;
    currentColumn = destinationColumn;
  }

  @Override
  public void run() {
    setBeepersInBag(Integer.MAX_VALUE);

    navigateTo(5, 5);
    navigateTo(4, 4);
    navigateTo(1, 1);
    navigateTo(7, 7);
  }

}
