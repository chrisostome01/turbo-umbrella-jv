import java.util.ArrayList;
import java.util.List;

public abstract class User {
    private String name;
    private String memberShip;

    /*
     *
     * Generic type
     *
     */
    public static List<User> Users = new ArrayList<User>();

    /*
     *
     * Membership enums
     *
     */

    public enum Membership {
        Gold, Bronze, Premium
    }

    /*
     *
     * Constructor function
     *
     */
    public User(String name, String memberShip) {
        this.setName(name);
        this.setMemberShip(memberShip);
    }

    public User() {
    }

    public static void getAllUsers() {
        for (User user : Users) {
            /*
             *
             * Because we overode toString now println is calling to string on it
             * ours will be the one to get excuted
             *
             */
            System.out.println(user);
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMemberShip(String memberShip) {
        this.memberShip = memberShip;
    }

    /*
     *
     * OverLoading setMermbership
     *
     */
    public void setMemberShip(Membership memberShip) {
        this.memberShip = memberShip.name();
    }

    /*
     *
     * Override toString
     *
     */
    public String toString() {
        return this.getName() + " " + this.getMemberShip();
    }

    public String getMemberShip() {
        return memberShip;
    }

    public String getName() {
        return name;
    }
}
