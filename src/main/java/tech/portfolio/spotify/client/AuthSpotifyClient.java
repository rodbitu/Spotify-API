package tech.portfolio.spotify.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(
        name = "AuthSpotifyClient",
        url = "https://accounts.spotify.com"
)

public interface AuthSpotifyClient {

    @PostMapping(value = "/api/token", consumes = "application/x-www-form-urlencoded")
    LoginResponse login(@RequestBody LoginRequest loginRequest);

}
