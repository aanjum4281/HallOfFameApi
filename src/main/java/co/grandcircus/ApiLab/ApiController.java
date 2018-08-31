package co.grandcircus.ApiLab;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.ApiLab.model.Complete;
import co.grandcircus.ApiLab.model.Lists;
import co.grandcircus.ApiLab.model.Tiny;

@Controller
public class ApiController {
	
	@RequestMapping("/")
		public ModelAndView tiny() {
			ModelAndView mav = new ModelAndView("tiny");
			
			// Create a rest template
			RestTemplate restTemplate = new RestTemplate();
			
			// Set url
			String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

			// Make the Request.
			ResponseEntity<Lists> response = restTemplate.exchange(url, HttpMethod.GET,
					new HttpEntity<>(null), Lists.class);

			// Extract body from response.
			Lists result = response.getBody();
			
			mav.addObject("tiny", result.getTiny());
		
		return mav;
		
	}
	
	@RequestMapping("/complete")
	public ModelAndView complete() {
		ModelAndView mav = new ModelAndView("complete");
		
		// Create a rest template
		RestTemplate restTemplate = new RestTemplate();
		
		// Set url
		String url = "https://dwolverton.github.io/fe-demo/data/computer-science-hall-of-fame.json";

		// Make the Request.
		ResponseEntity<Lists> response = restTemplate.exchange(url, HttpMethod.GET,
				null, Lists.class);

		// Extract body from response.
		Lists result = response.getBody();
		
		mav.addObject("complete", result.getComplete());
		return mav;
		
	}
	
}
