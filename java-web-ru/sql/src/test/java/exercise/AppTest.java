package exercise;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import static org.assertj.core.api.Assertions.assertThat;
import java.io.IOException;

import java.nio.file.Paths;
import java.nio.file.Path;
import java.nio.file.Files;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;

class AppTest {

    private Connection connection;



    private String getFileContent(String fileName) throws IOException {
        Path pathToSolution = Paths.get(fileName).toAbsolutePath();
        return Files.readString(pathToSolution).trim();
    }

    @Test
    void test() throws IOException, SQLException {
        assertThat(true).isEqualTo(true);
    }


}
