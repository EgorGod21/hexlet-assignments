package exercise;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Map;



class ValidationTest {

    @Test
    void testValidate() throws IllegalAccessException {
        Address address1 = new Address("Russia", "Ufa", "Lenina", "54", null);
        List<String> result1 = Validator.validate(address1);
        List<String> expected1 = List.of();
        assertThat(result1).isEqualTo(expected1);

        Address address2 = new Address(null, "London", "1-st street", "5", "1");
        List<String> result2 = Validator.validate(address2);
        List<String> expected2 = List.of("country");
        assertThat(result2).isEqualTo(expected2);

        Address address3 = new Address("USA", null, null, null, "1");
        List<String> result3 = Validator.validate(address3);
        List<String> expected3 = List.of("city", "street", "houseNumber");
        assertThat(result3).isEqualTo(expected3);
    }

    @Test
    void advancedValidate() throws IllegalAccessException {
        Address address=new Address("USA", "Texas", null, "7", "2");
        Map <String, List<String>> map=Validator.advancedValidate(address);
        Map <String, List<String>> ext=Map.of("country",List.of("length less than 4"),
                "street",List.of("can not be null"));
        assertThat(map).isEqualTo(ext);

        Address address1=new Address(null, "Texas", null, "7", "2");
        Map <String, List<String>> map1=Validator.advancedValidate(address1);
        Map <String, List<String>> ext1=Map.of("country",List.of("can not be null"),
                "street",List.of("can not be null"));
        assertThat(map1).isEqualTo(ext1);

        Address address11=new Address("tivmit", "Texas", "bmjym", "7", "2");
        Map <String, List<String>> map11=Validator.advancedValidate(address11);
        Map <String, List<String>> ext11=Map.of();
        assertThat(map11).isEqualTo(ext11);
    }
// BEGIN
    
    // END
}
