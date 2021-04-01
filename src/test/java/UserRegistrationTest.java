import com.Bridgelabz.UserRegistrationOperations;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class UserRegistrationTest {
    UserRegistrationOperations userRegistrationOperations =new UserRegistrationOperations();
    @Test
    void validateFirstName_IfProper_ShouldReturnTrue() {
        String firstName="Roshan"; //Ros ros Roshan ROS
        boolean status=userRegistrationOperations.validateFirstName(firstName);
        Assert.assertTrue(status);
    }

    @Test
    void validateLastName_IfProper_ShouldReturnTrue() {
        String lastName="Sabale";
        boolean status=userRegistrationOperations.validateLastName(lastName);
        Assert.assertTrue(status);
    }

    @Test
    void validateEmail_IfProperinPart_ShouldReturnTrue() {
        String email="abc.xyz@bl.co.in";
        boolean status=userRegistrationOperations.validateEmail(email);
        Assert.assertTrue(status);
    }

    @Test
    void validateMobileNumber_IfProper_ShouldReturnTrue() {
        String mobileNUmber="91 9665121109";
        boolean status=userRegistrationOperations.validateMobileNumber(mobileNUmber);
        Assert.assertTrue(status);
    }
}
