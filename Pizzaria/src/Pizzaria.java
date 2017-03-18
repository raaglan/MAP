public class Pizzaria implements FabricaDePizzaAbstract {
	
	@Override
	public Pizza createPizzaChicago(String type){
		
		if(type.equals("cheese")){
			return new CheesePizzaChicago();
		}if(type.equals("clam")){
			return new ClamPizzaChicago();
		}if(type.equals("pepperoni")){
			return new PepperoniPizzaChicago();
		}if(type.equals("veggie")){
			return new VeggiePizzaChicago();
		} return null;
	}
	
	@Override
	public Pizza createPizzaNewYork(String type){
		
		if(type.equals("cheese")){
			return new CheesePizzaNewYork();
		}if(type.equals("clam")){
			return new ClamPizzaNewYork();
		}if(type.equals("pepperoni")){
			return new PepperoniPizzaNewYork();
		}if(type.equals("veggie")){
			return new VeggiePizzaNewYork();
		} return null;
	}
}

 class PizzariaStore {
	public static void main(String[]args) {
		
		FabricaDePizzaAbstract pizzaria = new Pizzaria();
		
		Pizza pizzariaChicago = pizzaria.createPizzaChicago("");
		Pizza pizzariaNewYork = pizzaria.createPizzaNewYork("");

		pizzariaChicago.showInfoPizza();
		pizzariaNewYork.showInfoPizza();
	}
}

