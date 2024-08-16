import java.util.Arrays;

public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String[] products;

    public User() {
    }

    public User(String firstName, String lastName, String email, String password, String[] products) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.products = products;


    }

    User[] users = new User[0];


    public String getFirstName() {
        return firstName;
    }

    public void setFirsName(String firstName) {
        chekName(firstName);
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getProducts() {
        return products;
    }

    public void setProducts(String[] products) {
        this.products = products;
    }

    public String toString() {
        return String.format("""
                First Name: %s
                Last Name: %s
                Email: %s
                Password: %s
                """, firstName, lastName, email, password);
    }


    public boolean chekName(String firstName) {

        if (firstName.toLowerCase().length() < 3) {
            System.out.println("Больше 3х символов");
        } else {
            this.firstName = firstName;
            return true;
        }
        return false;

    }

    public boolean chekLastName(String lastName) {
        if (lastName.toLowerCase().length() < 6) {
            System.out.println("Больше 6 символов");
        } else {
            this.lastName = lastName;
            return true;
        }
        return false;

    }

    public boolean chekEmail(String email) {
        if (email.toLowerCase().contains("@gmail.com")) {
            this.email = email;
            return true;
        } else {
            System.out.println("в слове должен быть @gmail.com ");
            return false;
        }
    }

    public boolean chekPassword(String password) {
        if (password.toLowerCase().length() < 4) {
            System.out.println("Больше 4х символов");
        } else {
            this.password = password;
            return true;
        }
        return false;
    }

    public void addUser(User user) {
        users = Arrays.copyOf(users, users.length + 1);
        users[users.length - 1] = user;
    }

    public void allUser() {
        for (User user : users) {
            System.out.println(user);
        }
    }

    public User finddByEmail(String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
        return null;
    }

}
//    public boolean chekProducts(String products) {
//        if (products.length() < 3) {
//            System.out.println("Больше 3х символов");
//        } else {
//            this.products = products;
//            return true;
//        }
//        return false;
//    }
