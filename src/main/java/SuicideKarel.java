public class SuicideKarel extends UtilityKarel {

  /**
   * Performs a suicide of the specified distance placing a beeper at the end of the run. Returns
   * if Karel could complete another suicide after this one.
   *
   * @param distance The number of units to move
   * @return If Karel can perform another suicide of distance++
   */
  private boolean suicide(final int distance) {
    moveDistance(distance);
    putBeeper();
    boolean canContinue = frontIsClear();
    turnAround();
    moveDistance(distance);
    turnAround();
    return canContinue;
  }

  @Override
  public void run() {
    setDirection(0);
    setBeepersInBag(Integer.MAX_VALUE);

    for (int i = 0; ; i++) {
      if (!suicide(i)) {
        break;
      }
    }
  }

}
