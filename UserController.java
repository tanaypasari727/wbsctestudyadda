@RestController
@RequestMapping("/signin")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public ResponseEntity<?> signIn(@RequestBody SignInRequest request) {
        try {
            User user = userService.validateUser(request.getMobile(), request.getPassword());
            return ResponseEntity.ok(user);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid credentials");
        }
    }
}
