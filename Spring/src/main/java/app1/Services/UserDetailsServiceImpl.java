//package app1.Services;
//
//import app1.POJO.user;
//import app1.Repositories.Mongo_repo_user;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class UserDetailsServiceImpl implements UserDetailsService {
//    @Autowired
//    private Mongo_repo_user  repo;
//
////    @Autowired
////    private static final PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
//
//
////    public void save(user user) {
////        user.setPassword(passwordEncoder.encode(user.getPassword()));
////        repo.save(user);
////    }
////
////    public List<user> giveAll() {
////        return repo.findAll();
////    }
////
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        user Given_user = repo.findByname(username);
//        if (Given_user != null){
//            return User.builder()
//                    .username(Given_user.getName())
//                    .password(Given_user.getPassword())
//                    .roles("USER")
//                    .build();
//        }
//        throw new UsernameNotFoundException("bhai nahi mila");
//    }
//}
