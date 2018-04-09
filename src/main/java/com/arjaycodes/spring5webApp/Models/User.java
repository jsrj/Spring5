package com.arjaycodes.spring5webApp.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class User {

    // Properties
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String    userId;
    private String    username;
    private String    email;

    // Init Properties
    @ManyToMany(mappedBy = "cart")
    private Set<Cart> shoppingCart = new HashSet<>();

    // Constructors
        //| Empty
        User(){
        }
        //| Without a cart
        User(String userId, String username, String email) {
            this .setUserId   (userId  );
            this .setUsername (username);
            this .setEmail    (email   );
        }
        //| With a Cart
        User(String userId, String username, String email, Set<Cart> newCart) {
            this .setUserId               (userId  );
            this .setUsername             (username);
            this .setEmail                (email   );
            this .getShoppingCart().addAll(newCart );
        }

    // Private Methods

    // Public  Methods

    // Getters
    public String          getUserId() {
        return       userId;
    }
    public String        getUsername() {
        return     username;
    }
    public String           getEmail() {
        return        email;
    }
    public Set<Cart> getShoppingCart() {
        return shoppingCart;
    }

    // Setters
    private void       setUserId(String   userId) {
        this.userId   =   userId;
    }
    private void     setUsername(String username) {
        this.username = username;
    }
    private void        setEmail(String    email) {
        this.email    =    email;
    }

    // Equals and Hashcode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(userId, user.userId);
    }
    @Override
    public int hashCode() {

        return Objects.hash(userId);
    }

    // Pretty output
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", shoppingCart=" + shoppingCart +
                '}';
    }
}
