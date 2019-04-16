
@RestController
public class PetController{

	@Autowired
	PetService petService;

	@PostMapping("/addPet")
	public void addPet(@RequestBody PetAddRequest petAddRequest){

		//how to find duplicate pets
		petService.addPet(petAddRequest);
	}

	@RequestMapping("/buyPet")
	public void buyPet(@PathVariable int petId){
		petService.buyPet(petId);
	}


//j	@GetMapping("/userPets")
}
