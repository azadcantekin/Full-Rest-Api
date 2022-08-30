package kodlama.io.hrms.service;

import kodlama.io.hrms.entities.concretes.User;
import kodlama.io.hrms.entities.dto.UserModel;
import kodlama.io.hrms.repo.UserRepo;
import kodlama.io.hrms.service.impl.UserServiceImpl;
import kodlama.io.hrms.service.mapper.UserMapper;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserRepo userRepo;
   @InjectMocks
    private UserMapper userMapper;
    private UserService underTest;


    @BeforeEach
    void setUp() {
        underTest = new UserServiceImpl(userRepo, userMapper);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    @Disabled
    void canAddUser() throws Exception {
        //given
        User user = new User("tekin.act@gmail.com","123");
        UserModel userModel = userMapper.checkAndConvertToDto(user);
        //when
        underTest.addUser(userModel);

        //then
        ArgumentCaptor<User> userArgumentCaptor = ArgumentCaptor.forClass(User.class);

        verify(userRepo).save(userArgumentCaptor.capture());

        User capturedUser = userArgumentCaptor.getValue();

        assertThat(capturedUser).isEqualTo(user);
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