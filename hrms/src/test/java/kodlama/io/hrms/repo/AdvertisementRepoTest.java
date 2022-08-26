package kodlama.io.hrms.repo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

class AdvertisementRepoTest {

    @Autowired
    private AdvertisementRepo underTest;

    @AfterEach
    void tearDown() {
        underTest.deleteAll();
    }

    @Test
    void findAllByActiveTrue() {
    }

    @Test
    void findAllByActiveTrueOrderByLastApplicationDate() {
    }

    @Test
    void findAllByCompanyName() {
    }
}