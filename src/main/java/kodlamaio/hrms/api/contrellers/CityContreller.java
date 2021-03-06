package kodlamaio.hrms.api.contrellers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import kodlamaio.hrms.business.abstracts.CityService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.City;
@CrossOrigin
@RestController
@RequestMapping("api/cities/")
public class CityContreller {

	private CityService cityService;

	@Autowired
	public CityContreller(CityService cityService) {
		super();
		this.cityService = cityService;
	}
	@PostMapping("add")
	public Result add(@RequestBody City city) {
		return this.cityService.add(city);
	}
	
	@GetMapping("getall")
	public DataResult<List<City>> getAll(){
		
	return	this.cityService.getAll();
		
	}	
	
}
