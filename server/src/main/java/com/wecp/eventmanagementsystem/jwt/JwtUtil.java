// package com.wecp.eventmanagementsystem.jwt;


// import com.wecp.eventmanagementsystem.entity.User;
// import com.wecp.eventmanagementsystem.repository.UserRepository;
// import io.jsonwebtoken.Claims;
// import io.jsonwebtoken.Jwts;
// import io.jsonwebtoken.SignatureAlgorithm;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.core.userdetails.UserDetails;
// import org.springframework.stereotype.Component;

// import java.util.Date;
// import java.util.HashMap;
// import java.util.Map;


// import java.util.function.Function;//Extra Import remove fter try
// import java.security.Key;//Extra Import remove fter try

// /*
// skeleton code main-->

// public class JwtUtil {



//     public String generateToken(String username) {
//         // generate token
//         return null;
//     }

//     public Claims extractAllClaims(String token) {
//         // extract all claims from token
//         return null;
//     }

//     public String extractUsername(String token) {
//         // extract username from token
//         return null;
//     }

//     public boolean isTokenExpired(String token) {
//         // check token is expired
//         return (Boolean) null;
//     }

//     public boolean validateToken(String token, UserDetails userDetails) {
//         // validate the token
//         return (Boolean) null;
//     }
// }
// */ 


// //Trying code

// @Component
// public class JwtUtil {

//     public static final String SECRET = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";

//     public String generateToken(String username) {
//         // generate token
//     }

//     public Claims extractAllClaims(String token) {
//         // extract all claims from token
//         return Jwts
//                 .parserBuilder()
//                 .setSigningKey(getSignKey())
//                 .build()
//                 .parseClaimsJws(token)
//                 .getBody();
//     }

//     public String extractUsername(String token) {
//         // extract username from token
//         return extractClaim(token, Claims::getSubject);
//     }

//     public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//         final Claims claims = extractAllClaims(token);
//         return claimsResolver.apply(claims);
//     }

//     public boolean isTokenExpired(String token) {
//         // check token is expired
//         return (Boolean) null;
//     }

//     public boolean validateToken(String token, UserDetails userDetails) {
//         // validate the token
//         return (Boolean) null;
//     }
// }

