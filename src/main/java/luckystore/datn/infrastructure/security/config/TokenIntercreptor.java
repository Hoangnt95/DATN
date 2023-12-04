package luckystore.datn.infrastructure.security.config;

import lombok.RequiredArgsConstructor;
import luckystore.datn.infrastructure.security.token.TokenProvider;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
@RequiredArgsConstructor
public class TokenIntercreptor implements HandlerInterceptor {

    private final TokenProvider provider;

//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//            throws Exception {
//
//        String token = extractTokenFromCookies(request);
//        String requestedPath = request.getRequestURI();
//        System.out.println("Request path :"+requestedPath);
//        if (token == null || token.isEmpty()) {
//            response.sendRedirect("/login");
//            return false;
//        }
//
//        String role = provider.decodeTheToken(token).getRole();
//        if (role != null) {
//            if (role.equals(Role.ROLE_ADMIN.name()) && requestedPath.startsWith("/staff")) {
//                System.out.println("Admin");
//                return true; // Cho phép truy cập đến endpoint admin
//            } else if (role.equals(Role.ROLE_STAFF.name()) && requestedPath.startsWith("/admin")) {
//                return true; // Cho phép truy cập đến endpoint user
//            } else if (role.equals(Role.ROLE_USER.name()) && requestedPath.startsWith("/user") || requestedPath.equals("/admin/ban-hang")) {
//                System.out.println("User");
//                return true; // Cho phép truy cập đến endpoint customer
//            }
//        }
//        response.sendRedirect("/access-denied");
//        return false;
//    }
//
//    private String extractTokenFromCookies(HttpServletRequest request) {
//        Cookie[] cookies = request.getCookies();
//        if (cookies != null) {
//            for (Cookie cookie : cookies) {
//                if ("token".equals(cookie.getName())) {
//                    return cookie.getValue();
//                }
//            }
//        }
//        return null;
//    }
}
