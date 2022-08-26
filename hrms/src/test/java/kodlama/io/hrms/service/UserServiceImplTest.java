package kodlama.io.hrms.service;

import kodlama.io.hrms.repo.UserRepo;
import kodlama.io.hrms.service.impl.UserServiceImpl;
import kodlama.io.hrms.service.mapper.UserMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {
    @Mock
    private UserRepo userRepo;
    private UserMapper userMapper;
    private UserService underTest ;



    @BeforeEach
    void setUp() {
        underTest = new UserServiceImpl() ;
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Disabled
    void add() {
    }

    @Test
    @Disabled
    void deleteUser() {
    }

    @Test
    void canGetAllUser() {
        underTest.getAllUser();
        verify(userRepo).findAll();
    }

    @Test
    @Disabled
    void findByEmail() {
    }
}