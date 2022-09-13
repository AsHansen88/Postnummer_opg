public class Postinfo {

  private String byer;
  private int postnummere;

  public Postinfo(int postnummere, String byer) {
    this.byer = byer;
    this.postnummere = postnummere;

  }

  public String getByer() {
    return byer;
  }

  public void setByer(String byer) {
    this.byer = byer;
  }

  public int getPostnummere() {
    return postnummere;
  }

  public void setPostnummere(int postnummere) {
    this.postnummere = postnummere;
  }

  public String toString(){

    return "postnummer: "+postnummere+ "By: "+byer;

  }


}
