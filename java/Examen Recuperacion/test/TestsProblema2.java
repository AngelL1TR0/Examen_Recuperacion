import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class TestsProblema2 {

    @ParameterizedTest
    @ValueSource(strings = {"hola", "1","0.0.0.0","255.255.255.255","1.1.1.0", "10.0.1", "10.1","1.1.1.1.1", "A.B.C.D", "999.999.999.1"})
    public void not_valid_ip_address(String input)
    {
        IPValidator v = new IPValidator();
        boolean isValid = v.ValidateIpv4Address(input);

        Assertions.assertFalse(isValid);
    }

    @ParameterizedTest
    @ValueSource(strings = {"192.168.1.1", "1.1.1.1","10.0.0.1","127.0.0.1"})
    public void valid_ip_address(String input)
    {
        IPValidator v = new IPValidator();
        boolean isValid = v.ValidateIpv4Address(input);

        Assertions.assertTrue(isValid);
    }
}
