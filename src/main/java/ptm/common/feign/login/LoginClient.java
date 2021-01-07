package ptm.common.feign.login;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import ptm.common.service.ServiceResponse;

@Component
@FeignClient(name = "ptm-login", path = "/ptm-login", configuration = FeignClietConfiguration.class)
public interface LoginClient { 
	
	@PostMapping(value = "/login")
	public <T> ResponseEntity<ServiceResponse> login(@RequestBody T request);
	
	@PostMapping(value = "/login1")
	public <T> ResponseEntity<String> login1(@RequestBody T request);
	
	@GetMapping(value = "/go")
	public String go();
	
}
