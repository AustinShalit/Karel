public class SolitaireKarel extends UtilityKarel {

  /**
   * Draws a single row of solitaire.
   */
  private void solitaireRow() {
    int distance = moveToWall(true);
    turnAround();
    moveDistance(distance - 1);
  }

  private void solitaire() {
    while(true) {
      solitaireRow();

      if (rightIsClear()) {
        slideRight();
        turnAround();
      } else {
        break;
      }
    }
  }

  @Override
  public void run() {
    setDirection(1);
    setBeepersInBag(Integer.MAX_VALUE);

    solitaire();
  }

}
