public class Main {
    public static void main(String[] args) {
        Student userOne = new Student();
        userOne.setName("Sezerano Jean Chrysostome");
        userOne.setMemberShip(Student.Membership.Premium);
        /*
         *
         * When you log a class by defualt println will be calling it with toString
         * method so by defining toString method we override the existing one and once
         * it is called toSting that will be called will be ours we defined.
         * NB: It is not recommended to do it, it is better that we override those we
         * created
         *
         */
        System.out.println("userOne " + userOne);

        Student student = new Student();
        student.setName("Timo view");
        student.setMemberShip(Student.Membership.Premium);
        Student.Users.add(student);

        System.out.println("-------------");
        User.getAllUsers();

    }
}