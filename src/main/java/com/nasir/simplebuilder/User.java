package com.nasir.simplebuilder;

/**
 * Created by nasir on 5/3/17.
 */
public class User {

    private String firstName;
    private String lastName;
    private String location;
    private int age;
    private boolean isMarried;

    public User(UserBuilder userBuilder) {
        this.firstName = userBuilder.firstName;
        this.lastName = userBuilder.lastName;
        this.age = userBuilder.age;
        this.isMarried = userBuilder.isMarried;
        this.location = userBuilder.location;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLocation() {
        return location;
    }

    public int getAge() {
        return age;
    }

    public boolean isMarried() {
        return isMarried;
    }

    @Override
    public String toString() {
        return "UserName: " + this.firstName + " " + this.lastName
                + " Age: " + this.age + " Location: " + this.location
                + " isMarried: " + this.isMarried;
    }

    public static class UserBuilder {
        private String firstName;
        private String lastName;
        private String location;
        private int age;
        private boolean isMarried;

        public UserBuilder(String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public UserBuilder location(String location) {
            this.location = location;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public User build() {
            User user = new User(this);
            return user;
        }
    }
}
