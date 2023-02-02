
public class Movie {
	private String id;
	private String name;
	private Director director;
	
	public Movie() {
		this.id = null;
		this.name = null;
	}
	public Movie(String id,String name,Director director) {
		this.id=id;
		this.name=name;
		this.director=director;
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public Director getDirector() {
		return director;
	}
	public void setDirector(Director directior) {
		this.director=director;
	}
	public String toString() {
		return getId()+getName()+" direct by "+director;
	}
	

}
