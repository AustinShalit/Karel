import stanford.karel.SuperKarel;

public abstract class UtilityKarel extends SuperKarel {

  /**
   * Moves the specified distance.
   *
   * @param distance The number of units to move
   */
  public void moveDistance(final int distance) {
    moveDistance(distance, false);
  }

  /**
   * Moves the specified distance.
   *
   * @param distance The number of units to move
   * @param placeBeepers If Karel should place beepers along its path
   */
  public void moveDistance(final int distance, final boolean placeBeepers) {
    for (int i = distance; i > 0; i--) {
      move();
      if (placeBeepers) {
        putBeeper();
      }
    }
  }

  /**
   * Moves the Karel until it is blocked by a wall.
   *
   * @return The number of units moved
   */
  public int moveToWall() {
    return moveToWall(false);
  }

  /**
   * Moves the Karel until it is blocked by a wall.
   *
   * @param placeBeepers If Karel should place beepers along its path
   * @return The number of units moved
   */
  public int moveToWall(final boolean placeBeepers) {
    int distance = 0;

    while (frontIsClear()) {
      move();
      distance++;
      if (placeBeepers) {
        putBeeper();
      }
    }

    return distance;
  }

  /**
   * Slides Karel one unit to the right.
   */
  public void slideRight() {
    turnRight();
    move();
    turnLeft();
  }

  /**
   * Slides Karel one unit to the left.
   */
  public void slideLeft() {
    turnLeft();
    move();
    turnRight();
  }

}
