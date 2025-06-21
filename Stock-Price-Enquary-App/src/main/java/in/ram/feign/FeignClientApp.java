package in.ram.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.ram.model.StockData;

@FeignClient(name = "Stock-Api-Connector")
public interface FeignClientApp {

	@GetMapping("/data/{name}")
	public StockData getData(@PathVariable String name);

}
