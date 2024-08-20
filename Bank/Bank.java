package Bank;

class Account {
  public String name;
  protected String email;
  private String password;

  public void setPassword(String pass) {
    this.password = pass;
  }

  public String getPassword() {
    return this.password;
  }
}

public class Bank {
  public static void main(String[] args) {
    Account ac = new Account();
    ac.name = "Utkats";
    ac.email = "assds@sds.com";
    ac.setPassword("password");
    System.out.println(ac.name + " " + ac.email + " " + ac.getPassword());
  }
}
