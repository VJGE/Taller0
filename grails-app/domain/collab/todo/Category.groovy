package collab.todo

class Category {

	String name
	String description
	User user
	
    static constraints = {
		name(blank:false)
    }
	String toString(){
		name
	}
}
