package kodlama.io.hrms.repo;

import kodlama.io.hrms.entities.concretes.User;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

@DataJpaTest
class UserRepoTest {

    @Autowired
    private UserRepo underTest;

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void itShouldCheckWhenUserEmailExists() {
        //given
        String email = "tekin.act@gmail.com";
        User user = new User(email , "pass123");
        underTest.save(user);
        // when
        boolean expected = underTest.selectExistEmail(email);
        // then
        assertThat(expected).isTrue();

    }

    @Test
    void itShouldCheckWhenUserEmailDoesNotExists() {
        //given
        String email = "tekin.act@gmail.com";
        // when
        boolean expected = underTest.selectExistEmail(email);
        // then
        assertThat(expected).isFalse();

    }
}