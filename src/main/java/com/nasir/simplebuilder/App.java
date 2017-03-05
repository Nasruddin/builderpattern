package com.nasir.simplebuilder;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        User user = new User.UserBuilder("Nasir", "Khan")
                .age(28)
                .isMarried(false)
                .location("Bangalore")
                .build();

        System.out.println("User Details :: " + user);
    }
}
