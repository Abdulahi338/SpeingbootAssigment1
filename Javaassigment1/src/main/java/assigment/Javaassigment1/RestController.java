package assigment.Javaassigment1;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.net.URI;
import java.net.URL;
import java.util.Map;

@org.springframework.web.bind.annotation.RestController

public class RestController {
    @GetMapping("/secure")
    public ResponseEntity<String> success() {
        return ResponseEntity
                .ok()
                .header("X-Custom-Header", "MyValue")
                .body("Operation succeeded with a custom header!");
    }
    @GetMapping("/not-found")
    public ResponseEntity<Map<String, String>> notFound() {
        Map<String, String> error = Map.of("error", "Resource not found");
        return ResponseEntity
                .status(HttpStatus.NOT_FOUND)
                .body(error);
    }
    @PostMapping("/create")
    public ResponseEntity<String> createResource() {
        URI location = URI.create("/api/resource/123");
        return ResponseEntity
                .created(location)
                .body("Resource created with ID 123");
    }
}
