package Java8Features.Java8Features;

//to create a class that is immutable
//make your class as final
//make variable of that class final as well as private
//remove setter methods from your class 
//create deep copy of object while passing them as arguments.



public class ImmutableClass {
	private int id;
	private String name;
	private engine en;
	public ImmutableClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ImmutableClass(int id, String name, engine en) {
		super();
		this.id = id;
		this.name = name;
		//this.en = en;//it is providing refernce copy
		engine newengine = new engine(en.speed);
		this.en = newengine;
	}

	@Override
	public String toString() {
		return "ImmutableClass [id=" + id + ", name=" + name + ", en=" + en + "]";
	}

	public int getId() {
		return id;
	}

	

	public String getName() {
		return name;
	}

	

	public engine getEn() {
		return en;
	}

	

	
	
	public static void main( String[] args ) {
		engine e = new engine(50);
		ImmutableClass ic = new ImmutableClass(2,"Brezza",e);
		System.out.println(ic.getEn().speed);
		e.speed = 70;
		System.out.println(ic.getEn().speed);
		
		
		
		
	}

}
