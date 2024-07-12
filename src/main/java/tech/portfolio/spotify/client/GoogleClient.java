package tech.portfolio.spotify.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(
        name = "GoogleClient",
        url = "https://www.google.com"
)

public interface GoogleClient {

    @GetMapping
    String getGoogle();
}
