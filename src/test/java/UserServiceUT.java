import com.bhfae.usermgt.dao.UserMapper;
import com.bhfae.usermgt.pojo.User;
import com.bhfae.usermgt.service.IUserService;
import com.bhfae.usermgt.service.impl.UserServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.assertEquals;

public class UserServiceUT {
    @Autowired
    private UserServiceImpl iUserService;
    private UserMapper userMapper;
//
//    @Before
//    public void initialize() {
//        iUserService = new UserServiceImpl();
//        userMapper = EasyMock.createMock(UserMapper.class);
//    }
//
//    @Test
//    public void test_insert_user_success() {
//
//        User user = new User();
//        user.setUsername("1");
//        user.setPassword("1");
//        EasyMock.expect(userMapper.insert(user)).andReturn(1);
//        assertEquals(1, iUserService.insertUser("1", "1"));
//    }


}
