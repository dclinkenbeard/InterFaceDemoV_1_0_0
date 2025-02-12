/**
 * This is a generic monster.
 * @author Drew "Dr.C" Clinkenbeard
 */
public class Monster {
  String type;
  Double maxHp;
  Double strength;
  Double defense;

  Movement movement = new WalkingMovement();

  @Override
  public String toString() {
    return "Monster{" +
        "type='" + type + '\'' +
        ", maxHp=" + maxHp +
        ", strength=" + strength +
        ", defense=" + defense +
        ", movement=" + movement +
        '}';
  }

  @Override
  public final boolean equals(Object o) {
    if (!(o instanceof Monster monster)) {
      return false;
    }

    return getType().equals(monster.getType()) && getMaxHp().equals(monster.getMaxHp())
        && getStrength().equals(monster.getStrength()) && getDefense().equals(monster.getDefense());
  }

  @Override
  public int hashCode() {
    int result = getType().hashCode();
    result = 31 * result + getMaxHp().hashCode();
    result = 31 * result + getStrength().hashCode();
    result = 31 * result + getDefense().hashCode();
    return result;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public Double getMaxHp() {
    return maxHp;
  }

  public void setMaxHp(Double maxHp) {
    this.maxHp = maxHp;
  }

  public Double getStrength() {
    return strength;
  }

  public void setStrength(Double strength) {
    this.strength = strength;
  }

  public Double getDefense() {
    return defense;
  }

  public void setDefense(Double defense) {
    this.defense = defense;
  }
}
