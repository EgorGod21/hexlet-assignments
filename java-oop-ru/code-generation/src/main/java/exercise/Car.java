package exercise;

import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Value;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Serializable;

// BEGIN
@Getter
@AllArgsConstructor
@NoArgsConstructor
// END
class Car implements Serializable {
    int id;
    String brand;
    String model;
    String color;
    User owner;

    public String  serialize() throws JsonProcessingException {
      return new ObjectMapper().writeValueAsString(this);
    }
    public static Car unserialize(String json) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        return  objectMapper.readValue(json, Car.class);
    }


}
