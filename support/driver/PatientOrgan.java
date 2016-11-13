package driver;

public class PatientOrgan {
	String name;
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrgan() {
		return organ;
	}

	public void setOrgan(String organ) {
		this.organ = organ;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	String organ;
	String condition;
	
	public PatientOrgan(String name, String organ, String condition) {
		this.name = name;
		this.organ = organ;
		this.condition = condition;
	}
}
