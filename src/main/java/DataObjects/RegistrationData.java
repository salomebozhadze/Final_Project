package DataObjects;

import org.apache.commons.lang3.RandomStringUtils;

import java.util.Random;

public interface RegistrationData {
    public final Random rand = new Random();
    String
            emailAddress = RandomStringUtils.randomAlphanumeric(5) + "@gmail.com",
            passwordField = "salome1989",
            repeatPassword = "salome1989",
            mobileField = RandomStringUtils.randomNumeric(10),
            firstName = RandomStringUtils.randomAlphanumeric(6),
            lastName = RandomStringUtils.randomAlphanumeric(3),
            incorrectEmail = "test",
            incorrectPassword = "salome",
            incorrectRepeatPassword = "salo",
            incorrectMobile = "225";
    Integer
            birthDay = rand.nextInt(28),
            birthMonth = rand.nextInt(11),
            birthYear = rand.nextInt(82);
}
