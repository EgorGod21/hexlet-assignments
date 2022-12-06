package exercise;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;

import java.io.Serializable;

// BEGIN
@Getter
@AllArgsConstructor
@NoArgsConstructor
// END
class User implements Serializable {
    int id;
    String firstName;
    String lastName;
    int age;
}
