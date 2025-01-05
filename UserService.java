@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User validateUser(String mobile, String password) throws Exception {
        User user = userRepository.findByMobile(mobile)
                .orElseThrow(() -> new Exception("User not found"));

        if (BCrypt.checkpw(password, user.getPassword())) {
            return user;
        } else {
            throw new Exception("Invalid password");
        }
    }
}
