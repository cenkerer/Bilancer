public class Subject {
	private String name;
	private ArrayList <Post> posts;
	
	public Subject(String name) {
		this.name = name;
	}
	
	public ArrayList <Post> getPosts() {
		return posts;
	}
	
	public void addPost(Post p) {
		posts.add(p);
	}
}
